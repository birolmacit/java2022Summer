package JAVA_Summer_2022.PRİNT___F;

public class printf2 {
    public static void main(String[] args) {
        int input=3;

        for (int i = 1; i <=input  ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.printf("%4d",i*j);

            }
            System.out.println("");
        }
    }
}
