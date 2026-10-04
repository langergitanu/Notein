package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.he */
/* JADX INFO: loaded from: classes4.dex */
public class C6432he extends AbstractC6416c5 {
    public C6432he(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        double d;
        double d2;
        double d3;
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
                int i11 = i8 + 4;
                double d4 = 1.0d - (((double) (b & 255)) / 255.0d);
                double d5 = 1.0d - (((double) (b2 & 255)) / 255.0d);
                double d6 = 1.0d - (((double) (b3 & 255)) / 255.0d);
                int i12 = i7;
                double dM67491kk = C14116yg.m67491kk(C14116yg.m67491kk(C14116yg.m67491kk(1.0d, d4), d5), d6);
                if (C14116yg.m67475k4(dM67491kk - 1.0d) < 0.001d) {
                    d2 = 0.0d;
                    d = 0.0d;
                    d3 = 0.0d;
                } else {
                    double d7 = 1.0d - dM67491kk;
                    d = (d4 - dM67491kk) / d7;
                    d2 = (d5 - dM67491kk) / d7;
                    d3 = (d6 - dM67491kk) / d7;
                }
                bArr2[i9] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, d * 255.0d));
                bArr2[i9 + 1] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, d2 * 255.0d));
                int i13 = i9 + 3;
                bArr2[i9 + 2] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, d3 * 255.0d));
                i9 += 4;
                bArr2[i13] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, dM67491kk * 255.0d));
                i10++;
                i7 = i12;
                i8 = i11;
            }
            i7++;
        }
    }
}
