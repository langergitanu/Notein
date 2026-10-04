package o0oOO;

import o00Oo0oO.C25052OooO0Oo;
import o0oOO.C30795OooO0OO;
import o0oOO.C30795OooO0OO.OooO0O0;

/* JADX INFO: renamed from: o0oOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC30793OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C30795OooO0OO f110073OooOo0o;

    public RunnableC30793OooO00o(C30795OooO0OO c30795OooO0OO) {
        this.f110073OooOo0o = c30795OooO0OO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C30795OooO0OO c30795OooO0OO = this.f110073OooOo0o;
        if (c30795OooO0OO.f110075OooO00o == null) {
            C30795OooO0OO.OooO0O0 oooO0O0 = c30795OooO0OO.new OooO0O0(c30795OooO0OO.f110076OooO0O0);
            c30795OooO0OO.f110075OooO00o = oooO0O0;
            oooO0O0.setCancelable(false);
        }
        try {
            if (c30795OooO0OO.f110075OooO00o.isShowing()) {
                return;
            }
            c30795OooO0OO.f110075OooO00o.show();
            c30795OooO0OO.f110078OooO0Oo.sendEmptyMessageDelayed(1, 10000L);
        } catch (Exception e) {
            C25052OooO0Oo.OooO00o(e);
        }
    }
}
