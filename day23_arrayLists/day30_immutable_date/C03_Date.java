package JAVA_Summer_2022.day23_arrayLists.day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());
        System.out.println(date.lengthOfMonth());

        LocalDate  date2 = LocalDate.of(1986, Month.JUNE, 5);

        System.out.println(date2.getDayOfWeek());

        LocalDate date3 = LocalDate.now();
        System.out.println(date3);

        //System.out.println(date3-date2);

        System.out.println(date.plusDays(100));
        System.out.println(date.plusDays(21).getDayOfWeek());
        System.out.println(date.plusDays(21).plusYears(5).plusWeeks(3).getDayOfWeek());

        System.out.println(date.plusDays(21).plusYears(5).plusWeeks(3));

        System.out.println(date.minusDays(100));
        System.out.println(date.minusDays(100).minusWeeks(3));
        System.out.println(date.minusYears(2034));

        System.out.println(date.isAfter(date2));

        LocalDate datenur=LocalDate.of(1986, 2, 12);
        LocalDate  datebirol = LocalDate.of(1986, Month.JUNE, 5);

        if (datenur.isBefore(datebirol)) {
            System.out.println("nur birol dan daha yasli");
        }
            else{
                System.out.println("birol nur dan daha yasli");
            }
        }
    }

