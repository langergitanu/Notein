package o0oo0Oo;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: o0oo0Oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31264OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f111613OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f111614OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f111615OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f111616OooO0Oo;

    public C31264OooOoOO(float f, float f2, float f3, float f4) {
        this.f111613OooO00o = f;
        this.f111614OooO0O0 = f2;
        this.f111615OooO0OO = f3;
        this.f111616OooO0Oo = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31264OooOoOO)) {
            return false;
        }
        C31264OooOoOO c31264OooOoOO = (C31264OooOoOO) obj;
        return Float.compare(this.f111613OooO00o, c31264OooOoOO.f111613OooO00o) == 0 && Float.compare(this.f111614OooO0O0, c31264OooOoOO.f111614OooO0O0) == 0 && Float.compare(this.f111615OooO0OO, c31264OooOoOO.f111615OooO0OO) == 0 && Float.compare(this.f111616OooO0Oo, c31264OooOoOO.f111616OooO0Oo) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111616OooO0Oo) + C20509OooO0oo.OooO0OO(this.f111615OooO0OO, C20509OooO0oo.OooO0OO(this.f111614OooO0O0, Float.hashCode(this.f111613OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StampPoint(x=");
        sb.append(this.f111613OooO00o);
        sb.append(", y=");
        sb.append(this.f111614OooO0O0);
        sb.append(", rotation=");
        sb.append(this.f111615OooO0OO);
        sb.append(", pressure=");
        return Oooo00o.OooO0OO.OooO0OO(sb, this.f111616OooO0Oo, ")");
    }
}
