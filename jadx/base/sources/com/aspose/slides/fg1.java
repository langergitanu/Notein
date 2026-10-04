package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class fg1 {

    /* JADX INFO: renamed from: k4 */
    private final TextFrame f5046k4;

    /* JADX INFO: renamed from: kk */
    private List<kjz> f5047kk;

    /* JADX INFO: renamed from: to */
    private int f5048to;

    /* JADX INFO: renamed from: x1 */
    private r7c f5049x1;

    public fg1(TextFrame textFrame, nrw nrwVar, r7c r7cVar) {
        int length;
        m6180k4(r7cVar);
        this.f5046k4 = textFrame;
        if (C7019kk.m27469x1(r7cVar.f48542kk, MathPortion.class) && s8c.m70475k4(textFrame)) {
            m6179k4(m6176k4(nrwVar, r7cVar));
            length = m6182x1().size();
        } else {
            length = r7cVar.f48544x1.length();
        }
        m6178k4(length);
    }

    /* JADX INFO: renamed from: k4 */
    private List<kjz> m6176k4(nrw nrwVar, r7c r7cVar) {
        return new oup(nrwVar, new ld2((BaseSlide) this.f5046k4.getSlide(), ((Presentation) this.f5046k4.getSlide().getPresentation()).m2349du(), this.f5046k4, new oju()), this.f5046k4, r7cVar).m68873x1();
    }

    /* JADX INFO: renamed from: kk */
    public final int m6181kk() {
        return this.f5048to;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<kjz> m6182x1() {
        return this.f5047kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final r7c m6177k4() {
        return this.f5049x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6178k4(int i) {
        this.f5048to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6179k4(List<kjz> list) {
        this.f5047kk = list;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6180k4(r7c r7cVar) {
        this.f5049x1 = r7cVar;
    }
}
