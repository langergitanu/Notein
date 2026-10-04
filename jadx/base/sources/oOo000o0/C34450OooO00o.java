package oOo000o0;

import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oOo000o0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34450OooO00o {

    /* JADX INFO: renamed from: oOo000o0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20361OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Method f123480OooO00o;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            OooOOO0.OooO0Oo(methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (OooOOO0.OooO0O0(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    OooOOO0.OooO0o(parameterTypes, "getParameterTypes(...)");
                    if (OooOOO0.OooO0O0(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i++;
            }
            f123480OooO00o = method;
            int length2 = methods.length;
            for (int i2 = 0; i2 < length2 && !OooOOO0.OooO0O0(methods[i2].getName(), "getSuppressed"); i2++) {
            }
        }
    }

    public void OooO00o(Throwable cause, Throwable exception) {
        OooOOO0.OooO0oO(cause, "cause");
        OooOOO0.OooO0oO(exception, "exception");
        Method method = C20361OooO00o.f123480OooO00o;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
