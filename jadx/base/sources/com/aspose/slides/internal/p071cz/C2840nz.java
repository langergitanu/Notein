package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.nz */
/* JADX INFO: loaded from: classes3.dex */
final class C2840nz {

    /* JADX INFO: renamed from: du */
    private final C2891s1 f8689du;

    /* JADX INFO: renamed from: k4 */
    private final List<C2857pd> f8690k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private final C2711eb f8691kk;

    /* JADX INFO: renamed from: to */
    private final C2891s1 f8692to;

    /* JADX INFO: renamed from: x1 */
    private final double f8693x1;

    public C2840nz(C2711eb c2711eb, C2891s1 c2891s1, double d) {
        this.f8691kk = c2711eb;
        this.f8689du = c2891s1;
        this.f8692to = new C2891s1(new C2706dw(c2711eb.m12220k4().m12131x1() + c2891s1.m12516k4().m12210k4(), c2711eb.m12220k4().m12129kk() + c2891s1.m12516k4().m12212x1()), new C2867q6((c2891s1.m12521x1().m12482k4() - c2711eb.m12220k4().m12131x1()) - c2711eb.m12220k4().m12130to(), (c2891s1.m12521x1().m12484x1() - c2711eb.m12220k4().m12129kk()) - c2711eb.m12220k4().m12125du()));
        this.f8693x1 = d;
        m12428x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static C2738gf m12423k4(C2674bu c2674bu) {
        C2738gf c2738gf = new C2738gf();
        C12025x6[] c12025x6ArrM12145dy = c2674bu.m12145dy();
        int[] iArrM12143c5 = c2674bu.m12143c5();
        int i = -1;
        for (int i2 = 0; i2 < iArrM12143c5.length; i2++) {
            int i3 = iArrM12143c5[i2];
            if ((i3 & 1) != 1) {
                i = i2;
            } else if ((i3 & 128) == 128) {
                int i4 = (i2 - i) + 1;
                C2977y9 c2977y9 = new C2977y9(0);
                for (int i5 = 0; i5 < i4; i5++) {
                    C12025x6 c12025x6Clone = c12025x6ArrM12145dy[i + i5].Clone();
                    c2977y9.m12629k4(new C2865q1(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk()));
                }
                c2977y9.m12624du();
                c2738gf.m12285k4(c2977y9);
                i = -1;
            } else if (1 != i3 && 161 != i3) {
                throw new ApplicationException();
            }
        }
        return c2738gf;
    }

    /* JADX INFO: renamed from: x1 */
    private void m12428x1() {
        double d;
        int i;
        double d2;
        C2840nz c2840nz = this;
        C2778ji c2778ji = new C2778ji();
        boolean z = c2840nz.f8691kk.m12220k4().m12127k4() != null;
        if (c2840nz.f8691kk.m12227to() != null) {
            C2899sl c2899sl = new C2899sl(c2840nz.f8691kk, c2840nz.f8692to, c2778ji);
            c2840nz.f8690k4.addRange(AbstractC14092to.m67204k4((Object[]) c2899sl.m12526k4()));
            if (z) {
                c2840nz.m12426k4(AbstractC14092to.m67204k4((Object[]) c2899sl.m12527x1()));
                return;
            }
            return;
        }
        AbstractC2871qe[] abstractC2871qeArrM12491h4 = new C2763i9(c2840nz.f8691kk, c2840nz.f8692to, c2778ji).m12491h4();
        List list = z ? new List() : null;
        for (AbstractC2871qe abstractC2871qe : abstractC2871qeArrM12491h4) {
            C2692d2 c2692d2 = (C2692d2) abstractC2871qe;
            AbstractC2871qe[] abstractC2871qeArrM12491h42 = c2692d2.m12491h4();
            int length = abstractC2871qeArrM12491h42.length;
            int i2 = 0;
            while (i2 < length) {
                C2688cl c2688cl = (C2688cl) abstractC2871qeArrM12491h42[i2];
                double dM12210k4 = c2688cl.m12490to().m12210k4() + c2692d2.m12490to().m12210k4();
                double dM12212x1 = c2688cl.m12490to().m12212x1() + c2692d2.m12490to().m12212x1();
                if (c2688cl.m12177k4() != null) {
                    i = i2;
                    c2840nz.m12424k4(dM12210k4, dM12212x1, c2688cl.m12177k4());
                    d2 = dM12210k4;
                    d = dM12212x1;
                } else {
                    d = dM12212x1;
                    i = i2;
                    d2 = dM12210k4;
                }
                AbstractC2871qe[] abstractC2871qeArrM12491h43 = c2688cl.m12491h4();
                int length2 = abstractC2871qeArrM12491h43.length;
                int i3 = 0;
                while (i3 < length2) {
                    C2918tx c2918tx = (C2918tx) abstractC2871qeArrM12491h43[i3];
                    AbstractC2871qe[] abstractC2871qeArrM12491h44 = c2918tx.m12491h4();
                    int length3 = abstractC2871qeArrM12491h44.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        C2959x4 c2959x4 = (C2959x4) abstractC2871qeArrM12491h44[i4];
                        int i5 = i4;
                        AbstractC2871qe[] abstractC2871qeArr = abstractC2871qeArrM12491h43;
                        int i6 = length2;
                        int i7 = i3;
                        AbstractC2871qe[] abstractC2871qeArr2 = abstractC2871qeArrM12491h44;
                        int i8 = length3;
                        m12425k4(c2918tx.m12490to().m12210k4() + d2, c2918tx.m12490to().m12212x1() + d, c2959x4);
                        if (z) {
                            C2865q1 c2865q1 = new C2865q1(this.f8692to.m12516k4().m12210k4() + c2959x4.m12490to().m12210k4() + c2918tx.m12490to().m12210k4() + d2, this.f8692to.m12516k4().m12212x1() + c2959x4.m12490to().m12212x1() + c2918tx.m12490to().m12212x1() + d);
                            list.addItem(new C2985yu((C2857pd) OooO0O0.OooO00o(this.f8690k4, 1), new C2842o2(c2865q1.m12477k4(), c2865q1.m12481x1(), c2959x4.mo12122kk().m12482k4() + c2865q1.m12477k4(), c2865q1.m12481x1() - c2959x4.mo12122kk().m12484x1()).Clone()));
                        }
                        i4 = i5 + 1;
                        abstractC2871qeArrM12491h43 = abstractC2871qeArr;
                        length2 = i6;
                        i3 = i7;
                        abstractC2871qeArrM12491h44 = abstractC2871qeArr2;
                        length3 = i8;
                    }
                    i3++;
                    abstractC2871qeArrM12491h43 = abstractC2871qeArrM12491h43;
                }
                c2840nz = this;
                i2 = i + 1;
            }
        }
        if (z) {
            c2840nz.m12426k4(list);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12424k4(double d, double d2, AbstractC2788k9 abstractC2788k9) {
        for (AbstractC2871qe abstractC2871qe : abstractC2788k9.m12491h4()) {
            C2918tx c2918tx = (C2918tx) abstractC2871qe;
            for (AbstractC2871qe abstractC2871qe2 : c2918tx.m12491h4()) {
                m12425k4(c2918tx.m12490to().m12210k4() + abstractC2788k9.m12490to().m12210k4() + d, c2918tx.m12490to().m12212x1() + abstractC2788k9.m12490to().m12212x1() + d2, (C2959x4) abstractC2871qe2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12425k4(double d, double d2, C2959x4 c2959x4) {
        C2674bu c2674buM12594x1 = c2959x4.m12594x1();
        C11913yj c11913yj = new C11913yj();
        try {
            c2674buM12594x1.m12156kk();
            c2674buM12594x1.m12152k4(d, d2, false);
            c2674buM12594x1.m12144du();
            m12427k4(c2674buM12594x1, c2959x4.m12593k4());
        } finally {
            c11913yj.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12426k4(IGenericEnumerable<C2985yu> iGenericEnumerable) {
        AbstractC2878qv abstractC2878qvM12127k4 = this.f8691kk.m12220k4().m12127k4();
        if (abstractC2878qvM12127k4 != null) {
            abstractC2878qvM12127k4.m12499k4(this.f8689du);
            C2857pd[] c2857pdArrM12500k4 = abstractC2878qvM12127k4.m12500k4(iGenericEnumerable, this.f8691kk);
            this.f8690k4.clear();
            this.f8690k4.addRange(AbstractC14092to.m67204k4((Object[]) c2857pdArrM12500k4));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12427k4(C2674bu c2674bu, C2778ji c2778ji) {
        List<C2857pd> list;
        C2857pd c2857pd;
        if (c2674bu.m12147jd() == 0) {
            C2738gf c2738gf = new C2738gf();
            list = this.f8690k4;
            c2857pd = new C2857pd(c2738gf, c2778ji);
        } else {
            c2674bu.m12152k4(this.f8692to.m12516k4().m12210k4(), this.f8692to.m12516k4().m12212x1(), false);
            c2674bu.m12144du();
            C2738gf c2738gfM12423k4 = m12423k4(c2674bu);
            list = this.f8690k4;
            c2857pd = new C2857pd(c2738gfM12423k4, c2778ji);
        }
        list.addItem(c2857pd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2857pd[] m12429k4() {
        return this.f8690k4.toArray(new C2857pd[0]);
    }
}
