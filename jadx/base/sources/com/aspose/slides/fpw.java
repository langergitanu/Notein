package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
final class fpw extends AbstractC0858ck<ThreeDFormat, fpw> implements IThreeDFormatEffectiveData {

    /* JADX INFO: renamed from: x6 */
    private static final fpw f5080x6 = m6248ck();

    /* JADX INFO: renamed from: c5 */
    private final ofw f5081c5;

    /* JADX INFO: renamed from: ck */
    private final C14811xp f5082ck;

    /* JADX INFO: renamed from: du */
    int f5083du;

    /* JADX INFO: renamed from: dy */
    private double f5084dy;

    /* JADX INFO: renamed from: fa */
    private final C14811xp f5085fa;

    /* JADX INFO: renamed from: h4 */
    private double f5086h4;

    /* JADX INFO: renamed from: jd */
    private final ofw f5087jd;

    /* JADX INFO: renamed from: kk */
    int f5088kk;

    /* JADX INFO: renamed from: ks */
    private byte f5089ks;

    /* JADX INFO: renamed from: m9 */
    private double f5090m9;

    /* JADX INFO: renamed from: rv */
    private float f5091rv;

    /* JADX INFO: renamed from: to */
    C14219o9 f5092to;

    /* JADX INFO: renamed from: up */
    private final C14675vf f5093up;

    /* JADX INFO: renamed from: yj */
    private final vlf f5094yj;

    public fpw(ThreeDFormat threeDFormat) {
        super(threeDFormat);
        this.f5086h4 = Double.NaN;
        this.f5090m9 = Double.NaN;
        this.f5084dy = Double.NaN;
        this.f5081c5 = new ofw(true);
        this.f5087jd = new ofw(false);
        this.f5082ck = new C14811xp();
        this.f5085fa = new C14811xp();
        this.f5093up = new C14675vf();
        this.f5094yj = new vlf();
        this.f5088kk = -1;
        this.f5089ks = (byte) -1;
        this.f5091rv = Float.NaN;
        this.f5092to = new C14219o9();
        this.f5083du = -1;
    }

