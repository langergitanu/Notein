package OooooO0;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: OooooO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21291OooO0oO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final C21291OooO0oO f61723OooO0o0 = new C21291OooO0oO(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f61724OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f61725OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f61726OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f61727OooO0Oo;

    public C21291OooO0oO(float f, float f2, float f3, float f4) {
        this.f61724OooO00o = f;
        this.f61725OooO0O0 = f2;
        this.f61726OooO0OO = f3;
        this.f61727OooO0Oo = f4;
    }

    public final long OooO00o() {
        return C21289OooO0o.OooO00o((OooO0OO() / 2.0f) + this.f61724OooO00o, (OooO0O0() / 2.0f) + this.f61725OooO0O0);
    }

    public final float OooO0O0() {
        return this.f61727OooO0Oo - this.f61725OooO0O0;
    }

    public final float OooO0OO() {
        return this.f61726OooO0OO - this.f61724OooO00o;
    }

    public final C21291OooO0oO OooO0Oo(C21291OooO0oO c21291OooO0oO) {
        return new C21291OooO0oO(Math.max(this.f61724OooO00o, c21291OooO0oO.f61724OooO00o), Math.max(this.f61725OooO0O0, c21291OooO0oO.f61725OooO0O0), Math.min(this.f61726OooO0OO, c21291OooO0oO.f61726OooO0OO), Math.min(this.f61727OooO0Oo, c21291OooO0oO.f61727OooO0Oo));
    }

    public final C21291OooO0oO OooO0o(long j) {
        return new C21291OooO0oO(C21290OooO0o0.OooO0OO(j) + this.f61724OooO00o, C21290OooO0o0.OooO0Oo(j) + this.f61725OooO0O0, C21290OooO0o0.OooO0OO(j) + this.f61726OooO0OO, C21290OooO0o0.OooO0Oo(j) + this.f61727OooO0Oo);
    }

    public final C21291OooO0oO OooO0o0(float f, float f2) {
        return new C21291OooO0oO(this.f61724OooO00o + f, this.f61725OooO0O0 + f2, this.f61726OooO0OO + f, this.f61727OooO0Oo + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21291OooO0oO)) {
            return false;
        }
        C21291OooO0oO c21291OooO0oO = (C21291OooO0oO) obj;
        return Float.compare(this.f61724OooO00o, c21291OooO0oO.f61724OooO00o) == 0 && Float.compare(this.f61725OooO0O0, c21291OooO0oO.f61725OooO0O0) == 0 && Float.compare(this.f61726OooO0OO, c21291OooO0oO.f61726OooO0OO) == 0 && Float.compare(this.f61727OooO0Oo, c21291OooO0oO.f61727OooO0Oo) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61727OooO0Oo) + C20509OooO0oo.OooO0OO(this.f61726OooO0OO, C20509OooO0oo.OooO0OO(this.f61725OooO0O0, Float.hashCode(this.f61724OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + C21287OooO0OO.OooO0O0(this.f61724OooO00o) + ", " + C21287OooO0OO.OooO0O0(this.f61725OooO0O0) + ", " + C21287OooO0OO.OooO0O0(this.f61726OooO0OO) + ", " + C21287OooO0OO.OooO0O0(this.f61727OooO0Oo) + ')';
    }
}
