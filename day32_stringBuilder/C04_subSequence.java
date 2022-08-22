package JAVA_Summer_2022.day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Kayra");
        sb.substring(0,3);
        // Bu method String dondurdugu icin StringBuilder'in eski halini degistiremez
        System.out.println(sb); // Kayra
        sb.subSequence(0,3);
        System.out.println(sb); // Kayra   burada da sb yiğ degiiştirmedi ama en azından aşağıdaki gibi bir
        //parcasını alıp başka bi stringe atayabiliyoruz


        String a=  sb.substring(0,3) ;
        System.out.println("a = " + a);//a = Kay
    }
}
