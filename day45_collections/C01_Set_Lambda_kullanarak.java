package JAVA_Summer_2022.day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set_Lambda_kullanarak {

        public static void main(String[] args) {
            // Verilen bir array'deki tekrar eden elementleri silip
            // tekrarsiz halini array'e atayan kod yaziniz
            int[] arr ={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
            Set<Integer> tekrarsizSet = new HashSet<>();
            tekrarsizSet =arraydenSetOlustur(arr,tekrarsizSet);
            int[] tekrarsiz = new int[tekrarsizSet.size()];
            int i=0;
            for (Integer j : tekrarsizSet
                 ) {
                tekrarsiz[i]=j;
                i++;

            }

            System.out.println(Arrays.toString(tekrarsiz));


        }

    public static Set<Integer> arraydenSetOlustur(int[] arr, Set<Integer> setimiz) {
        Arrays.stream(arr).forEach(i -> setimiz.add(i));
        //System.out.println(setimiz);
        return setimiz;

    }

    }


