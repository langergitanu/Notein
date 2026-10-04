package o0oOO;

import o00Oo0oO.C25052OooO0Oo;
import o0oOO.C30795OooO0OO;

/* JADX INFO: renamed from: o0oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC30794OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30795OooO0OO f110074OooOo0o;

    public RunnableC30794OooO0O0(C30795OooO0OO c30795OooO0OO) {
        this.f110074OooOo0o = c30795OooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C30795OooO0OO c30795OooO0OO = this.f110074OooOo0o;
        C30795OooO0OO.OooO0O0 oooO0O0 = c30795OooO0OO.f110075OooO00o;
        if (oooO0O0 == null || !oooO0O0.isShowing()) {
            return;
        }
        try {
            c30795OooO0OO.f110078OooO0Oo.removeMessages(1);
            c30795OooO0OO.f110075OooO00o.dismiss();
        } catch (Exception e) {
            C25052OooO0Oo.OooO00o(e);
        }
    }
}
