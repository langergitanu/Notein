package o0O0oOO;

/* JADX INFO: renamed from: o0O0oOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26111OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f89147OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f89148OooO0O0;

    public C26111OooO0oO(int i, int i2) {
        this.f89147OooO00o = i;
        this.f89148OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26111OooO0oO) {
            C26111OooO0oO c26111OooO0oO = (C26111OooO0oO) obj;
            if (this.f89147OooO00o == c26111OooO0oO.f89147OooO00o && this.f89148OooO0O0 == c26111OooO0oO.f89148OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f89147OooO00o;
        return ((i >>> 16) | (i << 16)) ^ this.f89148OooO0O0;
    }

    public final String toString() {
        return this.f89147OooO00o + "x" + this.f89148OooO0O0;
    }
}
