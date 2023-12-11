package fc.java.poly;

public class Board_04 extends Object {//toString() 있음
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //재정의

    @Override
    public String toString() {
        System.out.println(super.toString());//상위클래스의 메서드 호출(fc.java.poly.Board_04@7a79be86 출력)
        return "Board_04{" +
                "title='" + title + '\'' +
                '}';
    }
}
