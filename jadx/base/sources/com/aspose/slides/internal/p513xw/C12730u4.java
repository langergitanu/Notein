package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p371qw.C9959up;
import com.aspose.slides.internal.p462vj.C11647b3;
import com.aspose.slides.internal.p462vj.C11663ks;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12730u4 {

    /* JADX INFO: renamed from: k4 */
    private C12733uz f42395k4;

    /* JADX INFO: renamed from: x1 */
    private C11647b3 f42396x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.u4$k4 */
    public static class k4<T> {

        /* JADX INFO: renamed from: k4 */
        private List<T> f42397k4;

        /* JADX INFO: renamed from: x1 */
        private int f42398x1;

        public k4(List<T> list) {
            this.f42397k4 = list;
            this.f42398x1 = list.size() - 1;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m59259k4() {
            return this.f42398x1 != -1;
        }

        /* JADX INFO: renamed from: x1 */
        public final T m59260x1() {
            List<T> list = this.f42397k4;
            int i = this.f42398x1;
            this.f42398x1 = i - 1;
            return list.get_Item(i);
        }
    }

    public C12730u4() {
        this.f42396x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m59253k4(int i, List<C12702ix> list, C12014ne c12014ne, int[] iArr, boolean z) {
        List.Enumerator<C12702ix> it = list.iterator();
        while (it.hasNext()) {
            try {
                C12702ix next = it.next();
                if (c12014ne.m56686x1(next.m58955bs().Clone())) {
                    iArr[0] = z ? C14116yg.m67483k4(iArr[0], next.m58955bs().m56668h4()) : C14116yg.m67507x1(iArr[0], next.m58955bs().m56681to());
                    if (next.f42253c5 == -1) {
                        next.f42253c5 = i;
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return iArr[0];
    }

    /* JADX INFO: renamed from: du */
    public int mo59054du() {
        return this.f42396x1.m59388up();
    }

    /* JADX INFO: renamed from: kk */
    public int mo59055kk() {
        return this.f42396x1.m54814rv();
    }

    /* JADX INFO: renamed from: to */
    public C12724ss mo59056to() {
        return this.f42396x1.f39270ne;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo59057x1() {
        return this.f42396x1.m54812ks();
    }

    public C12730u4(C11647b3 c11647b3) {
        this.f42396x1 = c11647b3;
        this.f42395k4 = c11647b3.m54815x6();
    }

    /* JADX INFO: renamed from: k4 */
    private static C12702ix m59254k4(k4<C12702ix> k4Var, C12702ix c12702ix, int i, int[] iArr) {
        iArr[0] = c12702ix.m58955bs().m56670k4();
        while (k4Var.m59259k4()) {
            C12702ix c12702ixM59260x1 = k4Var.m59260x1();
            if (c12702ixM59260x1.m58955bs().m56670k4() > i) {
                iArr[0] = iArr[0] + i;
                return c12702ixM59260x1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12733uz m59256k4() {
        return this.f42395k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12738wl m59257k4(int i, int i2, int i3) throws Throwable {
        List<C11663ks> list;
        int i4;
        C12014ne c12014ne;
        int i5;
        int iM56668h4;
        int iM58974os;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        List<C11663ks> listM59305jd = this.f42395k4.m59305jd();
        boolean z = false;
        if (listM59305jd == null) {
            return new C12738wl(0, i9);
        }
        int iMo59057x1 = mo59057x1() * i;
        int iM59310m9 = this.f42395k4.m59310m9();
        List list2 = new List();
        List list3 = new List();
        C12014ne c12014ne2 = new C12014ne(0, mo59057x1() * i, iM59310m9, mo59057x1() * (i + 1));
        int i10 = i9;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z2 = z;
            if (i11 >= listM59305jd.size()) {
                C12014ne c12014ne3 = c12014ne2;
                int[] iArr = {i12};
                m59253k4(i, list2, c12014ne3.Clone(), iArr, true);
                int i14 = iArr[0];
                int[] iArr2 = {i10};
                m59253k4(i, list3, c12014ne3.Clone(), iArr2, false);
                return new C12738wl(i14, iArr2[0]);
            }
            C11663ks c11663ks = listM59305jd.get_Item(i11);
            if (c11663ks.m54906wy() == null) {
                c11663ks.mo49031x6();
                c11663ks.m54906wy().mo54974k4((InterfaceC12711lr) c11663ks);
                c11663ks.mo54974k4(this.f42395k4.m59307k4());
                list = listM59305jd;
                if (C7019kk.m27469x1(this.f42395k4.m59307k4(), C9959up.class)) {
                    c11663ks.m54906wy().m58977to(true);
                }
            } else {
                list = listM59305jd;
            }
            C12702ix c12702ixM54906wy = c11663ks.m54906wy();
            if (c12702ixM54906wy.m58988zj() >= i8 || !(c12702ixM54906wy.m58982vj() == null || c12702ixM54906wy.m58982vj() == this.f42395k4.m59307k4().mo59012up())) {
                i4 = iM59310m9;
                c12014ne = c12014ne2;
                i5 = i11;
            } else if (c12702ixM54906wy.m58972m4() && this.f42395k4.m59309kk() != null && this.f42395k4.m59309kk().m54771b3()) {
                c12702ixM54906wy.m58973m9(i9);
                i4 = iM59310m9;
                c12014ne = c12014ne2;
                i5 = i11;
            } else if (c12702ixM54906wy.m58978tq()) {
                i4 = iM59310m9;
                c12014ne = c12014ne2;
                i5 = i11;
                if (c12702ixM54906wy.m58955bs().m56670k4() > iMo59057x1) {
                    m59255k4(c12702ixM54906wy, (List<C12702ix>) list3, (List<C12702ix>) list2);
                }
            } else {
                int[] iArr3 = {i12};
                m59253k4(i, list2, c12014ne2.Clone(), iArr3, true);
                int i15 = iArr3[z2 ? 1 : 0];
                int[] iArr4 = {i10};
                m59253k4(i, list3, c12014ne2.Clone(), iArr4, z2);
                i10 = iArr4[z2 ? 1 : 0];
                c12702ixM54906wy.m58967k4(i, i8, i10 - i15, this);
                c12702ixM54906wy.m58985x1((Object) null);
                if (c12702ixM54906wy.m58979ts() == null) {
                    c12702ixM54906wy.m58969k4(this.f42395k4.m59307k4().mo59012up());
                }
                if (c12702ixM54906wy.m58988zj() > 0) {
                    c12702ixM54906wy.m58980up(i);
                }
                int iM58964j2 = c12702ixM54906wy.m58964j2();
                c12702ixM54906wy.m58962h4(mo59057x1());
                k4 k4Var = new k4(list2);
                k4 k4Var2 = new k4(list3);
                i4 = iM59310m9;
                C12702ix c12702ixM59254k4 = k4Var.m59259k4() ? (C12702ix) k4Var.m59260x1() : null;
                C12702ix c12702ixM59254k42 = k4Var2.m59259k4() ? (C12702ix) k4Var2.m59260x1() : null;
                while (true) {
                    if (c12702ixM59254k4 != null) {
                        c12014ne = c12014ne2;
                        iM56668h4 = c12702ixM59254k4.m58955bs().m56668h4();
                    } else {
                        c12014ne = c12014ne2;
                        iM56668h4 = 0;
                    }
                    iM58974os = c12702ixM59254k42 != null ? c12702ixM59254k42.m58974os() : 0;
                    i5 = i11;
                    int i16 = iM56668h4 + iM58974os;
                    i6 = i15;
                    if (i16 > 0) {
                        if (i16 <= (this.f42395k4.m59304h4() ? i4 : i3) - iM58964j2) {
                            break;
                        }
                        int iM56670k4 = c12702ixM59254k4 != null ? c12702ixM59254k4.m58955bs().m56670k4() : 0;
                        int iM56670k42 = c12702ixM59254k42 != null ? c12702ixM59254k42.m58955bs().m56670k4() : 0;
                        if ((c12702ixM59254k42 == null || iM56670k4 < iM56670k42) && c12702ixM59254k4 != null) {
                            int[] iArr5 = {i13};
                            c12702ixM59254k4 = m59254k4(k4Var, c12702ixM59254k4, iM56670k4, iArr5);
                            i7 = iArr5[0];
                        } else {
                            int[] iArr6 = {i13};
                            c12702ixM59254k42 = m59254k4(k4Var2, c12702ixM59254k42, iM56670k42, iArr6);
                            i7 = iArr6[0];
                        }
                        i13 = i7;
                        c12014ne2 = c12014ne;
                        i11 = i5;
                        i15 = i6;
                    } else {
                        break;
                    }
                }
                if (c12702ixM54906wy.m58986y2()) {
                    c12702ixM54906wy.m58959dy(iM56668h4);
                } else if (c12702ixM54906wy.m58972m4()) {
                    c12702ixM54906wy.m58959dy(iM58974os > 0 ? iM58974os - iM58964j2 : i3 - iM58964j2);
                }
                c12702ixM54906wy.m58956c5(i13);
                if (c12702ixM54906wy.f42253c5 == -1) {
                    c12702ixM54906wy.f42253c5 = i;
                }
                m59255k4(c12702ixM54906wy, (List<C12702ix>) list3, (List<C12702ix>) list2);
                if (this.f42395k4.m59312x1() != null || c12702ixM54906wy.m58963he()) {
                    c12702ixM54906wy.m58956c5((mo59055kk() / 2) + c12702ixM54906wy.m58960em());
                } else {
                    c12702ixM54906wy.m58956c5(c12702ixM54906wy.m58960em() - (mo59055kk() / 2));
                }
                i12 = i6;
            }
            i11 = i5 + 1;
            i8 = i2;
            i9 = i3;
            listM59305jd = list;
            iM59310m9 = i4;
            c12014ne2 = c12014ne;
            z = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m59255k4(C12702ix c12702ix, List<C12702ix> list, List<C12702ix> list2) {
        if (c12702ix.m58983w6() <= 0) {
            return;
        }
        if (c12702ix.m58972m4()) {
            list.addItem(c12702ix);
        } else if (c12702ix.m58986y2()) {
            list2.addItem(c12702ix);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59258k4(C12733uz c12733uz) {
        this.f42395k4 = c12733uz;
    }
}
