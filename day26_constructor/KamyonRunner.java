package JAVA_Summer_2022.day26_constructor;

public class KamyonRunner {

    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        System.out.println(kamyon1.toString());

        Kamyon kamyon2=new Kamyon("crysler","as250",1990,18000);
        System.out.println(kamyon2);


        Kamyon kamyon3=new Kamyon("MAN","as900",2007,400000);
        System.out.println("Kamyon3 bilgileri " + kamyon3);
        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("Kamyon4 bilgileri " + kamyon4);
    }
}
