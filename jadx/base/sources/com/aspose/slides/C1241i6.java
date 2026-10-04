package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.i6 */
/* JADX INFO: loaded from: classes3.dex */
final class C1241i6 extends AbstractC13680jc<Glow, C1241i6> implements IGlowEffectiveData {

    /* JADX INFO: renamed from: k4 */
    static final C1241i6 f5654k4 = m7534to();

    /* JADX INFO: renamed from: kk */
    private double f5655kk;

    /* JADX INFO: renamed from: x1 */
    private C14811xp f5656x1;

    public C1241i6(Glow glow) {
        super(glow, Glow.class, C1241i6.class);
        this.f5655kk = Double.NaN;
    }

    /* JADX INFO: renamed from: to */
    public static C1241i6 m7534to() {
        C1241i6 c1241i6 = new C1241i6(null);
        c1241i6.m7535du().m73525k4(C12003du.m56460uz().Clone());
        c1241i6.f5655kk = 0.0d;
        return c1241i6;
    }

    /* JADX INFO: renamed from: du */
    public final C14811xp m7535du() {
        if (this.f5656x1 == null) {
            this.f5656x1 = new C14811xp();
        }
        return this.f5656x1;
    }

    @Override // com.aspose.slides.IGlowEffectiveData
    public final Integer getColor() {
        return (Integer) C12003du.m56473x1(m7537x1());
    }

    @Override // com.aspose.slides.IGlowEffectiveData
    public final double getRadius() {
        return this.f5655kk;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m7537x1() {
        return this.f5656x1.m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        String strM66425h4 = C14044b3.m66425h4(this.f5655kk);
        C14811xp c14811xp = this.f5656x1;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, strM66425h4, chValueOf, c14811xp != null ? c14811xp.toString() : "");
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f5656x1.m73524k4(iBaseSlide, dm6Var);
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, Glow glow) {
        C1241i6 c1241i6 = (C1241i6) interfaceC14672vc;
        this.f5655kk = c1241i6.f5655kk;
        if (!C14067j2.m66728k4(Double.valueOf(glow.getRadius()), Double.valueOf(Double.NaN))) {
            this.f5655kk = glow.getRadius();
        }
        m7535du().m73527k4(c1241i6.m7535du(), (ColorFormat) glow.getColor());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(C1241i6 c1241i6) {
        if (c1241i6 == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c1241i6)) {
            return true;
        }
        return getRadius() == c1241i6.getRadius() && m7535du().m73531x1(c1241i6.m7535du());
    }
}
