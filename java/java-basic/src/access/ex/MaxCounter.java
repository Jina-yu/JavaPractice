package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max; //이렇게 해야 다른 패키지에서도 쓸 수 있음
    }
    public void increament() {
        //검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        //실행 로직
        count++;

    }

    public int getCount() {
        return count;
    }
}
