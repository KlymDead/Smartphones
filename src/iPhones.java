import Interface.IOs;
import Interface.Smartphones;

public class iPhones implements Smartphones, IOs {

    String smartPhone;

    public iPhones(String smartPhone) {
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
    public void ios() {
        System.out.println("The " +smartPhone+ " is on iOS");
    }
}
