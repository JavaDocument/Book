package chap02;

import chap02.condition.PeriodCondition;
import chap02.policy.AmountDiscountPolicy;
import chap02.policy.NoneDefaultDiscountPolicy;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        Movie starWars = new Movie("스타워즈"
                , Duration.ofMinutes(210)
                , Money.wons(10000)
                , new NoneDefaultDiscountPolicy());

//        Movie avatar = new Movie("아바타"
//        , Duration.ofMinutes(120)
//        , Money.wons(10000)
//        , new AmountDiscountPolicy(Money.wons(800), new PeriodCondition( ... )))
    }
}
