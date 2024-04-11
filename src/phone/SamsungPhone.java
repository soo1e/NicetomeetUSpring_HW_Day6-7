package phone;

public class SamsungPhone extends AbstractPhone {

    public SamsungPhone(String name, String phoneName) {
        super(name, phoneName);
    }

    @Override
    public void turnOnPhone() {
        super.turnOnPhone();
        System.out.println("*** 폰 켜지는 중 ***");
    }
}
