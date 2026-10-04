package com.aspose.slides.internal.p353q7;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9765du {

    /* JADX INFO: renamed from: du */
    private final short f35279du;

    /* JADX INFO: renamed from: k4 */
    private final int[] f35280k4;

    /* JADX INFO: renamed from: kk */
    private final int f35281kk;

    /* JADX INFO: renamed from: to */
    private final C9772h4 f35282to;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f35283x1;

    public C9765du(C9772h4 c9772h4) {
        this.f35282to = c9772h4;
        int iM48089x1 = c9772h4.m48089x1() & 65535;
        this.f35281kk = iM48089x1;
        short sM48087kk = c9772h4.m48087kk();
        this.f35279du = sM48087kk;
        this.f35280k4 = c9772h4.m48086k4(sM48087kk, iM48089x1 + 1);
        this.f35283x1 = c9772h4.m48088to().m58603k4(r1[iM48089x1] - 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m48043k4() {
        return this.f35283x1;
    }
}
