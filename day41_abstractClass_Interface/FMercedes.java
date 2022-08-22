package JAVA_Summer_2022.day41_abstractClass_Interface;

public class FMercedes extends DAraba {//BURADAKİ CONCRETE CLASS OLDUGU İCİN SADECE ABSTRACT OLAN METODLARDAN HERSEYİ OVERRİDE ETMEK ZORUNDA
    // CONCRETE METHODLARI OVERRİDE ETMEK ZORUNDA DEGILDIR



    /*
         abstract bir parent'in concrete child class inherit ederse
         parent abstract class'daki tum abstract method'lari
         override etmek zorundadir
         abstract bir class, abstract baska bir class'i parent edinirse
         parent class'daki tum abstract method'lari override etmek
         ZORUNDA DEGILDIR
        */
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }//MERCEDES CLASS CONCRETE CLASS VE BU CONCRETE CLASS DAN ONCE BURDAKI METHODLARI OVERRİDE EDEN ABSTRACT YADA CONCRETE BİR  PARENT  CLASS YOK,
    // DOLAYISIYLA TUM ABSTRACT METHODLARI OVERRİDE ETMEK ZORUNDA
}
