package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;
import p619oO.OooOOOO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 extends OooOOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f113638OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f113639OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f113640OooO0oO;

    public static class OooO00o extends OooOOOO.OooO00o<OooO00o> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f113641OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f113642OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f113643OooO0oO;

        public OooO00o() {
            super(0);
            this.f113642OooO0o0 = 0;
            this.f113641OooO0o = 0;
            this.f113643OooO0oO = 0;
        }
    }

    public OooOO0(OooO00o oooO00o) {
        super(oooO00o);
        this.f113639OooO0o0 = oooO00o.f113642OooO0o0;
        this.f113638OooO0o = oooO00o.f113641OooO0o;
        this.f113640OooO0oO = oooO00o.f113643OooO0oO;
    }

    @Override // p619oO.OooOOOO
    public final byte[] OooO00o() {
        byte[] bArrOooO00o = super.OooO00o();
        AbstractC20449OooO0Oo.OooOoo(this.f113639OooO0o0, 16, bArrOooO00o);
        AbstractC20449OooO0Oo.OooOoo(this.f113638OooO0o, 20, bArrOooO00o);
        AbstractC20449OooO0Oo.OooOoo(this.f113640OooO0oO, 24, bArrOooO00o);
        return bArrOooO00o;
    }
}
