package o0O0oOO;

/* JADX INFO: renamed from: o0O0oOO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26112OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f89149OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f89150OooO0O0;

    public C26112OooO0oo(float f, float f2) {
        this.f89149OooO00o = f;
        this.f89150OooO0O0 = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26112OooO0oo) {
            C26112OooO0oo c26112OooO0oo = (C26112OooO0oo) obj;
            if (this.f89149OooO00o == c26112OooO0oo.f89149OooO00o && this.f89150OooO0O0 == c26112OooO0oo.f89150OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f89149OooO00o) ^ Float.floatToIntBits(this.f89150OooO0O0);
    }

    public final String toString() {
        return this.f89149OooO00o + "x" + this.f89150OooO0O0;
    }
}
