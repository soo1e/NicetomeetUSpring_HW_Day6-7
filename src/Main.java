import phone.ApplePhone;
import phone.SamsungPhone;

public class Main {
    public static void main(String[] args) {
        SamsungPhone samsungPhone = new SamsungPhone("재용", "삼송폰");

        samsungPhone.buyPhone();
        samsungPhone.turnOnPhone();

        System.out.println();

        ApplePhone applePhone = new ApplePhone("잡스", "사과폰");

        applePhone.buyPhone();
        applePhone.turnOnPhone();
    }

}