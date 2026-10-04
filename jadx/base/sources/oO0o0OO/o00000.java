package oO0o0OO;

import oO00ooO.C32446OooOOOo;
import oO0o0OO.o0ooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000<T> extends AbstractC33673o0ooOO0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o0ooOOo.OooO00o f121352OooOoOO;

    public o00000(o0ooOOo.OooO00o oooO00o) {
        this.f121352OooOoOO = oooO00o;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final boolean OooO() {
        return false;
    }

    @Override // oO0o0OO.AbstractC33673o0ooOO0
    public final void OooOO0(Throwable th) {
        Object obj = o0ooOOo.f121392OooOo0o.get(OooO0oo());
        boolean z = obj instanceof C33620OooOo;
        o0ooOOo.OooO00o oooO00o = this.f121352OooOoOO;
        if (z) {
            oooO00o.resumeWith(C32446OooOOOo.OooO00o(((C33620OooOo) obj).f121304OooO00o));
        } else {
            oooO00o.resumeWith(o0Oo0oo.OooO00o(obj));
        }
    }
}
