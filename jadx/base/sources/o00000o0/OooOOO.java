package o00000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooOOO f81282OooO0OO = new OooOOO(2, false);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOO f81283OooO0Oo = new OooOOO(1, true);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f81285OooO0O0;

    public OooOOO(int i, boolean z) {
        this.f81284OooO00o = i;
        this.f81285OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return this.f81284OooO00o == oooOOO.f81284OooO00o && this.f81285OooO0O0 == oooOOO.f81285OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81285OooO0O0) + (Integer.hashCode(this.f81284OooO00o) * 31);
    }

    public final String toString() {
        return equals(f81282OooO0OO) ? "TextMotion.Static" : equals(f81283OooO0Oo) ? "TextMotion.Animated" : "Invalid";
    }
}
