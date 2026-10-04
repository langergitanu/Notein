package com.aspose.slides.internal.p532yu;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.q9 */
/* JADX INFO: loaded from: classes5.dex */
public class C13164q9 extends C12943dd implements Cloneable {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13079l6 f44229k4;

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    public Object af_() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC13079l6 m61416k4() {
        return this.f44229k4;
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC13018hl
    /* JADX INFO: renamed from: wy */
    public AbstractC13018hl mo60427wy() {
        C13164q9 c13164q9 = (C13164q9) af_();
        AbstractC13079l6 abstractC13079l6 = this.f44229k4;
        if (abstractC13079l6 != null) {
            c13164q9.m61417k4((AbstractC13079l6) abstractC13079l6.mo60427wy());
        }
        return c13164q9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m61417k4(AbstractC13079l6 abstractC13079l6) {
        this.f44229k4 = abstractC13079l6;
    }
}
