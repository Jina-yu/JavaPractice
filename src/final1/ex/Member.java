package final1.ex;

public class Member {
    private final String id; //final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id; //생성할 때만 받고 절대 못 바꿈
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id; 컴파일 오류
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ", name: " + name);
    }
}
