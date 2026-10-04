package oO00oOO;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oO0o0OO.C33669o000oOoO;

/* JADX INFO: renamed from: oO00oOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32413OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f116528OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f116529OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f116530OooO0OO = new AtomicReference<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ConcurrentHashMap f116531OooO0Oo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: oO00oOO.OooO$OooO00o */
    public static final class OooO00o implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(C32413OooO.f116531OooO0Oo.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C32413OooO.f116531OooO0Oo.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    static {
        String property;
        int i;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        String property2;
        try {
            property2 = System.getProperty("rx3.purge-enabled");
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
        }
        boolean zEquals = property2 == null ? true : TelemetryEventStrings.Value.TRUE.equals(property2);
        f116528OooO00o = zEquals;
        if (zEquals) {
            try {
                property = System.getProperty("rx3.purge-period-seconds");
            } catch (Throwable th2) {
                C33669o000oOoO.OooO0O0(th2);
            }
            i = property == null ? 1 : Integer.parseInt(property);
        }
        f116529OooO0O0 = i;
        if (!f116528OooO00o) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f116530OooO0OO;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC32418OooO0o("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            OooO00o oooO00o = new OooO00o();
            long j = f116529OooO0O0;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(oooO00o, j, j, TimeUnit.SECONDS);
            return;
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
