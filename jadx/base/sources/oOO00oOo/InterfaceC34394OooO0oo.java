package oOO00oOo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: oOO00oOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC34394OooO0oo {
    boolean hasBody() default false;

    String method();

    String path() default "";
}
