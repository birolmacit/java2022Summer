package JAVA_Summer_2022.day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.add("Cavidan");
        System.out.println(ll4);//[Cavidan, Cavidan, Mesut, Selim, Tevfik, Selim, Cavidan]
        ll4.removeLastOccurrence("Selim");
        ll4.removeLastOccurrence("Cavidan");//cavidandan birden fazla varsa onlardan sadece birini cıkarır

        ll4.removeLastOccurrence("Mesut");//aslinda bir tane bile kullanılırsa onu da cıkarıyor
        System.out.println(ll4); // [Cavidan, Cavidan, Selim, Tevfik]
        System.out.println(ll4.pop());
    }
}
