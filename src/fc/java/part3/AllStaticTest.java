package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        //static이 없다면(public일 때)
//        AllStatic st=new AllStatic();
//        System.out.println(st.hap(10,20));
//        System.out.println(st.max(10,20));
//        System.out.println(st.min(10,20));

        //static이 있으면(private 일때)
        System.out.println(AllStatic.hap(10,20));
        System.out.println(AllStatic.max(10,20));
        System.out.println(AllStatic.min(10,20));
    }
}
