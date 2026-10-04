package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;
import com.aspose.slides.internal.p556zr.C13633x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.h4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12469h4 extends AbstractC12489x1 {
    public AbstractC12469h4(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m58025k4(byte b) {
        byte[] bArr = new byte[2];
        int iM62948k4 = C13633x1.m62948k4(b);
        if (iM62948k4 > 255) {
            bArr[0] = (byte) (iM62948k4 & 255);
            bArr[1] = (byte) ((iM62948k4 >> 8) & 255);
            return bArr;
        }
        bArr[0] = (byte) (iM62948k4 & 255);
        bArr[1] = 0;
        return bArr;
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: kk */
    public int mo58020kk(int i) {
        return i;
    }
}
