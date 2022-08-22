package JAVA_Summer_2022.day25_constructor;

public class CarRunner {

    public static void main(String[] args) {
         Car car1=new Car();
         car1 .fiyat =150000;
         car1.yil =2020;
         car1.marka ="Toyota";


        System.out.println("CAR-1 Bilgileri\nmarka : "+ car1.marka+"\nmodel : "+ car1.model+"\nyil : "+ car1.yil+"\nfiyat : "+ car1.fiyat );


        Car car2=new Car();

        System.out.println("\nCAR-2 Bilgileri\nmarka : "+ car2.marka+"\nmodel : "+ car2.model+"\nyil : "+ car2.yil+"\nfiyat : "+ car2.fiyat );
        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi ?
        2- Objenin olusturuldugu class'da variable'a bir deger atanmis mi bakar
        3- O zaman data turune gore Java default degeri atar
         */

        car2.fiyat =200000;
        car2.yil =2021;
        car2.model="civic";
        car2.marka ="Honda";

        System.out.println("\nCAR-2 Bilgileri\nmarka : "+ car2.marka+"\nmodel : "+ car2.model+"\nyil : "+ car2.yil+"\nfiyat : "+ car2.fiyat );

        car2.maxHiz(100);
        car2.benzinliArac() ;

    }
}
