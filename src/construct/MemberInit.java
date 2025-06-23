package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name; //멤버변수에 값 넣고싶음. this 없으면 매개변수 name인지 아니면 위에 변수 name인지 모름
        this.age = age;
        this.grade = grade;
    }
}
