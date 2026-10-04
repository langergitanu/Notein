package com.aspose.slides.internal.p119f0;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.AbstractC9768f9;
import com.aspose.slides.internal.p353q7.C9757ar;
import com.aspose.slides.internal.p353q7.C9777kp;
import com.aspose.slides.internal.p353q7.C9792um;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p353q7.C9799x1;
import com.aspose.slides.internal.p505xn.C12561ix;
import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.f0.to */
/* JADX INFO: loaded from: classes.dex */
public class C3840to extends C3837h4 {

    /* JADX INFO: renamed from: c5 */
    private int[] f10466c5;

    /* JADX INFO: renamed from: ck */
    private SortedList<Integer, Integer> f10467ck;

    /* JADX INFO: renamed from: du */
    private int[] f10468du;

    /* JADX INFO: renamed from: dy */
    private int[] f10469dy;

    /* JADX INFO: renamed from: h4 */
    private int[] f10470h4;

    /* JADX INFO: renamed from: jd */
    private int f10471jd;

    /* JADX INFO: renamed from: k4 */
    public int f10472k4;

    /* JADX INFO: renamed from: kk */
    public int f10473kk;

    /* JADX INFO: renamed from: m9 */
    private int[] f10474m9;

    /* JADX INFO: renamed from: to */
    private int f10475to;

    /* JADX INFO: renamed from: x1 */
    public int f10476x1;

