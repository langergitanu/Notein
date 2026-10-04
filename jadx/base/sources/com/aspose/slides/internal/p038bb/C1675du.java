package com.aspose.slides.internal.p038bb;

import com.aspose.slides.internal.p135fp.AbstractC4092fa;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.bb.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1675du extends AbstractC4092fa {

    /* JADX INFO: renamed from: kk */
    private final int[] f6383kk;

    public C1675du(InterfaceC6899c5 interfaceC6899c5) {
        this.f11178k4 = interfaceC6899c5;
        this.f11179x1 = C13609qq.m62782h4();
        this.f6383kk = new int[2048];
        for (int i = 0; i <= 255; i++) {
            this.f6383kk[i] = m9079k4(0.299d) * i;
            this.f6383kk[i + 256] = m9079k4(0.587d) * i;
            this.f6383kk[i + 512] = (m9079k4(0.114d) * i) + 32768;
            this.f6383kk[i + ViewUtils.EDGE_TO_EDGE_FLAGS] = (-m9079k4(0.16874d)) * i;
            this.f6383kk[i + 1024] = (-m9079k4(0.33126d)) * i;
            this.f6383kk[i + 1280] = (m9079k4(0.5d) * i) + 8421375;
            this.f6383kk[i + TableStyleOptions.DEFAULT_2003] = (-m9079k4(0.41869d)) * i;
            this.f6383kk[i + 1792] = (-m9079k4(0.08131d)) * i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m9079k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    @Override // com.aspose.slides.internal.p135fp.AbstractC4092fa
    /* JADX INFO: renamed from: k4 */
    public void mo9080k4(int[] iArr, byte[] bArr) {
        if (iArr.length * 3 != bArr.length) {
            throw new IllegalArgumentException("Cannot convert colors.");
        }
        int i = 0;
        for (int i2 : iArr) {
            int[] iArr2 = this.f6383kk;
            int i3 = ((byte) ((i2 >> 16) & 255)) & 255;
            int i4 = ((byte) ((i2 >> 8) & 255)) & 255;
            int i5 = ((byte) (i2 & 255)) & 255;
            bArr[i] = (byte) (((iArr2[i3] + iArr2[i4 + 256]) + iArr2[i5 + 512]) >> 16);
            int i6 = i + 2;
            bArr[i + 1] = (byte) (((iArr2[i3 + ViewUtils.EDGE_TO_EDGE_FLAGS] + iArr2[i4 + 1024]) + iArr2[i5 + 1280]) >> 16);
            i += 3;
            bArr[i6] = (byte) (((iArr2[i3 + 1280] + iArr2[i4 + TableStyleOptions.DEFAULT_2003]) + iArr2[i5 + 1792]) >> 16);
        }
    }
}
