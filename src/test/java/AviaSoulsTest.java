import org.example.AviaSouls;
import org.example.Ticket;
import org.example.TicketTimeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


public class AviaSoulsTest {
    @Test
    public void RoutSearsh() {
        AviaSouls root = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12, 13);
        Ticket ticket2 = new Ticket("Владивасток", "Калининград", 200, 1, 24);
        Ticket ticket3 = new Ticket("Пермь", "Киров", 300, 15, 16);
        Ticket ticket4 = new Ticket("Ярославль", "Мурманск", 50, 18, 21);
        Ticket ticket5 = new Ticket("Хабаровск", "Северобайкальск", 500, 2, 22);
        Ticket ticket6 = new Ticket("Пермь", "Киров", 30, 15, 16);
        Ticket ticket7 = new Ticket("Пермь", "Киров", 350, 18, 24);
        root.add(ticket1);
        root.add(ticket2);
        root.add(ticket3);
        root.add(ticket4);
        root.add(ticket5);
        root.add(ticket6);
        root.add(ticket7);
        Ticket[] actual = root.search("Пермь", "Киров");
        Ticket[] expected = {ticket6, ticket3, ticket7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RoutSearshnull() {
        AviaSouls root = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12, 13);
        Ticket ticket2 = new Ticket("Владивасток", "Калининград", 200, 1, 24);
        Ticket ticket3 = new Ticket("Пермь", "Киров", 300, 15, 16);
        Ticket ticket4 = new Ticket("Ярославль", "Мурманск", 50, 18, 21);
        Ticket ticket5 = new Ticket("Хабаровск", "Северобайкальск", 500, 2, 22);
        Ticket ticket6 = new Ticket("Пермь", "Киров", 30, 15, 16);
        Ticket ticket7 = new Ticket("Пермь", "Киров", 350, 18, 24);
        root.add(ticket1);
        root.add(ticket2);
        root.add(ticket3);
        root.add(ticket4);
        root.add(ticket5);
        root.add(ticket6);
        root.add(ticket7);
        Ticket[] actual = root.search("Калининград", "Владивосток");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RoutSearshone() {
        AviaSouls root = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12, 13);
        Ticket ticket2 = new Ticket("Владивасток", "Калининград", 200, 1, 24);
        Ticket ticket3 = new Ticket("Пермь", "Киров", 300, 15, 16);
        Ticket ticket4 = new Ticket("Ярославль", "Мурманск", 50, 18, 21);
        Ticket ticket5 = new Ticket("Хабаровск", "Северобайкальск", 500, 2, 22);
        Ticket ticket6 = new Ticket("Пермь", "Киров", 30, 15, 16);
        Ticket ticket7 = new Ticket("Пермь", "Киров", 350, 18, 24);
        root.add(ticket1);
        root.add(ticket2);
        root.add(ticket3);
        root.add(ticket4);
        root.add(ticket5);
        root.add(ticket6);
        root.add(ticket7);
        Ticket[] actual = root.search("Ярославль", "Мурманск");
        Ticket[] expected = {ticket4};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RoutComparater() {
        AviaSouls root = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12, 13);
        Ticket ticket2 = new Ticket("Пермь", "Киров", 300, 10, 16);
        Ticket ticket3 = new Ticket("Владивасток", "Калининград", 200, 1, 24);
        Ticket ticket4 = new Ticket("Пермь", "Киров", 300, 15, 16);
        Ticket ticket5 = new Ticket("Ярославль", "Мурманск", 50, 18, 21);
        Ticket ticket6 = new Ticket("Хабаровск", "Северобайкальск", 500, 2, 22);
        Ticket ticket7 = new Ticket("Пермь", "Киров", 30, 12, 16);
        Ticket ticket8 = new Ticket("Пермь", "Киров", 350, 16, 23);
        root.add(ticket1);
        root.add(ticket2);
        root.add(ticket3);
        root.add(ticket4);
        root.add(ticket5);
        root.add(ticket6);
        root.add(ticket7);
        root.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] actual = root.search("Пермь", "Киров", comparator);
        Ticket[] expected = {ticket4, ticket7, ticket2, ticket8};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RoutComparaternull() {
        AviaSouls root = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12, 13);
        Ticket ticket2 = new Ticket("Пермь", "Киров", 300, 10, 16);
        Ticket ticket3 = new Ticket("Владивасток", "Калининград", 200, 1, 24);
        Ticket ticket4 = new Ticket("Пермь", "Киров", 300, 15, 16);
        Ticket ticket5 = new Ticket("Ярославль", "Мурманск", 50, 18, 21);
        Ticket ticket6 = new Ticket("Хабаровск", "Северобайкальск", 500, 2, 22);
        Ticket ticket7 = new Ticket("Пермь", "Киров", 30, 12, 16);
        Ticket ticket8 = new Ticket("Пермь", "Киров", 350, 16, 23);
        root.add(ticket1);
        root.add(ticket2);
        root.add(ticket3);
        root.add(ticket4);
        root.add(ticket5);
        root.add(ticket6);
        root.add(ticket7);
        root.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] actual = root.search("Волгоград", "Ульяновск", comparator);
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RoutComparaterone() {
        AviaSouls root = new AviaSouls();
        Ticket ticket1 = new Ticket("Москва", "Санкт-Петербург", 100, 12, 13);
        Ticket ticket2 = new Ticket("Пермь", "Киров", 300, 10, 16);
        Ticket ticket3 = new Ticket("Владивасток", "Калининград", 200, 1, 24);
        Ticket ticket4 = new Ticket("Пермь", "Киров", 300, 15, 16);
        Ticket ticket5 = new Ticket("Ярославль", "Мурманск", 50, 18, 21);
        Ticket ticket6 = new Ticket("Хабаровск", "Северобайкальск", 500, 2, 22);
        Ticket ticket7 = new Ticket("Пермь", "Киров", 30, 12, 16);
        Ticket ticket8 = new Ticket("Пермь", "Киров", 350, 16, 23);
        root.add(ticket1);
        root.add(ticket2);
        root.add(ticket3);
        root.add(ticket4);
        root.add(ticket5);
        root.add(ticket6);
        root.add(ticket7);
        root.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();
        Ticket[] actual = root.search("Ярославль", "Мурманск", comparator);
        Ticket[] expected = {ticket5};
        Assertions.assertArrayEquals(expected, actual);
    }

}
