package ZCBLearn.SE.Annotation;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
@Pro(classname = "ZCBLearn.SE.domain.Person",methodname = "eat")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String classname = an.classname();
        String methodname = an.methodname();

        Class cls = Class.forName(classname);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodname);
        method.invoke(obj);
    }
}
