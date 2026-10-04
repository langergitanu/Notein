package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class zg0 extends AbstractC13680jc<InnerShadow, zg0> implements IInnerShadowEffectiveData {

    /* JADX INFO: renamed from: k4 */
    static final zg0 f50561k4 = m74515to();

    /* JADX INFO: renamed from: h4 */
    private double f50562h4;

    /* JADX INFO: renamed from: kk */
    private double f50563kk;

    /* JADX INFO: renamed from: m9 */
    private float f50564m9;

    /* JADX INFO: renamed from: x1 */
    private C14811xp f50565x1;

    public zg0(InnerShadow innerShadow) {
        super(innerShadow, InnerShadow.class, zg0.class);
        this.f50563kk = Double.NaN;
        this.f50562h4 = Double.NaN;
        this.f50564m9 = Float.NaN;
    }

    /* JADX INFO: renamed from: to */
    public static zg0 m74515to() {
        zg0 zg0Var = new zg0(null);
        zg0Var.m74516du().m73525k4(C12003du.m56460uz().Clone());
        zg0Var.f50563kk = 0.0d;
        zg0Var.f50562h4 = 0.0d;
        zg0Var.f50564m9 = 0.0f;
        return zg0Var;
    }

    /* JADX INFO: renamed from: du */
    public final C14811xp m74516du() {
        if (this.f50565x1 == null) {
            this.f50565x1 = new C14811xp();
        }
        return this.f50565x1;
    }

    @Override // com.aspose.slides.IInnerShadowEffectiveData
    public final double getBlurRadius() {
        return this.f50563kk;
    }

    @Override // com.aspose.slides.IInnerShadowEffectiveData
    public final float getDirection() {
        return this.f50564m9;
    }

    @Override // com.aspose.slides.IInnerShadowEffectiveData
    public final double getDistance() {
        return this.f50562h4;
    }

    @Override // com.aspose.slides.IInnerShadowEffectiveData
    public final Integer getShadowColor() {
        return (Integer) C12003du.m56473x1(m74518x1());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m74518x1() {
        return m74516du().m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        String strM66425h4 = C14044b3.m66425h4(this.f50563kk);
        String strM66425h42 = C14044b3.m66425h4(this.f50562h4);
        String strM66704h4 = C14064he.m66704h4(this.f50564m9);
        C14811xp c14811xp = this.f50565x1;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, strM66425h4, chValueOf, strM66425h42, chValueOf, strM66704h4, chValueOf, c14811xp != null ? c14811xp.toString() : "");
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f50565x1.m73524k4(iBaseSlide, dm6Var);
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, InnerShadow innerShadow) {
        zg0 zg0Var = (zg0) interfaceC14672vc;
        this.f50563kk = zg0Var.f50563kk;
        this.f50562h4 = zg0Var.f50562h4;
        this.f50564m9 = zg0Var.f50564m9;
        Double dValueOf = Double.valueOf(innerShadow.getBlurRadius());
        Double dValueOf2 = Double.valueOf(Double.NaN);
        if (!C14067j2.m66728k4(dValueOf, dValueOf2)) {
            this.f50563kk = innerShadow.getBlurRadius();
        }
        if (!C14067j2.m66728k4(Double.valueOf(innerShadow.getDistance()), dValueOf2)) {
            this.f50562h4 = innerShadow.getDistance();
        }
        if (!C14067j2.m66728k4(Float.valueOf(innerShadow.getDirection()), Float.valueOf(Float.NaN))) {
            this.f50564m9 = innerShadow.getDirection();
        }
        m74516du().m73527k4(zg0Var.m74516du(), (ColorFormat) innerShadow.getShadowColor());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(zg0 zg0Var) {
        if (zg0Var == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, zg0Var)) {
            return true;
        }
        return getBlurRadius() == zg0Var.getBlurRadius() && getDistance() == zg0Var.getDistance() && getDirection() == zg0Var.getDirection() && m74516du().m73531x1(zg0Var.m74516du());
    }
}
