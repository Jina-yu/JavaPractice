package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();//메서드 바디 없어서 호출되면 안됨 ->추상클래스로 선언하기

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
