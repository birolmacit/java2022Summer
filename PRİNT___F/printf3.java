package JAVA_Summer_2022.PRİNT___F;

public class printf3 {
    public static void main(String[] args) {
        /*
        * ürünler = domates ,biber,patlica,elma,armut
        * miktarlar=1,2,3.5,2.5,6
        * birim fiyatlar=2.3,2.29,4.1,2,3
        * */
        String urun[]={"muz","biber","patlican","elma","armut"};
        double birimfiyat[]={2.3,2.29,4.1,2,3};
        double miktar[]={1,2,3.5,2.5,6};
        System.out.println("urun         miktar    b.fiyat    urun top.\n========================================");

        for (int i = 0; i < urun.length; i++) {
            System.out.printf("%-10s  %5.2f kg   %5.2f euro   %5.2f euro\n ",urun[i],miktar[i],birimfiyat[i],miktar[i]*birimfiyat[i]);

        }
    }
}
