package chap02;


public interface DiscountCondition {
//    역할 -> 추상화
//    Sequence와 Period는 서로 공유할 내용이 없으니 DiscountCondition을 interface로 만들어줌
//    다형성 활용
    boolean isSatisfiedBy(Screening screening);
}
