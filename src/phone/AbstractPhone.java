package phone;

public abstract class AbstractPhone implements Phone {
    String name;
    String phoneName;

    public AbstractPhone(String name, String phoneName) {
        this.name = name;
        this.phoneName = phoneName;
    }

    @Override
    public void buyPhone() {
        System.out.println(name + "님이 " + phoneName + "을 샀습니다.");
    }

    @Override
    public void turnOnPhone() {
        System.out.println(name + "님이 " + phoneName + "을 켰습니다.");
    }
}
