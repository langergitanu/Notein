package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p135fp.C4100ne;
import com.aspose.slides.internal.p225ke.C5666m9;
import com.aspose.slides.internal.p381rm.C10019k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.u1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6464u1 extends AbstractC6416c5 {

    /* JADX INFO: renamed from: ix */
    private int[] f18250ix;

    /* JADX INFO: renamed from: ks */
    private final C4100ne f18251ks;

    /* JADX INFO: renamed from: ne */
    private int[] f18252ne;

    /* JADX INFO: renamed from: rv */
    private int[] f18253rv;

    /* JADX INFO: renamed from: x6 */
    private int[] f18254x6;

    public C6464u1(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
        this.f18251ks = C10019k4.m49185h4();
        m26324k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static int m26323k4(double d) {
        return (int) ((d * 65536.0d) + 0.5d);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26324k4() {
        this.f18250ix = new int[256];
        this.f18253rv = new int[256];
        this.f18252ne = new int[256];
        this.f18254x6 = new int[256];
        int i = 0;
        int i2 = -128;
        while (i <= 255) {
            this.f18250ix[i] = C5666m9.m23128kk((m26323k4(1.402d) * i2) + 32768, 16);
            this.f18253rv[i] = C5666m9.m23128kk((m26323k4(1.772d) * i2) + 32768, 16);
            this.f18252ne[i] = (-m26323k4(0.71414d)) * i2;
            this.f18254x6[i] = ((-m26323k4(0.34414d)) * i2) + 32768;
            i++;
            i2++;
        }
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int iM16366k4 = this.f18251ks.m16366k4();
        byte[] bArrM16369x1 = this.f18251ks.m16369x1();
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (this.f18224jd * i7) + i;
            int i9 = (i7 * i6) + i5;
            for (int i10 = 0; i10 < i3; i10++) {
                byte b = bArr[i8];
                int i11 = i8 + 2;
                byte b2 = bArr[i8 + 1];
                i8 += 3;
                byte b3 = bArr[i11];
                int i12 = (b & 255) + iM16366k4;
                int i13 = b2 & 255;
                bArr2[i9] = bArrM16369x1[this.f18253rv[i13] + i12];
                int i14 = b3 & 255;
                bArr2[i9 + 1] = bArrM16369x1[C5666m9.m23128kk(this.f18254x6[i13] + this.f18252ne[i14], 16) + i12];
                int i15 = i9 + 3;
                bArr2[i9 + 2] = bArrM16369x1[i12 + this.f18250ix[i14]];
                i9 += 4;
                bArr2[i15] = -1;
            }
        }
    }
}
