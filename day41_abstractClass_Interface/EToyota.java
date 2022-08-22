package JAVA_Summer_2022.day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {
    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");// BURADA SADECE BİR TANE ABSTRACT METODU OVERRİDE ETMİSİZ
        // VE DİĞERLERİNE PROBLEM CIKARMAMIS CUNKU BU CLASIMIZ EXTENDS ETMESINE RAGMEN ABSTRACT CLASS OLDUGU İCİN HERSEYİ OVERRİDE ETMEK ZORUNLULUGUMUZ YOK.
        // AMA EGER NORMAL CONCRETE CLASS OLSAYDI HERSEYİ OVERRİDE ETMEK ZORUNDAYDIK
    }
    /*
     Parent class'daki standart belirleyici method'lar
     (abstract method)'larin tamami child class tarafindan override edilmelidir.

     concrete method'larin override edilme mecburiyeti yoktur
     istersek override edebiliriz, istemezsek etmeyiz

     Aslinda Toyota class'i da obje uretecegimiz bir class degil
     bu durumda eger proje tasarimi yapiyorsaniz
     Toyota class'ini da abstract yapmaniz guzel olur
     */

}
