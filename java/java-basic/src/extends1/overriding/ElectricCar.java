package extends1.overriding;

public class ElectricCar extends Car {
    //@Override 옵션이라 없애도 됨. 근데 개발자들은 무조건 씀. 애노테이션 붙으면 실수로 메서드 만들다가 오타나면 부모 기능 오버라이드 할거다라는 표식 남겨서 컴파일  오류로 바로 잡을 수 있음
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }


    public void charge() {
        System.out.println("충전합니다.");
    }
}
