package ZCBLearn.SE.reflect;

import ZCBLearn.SE.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectConstructor {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class personClass= Person.class;
        Constructor constructor=personClass.getConstructor(String.class,int.class);
        System.out.println(constructor);

        //创建对象
        Object person=constructor.newInstance("ZCB",23);
        System.out.println(person);
    }
}
