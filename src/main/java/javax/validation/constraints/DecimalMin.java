//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package javax.validation.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
    validatedBy = {}
)
public @interface DecimalMin {

    String CODE = "code";
    String FIELD_NAME = "fieldName";
    String MESSAGE = "result";
    String GROUPS = "groups";

    String code() default "";

    String fieldName() default "";

    String message() default "{javax.validation.constraints.DecimalMin.result}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String value();

    boolean inclusive() default true;

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        DecimalMin[] value();
    }
}
