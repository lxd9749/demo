package annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 这个类的信息：
 *
 * @author luxingdong
 * @ceratetime 2022/10/19
 * @describe bank_business
 * @user DELL
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface Assignment {
     String value() default "默认值";
}
