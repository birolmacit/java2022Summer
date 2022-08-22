package JAVA_Summer_2022.day46_maps;

import java.util.List;
import java.util.Map;


public class C02_MapsMethodIle {
    public static void main(String[] args) {
        Object ReusableMethods = null;
        Map<Integer,String> ogrenciMap = JAVA_Summer_2022.day46_maps.ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        // value'lari sira numarali olarak yazdirin
        JAVA_Summer_2022.day46_maps.ReusableMethods.mapOlustur() ;
        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= JAVA_Summer_2022.day46_maps.ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
    }
}
