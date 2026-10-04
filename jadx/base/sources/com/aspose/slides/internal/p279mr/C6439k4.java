package com.aspose.slides.internal.p279mr;

import OooO0O0.C20394OooO0Oo;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6439k4 extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ks */
    private final int[] f18242ks;

    public C6439k4(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18242ks = new int[2048];
        for (int i5 = 0; i5 <= 255; i5++) {
            this.f18242ks[i5] = m26320k4(0.299d) * i5;
            this.f18242ks[i5 + 256] = m26320k4(0.587d) * i5;
            this.f18242ks[i5 + 512] = (m26320k4(0.114d) * i5) + 32768;
            this.f18242ks[i5 + ViewUtils.EDGE_TO_EDGE_FLAGS] = (-m26320k4(0.16874d)) * i5;
            this.f18242ks[i5 + 1024] = (-m26320k4(0.33126d)) * i5;
            this.f18242ks[i5 + 1280] = (m26320k4(0.5d) * i5) + 8421375;
            this.f18242ks[i5 + TableStyleOptions.DEFAULT_2003] = (-m26320k4(0.41869d)) * i5;
            this.f18242ks[i5 + 1792] = (-m26320k4(0.08131d)) * i5;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26320k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            for (int i10 = 0; i10 < i3; i10++) {
                int iM62786du = (this.f18222fa.m62786du() * i10) + i8;
                double d = 1.0d - (((double) (bArr[iM62786du] & 255)) / 255.0d);
                double d2 = 1.0d - (((double) (bArr[iM62786du + 1] & 255)) / 255.0d);
                double d3 = 1.0d - (((double) (bArr[iM62786du + 2] & 255)) / 255.0d);
                double d4 = 1.0d - (1.0d - (((double) (bArr[iM62786du + 3] & 255)) / 255.0d));
                byte bM67502x1 = (byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, (1.0d - d) * 255.0d * d4));
                int[] iArr = this.f18242ks;
                int i11 = bM67502x1 & 255;
                int iM67502x1 = ((byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, C20394OooO0Oo.OooO0O0(1.0d, d2, 255.0d, d4)))) & 255;
                int iM67502x12 = ((byte) C14116yg.m67502x1(0.0d, C14116yg.m67491kk(255.0d, C20394OooO0Oo.OooO0O0(1.0d, d3, 255.0d, d4)))) & 255;
                bArr2[i9] = (byte) (((iArr[i11] + iArr[iM67502x1 + 256]) + iArr[iM67502x12 + 512]) >> 16);
                int i12 = i9 + 2;
                bArr2[i9 + 1] = (byte) (((iArr[i11 + ViewUtils.EDGE_TO_EDGE_FLAGS] + iArr[iM67502x1 + 1024]) + iArr[iM67502x12 + 1280]) >> 16);
                i9 += 3;
                bArr2[i12] = (byte) (((iArr[i11 + 1280] + iArr[iM67502x1 + TableStyleOptions.DEFAULT_2003]) + iArr[iM67502x12 + 1792]) >> 16);
            }
        }
    }
}
