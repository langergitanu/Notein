package o00O0Ooo;

import com.huawei.hms.network.embedded.C18250l0;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o00O0OO.C24843OooO0Oo;

/* JADX INFO: renamed from: o00O0Ooo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24912OooOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f84534OooO0o0 = o00O0O0o.OooOO0O.OooO0o0("WorkTimer");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f84535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f84536OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f84537OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f84538OooO0Oo;

    /* JADX INFO: renamed from: o00O0Ooo.OooOo$OooO00o */
    public class OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f84539OooOo0o;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f84539OooOo0o);
            this.f84539OooOo0o = this.f84539OooOo0o + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: o00O0Ooo.OooOo$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o(String str);
    }

    /* JADX INFO: renamed from: o00O0Ooo.OooOo$OooO0OO */
    public static class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final String f84540OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C24912OooOo f84541OooOo0o;

        public OooO0OO(C24912OooOo c24912OooOo, String str) {
            this.f84541OooOo0o = c24912OooOo;
            this.f84540OooOo = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f84541OooOo0o.f84538OooO0Oo) {
                try {
                    if (((OooO0OO) this.f84541OooOo0o.f84536OooO0O0.remove(this.f84540OooOo)) != null) {
                        OooO0O0 oooO0O0 = (OooO0O0) this.f84541OooOo0o.f84537OooO0OO.remove(this.f84540OooOo);
                        if (oooO0O0 != null) {
                            oooO0O0.OooO00o(this.f84540OooOo);
                        }
                    } else {
                        o00O0O0o.OooOO0O.OooO0OO().OooO00o("WrkTimerRunnable", "Timer with " + this.f84540OooOo + " is already marked as complete.", new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C24912OooOo() {
        OooO00o oooO00o = new OooO00o();
        oooO00o.f84539OooOo0o = 0;
        this.f84536OooO0O0 = new HashMap();
        this.f84537OooO0OO = new HashMap();
        this.f84538OooO0Oo = new Object();
        this.f84535OooO00o = Executors.newSingleThreadScheduledExecutor(oooO00o);
    }

    public final void OooO00o(String str, C24843OooO0Oo c24843OooO0Oo) {
        synchronized (this.f84538OooO0Oo) {
            o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84534OooO0o0, "Starting timer for " + str, new Throwable[0]);
            OooO0O0(str);
            OooO0OO oooO0OO = new OooO0OO(this, str);
            this.f84536OooO0O0.put(str, oooO0OO);
            this.f84537OooO0OO.put(str, c24843OooO0Oo);
            this.f84535OooO00o.schedule(oooO0OO, C18250l0.g.f55491e, TimeUnit.MILLISECONDS);
        }
    }

    public final void OooO0O0(String str) {
        synchronized (this.f84538OooO0Oo) {
            try {
                if (((OooO0OO) this.f84536OooO0O0.remove(str)) != null) {
                    o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84534OooO0o0, "Stopping timer for " + str, new Throwable[0]);
                    this.f84537OooO0OO.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
