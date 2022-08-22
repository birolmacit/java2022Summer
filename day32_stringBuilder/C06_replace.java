package JAVA_Summer_2022.day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("calm down");
        System.out.println("s.replace(5,10,\"up\") = " + s.replace(5, 10, "up"));


        System.out.println("s = " + s);
        s.replace(4,5,"---" ) ;
        System.out.println("s = " + s);

        s.replace(4,7," ");
        System.out.println("s = " + s);
        

        s.replace(5, 7, "down");
        System.out.println("s = " + s);
    }
}
