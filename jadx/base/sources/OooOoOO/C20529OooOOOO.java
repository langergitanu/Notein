package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20529OooOOOO extends AbstractC20531OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f58643OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58644OooO0O0 = 1;

    public C20529OooOOOO(float f) {
        this.f58643OooO00o = f;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final float OooO00o(int i) {
        if (i == 0) {
            return this.f58643OooO00o;
        }
        return 0.0f;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final int OooO0O0() {
        return this.f58644OooO0O0;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final AbstractC20531OooOOo OooO0OO() {
        return new C20529OooOOOO(0.0f);
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final void OooO0Oo() {
        this.f58643OooO00o = 0.0f;
    }

    @Override // OooOoOO.AbstractC20531OooOOo
    public final void OooO0o0(int i, float f) {
        if (i == 0) {
            this.f58643OooO00o = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20529OooOOOO) && ((C20529OooOOOO) obj).f58643OooO00o == this.f58643OooO00o;
    }

    public final int hashCode() {
        return Float.hashCode(this.f58643OooO00o);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f58643OooO00o;
    }
}
