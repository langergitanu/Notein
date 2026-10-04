package com.aspose.slides.internal.p174hz;

import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14060gf;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.x5 */
/* JADX INFO: loaded from: classes.dex */
public class C4767x5 extends AbstractC4718gk {

    /* JADX INFO: renamed from: du */
    private C14060gf f13328du;

    /* JADX INFO: renamed from: m9 */
    private int f13332m9;

    /* JADX INFO: renamed from: k4 */
    private long[] f13331k4 = new long[8];

    /* JADX INFO: renamed from: h4 */
    private byte[] f13330h4 = new byte[64];

    /* JADX INFO: renamed from: dy */
    private long[] f13329dy = new long[64];

    public C4767x5() {
        mo18846c5();
    }

    /* JADX INFO: renamed from: to */
    private void m19819to(byte[] bArr, int i, int i2) {
        C14060gf c14060gfM66617to = C14060gf.m66617to(this.f13328du, new C14060gf(String.valueOf(i2)));
        C14060gf c14060gf = new C14060gf(String.valueOf(64));
        int i3 = Integer.parseInt(C14060gf.m66604du(c14060gfM66617to, C14060gf.m66606h4(c14060gf, new C14060gf(Integer.valueOf(Float.valueOf(C14060gf.m66616m9(c14060gfM66617to, c14060gf).toString()).intValue()).toString()))).toString());
        int i4 = 56 - i3;
        if (i4 < 1) {
            i4 = 120 - i3;
        }
        int i5 = i4 + i2;
        int i6 = i5 + 8;
        byte[] bArr2 = new byte[i6];
        if (i2 >= 0) {
            System.arraycopy(bArr, i, bArr2, 0, i2);
        }
        bArr2[i2] = UnsignedBytes.MAX_POWER_OF_TWO;
        for (int i7 = i2 + 1; i7 < i5; i7++) {
            bArr2[i7] = 0;
        }
        m19820k4(C14060gf.m66618x1(c14060gfM66617to, 3), bArr2, i5);
        m19818k4(bArr2, 0);
        if (i6 == 128) {
            m19818k4(bArr2, 64);
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        this.f13328du = new C14060gf("0");
        this.f13332m9 = 0;
        long[] jArr = this.f13331k4;
        jArr[0] = 1779033703;
        jArr[1] = 3144134277L;
        jArr[2] = 1013904242;
        jArr[3] = 2773480762L;
        jArr[4] = 1359893119;
        jArr[5] = 2600822924L;
        jArr[6] = 528734635;
        jArr[7] = 1541459225;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        byte[] bArr = new byte[32];
        m19819to(this.f13330h4, 0, this.f13332m9);
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                bArr[(i * 4) + i2] = (byte) ((this.f13331k4[i] & 4294967295L) >> (24 - (i2 * 8)));
            }
        }
        this.f13127to = 0;
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public void m19820k4(C14060gf c14060gf, byte[] bArr, int i) {
        bArr[i] = C14060gf.m66611k4(c14060gf, 56).byteValue();
        bArr[i + 1] = C14060gf.m66611k4(c14060gf, 48).byteValue();
        bArr[i + 2] = C14060gf.m66611k4(c14060gf, 40).byteValue();
        bArr[i + 3] = C14060gf.m66611k4(c14060gf, 32).byteValue();
        bArr[i + 4] = C14060gf.m66611k4(c14060gf, 24).byteValue();
        bArr[i + 5] = C14060gf.m66611k4(c14060gf, 16).byteValue();
        bArr[i + 6] = C14060gf.m66611k4(c14060gf, 8).byteValue();
        bArr[i + 7] = c14060gf.byteValue();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        this.f13127to = 1;
        int i5 = this.f13332m9;
        if (i5 != 0) {
            if (i2 < 64 - i5) {
                C14058fa.m66596k4(bArr, i, this.f13330h4, i5, i2);
                this.f13332m9 += i2;
                return;
            }
            int i6 = 64 - i5;
            C14058fa.m66596k4(bArr, i, this.f13330h4, i5, i6);
            m19818k4(this.f13330h4, 0);
            this.f13332m9 = 0;
            i += i6;
            i2 -= i6;
        }
        int i7 = 0;
        while (true) {
            i3 = i2 % 64;
            i4 = i2 - i3;
            if (i7 >= i4) {
                break;
            }
            m19818k4(bArr, i + i7);
            i7 += 64;
        }
        if (i3 != 0) {
            C14058fa.m66596k4(bArr, i4 + i, this.f13330h4, 0, i3);
            this.f13332m9 = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19818k4(byte[] bArr, int i) {
        int i2;
        char c;
        long[] jArr = C4776yn.f13362k4;
        long[] jArr2 = this.f13329dy;
        this.f13328du = C14060gf.m66617to(this.f13328du, new C14060gf(String.valueOf(64)));
        boolean z = false;
        int i3 = 0;
        while (true) {
            i2 = 16;
            if (i3 >= 16) {
                break;
            }
            int i4 = (i3 * 4) + i;
            jArr2[i3] = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8) | (bArr[i4 + 3] & 255);
            i3++;
        }
        while (true) {
            c = '\n';
            if (i2 >= 64) {
                break;
            }
            long j = jArr2[i2 - 15];
            long j2 = j & 4294967295L;
            long j3 = (((j2 >> 7) | ((j << 25) & 4294967295L)) ^ ((j2 >> 18) | ((j << 14) & 4294967295L))) ^ (j2 >> 3);
            long j4 = jArr2[i2 - 2];
            long j5 = j4 & 4294967295L;
            jArr2[i2] = (((((j5 >> 17) | ((j4 << 15) & 4294967295L)) ^ ((j5 >> 19) | ((j4 << 13) & 4294967295L))) ^ (j5 >> 10)) & 4294967295L) + (jArr2[i2 - 7] & 4294967295L) + (j3 & 4294967295L) + (jArr2[i2 - 16] & 4294967295L);
            i2++;
        }
        long[] jArr3 = this.f13331k4;
        long j6 = jArr3[0];
        long j7 = jArr3[1];
        long j8 = jArr3[2];
        long j9 = jArr3[3];
        long j10 = jArr3[4];
        long j11 = jArr3[5];
        long j12 = jArr3[6];
        long j13 = jArr3[7];
        int i5 = 0;
        while (i5 < 64) {
            boolean z2 = z;
            char c2 = c;
            long j14 = j10 & 4294967295L;
            long j15 = (j13 & 4294967295L) + ((((j14 >> 6) | ((j10 << 26) & 4294967295L)) ^ ((j14 >> 11) | ((j10 << 21) & 4294967295L))) ^ ((j14 >> 25) | ((j10 << 7) & 4294967295L))) + ((j14 & (j11 & 4294967295L)) ^ ((~j14) & (j12 & 4294967295L))) + (jArr[i5] & 4294967295L) + (jArr2[i5] & 4294967295L);
            long j16 = j6 & 4294967295L;
            long j17 = j7 & 4294967295L;
            long j18 = j8 & 4294967295L;
            long j19 = (((((j16 >> 2) | ((j6 << 30) & 4294967295L)) ^ ((j16 >> 13) | ((j6 << 19) & 4294967295L))) ^ ((j16 >> 22) | ((j6 << c2) & 4294967295L))) & 4294967295L) + (((j16 & j17) ^ (j16 & j18)) ^ (j17 & j18));
            long j20 = j9 & 4294967295L;
            long j21 = j15 & 4294967295L;
            long j22 = j20 + j21;
            i5++;
            long j23 = j7;
            j7 = j6;
            j6 = j21 + (j19 & 4294967295L);
            j9 = j8;
            j8 = j23;
            j13 = j12;
            j12 = j11;
            j11 = j10;
            j10 = j22;
            z = z2;
            c = c2;
        }
        boolean z3 = z;
        long[] jArr4 = this.f13331k4;
        jArr4[z3 ? 1 : 0] = (jArr4[z3 ? 1 : 0] & 4294967295L) + (j6 & 4294967295L);
        jArr4[1] = (jArr4[1] & 4294967295L) + (j7 & 4294967295L);
        jArr4[2] = (jArr4[2] & 4294967295L) + (j8 & 4294967295L);
        jArr4[3] = (jArr4[3] & 4294967295L) + (j9 & 4294967295L);
        jArr4[4] = (jArr4[4] & 4294967295L) + (j10 & 4294967295L);
        jArr4[5] = (jArr4[5] & 4294967295L) + (j11 & 4294967295L);
        jArr4[6] = (jArr4[6] & 4294967295L) + (j12 & 4294967295L);
        jArr4[7] = (jArr4[7] & 4294967295L) + (j13 & 4294967295L);
    }
}
