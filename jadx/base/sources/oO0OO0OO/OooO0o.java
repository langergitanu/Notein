package oO0OO0OO;

import java.util.logging.Level;
import oO000Oo.OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooO00o f118650OooOo0o;

    public OooO0o(OooO0o.OooO00o oooO00o) {
        this.f118650OooOo0o = oooO00o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO0o.OooO00o oooO00o = this.f118650OooOo0o;
        long j = oooO00o.f113959OooO00o;
        long jMax = Math.max(2 * j, j);
        oO000Oo.OooO0o oooO0o = oO000Oo.OooO0o.this;
        if (oooO0o.f113958OooO0O0.compareAndSet(j, jMax)) {
            oO000Oo.OooO0o.f113956OooO0OO.log(Level.WARNING, "Increased {0} to {1}", new Object[]{oooO0o.f113957OooO00o, Long.valueOf(jMax)});
        }
    }
}
