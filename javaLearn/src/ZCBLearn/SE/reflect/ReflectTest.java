package ZCBLearn.SE.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 框架类
 */
public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Properties pro=new Properties();
        ClassLoader classLoader=ReflectTest.class.getClassLoader();
        InputStream is=classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String classname=pro.getProperty("className");
        String methodname=pro.getProperty("methodName");

        Class cls=Class.forName(classname);
        Object obj=cls.newInstance();
        Method method=cls.getMethod(methodname);
        method.invoke(obj);
    }

}
