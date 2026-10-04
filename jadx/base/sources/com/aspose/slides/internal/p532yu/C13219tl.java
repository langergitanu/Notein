package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.tl */
/* JADX INFO: loaded from: classes5.dex */
public final class C13219tl extends C13192rv {

    /* JADX INFO: renamed from: c5 */
    private C12979f7 f44398c5;

    /* JADX INFO: renamed from: ck */
    private int f44399ck;

    /* JADX INFO: renamed from: du */
    private C13047jd f44400du;

    /* JADX INFO: renamed from: dy */
    private C12930cj f44401dy;

    /* JADX INFO: renamed from: h4 */
    private C13047jd[] f44402h4;

    /* JADX INFO: renamed from: jd */
    private int f44403jd;

    /* JADX INFO: renamed from: m9 */
    private C13047jd f44404m9;

    public C13219tl(C13047jd c13047jd, C13047jd[] c13047jdArr, C12930cj c12930cj, C12979f7 c12979f7, int i, int i2, boolean z, C13047jd c13047jd2, int i3) {
        super(i2, false, z);
        this.f44400du = c13047jd;
        this.f44402h4 = c13047jdArr;
        this.f44401dy = c12930cj;
        this.f44398c5 = c12979f7;
        this.f44404m9 = c13047jd2;
        this.f44403jd = i3;
        this.f44399ck = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[PHI: r2
      0x006f: PHI (r2v11 java.lang.String) = (r2v10 java.lang.String), (r2v13 java.lang.String) binds: [B:19:0x006d, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList mo60049k4(C13190rs c13190rs, boolean z) {
        String strMo60242c5;
        List<C13162q3> list = c13190rs.f44269x6;
        ArrayList arrayList = null;
        if (list != null) {
            C13047jd c13047jd = new C13047jd(this.f44398c5.m60614k4());
            for (int i = c13190rs.f44267up.f44121to - 1; i >= 0; i--) {
                c13047jd.m61007x1(list.get_Item(i).f44227k4);
            }
            for (int iM61003to = c13047jd.m61003to(-1); iM61003to != -1; iM61003to = c13047jd.m61003to(iM61003to)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                if (this.f44398c5.m60616k4(iM61003to).f43529k4 >= 0) {
                    AbstractC12950dp abstractC12950dp = (AbstractC12950dp) C7019kk.m27452k4(this.f44398c5.m60616k4(iM61003to).f43530x1, AbstractC12950dp.class);
                    if (abstractC12950dp == null) {
                        strMo60242c5 = this.f44401dy.m60141x1(this.f44398c5.m60616k4(iM61003to).f43529k4);
                        if (strMo60242c5.length() != 0) {
                            arrayList.addItem(strMo60242c5);
                        }
                    } else {
                        strMo60242c5 = abstractC12950dp.mo60242c5();
                        if (!arrayList.contains(strMo60242c5)) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: x1 */
    public boolean mo60053x1(C13190rs c13190rs) {
        return c13190rs.f44270yj;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public ArrayList mo60050k4(C13190rs c13190rs, boolean z, C13129ny c13129ny) {
        AbstractC12950dp abstractC12950dp;
        ArrayList arrayList = new ArrayList();
        List<C13162q3> list = c13190rs.f44269x6;
        if (list != null) {
            C13047jd c13047jd = new C13047jd(this.f44398c5.m60614k4());
            for (int i = c13190rs.f44267up.f44121to - 1; i >= 0; i--) {
                c13047jd.m61007x1(list.get_Item(i).f44227k4);
            }
            for (int iM61003to = c13047jd.m61003to(-1); iM61003to != -1; iM61003to = c13047jd.m61003to(iM61003to)) {
                if (this.f44398c5.m60616k4(iM61003to).f43529k4 >= 0 && (abstractC12950dp = (AbstractC12950dp) C7019kk.m27452k4(this.f44398c5.m60616k4(iM61003to).f43530x1, AbstractC12950dp.class)) != null) {
                    C13192rv.m61454k4(abstractC12950dp, c13129ny, arrayList);
                }
            }
        }
        return arrayList;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public Object mo60051k4(C13890ei c13890ei, C13190rs c13190rs, int[] iArr) {
        int i;
        int i2;
        iArr[0] = 0;
        int iM60135k4 = this.f44401dy.m60135k4(c13890ei);
        List<C13162q3> list = c13190rs.f44269x6;
        int i3 = c13190rs.f44267up.f44121to;
        C13162q3 c13162q3 = new C13162q3();
        int i4 = -1;
        int i5 = 0;
        boolean z = false;
        int i6 = -1;
        int i7 = -1;
        while (i5 < i3) {
            list.get_Item(i5).CloneTo(c13162q3);
            C13047jd c13047jd = c13162q3.f44227k4;
            int iM61003to = c13047jd.m61003to(-1);
            while (true) {
                if (iM61003to == -1) {
                    break;
                }
                if (iM60135k4 == this.f44398c5.m60616k4(iM61003to).f43529k4) {
                    if (i6 == -1) {
                        i6 = i5;
                    }
                    i7 = iM61003to;
                    z = true;
                } else {
                    iM61003to = c13047jd.m61003to(iM61003to);
                }
            }
            if (z && C7019kk.m27469x1(this.f44398c5.m60616k4(i7).f43530x1, C13021hu.class)) {
                break;
            }
            i5++;
        }
        if (i5 == i3 && i7 != -1) {
            i5 = i6;
        }
        if (i5 < i3) {
            if (i5 != 0) {
                list.removeRange(0, i5);
            }
            i = i3 - i5;
            int i8 = 0;
            while (i8 < i) {
                list.get_Item(i8).CloneTo(c13162q3);
                if (c13162q3.f44227k4.m61001kk(i7)) {
                    c13162q3.f44227k4 = this.f44402h4[i7];
                    list.set_Item(i8, c13162q3.Clone());
                    i8++;
                } else {
                    i--;
                    if (i > 0) {
                        C13162q3 c13162q3Clone = list.get_Item(i).Clone();
                        list.set_Item(i, list.get_Item(i8).Clone());
                        list.set_Item(i8, c13162q3Clone.Clone());
                    }
                }
            }
        } else {
            i = 0;
        }
        if (i <= 0) {
            iArr[0] = -1;
            c13190rs.f44261kk = false;
            return null;
        }
        int i9 = 10000;
        boolean z2 = true;
        if (i >= 10000) {
            c13190rs.f44264ne = true;
            i /= 2;
        }
        int i10 = i - 1;
        boolean z3 = false;
        while (i10 >= 0) {
            C13047jd c13047jd2 = list.get_Item(i10).f44227k4;
            z3 = (z3 || c13047jd2.m61001kk(this.f44399ck)) ? z2 : false;
            int i11 = i10;
            while (i < i9 && c13047jd2.m61002kk(this.f44404m9)) {
                C13047jd c13047jdM61000kk = c13047jd2.m61000kk();
                c13047jdM61000kk.m60998k4(this.f44404m9);
                int iM61003to2 = c13047jdM61000kk.m61003to(i4);
                C12893af c12893af = (C12893af) C7019kk.m27452k4(this.f44398c5.m60616k4(iM61003to2).f43530x1, C12893af.class);
                list.get_Item(i11).CloneTo(c13162q3);
                int i12 = i + 2;
                if (i12 >= list.size()) {
                    list.addItem(new C13162q3());
                    list.addItem(new C13162q3());
                }
                C13162q3 c13162q3Clone2 = list.get_Item(i).Clone();
                i2 = i4;
                if (c13162q3Clone2.f44228x1 == null) {
                    c13162q3Clone2.f44228x1 = (C14046bv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C14046bv.class), this.f44403jd));
                }
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c13162q3.f44228x1), 0, AbstractC14092to.m67208k4((Object) c13162q3Clone2.f44228x1), 0, c13162q3.f44228x1.length);
                C14046bv c14046bvClone = C14046bv.m66489to(c13162q3Clone2.f44228x1[c12893af.m61453x1()]).Clone();
                if (C14046bv.m66453dy(c14046bvClone, c12893af.m60041kk())) {
                    c13162q3Clone2.f44227k4 = this.f44402h4[iM61003to2];
                    C7019kk.m27440jd(0, 9).CloneTo(c13162q3Clone2.f44228x1[c12893af.m61453x1()]);
                    list.set_Item(i, c13162q3Clone2.Clone());
                    i11 = i;
                    i++;
                } else {
                    if (C14046bv.m66448ck(c14046bvClone, c12893af.m60042to())) {
                        c13162q3Clone2.f44227k4 = c12893af.m60037du();
                        list.set_Item(i, c13162q3Clone2.Clone());
                        i++;
                        break;
                    }
                    c13162q3Clone2.f44227k4 = c12893af.m60037du();
                    list.set_Item(i, c13162q3Clone2.Clone());
                    int i13 = i + 1;
                    list.get_Item(i13).CloneTo(c13162q3Clone2);
                    if (c13162q3Clone2.f44228x1 == null) {
                        c13162q3Clone2.f44228x1 = (C14046bv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C14046bv.class), this.f44403jd));
                    }
                    AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c13162q3.f44228x1), 0, AbstractC14092to.m67208k4((Object) c13162q3Clone2.f44228x1), 0, c13162q3.f44228x1.length);
                    c13162q3Clone2.f44227k4 = this.f44402h4[iM61003to2];
                    C7019kk.m27440jd(0, 9).CloneTo(c13162q3Clone2.f44228x1[c12893af.m61453x1()]);
                    list.set_Item(i13, c13162q3Clone2.Clone());
                    i11 = i13;
                    i = i12;
                }
                c13047jd2 = list.get_Item(i11).f44227k4;
                z3 = z3 || c13047jd2.m61001kk(this.f44399ck);
                i4 = i2;
                i9 = 10000;
            }
            i2 = i4;
            i10--;
            i4 = i2;
            i9 = 10000;
            z2 = true;
        }
        c13190rs.f44270yj = z3;
        c13190rs.f44267up.f44121to = i;
        return this.f44398c5.m60616k4(i7).f43530x1;
    }

    @Override // com.aspose.slides.internal.p532yu.C13192rv
    /* JADX INFO: renamed from: k4 */
    public void mo60052k4(C13190rs c13190rs) {
        this.f44398c5.m60614k4();
        List<C13162q3> list = c13190rs.f44269x6;
        if (list != null) {
            list.clear();
        } else {
            list = new List<>();
            c13190rs.f44269x6 = list;
        }
        C13162q3 c13162q3 = new C13162q3();
        c13162q3.f44227k4 = this.f44400du.m61000kk();
        c13162q3.f44228x1 = (C14046bv[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C14046bv.class), this.f44403jd));
        list.addItem(c13162q3.Clone());
        c13190rs.f44267up.f44121to = 1;
        c13190rs.f44270yj = c13162q3.f44227k4.m61001kk(this.f44399ck);
    }
}
