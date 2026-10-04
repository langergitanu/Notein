package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.c6 */
/* JADX INFO: loaded from: classes4.dex */
class C6982c6 extends AbstractC7008wy {

    /* JADX INFO: renamed from: k4 */
    private AbstractC6994ks f18987k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC6981c5[] f18990x1 = null;

    /* JADX INFO: renamed from: kk */
    private AbstractC6981c5[] f18988kk = null;

    /* JADX INFO: renamed from: to */
    private AbstractC6981c5[] f18989to = null;

    public C6982c6(AbstractC7002u4 abstractC7002u4) {
        this.f18987k4 = (AbstractC6994ks) C7019kk.m27452k4((Object) abstractC7002u4, AbstractC6994ks.class);
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: h4 */
    public boolean mo27325h4() {
        return this.f18987k4.mo27298ck();
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: k4 */
    public void mo27326k4() {
        super.mo27326k4();
        AbstractC6994ks abstractC6994ks = this.f18987k4;
        if (abstractC6994ks == null) {
            throw new C6983ck();
        }
        this.f18990x1 = m27324k4(abstractC6994ks.m27364h4());
        this.f18988kk = m27324k4(this.f18987k4.m27363dy());
        this.f18989to = m27324k4(this.f18987k4.m27371m9());
        if (this.f18987k4.m27361c5() != null) {
            this.f18987k4.m27361c5().mo27331k4();
        }
    }

    @Override // com.aspose.slides.internal.p313oa.AbstractC7008wy
    /* JADX INFO: renamed from: k4 */
    public void mo27327k4(float[] fArr) {
        m27414x1(fArr);
        if (this.f18987k4.m27372to()) {
            m27323k4(fArr, this.f18988kk);
            if (C7019kk.m27462to(Byte.valueOf(this.f18987k4.m27362du()), 6) == 3) {
                m27322k4(fArr, this.f18987k4.m27365jd());
                m27323k4(fArr, this.f18989to);
            }
            m27321k4(fArr, this.f18987k4.m27361c5());
            m27323k4(fArr, this.f18990x1);
        } else {
            m27323k4(fArr, this.f18990x1);
            m27321k4(fArr, this.f18987k4.m27361c5());
            m27323k4(fArr, this.f18989to);
            m27322k4(fArr, this.f18987k4.m27365jd());
            m27323k4(fArr, this.f18988kk);
        }
        m27410kk(fArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m27321k4(float[] fArr, C6985du c6985du) {
        if (c6985du != null) {
            c6985du.mo27333k4(fArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m27322k4(float[] fArr, C7013yj c7013yj) {
        if (c7013yj != null) {
            c7013yj.m27425k4(fArr);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m27323k4(float[] fArr, AbstractC6981c5[] abstractC6981c5Arr) {
        if (abstractC6981c5Arr != null) {
            for (int i = 0; i < abstractC6981c5Arr.length; i++) {
                fArr[i] = abstractC6981c5Arr[i].mo27315k4(fArr[i]);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC6981c5[] m27324k4(AbstractC6981c5[] abstractC6981c5Arr) {
        if (abstractC6981c5Arr == null) {
            return null;
        }
        for (AbstractC6981c5 abstractC6981c5 : abstractC6981c5Arr) {
            abstractC6981c5.m27316k4();
        }
        for (AbstractC6981c5 abstractC6981c52 : abstractC6981c5Arr) {
            if (!abstractC6981c52.mo27320x1()) {
                return abstractC6981c5Arr;
            }
        }
        return null;
    }
}
