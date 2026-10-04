package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p513xw.AbstractC12742x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.t6 */
/* JADX INFO: loaded from: classes5.dex */
public class C12726t6 {

    /* JADX INFO: renamed from: du */
    private C1375h4 f42367du;

    /* JADX INFO: renamed from: k4 */
    private List<List<InterfaceC1861h4>> f42369k4 = null;

    /* JADX INFO: renamed from: x1 */
    private List<Integer> f42372x1 = null;

    /* JADX INFO: renamed from: kk */
    private boolean f42370kk = false;

    /* JADX INFO: renamed from: to */
    private int f42371to = 0;

    /* JADX INFO: renamed from: h4 */
    private C12748zj f42368h4 = new C12748zj(this);

    public C12726t6(C1375h4 c1375h4) {
        this.f42367du = c1375h4;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m59203c5() {
        return (this.f42369k4.size() - 1) - this.f42368h4.f42537x1;
    }

    /* JADX INFO: renamed from: ck */
    public final void m59204ck() {
        this.f42368h4.f42534k4 = m59218to();
        this.f42368h4.f42537x1 = this.f42369k4.size() - 1;
        this.f42368h4.f42535kk = this.f42369k4.get_Item(r0.f42537x1).size() - 1;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m59205du() {
        List<List<InterfaceC1861h4>> list = this.f42369k4;
        return list != null && list.size() > 0;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m59206dy() {
        return this.f42368h4.f42534k4 < m59218to();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m59207h4() {
        this.f42370kk = false;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m59208jd() {
        C12748zj c12748zj = this.f42368h4;
        return c12748zj.f42535kk < this.f42369k4.get_Item(c12748zj.f42537x1).size() - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m59209k4(C12748zj c12748zj, int i) {
        int i2 = c12748zj.f42537x1 + 1;
        int iIntValue = 0;
        while (i2 < this.f42369k4.size() && this.f42372x1.get_Item(i2).intValue() - c12748zj.f42534k4 <= i) {
            iIntValue = this.f42372x1.get_Item(i2).intValue() - c12748zj.f42534k4;
            i2++;
        }
        C12748zj c12748zj2 = this.f42368h4;
        c12748zj2.f42537x1 = i2 - 1;
        c12748zj2.f42534k4 = c12748zj.f42534k4 + iIntValue;
        return iIntValue;
    }

    /* JADX INFO: renamed from: kk */
    public final C1375h4 m59216kk() {
        return this.f42367du;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m59217m9() {
        return this.f42370kk;
    }

    /* JADX INFO: renamed from: to */
    public final int m59218to() {
        List<Integer> list = this.f42372x1;
        if (list == null || list.size() == 0) {
            return 0;
        }
        return ((Integer) OooO0O0.OooO00o(this.f42372x1, 1)).intValue();
    }

    /* JADX INFO: renamed from: x1 */
    public final C12748zj m59219x1() {
        return this.f42368h4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final int m59210k4(C12748zj c12748zj, int i, boolean z) {
        int i2;
        int iM59252rv;
        boolean z2;
        C12748zj c12748zj2;
        int iM59420kk;
        int i3;
        int i4 = 0;
        if (i <= 0) {
            c12748zj2 = this.f42368h4;
            iM59420kk = c12748zj.m59420kk();
        } else {
            int i5 = c12748zj.f42537x1;
            int i6 = c12748zj.f42535kk;
            if (i5 == -1 || i6 == this.f42369k4.get_Item(i5).size() - 1) {
                i5++;
                i2 = 0;
            } else {
                i2 = i6 + 1;
            }
            if (this.f42369k4.size() - 1 > i5) {
                if (z || !m59217m9() || (i3 = this.f42371to) <= 0) {
                    iM59252rv = 0;
                    z2 = false;
                } else {
                    iM59252rv = this.f42372x1.get_Item(i3 - 1).intValue() - c12748zj.f42534k4;
                    i5 = this.f42371to;
                    i2 = 0;
                    z2 = false;
                }
                while (this.f42372x1.get_Item(i5).intValue() - c12748zj.f42534k4 <= i) {
                    iM59252rv = this.f42372x1.get_Item(i5).intValue() - c12748zj.f42534k4;
                    i5++;
                    i2 = 0;
                    z2 = true;
                }
            } else {
                iM59252rv = 0;
                z2 = false;
            }
            C1869to c1869to = new C1869to(this.f42369k4.get_Item(i5), i2);
            int i7 = 0;
            int iMo9761m9 = -1;
            int size = -1;
            while (true) {
                if (z2 && iM59252rv > i) {
                    break;
                }
                if (z2) {
                    i7 = iM59252rv;
                    size = iMo9761m9;
                } else {
                    z2 = true;
                }
                while (true) {
                    boolean z3 = false;
                    while (c1869to.mo9764x1()) {
                        AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
                        if (abstractC12729ts.mo58895yj()) {
                            iM59252rv += abstractC12729ts.m59252rv();
                            z3 = true;
                        } else if (abstractC12729ts.mo58932x_()) {
                            if (z3) {
                                break;
                            }
                            iM59252rv += abstractC12729ts.m59252rv();
                        } else if (abstractC12729ts.mo59085x6() < 1000) {
                            break;
                        }
                    }
                }
                iMo9761m9 = c1869to.mo9761m9();
            }
            if (z2) {
                if (i7 > 0) {
                    C12748zj c12748zj3 = this.f42368h4;
                    if (size == -1) {
                        i5--;
                    }
                    c12748zj3.f42537x1 = i5;
                    if (size == -1) {
                        size = this.f42369k4.get_Item(i5).size() - 1;
                    }
                    c12748zj3.f42535kk = size;
                }
                i4 = i7;
            }
            c12748zj2 = this.f42368h4;
            iM59420kk = c12748zj.m59420kk() + i4;
        }
        c12748zj2.f42534k4 = iM59420kk;
        return i4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59220x1(List<List<InterfaceC1861h4>> list) {
        for (int i = 0; i < list.size(); i++) {
            this.f42369k4.removeAt(r1.size() - 1);
            this.f42372x1.removeAt(r1.size() - 1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> m59211k4(int i) {
        List<List<InterfaceC1861h4>> list = this.f42369k4;
        if (list == null) {
            return null;
        }
        return list.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59221x1(C12686bz c12686bz, C12720qw c12720qw, int i) {
        this.f42368h4.f42534k4 = c12686bz.f42173rv.m59420kk();
        this.f42368h4.f42537x1 = c12686bz.f42173rv.m59418du();
        int i2 = i;
        C12686bz c12686bz2 = c12686bz;
        while (this.f42368h4.f42534k4 < m59218to()) {
            int iIntValue = this.f42372x1.get_Item(this.f42368h4.f42537x1 + 1).intValue();
            C12748zj c12748zj = this.f42368h4;
            int i3 = c12748zj.f42534k4;
            if (iIntValue - i3 <= i2) {
                int i4 = c12748zj.f42537x1 + 1;
                c12748zj.f42537x1 = i4;
                int iIntValue2 = this.f42372x1.get_Item(i4).intValue();
                C12748zj c12748zj2 = this.f42368h4;
                i2 -= iIntValue2 - c12748zj2.f42534k4;
                c12748zj2.f42534k4 = this.f42372x1.get_Item(c12748zj2.f42537x1).intValue();
            } else {
                AbstractC12742x6.kk kkVar = c12686bz2;
                C12686bz c12686bz3 = (C12686bz) c12720qw.mo59103k4(c12686bz.f42519k4, c12686bz2.f42524x1 + 1, 1, i3 - c12686bz2.f42173rv.m59420kk(), 0, 0, 0.0d, 0, 0, 0, c12686bz2.f42513ck + ((double) ((this.f42368h4.f42537x1 - c12686bz2.f42173rv.f42537x1) * 10000)), kkVar);
                c12720qw.mo59106k4(c12686bz3.f42524x1, c12686bz3);
                c12720qw.m59391x1(kkVar.f42524x1, kkVar);
                i2 = i;
                c12686bz2 = c12686bz3;
            }
        }
        C12686bz c12686bz4 = (C12686bz) c12720qw.mo59103k4(c12686bz.f42519k4, c12686bz2.f42524x1 + 1, 1, m59218to() - c12686bz2.f42173rv.m59420kk(), 0, 0, 0.0d, 0, 0, 0, c12686bz2.f42513ck + ((double) ((this.f42368h4.f42537x1 - c12686bz2.f42173rv.f42537x1) * 10000)), c12686bz2);
        c12720qw.mo59106k4(c12686bz4.f42524x1, c12686bz4);
        c12720qw.m59391x1(c12686bz2.f42524x1, c12686bz2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59212k4() {
        this.f42369k4 = null;
        this.f42372x1 = null;
        this.f42370kk = false;
        this.f42371to = 0;
        this.f42368h4.m59419k4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m59213k4(List<List<InterfaceC1861h4>> list) {
        if (this.f42369k4 == null) {
            this.f42369k4 = new List<>();
            this.f42372x1 = new List<>();
        }
        if (!this.f42370kk) {
            this.f42370kk = true;
            this.f42371to = this.f42369k4.size();
        }
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            List<InterfaceC1861h4> list2 = (List) c1869to.mo9760kk();
            C12684bs.m58843k4(list2);
            this.f42369k4.addItem(list2);
            C1869to c1869to2 = new C1869to(list2);
            int iM59252rv = 0;
            while (c1869to2.mo9764x1()) {
                AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to2.mo9760kk();
                if (abstractC12729ts.mo58895yj() || abstractC12729ts.mo58932x_()) {
                    iM59252rv = abstractC12729ts.m59252rv() + iM59252rv;
                }
            }
            this.f42372x1.addItem(Integer.valueOf(m59218to() + iM59252rv));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59214k4(C12686bz c12686bz, C12720qw c12720qw, int i) {
        this.f42368h4.f42534k4 = c12686bz.f42172ks.m59420kk();
        this.f42368h4.f42537x1 = c12686bz.f42172ks.m59418du();
        this.f42368h4.f42535kk = c12686bz.f42172ks.m59421to();
        int i2 = i;
        C12686bz c12686bz2 = c12686bz;
        while (this.f42368h4.f42534k4 < m59218to()) {
            int iIntValue = this.f42372x1.get_Item(this.f42368h4.f42537x1).intValue();
            C12748zj c12748zj = this.f42368h4;
            if (iIntValue - c12748zj.f42534k4 <= i2) {
                int iIntValue2 = this.f42372x1.get_Item(c12748zj.f42537x1).intValue();
                C12748zj c12748zj2 = this.f42368h4;
                i2 -= iIntValue2 - c12748zj2.f42534k4;
                c12748zj2.f42534k4 = this.f42372x1.get_Item(c12748zj2.f42537x1).intValue();
                C12748zj c12748zj3 = this.f42368h4;
                c12748zj3.f42535kk = this.f42369k4.get_Item(c12748zj3.f42537x1).size() - 1;
            } else {
                int iM59210k4 = m59210k4(c12748zj, i2, true);
                if (iM59210k4 > 0) {
                    i2 -= iM59210k4;
                } else {
                    AbstractC12742x6.kk kkVar = c12686bz2;
                    C12686bz c12686bz3 = (C12686bz) c12720qw.mo59103k4(c12686bz.f42519k4, c12686bz2.f42524x1 + 1, 1, this.f42368h4.f42534k4 - c12686bz2.f42172ks.m59420kk(), 0, 0, 0.0d, 0, 0, 0, 0.0d, kkVar);
                    c12720qw.mo59106k4(c12686bz3.f42524x1, c12686bz3);
                    c12720qw.m59391x1(kkVar.f42524x1, kkVar);
                    i2 = i;
                    c12686bz2 = c12686bz3;
                }
            }
        }
        C12686bz c12686bz4 = (C12686bz) c12720qw.mo59103k4(c12686bz.f42519k4, c12686bz2.f42524x1 + 1, 1, m59218to() - c12686bz2.f42172ks.m59420kk(), 0, 0, 0.0d, 0, 0, 0, 0.0d, c12686bz2);
        c12720qw.mo59106k4(c12686bz4.f42524x1, c12686bz4);
        c12720qw.m59391x1(c12686bz2.f42524x1, c12686bz2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59215k4(C12748zj c12748zj) {
        C12748zj c12748zj2 = this.f42368h4;
        c12748zj2.f42534k4 = c12748zj.f42534k4;
        c12748zj2.f42535kk = c12748zj.f42535kk;
        c12748zj2.f42537x1 = c12748zj.f42537x1;
    }
}
