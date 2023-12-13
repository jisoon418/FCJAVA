package fc.java.course2.part2;

import fc.java.course2_model.PersonFac_15;
import fc.java.course2_model.Person_01;

public class PersonFacTest_15 {
    public static void main(String[] args) {
        PersonFac_15 personFactory= Person_01::new;
        Person_01 person=personFactory.create("홍길동", 40);
        System.out.println(person);
        //익명 내부 클래스
       /* PersonFac_15 personFactory=new PersonFac_15() {
            @Override
            public Person_01 create(String name, int age) {
                return new Person_01(name, age);
            }
        };
        Person_01 person=personFactory.create("나길동", 32);
        System.out.println(person);*/
        }
    }

