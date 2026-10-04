package OoooooO;

import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import OooooOO.C21348Ooooo0o;
import o0000Ooo.C24232OooO0o0;

/* JADX INFO: renamed from: OoooooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21409OooO0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f61960OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f61961OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f61962OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f61963OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f61964OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C21458OoooO00 f61965OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f61966OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f61967OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f61968OooO0oo;

    public C21409OooO0Oo(String str, float f, float f2, float f3, float f4, C21458OoooO00 c21458OoooO00, long j, int i, boolean z) {
        this.f61961OooO00o = str;
        this.f61962OooO0O0 = f;
        this.f61963OooO0OO = f2;
        this.f61964OooO0Oo = f3;
        this.f61966OooO0o0 = f4;
        this.f61965OooO0o = c21458OoooO00;
        this.f61967OooO0oO = j;
        this.f61968OooO0oo = i;
        this.f61960OooO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21409OooO0Oo)) {
            return false;
        }
        C21409OooO0Oo c21409OooO0Oo = (C21409OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61961OooO00o, c21409OooO0Oo.f61961OooO00o) && C24232OooO0o0.OooO00o(this.f61962OooO0O0, c21409OooO0Oo.f61962OooO0O0) && C24232OooO0o0.OooO00o(this.f61963OooO0OO, c21409OooO0Oo.f61963OooO0OO) && this.f61964OooO0Oo == c21409OooO0Oo.f61964OooO0Oo && this.f61966OooO0o0 == c21409OooO0Oo.f61966OooO0o0 && this.f61965OooO0o.equals(c21409OooO0Oo.f61965OooO0o) && C21348Ooooo0o.OooO0OO(this.f61967OooO0oO, c21409OooO0Oo.f61967OooO0oO) && this.f61968OooO0oo == c21409OooO0Oo.f61968OooO0oo && this.f61960OooO == c21409OooO0Oo.f61960OooO;
    }

    public final int hashCode() {
        int iHashCode = (this.f61965OooO0o.hashCode() + C20509OooO0oo.OooO0OO(this.f61966OooO0o0, C20509OooO0oo.OooO0OO(this.f61964OooO0Oo, C20509OooO0oo.OooO0OO(this.f61963OooO0OO, C20509OooO0oo.OooO0OO(this.f61962OooO0O0, this.f61961OooO00o.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = C21348Ooooo0o.f61767OooO0oo;
        return Boolean.hashCode(this.f61960OooO) + C20785Oooo00o.OooO00o(this.f61968OooO0oo, C20703o000000o.OooO0O0(iHashCode, 31, this.f61967OooO0oO), 31);
    }
}
