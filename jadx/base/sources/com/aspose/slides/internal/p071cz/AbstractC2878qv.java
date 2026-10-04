package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.OooO0O0;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.qv */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2878qv extends AbstractC2770ix implements IGenericCloneable<AbstractC2878qv> {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f8727x1 = new C7017h4("textArchDown", "textArchDownPour", "textArchUp", "textArchUpPour", "textButton", "textButtonPour", "textCanDown", "textCanUp", "textCascadeDown", "textCascadeUp", "textChevron", "textChevronInverted", "textCircle", "textCirclePour", "textCurveDown", "textCurveUp", "textDeflate", "textDeflateBottom", "textDeflateInflate", "textDeflateInflateDeflate", "textDeflateTop", "textDoubleWave1", "textFadeDown", "textFadeLeft", "textFadeRight", "textFadeUp", "textInflate", "textInflateBottom", "textInflateTop", "textNoShape", "textPlain", "textRingInside", "textRingOutside", "textSlantDown", "textSlantUp", "textStop", "textTriangle", "textTriangleInverted", "textWave1", "textWave2", "textWave4");

    /* JADX INFO: renamed from: k4 */
    private C2891s1 f8728k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.cz.qv$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private double f8729du;

        /* JADX INFO: renamed from: h4 */
        private double f8730h4;

        /* JADX INFO: renamed from: k4 */
        private C2985yu[] f8731k4;

        /* JADX INFO: renamed from: kk */
        private C2828n2 f8732kk;

        /* JADX INFO: renamed from: m9 */
        private double f8733m9;

        /* JADX INFO: renamed from: to */
        private C2842o2 f8734to = new C2842o2();

        /* JADX INFO: renamed from: x1 */
        private int f8735x1;

        public k4(int i, C2985yu[] c2985yuArr, double d) {
            this.f8731k4 = c2985yuArr;
            this.f8735x1 = i;
            this.f8733m9 = d;
            m12503c5();
        }

        /* JADX INFO: renamed from: c5 */
        private void m12503c5() {
            this.f8732kk = new C2828n2(this.f8731k4);
            this.f8729du = 0.0d;
            this.f8730h4 = 0.0d;
            C2985yu[] c2985yuArr = this.f8731k4;
            if (c2985yuArr.length <= 0) {
                this.f8734to = new C2842o2();
                return;
            }
            int length = c2985yuArr.length;
            double dM67502x1 = -1.7976931348623157E308d;
            int i = 0;
            double dM67502x12 = -1.7976931348623157E308d;
            double dM67491kk = Double.MAX_VALUE;
            double dM67491kk2 = Double.MAX_VALUE;
            while (i < length) {
                C2842o2 c2842o2Clone = c2985yuArr[i].m12641x1().Clone();
                C2985yu[] c2985yuArr2 = c2985yuArr;
                int i2 = length;
                dM67491kk = C14116yg.m67491kk(dM67491kk, c2842o2Clone.m12437k4());
                dM67502x12 = C14116yg.m67502x1(dM67502x12, c2842o2Clone.m12440kk());
                dM67491kk2 = C14116yg.m67491kk(dM67491kk2, c2842o2Clone.m12443x1());
                dM67502x1 = C14116yg.m67502x1(dM67502x1, c2842o2Clone.m12442to());
                this.f8729du += c2842o2Clone.m12441m9();
                if (c2842o2Clone.m12434dy() > this.f8730h4) {
                    this.f8730h4 = c2842o2Clone.m12434dy();
                }
                i++;
                c2985yuArr = c2985yuArr2;
                length = i2;
            }
            this.f8734to = new C2842o2(dM67491kk, dM67491kk2, dM67502x12, dM67502x1);
        }

        /* JADX INFO: renamed from: x1 */
        public static List<k4> m12505x1(IGenericEnumerable<k4> iGenericEnumerable) {
            List<k4> list = new List<>();
            IGenericEnumerator<k4> it = iGenericEnumerable.iterator();
            while (it.hasNext()) {
                try {
                    list.addRange(it.next().m12507dy());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: du */
        public final double m12506du() {
            return this.f8730h4;
        }

        /* JADX INFO: renamed from: dy */
        public final List<k4> m12507dy() {
            List<k4> list = new List<>();
            if (this.f8731k4.length > 0) {
                List list2 = new List();
                C2985yu c2985yu = this.f8731k4[0];
                list2.addItem(c2985yu);
                int i = 1;
                while (true) {
                    C2985yu[] c2985yuArr = this.f8731k4;
                    if (i >= c2985yuArr.length) {
                        break;
                    }
                    C2985yu c2985yu2 = c2985yuArr[i];
                    if (c2985yu2.m12641x1().m12442to() > (c2985yu2.m12637k4() / 2.0d) + c2985yu.m12641x1().m12442to()) {
                        if (((C2985yu) OooO0O0.OooO00o(list2, 1)).m12640to().m12463x1().m12284k4() == 0) {
                            list2.removeAt(list2.size() - 1);
                        }
                        list.addItem(new k4(this.f8735x1, (C2985yu[]) list2.toArray(new C2985yu[0]), this.f8733m9));
                        list2 = new List();
                    }
                    list2.addItem(c2985yu2);
                    i++;
                    c2985yu = c2985yu2;
                }
                if (list2.size() > 0) {
                    list.addItem(new k4(this.f8735x1, (C2985yu[]) list2.toArray(new C2985yu[0]), this.f8733m9));
                }
            }
            return list;
        }

        /* JADX INFO: renamed from: h4 */
        public final double m12508h4() {
            return this.f8733m9;
        }

        /* JADX INFO: renamed from: k4 */
        public final C2828n2 m12509k4() {
            return this.f8732kk;
        }

        /* JADX INFO: renamed from: kk */
        public final int m12511kk() {
            return this.f8735x1;
        }

        /* JADX INFO: renamed from: m9 */
        public final C2985yu[] m12512m9() {
            return this.f8731k4;
        }

        /* JADX INFO: renamed from: to */
        public final double m12513to() {
            return this.f8729du;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m12504k4(IGenericEnumerable<k4> iGenericEnumerable) {
            List list = new List();
            IGenericEnumerator<k4> it = iGenericEnumerable.iterator();
            double d = 0.0d;
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                try {
                    k4 next = it.next();
                    list.addRange(AbstractC14092to.m67204k4((Object[]) next.f8731k4));
                    int i3 = next.f8735x1;
                    if (i != i3) {
                        i = i2 == 0 ? i3 : 0;
                    }
                    double d2 = next.f8733m9;
                    if (d < d2) {
                        d = d2;
                    }
                    i2++;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return new k4(i, (C2985yu[]) list.toArray(new C2985yu[0]), d);
        }

        /* JADX INFO: renamed from: x1 */
        public final C2842o2 m12514x1() {
            return this.f8734to;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m12510k4(C2865q1 c2865q1, double d) {
            for (C2985yu c2985yu : this.f8731k4) {
                c2985yu.m12638k4(c2865q1.Clone(), d);
            }
            this.f8733m9 *= d;
            m12503c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C2865q1 m12494k4(C2828n2 c2828n2, C2865q1 c2865q1, C2730fk c2730fk, C2730fk c2730fk2) {
        C2865q1 c2865q12 = new C2865q1(m12498h4().m12516k4().m12210k4(), m12498h4().m12516k4().m12212x1());
        double dM12411k4 = c2828n2.m12411k4(c2865q1.m12477k4());
        double dM12413x1 = c2828n2.m12413x1(c2865q1.m12481x1());
        C2865q1 c2865q1Clone = c2730fk.m12278x1(dM12411k4).Clone();
        C2968xo c2968xoClone = C2865q1.m12475k4(c2730fk2.m12278x1(dM12411k4).Clone(), c2865q1Clone).Clone();
        return new C2865q1((c2968xoClone.m12606k4() * dM12413x1) + c2865q1Clone.m12477k4() + c2865q12.m12477k4(), (c2968xoClone.m12611x1() * dM12413x1) + c2865q1Clone.m12481x1() + c2865q12.m12481x1());
    }

    /* JADX INFO: renamed from: du */
    public abstract C2773j5 mo12119du();

    /* JADX INFO: renamed from: h4 */
    public final C2891s1 m12498h4() {
        return this.f8728k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo12120k4();

    /* JADX INFO: renamed from: k4 */
    public abstract C2857pd[] mo12234k4(List<k4> list);

    /* JADX INFO: renamed from: m9 */
    public final C2730fk[] m12502m9() {
        List<C2674bu> listM12341k4 = mo12119du().m12341k4();
        int size = listM12341k4.size();
        C2730fk[] c2730fkArr = new C2730fk[size];
        for (int i = 0; i < size; i++) {
            c2730fkArr[i] = new C2730fk(listM12341k4.get_Item(i));
        }
        return c2730fkArr;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: to */
    public abstract AbstractC2878qv cloneT();

    /* JADX INFO: renamed from: k4 */
    public static AbstractC2878qv m12495k4(int i) {
        switch (i) {
            case 0:
                return new C2717ev();
            case 1:
                return new C2855p8();
            case 2:
                return new C2800l6();
            case 3:
                return new C2872qh();
            case 4:
                return new C2790kh();
            case 5:
                return new C2885ri();
            case 6:
                return new C2656ai();
            case 7:
                return new C2781jn();
            case 8:
                return new C2733fw();
            case 9:
                return new C2925um();
            case 10:
                return new C2877qq();
            case 11:
                return new C2751he();
            case 12:
                return new C2739gi();
            case 13:
                return new C2661ar();
            case 14:
                return new C2948wl();
            case 15:
                return new C2673bs();
            case 16:
                return new C2794kp();
            case 17:
                return new C2954wz();
            case 18:
                return new C2832na();
            case 19:
                return new C2879qw();
            case 20:
                return new C2938vj();
            case 21:
                return new C2766il();
            case 22:
                return new C2929uu();
            case 23:
                return new C2777jf();
            case 24:
                return new C2801la();
            case 25:
                return new C2955x0();
            case 26:
                return new C2655af();
            case 27:
                return new C2884r9();
            case 28:
                return new C2875qn();
            case 29:
                return new C2714ek();
            case 30:
                return new C2958x3();
            case 31:
                return new C2886rq();
            case 32:
                return new C2873qk();
            case 33:
                return new C2787k5();
            case 34:
                return new C2669bg();
            case 35:
                return new C2693d3();
            case 36:
                return new C2710e8();
            case 37:
                return new C2907tb();
            case 38:
                return new C2859pk();
            case 39:
                return new C2772j2();
            case 40:
                return new C2913tq();
            default:
                return new C2717ev();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m12496k4(C2865q1 c2865q1, C2865q1 c2865q12, C2730fk c2730fk, C2730fk c2730fk2, C2828n2 c2828n2, C2977y9 c2977y9) {
        C2968xo c2968xoClone = C2865q1.m12475k4(c2865q12, c2865q1).Clone();
        C2865q1 c2865q13 = new C2865q1((c2968xoClone.m12606k4() / 2.0d) + c2865q1.m12477k4(), c2865q1.m12481x1() + (c2968xoClone.m12611x1() / 2.0d));
        C2865q1 c2865q1Clone = m12494k4(c2828n2, c2865q1.Clone(), c2730fk, c2730fk2).Clone();
        C2865q1 c2865q1Clone2 = m12494k4(c2828n2, c2865q13.Clone(), c2730fk, c2730fk2).Clone();
        C2865q1 c2865q1Clone3 = m12494k4(c2828n2, c2865q12.Clone(), c2730fk, c2730fk2).Clone();
        C2968xo c2968xoClone2 = C2865q1.m12475k4(c2865q1Clone3, c2865q1Clone).Clone();
        C2968xo c2968xoClone3 = C2865q1.m12475k4(c2865q1Clone3, c2865q1Clone2).Clone();
        if (c2968xoClone3.m12608kk() <= 1.0E-6d || c2968xoClone2.m12608kk() <= 1.0E-6d) {
            c2977y9.m12629k4(c2865q1Clone3.Clone());
        } else if (c2968xoClone2.m12607k4(c2968xoClone3.Clone()) < 0.03490658503988659d) {
            c2977y9.m12629k4(c2865q1Clone3.Clone());
        } else {
            m12496k4(c2865q1.Clone(), c2865q13.Clone(), c2730fk, c2730fk2, c2828n2, c2977y9);
            m12496k4(c2865q13.Clone(), c2865q12.Clone(), c2730fk, c2730fk2, c2828n2, c2977y9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12499k4(C2891s1 c2891s1) {
        if (this.f8728k4 != c2891s1) {
            if (c2891s1 == null) {
                throw new ArgumentNullException("value");
            }
            this.f8728k4 = c2891s1.cloneT();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m12497k4(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i3] = iArr[i3] + 1;
            i3++;
            if (i3 >= i2) {
                i3 = 0;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2857pd[] m12500k4(IGenericEnumerable<C2985yu> iGenericEnumerable, C2711eb c2711eb) {
        IGenericEnumerator<C2985yu> iGenericEnumerator;
        C2957x2[] c2957x2Arr;
        IGenericEnumerator<C2985yu> iGenericEnumerator2;
        C2957x2[] c2957x2Arr2;
        List<k4> list = new List<>();
        IGenericEnumerator<C2985yu> it = iGenericEnumerable.iterator();
        C2957x2[] c2957x2ArrM12228x1 = c2711eb.m12228x1();
        int length = c2957x2ArrM12228x1.length;
        int i = 0;
        while (i < length) {
            C2957x2 c2957x2 = c2957x2ArrM12228x1[i];
            List list2 = new List();
            if (((C2767iq) C7019kk.m27452k4((Object) c2957x2.m12587k4().m12267x1(), C2767iq.class)) != null) {
                it.hasNext();
                list2.addItem(it.next());
            }
            AbstractC2701dn[] abstractC2701dnArrM12592x1 = c2957x2.m12592x1();
            int length2 = abstractC2701dnArrM12592x1.length;
            double dM12371m9 = 0.0d;
            int i2 = 0;
            while (i2 < length2) {
                C2726fc c2726fc = (C2726fc) C7019kk.m27452k4((Object) abstractC2701dnArrM12592x1[i2], C2726fc.class);
                if (c2726fc != null) {
                    int i3 = 0;
                    while (i3 < c2726fc.m12238k4().length()) {
                        if (c2726fc.m12238k4().charAt(i3) == 11 || c2726fc.m12238k4().charAt(i3) == '\n') {
                            iGenericEnumerator2 = it;
                            c2957x2Arr2 = c2957x2ArrM12228x1;
                            list.addItem(new k4(c2957x2.m12587k4().m12245h4(), (C2985yu[]) list2.toArray(new C2985yu[0]), dM12371m9));
                            list2.clear();
                        } else {
                            it.hasNext();
                            list2.addItem(it.next());
                            iGenericEnumerator2 = it;
                            c2957x2Arr2 = c2957x2ArrM12228x1;
                        }
                        i3++;
                        c2957x2ArrM12228x1 = c2957x2Arr2;
                        it = iGenericEnumerator2;
                    }
                    iGenericEnumerator = it;
                    c2957x2Arr = c2957x2ArrM12228x1;
                    if (c2726fc.m12205to().m12371m9() > dM12371m9) {
                        dM12371m9 = c2726fc.m12205to().m12371m9();
                    }
                } else {
                    iGenericEnumerator = it;
                    c2957x2Arr = c2957x2ArrM12228x1;
                }
                i2++;
                c2957x2ArrM12228x1 = c2957x2Arr;
                it = iGenericEnumerator;
            }
            list.addItem(new k4(c2957x2.m12587k4().m12245h4(), (C2985yu[]) list2.toArray(new C2985yu[0]), dM12371m9));
            i++;
            c2957x2ArrM12228x1 = c2957x2ArrM12228x1;
            it = it;
        }
        return mo12234k4(list);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2857pd[] m12501k4(C2985yu[] c2985yuArr, C2828n2 c2828n2, C2730fk c2730fk, C2730fk c2730fk2) {
        C2857pd[] c2857pdArr = new C2857pd[c2985yuArr.length];
        int i = 0;
        int i2 = 0;
        while (i2 < c2985yuArr.length) {
            C2738gf c2738gfM12463x1 = c2985yuArr[i2].m12640to().m12463x1();
            C2738gf c2738gf = new C2738gf();
            IGenericEnumerator<C2977y9> it = c2738gfM12463x1.iterator();
            while (it.hasNext()) {
                try {
                    C2977y9 next = it.next();
                    C2977y9 c2977y9 = new C2977y9(next.m12630kk(), next.m12631to());
                    if (next.m12626k4() > 0) {
                        C2865q1 c2865q1Clone = next.m12627k4(i).Clone();
                        int i3 = 1;
                        int iM12626k4 = next.m12632x1() ? next.m12626k4() + 1 : next.m12626k4();
                        while (i3 < iM12626k4) {
                            C2865q1 c2865q1Clone2 = (i3 < next.m12626k4() ? next.m12627k4(i3) : next.m12627k4(i)).Clone();
                            m12496k4(c2865q1Clone.Clone(), c2865q1Clone2.Clone(), c2730fk, c2730fk2, c2828n2, c2977y9);
                            c2865q1Clone2.CloneTo(c2865q1Clone);
                            i3++;
                            iM12626k4 = iM12626k4;
                            i = 0;
                        }
                        if (next.m12632x1()) {
                            c2977y9.m12624du();
                        }
                    }
                    c2738gf.m12285k4(c2977y9);
                    i = 0;
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
            c2857pdArr[i2] = new C2857pd(c2738gf, c2985yuArr[i2].m12640to().m12462k4().cloneT());
            i2++;
            i = 0;
        }
        return c2857pdArr;
    }
}
