package oO00o0o0;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: oO00o0o0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32375OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f116405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int f116406OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f116407OooO0OO = new AtomicReference<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ConcurrentHashMap f116408OooO0Oo = new ConcurrentHashMap();

    /* JADX INFO: renamed from: oO00o0o0.OooO$OooO00o */
    public static final class OooO00o implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(C32375OooO.f116408OooO0Oo.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C32375OooO.f116408OooO0Oo.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        int i;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        Properties properties = System.getProperties();
        boolean z = properties.containsKey("rx2.purge-enabled") ? Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled")) : true;
        if (z && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                i = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                i = 1;
            }
        } else {
            i = 1;
        }
        f116405OooO00o = z;
        f116406OooO0O0 = i;
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f116407OooO0OO;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC32380OooO0o("RxSchedulerPurge"));
            while (!atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                if (atomicReference.get() != scheduledExecutorService) {
                    break;
                }
            }
            OooO00o oooO00o = new OooO00o();
            long j = f116406OooO0O0;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(oooO00o, j, j, TimeUnit.SECONDS);
            return;
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
