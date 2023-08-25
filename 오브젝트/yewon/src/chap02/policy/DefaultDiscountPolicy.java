package chap02.policy;

import chap02.Money;
import chap02.Screening;
import chap02.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    // 여러개의 할인조건 인스턴스 허용
    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition each : conditions) {
            // 할인 조건을 하나라도 만족하는 경우, 할인료를 계산하여 반환
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    // 추상메서드
    abstract protected Money getDiscountAmount(Screening screening);
}
