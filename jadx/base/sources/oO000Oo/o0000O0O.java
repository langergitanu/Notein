package oO000Oo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O0O implements o00Oo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f114511OooO0O0 = Logger.getLogger(o0000O0O.class.getName());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Constructor<?> f114512OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Method f114513OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object[] f114514OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final RuntimeException f114515OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f114516OooO00o;

    static {
        Method method;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th) {
            th = th;
            method = null;
        }
        try {
            int i = 0;
            cls.getMethod("sum", new Class[0]);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            f114511OooO0O0.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            constructor = null;
        }
        if (th != null || constructor == null) {
            f114512OooO0OO = null;
            f114513OooO0Oo = null;
            f114515OooO0o0 = new RuntimeException(th);
        } else {
            f114512OooO0OO = constructor;
            f114513OooO0Oo = method;
            f114515OooO0o0 = null;
        }
        f114514OooO0o = new Object[]{1L};
    }

    public o0000O0O() {
        RuntimeException runtimeException = f114515OooO0o0;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f114516OooO00o = f114512OooO0OO.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // oO000Oo.o00Oo0
    public final void OooO00o() {
        try {
            f114513OooO0Oo.invoke(this.f114516OooO00o, f114514OooO0o);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
