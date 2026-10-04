package o00O0OoO;

/* JADX INFO: renamed from: o00O0OoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24874OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f84442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f84443OooO0O0;

    public C24874OooO0oO(String str, int i) {
        this.f84442OooO00o = str;
        this.f84443OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24874OooO0oO)) {
            return false;
        }
        C24874OooO0oO c24874OooO0oO = (C24874OooO0oO) obj;
        if (this.f84443OooO0O0 != c24874OooO0oO.f84443OooO0O0) {
            return false;
        }
        return this.f84442OooO00o.equals(c24874OooO0oO.f84442OooO00o);
    }

    public final int hashCode() {
        return (this.f84442OooO00o.hashCode() * 31) + this.f84443OooO0O0;
    }
}
