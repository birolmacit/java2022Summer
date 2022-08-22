package JAVA_Summer_2022.day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {
        enuzunkelime("ahmet","mehmet","ayse","abdurrrahman","ertugrul","abdulrezzakhan");
    }

    private static void enuzunkelime(String...kelime) {
        String enuzunkelime =kelime[0];
        for (String each : kelime) {
            if (enuzunkelime.length() <each.length()){
            enuzunkelime = each;}
        }
        System.out.println("en uzun kelime : " + enuzunkelime);
    }
}
