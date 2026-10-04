package OooOoOO;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: OooOoOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20532OooOOo0 extends AbstractC20531OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f58648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f58649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f58650OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f58651OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f58652OooO0o0 = 4;

    public C20532OooOOo0(float f, float f2, float f3, float f4) {
        this.f58648OooO00o = f;
        this.f58649OooO0O0 = f2;
        this.f58650OooO0OO = f3;
        this.f58651OooO0Oo = f4;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final float OooO00o(int i) {
        if (i == 0) {
            return this.f58648OooO00o;
        }
        if (i == 1) {
            return this.f58649OooO0O0;
        }
        if (i == 2) {
            return this.f58650OooO0OO;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f58651OooO0Oo;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final int OooO0O0() {
        return this.f58652OooO0o0;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final AbstractC20531OooOOo OooO0OO() {
        return new C20532OooOOo0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final void OooO0Oo() {
        this.f58648OooO00o = 0.0f;
        this.f58649OooO0O0 = 0.0f;
        this.f58650OooO0OO = 0.0f;
        this.f58651OooO0Oo = 0.0f;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final void OooO0o0(int i, float f) {
        if (i == 0) {
            this.f58648OooO00o = f;
            return;
        }
        if (i == 1) {
            this.f58649OooO0O0 = f;
        } else if (i == 2) {
            this.f58650OooO0OO = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f58651OooO0Oo = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20532OooOOo0)) {
            return false;
        }
        C20532OooOOo0 c20532OooOOo0 = (C20532OooOOo0) obj;
        return c20532OooOOo0.f58648OooO00o == this.f58648OooO00o && c20532OooOOo0.f58649OooO0O0 == this.f58649OooO0O0 && c20532OooOOo0.f58650OooO0OO == this.f58650OooO0OO && c20532OooOOo0.f58651OooO0Oo == this.f58651OooO0Oo;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58651OooO0Oo) + C20509OooO0oo.OooO0OO(this.f58650OooO0OO, C20509OooO0oo.OooO0OO(this.f58649OooO0O0, Float.hashCode(this.f58648OooO00o) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f58648OooO00o + ", v2 = " + this.f58649OooO0O0 + ", v3 = " + this.f58650OooO0OO + ", v4 = " + this.f58651OooO0Oo;
    }
}
