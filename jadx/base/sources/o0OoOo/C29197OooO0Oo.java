package o0OoOo;

/* JADX INFO: renamed from: o0OoOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29197OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f103564OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f103565OooO0O0;

    public C29197OooO0Oo(float f, boolean z) {
        this.f103564OooO00o = f;
        this.f103565OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29197OooO0Oo)) {
            return false;
        }
        C29197OooO0Oo c29197OooO0Oo = (C29197OooO0Oo) obj;
        return Float.compare(this.f103564OooO00o, c29197OooO0Oo.f103564OooO00o) == 0 && this.f103565OooO0O0 == c29197OooO0Oo.f103565OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103565OooO0O0) + (Float.hashCode(this.f103564OooO00o) * 31);
    }

    public final String toString() {
        return "AudioPlaySpeedVO(speed=" + this.f103564OooO00o + ", isSelected=" + this.f103565OooO0O0 + ")";
    }
}
