package ZCBLearn.SE.Annotation;

import java.lang.annotation.*;

/**
 * 元注解：用于描述注解的注解。
 *         @Target:表示描述注解能够作用的位置
 *         @Retention:描述注解能被保留的阶段
 *         @Documented:描述注解是否能被抽取到api文档中
 *         @Inherited:描述注解是否被子类集继承
 */
@Target({ElementType.TYPE})//表示这个注解只能标注在类上
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Myanno3 {
    
}