    /* JADX INFO: renamed from: ck */
    private static fpw m6248ck() {
        fpw fpwVar = new fpw(null);
        fpwVar.f5086h4 = 0.0d;
        fpwVar.f5090m9 = 0.0d;
        fpwVar.f5084dy = 0.0d;
        fpwVar.f5082ck.m73525k4(C12003du.m56460uz().Clone());
        fpwVar.f5085fa.m73525k4(C12003du.m56460uz().Clone());
        fpwVar.f5088kk = 14;
        fpwVar.f5089ks = (byte) 0;
        fpwVar.f5091rv = 0.0f;
        fpwVar.f5083du = 0;
        return fpwVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m6249k4(int i) {
        if (i < 16) {
            return 1L;
        }
        if (i < 24) {
            return 2L;
        }
        return (i >= 32 && i < 40) ? 1L : 3L;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m6252c5() {
        return this.f5089ks == 1;
    }

    /* JADX INFO: renamed from: dy */
    public C12003du m6253dy() {
        return this.f5085fa.m73522k4();
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final IShapeBevelEffectiveData getBevelBottom() {
        return this.f5087jd;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final IShapeBevelEffectiveData getBevelTop() {
        return this.f5081c5;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final ICameraEffectiveData getCamera() {
        return this.f5093up;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final Integer getContourColor() {
        return (Integer) C12003du.m56473x1(m6259m9());
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final double getContourWidth() {
        return this.f5086h4;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final double getDepth() {
        return this.f5084dy;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final Integer getExtrusionColor() {
        return (Integer) C12003du.m56473x1(m6253dy());
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final double getExtrusionHeight() {
        return this.f5090m9;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final ILightRigEffectiveData getLightRig() {
        return this.f5094yj;
    }

    @Override // com.aspose.slides.IThreeDFormatEffectiveData
    public final int getMaterial() {
        return this.f5088kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m6254h4() {
        this.f5086h4 = Double.NaN;
        this.f5090m9 = Double.NaN;
        this.f5084dy = Double.NaN;
        this.f5081c5.m68516k4();
        this.f5087jd.m68516k4();
        this.f5082ck.m73529to();
        this.f5085fa.m73529to();
        this.f5093up.m72192k4();
        this.f5094yj.m72349k4();
        this.f5088kk = -1;
        this.f5089ks = (byte) -1;
        this.f5091rv = Float.NaN;
        this.f5092to.m68401k4();
        this.f5083du = -1;
    }

    /* JADX INFO: renamed from: jd */
    public final float m6255jd() {
        return this.f5091rv;
    }

    /* JADX INFO: renamed from: m9 */
    public C12003du m6259m9() {
        return this.f5082ck.m73522k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6260x1(ThreeDFormat threeDFormat) {
        Double dValueOf = Double.valueOf(threeDFormat.getContourWidth());
        Double dValueOf2 = Double.valueOf(Double.NaN);
        if (!C14067j2.m66728k4(dValueOf, dValueOf2)) {
            this.f5086h4 = threeDFormat.getContourWidth();
        }
        if (!C14067j2.m66728k4(Double.valueOf(threeDFormat.getExtrusionHeight()), dValueOf2)) {
            this.f5090m9 = threeDFormat.getExtrusionHeight();
        }
        if (!C14067j2.m66728k4(Double.valueOf(threeDFormat.getDepth()), dValueOf2)) {
            this.f5084dy = threeDFormat.getDepth();
        }
        this.f5081c5.m68517k4((ShapeBevel) threeDFormat.getBevelTop());
        this.f5087jd.m68517k4((ShapeBevel) threeDFormat.getBevelBottom());
        this.f5082ck.m73523k4((ColorFormat) threeDFormat.getContourColor());
        this.f5085fa.m73523k4((ColorFormat) threeDFormat.getExtrusionColor());
        this.f5093up.m72193k4((Camera) threeDFormat.getCamera());
        this.f5094yj.m72350k4((LightRig) threeDFormat.getLightRig());
        if (threeDFormat.getMaterial() != -1) {
            this.f5088kk = threeDFormat.getMaterial();
        }
        this.f5089ks = threeDFormat.m3011to().m70720k4() ? (byte) 1 : (byte) 0;
        if (!C14067j2.m66728k4(Float.valueOf(threeDFormat.m3011to().m70723x1()), Float.valueOf(Float.NaN))) {
            this.f5091rv = threeDFormat.m3011to().m70723x1();
        }
        this.f5092to.m68402k4((Backdrop3DScene) threeDFormat.m3011to().m70721kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static fpw m6250k4(ThreeDFormat threeDFormat) {
        fpw fpwVarM6311x1;
        fpw fpwVarM6311x12;
        fpw fpwVarM6311x13;
        IPresentationComponent parent_IPresentationComponent = threeDFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, Shape.class)) {
            Shape shape = (Shape) parent_IPresentationComponent;
            if (C7019kk.m27469x1(shape, GeometryShape.class)) {
                GeometryShape geometryShape = (GeometryShape) shape;
                if (geometryShape.getShapeStyle() != null) {
                    IShapeStyle shapeStyle = geometryShape.getShapeStyle();
                    fuq fuqVar = (fuq) AbstractC0858ck.m4596k4(threeDFormat).createThemeEffective();
                    return (fuqVar == null || (fpwVarM6311x13 = fuqVar.m6311x1(shapeStyle.getEffectStyleIndex())) == null) ? f5080x6 : fpwVarM6311x13;
                }
            }
            Shape shape2 = (Shape) shape.getBasePlaceholder();
            return shape2 != null ? shape2.m2545bv().m3002ck() : f5080x6;
        }
        if (!C7019kk.m27469x1(parent_IPresentationComponent, FormatScheme.class) && !C7019kk.m27469x1(parent_IPresentationComponent, TextFrame.class)) {
            if (C7019kk.m27469x1(parent_IPresentationComponent, ChartSeries.class)) {
                long jM6249k4 = m6249k4(((ChartSeries) parent_IPresentationComponent).getChart().getStyle());
                fuq fuqVar2 = (fuq) AbstractC0858ck.m4596k4(threeDFormat).createThemeEffective();
                return (fuqVar2 == null || (fpwVarM6311x12 = fuqVar2.m6311x1(jM6249k4)) == null) ? f5080x6 : fpwVarM6311x12;
            }
            if (!C7019kk.m27469x1(parent_IPresentationComponent, ChartSeriesGroup.class)) {
                throw new NotImplementedException();
            }
            long jM6249k42 = m6249k4(((ChartSeriesGroup) parent_IPresentationComponent).getChart().getStyle());
            fuq fuqVar3 = (fuq) AbstractC0858ck.m4596k4(threeDFormat).createThemeEffective();
            return (fuqVar3 == null || (fpwVarM6311x1 = fuqVar3.m6311x1(jM6249k42)) == null) ? f5080x6 : fpwVarM6311x1;
        }
        return f5080x6;
    }

    /* JADX INFO: renamed from: k4 */
    public static fpw m6251k4(ThreeDFormat threeDFormat, fpw fpwVar) {
        fpw fpwVar2 = new fpw(threeDFormat);
        if (fpwVar != null) {
            fpwVar2.m6256k4((InterfaceC14672vc) fpwVar);
        }
        return fpwVar2;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f5081c5.mo4833k4(iBaseSlide, dm6Var);
        this.f5087jd.mo4833k4(iBaseSlide, dm6Var);
        this.f5082ck.m73524k4(iBaseSlide, dm6Var);
        this.f5085fa.m73524k4(iBaseSlide, dm6Var);
        this.f5093up.mo4833k4(iBaseSlide, dm6Var);
        this.f5094yj.mo4833k4(iBaseSlide, dm6Var);
        this.f5092to.mo4833k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6256k4(InterfaceC14672vc interfaceC14672vc) {
        fpw fpwVar = (fpw) interfaceC14672vc;
        this.f5086h4 = fpwVar.f5086h4;
        this.f5090m9 = fpwVar.f5090m9;
        this.f5084dy = fpwVar.f5084dy;
        this.f5081c5.m68518k4((InterfaceC14672vc) fpwVar.f5081c5);
        this.f5087jd.m68518k4((InterfaceC14672vc) fpwVar.f5087jd);
        this.f5082ck.m73526k4(fpwVar.f5082ck);
        this.f5085fa.m73526k4(fpwVar.f5085fa);
        this.f5093up.m72194k4((InterfaceC14672vc) fpwVar.f5093up);
        this.f5094yj.m72351k4((InterfaceC14672vc) fpwVar.f5094yj);
        this.f5088kk = fpwVar.f5088kk;
        this.f5089ks = fpwVar.f5089ks;
        this.f5091rv = fpwVar.f5091rv;
        this.f5092to.m68403k4((InterfaceC14672vc) fpwVar.f5092to);
        this.f5083du = fpwVar.f5083du;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, ThreeDFormat threeDFormat) {
        m6256k4(interfaceC14672vc);
        m6260x1(threeDFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(fpw fpwVar) {
        if (fpwVar == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, fpwVar)) {
            return true;
        }
        return this.f5086h4 == fpwVar.f5086h4 && this.f5090m9 == fpwVar.f5090m9 && this.f5084dy == fpwVar.f5084dy && this.f5081c5.mo4836k4(fpwVar.f5081c5) && this.f5087jd.mo4836k4(fpwVar.f5087jd) && this.f5082ck.m73531x1(fpwVar.f5082ck) && this.f5085fa.m73531x1(fpwVar.f5085fa) && this.f5093up.mo4836k4(fpwVar.f5093up) && this.f5094yj.mo4836k4(fpwVar.f5094yj) && this.f5088kk == fpwVar.f5088kk && this.f5089ks == fpwVar.f5089ks && this.f5091rv == fpwVar.f5091rv && this.f5092to.mo4836k4(fpwVar.f5092to) && this.f5083du == fpwVar.f5083du;
    }
}
