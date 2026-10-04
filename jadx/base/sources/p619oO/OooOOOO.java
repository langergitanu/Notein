package p619oO;

import OooOOO0.AbstractC20449OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f113656OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f113657OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f113658OooO0Oo;

    public static abstract class OooO00o<T extends OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f113659OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f113660OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f113661OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f113662OooO0Oo = 0;

        public OooO00o(int i) {
            this.f113659OooO00o = i;
        }
    }

    public OooOOOO(OooO00o oooO00o) {
        this.f113655OooO00o = oooO00o.f113660OooO0O0;
        this.f113656OooO0O0 = oooO00o.f113661OooO0OO;
        this.f113657OooO0OO = oooO00o.f113659OooO00o;
        this.f113658OooO0Oo = oooO00o.f113662OooO0Oo;
    }

    public byte[] OooO00o() {
        byte[] bArr = new byte[32];
        AbstractC20449OooO0Oo.OooOoo(this.f113655OooO00o, 0, bArr);
        AbstractC20449OooO0Oo.Oooo0(this.f113656OooO0O0, bArr, 4);
        AbstractC20449OooO0Oo.OooOoo(this.f113657OooO0OO, 12, bArr);
        AbstractC20449OooO0Oo.OooOoo(this.f113658OooO0Oo, 28, bArr);
        return bArr;
    }
}
