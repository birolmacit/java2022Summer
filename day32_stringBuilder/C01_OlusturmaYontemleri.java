package JAVA_Summer_2022.day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("java candir");
        StringBuilder sb3 = new StringBuilder(10);//kısa veriler içinbu kullanılırsa daha az yer kaplayabilir

        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());

        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());

        System.out.println("sb3.capacity() = " + sb3.capacity());
        System.out.println("sb3.length() = " + sb3.length());

        sb1.append("java");
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());

        sb1.append(" candir");
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());

        sb1.append(" gerisi patlıcandır") ;
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.length() = " + sb1.length());


        sb3.append(" gerisi patlıcandır yada cok cancandir");
        System.out.println("sb3.capacity() = " + sb3.capacity());
        System.out.println("sb3.length() = " + sb3.length());


        StringBuilder sb4=new StringBuilder();// en az bu yontemle hafıza kullanımı saglanıyo eger ıcınde yazı yazılacaksa
        sb4.append("java candir");
        System.out.println("sb4.capacity() = " + sb4.capacity());
        System.out.println("sb4.length() = " + sb4.length());





    }
}
