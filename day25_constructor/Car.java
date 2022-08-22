package JAVA_Summer_2022.day25_constructor;

public class Car {
     /*
    Bu class bizim kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan
    variable ve method'lari bu class'da belirleriz
    sonra farkli class'larda araba olusturmamiz gerekirse
    bu class'dan bir obje olusturup
    burada belirlenen variable ve method'lara gore araba uretiri
     */

    public String marka="marka belirtilmedi";
    public String model="model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac(){
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("bu arac max "+ hiz + " km hiza cikabilir");
    }

    public String toString() {
        return "Arac Bilgileri" +
                "\nmarka:" + marka  +
                " \nmodel:" + model  +
                " \nyil:" + yil +
                "\nfiyat:" + fiyat
                ;
    }
}
