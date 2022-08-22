package JAVA_Summer_2022.day23_arrayLists.day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

            // iki tarih arasindaki sureyi bulma
            LocalDate tarih1=LocalDate.of(1986,6,5);
            LocalDate bugun=LocalDate.now();
            Period period=Period.between(tarih1,bugun);
            System.out.println(period); // P-50Y-6M-5D
            System.out.println(period.getYears());
        }
    }

