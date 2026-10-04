package com.aspose.slides.internal.p038bb;

import com.aspose.slides.internal.p135fp.AbstractC4092fa;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.bb.x1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1679x1 extends AbstractC4092fa {

    /* JADX INFO: renamed from: kk */
    private final int[] f6385kk;

    public C1679x1(InterfaceC6899c5 interfaceC6899c5) {
        this.f11178k4 = interfaceC6899c5;
        this.f11179x1 = C13609qq.m62784m9();
        this.f6385kk = new int[2048];
        for (int i = 0; i <= 255; i++) {
            this.f6385kk[i] = m9081k4(0.299d) * i;
            this.f6385kk[i + 256] = m9081k4(0.587d) * i;
            this.f6385kk[i + 512] = (m9081k4(0.114d) * i) + 32768;
            this.f6385kk[i + ViewUtils.EDGE_TO_EDGE_FLAGS] = (-m9081k4(0.16874d)) * i;
            this.f6385kk[i + 1024] = (-m9081k4(0.33126d)) * i;
            this.f6385kk[i + 1280] = (m9081k4(0.5d) * i) + 8421375;
            this.f6385kk[i + TableStyleOptions.DEFAULT_2003] = (-m9081k4(0.41869d)) * i;
            this.f6385kk[i + 1792] = (-m9081k4(0.08131d)) * i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m9081k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    @Override // com.aspose.slides.internal.p135fp.AbstractC4092fa
    /* JADX INFO: renamed from: k4 */
    public void mo9080k4(int[] iArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            int i3 = iArr[i];
            int[] iArr2 = this.f6385kk;
            bArr[i2] = (byte) (((iArr2[((byte) ((i3 >> 16) & 255)) & 255] + iArr2[(((byte) ((i3 >> 8) & 255)) & 255) + 256]) + iArr2[(((byte) (i3 & 255)) & 255) + 512]) >> 16);
            i++;
            i2++;
        }
    }
}
