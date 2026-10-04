package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.c5 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC10133c5 {

    /* JADX INFO: renamed from: du */
    private final int f36329du;

    /* JADX INFO: renamed from: h4 */
    private int f36330h4;

    /* JADX INFO: renamed from: k4 */
    private int f36331k4;

    /* JADX INFO: renamed from: kk */
    private final int f36332kk;

    /* JADX INFO: renamed from: m9 */
    private int f36333m9;

    /* JADX INFO: renamed from: to */
    private final int f36334to;

    /* JADX INFO: renamed from: x1 */
    private final int f36335x1;

    public AbstractC10133c5(int i, int i2) {
        if (i > 8) {
            throw new ArgumentOutOfRangeException("tableBitsSize", "Too big code size. The maximal allowed is 8 bits.");
        }
        if (i < 1) {
            throw new ArgumentOutOfRangeException("tableBitsSize", "Too small code size. The minimal allowed is 1 bit.");
        }
        this.f36331k4 = i;
        if (i == 1) {
            this.f36331k4 = 2;
        }
        if (i + 1 > 12) {
            throw new ArgumentOutOfRangeException("tableBitsSize", C14113y2.m67402k4("Too big code size. The maximal allowed is {0} bits. LZW does not allow compression sizes to be greater than {0} bits", C7019kk.m27466x1(12)));
        }
        int i3 = this.f36331k4;
        if (i3 < 2) {
            throw new ArgumentOutOfRangeException("tableBitsSize", "Too small code size. The minimal allowed is 2 bits.");
        }
        this.f36330h4 = i3 + 1;
        int i4 = 1 << i3;
        this.f36335x1 = i4;
        this.f36332kk = i4 + 1;
        this.f36334to = i4 + 2;
        this.f36329du = i2;
    }

    /* JADX INFO: renamed from: c5 */
    public int mo49781c5() {
        return this.f36331k4;
    }

    /* JADX INFO: renamed from: ck */
    public int m49782ck() {
        return this.f36333m9;
    }

    /* JADX INFO: renamed from: du */
    public int mo49783du(int i) {
        return i;
    }

    /* JADX INFO: renamed from: dy */
    public int mo49784dy() {
        return this.f36334to;
    }

    /* JADX INFO: renamed from: fa */
    public void m49785fa() {
        this.f36333m9 = mo49783du((1 << m49787jd()) - mo49784dy());
    }

    /* JADX INFO: renamed from: h4 */
    public int mo49786h4() {
        return this.f36332kk;
    }

    /* JADX INFO: renamed from: jd */
    public int m49787jd() {
        return this.f36330h4;
    }

    /* JADX INFO: renamed from: m9 */
    public int mo49788m9() {
        return this.f36335x1;
    }

    /* JADX INFO: renamed from: to */
    public void mo49789to() {
    }

    /* JADX INFO: renamed from: up */
    public void m49791up() {
        int i = this.f36331k4 + 1;
        if (i > 12) {
            i = 12;
        }
        m49790to(i);
        this.f36333m9 = mo49783du((1 << m49787jd()) - mo49784dy());
    }

    /* JADX INFO: renamed from: yj */
    public void m49792yj() {
        int i = this.f36330h4 + 1;
        if (i > 12) {
            i = 12;
        }
        m49790to(i);
        this.f36333m9 = mo49783du((1 << m49787jd()) - mo49784dy());
    }

    /* JADX INFO: renamed from: to */
    public void m49790to(int i) {
        if (i > 12) {
            throw new ArgumentOutOfRangeException("value", C14113y2.m67402k4("Too big code size. The maximal allowed is {0} bits. LZW does not allow compression sizes to be greater than {0} bits", C7019kk.m27466x1(12)));
        }
        if (i < 2) {
            throw new ArgumentOutOfRangeException("value", "Too small code size. The minimal allowed is 2 bits.");
        }
        if (this.f36330h4 != i) {
            this.f36330h4 = i;
            mo49789to();
        }
    }
}
