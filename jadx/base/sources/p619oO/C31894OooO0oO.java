package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;
import p619oO.OooOOOO;

/* JADX INFO: renamed from: oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31894OooO0oO extends OooOOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f113632OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f113633OooO0o0;

    /* JADX INFO: renamed from: oO.OooO0oO$OooO00o */
    public static class OooO00o extends OooOOOO.OooO00o<OooO00o> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f113634OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f113635OooO0o0;

        public OooO00o() {
            super(2);
            this.f113635OooO0o0 = 0;
            this.f113634OooO0o = 0;
        }
    }

    public C31894OooO0oO(OooO00o oooO00o) {
        super(oooO00o);
        this.f113633OooO0o0 = oooO00o.f113635OooO0o0;
        this.f113632OooO0o = oooO00o.f113634OooO0o;
    }

    @Override // p619oO.OooOOOO
    public final byte[] OooO00o() {
        byte[] bArrOooO00o = super.OooO00o();
        AbstractC20449OooO0Oo.OooOoo(0, 16, bArrOooO00o);
        AbstractC20449OooO0Oo.OooOoo(this.f113633OooO0o0, 20, bArrOooO00o);
        AbstractC20449OooO0Oo.OooOoo(this.f113632OooO0o, 24, bArrOooO00o);
        return bArrOooO00o;
    }
}
