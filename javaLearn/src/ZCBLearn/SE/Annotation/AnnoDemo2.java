package ZCBLearn.SE.Annotation;

import java.util.Date;

/**
 * JDK中预定义的一些注解
 * *@override：检测被该注解标注的方法是否是继承自父类（接口）的
 * *@deprecated：该注解标志的内容，表示已过时
 * *@suppresswarnings：压制警告
 */
@SuppressWarnings("all")//压制所有的警告

 @Myanno3
public class AnnoDemo2 {
    @Override
    public String toString() {
        return super.toString();
    }

@Deprecated
//@Myanno3
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1方法
    }
    @MyAnno(show1=1)
    public void demo(){
        show1();
        Date date=new Date();

    }
}
