package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20543OooOooO implements InterfaceC20542OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f58671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f58672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC20539OooOoO0 f58673OooO0OO;

    public C20543OooOooO(int i, int i2, InterfaceC20539OooOoO0 easing) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(easing, "easing");
        this.f58671OooO00o = i;
        this.f58672OooO0O0 = i2;
        this.f58673OooO0OO = easing;
    }

    @Override // OooOoOO.InterfaceC20542OooOoo0
    public final float OooO0O0(long j, float f, float f2, float f3) {
        long jOooO0oO = oO0O00oo.OooOO0.OooO0oO((j / 1000000) - ((long) this.f58672OooO0O0), 0L, this.f58671OooO00o);
        if (jOooO0oO < 0) {
            return 0.0f;
        }
        if (jOooO0oO == 0) {
            return f3;
        }
        return (OooO0o0(jOooO0oO * 1000000, f, f2, f3) - OooO0o0((jOooO0oO - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // OooOoOO.InterfaceC20542OooOoo0
    public final long OooO0OO(float f, float f2, float f3) {
        return ((long) (this.f58672OooO0O0 + this.f58671OooO00o)) * 1000000;
    }

    @Override // OooOoOO.InterfaceC20542OooOoo0
    public final float OooO0o0(long j, float f, float f2, float f3) {
        long j2 = (j / 1000000) - ((long) this.f58672OooO0O0);
        int i = this.f58671OooO00o;
        float fOooO00o = this.f58673OooO0OO.OooO00o(oO0O00oo.OooOO0.OooO0o0(i == 0 ? 1.0f : oO0O00oo.OooOO0.OooO0oO(j2, 0L, i) / i, 0.0f, 1.0f));
        o0OoOo0 o0oooo02 = C20580ooOO.f58832OooO00o;
        return (f2 * fOooO00o) + ((1 - fOooO00o) * f);
    }
}
