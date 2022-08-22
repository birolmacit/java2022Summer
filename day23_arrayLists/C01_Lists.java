package JAVA_Summer_2022.day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists { public static void main(String[] args) {
    List<Integer> sayilar1 = new ArrayList<>();
    sayilar1.add(5);
    sayilar1.add(3);
    sayilar1.add(2);
    System.out.println("Listenin boyutu : " + sayilar1.size());
    sayilar1.add(2);
    sayilar1.addAll(sayilar1);
    System.out.println(sayilar1); // [5, 3, 2, 2, 5, 3, 2, 2]
    System.out.println("Listenin yeni boyutu : " + sayilar1.size());
    sayilar1.set(2,8);
    System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]
    int a=sayilar1.set(0,12);//set metodu cıktı olarak hangi sayıyı cıkardıgımızı da söyler
    System.out.println("cikarilan  sayi: "+a);//5

    System.out.println(sayilar1.set(0,56)); // 12
    System.out.println(sayilar1); // [12, 3, 8, 2, 5, 3, 2, 2]
        /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.
          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz
          set() sildigi eski elementi de bize dondurur
         */
}
}

