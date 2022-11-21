public class Main {
    public static void main(String[] args) {
       Androids[] androids = {
               new Androids("HUAWEI"),
               new Androids("SAMSUNG")};
       iPhones[] iPhones = {
               new iPhones("IPhone MAX"),
               new iPhones("IPhone 19 PRO ULTRA KILLER")};


       for(Androids android : androids){
           android.sms();
           android.call();
           android.internet();
           android.android();
           System.out.println();
       }
        System.out.println("--------------------");
       for(iPhones iPhone : iPhones) {
           iPhone.sms();
           iPhone.call();
           iPhone.internet();
           iPhone.ios();
           System.out.println();
       }
    }
}