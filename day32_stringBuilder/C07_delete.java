package JAVA_Summer_2022.day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java her zaman guzeldir");
        sb.delete(8, 9);
        System.out.println("sb = " + sb);
        sb.deleteCharAt(0);
        System.out.println("sb = " + sb);
        int son=sb.length() ;
        for (int i = 0; i <sb.length() ; i++) {sb.deleteCharAt(0);
            i--;
            System.out.println("sb = " + sb);
        }

    }
}
