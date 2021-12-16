package ZCBLearn.SE.reflect;

import ZCBLearn.SE.domain.Person;

public class Demo1Relfect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1=Class.forName("ZCBLearn.SE.domain.Person");
        System.out.println(cls1);

        Class cls2= Person.class;
        System.out.println(cls2);

        Person p=new Person();
        Class cls3=p.getClass();
        System.out.println(cls3);
    }
}
