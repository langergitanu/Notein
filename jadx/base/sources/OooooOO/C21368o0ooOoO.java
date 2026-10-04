package OooooOO;

/* JADX INFO: renamed from: OooooOO.o0ooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21368o0ooOoO extends AbstractC21341OoooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f61817OooO00o;

    public C21368o0ooOoO(long j) {
        this.f61817OooO00o = j;
    }

    @Override // OooooOO.AbstractC21341OoooOO0
    public final void OooO00o(float f, long j, C21331Oooo0O0 p) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
        p.OooOO0(1.0f);
        long jOooO0O0 = this.f61817OooO00o;
        if (f != 1.0f) {
            jOooO0O0 = C21348Ooooo0o.OooO0O0(C21348Ooooo0o.OooO0Oo(jOooO0O0) * f, jOooO0O0);
        }
        p.OooOO0o(jOooO0O0);
        if (p.OooO0o0() != null) {
            p.OooOOOO(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21368o0ooOoO) {
            return C21348Ooooo0o.OooO0OO(this.f61817OooO00o, ((C21368o0ooOoO) obj).f61817OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        int i = C21348Ooooo0o.f61767OooO0oo;
        return Long.hashCode(this.f61817OooO00o);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C21348Ooooo0o.OooO(this.f61817OooO00o)) + ')';
    }
}
