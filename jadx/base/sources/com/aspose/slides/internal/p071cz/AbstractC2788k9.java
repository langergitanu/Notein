package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.k9 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2788k9 extends AbstractC2876qp {

    /* JADX INFO: renamed from: du */
    private final AbstractC2720f3 f8665du;

    /* JADX INFO: renamed from: k4 */
    private final AbstractC2679c1 f8666k4;

    /* JADX INFO: renamed from: kk */
    private final AbstractC2725fb f8667kk;

    /* JADX INFO: renamed from: to */
    private final AbstractC2759hz f8668to;

    /* JADX INFO: renamed from: x1 */
    private final C2778ji f8669x1;

    public AbstractC2788k9(AbstractC2679c1 abstractC2679c1, AbstractC2725fb abstractC2725fb, AbstractC2759hz abstractC2759hz, AbstractC2720f3 abstractC2720f3, C2778ji c2778ji) {
        this.f8666k4 = abstractC2679c1;
        this.f8667kk = abstractC2725fb;
        this.f8668to = abstractC2759hz;
        this.f8665du = abstractC2720f3;
        this.f8669x1 = c2778ji;
    }

    /* JADX INFO: renamed from: c5 */
    private double m12386c5() {
        AbstractC2759hz abstractC2759hz = this.f8668to;
        if ((abstractC2759hz instanceof C2719ex ? (C2719ex) abstractC2759hz : null) != null) {
            return this.f8669x1.m12371m9();
        }
        C2796kt c2796kt = abstractC2759hz instanceof C2796kt ? (C2796kt) abstractC2759hz : null;
        if (c2796kt != null) {
            return (c2796kt.m12393x1() * this.f8669x1.m12371m9()) / 100000.0d;
        }
        C2771j0 c2771j0 = abstractC2759hz instanceof C2771j0 ? (C2771j0) abstractC2759hz : null;
        if (c2771j0 != null) {
            return c2771j0.m12336x1();
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC2718ew m12387dy() {
        AbstractC2725fb abstractC2725fb = this.f8667kk;
        if ((abstractC2725fb instanceof C2931uy ? (C2931uy) abstractC2725fb : null) != null) {
            return this.f8669x1.m12377x1().cloneT();
        }
        C2861pq c2861pq = abstractC2725fb instanceof C2861pq ? (C2861pq) abstractC2725fb : null;
        if (c2861pq != null) {
            return new C2743gv(c2861pq.m12465x1());
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: jd */
    private C2798kx m12388jd() {
        AbstractC2720f3 abstractC2720f3 = this.f8665du;
        if ((abstractC2720f3 instanceof C2898sf ? (C2898sf) abstractC2720f3 : null) != null) {
            return this.f8669x1.m12366kk();
        }
        C2831n9 c2831n9 = abstractC2720f3 instanceof C2831n9 ? (C2831n9) abstractC2720f3 : null;
        if (c2831n9 != null) {
            return c2831n9.m12420x1();
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC2679c1 m12389k4() {
        return this.f8666k4;
    }

    /* JADX INFO: renamed from: x1 */
    public C2778ji m12390x1() {
        C2778ji c2778jiCloneT = this.f8669x1.cloneT();
        c2778jiCloneT.m12358k4(m12387dy());
        c2778jiCloneT.m12372to(m12386c5());
        C2798kx c2798kxM12388jd = m12388jd();
        c2778jiCloneT.m12369kk(c2798kxM12388jd);
        c2778jiCloneT.m12381x1(c2798kxM12388jd);
        c2778jiCloneT.m12360k4(c2798kxM12388jd);
        c2778jiCloneT.m12374to(c2798kxM12388jd);
        return c2778jiCloneT;
    }
}
