package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class vmd extends AbstractC13680jc<OuterShadow, vmd> implements IOuterShadowEffectiveData {

    /* JADX INFO: renamed from: x1 */
    static final vmd f49605x1 = m72362to();

    /* JADX INFO: renamed from: c5 */
    private double f49606c5;

    /* JADX INFO: renamed from: ck */
    private double f49607ck;

    /* JADX INFO: renamed from: dy */
    private double f49608dy;

    /* JADX INFO: renamed from: fa */
    private byte f49609fa;

    /* JADX INFO: renamed from: h4 */
    private double f49610h4;

    /* JADX INFO: renamed from: jd */
    private double f49611jd;

    /* JADX INFO: renamed from: k4 */
    C14811xp f49612k4;

    /* JADX INFO: renamed from: kk */
    private double f49613kk;

    /* JADX INFO: renamed from: m9 */
    private float f49614m9;

    /* JADX INFO: renamed from: up */
    private byte f49615up;

    public vmd(OuterShadow outerShadow) {
        super(outerShadow, OuterShadow.class, vmd.class);
        this.f49613kk = Double.NaN;
        this.f49610h4 = Double.NaN;
        this.f49614m9 = Float.NaN;
        this.f49608dy = Double.NaN;
        this.f49606c5 = Double.NaN;
        this.f49611jd = Double.NaN;
        this.f49607ck = Double.NaN;
        this.f49609fa = (byte) -1;
        this.f49615up = (byte) -1;
    }

    /* JADX INFO: renamed from: to */
    public static vmd m72362to() {
        vmd vmdVar = new vmd(null);
        vmdVar.m72363du().m73525k4(C12003du.m56460uz().Clone());
        vmdVar.f49613kk = 0.0d;
        vmdVar.f49610h4 = 0.0d;
        vmdVar.f49614m9 = 0.0f;
        vmdVar.f49608dy = 0.0d;
        vmdVar.f49606c5 = 0.0d;
        vmdVar.f49611jd = 100.0d;
        vmdVar.f49607ck = 100.0d;
        vmdVar.f49609fa = (byte) 1;
        vmdVar.f49615up = (byte) 0;
        return vmdVar;
    }

    /* JADX INFO: renamed from: du */
    public final C14811xp m72363du() {
        if (this.f49612k4 == null) {
            this.f49612k4 = new C14811xp();
        }
        return this.f49612k4;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final double getBlurRadius() {
        return this.f49613kk;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final float getDirection() {
        return this.f49614m9;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final double getDistance() {
        return this.f49610h4;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final byte getRectangleAlign() {
        return this.f49615up;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final boolean getRotateShadowWithShape() {
        return this.f49609fa == 1;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final double getScaleHorizontal() {
        return this.f49611jd;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final double getScaleVertical() {
        return this.f49607ck;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final Integer getShadowColor() {
        return (Integer) C12003du.m56473x1(m72367x1());
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final double getSkewHorizontal() {
        return this.f49608dy;
    }

    @Override // com.aspose.slides.IOuterShadowEffectiveData
    public final double getSkewVertical() {
        return this.f49606c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m72364h4() {
        return (getSkewHorizontal() == 0.0d && getSkewVertical() == 0.0d) ? false : true;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m72366m9() {
        double d = this.f49611jd;
        if (d == 100.0d && this.f49607ck == 100.0d) {
            return false;
        }
        return (C14044b3.m66437kk(d) && C14044b3.m66437kk(this.f49607ck)) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m72367x1() {
        return m72363du().m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        String strM66425h4 = C14044b3.m66425h4(this.f49613kk);
        String strM66425h42 = C14044b3.m66425h4(this.f49610h4);
        String strM66704h4 = C14064he.m66704h4(this.f49614m9);
        C14811xp c14811xp = this.f49612k4;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, strM66425h4, chValueOf, strM66425h42, chValueOf, strM66704h4, chValueOf, c14811xp != null ? c14811xp.toString() : "");
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f49612k4.m73524k4(iBaseSlide, dm6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, OuterShadow outerShadow) {
        vmd vmdVar = (vmd) interfaceC14672vc;
        this.f49613kk = vmdVar.f49613kk;
        this.f49610h4 = vmdVar.f49610h4;
        this.f49614m9 = vmdVar.f49614m9;
        this.f49608dy = vmdVar.f49608dy;
        this.f49606c5 = vmdVar.f49606c5;
        this.f49611jd = vmdVar.f49611jd;
        this.f49607ck = vmdVar.f49607ck;
        this.f49609fa = vmdVar.f49609fa;
        this.f49615up = vmdVar.f49615up;
        Double dValueOf = Double.valueOf(outerShadow.getBlurRadius());
        Double dValueOf2 = Double.valueOf(Double.NaN);
        if (!C14067j2.m66728k4(dValueOf, dValueOf2)) {
            this.f49613kk = outerShadow.getBlurRadius();
        }
        if (!C14067j2.m66728k4(Double.valueOf(outerShadow.getDistance()), dValueOf2)) {
            this.f49610h4 = outerShadow.getDistance();
        }
        if (!C14067j2.m66728k4(Float.valueOf(outerShadow.getDirection()), Float.valueOf(Float.NaN))) {
            this.f49614m9 = outerShadow.getDirection();
        }
        if (!C14067j2.m66728k4(Double.valueOf(outerShadow.getSkewHorizontal()), dValueOf2)) {
            this.f49608dy = outerShadow.getSkewHorizontal();
        }
        if (!C14067j2.m66728k4(Double.valueOf(outerShadow.getSkewVertical()), dValueOf2)) {
            this.f49606c5 = outerShadow.getSkewVertical();
        }
        if (!C14067j2.m66728k4(Double.valueOf(outerShadow.getScaleHorizontal()), dValueOf2)) {
            this.f49611jd = outerShadow.getScaleHorizontal();
        }
        if (!C14067j2.m66728k4(Double.valueOf(outerShadow.getScaleVertical()), dValueOf2)) {
            this.f49607ck = outerShadow.getScaleVertical();
        }
        boolean rotateShadowWithShape = outerShadow.getRotateShadowWithShape();
        if (rotateShadowWithShape != -1) {
            this.f49609fa = rotateShadowWithShape ? (byte) 1 : (byte) 0;
        }
        if (outerShadow.getRectangleAlign() != -1) {
            this.f49615up = outerShadow.getRectangleAlign();
        }
        m72363du().m73527k4(vmdVar.m72363du(), (ColorFormat) outerShadow.getShadowColor());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(vmd vmdVar) {
        if (vmdVar == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, vmdVar)) {
            return true;
        }
        return getBlurRadius() == vmdVar.getBlurRadius() && getDistance() == vmdVar.getDistance() && getDirection() == vmdVar.getDirection() && getSkewHorizontal() == vmdVar.getSkewHorizontal() && getSkewVertical() == vmdVar.getSkewVertical() && getScaleHorizontal() == vmdVar.getScaleHorizontal() && getScaleVertical() == vmdVar.getScaleVertical() && getRotateShadowWithShape() == vmdVar.getRotateShadowWithShape() && getRectangleAlign() == vmdVar.getRectangleAlign() && m72363du().m73531x1(vmdVar.m72363du());
    }
}
