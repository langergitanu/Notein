package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.w6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6472w6 extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    private final int[] f18256ks;

    public C6472w6(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18256ks = new int[2048];
        for (int i5 = 0; i5 <= 255; i5++) {
            this.f18256ks[i5] = m26325k4(0.299d) * i5;
            this.f18256ks[i5 + 256] = m26325k4(0.587d) * i5;
            this.f18256ks[i5 + 512] = (m26325k4(0.114d) * i5) + 32768;
            this.f18256ks[i5 + ViewUtils.EDGE_TO_EDGE_FLAGS] = (-m26325k4(0.16874d)) * i5;
            this.f18256ks[i5 + 1024] = (-m26325k4(0.33126d)) * i5;
            this.f18256ks[i5 + 1280] = (m26325k4(0.5d) * i5) + 8421375;
            this.f18256ks[i5 + TableStyleOptions.DEFAULT_2003] = (-m26325k4(0.41869d)) * i5;
            this.f18256ks[i5 + 1792] = (-m26325k4(0.08131d)) * i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26325k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = this.f18224jd * i8;
            for (int i10 = 0; i10 < i3; i10++) {
                byte b = bArr[i9];
                int i11 = i9 + 2;
                byte b2 = bArr[i9 + 1];
                i9 += 3;
                byte b3 = bArr[i11];
                int[] iArr = this.f18256ks;
                int i12 = b3 & 255;
                int i13 = b2 & 255;
                int i14 = b & 255;
                bArr2[i7] = (byte) (((iArr[i12] + iArr[i13 + 256]) + iArr[i14 + 512]) >> 16);
                int i15 = i7 + 2;
                bArr2[i7 + 1] = (byte) (((iArr[i12 + ViewUtils.EDGE_TO_EDGE_FLAGS] + iArr[i13 + 1024]) + iArr[i14 + 1280]) >> 16);
                i7 += 3;
                bArr2[i15] = (byte) (((iArr[i12 + 1280] + iArr[i13 + TableStyleOptions.DEFAULT_2003]) + iArr[i14 + 1792]) >> 16);
            }
        }
    }
}
