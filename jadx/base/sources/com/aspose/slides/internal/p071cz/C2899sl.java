package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.sl */
/* JADX INFO: loaded from: classes3.dex */
class C2899sl extends AbstractC2876qp {

    /* JADX INFO: renamed from: du */
    private List<C2985yu> f8742du;

    /* JADX INFO: renamed from: k4 */
    private final C2891s1 f8743k4;

    /* JADX INFO: renamed from: kk */
    private final C2778ji f8744kk;

    /* JADX INFO: renamed from: to */
    private List<C2857pd> f8745to;

    /* JADX INFO: renamed from: x1 */
    private final C2711eb f8746x1;

    public C2899sl(C2711eb c2711eb, C2891s1 c2891s1, C2778ji c2778ji) {
        if (c2711eb.m12219du() == null || c2711eb.m12227to() == null) {
            throw new ArgumentException("TextBody must contain predefined paths and coordinates");
        }
        this.f8746x1 = c2711eb;
        this.f8743k4 = c2891s1;
        this.f8744kk = c2778ji;
        this.f8745to = new List<>();
        this.f8742du = new List<>();
        m12524dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m12524dy() {
        C12007ix[] c12007ixArr;
        C2674bu[] c2674buArr;
        int i;
        AbstractC2701dn[] abstractC2701dnArr;
        C2899sl c2899sl = this;
        C12007ix[] c12007ixArrM12219du = c2899sl.f8746x1.m12219du();
        C2674bu[] c2674buArrM12227to = c2899sl.f8746x1.m12227to();
        double dM67491kk = 4.0d;
        if (C7019kk.m27469x1(c2899sl.f8746x1.m12220k4().m12127k4(), AbstractC2846of.class) || C7019kk.m27469x1(c2899sl.f8746x1.m12220k4().m12127k4(), AbstractC2837nv.class)) {
            C2842o2 c2842o2Clone = c2899sl.m12525k4(c12007ixArrM12219du).Clone();
            dM67491kk = C14116yg.m67491kk(4.0d, C14116yg.m67502x1(c2899sl.f8743k4.m12521x1().m12482k4() / c2842o2Clone.m12441m9(), c2899sl.f8743k4.m12521x1().m12484x1() / c2842o2Clone.m12434dy()) * 2.0d);
        }
        double d = dM67491kk;
        C2957x2[] c2957x2ArrM12228x1 = c2899sl.f8746x1.m12228x1();
        int length = c2957x2ArrM12228x1.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C2957x2 c2957x2 = c2957x2ArrM12228x1[i2];
            if (((C2767iq) C7019kk.m27452k4((Object) c2957x2.m12587k4().m12267x1(), C2767iq.class)) != null) {
                C2674bu c2674bu = c2674buArrM12227to[i3];
                C12007ix c12007ixClone = c12007ixArrM12219du[i3].Clone();
                c2674bu.m12160x1(d, d, false);
                c2674bu.m12144du();
                c2674bu.m12157m9();
                double d2 = 1.0d / d;
                c2674bu.m12160x1(d2, d2, false);
                c2674bu.m12144du();
                C2857pd c2857pd = new C2857pd(C2840nz.m12423k4(c2674bu), new C2778ji());
                c2899sl.f8745to.addItem(c2857pd);
                c12007ixArr = c12007ixArrM12219du;
                c2674buArr = c2674buArrM12227to;
                c2899sl.f8742du.addItem(new C2985yu(c2857pd, new C2842o2(c12007ixClone.m56571to(), c12007ixClone.m56554dy(), c12007ixClone.m56556h4(), c12007ixClone.m56558k4())));
                i3++;
            } else {
                c12007ixArr = c12007ixArrM12219du;
                c2674buArr = c2674buArrM12227to;
            }
            AbstractC2701dn[] abstractC2701dnArrM12592x1 = c2957x2.m12592x1();
            int length2 = abstractC2701dnArrM12592x1.length;
            int i4 = 0;
            while (i4 < length2) {
                AbstractC2701dn abstractC2701dn = abstractC2701dnArrM12592x1[i4];
                C2726fc c2726fc = (C2726fc) C7019kk.m27452k4((Object) abstractC2701dn, C2726fc.class);
                if (c2726fc != null) {
                    int i5 = 0;
                    while (i5 < c2726fc.m12238k4().length()) {
                        if (!C14117yj.m67531kk(c2726fc.m12238k4().charAt(i5)) || c2726fc.m12238k4().charAt(i5) == '\t') {
                            C2674bu c2674bu2 = c2674buArr[i3];
                            C12007ix c12007ixClone2 = c12007ixArr[i3].Clone();
                            i = i5;
                            c2674bu2.m12160x1(d, d, false);
                            c2674bu2.m12144du();
                            c2674bu2.m12157m9();
                            double d3 = 1.0d / d;
                            c2674bu2.m12160x1(d3, d3, false);
                            c2674bu2.m12144du();
                            C2857pd c2857pd2 = new C2857pd(C2840nz.m12423k4(c2674bu2), abstractC2701dn.m12205to());
                            c2899sl.f8745to.addItem(c2857pd2);
                            abstractC2701dnArr = abstractC2701dnArrM12592x1;
                            c2899sl.f8742du.addItem(new C2985yu(c2857pd2, new C2842o2(c12007ixClone2.m56571to(), c12007ixClone2.m56554dy(), c12007ixClone2.m56556h4(), c12007ixClone2.m56558k4())));
                            i3++;
                        } else {
                            abstractC2701dnArr = abstractC2701dnArrM12592x1;
                            i = i5;
                        }
                        i5 = i + 1;
                        c2899sl = this;
                        abstractC2701dnArrM12592x1 = abstractC2701dnArr;
                    }
                }
                i4++;
                c2899sl = this;
                abstractC2701dnArrM12592x1 = abstractC2701dnArrM12592x1;
            }
            i2++;
            c2899sl = this;
            c12007ixArrM12219du = c12007ixArr;
            c2674buArrM12227to = c2674buArr;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C2842o2 m12525k4(C12007ix[] c12007ixArr) {
        if (c12007ixArr.length == 0) {
            return new C2842o2();
        }
        double dM67502x1 = -1.7976931348623157E308d;
        double dM67502x12 = -1.7976931348623157E308d;
        double dM67491kk = Double.MAX_VALUE;
        double dM67491kk2 = Double.MAX_VALUE;
        for (C12007ix c12007ix : c12007ixArr) {
            dM67491kk = C14116yg.m67491kk(dM67491kk, c12007ix.m56571to());
            dM67502x1 = C14116yg.m67502x1(dM67502x1, c12007ix.m56556h4());
            dM67491kk2 = C14116yg.m67491kk(dM67491kk2, c12007ix.m56554dy());
            dM67502x12 = C14116yg.m67502x1(dM67502x12, c12007ix.m56558k4());
        }
        return new C2842o2(dM67491kk, dM67491kk2, dM67502x1, dM67502x12);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return this.f8743k4.m12521x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final C2985yu[] m12527x1() {
        return this.f8742du.toArray(new C2985yu[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2857pd[] m12526k4() {
        return this.f8745to.toArray(new C2857pd[0]);
    }
}
