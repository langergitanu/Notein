package com.aspose.slides.internal.p077d8;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3081ri extends AbstractC3151yd {

    /* JADX INFO: renamed from: c5 */
    private int f9142c5;

    /* JADX INFO: renamed from: ck */
    private char[] f9143ck;

    /* JADX INFO: renamed from: dy */
    private int f9144dy;

    /* JADX INFO: renamed from: h4 */
    private int f9145h4;

    /* JADX INFO: renamed from: jd */
    private int f9146jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3151yd f9147k4;

    /* JADX INFO: renamed from: kk */
    private int f9148kk;

    /* JADX INFO: renamed from: m9 */
    private int f9149m9;

    /* JADX INFO: renamed from: to */
    private char[] f9150to;

    /* JADX INFO: renamed from: x1 */
    private C3032ai[] f9151x1;

    public C3081ri(AbstractC3150x6 abstractC3150x6) {
        this.f9143ck = new char[1024];
        m13052k4(new C3148wl(abstractC3150x6, true), new C3032ai[]{new C3032ai(0, Integer.MAX_VALUE, null)});
    }

    /* JADX INFO: renamed from: kk */
    private boolean m13053kk() {
        int i = this.f9144dy;
        C3032ai[] c3032aiArr = this.f9151x1;
        if (i >= c3032aiArr.length) {
            return false;
        }
        if (this.f9142c5 < c3032aiArr[i].f8885x1) {
            return true;
        }
        int i2 = i + 1;
        this.f9144dy = i2;
        if (i2 >= c3032aiArr.length) {
            return false;
        }
        C3032ai c3032ai = c3032aiArr[i2];
        int i3 = c3032ai.f8883k4;
        this.f9142c5 = i3;
        if (c3032ai.f8884kk == null) {
            int iMo13058k4 = this.f9146jd;
            if (i3 > iMo13058k4) {
                do {
                    i3 -= iMo13058k4;
                    if (i3 > 0) {
                        iMo13058k4 = this.f9147k4.mo13058k4(this.f9143ck, 0, C14116yg.m67507x1(1024, i3));
                    } else {
                        this.f9146jd = c3032ai.f8883k4;
                        this.f9149m9 = 0;
                        this.f9145h4 = 0;
                    }
                } while (iMo13058k4 != 0);
                this.f9144dy = this.f9151x1.length;
                return false;
            }
            if (i3 < iMo13058k4) {
                throw new Exception("Inner error: wrong segment.");
            }
        }
        this.f9142c5 = c3032ai.f8883k4;
        this.f9149m9 = 0;
        this.f9145h4 = 0;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m13054x1() {
        if (this.f9145h4 != this.f9149m9) {
            return true;
        }
        if (!m13053kk()) {
            return false;
        }
        C3032ai c3032ai = this.f9151x1[this.f9144dy];
        char[] cArr = c3032ai.f8884kk;
        if (cArr != null) {
            this.f9150to = cArr;
            this.f9145h4 = c3032ai.f8883k4 + this.f9142c5;
            int i = c3032ai.f8885x1;
            this.f9149m9 = i;
            this.f9142c5 = i;
            return true;
        }
        char[] cArr2 = this.f9143ck;
        this.f9150to = cArr2;
        this.f9145h4 = 0;
        int iMo13058k4 = this.f9147k4.mo13058k4(cArr2, 0, C14116yg.m67507x1(1024, c3032ai.f8885x1 - this.f9142c5));
        if (iMo13058k4 == 0) {
            this.f9144dy = this.f9151x1.length;
            this.f9149m9 = this.f9145h4;
            return false;
        }
        this.f9149m9 = this.f9145h4 + iMo13058k4;
        this.f9142c5 += iMo13058k4;
        this.f9146jd += iMo13058k4;
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: du */
    public int mo13055du() {
        if (this.f9145h4 < this.f9149m9 || m13054x1()) {
            return this.f9150to[this.f9145h4];
        }
        return -1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: h4 */
    public int mo13056h4() {
        if (this.f9145h4 >= this.f9149m9 && !m13054x1()) {
            return -1;
        }
        this.f9148kk++;
        char[] cArr = this.f9150to;
        int i = this.f9145h4;
        this.f9145h4 = i + 1;
        return cArr[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final int m13057k4() {
        return this.f9148kk;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: to */
    public void mo13059to() {
        this.f9147k4.mo13059to();
        super.mo13059to();
    }

    public C3081ri(AbstractC3150x6 abstractC3150x6, C3042ca c3042ca) {
        this.f9143ck = new char[1024];
        m13052k4(new C3148wl(abstractC3150x6, true), c3042ca.m12830k4());
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3151yd
    /* JADX INFO: renamed from: k4 */
    public int mo13058k4(char[] cArr, int i, int i2) {
        if (this.f9145h4 >= this.f9149m9 && !m13054x1()) {
            return 0;
        }
        int iM67507x1 = C14116yg.m67507x1(i2, this.f9149m9 - this.f9145h4);
        int i3 = this.f9145h4 + iM67507x1;
        while (true) {
            int i4 = this.f9145h4;
            if (i4 >= i3) {
                break;
            }
            cArr[i] = this.f9150to[i4];
            i++;
            this.f9145h4 = i4 + 1;
        }
        int i5 = i2 - iM67507x1;
        this.f9148kk += iM67507x1;
        while (i5 > 0 && m13053kk()) {
            C3032ai c3032ai = this.f9151x1[this.f9144dy];
            int iM67507x12 = C14116yg.m67507x1(c3032ai.f8885x1 - this.f9142c5, i5);
            char[] cArr2 = c3032ai.f8884kk;
            if (cArr2 == null) {
                int iMo13058k4 = this.f9147k4.mo13058k4(cArr, i, iM67507x12);
                this.f9146jd += iMo13058k4;
                this.f9148kk += iMo13058k4;
                this.f9142c5 += iMo13058k4;
                iM67507x1 += iMo13058k4;
                i5 -= iMo13058k4;
                i += iMo13058k4;
                if (iMo13058k4 < iM67507x12) {
                    return iM67507x1;
                }
            } else {
                if (iM67507x12 >= 0) {
                    System.arraycopy(cArr2, this.f9142c5, cArr, i, iM67507x12);
                }
                this.f9148kk += iM67507x12;
                this.f9142c5 += iM67507x12;
                iM67507x1 += iM67507x12;
                i5 -= iM67507x12;
                i += iM67507x12;
            }
        }
        return iM67507x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m13052k4(AbstractC3151yd abstractC3151yd, C3032ai[] c3032aiArr) {
        int i;
        this.f9147k4 = abstractC3151yd;
        this.f9151x1 = c3032aiArr;
        this.f9145h4 = this.f9149m9;
        this.f9146jd = 0;
        C3032ai c3032ai = c3032aiArr[0];
        if (c3032ai.f8884kk != null || (i = c3032ai.f8883k4) <= 0) {
            return;
        }
        while (i > 0) {
            int iMo13058k4 = this.f9147k4.mo13058k4(this.f9143ck, 0, C14116yg.m67507x1(1024, i));
            if (iMo13058k4 == 0) {
                this.f9144dy = this.f9151x1.length;
            }
            i -= iMo13058k4;
        }
        int i2 = c3032ai.f8883k4;
        this.f9142c5 = i2;
        this.f9146jd = i2;
    }
}
