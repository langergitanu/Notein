package com.aspose.slides.internal.p439ug;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11310to extends C11308kk {

    /* JADX INFO: renamed from: c5 */
    private int f38907c5;

    /* JADX INFO: renamed from: ck */
    private int f38908ck;

    /* JADX INFO: renamed from: du */
    private final int f38909du;

    /* JADX INFO: renamed from: dy */
    private final int f38910dy;

    /* JADX INFO: renamed from: fa */
    private int[] f38911fa;

    /* JADX INFO: renamed from: h4 */
    private final int f38912h4;

    /* JADX INFO: renamed from: jd */
    private int f38913jd;

    /* JADX INFO: renamed from: ks */
    private int f38914ks;

    /* JADX INFO: renamed from: m9 */
    private final int f38915m9;

    /* JADX INFO: renamed from: up */
    private C12014ne f38916up;

    /* JADX INFO: renamed from: yj */
    private int f38917yj;

    public C11310to(C12014ne c12014ne, int i, int i2, boolean z) {
        super(i, z);
        this.f38916up = new C12014ne();
        this.f38910dy = i;
        this.f38909du = c12014ne.m56666dy();
        this.f38912h4 = c12014ne.m56681to();
        this.f38915m9 = c12014ne.m56668h4();
        this.f38907c5 = i2;
        this.f38914ks = this.f38899k4[0];
    }

    /* JADX INFO: renamed from: fa */
    private void m54322fa() {
        if (this.f38907c5 < this.f38908ck) {
            int iM56666dy = this.f38916up.m56666dy();
            int i = (this.f38915m9 - this.f38912h4) * (this.f38908ck - iM56666dy);
            int i2 = this.f38917yj;
            int iM67507x1 = C14116yg.m67507x1(i - i2, this.f38911fa.length - i2);
            for (int i3 = 0; i3 < iM67507x1; i3++) {
                int[] iArr = this.f38911fa;
                int i4 = this.f38917yj;
                this.f38917yj = i4 + 1;
                iArr[i4] = this.f38914ks;
            }
            int i5 = this.f38917yj;
            int i6 = this.f38915m9;
            int i7 = this.f38912h4;
            this.f38907c5 = (i5 / (i6 - i7)) + iM56666dy;
            int iM56681to = this.f38916up.m56681to() + (i5 % (i6 - i7));
            this.f38913jd = iM56681to;
            if (iM56681to == 0) {
                int i8 = this.f38908ck;
                int i9 = this.f38907c5;
                if (i8 == i9) {
                    this.f38907c5 = i9 - 1;
                    this.f38913jd = this.f38910dy;
                    this.f38914ks = this.f38899k4[0];
                }
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m54323c5() {
        return this.f38917yj < this.f38911fa.length;
    }

    /* JADX INFO: renamed from: ck */
    public void m54324ck() {
        this.f38907c5++;
        this.f38913jd = 0;
        this.f38901to = 0;
        this.f38902x1 = new int[this.f38902x1.length];
        this.f38900kk = 0;
    }

    /* JADX INFO: renamed from: dy */
    public boolean m54325dy() {
        return this.f38913jd >= this.f38910dy;
    }

    /* JADX INFO: renamed from: jd */
    public int m54326jd() {
        return this.f38907c5;
    }

    /* JADX INFO: renamed from: k4 */
    public void m54327k4(int i) {
        int[] iArr = this.f38902x1;
        int i2 = this.f38900kk;
        iArr[i2] = C14116yg.m67507x1(i, this.f38910dy - this.f38913jd) + iArr[i2];
        if (i > 0) {
            if (this.f38907c5 >= this.f38909du) {
                int iM67507x1 = C14116yg.m67507x1(this.f38911fa.length - this.f38917yj, C14116yg.m67507x1(this.f38913jd + i, this.f38915m9) - C14116yg.m67483k4(this.f38913jd, this.f38912h4));
                if (iM67507x1 > 0) {
                    int i3 = this.f38899k4[this.f38901to];
                    int i4 = this.f38917yj + iM67507x1;
                    while (true) {
                        int i5 = this.f38917yj;
                        if (i5 >= i4) {
                            break;
                        }
                        this.f38911fa[i5] = i3;
                        this.f38917yj = i5 + 1;
                    }
                }
            }
            this.f38913jd += i;
        }
    }

    /* JADX INFO: renamed from: m9 */
    public boolean m54330m9() {
        return this.f38913jd == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public void m54328k4(int i, int i2) {
        int[] iArr = this.f38902x1;
        int i3 = this.f38900kk;
        iArr[i3] = (this.f38910dy - this.f38913jd) + iArr[i3];
        this.f38914ks = i2;
        this.f38908ck = i;
        m54322fa();
    }

    /* JADX INFO: renamed from: k4 */
    public void m54329k4(int[] iArr, C12014ne c12014ne) {
        this.f38911fa = iArr;
        c12014ne.CloneTo(this.f38916up);
        this.f38917yj = 0;
        m54322fa();
        if (this.f38907c5 != c12014ne.m56666dy() || this.f38913jd <= c12014ne.m56681to()) {
            return;
        }
        int iM56681to = c12014ne.m56681to();
        int length = this.f38911fa.length - this.f38917yj;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f38902x1;
            if (i >= iArr2.length) {
                return;
            }
            int i5 = iArr2[i];
            i2 += i5;
            if (i5 > 0 && i2 > iM56681to) {
                int iM67507x1 = C14116yg.m67507x1(i2 - iM56681to, length);
                int i6 = this.f38899k4[i3];
                for (int i7 = 0; i7 < iM67507x1; i7++) {
                    int[] iArr3 = this.f38911fa;
                    int i8 = this.f38917yj;
                    this.f38917yj = i8 + 1;
                    iArr3[i8] = i6;
                }
                length -= iM67507x1;
                if (length <= 0) {
                    return;
                } else {
                    iM56681to = i2;
                }
            }
            i3++;
            if (i3 == 2) {
                i3 = 0;
            }
            i4 += i5;
            if (i4 == this.f38913jd) {
                return;
            } else {
                i++;
            }
        }
    }
}
