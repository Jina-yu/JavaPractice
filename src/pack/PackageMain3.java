package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();//이미 유저 임포트해서 직접 써야함. 둘중 하나는 다 적어야함.
    }
}
