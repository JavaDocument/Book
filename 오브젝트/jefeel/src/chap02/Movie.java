package chap02;


import java.time.Duration;


public class Movie {
//    요금을 계산하기 위한 정보를 알고 있어야 한다
    private final String title;
    private final Duration runningTime;
    private final Money fee;
//    Movie는 협력하고 있는 객체 (SequenceCondition, PeriodCondtion)가 어떤 것인지 구체적으로 알 필요 없다
//    그저 Movie가 전달한 메세지만 이해하면 된다
//    Movie는 DiscountPolicy에 컴파일타임 의존성을 가지고 있다 (코드에 명시)
//    Movie가 DiscountPolicy를 상속받은 Amount정책이나 Percent정책에 의존하는 건 런타임 의존성  (의존성 해결)
    private DiscountPolicy discountPolicy;


    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;  //하위 정책 선택적으로 받을 수 있도록 DiscountPolicy 타입 인자를 생성자로 받음
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
