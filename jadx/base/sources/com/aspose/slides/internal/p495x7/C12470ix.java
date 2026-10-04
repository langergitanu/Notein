package com.aspose.slides.internal.p495x7;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12470ix extends C12477ne {
    public C12470ix(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    @Override // com.aspose.slides.internal.p495x7.C12477ne, com.aspose.slides.internal.p495x7.AbstractC12489x1
    /* JADX INFO: renamed from: k4 */
    public C1305k4.k4 mo19866k4() {
        throw new InvalidOperationException("This method must not be called!");
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12489x1, com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo19867k4(byte[] bArr) {
        byte[] bArrM56953m9 = m56953m9();
        if (this.f40616du == 0 && this.f40618h4 == 0 && this.f40621m9 == m56954to().mo11975du() && this.f40617dy == m56954to().mo11978h4()) {
            m58026k4(bArrM56953m9, bArr, 0, 0, this.f40621m9 * this.f40617dy);
            return;
        }
        int iMo11975du = m56954to().mo11975du() * 4;
        int i = this.f40621m9 * 4;
        int i2 = (this.f40618h4 * iMo11975du) + (this.f40616du * 4);
        int i3 = 0;
        for (int i4 = 0; i4 < this.f40617dy; i4++) {
            m58026k4(bArrM56953m9, bArr, i2, i3, this.f40621m9);
            i2 += iMo11975du;
            i3 += this.f40620kk + i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m58026k4(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2] = bArr[i + 2];
            bArr2[i2 + 1] = bArr[i + 1];
            bArr2[i2 + 2] = bArr[i];
            bArr2[i2 + 3] = bArr[i + 3];
            i += 4;
            i2 += 4;
        }
    }
}
