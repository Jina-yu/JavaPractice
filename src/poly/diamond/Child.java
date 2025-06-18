package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override //둘다 있어서 하나에만 오버라이딩 하나만 하면 됨
    public void methodCommon() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodCommon");
    }
}
