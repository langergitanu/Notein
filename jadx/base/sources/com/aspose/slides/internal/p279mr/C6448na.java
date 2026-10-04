package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p135fp.C4100ne;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.na */
/* JADX INFO: loaded from: classes4.dex */
public class C6448na extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ix */
    private int[] f18244ix;

    /* JADX INFO: renamed from: ks */
    private final C4100ne f18245ks;

    /* JADX INFO: renamed from: ne */
    private int[] f18246ne;

    /* JADX INFO: renamed from: rv */
    private int[] f18247rv;

    /* JADX INFO: renamed from: x6 */
    private int[] f18248x6;

    public C6448na(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18245ks = C10019k4.m49185h4();
        m26322k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26321k4(double d) {
        return (int) ((d * 8192.0d) + 0.5d);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26322k4() {
        this.f18244ix = new int[256];
        this.f18247rv = new int[256];
        this.f18246ne = new int[256];
        this.f18248x6 = new int[256];
        int i = 0;
        int i2 = -128;
        while (i <= 255) {
            this.f18244ix[i] = C5666m9.m23128kk((m26321k4(1.402d) * i2) + 4096, 13);
            this.f18247rv[i] = C5666m9.m23128kk((m26321k4(1.772d) * i2) + 4096, 13);
            this.f18246ne[i] = (-m26321k4(0.71414d)) * i2;
            this.f18248x6[i] = ((-m26321k4(0.34414d)) * i2) + 4096;
            i++;
            i2++;
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int iM16366k4 = this.f18245ks.m16366k4();
        byte[] bArrM16369x1 = this.f18245ks.m16369x1();
        int i7 = 0;
        for (int i8 = 0; i8 < bArr.length; i8 += 3) {
            short s = (short) (bArr[i8] & 255);
            short s2 = (short) (bArr[i8 + 1] & 255);
            short s3 = (short) (bArr[i8 + 2] & 255);
            int i9 = s + iM16366k4;
            bArr2[i7] = bArrM16369x1[this.f18247rv[s2] + i9];
            int i10 = i7 + 2;
            bArr2[i7 + 1] = bArrM16369x1[C5666m9.m23128kk(this.f18248x6[s2] + this.f18246ne[s3], 13) + i9];
            i7 += 3;
            bArr2[i10] = bArrM16369x1[i9 + this.f18244ix[s3]];
        }
    }
}
