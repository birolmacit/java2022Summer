package JAVA_Summer_2022.day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java daha ne yapsin")  ;
    sb.append("?") ;
        System.out.println("sb = " + sb);
        sb.append(5) ;
        System.out.println("sb = " + sb);

        sb.append(true ) ;
        System.out.println("sb = " + sb);

        sb.insert(4, " herseyi dusunmus ,");
        System.out.println("sb = " + sb);

        sb.insert(22,"valla valla",5,11);//sondaki iki int degeri valla valla nın hangi indeklerini alacagımızı nsoyluyor

        System.out.println(sb);

    }
}
