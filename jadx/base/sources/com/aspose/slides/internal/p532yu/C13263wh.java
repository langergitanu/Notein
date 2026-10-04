package com.aspose.slides.internal.p532yu;

import com.aspose.slides.p559ms.System.Xml.C13890ei;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.wh */
/* JADX INFO: loaded from: classes5.dex */
public class C13263wh extends AbstractC13079l6 implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private C13890ei f44442k4 = C13890ei.f46456k4;

    /* JADX INFO: renamed from: kk */
    private C13164q9 f44443kk;

    /* JADX INFO: renamed from: x1 */
    private C13164q9 f44444x1;

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final C13164q9 m61657h4() {
        return this.f44443kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13890ei m61658k4() {
        return this.f44442k4;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        C13263wh c13263wh = (C13263wh) af_();
        c13263wh.m61660k4(this.f44442k4.m65282du());
        return c13263wh;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13164q9 m61661x1() {
        return this.f44444x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61659k4(C13164q9 c13164q9) {
        this.f44444x1 = c13164q9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m61662x1(C13164q9 c13164q9) {
        this.f44443kk = c13164q9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61660k4(C13890ei c13890ei) {
        if (c13890ei == null) {
            c13890ei = C13890ei.f46456k4;
        }
        this.f44442k4 = c13890ei;
    }
}
