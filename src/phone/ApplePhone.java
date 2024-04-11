package phone;

public class ApplePhone extends AbstractPhone {

    public ApplePhone(String name, String phoneName) {
        super(name, phoneName);
    }

    @Override
    public void turnOnPhone() {
        super.turnOnPhone();
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
