package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 차조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();// 상속 받았으니까 이 기능 물려 받아 쓸 수 있음
        child.childMethod(); //당연히 자기꺼 쓸 수 있음

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //처음 보는 코드. 부모 타입이 자식 타입 참조하는 거.
        poly.parentMethod();

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다
        //자식의 기능은 호출할 수 없다. 컴파일 기능 오류 발생
        //poly.childMethod
    }
}
