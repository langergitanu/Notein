package o00O0o0o;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o00O0o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24935OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C24935OooO0O0 f84607OooO0Oo = new C24935OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f84608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ScheduledExecutorService f84609OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f84610OooO0OO;

    /* JADX INFO: renamed from: o00O0o0o.OooO0O0$OooO00o */
    public static class OooO00o implements Executor {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public ThreadLocal<Integer> f84611OooOo0o;

        public final void OooO00o() {
            ThreadLocal<Integer> threadLocal = this.f84611OooOo0o;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(iIntValue));
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ThreadLocal<Integer> threadLocal = this.f84611OooOo0o;
            Integer num = threadLocal.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            threadLocal.set(Integer.valueOf(iIntValue));
            try {
                if (iIntValue <= 15) {
                    runnable.run();
                } else {
                    C24935OooO0O0.f84607OooO0Oo.f84608OooO00o.execute(runnable);
                }
                OooO00o();
            } catch (Throwable th) {
                OooO00o();
                throw th;
            }
        }
    }

    public C24935OooO0O0() {
        ExecutorService executorServiceNewCachedThreadPool;
        String property = System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(Locale.US).contains(TelemetryEventStrings.C18741Os.OS_NAME)) {
            C24934OooO00o c24934OooO00o = C24934OooO00o.f84603OooO0O0;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C24934OooO00o.f84604OooO0OO, C24934OooO00o.f84605OooO0Oo, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewCachedThreadPool = threadPoolExecutor;
        } else {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        }
        this.f84608OooO00o = executorServiceNewCachedThreadPool;
        this.f84609OooO0O0 = Executors.newSingleThreadScheduledExecutor();
        OooO00o oooO00o = new OooO00o();
        oooO00o.f84611OooOo0o = new ThreadLocal<>();
        this.f84610OooO0OO = oooO00o;
    }
}
