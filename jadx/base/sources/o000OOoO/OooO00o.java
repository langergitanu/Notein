package o000OOoO;

import oO00ooO.C32460OooOooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f82887OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f82888OooO0O0;

    public final void OooO00o() {
        if (f82888OooO0O0) {
            return;
        }
        synchronized (this) {
            if (f82888OooO0O0) {
                return;
            }
            System.loadLibrary("ink");
            f82888OooO0O0 = true;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
