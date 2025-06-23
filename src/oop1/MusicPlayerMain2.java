package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerDdata data = new MusicPlayerDdata();


        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);

        //음악 플레이어 상태
        showStatus(data);

        //음악 플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerDdata data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerDdata data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void volumeUp(MusicPlayerDdata data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerDdata data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void showStatus(MusicPlayerDdata data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
