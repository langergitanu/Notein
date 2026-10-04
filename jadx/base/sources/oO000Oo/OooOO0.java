package oO000Oo;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import oO000Oo.Oooo0;
import oO000Oo.o0000OOO;
import oO0OOo0o.ExecutorC33121o00ooo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Logger f113969OooO0o = Logger.getLogger(OooOO0.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ScheduledExecutorService f113970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorC33121o00ooo f113971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo0.OooO00o f113972OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Oooo0 f113973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ExecutorC33121o00ooo.OooO0OO f113974OooO0o0;

    public OooOO0(Oooo0.OooO00o oooO00o, ScheduledExecutorService scheduledExecutorService, ExecutorC33121o00ooo executorC33121o00ooo) {
        this.f113972OooO0OO = oooO00o;
        this.f113970OooO00o = scheduledExecutorService;
        this.f113971OooO0O0 = executorC33121o00ooo;
    }

    public final void OooO00o(o0000OOO.OooO00o oooO00o) {
        this.f113971OooO0O0.OooO0Oo();
        if (this.f113973OooO0Oo == null) {
            this.f113973OooO0Oo = this.f113972OooO0OO.OooO00o();
        }
        ExecutorC33121o00ooo.OooO0OO oooO0OO = this.f113974OooO0o0;
        if (oooO0OO != null) {
            ExecutorC33121o00ooo.OooO0O0 oooO0O0 = oooO0OO.f119771OooO00o;
            if (!oooO0O0.f119770OooOoO0 && !oooO0O0.f119768OooOo) {
                return;
            }
        }
        long jOooO00o = this.f113973OooO0Oo.OooO00o();
        this.f113974OooO0o0 = this.f113971OooO0O0.OooO0OO(oooO00o, jOooO00o, TimeUnit.NANOSECONDS, this.f113970OooO00o);
        f113969OooO0o.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jOooO00o));
    }
}
