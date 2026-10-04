package ooooOOo0;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ooooOOo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C35237OooOo0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C35237OooOo0o f126538OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f126539OooO00o;

    /* JADX INFO: renamed from: ooooOOo0.OooOo0o$OooO00o */
    public static final class OooO00o extends C35237OooOo0o {

        /* JADX INFO: renamed from: ooooOOo0.OooOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class ExecutorC20393OooO00o implements Executor {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final Handler f126540OooOo0o = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f126540OooOo0o.post(runnable);
            }
        }

        @Override // ooooOOo0.C35237OooOo0o
        public final Executor OooO00o() {
            return new ExecutorC20393OooO00o();
        }
    }

    static {
        f126538OooO0O0 = "Dalvik".equals(System.getProperty("java.vm.name")) ? new OooO00o() : new C35237OooOo0o();
    }

    public C35237OooOo0o() {
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        try {
            declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f126539OooO00o = declaredConstructor;
    }

    public Executor OooO00o() {
        return null;
    }
}
