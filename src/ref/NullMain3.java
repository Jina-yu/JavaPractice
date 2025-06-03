package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        System.out.println("bigData.data.value" + bigData.data.value);
        //널에다가 점찍은 거랑 같음

    }
}
