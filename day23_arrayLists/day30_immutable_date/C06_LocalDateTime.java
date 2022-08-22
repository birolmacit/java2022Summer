package JAVA_Summer_2022.day23_arrayLists.day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dateAndTime= LocalDateTime.now();
        System.out.println(dateAndTime );

        System.out.println(dateAndTime.plusMonths(3).plusHours(100)); // 2022-10-27T22:41:58.917967300
        System.out.println(dateAndTime.minusDays(100).plusHours(100)); // 2022-04-18T22:43:17.767691500
        System.out.println(dateAndTime.toLocalDate()); // 2022-07-23
    }
}
