package OooOooo;

import OooOoO.C20509OooO0oo;
import o0000Ooo.C24232OooO0o0;
import o0000Ooo.EnumC24238OooOOO;

/* JADX INFO: renamed from: OooOooo.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20787Oooo0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f59694OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f59695OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f59696OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f59697OooO0Oo;

    public C20787Oooo0OO(float f, float f2, float f3, float f4) {
        this.f59694OooO00o = f;
        this.f59695OooO0O0 = f2;
        this.f59696OooO0OO = f3;
        this.f59697OooO0Oo = f4;
    }

    public final float OooO00o() {
        return this.f59697OooO0Oo;
    }

    public final float OooO0O0(EnumC24238OooOOO layoutDirection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        return layoutDirection == EnumC24238OooOOO.f81494OooOo0o ? this.f59694OooO00o : this.f59696OooO0OO;
    }

    public final float OooO0OO(EnumC24238OooOOO layoutDirection) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        return layoutDirection == EnumC24238OooOOO.f81494OooOo0o ? this.f59696OooO0OO : this.f59694OooO00o;
    }

    public final float OooO0Oo() {
        return this.f59695OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20787Oooo0OO)) {
            return false;
        }
        C20787Oooo0OO c20787Oooo0OO = (C20787Oooo0OO) obj;
        return C24232OooO0o0.OooO00o(this.f59694OooO00o, c20787Oooo0OO.f59694OooO00o) && C24232OooO0o0.OooO00o(this.f59695OooO0O0, c20787Oooo0OO.f59695OooO0O0) && C24232OooO0o0.OooO00o(this.f59696OooO0OO, c20787Oooo0OO.f59696OooO0OO) && C24232OooO0o0.OooO00o(this.f59697OooO0Oo, c20787Oooo0OO.f59697OooO0Oo);
    }

    public final int hashCode() {
        return Float.hashCode(this.f59697OooO0Oo) + C20509OooO0oo.OooO0OO(this.f59696OooO0OO, C20509OooO0oo.OooO0OO(this.f59695OooO0O0, Float.hashCode(this.f59694OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) C24232OooO0o0.OooO0O0(this.f59694OooO00o)) + ", top=" + ((Object) C24232OooO0o0.OooO0O0(this.f59695OooO0O0)) + ", end=" + ((Object) C24232OooO0o0.OooO0O0(this.f59696OooO0OO)) + ", bottom=" + ((Object) C24232OooO0o0.OooO0O0(this.f59697OooO0Oo)) + ')';
    }
}
