package com.aspose.slides.internal.p174hz;

import com.aspose.slides.p559ms.System.C14060gf;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.na */
/* JADX INFO: loaded from: classes.dex */
public class C4737na extends AbstractC4777yo {

    /* JADX INFO: renamed from: c5 */
    private C14060gf f13214c5;

    /* JADX INFO: renamed from: ck */
    private C14060gf f13215ck;

    /* JADX INFO: renamed from: du */
    private int f13216du;

    /* JADX INFO: renamed from: fa */
    private C14060gf f13218fa;

    /* JADX INFO: renamed from: jd */
    private C14060gf f13220jd;

    /* JADX INFO: renamed from: ks */
    private C14060gf f13222ks;

    /* JADX INFO: renamed from: ne */
    private int f13224ne;

    /* JADX INFO: renamed from: rv */
    private C14060gf f13225rv;

    /* JADX INFO: renamed from: up */
    private C14060gf f13226up;

    /* JADX INFO: renamed from: yj */
    private C14060gf f13228yj;

    /* JADX INFO: renamed from: h4 */
    private C14060gf f13219h4 = C14060gf.f47197k4;

    /* JADX INFO: renamed from: m9 */
    private C14060gf f13223m9 = new C14060gf("0");

    /* JADX INFO: renamed from: dy */
    private C14060gf f13217dy = new C14060gf("0");

    /* JADX INFO: renamed from: k4 */
    private byte[] f13221k4 = new byte[8];

    /* JADX INFO: renamed from: x6 */
    private C14060gf[] f13227x6 = new C14060gf[80];

    public C4737na() {
        for (int i = 0; i < 80; i++) {
            this.f13227x6[i] = new C14060gf("0");
        }
        m19703x1(false);
    }

