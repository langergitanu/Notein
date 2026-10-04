package com.aspose.slides.internal.p347px;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9583du {

    /* JADX INFO: renamed from: du */
    private final short f34594du;

    /* JADX INFO: renamed from: k4 */
    private final int[] f34595k4;

    /* JADX INFO: renamed from: kk */
    private final int f34596kk;

    /* JADX INFO: renamed from: to */
    private final C9586h4 f34597to;

    /* JADX INFO: renamed from: x1 */
    private final byte[] f34598x1;

    public C9583du(C9586h4 c9586h4) {
        this.f34597to = c9586h4;
        int iM46825x1 = c9586h4.m46825x1() & 65535;
        this.f34596kk = iM46825x1;
        short sM46823kk = c9586h4.m46823kk();
        this.f34594du = sM46823kk;
        this.f34595k4 = c9586h4.m46822k4(sM46823kk, iM46825x1 + 1);
        this.f34598x1 = c9586h4.m46824to().m54277k4(r1[iM46825x1] - 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m46811k4() {
        return this.f34598x1;
    }
}
