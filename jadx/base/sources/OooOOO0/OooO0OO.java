package OooOOO0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public volatile Handler f58409OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f58408OooOo0o = new Object();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ExecutorService f58407OooOo = Executors.newFixedThreadPool(4, new OooO00o());

    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AtomicInteger f58410OooOo0o = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f58410OooOo0o.getAndIncrement());
            return thread;
        }
    }

    public static class OooO0O0 {
        public static Handler OooO00o(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler Oooo(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return OooO0O0.OooO00o(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
