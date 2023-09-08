package chap02;


import java.time.LocalDateTime;


public class Screening {
//    상영 시간, 상영 순번에 대한 정보
//    Movie에 "가격을 계산하라" 메세지 전송 위한 참조 정보
//    -> Movie로부터 예매요금을 반환받아야 함
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }
    public Money getMovieFee() {
        return movie.getFee();
    }

//    "예매해라" 메세지를 수행하기 위해 (Reservation 인스턴스 생성할 책임) 처리하는 메서드 구현
    public Reservation reserve(Customer customer, int audienceCount){
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount){
//        Screening -> Movie로 메세지 전송 의도
//        이 때 Screening은 Movie 내부 구현을 알지 못하는 채로 그저 메세지를 보냄
//        "Screening은 Movie에게 calculateMoviefee라는 메세지를 보낸다"
//        "따라서 Movie는 내부에서 calculateMoviefee를 구현해야 된다"
        return movie.calculateMovieFee(this).times(audienceCount);
    }


}
