package o0ooO0o;

import com.aspose.slides.C22200OooO0o0;
import o00oO0O.o0OoOo0;

/* JADX INFO: renamed from: o0ooO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31456OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f112493OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f112494OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f112495OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f112496OooO0Oo;

    public C31456OooO0O0(long j, long j2, boolean z, boolean z2) {
        boolean z3 = false;
        boolean z4 = !z2 || z;
        j = z ? j : -1L;
        j2 = j2 <= 0 ? -1L : j2;
        j = j < -1 ? -1L : j;
        if (!z4 || j != 0) {
            z3 = z4;
        } else if (!z2) {
            j = j2;
            z3 = z4;
        }
        if (z3 && j2 > -1 && (j == -1 || j > j2)) {
            j2 = j;
        }
        this.f112493OooO00o = z3;
        this.f112494OooO0O0 = z2;
        this.f112495OooO0OO = j;
        this.f112496OooO0Oo = j2;
    }

    public final String toString() {
        boolean z = this.f112493OooO00o;
        long j = this.f112496OooO0Oo;
        if (!z) {
            return j > 0 ? C22200OooO0o0.OooO0O0(j, "Scratch file only with max. of ", " bytes") : "Scratch file only with no size restriction";
        }
        boolean z2 = this.f112494OooO0O0;
        long j2 = this.f112495OooO0OO;
        if (!z2) {
            return j2 >= 0 ? C22200OooO0o0.OooO0O0(j2, "Main memory only with max. of ", " bytes") : "Main memory only with no size restriction";
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j2, "Mixed mode with max. of ", " main memory bytes");
        sbOooO00o.append(j > 0 ? C22200OooO0o0.OooO0O0(j, " and max. of ", " storage bytes") : " and unrestricted scratch file size");
        return sbOooO00o.toString();
    }
}
