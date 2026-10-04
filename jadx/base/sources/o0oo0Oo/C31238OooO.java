package o0oo0Oo;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: o0oo0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31238OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f111409OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f111410OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f111411OooO0OO;

    public C31238OooO(int i, float f, float f2) {
        this.f111409OooO00o = i;
        this.f111410OooO0O0 = f;
        this.f111411OooO0OO = f2;
    }

    public static C31238OooO OooO00o(C31238OooO c31238OooO, float f, float f2, int i) {
        int i2 = c31238OooO.f111409OooO00o;
        if ((i & 2) != 0) {
            f = c31238OooO.f111410OooO0O0;
        }
        if ((i & 4) != 0) {
            f2 = c31238OooO.f111411OooO0OO;
        }
        c31238OooO.getClass();
        return new C31238OooO(i2, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31238OooO)) {
            return false;
        }
        C31238OooO c31238OooO = (C31238OooO) obj;
        return this.f111409OooO00o == c31238OooO.f111409OooO00o && Float.compare(this.f111410OooO0O0, c31238OooO.f111410OooO0O0) == 0 && Float.compare(this.f111411OooO0OO, c31238OooO.f111411OooO0OO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f111411OooO0OO) + C20509OooO0oo.OooO0OO(this.f111410OooO0O0, Integer.hashCode(this.f111409OooO00o) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedPointF(index=");
        sb.append(this.f111409OooO00o);
        sb.append(", x=");
        sb.append(this.f111410OooO0O0);
        sb.append(", y=");
        return Oooo00o.OooO0OO.OooO0OO(sb, this.f111411OooO0OO, ")");
    }
}
