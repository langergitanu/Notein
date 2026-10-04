package com.aspose.slides.internal.p279mr;

import OooO0O0.C20394OooO0Oo;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6431h4 extends AbstractC6416c5 {
    public C6431h4(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        this.f18222fa.m62786du();
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            for (int i10 = 0; i10 < i3; i10++) {
                double d = 1.0d - (((double) (bArr[i8] & 255)) / 255.0d);
                double d2 = 1.0d - (((double) (bArr[i8 + 1] & 255)) / 255.0d);
                int i11 = i8 + 3;
                double d3 = 1.0d - (((double) (bArr[i8 + 2] & 255)) / 255.0d);
                i8 += 4;
                double d4 = 1.0d - (1.0d - (((double) (bArr[i11] & 255)) / 255.0d));
                bArr2[i9] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, (1.0d - d) * 255.0d * d4));
                int i12 = i9 + 2;
                bArr2[i9 + 1] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, C20394OooO0Oo.OooO0O0(1.0d, d2, 255.0d, d4)));
                i9 += 3;
                bArr2[i12] = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, C20394OooO0Oo.OooO0O0(1.0d, d3, 255.0d, d4)));
            }
        }
    }
}
