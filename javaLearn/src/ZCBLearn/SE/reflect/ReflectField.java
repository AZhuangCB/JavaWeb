package ZCBLearn.SE.reflect;

import ZCBLearn.SE.domain.Person;

import java.lang.reflect.Field;

public class ReflectField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class personClass = Person.class;
        Field[] fields1=personClass.getFields();//用于获取类中的public修饰的成员。
        for(Field field : fields1){
            System.out.println(field);
        }

        Field[] fields2=personClass.getDeclaredFields();//用于获取类中的所有（包括private,public,...）成员。
        for(Field field : fields2){
            System.out.println(field);
        }

        Field name=personClass.getDeclaredField("name");
        name.setAccessible(true);
        Person p1=new Person();
        System.out.println(name.get(p1));
    }
}
