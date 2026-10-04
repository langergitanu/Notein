package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.lr */
/* JADX INFO: loaded from: classes4.dex */
public class C6443lr extends AbstractC6410ak {
    public C6443lr(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4, interfaceC6901du);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6410ak
    /* JADX INFO: renamed from: k4 */
    public byte[][] mo26308k4(int[] iArr) {
        byte[][] bArr = new byte[256][];
        int i = ((AbstractC6410ak) this).f18204ks * this.f18208x6;
        for (int i2 = 0; i2 < 256; i2++) {
            bArr[i2] = new byte[i];
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.f18208x6) {
                i3++;
                int i5 = iArr[(i2 >> (8 - (this.f18230up * i3))) & this.f18205ne];
                int i6 = (((int) ((((double) (i5 & 255)) / 8.225806451612904d) + 0.5d)) & 31) | ((((int) ((((double) ((i5 >> 8) & 255)) / 8.225806451612904d) + 0.5d)) & 31) << 5) | ((((int) ((((double) ((i5 >> 16) & 255)) / 8.225806451612904d) + 0.5d)) & 31) << 10);
                byte[] bArr2 = bArr[i2];
                int i7 = i4 + 1;
                bArr2[i4] = (byte) (i6 & 255);
                i4 += 2;
                bArr2[i7] = (byte) ((i6 & 65280) >> 8);
            }
        }
        return bArr;
    }
}
