package fc.java.course2_model;

public class StringUtils_13 {
    //인스턴스메서드(static이 없기 때문에)
    public String reverse(String s){
        return new StringBuffer(s).reverse().toString();
    }
}
