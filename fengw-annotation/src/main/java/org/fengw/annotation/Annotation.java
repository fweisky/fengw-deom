package org.fengw.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 *
 * @author 封伟
 */
@Documented
@Target ({ElementType.FIELD, ElementType.METHOD})
@Retention (RetentionPolicy.RUNTIME)
public @interface Annotation {

    /** 编号 */
    public int id();

    /** 描述 */
    public String description() default "no description";
}