    /* JADX INFO: renamed from: h4 */
    private void m19697h4() {
        if (C14060gf.m66607jd(this.f13223m9, new C14060gf("0x1fffffffffffffffL"))) {
            this.f13217dy = C14060gf.m66617to(this.f13217dy, C14060gf.m66611k4(this.f13223m9, 61));
            this.f13223m9 = C14060gf.m66612k4(this.f13223m9, new C14060gf("0x1fffffffffffffffL"));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19698k4(byte b) {
        byte[] bArr = this.f13221k4;
        int i = this.f13216du;
        int i2 = i + 1;
        this.f13216du = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            m19701k4(bArr, 0);
            this.f13216du = 0;
        }
        this.f13223m9 = C14060gf.m66614kk(this.f13223m9);
    }

    /* JADX INFO: renamed from: m9 */
    private void m19702m9() {
        int i;
        C14060gf[] c14060gfArr = this.f13227x6;
        C14060gf[] c14060gfArr2 = C4776yn.f13364to;
        m19697h4();
        int i2 = 16;
        while (true) {
            if (i2 > 79) {
                break;
            }
            C14060gf c14060gf = c14060gfArr[i2 - 15];
            C14060gf c14060gfM66612k4 = C14060gf.m66612k4(C14060gf.m66615kk(C14060gf.m66615kk(C14060gf.m66619x1(C14060gf.m66611k4(c14060gf, 1), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf, 63), this.f13219h4)), C14060gf.m66619x1(C14060gf.m66611k4(c14060gf, 8), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf, 56), this.f13219h4))), C14060gf.m66611k4(c14060gf, 7)), this.f13219h4);
            C14060gf c14060gf2 = c14060gfArr[i2 - 2];
            c14060gfArr[i2] = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66617to(C14060gf.m66612k4(C14060gf.m66615kk(C14060gf.m66615kk(C14060gf.m66619x1(C14060gf.m66611k4(c14060gf2, 19), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf2, 45), this.f13219h4)), C14060gf.m66619x1(C14060gf.m66611k4(c14060gf2, 61), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf2, 3), this.f13219h4))), C14060gf.m66611k4(c14060gf2, 6)), this.f13219h4), c14060gfArr[i2 - 7]), C14060gf.m66617to(c14060gfM66612k4, c14060gfArr[i2 - 16])), this.f13219h4);
            i2++;
        }
        C14060gf c14060gf3 = this.f13214c5;
        C14060gf c14060gf4 = this.f13220jd;
        C14060gf c14060gf5 = this.f13215ck;
        C14060gf c14060gf6 = this.f13218fa;
        C14060gf c14060gf7 = this.f13226up;
        C14060gf c14060gf8 = this.f13228yj;
        C14060gf c14060gf9 = this.f13222ks;
        C14060gf c14060gf10 = this.f13225rv;
        int i3 = 0;
        for (i = 79; i3 <= i; i = 79) {
            C14060gf c14060gfM66612k42 = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(C14060gf.m66615kk(C14060gf.m66615kk(C14060gf.m66619x1(C14060gf.m66611k4(c14060gf7, 14), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf7, 50), this.f13219h4)), C14060gf.m66619x1(C14060gf.m66611k4(c14060gf7, 18), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf7, 46), this.f13219h4))), C14060gf.m66619x1(C14060gf.m66611k4(c14060gf7, 41), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf7, 23), this.f13219h4))), this.f13219h4), C14060gf.m66617to(C14060gf.m66617to(c14060gf10, C14060gf.m66615kk(C14060gf.m66612k4(C14060gf.m66612k4(c14060gf7, this.f13219h4), C14060gf.m66612k4(c14060gf8, this.f13219h4)), C14060gf.m66612k4(C14060gf.m66615kk(c14060gf7, this.f13219h4), c14060gf9))), C14060gf.m66617to(C14060gf.m66612k4(c14060gfArr2[i3], this.f13219h4), C14060gf.m66612k4(c14060gfArr[i3], this.f13219h4)))), this.f13219h4);
            C14060gf c14060gfM66612k43 = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(C14060gf.m66615kk(C14060gf.m66615kk(C14060gf.m66619x1(C14060gf.m66611k4(c14060gf3, 28), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf3, 36), this.f13219h4)), C14060gf.m66619x1(C14060gf.m66611k4(c14060gf3, 34), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf3, 30), this.f13219h4))), C14060gf.m66619x1(C14060gf.m66611k4(c14060gf3, 39), C14060gf.m66612k4(C14060gf.m66618x1(c14060gf3, 25), this.f13219h4))), this.f13219h4), C14060gf.m66615kk(C14060gf.m66615kk(C14060gf.m66612k4(C14060gf.m66612k4(c14060gf3, this.f13219h4), C14060gf.m66612k4(c14060gf4, this.f13219h4)), C14060gf.m66612k4(C14060gf.m66612k4(c14060gf3, this.f13219h4), C14060gf.m66612k4(c14060gf5, this.f13219h4))), C14060gf.m66612k4(C14060gf.m66612k4(c14060gf4, this.f13219h4), C14060gf.m66612k4(c14060gf5, this.f13219h4)))), this.f13219h4);
            C14060gf c14060gfM66612k44 = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf6, this.f13219h4), C14060gf.m66612k4(c14060gfM66612k42, this.f13219h4)), this.f13219h4);
            C14060gf c14060gfM66612k45 = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gfM66612k42, this.f13219h4), C14060gf.m66612k4(c14060gfM66612k43, this.f13219h4)), this.f13219h4);
            i3++;
            c14060gf10 = c14060gf9;
            c14060gf9 = c14060gf8;
            c14060gf8 = c14060gf7;
            c14060gf7 = c14060gfM66612k44;
            c14060gf6 = c14060gf5;
            c14060gf5 = c14060gf4;
            c14060gf4 = c14060gf3;
            c14060gf3 = c14060gfM66612k45;
        }
        this.f13214c5 = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf3, this.f13219h4), C14060gf.m66612k4(this.f13214c5, this.f13219h4)), this.f13219h4);
        this.f13220jd = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf4, this.f13219h4), C14060gf.m66612k4(this.f13220jd, this.f13219h4)), this.f13219h4);
        this.f13215ck = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf5, this.f13219h4), C14060gf.m66612k4(this.f13215ck, this.f13219h4)), this.f13219h4);
        this.f13218fa = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf6, this.f13219h4), C14060gf.m66612k4(this.f13218fa, this.f13219h4)), this.f13219h4);
        this.f13226up = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf7, this.f13219h4), C14060gf.m66612k4(this.f13226up, this.f13219h4)), this.f13219h4);
        this.f13228yj = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf8, this.f13219h4), C14060gf.m66612k4(this.f13228yj, this.f13219h4)), this.f13219h4);
        this.f13222ks = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf9, this.f13219h4), C14060gf.m66612k4(this.f13222ks, this.f13219h4)), this.f13219h4);
        this.f13225rv = C14060gf.m66612k4(C14060gf.m66617to(C14060gf.m66612k4(c14060gf10, this.f13219h4), C14060gf.m66612k4(this.f13225rv, this.f13219h4)), this.f13219h4);
        this.f13224ne = 0;
        for (int i4 = 0; i4 != c14060gfArr.length; i4++) {
            c14060gfArr[i4] = new C14060gf("0");
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m19703x1(boolean z) {
        this.f13214c5 = new C14060gf("0xcbbb9d5dc1059ed8L");
        this.f13220jd = new C14060gf("0x629a292a367cd507L");
        this.f13215ck = new C14060gf("0x9159015a3070dd17L");
        this.f13218fa = new C14060gf("0x152fecd8f70e5939L");
        this.f13226up = new C14060gf("0x67332667ffc00b31L");
        this.f13228yj = new C14060gf("0x8eb44a8768581511L");
        this.f13222ks = new C14060gf("0xdb0c2e0d64f98fa7L");
        this.f13225rv = new C14060gf("0x47b5481dbefa4fa4L");
        if (!z) {
            return;
        }
        this.f13223m9 = new C14060gf("0");
        this.f13217dy = new C14060gf("0");
        int i = 0;
        this.f13216du = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f13221k4;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f13224ne = 0;
        while (true) {
            C14060gf[] c14060gfArr = this.f13227x6;
            if (i == c14060gfArr.length) {
                return;
            }
            c14060gfArr[i] = new C14060gf("0");
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        m19703x1(true);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        m19697h4();
        C14060gf c14060gfM66618x1 = C14060gf.m66618x1(this.f13223m9, 3);
        C14060gf c14060gf = this.f13217dy;
        m19698k4(UnsignedBytes.MAX_POWER_OF_TWO);
        while (this.f13216du != 0) {
            m19698k4((byte) 0);
        }
        m19699k4(c14060gfM66618x1, c14060gf);
        m19702m9();
        byte[] bArr = new byte[48];
        m19700k4(this.f13214c5, bArr, 0);
        m19700k4(this.f13220jd, bArr, 8);
        m19700k4(this.f13215ck, bArr, 16);
        m19700k4(this.f13218fa, bArr, 24);
        m19700k4(this.f13226up, bArr, 32);
        m19700k4(this.f13228yj, bArr, 40);
        mo18846c5();
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    private void m19699k4(C14060gf c14060gf, C14060gf c14060gf2) {
        if (this.f13224ne > 14) {
            m19702m9();
        }
        C14060gf[] c14060gfArr = this.f13227x6;
        c14060gfArr[14] = c14060gf2;
        c14060gfArr[15] = c14060gf;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        while (this.f13216du != 0 && i2 > 0) {
            m19698k4(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f13221k4.length) {
            m19701k4(bArr, i);
            byte[] bArr2 = this.f13221k4;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f13223m9 = C14060gf.m66617to(this.f13223m9, new C14060gf(String.valueOf(this.f13221k4.length)));
        }
        while (i2 > 0) {
            m19698k4(bArr[i]);
            i++;
            i2--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m19700k4(C14060gf c14060gf, byte[] bArr, int i) {
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
    private void m19701k4(byte[] bArr, int i) {
        C14060gf[] c14060gfArr = this.f13227x6;
        int i2 = this.f13224ne;
        this.f13224ne = i2 + 1;
        c14060gfArr[i2] = C14060gf.m66619x1(C14060gf.m66619x1(C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i] & 255)), 56), this.f13219h4), C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 1] & 255)), 48), this.f13219h4)), C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 2] & 255)), 40), this.f13219h4), C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 3] & 255)), 32), this.f13219h4))), C14060gf.m66619x1(C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 4] & 255)), 24), this.f13219h4), C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 5] & 255)), 16), this.f13219h4)), C14060gf.m66619x1(C14060gf.m66612k4(C14060gf.m66618x1(new C14060gf(String.valueOf(bArr[i + 6] & 255)), 8), this.f13219h4), C14060gf.m66612k4(new C14060gf(String.valueOf(bArr[i + 7] & 255)), this.f13219h4))));
        if (this.f13224ne == 16) {
            m19702m9();
        }
    }
}
