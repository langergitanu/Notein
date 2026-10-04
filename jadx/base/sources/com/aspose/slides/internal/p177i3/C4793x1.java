package com.aspose.slides.internal.p177i3;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p016a8.C1305k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;
import com.aspose.slides.internal.p495x7.C12488wy;

/* JADX INFO: renamed from: com.aspose.slides.internal.i3.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4793x1 extends C12488wy {
    public C4793x1(C12009k4 c12009k4, C12083kk c12083kk, C3983k4 c3983k4) {
        super(c12009k4, c12083kk, c3983k4);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12473kk, com.aspose.slides.internal.p495x7.AbstractC12480to
    /* JADX INFO: renamed from: k4 */
    public void mo19869k4() {
        byte[] bArrM58038up = m58038up();
        byte[] bArrM56953m9 = m56953m9();
        if (this.f40616du == 0 && this.f40618h4 == 0 && this.f40621m9 == m56954to().mo11975du() && this.f40617dy == m56954to().mo11978h4()) {
            m19868k4(bArrM58038up, bArrM56953m9, 0, 0, this.f40621m9 * this.f40617dy);
            return;
        }
        int iMo11975du = m56954to().mo11975du() * 4;
        int i = this.f40621m9 * 4;
        int i2 = (this.f40618h4 * iMo11975du) + (this.f40616du * 4);
        int i3 = 0;
        for (int i4 = 0; i4 < this.f40617dy; i4++) {
            m19868k4(bArrM58038up, bArrM56953m9, i3, i2, this.f40621m9);
            i2 += iMo11975du;
            i3 += this.f40620kk + i;
        }
    }

    @Override // com.aspose.slides.internal.p495x7.C12488wy, com.aspose.slides.internal.p495x7.AbstractC12473kk
    /* JADX INFO: renamed from: x1 */
    public C1305k4.k4 mo19870x1() {
        throw new InvalidOperationException("This method must not be called!");
    }

    /* JADX INFO: renamed from: k4 */
    private void m19868k4(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = bArr[i + 3] & 255;
            int i6 = bArr[i + 2] & 255;
            int i7 = bArr[i + 1] & 255;
            int i8 = bArr[i] & 255;
            int iRound = Math.round((i6 * i5) / 255.0f);
            int iRound2 = Math.round((i7 * i5) / 255.0f);
            int iRound3 = Math.round((i8 * i5) / 255.0f);
            bArr2[i2] = (byte) iRound;
            bArr2[i2 + 1] = (byte) iRound2;
            bArr2[i2 + 2] = (byte) iRound3;
            bArr2[i2 + 3] = (byte) i5;
            i += 4;
            i2 += 4;
        }
    }
}
