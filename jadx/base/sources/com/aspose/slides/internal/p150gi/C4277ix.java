package com.aspose.slides.internal.p150gi;

import com.aspose.slides.internal.p097e0.AbstractC3533um;

/* JADX INFO: renamed from: com.aspose.slides.internal.gi.ix */
/* JADX INFO: loaded from: classes.dex */
public class C4277ix {

    /* JADX INFO: renamed from: du */
    protected int f11671du;

    /* JADX INFO: renamed from: h4 */
    protected boolean f11672h4;

    /* JADX INFO: renamed from: k4 */
    protected AbstractC4275gi f11673k4;

    /* JADX INFO: renamed from: kk */
    protected int f11674kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f11675m9;

    /* JADX INFO: renamed from: to */
    protected int f11676to;

    /* JADX INFO: renamed from: x1 */
    protected int f11677x1;

    public C4277ix(AbstractC4275gi abstractC4275gi) {
        this.f11673k4 = abstractC4275gi;
        abstractC4275gi.m17220k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17237k4(int i, int i2, int i3, int i4) {
        this.f11677x1 = i;
        this.f11674kk = i2;
        this.f11676to = i3;
        this.f11671du = i4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC3533um m17240kk(AbstractC3533um abstractC3533um) {
        return this.f11672h4 ? abstractC3533um.m14397kk() : abstractC3533um;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo17241x1(AbstractC3533um abstractC3533um) {
        AbstractC3533um abstractC3533umM17240kk = m17240kk(abstractC3533um);
        if (abstractC3533umM17240kk == null) {
            return null;
        }
        AbstractC4282kp abstractC4282kpM14394k4 = abstractC3533um.m14394k4(abstractC3533umM17240kk.m14392k4(this.f11677x1, this.f11674kk, this.f11676to, this.f11671du));
        if (abstractC4282kpM14394k4 == null) {
            return abstractC4282kpM14394k4;
        }
        return this.f11673k4.mo17139x1(abstractC4282kpM14394k4, abstractC3533um, abstractC3533um.m14404x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17238k4(boolean z) {
        this.f11672h4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17242x1(boolean z) {
        this.f11675m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo17239k4(AbstractC3533um abstractC3533um) {
        AbstractC3533um abstractC3533umM17240kk;
        return (!this.f11675m9 || (abstractC3533umM17240kk = m17240kk(abstractC3533um)) == null || abstractC3533umM17240kk.mo14065x1(abstractC3533umM17240kk.m14392k4(this.f11677x1, this.f11674kk, this.f11676to, this.f11671du)) == null) ? false : true;
    }
}
