package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.cs */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0868cs extends el1 {

    /* JADX INFO: renamed from: du */
    protected final el1 f4429du;

    /* JADX INFO: renamed from: h4 */
    protected final nn2 f4430h4;

    /* JADX INFO: renamed from: kk */
    protected final float f4431kk;

    /* JADX INFO: renamed from: to */
    protected final el1 f4432to;

    /* JADX INFO: renamed from: x1 */
    C14327q4 f4433x1;

    public AbstractC0868cs(MathFraction mathFraction, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathFraction, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f4433x1 = c14327q42;
        c14327q4.f48239to++;
        c14327q4.CloneTo(c14327q42);
        c14327q4.f48235jd = true;
        this.f4432to = m5579k4(mathFraction.getNumerator(), c14327q4.Clone());
        c14327q4.f48235jd = false;
        c14327q4.f48229c5 = true;
        this.f4429du = m5579k4(mathFraction.getDenominator(), c14327q4.Clone());
        this.f4431kk = c14327q4.f48231du;
        this.f4430h4 = mo4555du().m69387k4(c14327q4.f48231du);
    }

    /* JADX INFO: renamed from: to */
    public final MathFraction m4801to() {
        return (MathFraction) this.f4820c5;
    }
}
