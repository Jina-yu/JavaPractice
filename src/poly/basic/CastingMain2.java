package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조 ( 다형적 참조 )
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅(부모 타입 - > 자식 타입)
        Child child = (Child) poly; //x001 개발자가 "자바야 내가 책임질게~" 하는 거
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
