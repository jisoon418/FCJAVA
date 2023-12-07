package fc.java.poly;

public class TV_03_1 implements Remocon_03_1 {

    @Override
    public void chUp() {
        System.out.println("TV 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("TV 볼륨이 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("TV 볼륨이 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("TV에서는 인터넷이 된다");
    }
}
