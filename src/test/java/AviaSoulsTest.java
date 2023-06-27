import org.example.AviaSouls;
import org.example.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AviaSoulsTest {
    @Test
    public void RoutSearsh() {
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12,13);
        Ticket ticket2 = new Ticket("Владивасток", "Калининград", 200, 1,24);
        Ticket ticket3 = new Ticket("Пермь", "Киров", 300, 15,16);
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.search("Москва", "Санкт-петербург");
        Ticket[] actual = aviaSouls.findAll();
        Ticket[] expected = {ticket1, ticket2, ticket3};
        Assertions.assertArrayEquals(expected, actual);
    }

}
