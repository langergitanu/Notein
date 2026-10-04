package com.aspose.slides.internal.p174hz;

import com.aspose.slides.p559ms.System.C14060gf;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.u1 */
/* JADX INFO: loaded from: classes.dex */
public class C4753u1 extends AbstractC4765wz {

    /* JADX INFO: renamed from: c5 */
    private C14060gf f13263c5;

    /* JADX INFO: renamed from: ck */
    private C14060gf f13264ck;

    /* JADX INFO: renamed from: du */
    private int f13265du;

    /* JADX INFO: renamed from: fa */
    private C14060gf f13267fa;

    /* JADX INFO: renamed from: jd */
    private C14060gf f13269jd;

    /* JADX INFO: renamed from: ks */
    private C14060gf f13271ks;

    /* JADX INFO: renamed from: ne */
    private int f13273ne;

    /* JADX INFO: renamed from: rv */
    private C14060gf f13274rv;

    /* JADX INFO: renamed from: up */
    private C14060gf f13275up;

    /* JADX INFO: renamed from: yj */
    private C14060gf f13277yj;

    /* JADX INFO: renamed from: h4 */
    private C14060gf f13268h4 = C14060gf.f47197k4;

    /* JADX INFO: renamed from: m9 */
    private C14060gf f13272m9 = new C14060gf("0");

    /* JADX INFO: renamed from: dy */
    private C14060gf f13266dy = new C14060gf("0");

    /* JADX INFO: renamed from: k4 */
    private byte[] f13270k4 = new byte[8];

    /* JADX INFO: renamed from: x6 */
    private C14060gf[] f13276x6 = new C14060gf[80];

    public C4753u1() {
        for (int i = 0; i < 80; i++) {
            this.f13276x6[i] = new C14060gf("0");
        }
        m19755x1(false);
    }

