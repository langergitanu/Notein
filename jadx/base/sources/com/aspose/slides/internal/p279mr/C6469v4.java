package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.v4 */
/* JADX INFO: loaded from: classes4.dex */
class C6469v4 extends AbstractC6410ak {
    public C6469v4(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4, InterfaceC6901du interfaceC6901du) {
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
                double d = ((double) (((byte) ((iArr[(i2 >> (8 - (this.f18230up * i3))) & this.f18205ne] >> 16) & 255)) & 255)) * 0.2126d;
                byte b = (byte) ((((double) (((byte) (r7 & 255)) & 255)) * 0.0722d) + (((double) (((byte) ((r7 >> 8) & 255)) & 255)) * 0.7152d) + d);
                byte[] bArr2 = bArr[i2];
                bArr2[i4] = b;
                int i5 = i4 + 2;
                bArr2[i4 + 1] = b;
                i4 += 3;
                bArr2[i5] = b;
            }
        }
        return bArr;
    }
}
