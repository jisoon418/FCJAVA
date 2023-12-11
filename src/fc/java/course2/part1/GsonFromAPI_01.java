package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.course2_model.Person_01;

public class GsonFromAPI_01 {
    public static void main(String[] args) {
        String json="{\"name\":\"John\",\"age\":30}"; //JSON
        Gson gson=new Gson();
        Person_01 p=gson.fromJson(json, Person_01.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
