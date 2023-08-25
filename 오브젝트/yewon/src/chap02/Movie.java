package chap02;

import chap02.policy.DiscountPolicy;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    // 오직 하나의 할인정책 인스턴스만 받을 수 있도록 생성자를 통해 강제
    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    // calculateDiscountAmount 라는 메시지를 이해할 수만 있다면,
    // Movie 는 discountPolicy 의 클래스타입이 어떤 것이든 상관하지 않는다 (자식 클래스의 업캐스팅을 가능하게 한다)
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
}
