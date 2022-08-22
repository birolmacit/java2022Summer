package JAVA_Summer_2022.day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {

    public static void main(String[] args) {
        enuzunkelime(5,"ahmet","mehmet","ayse","abdurrrahman","ertugrul","abdulrezzakhan");
         /*
     Varargs teorik olarak sonsuz sayida element alabilir
     bir method'da parametre olarak varargs varsa
     varargs'in sinirlarini bilebilmesi icin
     parametrelerin sonuncusu olmalidir.
     oncesinde farkli parametreler olabilir ama
     varargs'dan sonra parametre OLAMAZ
     Bu kuraldan oturu bir method'da sadece 1 tane varargs olabilir
     */
    }

    private static void enuzunkelime(int kelimsayisi,String...kelime) {
        String enuzunkelime =kelime[0];
        for (String each : kelime) {
            if (enuzunkelime.length() <each.length()){
                enuzunkelime = each;}
        }
        System.out.println("en uzun kelime : " + enuzunkelime);
    }
}
