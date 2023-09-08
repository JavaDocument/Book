package chap02;


import java.time.Duration;


public class Movie {
//    요금을 계산하기 위한 정보를 알고 있어야 한다
    private final String title;
    private final Duration runningTime;
    private final Money fee;
//    Movie는 협력하고 있는 객체 (SequenceCondition, PeriodCondtion)가 어떤 것인지 구체적으로 알 필요 없다
//    그저 Movie가 전달한 메세지만 이해하면 된다
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }

}
