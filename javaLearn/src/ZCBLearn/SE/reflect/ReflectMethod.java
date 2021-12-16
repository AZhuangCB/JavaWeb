package ZCBLearn.SE.reflect;

import ZCBLearn.SE.domain.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class personClass= Person.class;

        Method method=personClass.getMethod("eat",String.class);
        Person p=new Person("ZCB",25);
        method.invoke(p,"fan");

        Method[] methods=personClass.getMethods();
        for(Method method1:methods){
            System.out.println(method1);
        }
    }
}
