package chap02.policy;

import chap02.Money;
import chap02.Screening;
import chap02.condition.DiscountCondition;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    protected Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount; // 고정 할인금액
    }
}
