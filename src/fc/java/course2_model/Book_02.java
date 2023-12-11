package fc.java.course2_model;

public class Book_02 {
    //멤버변수, 상태정보
    private String title;
    private int price;
    private String company;
    private String author;

    public Book_02() { //디폴트 생성자
    }

    //생성자 메서드의 오버로딩
    public Book_02(String title, int price, String company, String author) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //부모가 가지고있는 Object클래스의 toString을 하위클래스가 재정의
    @Override
    public String toString() {
        return "Book_02{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
