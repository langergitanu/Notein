package com.aspose.slides.internal.p532yu;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.p5 */
/* JADX INFO: loaded from: classes5.dex */
public class C13147p5 extends C13126nm implements Cloneable {

    /* JADX INFO: renamed from: du */
    private C13147p5 f44205du;

    /* JADX INFO: renamed from: h4 */
    private int f44206h4;

    /* JADX INFO: renamed from: k4 */
    private String f44207k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC12950dp f44208kk;

    /* JADX INFO: renamed from: to */
    private C13890ei f44209to = C13890ei.f46456k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13054jn f44210x1;

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public String ae_() {
        return m61382k4();
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final int m61378c5() {
        return this.f44206h4;
    }

    /* JADX INFO: renamed from: dy */
    public final C13147p5 m61379dy() {
        return this.f44205du;
    }

    /* JADX INFO: renamed from: h4 */
    public final C13890ei m61380h4() {
        return this.f44209to;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13018hl m61381k4(C13282xc c13282xc) {
        C13147p5 c13147p5 = (C13147p5) af_();
        if (C12969en.m60405x1(this.f44210x1, c13282xc)) {
            c13147p5.f44210x1 = (AbstractC13054jn) C7019kk.m27452k4((Object) C12969en.m60398k4(this.f44210x1, c13282xc), AbstractC13054jn.class);
        }
        c13147p5.f44208kk = AbstractC12950dp.f43531k4;
        return c13147p5;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC12950dp m61388m9() {
        return this.f44208kk;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        return m61381k4((C13282xc) null);
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC13054jn m61389x1() {
        return this.f44210x1;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: h4 */
    public void mo59981h4(String str) {
        m61390x1(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m61382k4() {
        return this.f44207k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61390x1(String str) {
        this.f44207k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61383k4(int i) {
        this.f44206h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61384k4(AbstractC12950dp abstractC12950dp) {
        this.f44208kk = abstractC12950dp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61385k4(AbstractC13054jn abstractC13054jn) {
        this.f44210x1 = abstractC13054jn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61386k4(C13147p5 c13147p5) {
        this.f44205du = c13147p5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61387k4(C13890ei c13890ei) {
        this.f44209to = c13890ei;
    }
}