    public C3840to(int i, int i2, AbstractC9768f9 abstractC9768f9) {
        super(i, i2, abstractC9768f9);
        this.f10467ck = new SortedList<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m15375k4() {
        return this.f10475to;
    }

    /* JADX INFO: renamed from: kk */
    public final int[] m15377kk() {
        return this.f10470h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int[] m15378x1() {
        return this.f10468du;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public int mo15360k4(int i) {
        for (int i2 = 0; i2 < this.f10475to; i2++) {
            int i3 = this.f10468du[i2];
            if (i <= i3 && this.f10470h4[i2] <= i) {
                return m15373k4(i, i2);
            }
            if (i <= i3) {
                break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    private int m15373k4(int i, int i2) {
        int i3 = this.f10466c5[i2];
        if (i3 > 0) {
            int i4 = ((i - this.f10470h4[i2]) + (i3 / 2)) - (this.f10475to - i2);
            int[] iArr = this.f10469dy;
            if (i4 < iArr.length) {
                return iArr[i4];
            }
        }
        return (this.f10474m9[i2] + i) % 65536;
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public C9777kp mo15361k4(C9792um c9792um) {
        C9777kp c9777kp = new C9777kp(((C9799x1) m15367to()).m48299kk());
        for (int i = 0; i < this.f10475to; i++) {
            int i2 = this.f10470h4[i];
            while (i2 <= this.f10468du[i]) {
                int iM15373k4 = i2 < 65535 ? m15373k4((char) i2, i) : 0;
                C9757ar c9757arClone = c9792um.m48252k4(iM15373k4).Clone();
                C9797wp c9797wp = new C9797wp((char) i2, iM15373k4, 65535 & c9757arClone.f35245k4, c9757arClone.f35246x1);
                c9777kp.m48103k4(c9797wp);
                if (c9797wp.m48287x1() == 0) {
                    c9777kp.m48108x1(c9797wp);
                }
                i2++;
            }
        }
        return c9777kp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15376k4(C12561ix c12561ix) {
        int iM58582k4 = c12561ix.m58582k4() - 1;
        if (c12561ix.m58587to(iM58582k4) != 65535) {
            throw new InvalidOperationException("Last character is supposed to be the 0xffff (the missing character).");
        }
        Object objM58586kk = c12561ix.m58586kk(iM58582k4);
        Class cls = Integer.TYPE;
        if (((Integer) C7019kk.m27464to(objM58586kk, cls)).intValue() != 0) {
            throw new InvalidOperationException("Glyph index for the missing character is expected to be zero.");
        }
        int iM58582k42 = c12561ix.m58582k4() & 65535;
        this.f10475to = iM58582k42;
        int iM27462to = 2 << C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(C14116yg.m67511yj(iM58582k42) / C14116yg.m67511yj(2.0d))), 14);
        this.f10472k4 = iM27462to;
        this.f10476x1 = C7019kk.m27462to(Double.valueOf(C14116yg.m67511yj(((double) iM27462to) / 2.0d) / C14116yg.m67511yj(2.0d)), 14);
        int i = this.f10475to;
        this.f10473kk = (i * 2) - this.f10472k4;
        this.f10468du = new int[i];
        this.f10470h4 = new int[i];
        this.f10474m9 = new int[i];
        this.f10466c5 = new int[i];
        this.f10469dy = new int[0];
        for (int i2 = 0; i2 < c12561ix.m58582k4(); i2++) {
            int iM58587to = c12561ix.m58587to(i2);
            int iIntValue = ((Integer) C7019kk.m27464to(c12561ix.m58586kk(i2), cls)).intValue();
            this.f10468du[i2] = iM58587to;
            this.f10470h4[i2] = iM58587to;
            this.f10474m9[i2] = iIntValue - iM58587to;
        }
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public void mo15362k4(C12564kk c12564kk) {
        int iM58600du = c12564kk.m58600du();
        this.f10471jd = c12564kk.m58600du() & 65535;
        this.f10475to = ((c12564kk.m58600du() & 65535) / 2) & 65535;
        this.f10472k4 = c12564kk.m58600du() & 65535;
        this.f10476x1 = c12564kk.m58600du() & 65535;
        this.f10473kk = c12564kk.m58600du() & 65535;
        this.f10468du = new int[this.f10475to];
        int i = 0;
        while (true) {
            int[] iArr = this.f10468du;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = c12564kk.m58600du() & 65535;
            i++;
        }
        c12564kk.m58600du();
        int i2 = this.f10475to;
        this.f10470h4 = new int[i2];
        this.f10474m9 = new int[i2];
        this.f10466c5 = new int[i2];
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.f10470h4;
            if (i3 >= iArr2.length) {
                break;
            }
            iArr2[i3] = c12564kk.m58600du() & 65535;
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr3 = this.f10474m9;
            if (i4 >= iArr3.length) {
                break;
            }
            iArr3[i4] = c12564kk.m58600du() & 65535;
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.f10466c5;
            if (i5 >= iArr4.length) {
                break;
            }
            iArr4[i5] = c12564kk.m58600du() & 65535;
            i5++;
        }
        int i6 = this.f10475to;
        int i7 = ((iM58600du & 65535) - ((i6 * 8) + 16)) / 2;
        if (i7 >= 0) {
            i6 = i7;
        }
        this.f10469dy = new int[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            this.f10469dy[i8] = c12564kk.m58600du() & 65535;
        }
        super.mo15362k4(c12564kk);
    }

    @Override // com.aspose.slides.internal.p119f0.C3837h4
    /* JADX INFO: renamed from: k4 */
    public void mo15365k4(C12570to c12570to) {
        c12570to.m58671x1(4);
        c12570to.m58671x1((this.f10469dy.length * 2) + (m15375k4() * 8) + 16);
        c12570to.m58671x1(this.f10471jd);
        c12570to.m58671x1(m15375k4() * 2);
        c12570to.m58671x1(this.f10472k4);
        c12570to.m58671x1(this.f10476x1);
        c12570to.m58671x1(this.f10473kk);
        m15374k4(this.f10468du, c12570to);
        c12570to.m58671x1(0);
        m15374k4(this.f10470h4, c12570to);
        m15374k4(this.f10474m9, c12570to);
        m15374k4(this.f10466c5, c12570to);
        m15374k4(this.f10469dy, c12570to);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m15374k4(int[] iArr, C12570to c12570to) {
        for (int i : iArr) {
            c12570to.m58671x1(i);
        }
    }
}
