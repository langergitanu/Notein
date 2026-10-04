package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.iu */
/* JADX INFO: loaded from: classes3.dex */
public final class C2768iu extends AbstractC2755hn {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC2707dx f8626k4;

    /* JADX INFO: renamed from: x1 */
    private final C2711eb f8627x1;

    public C2768iu(C2697dg c2697dg, C2660aq c2660aq, AbstractC2707dx abstractC2707dx) {
        super(c2697dg, c2660aq);
        if (c2697dg == null) {
            throw new ArgumentNullException("slide");
        }
        if (abstractC2707dx == null) {
            throw new ArgumentNullException("geometry");
        }
        this.f8626k4 = abstractC2707dx;
        this.f8627x1 = new C2711eb(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC2707dx m12316k4() {
        return this.f8626k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C2891s1 m12317kk() {
        C2891s1 c2891s1CloneT;
        C2706dw c2706dwM12534k4;
        C2695dc c2695dcMo12112k4 = (C2695dc) C7019kk.m27452k4((Object) this.f8626k4, C2695dc.class);
        if (c2695dcMo12112k4 == null) {
            c2695dcMo12112k4 = ((AbstractC2665b2) this.f8626k4).mo12112k4();
            c2891s1CloneT = c2695dcMo12112k4.m12213h4().cloneT();
            c2706dwM12534k4 = new C2706dw(c2695dcMo12112k4.m12192k4().m12534k4().m12210k4() + c2695dcMo12112k4.m12213h4().m12516k4().m12210k4(), c2695dcMo12112k4.m12192k4().m12534k4().m12212x1() + c2695dcMo12112k4.m12213h4().m12516k4().m12212x1());
        } else {
            c2891s1CloneT = c2695dcMo12112k4.m12213h4().cloneT();
            c2706dwM12534k4 = c2695dcMo12112k4.m12192k4().m12534k4();
        }
        c2891s1CloneT.m12517k4(c2706dwM12534k4);
        c2891s1CloneT.m12518k4(c2695dcMo12112k4.m12192k4().m12536x1());
        return c2891s1CloneT;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2711eb m12318x1() {
        return this.f8627x1;
    }
}
