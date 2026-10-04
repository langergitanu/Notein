package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.my */
/* JADX INFO: loaded from: classes4.dex */
public class C6447my extends AbstractC6416c5 {
    public C6447my(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        this.f18222fa.m62786du();
        int i7 = 0;
        while (i7 < i4) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            int i10 = 0;
            while (i10 < i3) {
                byte b = bArr[i8];
                byte b2 = bArr[i8 + 1];
                byte b3 = bArr[i8 + 2];
                byte b4 = bArr[i8 + 3];
                double d = b & 255;
                double d2 = b3 & 255;
                double d3 = b2 & 255;
                bArr2[i9] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, 255.0d - (((1.402d * d2) + d) - 179.456d)));
                bArr2[i9 + 1] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, 255.0d - (((d - (0.34414d * d3)) - (d2 * 0.71414d)) + 135.45984d)));
                int i11 = i9 + 3;
                bArr2[i9 + 2] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, 255.0d - (((d3 * 1.7718d) + d) - 226.816d)));
                i9 += 4;
                bArr2[i11] = b4;
                i10++;
                i7 = i7;
                i8 += 4;
            }
            i7++;
        }
    }
}
