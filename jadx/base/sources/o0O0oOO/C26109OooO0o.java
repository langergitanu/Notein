package o0O0oOO;

/* JADX INFO: renamed from: o0O0oOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26109OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC26107OooO0OO f89134OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26111OooO0oO f89135OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C26112OooO0oo f89136OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C26112OooO0oo f89137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f89138OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f89139OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f89140OooO0oO;

    public C26109OooO0o(EnumC26107OooO0OO enumC26107OooO0OO, C26111OooO0oO c26111OooO0oO, C26111OooO0oO c26111OooO0oO2, C26111OooO0oO c26111OooO0oO3, boolean z) {
        this.f89134OooO00o = enumC26107OooO0OO;
        this.f89135OooO0O0 = c26111OooO0oO3;
        this.f89140OooO0oO = z;
        int iOrdinal = enumC26107OooO0OO.ordinal();
        int i = c26111OooO0oO.f89148OooO0O0;
        int i2 = c26111OooO0oO.f89147OooO00o;
        int i3 = c26111OooO0oO2.f89148OooO0O0;
        int i4 = c26111OooO0oO2.f89147OooO00o;
        int i5 = c26111OooO0oO3.f89148OooO0O0;
        if (iOrdinal == 1) {
            float f = i5;
            this.f89137OooO0Oo = new C26112OooO0oo(f / (i3 / i4), f);
            float f2 = f / i3;
            this.f89138OooO0o = f2;
            float f3 = i * f2;
            this.f89136OooO0OO = new C26112OooO0oo(f3 / (i / i2), f3);
            return;
        }
        int i6 = c26111OooO0oO3.f89147OooO00o;
        if (iOrdinal != 2) {
            float f4 = i6;
            this.f89136OooO0OO = new C26112OooO0oo(f4, f4 / (i2 / i));
            float f5 = f4 / i2;
            this.f89139OooO0o0 = f5;
            float f6 = i4 * f5;
            this.f89137OooO0Oo = new C26112OooO0oo(f6, f6 / (i4 / i3));
            return;
        }
        float f7 = i5;
        float f8 = i2;
        C26112OooO0oo c26112OooO0ooOooO0O0 = OooO0O0(c26111OooO0oO2, i4 * (OooO0O0(c26111OooO0oO, i6, f7).f89149OooO00o / f8), f7);
        this.f89137OooO0Oo = c26112OooO0ooOooO0O0;
        float f9 = c26112OooO0ooOooO0O0.f89150OooO0O0 / i3;
        this.f89138OooO0o = f9;
        C26112OooO0oo c26112OooO0ooOooO0O02 = OooO0O0(c26111OooO0oO, i6, i * f9);
        this.f89136OooO0OO = c26112OooO0ooOooO0O02;
        this.f89139OooO0o0 = c26112OooO0ooOooO0O02.f89149OooO00o / f8;
    }

    public static C26112OooO0oo OooO0O0(C26111OooO0oO c26111OooO0oO, float f, float f2) {
        float f3 = c26111OooO0oO.f89147OooO00o / c26111OooO0oO.f89148OooO0O0;
        float f4 = f / f3;
        if (f4 > f2) {
            f = f2 * f3;
        } else {
            f2 = f4;
        }
        return new C26112OooO0oo(f, f2);
    }

    public final C26112OooO0oo OooO00o(C26111OooO0oO c26111OooO0oO) {
        int i;
        int i2 = c26111OooO0oO.f89147OooO00o;
        if (i2 <= 0 || (i = c26111OooO0oO.f89148OooO0O0) <= 0) {
            return new C26112OooO0oo(0.0f, 0.0f);
        }
        C26111OooO0oO c26111OooO0oO2 = this.f89135OooO0O0;
        boolean z = this.f89140OooO0oO;
        float f = z ? c26111OooO0oO2.f89147OooO00o : i2 * this.f89139OooO0o0;
        float f2 = z ? c26111OooO0oO2.f89148OooO0O0 : i * this.f89138OooO0o;
        int iOrdinal = this.f89134OooO00o.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? new C26112OooO0oo(f, f / (i2 / i)) : OooO0O0(c26111OooO0oO, f, f2) : new C26112OooO0oo(f2 / (i / i2), f2);
    }
}
