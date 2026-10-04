package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.fa */
/* JADX INFO: loaded from: classes4.dex */
public final class C6426fa extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    private final boolean f18240ks;

    public C6426fa(int i, int i2, int i3, C12014ne c12014ne, int i4, C13609qq c13609qq) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq, i4);
        this.f18240ks = this.f18220du == this.f18224jd;
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = (((i3 * this.f18230up) + i2) - 1) / 8;
        int i8 = i2 / 8;
        if (this.f18240ks && i4 > 1 && i8 == 0 && i7 == this.f18219ck) {
            System.arraycopy(bArr, i, bArr2, i5, i6 * i4);
            return;
        }
        int i9 = (i7 - i8) + 1;
        for (int i10 = 0; i10 < i4; i10++) {
            System.arraycopy(bArr, i, bArr2, (i10 * i6) + i5, i9);
            i += this.f18224jd;
        }
    }
}
