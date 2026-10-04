package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.yg */
/* JADX INFO: loaded from: classes4.dex */
public class C6485yg extends AbstractC6416c5 {
    public C6485yg(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        float f;
        float f2;
        float f3;
        int i7 = 0;
        for (int i8 = 0; i8 < bArr.length; i8 += 3) {
            short s = (short) (bArr[i8] & 255);
            double d = s;
            double d2 = ((short) (bArr[i8 + 2] & 255)) - 128;
            double d3 = ((short) (bArr[i8 + 1] & 255)) - 128;
            float f4 = 1.0f - (((float) ((1.402d * d2) + d)) / 255.0f);
            float f5 = 1.0f - (((float) ((d - (0.34414d * d3)) - (d2 * 0.71414d))) / 255.0f);
            float f6 = 1.0f - (((float) ((d3 * 1.772d) + d)) / 255.0f);
            float fM67504x1 = C14116yg.m67504x1(C14116yg.m67504x1(C14116yg.m67504x1(1.0f, f4), f5), f6);
            if (C14116yg.m67480k4(fM67504x1 - 1.0f) < 0.001d) {
                f = 0.0f;
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                float f7 = 1.0f - fM67504x1;
                f = (f4 - fM67504x1) / f7;
                f2 = (f5 - fM67504x1) / f7;
                f3 = (f6 - fM67504x1) / f7;
            }
            float f8 = 1.0f - fM67504x1;
            bArr2[i7] = (byte) C14116yg.m67481k4(0.0f, C14116yg.m67504x1(255.0f, (1.0f - f) * 255.0f * f8));
            bArr2[i7 + 1] = (byte) C14116yg.m67481k4(0.0f, C14116yg.m67504x1(255.0f, (1.0f - f2) * 255.0f * f8));
            int i9 = i7 + 3;
            bArr2[i7 + 2] = (byte) C14116yg.m67481k4(0.0f, C14116yg.m67504x1(255.0f, (1.0f - f3) * 255.0f * f8));
            i7 += 4;
            bArr2[i9] = (byte) C14116yg.m67481k4(0.0f, C14116yg.m67504x1(255.0f, f8 * 255.0f));
        }
    }
}
