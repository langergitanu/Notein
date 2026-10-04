package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6467up extends AbstractC6416c5 {
    public C6467up(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            for (int i10 = 0; i10 < i3; i10++) {
                int i11 = ((int) ((((double) (bArr[(i10 * 2) + i8] & 255)) / 8.225806451612904d) + 0.5d)) & 31;
                int i12 = (i11 << 10) | (i11 << 5) | i11;
                int i13 = i9 + 1;
                bArr2[i9] = (byte) (i12 & 255);
                i9 += 2;
                bArr2[i13] = (byte) ((i12 & 65280) >> 8);
            }
        }
    }
}
