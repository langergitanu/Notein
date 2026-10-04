package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.internal.p525yi.C12843x6;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.ii */
/* JADX INFO: loaded from: classes.dex */
class C4722ii extends AbstractC4699b1 {

    /* JADX INFO: renamed from: du */
    private C4738ne f13146du;

    /* JADX INFO: renamed from: h4 */
    private C4738ne f13147h4;

    /* JADX INFO: renamed from: k4 */
    private C4738ne f13148k4;

    /* JADX INFO: renamed from: kk */
    private C4738ne f13149kk;

    /* JADX INFO: renamed from: to */
    private C4738ne f13150to;

    /* JADX INFO: renamed from: x1 */
    private C4738ne f13151x1;

    public C4722ii(AbstractC4778yw abstractC4778yw, boolean z, byte[] bArr, byte[] bArr2) {
        super(abstractC4778yw, z, bArr2);
        bArr = bArr == null ? m19626du() : bArr;
        if (AbstractC4778yw.m19838k4(bArr)) {
            throw new CryptographicException(C12825ix.m59623k4("This is a known weak key."));
        }
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[8];
        byte[] bArr5 = new byte[8];
        AbstractC4745rv abstractC4745rvM19718kk = AbstractC4745rv.m19718kk();
        C14058fa.m66596k4(bArr, 0, bArr3, 0, 8);
        C14058fa.m66596k4(bArr, 8, bArr4, 0, 8);
        if (bArr.length == 16) {
            C14058fa.m66596k4(bArr, 0, bArr5, 0, 8);
        } else {
            C14058fa.m66596k4(bArr, 16, bArr5, 0, 8);
        }
        if (z || abstractC4778yw.m19684fa() == 4) {
            this.f13148k4 = new C4738ne(abstractC4745rvM19718kk, true, bArr3, bArr2);
            this.f13151x1 = new C4738ne(abstractC4745rvM19718kk, false, bArr4, bArr2);
            this.f13149kk = new C4738ne(abstractC4745rvM19718kk, true, bArr5, bArr2);
        } else {
            this.f13150to = new C4738ne(abstractC4745rvM19718kk, false, bArr5, bArr2);
            this.f13146du = new C4738ne(abstractC4745rvM19718kk, true, bArr4, bArr2);
            this.f13147h4 = new C4738ne(abstractC4745rvM19718kk, false, bArr3, bArr2);
        }
    }

    /* JADX INFO: renamed from: du */
    public static byte[] m19626du() {
        byte[] bArrM59721k4;
        int i = C4738ne.f13236to * 3;
        do {
            bArrM59721k4 = C12843x6.m59721k4(i);
        } while (AbstractC4778yw.m19838k4(bArrM59721k4));
        return bArrM59721k4;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4699b1
    /* JADX INFO: renamed from: x1 */
    public void mo19569x1(byte[] bArr, byte[] bArr2) {
        C4738ne c4738ne;
        C4738ne.m19706k4(bArr, bArr2, C4738ne.f13230du, false);
        if (this.f13113up) {
            this.f13148k4.m19709k4(bArr2, bArr2);
            this.f13151x1.m19709k4(bArr2, bArr2);
            c4738ne = this.f13149kk;
        } else {
            this.f13150to.m19709k4(bArr2, bArr2);
            this.f13146du.m19709k4(bArr2, bArr2);
            c4738ne = this.f13147h4;
        }
        c4738ne.m19709k4(bArr2, bArr2);
        C4738ne.m19706k4(bArr2, bArr2, C4738ne.f13231h4, true);
    }
}