    /* JADX INFO: renamed from: h4 */
    private void m19742h4() {
        if (C14060gf.m66607jd(this.f13272m9, new C14060gf("0x1fffffffffffffffL"))) {
            this.f13266dy = C14060gf.m66617to(this.f13266dy, C14060gf.m66611k4(this.f13272m9, 61));
            this.f13272m9 = C14060gf.m66612k4(this.f13272m9, new C14060gf("0x1fffffffffffffffL"));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C14060gf m19743k4(C14060gf c14060gf) {
        return C14060gf.m66615kk(C14060gf.m66615kk(m19744k4(c14060gf, 28), m19744k4(c14060gf, 34)), m19744k4(c14060gf, 39));
    }

    /* JADX INFO: renamed from: kk */
    private C14060gf m19750kk(C14060gf c14060gf) {
        return C14060gf.m66615kk(C14060gf.m66615kk(m19744k4(c14060gf, 1), m19744k4(c14060gf, 8)), C14060gf.m66611k4(c14060gf, 7));
    }

    /* JADX INFO: renamed from: m9 */
    private void m19751m9() {
        m19742h4();
        for (int i = 16; i <= 79; i++) {
            C14060gf[] c14060gfArr = this.f13276x6;
            c14060gfArr[i] = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66617to(m19752to(c14060gfArr[i - 2]), this.f13276x6[i - 7]), C14060gf.m66617to(m19750kk(this.f13276x6[i - 15]), this.f13276x6[i - 16])), this.f13268h4);
        }
        C14060gf c14060gfM66612k4 = this.f13263c5;
        C14060gf c14060gf = this.f13269jd;
        C14060gf c14060gf2 = this.f13264ck;
        C14060gf c14060gf3 = this.f13267fa;
        C14060gf c14060gf4 = this.f13275up;
        C14060gf c14060gf5 = this.f13277yj;
        C14060gf c14060gf6 = this.f13271ks;
        C14060gf c14060gf7 = this.f13274rv;
        int i2 = 0;
        int i3 = 0;
        while (i3 <= 79) {
            C14060gf c14060gfM66612k42 = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66617to(C14060gf.m66617to(c14060gf7, m19753x1(c14060gf4)), C14060gf.m66617to(m19745k4(c14060gf4, c14060gf5, c14060gf6), C4776yn.f13364to[i3])), this.f13276x6[i3]), this.f13268h4);
            C14060gf c14060gfM66612k43 = C14060gf.m66612k4(C14060gf.m66617to(m19743k4(c14060gfM66612k4), m19754x1(c14060gfM66612k4, c14060gf, c14060gf2)), this.f13268h4);
            C14060gf c14060gfM66612k44 = C14060gf.m66612k4(C14060gf.m66617to(c14060gf3, c14060gfM66612k42), this.f13268h4);
            i3++;
            C14060gf c14060gf8 = c14060gf;
            c14060gf = c14060gfM66612k4;
            c14060gfM66612k4 = C14060gf.m66612k4(C14060gf.m66617to(c14060gfM66612k42, c14060gfM66612k43), this.f13268h4);
            c14060gf7 = c14060gf6;
            c14060gf6 = c14060gf5;
            c14060gf5 = c14060gf4;
            c14060gf4 = c14060gfM66612k44;
            c14060gf3 = c14060gf2;
            c14060gf2 = c14060gf8;
        }
        this.f13263c5 = C14060gf.m66612k4(C14060gf.m66617to(this.f13263c5, c14060gfM66612k4), this.f13268h4);
        this.f13269jd = C14060gf.m66612k4(C14060gf.m66617to(this.f13269jd, c14060gf), this.f13268h4);
        this.f13264ck = C14060gf.m66612k4(C14060gf.m66617to(this.f13264ck, c14060gf2), this.f13268h4);
        this.f13267fa = C14060gf.m66612k4(C14060gf.m66617to(this.f13267fa, c14060gf3), this.f13268h4);
        this.f13275up = C14060gf.m66612k4(C14060gf.m66617to(this.f13275up, c14060gf4), this.f13268h4);
        this.f13277yj = C14060gf.m66612k4(C14060gf.m66617to(this.f13277yj, c14060gf5), this.f13268h4);
        this.f13271ks = C14060gf.m66612k4(C14060gf.m66617to(this.f13271ks, c14060gf6), this.f13268h4);
        this.f13274rv = C14060gf.m66612k4(C14060gf.m66617to(this.f13274rv, c14060gf7), this.f13268h4);
        this.f13273ne = 0;
        while (true) {
            C14060gf[] c14060gfArr2 = this.f13276x6;
            if (i2 == c14060gfArr2.length) {
                return;
            }
            c14060gfArr2[i2] = new C14060gf("0");
            i2++;
        }
    }

    /* JADX INFO: renamed from: to */
    private C14060gf m19752to(C14060gf c14060gf) {
        return C14060gf.m66615kk(C14060gf.m66615kk(m19744k4(c14060gf, 19), m19744k4(c14060gf, 61)), C14060gf.m66611k4(c14060gf, 6));
    }

    /* JADX INFO: renamed from: x1 */
    private C14060gf m19753x1(C14060gf c14060gf) {
        return C14060gf.m66615kk(C14060gf.m66615kk(m19744k4(c14060gf, 14), m19744k4(c14060gf, 18)), m19744k4(c14060gf, 41));
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        m19755x1(true);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        m19742h4();
        C14060gf c14060gfM66618x1 = C14060gf.m66618x1(this.f13272m9, 3);
        C14060gf c14060gf = this.f13266dy;
        m19746k4(UnsignedBytes.MAX_POWER_OF_TWO);
        while (this.f13265du != 0) {
            m19746k4((byte) 0);
        }
        m19747k4(c14060gfM66618x1, c14060gf);
        m19751m9();
        byte[] bArr = new byte[64];
        m19748k4(this.f13263c5, bArr, 0);
        m19748k4(this.f13269jd, bArr, 8);
        m19748k4(this.f13264ck, bArr, 16);
        m19748k4(this.f13267fa, bArr, 24);
        m19748k4(this.f13275up, bArr, 32);
        m19748k4(this.f13277yj, bArr, 40);
        m19748k4(this.f13271ks, bArr, 48);
        m19748k4(this.f13274rv, bArr, 56);
        mo18846c5();
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private C14060gf m19744k4(C14060gf c14060gf, int i) {
        return C14060gf.m66612k4(C14060gf.m66619x1(C14060gf.m66611k4(c14060gf, i), C14060gf.m66618x1(c14060gf, 64 - i)), this.f13268h4);
    }

    /* JADX INFO: renamed from: x1 */
    private C14060gf m19754x1(C14060gf c14060gf, C14060gf c14060gf2, C14060gf c14060gf3) {
        return C14060gf.m66615kk(C14060gf.m66615kk(C14060gf.m66612k4(c14060gf, c14060gf2), C14060gf.m66612k4(c14060gf, c14060gf3)), C14060gf.m66612k4(c14060gf2, c14060gf3));
    }

    /* JADX INFO: renamed from: k4 */
    private C14060gf m19745k4(C14060gf c14060gf, C14060gf c14060gf2, C14060gf c14060gf3) {
        return C14060gf.m66615kk(C14060gf.m66612k4(c14060gf, c14060gf2), C14060gf.m66612k4(C14060gf.m66615kk(c14060gf, this.f13268h4), c14060gf3));
    }

    /* JADX INFO: renamed from: x1 */
    private void m19755x1(boolean z) {
        this.f13263c5 = new C14060gf("0x6a09e667f3bcc908L");
        this.f13269jd = new C14060gf("0xbb67ae8584caa73bL");
        this.f13264ck = new C14060gf("0x3c6ef372fe94f82bL");
        this.f13267fa = new C14060gf("0xa54ff53a5f1d36f1L");
        this.f13275up = new C14060gf("0x510e527fade682d1L");
        this.f13277yj = new C14060gf("0x9b05688c2b3e6c1fL");
        this.f13271ks = new C14060gf("0x1f83d9abfb41bd6bL");
        this.f13274rv = new C14060gf("0x5be0cd19137e2179L");
        if (!z) {
            return;
        }
        this.f13272m9 = new C14060gf("0");
        this.f13266dy = new C14060gf("0");
        int i = 0;
        this.f13265du = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f13270k4;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f13273ne = 0;
        while (true) {
            C14060gf[] c14060gfArr = this.f13276x6;
            if (i == c14060gfArr.length) {
                return;
            }
            c14060gfArr[i] = new C14060gf("0");
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19746k4(byte b) {
        byte[] bArr = this.f13270k4;
        int i = this.f13265du;
        int i2 = i + 1;
        this.f13265du = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            m19749k4(bArr, 0);
            this.f13265du = 0;
        }
        this.f13272m9 = C14060gf.m66614kk(this.f13272m9);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        while (this.f13265du != 0 && i2 > 0) {
            m19746k4(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f13270k4.length) {
            m19749k4(bArr, i);
            byte[] bArr2 = this.f13270k4;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f13272m9 = C14060gf.m66617to(this.f13272m9, new C14060gf(String.valueOf(this.f13270k4.length)));
        }
        while (i2 > 0) {
            m19746k4(bArr[i]);
            i++;
            i2--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19747k4(C14060gf c14060gf, C14060gf c14060gf2) {
        if (this.f13273ne > 14) {
            m19751m9();
        }
        C14060gf[] c14060gfArr = this.f13276x6;
        c14060gfArr[14] = c14060gf2;
        c14060gfArr[15] = c14060gf;
    }

    /* JADX INFO: renamed from: k4 */
    private void m19748k4(C14060gf c14060gf, byte[] bArr, int i) {
        bArr[i] = C14060gf.m66611k4(c14060gf, 56).byteValue();
        bArr[i + 1] = C14060gf.m66611k4(c14060gf, 48).byteValue();
        bArr[i + 2] = C14060gf.m66611k4(c14060gf, 40).byteValue();
        bArr[i + 3] = C14060gf.m66611k4(c14060gf, 32).byteValue();
        bArr[i + 4] = C14060gf.m66611k4(c14060gf, 24).byteValue();
        bArr[i + 5] = C14060gf.m66611k4(c14060gf, 16).byteValue();
        bArr[i + 6] = C14060gf.m66611k4(c14060gf, 8).byteValue();
        bArr[i + 7] = c14060gf.byteValue();
    }

    /* JADX INFO: renamed from: k4 */
    private void m19749k4(byte[] bArr, int i) {
        C14060gf[] c14060gfArr = this.f13276x6;
        int i2 = this.f13273ne;
        this.f13273ne = i2 + 1;
        c14060gfArr[i2] = C14060gf.m66619x1(C14060gf.m66619x1(C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i] & 255)), 56), this.f13268h4), C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 1] & 255)), 48), this.f13268h4)), C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 2] & 255)), 40), this.f13268h4), C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 3] & 255)), 32), this.f13268h4))), C14060gf.m66619x1(C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 4] & 255)), 24), this.f13268h4), C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 5] & 255)), 16), this.f13268h4)), C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 6] & 255)), 8), this.f13268h4), C14060gf.m66612k4(new C14060gf(String.valueOf(bArr[i + 7] & 255)), this.f13268h4))));
        if (this.f13273ne == 16) {
            m19751m9();
        }
    }
}
