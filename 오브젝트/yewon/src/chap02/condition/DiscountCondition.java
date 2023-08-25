package chap02.condition;

import chap02.Screening;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening); // 할인이 가능하면 t, 불가능하면 f
}
