package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;
import p619oO.OooOOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends OooOOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f113599OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f113600OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f113601OooO0oO;

    public static class OooO00o extends OooOOOO.OooO00o<OooO00o> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f113602OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f113603OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f113604OooO0oO;

        public OooO00o() {
            super(1);
            this.f113603OooO0o0 = 0;
            this.f113602OooO0o = 0;
            this.f113604OooO0oO = 0;
        }
    }

    public OooO(OooO00o oooO00o) {
        super(oooO00o);
        this.f113600OooO0o0 = oooO00o.f113603OooO0o0;
        this.f113599OooO0o = oooO00o.f113602OooO0o;
        this.f113601OooO0oO = oooO00o.f113604OooO0oO;
    }

    @Override // p619oO.OooOOOO
    public final byte[] OooO00o() {
        byte[] bArrOooO00o = super.OooO00o();
        AbstractC20449OooO0Oo.OooOoo(this.f113600OooO0o0, 16, bArrOooO00o);
        AbstractC20449OooO0Oo.OooOoo(this.f113599OooO0o, 20, bArrOooO00o);
        AbstractC20449OooO0Oo.OooOoo(this.f113601OooO0oO, 24, bArrOooO00o);
        return bArrOooO00o;
    }
}
