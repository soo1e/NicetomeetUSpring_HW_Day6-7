# NicetomeetUSpring_HW_Day6-7



#### 1차
처음에는 먼저 생각한 것은 phone이라는 인터페이스를 생성 후, 각 객체들을 개별적으로 생각해서 Samsung, Apple 클래스를 만들어서 이를 implements해와서 재정의하는 것으로 생각했다.
이렇게 하면 클래스 간 상/하위 관계가 명확하고 오버라이드를 통해 재정의하기 때문에 좋은 객체 코드라고 생각했다.

#### 1차 실행 후
각 구매자와 제품 명은 그때 그때 달라질 수 있고 이들의 정보를 담으면 좋겠다고 생각해서 생성자를 통해 만들 수 있게 했고 이를 통해 메서드에서 출력할 수 있게 생각했다.
그런데 이들을 생각해보니 사실상 SamsungPhone과 ApplePhone의 코드는 겹치는 부분이 많다. 그렇기 때문에 인터페이스나 추상 클래스를 통해 좀 더 간결하게 만들 수도 있을 것 같다는 생각을 했다.

공통 규약인 추상 클래스를 통해 이를 간결하게 해보자!! 가 2차 코드의 목표가 되었다.

#### 2차
ApplePhone과 SamsungPhone 클래스의 메서드가 거의 동일하다는 점을 고려한다면, 중복 코드를 줄일 수 있는 방법이 필요하다.
이를 위해서는 공통된 기능을 가진 상위 클래스나 인터페이스를 도입하면 된다.

간단한 방법 중 하나는 추상 클래스를 활용하는 것이다. Phone 인터페이스를 구현하는 추상 클래스를 만들고, 그 안에 공통된 기능을 가진 메서드를 구현할 수 있다.
그리고 SamsungPhone과 ApplePhone은 이 추상 클래스를 상속받도록 구성하면 된다.

#### 2차 실행 후
이렇게 하면 AbstractPhone 클래스에 공통 기능을 구현함으로써 중복을 제거할 수 있고, SamsungPhone과 ApplePhone은 이를 상속받아 필요한 기능만 추가하면 된다!
이렇게 각 출력문만 바꿔주고 슈퍼 클래스에서 받아올 수 있게 했다.

코드가 포함된 설명은 https://velog.io/@soo1e/%EA%B3%BC%EC%A0%9C-6.-%EC%9A%B0%EB%A6%AC%EA%B0%80-%ED%95%B8%EB%93%9C%ED%8F%B0%EC%9D%84-%EA%B0%9D%EC%B2%B4-%EC%A7%80%ED%96%A5-%EC%84%B8%EC%83%81%EC%97%90%EC%84%9C-%EC%82%B0%EB%8B%A4%EB%A9%B4
여기를 참고하세요!