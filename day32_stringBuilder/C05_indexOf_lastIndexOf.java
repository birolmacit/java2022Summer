package JAVA_Summer_2022.day32_stringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("pay attention please");
        System.out.println("sb.indexOf(\"pay\") = " + sb.indexOf("pay"));//sb.indexOf("pay") = 0

        System.out.println("sb.indexOf(\"at\") = " + sb.indexOf("at"));//sb.indexOf("at") = 4
        System.out.println("sb = " + sb);//sb = pay attention please

        System.out.println("sb.indexOf(\"e\",10) = " + sb.indexOf("e", 10));//16


        System.out.println("sb.lastIndexOf(\"e\") = " + sb.lastIndexOf("e"));//19
        System.out.println("sb.lastIndexOf(\"e\",10) = " + sb.lastIndexOf("e", 10));//7  buradaki 10.indexten önce
        // en son e ne zaman gelmiş onun indexini alır

    }
}
