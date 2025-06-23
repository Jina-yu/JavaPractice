package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog(); //여기서 Dog->Animal로 바꿔도 됨. 부모니까.
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal[] animalArr = {dog, cat, cow};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        //부모는 자식을 담을 수 있으니까 되는 거임

    }

    //부모타입 받음
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    //메소드 오버라이딩 때문에 각자 동물의 소리가 나오는 거임
}
