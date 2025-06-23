package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드
        String string = child.toString(); //child는 parent상속 parent는 object 상속이니까
        System.out.println(string);
    }
}
