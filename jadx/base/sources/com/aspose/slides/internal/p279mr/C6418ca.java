package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.ca */
/* JADX INFO: loaded from: classes4.dex */
public class C6418ca extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    private final int[] f18236ks;

    public C6418ca(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18236ks = new int[2048];
        for (int i5 = 0; i5 <= 255; i5++) {
            this.f18236ks[i5] = m26314k4(0.299d) * i5;
            this.f18236ks[i5 + 256] = m26314k4(0.587d) * i5;
            this.f18236ks[i5 + 512] = (m26314k4(0.114d) * i5) + 32768;
            this.f18236ks[i5 + ViewUtils.EDGE_TO_EDGE_FLAGS] = (-m26314k4(0.16874d)) * i5;
            this.f18236ks[i5 + 1024] = (-m26314k4(0.33126d)) * i5;
            this.f18236ks[i5 + 1280] = (m26314k4(0.5d) * i5) + 8421375;
            this.f18236ks[i5 + TableStyleOptions.DEFAULT_2003] = (-m26314k4(0.41869d)) * i5;
            this.f18236ks[i5 + 1792] = (-m26314k4(0.08131d)) * i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26314k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            for (int i10 = 0; i10 < i3; i10++) {
                byte b = bArr[i8];
                byte b2 = bArr[i8 + 1];
                byte b3 = bArr[i8 + 2];
                i8 += 4;
                int[] iArr = this.f18236ks;
                int i11 = b3 & 255;
                int i12 = b2 & 255;
                int i13 = b & 255;
                bArr2[i9] = (byte) (((iArr[i11] + iArr[i12 + 256]) + iArr[i13 + 512]) >> 16);
                int i14 = i9 + 2;
                bArr2[i9 + 1] = (byte) (((iArr[i11 + ViewUtils.EDGE_TO_EDGE_FLAGS] + iArr[i12 + 1024]) + iArr[i13 + 1280]) >> 16);
                i9 += 3;
                bArr2[i14] = (byte) (((iArr[i11 + 1280] + iArr[i12 + TableStyleOptions.DEFAULT_2003]) + iArr[i13 + 1792]) >> 16);
            }
        }
    }
}
