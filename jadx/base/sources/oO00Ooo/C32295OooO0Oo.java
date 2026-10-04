package oO00Ooo;

/* JADX INFO: renamed from: oO00Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32295OooO0Oo extends AbstractC32301OooOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f116178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32303OooOOo f116179OooO0OO;

    public C32295OooO0Oo(boolean z, C32303OooOOo c32303OooOOo) {
        this.f116178OooO0O0 = z;
        this.f116179OooO0OO = c32303OooOOo;
    }

    @Override // oO00Ooo.AbstractC32301OooOO0o
    public final boolean OooO00o() {
        return this.f116178OooO0O0;
    }

    @Override // oO00Ooo.AbstractC32301OooOO0o
    public final C32303OooOOo OooO0O0() {
        return this.f116179OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC32301OooOO0o)) {
            return false;
        }
        AbstractC32301OooOO0o abstractC32301OooOO0o = (AbstractC32301OooOO0o) obj;
        if (this.f116178OooO0O0 != abstractC32301OooOO0o.OooO00o()) {
            return false;
        }
        C32303OooOOo c32303OooOOo = this.f116179OooO0OO;
        return c32303OooOOo == null ? abstractC32301OooOO0o.OooO0O0() == null : c32303OooOOo.equals(abstractC32301OooOO0o.OooO0O0());
    }

    public final int hashCode() {
        int i = ((this.f116178OooO0O0 ? 1231 : 1237) ^ 1000003) * 1000003;
        C32303OooOOo c32303OooOOo = this.f116179OooO0OO;
        return i ^ (c32303OooOOo == null ? 0 : c32303OooOOo.hashCode());
    }

    public final String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.f116178OooO0O0 + ", status=" + this.f116179OooO0OO + "}";
    }
}
