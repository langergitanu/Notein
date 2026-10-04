package o00Oo0oO;

import OooOooO.C20741OooOOoo;
import o00OOOoO.C25016OooO00o;
import o00Oo0o0.C25047OooO00o;

/* JADX INFO: renamed from: o00Oo0oO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC25055OooO0oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f85060OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C25054OooO0oO f85061OooOo0o;

    public RunnableC25055OooO0oo(OooOO0 oooOO02, C25054OooO0oO c25054OooO0oO) {
        this.f85060OooOo = oooOO02;
        this.f85061OooOo0o = c25054OooO0oO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOO0 oooOO02 = this.f85060OooOo;
        C25047OooO00o c25047OooO00o = oooOO02.f85067OooO0o0;
        if (c25047OooO00o == null || c25047OooO00o.f85032OooO) {
            return;
        }
        o00OOOOo.OooO00o.OooO0oO(c25047OooO00o, "biz", "ErrActNotCreated", "");
        if (C25016OooO00o.OooO00o().f84927OooOo00) {
            oooOO02.f85067OooO0o0.f85040OooO0oo = true;
            this.f85061OooOo0o.mo224a(C20741OooOOoo.OooO0O0());
        }
    }
}
