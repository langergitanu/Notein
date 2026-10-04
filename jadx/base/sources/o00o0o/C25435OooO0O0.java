package o00o0o;

import OooOoo0.OooOo00;
import o00o0o.AbstractC25434OooO00o;
import o00o0o00.C25438OooO00o;

/* JADX INFO: renamed from: o00o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25435OooO0O0<T> extends AbstractC25434OooO00o<T> {
    @Override // o00o0o.AbstractC25434OooO00o
    /* JADX INFO: renamed from: OooO00o */
    public final AbstractC25434OooO00o<T> clone() {
        OooOo00.OooO0o(Oooo00o());
        return new C25435OooO0O0(this.f86712OooOo, this.f86715OooOoO0, this.f86714OooOoO != null ? new Throwable() : null);
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f86713OooOo0o) {
                    super.finalize();
                    return;
                }
                T tOooO00o = this.f86712OooOo.OooO00o();
                C25438OooO00o.OooOO0("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f86712OooOo)), tOooO00o == null ? null : tOooO00o.getClass().getName());
                AbstractC25434OooO00o.OooO0OO oooO0OO = this.f86715OooOoO0;
                if (oooO0OO != null) {
                    oooO0OO.OooO00o(this.f86712OooOo, this.f86714OooOoO);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
