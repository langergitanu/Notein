package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.u4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6465u4 extends AbstractC6416c5 {
    public C6465u4(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            for (int i10 = 0; i10 < i3; i10++) {
                double d = ((double) (bArr[i10 + i8] & 255)) / 255.0d;
                double dM67491kk = C14116yg.m67491kk(C14116yg.m67491kk(C14116yg.m67491kk(1.0d, d), d), d);
                double d2 = C14116yg.m67475k4(dM67491kk - 1.0d) < 0.001d ? 0.0d : (d - dM67491kk) / (1.0d - dM67491kk);
                bArr2[i9] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, r8 * 255.0d));
                bArr2[i9 + 1] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, d2 * 255.0d));
                int i11 = i9 + 3;
                bArr2[i9 + 2] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, d2 * 255.0d));
                i9 += 4;
                bArr2[i11] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, dM67491kk * 255.0d));
            }
        }
    }
}
