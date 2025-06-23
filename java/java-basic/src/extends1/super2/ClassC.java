package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10,20); //기본 생성자가 B에 하나도 없어서 안됨.
        //부모에 기본 생성자 없으면 내가 직접 넣어야 함. super로 직접 호출
        System.out.println("ClassC 생성자");
    }
}
