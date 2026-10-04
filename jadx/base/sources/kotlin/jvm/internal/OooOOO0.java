package kotlin.jvm.internal;

import OooOoo.C20593OooO0Oo;
import java.util.Arrays;
import oO00ooO.C32458OooOoo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 {

    public static class OooO00o {
    }

    public static int OooO(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static boolean OooO00o(Float f, Float f2) {
        return f == null ? f2 == null : f2 != null && f.floatValue() == f2.floatValue();
    }

    public static boolean OooO0O0(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void OooO0OO(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        OooOO0o(OooOOO0.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static void OooO0Oo(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        OooOO0o(OooOOO0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void OooO0o(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        OooOO0o(OooOOO0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void OooO0o0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        OooOO0o(OooOOO0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void OooO0oO(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(OooOO0O(str));
        OooOO0o(OooOOO0.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void OooO0oo(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(OooOO0O(str));
        OooOO0o(OooOOO0.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    public static int OooOO0(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static String OooOO0O(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = OooOOO0.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbOooO0O0.append(str);
        return sbOooO0O0.toString();
    }

    public static void OooOO0o(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void OooOOO() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static String OooOOO0(Object obj, String str) {
        return str + obj;
    }

    public static void OooOOOO(String str) {
        C32458OooOoo c32458OooOoo = new C32458OooOoo(C20593OooO0Oo.OooO0O0("lateinit property ", str, " has not been initialized"));
        OooOO0o(OooOOO0.class.getName(), c32458OooOoo);
        throw c32458OooOoo;
    }
}
