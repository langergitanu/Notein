package com.aspose.slides.internal.p407st;

import com.aspose.slides.InvalidPasswordException;
import com.aspose.slides.PptReadException;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p174hz.C4772y9;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.lv */
/* JADX INFO: loaded from: classes4.dex */
public class C10530lv {

    /* JADX INFO: renamed from: k4 */
    public C10686vz f37198k4;

    /* JADX INFO: renamed from: kk */
    public C10682vj f37199kk;

    /* JADX INFO: renamed from: to */
    public C10613qw f37200to;

    /* JADX INFO: renamed from: x1 */
    public long f37201x1;

    public C10530lv() {
        this.f37198k4 = new C10686vz();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m51223k4() {
        return this.f37199kk.m51866k4().m51853kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51227x1() {
        return this.f37199kk.m51858ck() + 12 + this.f37200to.m51609k4();
    }

    public C10530lv(String str) {
        this.f37198k4 = new C10686vz();
        C10686vz c10686vz = new C10686vz();
        this.f37198k4 = c10686vz;
        c10686vz.f37456k4 = 2;
        c10686vz.f37457x1 = 2;
        C10682vj c10682vj = new C10682vj();
        this.f37199kk = c10682vj;
        this.f37201x1 = c10682vj.m51865jd();
        this.f37200to = new C10613qw(str, this.f37199kk.m51859du());
    }

    /* JADX INFO: renamed from: k4 */
    public static C10530lv m51222k4(AbstractC3150x6 abstractC3150x6) {
        C10530lv c10530lv = new C10530lv();
        C10686vz.m51886k4(abstractC3150x6).CloneTo(c10530lv.f37198k4);
        C3110yd.m13255x1(abstractC3150x6);
        long jM13255x1 = ((long) C3110yd.m13255x1(abstractC3150x6)) & 4294967295L;
        c10530lv.f37201x1 = jM13255x1;
        c10530lv.f37199kk = C10682vj.m51856k4(abstractC3150x6, jM13255x1);
        c10530lv.f37200to = C10613qw.m51608k4(abstractC3150x6, 20);
        return c10530lv;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10603qc m51224k4(String str) {
        if (str.length() > 255) {
            throw new InvalidPasswordException("The password is too long.");
        }
        if (this.f37199kk.m51862fa()) {
            return new C10603qc(str, this.f37200to.f37337x1, this.f37199kk.m51859du());
        }
        throw new PptReadException("Unsupported cryptographic hash algorytm.");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51225k4(C3149x1 c3149x1) {
        this.f37198k4.m51889k4(c3149x1);
        c3149x1.m13455x1((int) m51223k4());
        c3149x1.m13455x1((int) this.f37201x1);
        this.f37199kk.m51869k4(c3149x1);
        this.f37200to.m51610k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m51226k4(C10603qc c10603qc) {
        C10406dp c10406dpM51562k4 = c10603qc.m51562k4(0L);
        C10613qw c10613qw = this.f37200to;
        byte[] bArr = c10613qw.f37335kk;
        byte[] bArr2 = new byte[bArr.length + c10613qw.f37333du.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        C10613qw c10613qw2 = this.f37200to;
        byte[] bArr3 = c10613qw2.f37333du;
        System.arraycopy(bArr3, 0, bArr2, c10613qw2.f37335kk.length, bArr3.length);
        byte[] bArrM50696k4 = c10406dpM51562k4.m50696k4(bArr2);
        int length = this.f37200to.f37335kk.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArrM50696k4, 0, bArr4, 0, length);
        C4772y9 c4772y9 = new C4772y9();
        try {
            byte[] bArrM19588x1 = c4772y9.m19588x1(bArr4);
            for (int i = 0; i < bArrM19588x1.length; i++) {
                if ((bArrM19588x1[i] & 255) != (bArrM50696k4[length + i] & 255)) {
                    return false;
                }
            }
            c4772y9.dispose();
            return true;
        } finally {
            c4772y9.dispose();
        }
    }
}
