package com.aspose.slides.internal.p558zz;

import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.zz.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13641m9 extends AbstractC13643x1 {

    /* JADX INFO: renamed from: du */
    private volatile int[] f45319du;

    /* JADX INFO: renamed from: kk */
    private Object f45320kk;

    /* JADX INFO: renamed from: to */
    private long f45321to;

    /* JADX INFO: renamed from: x1 */
    private volatile boolean f45322x1;

    public C13641m9(AbstractC13639k4 abstractC13639k4) {
        super(abstractC13639k4);
        this.f45322x1 = false;
        this.f45320kk = new Object();
    }

    /* JADX INFO: renamed from: c5 */
    public final int m62995c5(int i) {
        return m63005kk(i + 3) | (m63008to(i) << 24) | (m63005kk(i + 1) << 16) | (m63005kk(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ck */
    public final int m62996ck(int i) {
        return m62999h4(i);
    }

    /* JADX INFO: renamed from: du */
    public final int m62997du(int i) {
        return (m63005kk(i + 1) | (m63005kk(i) << 8)) & 65535;
    }

    /* JADX INFO: renamed from: dy */
    public final int m62998dy(int i) {
        long jM63007m9 = m63007m9(i);
        if ((jM63007m9 & 2147483648L) != 2147483648L) {
            return (int) jM63007m9;
        }
        throw new ArithmeticException("Long value too large to fit into an integer.");
    }

    /* JADX INFO: renamed from: h4 */
    public final int m62999h4(int i) {
        return ((m63005kk(i + 1) | (m63008to(i) << 8)) << 16) >> 16;
    }

    /* JADX INFO: renamed from: jd */
    public final int m63000jd(int i) {
        return m62995c5(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63001k4(int i, byte[] bArr, int i2, int i3) {
        return this.f45324k4.m62975k4(m63015k4(i), bArr, i2, m63018x1(i, i3));
    }

    /* JADX INFO: renamed from: kk */
    public final int m63005kk(int i) {
        int iM62973k4 = this.f45324k4.m62973k4(m63015k4(i));
        if (iM62973k4 >= 0) {
            return iM62973k4;
        }
        throw new IndexOutOfRangeException(C14113y2.m67408k4("Index attempted to be read from is out of bounds: ", C14113y2.m67402k4("{0:x}", Integer.valueOf(i))));
    }

    /* JADX INFO: renamed from: m9 */
    public final long m63007m9(int i) {
        return ((long) (m63005kk(i + 3) | (m63005kk(i) << 24) | (m63005kk(i + 1) << 16) | (m63005kk(i + 2) << 8))) & 4294967295L;
    }

    /* JADX INFO: renamed from: to */
    public final int m63008to(int i) {
        int iM62973k4 = this.f45324k4.m62973k4(m63015k4(i));
        if (iM62973k4 >= 0) {
            return (iM62973k4 << 24) >> 24;
        }
        throw new IndexOutOfRangeException(C14113y2.m67408k4("Index attempted to be read from is out of bounds: ", C14113y2.m67402k4("{0:x}", Integer.valueOf(i))));
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC13643x1 mo62971x1(int i) {
        if (i < 0 || i > m63017x1()) {
            throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
        }
        return new C13641m9(this, i);
    }

    public C13641m9(C13641m9 c13641m9, int i) {
        super(c13641m9, i);
        this.f45322x1 = false;
        this.f45320kk = new Object();
    }

    /* JADX INFO: renamed from: to */
    private long m62993to(int i, int i2) {
        long jM63007m9 = 0;
        while (i <= i2 - 4) {
            jM63007m9 += m63007m9(i);
            i += 4;
        }
        int i3 = i2 & (-4);
        if (i3 >= i2) {
            return jM63007m9;
        }
        int iM63005kk = m63005kk(i3);
        int i4 = i3 + 1;
        int i5 = i3 + 2;
        return jM63007m9 + ((long) ((iM63005kk << 24) | ((i4 < i2 ? m63005kk(i4) : 0) << 16) | ((i5 < i2 ? m63005kk(i5) : 0) << 8)));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63002k4(C3123ar c3123ar) {
        return this.f45324k4.mo62954k4(c3123ar, m63015k4(0), m63014k4());
    }

    /* JADX INFO: renamed from: kk */
    public final long m63006kk() {
        if (!this.f45322x1) {
            m62994to();
        }
        return this.f45321to;
    }

    public C13641m9(C13641m9 c13641m9, int i, int i2) {
        super(c13641m9, i, i2);
        this.f45322x1 = false;
        this.f45320kk = new Object();
    }

    /* JADX INFO: renamed from: to */
    private void m62994to() {
        long jM62993to;
        if (this.f45322x1) {
            return;
        }
        if (this.f45319du == null) {
            jM62993to = m62993to(0, m63014k4());
        } else {
            int i = 0;
            jM62993to = 0;
            while (i < this.f45319du.length) {
                jM62993to += m62993to(this.f45319du[i], i == this.f45319du.length - 1 ? m63014k4() : this.f45319du[i + 1]);
                i += 2;
            }
        }
        this.f45321to = jM62993to & 4294967295L;
        this.f45322x1 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m63003k4(C13637dy c13637dy) {
        return this.f45324k4.m62974k4(c13637dy.m63015k4(0), c13637dy.f45324k4, m63015k4(0), m63014k4());
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC13643x1 mo62967kk(int i, int i2) {
        if (i < 0 || i + i2 > m63017x1()) {
            throw new IndexOutOfRangeException("Attempt to bind data outside of its limits.");
        }
        return new C13641m9(this, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13641m9 m62992k4(byte[] bArr) {
        return new C13641m9(new C13638h4(bArr));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63004k4(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            this.f45319du = null;
        } else {
            this.f45319du = new int[iArr.length];
            AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) iArr), AbstractC14092to.m67208k4((Object) this.f45319du), iArr.length);
        }
        this.f45322x1 = false;
    }
}
