package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal aa = new Animal();
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }


    }
}


