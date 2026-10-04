package com.aspose.slides.internal.p462vj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p462vj.C11677wy;
import com.aspose.slides.internal.p513xw.AbstractC12725sv;
import com.aspose.slides.internal.p513xw.AbstractC12729ts;
import com.aspose.slides.internal.p513xw.AbstractC12742x6;
import com.aspose.slides.internal.p513xw.C12680ai;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.C12730u4;
import com.aspose.slides.internal.p513xw.C12733uz;
import com.aspose.slides.internal.p513xw.C12738wl;
import com.aspose.slides.internal.p513xw.InterfaceC12711lr;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C11647b3 extends AbstractC12742x6 {

    /* JADX INFO: renamed from: ar */
    private final int f39266ar;

    /* JADX INFO: renamed from: bv */
    private final int f39267bv;

    /* JADX INFO: renamed from: ix */
    private final C11677wy f39268ix;

    /* JADX INFO: renamed from: lr */
    private final C12730u4 f39269lr;

    /* JADX INFO: renamed from: ne */
    public C12724ss f39270ne;

    /* JADX INFO: renamed from: qq */
    private final int f39271qq;

    /* JADX INFO: renamed from: u4 */
    private final int f39272u4;

    /* JADX INFO: renamed from: um */
    private final int f39273um;

    /* JADX INFO: renamed from: uz */
    private int f39274uz;

    /* JADX INFO: renamed from: v4 */
    private final C12733uz f39275v4;

    /* JADX INFO: renamed from: wl */
    private int f39276wl;

    /* JADX INFO: renamed from: yd */
    private int f39277yd;

    public C11647b3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, int i9, C11677wy c11677wy, C12733uz c12733uz) {
        super(i2, i3, z, false, i9);
        this.f39277yd = -1;
        this.f39272u4 = i;
        this.f39271qq = i4;
        this.f39266ar = i6;
        this.f39273um = i7;
        this.f39267bv = i8;
        this.f39268ix = c11677wy;
        this.f39274uz = -1;
        this.f39275v4 = c12733uz;
        this.f39269lr = new C12730u4(this);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: fa */
    public int mo54806fa() {
        AbstractC12742x6.kk kkVarMo59105k4 = null;
        if (this.f39272u4 == 70) {
            for (int iM59377k4 = m59377k4(); iM59377k4 < this.f42485fa; iM59377k4++) {
                for (AbstractC12742x6.kk kkVarM59375du = m59375du(iM59377k4); kkVarM59375du != null; kkVarM59375du = kkVarM59375du.f42523up) {
                    kkVarMo59105k4 = mo59105k4(kkVarMo59105k4, kkVarM59375du);
                }
            }
            for (int iM59377k42 = m59377k4(); iM59377k42 < this.f42485fa; iM59377k42++) {
                for (AbstractC12742x6.kk kkVarM59375du2 = m59375du(iM59377k42); kkVarM59375du2 != null; kkVarM59375du2 = kkVarM59375du2.f42523up) {
                    if (kkVarM59375du2.f42524x1 != kkVarMo59105k4.f42524x1 && kkVarM59375du2.f42513ck > 1.0E7d) {
                        m59391x1(iM59377k42, kkVarM59375du2);
                    }
                }
            }
        } else {
            for (int iM59377k43 = m59377k4(); iM59377k43 < this.f42485fa; iM59377k43++) {
                for (AbstractC12742x6.kk kkVarM59375du3 = m59375du(iM59377k43); kkVarM59375du3 != null; kkVarM59375du3 = kkVarM59375du3.f42523up) {
                    kkVarMo59105k4 = mo59105k4(kkVarMo59105k4, kkVarM59375du3);
                    if (kkVarM59375du3 != kkVarMo59105k4) {
                        m59391x1(iM59377k43, kkVarM59375du3);
                    }
                }
            }
        }
        return kkVarMo59105k4.f42524x1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public int mo54807k4(int i, int i2, boolean[] zArr) throws Throwable {
        C12738wl c12738wlM59257k4 = this.f39269lr.m59257k4(i, i2, this.f42483du);
        if (c12738wlM59257k4.m59354x1() == this.f42483du && c12738wlM59257k4.m59353k4() == 0) {
            return this.f42483du;
        }
        zArr[0] = true;
        return c12738wlM59257k4.m59354x1() - c12738wlM59257k4.m59353k4();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: kk */
    public void mo54811kk(int i) {
        List<C11663ks> listM59305jd = this.f39275v4.m59305jd();
        if (listM59305jd == null) {
            return;
        }
        List.Enumerator<C11663ks> it = listM59305jd.iterator();
        while (it.hasNext()) {
            try {
                C11663ks next = it.next();
                if (next.m54906wy().m58978tq()) {
                    next.m54906wy().m58968k4(i, this.f39266ar, this.f39277yd, this.f39275v4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ks */
    public final int m54812ks() {
        return this.f39266ar;
    }

    /* JADX INFO: renamed from: ne */
    public final void m54813ne() {
        this.f39274uz = -1;
    }

    /* JADX INFO: renamed from: rv */
    public final int m54814rv() {
        return this.f39267bv;
    }

    /* JADX INFO: renamed from: x6 */
    public final C12733uz m54815x6() {
        return this.f39275v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private C11677wy.k4 m54805k4(AbstractC12725sv abstractC12725sv, int i, int i2, int i3, int i4, int i5, double d, int i6, int i7) {
        int i8;
        int i9;
        int i10 = this.f39266ar;
        int iM54891du = this.f39273um;
        int iM54893h4 = this.f39267bv;
        int i11 = ((i10 - iM54891du) - iM54893h4) / 2;
        int i12 = ((i10 - iM54891du) - iM54893h4) - i11;
        C11677wy c11677wy = this.f39268ix;
        boolean z = i5 == c11677wy.f39458x6;
        boolean z2 = i10 >= iM54891du && c11677wy.f39439c5.m52320vj() != 76;
        if (this.f39268ix.f39439c5.m52320vj() != 52) {
            i8 = i;
            C1869to c1869to = new C1869to(abstractC12725sv, i8);
            C11662kk c11662kk = null;
            i9 = i2;
            int iM54899to = 0;
            for (int i13 = i8; i13 <= i9; i13++) {
                AbstractC12729ts abstractC12729ts = (AbstractC12729ts) c1869to.mo9760kk();
                if (C7019kk.m27469x1(abstractC12729ts, C11675v4.class)) {
                    C11662kk c11662kkM54990c5 = ((C11675v4) abstractC12729ts).m54990c5();
                    if (c11662kkM54990c5 != null && c11662kk != c11662kkM54990c5) {
                        if (c11662kkM54990c5.m54892dy() && (c11662kkM54990c5.m54900x1() == 14 || c11662kkM54990c5.m54900x1() == 4)) {
                            if (c11662kkM54990c5.m54899to() > iM54899to) {
                                iM54899to = c11662kkM54990c5.m54899to();
                            }
                        } else if (this.f39268ix.f39439c5.m52323y2() == 30 || c11662kkM54990c5.m54894k4() == 0) {
                            int iM54897kk = c11662kkM54990c5.m54897kk();
                            if (z2) {
                                if (c11662kkM54990c5.m54891du() + iM54897kk > 0) {
                                    iM54891du = c11662kkM54990c5.m54891du() + iM54897kk;
                                }
                                if (c11662kkM54990c5.m54893h4() - iM54897kk > 0) {
                                    iM54893h4 = c11662kkM54990c5.m54893h4() - iM54897kk;
                                }
                                z2 = false;
                            }
                            if (c11662kkM54990c5.m54891du() + iM54897kk > iM54891du) {
                                iM54891du = c11662kkM54990c5.m54891du() + iM54897kk;
                            }
                            if (c11662kkM54990c5.m54893h4() - iM54897kk > iM54893h4) {
                                iM54893h4 = c11662kkM54990c5.m54893h4() - iM54897kk;
                            }
                        }
                        c11662kk = c11662kkM54990c5;
                    }
                    if (z && (!abstractC12729ts.m59251ks() || (c11662kkM54990c5 != null && c11662kkM54990c5.m54899to() > 0))) {
                        z = false;
                    }
                }
            }
            int i14 = iM54899to - iM54891du;
            if (iM54893h4 < i14) {
                iM54893h4 = i14;
            }
        } else {
            i8 = i;
            i9 = i2;
        }
        int i15 = iM54891du;
        C11677wy c11677wy2 = this.f39268ix;
        int i16 = i15 + iM54893h4;
        c11677wy2.f39447ne = i16;
        if (z) {
            return new C11677wy.k4(c11677wy2, c11677wy2.f39453up.indexOf(abstractC12725sv), i8, i9, i3, i4, i5, d, 0.0d, i6, i7, 0, this.f39268ix.f39458x6, 0, 0, 0);
        }
        return new C11677wy.k4(c11677wy2, c11677wy2.f39453up.indexOf(abstractC12725sv), i, i2, i3, i4, i5, d, 0.0d, i6, i7, i16, this.f39268ix.f39458x6, i11, i12, i15);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public void mo54808k4(int i, double d) {
        this.f39268ix.f39449rv.m54785k4(i, d);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public void mo54809k4(int i, boolean z, int i2, int i3) {
        int i4;
        if (this.f39268ix.f39443fa == 93 || !z || i2 >= 0 || i3 == (i4 = this.f39277yd)) {
            return;
        }
        if (i4 == -1 && i3 == 0) {
            while (i >= 0) {
                C11675v4 c11675v4 = (C11675v4) C7019kk.m27452k4((Object) this.f42496to.get_Item(i), C11675v4.class);
                if (c11675v4 != null) {
                    InterfaceC12711lr interfaceC12711lrM59135wl = c11675v4.m59135wl();
                    C11674uz c11674uz = (C11674uz) C7019kk.m27452k4((Object) interfaceC12711lrM59135wl, C11674uz.class);
                    if ((c11674uz == null && !C7019kk.m27469x1(interfaceC12711lrM59135wl, C11656e0.class)) || (c11674uz != null && c11674uz.m54984b3() == 93)) {
                        this.f39268ix.f39444ix = true;
                        break;
                    }
                }
                i--;
            }
        }
        if (this.f39268ix.f39444ix) {
            this.f39277yd = i3;
            throw new C12680ai();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo54810k4(AbstractC12742x6.kk kkVar, AbstractC12725sv abstractC12725sv, int i) {
        int i2;
        int i3;
        int iM8161to;
        int i4;
        int i5 = kkVar.f42518jd;
        int i6 = kkVar.f42524x1;
        int i7 = i6 < i ? this.f42492m9 : this.f42484dy;
        if (i7 != 23) {
            if (i7 == 39) {
                i2 = i5 > 0 ? i5 : 0;
                i3 = 0;
            } else if (i7 == 70 || i7 != 135) {
                i2 = 0;
            } else {
                i3 = i5 > 0 ? i5 : 0;
                i2 = 0;
            }
            int i8 = i2 + ((i6 != 1 && this.f42481c5 && this.f39268ix.f39445jd) ? this.f39271qq : 0);
            double d = (i7 != 70 || (i5 < 0 && (-i5) <= kkVar.f42515dy)) ? kkVar.f42521m9 : 0.0d;
            if (this.f39274uz == -1) {
                this.f39274uz = 0;
                this.f39276wl = 0;
            }
            if (this.f39276wl == this.f39268ix.f39449rv.m54783k4(this.f39274uz)) {
                this.f39274uz++;
                this.f39276wl = 0;
            }
            C11645ak c11645ak = this.f39268ix.f39449rv;
            if (kkVar.f42524x1 <= 1) {
                i4 = kkVar.f42516fa.f42519k4 + 1;
                iM8161to = 0;
            } else {
                iM8161to = 0;
                i4 = 0;
            }
            int i9 = kkVar.f42519k4;
            int i10 = kkVar.f42515dy;
            if (this.f39276wl <= 0) {
                iM8161to = ((C11677wy.x1) abstractC12725sv).f39485to.m8161to();
            }
            c11645ak.m54786k4(m54805k4(abstractC12725sv, i4, i9, i10 - iM8161to, kkVar.f42512c5, i5, d, i8, i3), this.f39274uz);
            this.f39276wl++;
        }
        i2 = i5 / 2;
        i3 = i2;
        int i82 = i2 + ((i6 != 1 && this.f42481c5 && this.f39268ix.f39445jd) ? this.f39271qq : 0);
        double d2 = (i7 != 70 || (i5 < 0 && (-i5) <= kkVar.f42515dy)) ? kkVar.f42521m9 : 0.0d;
        if (this.f39274uz == -1) {
        }
        if (this.f39276wl == this.f39268ix.f39449rv.m54783k4(this.f39274uz)) {
        }
        C11645ak c11645ak2 = this.f39268ix.f39449rv;
        if (kkVar.f42524x1 <= 1) {
        }
        int i92 = kkVar.f42519k4;
        int i102 = kkVar.f42515dy;
        if (this.f39276wl <= 0) {
        }
        c11645ak2.m54786k4(m54805k4(abstractC12725sv, i4, i92, i102 - iM8161to, kkVar.f42512c5, i5, d2, i82, i3), this.f39274uz);
        this.f39276wl++;
    }
}
