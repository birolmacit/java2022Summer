package JAVA_Summer_2022.day41_abstractClass_Interface;

public class GCorolla extends EToyota{

    /*
      Corolla class'inin 2 tane parent'i var
      corolla parent'larinin ikisinin de standartlarina (abstract method)
      uymak zorundadir
      Concrete bir class parent'i olan tum abstract class'larda
      abstract olan method'lari implement etmek ZORUNDADIR
      Ancak Parent silsilesinde override edilerek concrete yapilan method'lari
      override etmek zorunda DEGILDIR
     */
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

    /*@Override
    protected void motor() {    BU METHOD DAHA ONCE bir onceki parent class ı olan ETOYOTA sınıfında override edildigi icin yani
    CONCRETE HALDE OVERRİDE EDİLDİGİNDEN DOLAYI BURADA TEKRAR OVERRİDE ETMEK ZORUNDA DEGILIZ

    }*/
}
