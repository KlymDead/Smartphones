import Interface.LinuxOS;
import Interface.Smartphones;

public class Androids implements Smartphones, LinuxOS{

    String smartPhone;

    public Androids(String smartPhone) {
        this.smartPhone = smartPhone;
    }

    @Override
    public void call() {
        System.out.println("The " +smartPhone+ " can make a call");
    }

    @Override
    public void sms() {
        System.out.println("The " +smartPhone+ " can text sms");
    }

    @Override
    public void internet() {
        System.out.println("The " +smartPhone+ " can use internet");
    }

    @Override
    public void android() {
        System.out.println("The " +smartPhone+ " is on android");
    }
}
