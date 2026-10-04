package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p135fp.C4100ne;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.yn */
/* JADX INFO: loaded from: classes4.dex */
public class C6487yn extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ix */
    private int[] f18270ix;

    /* JADX INFO: renamed from: ks */
    private final C4100ne f18271ks;

    /* JADX INFO: renamed from: ne */
    private int[] f18272ne;

    /* JADX INFO: renamed from: rv */
    private int[] f18273rv;

    /* JADX INFO: renamed from: x6 */
    private int[] f18274x6;

    public C6487yn(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18271ks = C10019k4.m49185h4();
        m26332k4();
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m26330k4(byte b, byte b2, byte b3) {
        float f = (((b3 & 255) - 128) * 1.402f) + (b & 255);
        return (byte) ((f < 0.0f ? 0 : f > 255.0f ? 255 : (int) (f + 0.5f)) & 255);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m26333kk(byte b, byte b2, byte b3) {
        float f = (((b2 & 255) - 128) * 1.772f) + (b & 255);
        return (byte) ((f < 0.0f ? 0 : f > 255.0f ? 255 : (int) (f + 0.5f)) & 255);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte m26334x1(byte b, byte b2, byte b3) {
        float f = ((b & 255) - (((b2 & 255) - 128) * 0.34414f)) - (((b3 & 255) - 128) * 0.71414f);
        return (byte) ((f < 0.0f ? 0 : f > 255.0f ? 255 : (int) (f + 0.5f)) & 255);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26331k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26332k4() {
        this.f18270ix = new int[256];
        this.f18273rv = new int[256];
        this.f18272ne = new int[256];
        this.f18274x6 = new int[256];
        int i = 0;
        int i2 = -128;
        while (i <= 255) {
            this.f18270ix[i] = C5666m9.m23128kk((m26331k4(1.402d) * i2) + 32768, 16);
            this.f18273rv[i] = C5666m9.m23128kk((m26331k4(1.772d) * i2) + 32768, 16);
            this.f18272ne[i] = (-m26331k4(0.71414d)) * i2;
            this.f18274x6[i] = ((-m26331k4(0.34414d)) * i2) + 32768;
            i++;
            i2++;
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int iM16366k4 = this.f18271ks.m16366k4();
        byte[] bArrM16369x1 = this.f18271ks.m16369x1();
        int i7 = 0;
        for (int i8 = 0; i8 < bArr.length; i8 += 3) {
            short s = (short) (bArr[i8] & 255);
            short s2 = (short) (bArr[i8 + 1] & 255);
            short s3 = (short) (bArr[i8 + 2] & 255);
            int i9 = s + iM16366k4;
            bArr2[i7] = bArrM16369x1[this.f18270ix[s3] + i9];
            bArr2[i7 + 1] = bArrM16369x1[C5666m9.m23128kk(this.f18274x6[s2] + this.f18272ne[s3], 16) + i9];
            int i10 = i7 + 3;
            bArr2[i7 + 2] = bArrM16369x1[i9 + this.f18273rv[s2]];
            i7 += 4;
            bArr2[i10] = -1;
        }
    }
}
