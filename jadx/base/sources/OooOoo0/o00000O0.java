package OooOoo0;

import OooOoO.C20509OooO0oo;
import o0000Ooo.C24232OooO0o0;
import o0000Ooo.C24234OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00000O0 f59435OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00000O0 f59436OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f59437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f59438OooO0O0;

    static {
        long j = C24234OooO0oo.f81484OooO0OO;
        f59435OooO0OO = new o00000O0(j, false);
        f59436OooO0Oo = new o00000O0(j, true);
    }

    public o00000O0(long j, boolean z) {
        this.f59437OooO00o = z;
        this.f59438OooO0O0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        o00000O0 o00000o02 = (o00000O0) obj;
        if (this.f59437OooO00o != o00000o02.f59437OooO00o) {
            return false;
        }
        int i = C24234OooO0oo.f81485OooO0Oo;
        return this.f59438OooO0O0 == o00000o02.f59438OooO0O0 && C24232OooO0o0.OooO00o(Float.NaN, Float.NaN) && C24232OooO0o0.OooO00o(Float.NaN, Float.NaN);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f59437OooO00o) * 31;
        int i = C24234OooO0oo.f81485OooO0Oo;
        return Boolean.hashCode(false) + o00000.OooO0O0(C20509OooO0oo.OooO0OO(Float.NaN, C20509OooO0oo.OooO0OO(Float.NaN, C20703o000000o.OooO0O0(iHashCode, 31, this.f59438OooO0O0), 31), 31), 31, true);
    }

    public final String toString() {
        if (this.f59437OooO00o) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) C24234OooO0oo.OooO0OO(this.f59438OooO0O0)) + ", cornerRadius=" + ((Object) C24232OooO0o0.OooO0O0(Float.NaN)) + ", elevation=" + ((Object) C24232OooO0o0.OooO0O0(Float.NaN)) + ", clippingEnabled=true, fishEyeEnabled=false)";
    }
}
