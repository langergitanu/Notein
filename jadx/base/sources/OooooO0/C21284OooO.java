package OooooO0;

import OooO0o.C20424OooO0Oo;
import OooOoO.C20509OooO0oo;
import OooOoo0.C20703o000000o;

/* JADX INFO: renamed from: OooooO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21284OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f61702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f61703OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f61704OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f61705OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f61706OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f61707OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f61708OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f61709OooO0oo;

    static {
        long j = C21285OooO00o.f61710OooO00o;
        C21286OooO0O0.OooO00o(C21285OooO00o.OooO0O0(j), C21285OooO00o.OooO0OO(j));
    }

    public C21284OooO(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f61702OooO00o = f;
        this.f61703OooO0O0 = f2;
        this.f61704OooO0OO = f3;
        this.f61705OooO0Oo = f4;
        this.f61707OooO0o0 = j;
        this.f61706OooO0o = j2;
        this.f61708OooO0oO = j3;
        this.f61709OooO0oo = j4;
    }

    public final float OooO00o() {
        return this.f61705OooO0Oo - this.f61703OooO0O0;
    }

    public final float OooO0O0() {
        return this.f61704OooO0OO - this.f61702OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21284OooO)) {
            return false;
        }
        C21284OooO c21284OooO = (C21284OooO) obj;
        return Float.compare(this.f61702OooO00o, c21284OooO.f61702OooO00o) == 0 && Float.compare(this.f61703OooO0O0, c21284OooO.f61703OooO0O0) == 0 && Float.compare(this.f61704OooO0OO, c21284OooO.f61704OooO0OO) == 0 && Float.compare(this.f61705OooO0Oo, c21284OooO.f61705OooO0Oo) == 0 && C21285OooO00o.OooO00o(this.f61707OooO0o0, c21284OooO.f61707OooO0o0) && C21285OooO00o.OooO00o(this.f61706OooO0o, c21284OooO.f61706OooO0o) && C21285OooO00o.OooO00o(this.f61708OooO0oO, c21284OooO.f61708OooO0oO) && C21285OooO00o.OooO00o(this.f61709OooO0oo, c21284OooO.f61709OooO0oo);
    }

    public final int hashCode() {
        int iOooO0OO = C20509OooO0oo.OooO0OO(this.f61705OooO0Oo, C20509OooO0oo.OooO0OO(this.f61704OooO0OO, C20509OooO0oo.OooO0OO(this.f61703OooO0O0, Float.hashCode(this.f61702OooO00o) * 31, 31), 31), 31);
        int i = C21285OooO00o.f61711OooO0O0;
        return Long.hashCode(this.f61709OooO0oo) + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(iOooO0OO, 31, this.f61707OooO0o0), 31, this.f61706OooO0o), 31, this.f61708OooO0oO);
    }

    public final String toString() {
        String str = C21287OooO0OO.OooO0O0(this.f61702OooO00o) + ", " + C21287OooO0OO.OooO0O0(this.f61703OooO0O0) + ", " + C21287OooO0OO.OooO0O0(this.f61704OooO0OO) + ", " + C21287OooO0OO.OooO0O0(this.f61705OooO0Oo);
        long j = this.f61707OooO0o0;
        long j2 = this.f61706OooO0o;
        boolean zOooO00o = C21285OooO00o.OooO00o(j, j2);
        long j3 = this.f61708OooO0oO;
        long j4 = this.f61709OooO0oo;
        if (!zOooO00o || !C21285OooO00o.OooO00o(j2, j3) || !C21285OooO00o.OooO00o(j3, j4)) {
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("RoundRect(rect=", str, ", topLeft=");
            sbOooO0o0.append((Object) C21285OooO00o.OooO0Oo(j));
            sbOooO0o0.append(", topRight=");
            sbOooO0o0.append((Object) C21285OooO00o.OooO0Oo(j2));
            sbOooO0o0.append(", bottomRight=");
            sbOooO0o0.append((Object) C21285OooO00o.OooO0Oo(j3));
            sbOooO0o0.append(", bottomLeft=");
            sbOooO0o0.append((Object) C21285OooO00o.OooO0Oo(j4));
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
        if (C21285OooO00o.OooO0O0(j) == C21285OooO00o.OooO0OO(j)) {
            StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0("RoundRect(rect=", str, ", radius=");
            sbOooO0o02.append(C21287OooO0OO.OooO0O0(C21285OooO00o.OooO0O0(j)));
            sbOooO0o02.append(')');
            return sbOooO0o02.toString();
        }
        StringBuilder sbOooO0o03 = C20424OooO0Oo.OooO0o0("RoundRect(rect=", str, ", x=");
        sbOooO0o03.append(C21287OooO0OO.OooO0O0(C21285OooO00o.OooO0O0(j)));
        sbOooO0o03.append(", y=");
        sbOooO0o03.append(C21287OooO0OO.OooO0O0(C21285OooO00o.OooO0OO(j)));
        sbOooO0o03.append(')');
        return sbOooO0o03.toString();
    }
}
