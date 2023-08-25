package chap02.policy;

import chap02.Money;
import chap02.Screening;
import chap02.condition.DiscountCondition;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    protected double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
