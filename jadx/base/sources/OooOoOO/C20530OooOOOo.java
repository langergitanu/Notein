package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20530OooOOOo extends AbstractC20531OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f58645OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f58646OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f58647OooO0OO = 2;

    public C20530OooOOOo(float f, float f2) {
        this.f58645OooO00o = f;
        this.f58646OooO0O0 = f2;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final float OooO00o(int i) {
        if (i == 0) {
            return this.f58645OooO00o;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f58646OooO0O0;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final int OooO0O0() {
        return this.f58647OooO0OO;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final AbstractC20531OooOOo OooO0OO() {
        return new C20530OooOOOo(0.0f, 0.0f);
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final void OooO0Oo() {
        this.f58645OooO00o = 0.0f;
        this.f58646OooO0O0 = 0.0f;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final void OooO0o0(int i, float f) {
        if (i == 0) {
            this.f58645OooO00o = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f58646OooO0O0 = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20530OooOOOo)) {
            return false;
        }
        C20530OooOOOo c20530OooOOOo = (C20530OooOOOo) obj;
        return c20530OooOOOo.f58645OooO00o == this.f58645OooO00o && c20530OooOOOo.f58646OooO0O0 == this.f58646OooO0O0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58646OooO0O0) + (Float.hashCode(this.f58645OooO00o) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f58645OooO00o + ", v2 = " + this.f58646OooO0O0;
    }
}
