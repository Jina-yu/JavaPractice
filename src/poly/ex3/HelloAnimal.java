package poly.ex3;

public class HelloAnimal extends AbstractAnimal{
    @Override
    public void sound() {

    }
    //오버라이드 하지 않는 이상 상속 받으면 안됨. hello호출하면 부모에 있는 hello가 호출돼서. 불완전한 메서드(추상메서드)라서
}
