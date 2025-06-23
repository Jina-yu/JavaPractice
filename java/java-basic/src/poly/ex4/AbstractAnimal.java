package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();//메서드 바디 없어서 호출되면 안됨 ->추상클래스로 선언하기
    public abstract void move();
    //순수 추상 클래스
    //얘네가 가진 구현이 없음. 완전한 추상
}
