package com.twentiethcenturygangsta.ourboard.annoatation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface OurBoardColumn {
    boolean enable() default true;
    String fieldName() default "";
    String description() default "";
}