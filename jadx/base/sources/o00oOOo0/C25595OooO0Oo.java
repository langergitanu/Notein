package o00oOOo0;

import o00oOo00.OooO;
import oO0O00oo.OooOO0;

/* JADX INFO: renamed from: o00oOOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25595OooO0Oo implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f87309OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C25596OooO0o0 f87310OooO0O0;

    public C25595OooO0Oo(C25596OooO0o0 c25596OooO0o0) {
        this.f87310OooO0O0 = c25596OooO0o0;
        this.f87309OooO00o = c25596OooO0o0.f87313OooO;
    }

    @Override // o00oOo00.OooO
    public final void OooO00o(int i) {
        C25596OooO0o0 c25596OooO0o0 = this.f87310OooO0O0;
        if (i != c25596OooO0o0.f87322OooOO0) {
            c25596OooO0o0.f87322OooOO0 = OooOO0.OooO0o(i, 1, c25596OooO0o0.f87313OooO);
            o00oOo00.OooOO0 oooOO0OooO0o = c25596OooO0o0.OooO0o();
            if (oooOO0OooO0o != null) {
                oooOO0OooO0o.OooO0O0(c25596OooO0o0.f87322OooOO0);
            }
        }
    }

    @Override // o00oOo00.OooO
    public final int OooO0O0() {
        return this.f87310OooO0O0.f87322OooOO0;
    }

    @Override // o00oOo00.OooO
    public final int OooO0OO() {
        return this.f87309OooO00o;
    }
}
