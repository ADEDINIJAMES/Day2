
import hotel.entity.Customers;
import hotel.entity.Rooms;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal fee = new BigDecimal("23.55");
        BigDecimal price= new BigDecimal("5000");
        BigDecimal salary= new BigDecimal(23.55);
        LocalTime customer = LocalTime.parse("10:15:45");
        LocalTime customer1 = LocalTime.now();
        LocalDate arr= LocalDate.now();
        LocalDate dep= LocalDate.parse("2023-08-21");
        boolean ispayment = true;
        List<Rooms> roomsList= new ArrayList<>();
        Scanner oBj = new Scanner(System.in);
        Rooms room = new Rooms();
        roomsList.add(room);
        room.setRmName("Room 12");
        room.setQuarters("A4");
        room.setRmType("AC Tight");
        room.setRmPrice(price);

        Customers customers = new Customers( new BigDecimal("23.55"),customer, customer1, arr, dep, room,ispayment,3);
        String name = customers.setName("Fola");
        System.out.println(" Customer's Name: "+ customers.getName()+ " "+customers);

    }

}
