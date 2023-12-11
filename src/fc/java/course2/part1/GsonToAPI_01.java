package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2_model.Person_01;

public class GsonToAPI_01 {
    public static void main(String[] args) {
        Person_01 person=new Person_01("John", 30);
        Gson gson=new Gson();
        String json=gson.toJson(person);
        System.out.println(json);
    }
}
