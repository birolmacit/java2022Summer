package JAVA_Summer_2022.day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlariBulmaBIROL {

    // Soru 3:
    //iki String array olusturunuz ve
    // bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
    // Sonucu ekrana yazdiriniz.
    //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

    public static void main(String[] args) {
        String sentences1[]={"ali","veli","ayse","tarkan","zahmet","darda","cengiz"};
        String sentences2[]={"ali","veli","ayse","hakan","ahmet","arda","cengiz"};

        List<String> commons = new ArrayList<String>();


        for (String name : sentences1) {
            for (String nsme2 : sentences2) {
                if(name.equals(nsme2))
            {commons.add(nsme2);
            }

            }
        }
        if(commons.size()==0){
            System.out.println("no commons  found");
        }
        else{
            System.out.println(commons);
        }
    }
}
