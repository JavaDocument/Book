package chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTickets()));
    }

    public Ticket getTickets() {
        return tickets.remove(0); // 맨 위에 있는 티켓 주기
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
