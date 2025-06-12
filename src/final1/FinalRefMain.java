package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data; //참조형
        data = new Data();
        //data = new Data(); 새로 입력하는 건 컴파일 오류
        //final Data data = new Data();

        //참조 대상의 값은 변경 가능 - 데이터 변수에 final을 건거라
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
