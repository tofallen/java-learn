package self.licw.simpleframework.mvc.annotation;

import self.licw.simpleframework.mvc.type.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 请求路径、请求方法与Controller方法的映射
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    // 请求路径
    String value() default "";

    // 请求方法
    RequestMethod method() default RequestMethod.GET;
}
