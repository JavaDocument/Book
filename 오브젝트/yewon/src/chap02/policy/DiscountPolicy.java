package chap02.policy;

import chap02.Money;
import chap02.Screening;
import chap02.condition.DiscountCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
