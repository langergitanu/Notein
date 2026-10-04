package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.nc */
/* JADX INFO: loaded from: classes3.dex */
final class C14176nc extends AbstractC0858ck<FillFormat, C14176nc> implements IFillFormatEffectiveData {

    /* JADX INFO: renamed from: h4 */
    static final C14176nc f47496h4 = m67921up();

    /* JADX INFO: renamed from: c5 */
    private n9i f47497c5;

    /* JADX INFO: renamed from: ck */
    private C14176nc f47498ck;

    /* JADX INFO: renamed from: du */
    C14811xp f47499du;

    /* JADX INFO: renamed from: dy */
    private C13787ln f47500dy;

    /* JADX INFO: renamed from: jd */
    private qxi f47501jd;

    /* JADX INFO: renamed from: kk */
    byte f47502kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f47503m9;

    /* JADX INFO: renamed from: to */
    byte f47504to;

    public C14176nc(FillFormat fillFormat) {
        super(fillFormat);
        m67924x6();
    }

    /* JADX INFO: renamed from: du */
    public static C14176nc m67915du(FillFormat fillFormat) {
        C14176nc c14176nc = (C14176nc) AbstractC0858ck.m4597k4(C14176nc.class, fillFormat, new AbstractC4682du<FillFormat, C14176nc, C14176nc>() { // from class: com.aspose.slides.nc.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.FillFormatEffectiveData.CreateEmpty(Aspose.Slides.FillFormat,Aspose.Slides.FillFormatEffectiveData)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public C14176nc mo445k4(FillFormat fillFormat2, C14176nc c14176nc2) {
                return C14176nc.m67923x1(fillFormat2, c14176nc2);
            }
        });
        if (c14176nc == null || c14176nc.getFillType() != 5) {
            return c14176nc;
        }
        return null;
    }

    /* JADX INFO: renamed from: ks */
    public static C14176nc m67917ks() {
        C14176nc c14176nc = new C14176nc((FillFormat) null);
        c14176nc.f47502kk = (byte) 1;
        c14176nc.f47504to = (byte) 0;
        c14176nc.m67926c5().m73525k4(C12003du.f40505to.Clone());
        c14176nc.m67927ck().f47492x1.m73525k4(C12003du.m56460uz().Clone());
        c14176nc.m67927ck().f47491kk.m73525k4(C12003du.m56385i5().Clone());
        c14176nc.m67931jd().f46043du = (byte) 0;
        c14176nc.m67929fa();
        return c14176nc;
    }

    /* JADX INFO: renamed from: ne */
    private C14176nc m67918ne() {
        Shape shape = (Shape) C7019kk.m27452k4((Object) m4601W_().getParent_IPresentationComponent(), Shape.class);
        if (shape == null || getFillType() != 5) {
            return null;
        }
        C14176nc c14176ncM1454dy = shape.m2573s7() != null ? ((FillFormat) shape.m2573s7().getFillFormat()).m1454dy() : f47496h4;
        this.f47503m9 = true;
        return c14176ncM1454dy;
    }

    /* JADX INFO: renamed from: rv */
    public static C14176nc m67919rv() {
        C14176nc c14176nc = new C14176nc((FillFormat) null);
        c14176nc.f47502kk = (byte) 1;
        c14176nc.f47504to = (byte) 0;
        c14176nc.m67926c5().m73525k4(C12003du.f40505to.Clone());
        c14176nc.m67931jd().f46043du = (byte) 0;
        c14176nc.m67929fa();
        return c14176nc;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m67920to(FillFormat fillFormat) {
        IPresentationComponent parent_IPresentationComponent = fillFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, SmartArtShape.class)) {
            SmartArtShape smartArtShape = (SmartArtShape) C7019kk.m27452k4((Object) parent_IPresentationComponent, SmartArtShape.class);
            if (smartArtShape.m2821up().m4074dy().m74287x6() || smartArtShape.m2821up().m4074dy().m74240ix() || (fillFormat.getRotateWithShape() == -1 && smartArtShape.m2822wl().m71873kk().m28387wl() == null)) {
                return true;
            }
        }
        return (C7019kk.m27469x1(parent_IPresentationComponent, SmartArtShape.class) || C7019kk.m27469x1(parent_IPresentationComponent, AutoShape.class)) && ((GeometryShape) C7019kk.m27452k4((Object) parent_IPresentationComponent, GeometryShape.class)).m1591yj().m3308ck() == 0 && fillFormat.getFillType() == 2 && fillFormat.getGradientFormat() != null && fillFormat.getGradientFormat().getGradientShape() == 3;
    }

    /* JADX INFO: renamed from: up */
    public static C14176nc m67921up() {
        C14176nc c14176nc = new C14176nc((FillFormat) null);
        c14176nc.f47502kk = (byte) 0;
        c14176nc.f47504to = (byte) 1;
        c14176nc.m67926c5().m73525k4(C12003du.m56460uz().Clone());
        c14176nc.m67927ck().f47492x1.m73525k4(C12003du.m56460uz().Clone());
        c14176nc.m67927ck().f47491kk.m73525k4(C12003du.m56385i5().Clone());
        c14176nc.m67931jd().f46043du = (byte) 0;
        c14176nc.m67929fa();
        return c14176nc;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14176nc m67922x1(FillFormat fillFormat) {
        C14176nc c14176ncM6305k4;
        IPresentationComponent parent_IPresentationComponent = fillFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, Shape.class)) {
            Shape shape = (Shape) parent_IPresentationComponent;
            if (C7019kk.m27469x1(shape, GeometryShape.class)) {
                GeometryShape geometryShape = (GeometryShape) shape;
                if (geometryShape.getShapeStyle() != null) {
                    IShapeStyle shapeStyle = geometryShape.getShapeStyle();
                    fuq fuqVar = (fuq) AbstractC0858ck.m4596k4(fillFormat).createThemeEffective();
                    return (fuqVar == null || (c14176ncM6305k4 = fuqVar.m6305k4((int) shapeStyle.getFillStyleIndex())) == null) ? f47496h4 : c14176ncM6305k4;
                }
            }
            Shape shape2 = (Shape) shape.getBasePlaceholder();
            return shape2 != null ? ((FillFormat) shape2.getFillFormat()).m1454dy() : f47496h4;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, FormatScheme.class) || C7019kk.m27469x1(parent_IPresentationComponent, Background.class)) {
            return f47496h4;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, Cell.class)) {
            Cell cell = (Cell) parent_IPresentationComponent;
            return cell.m464fa().m73904k4() != null ? cell.m461ck().m496h4().m64985h4() : cell.m473kk().m2876up().m2882x1().m64985h4();
        }
        if (!C7019kk.m27469x1(parent_IPresentationComponent, x5o.class) && C7019kk.m27469x1(parent_IPresentationComponent, Portion.class)) {
            Portion portion = (Portion) parent_IPresentationComponent;
            return portion.m2282fa() != null ? (C14176nc) portion.m2282fa().getParagraphFormat().getEffective().getDefaultPortionFormat().getFillFormat() : f47496h4;
        }
        return f47496h4;
    }

    /* JADX INFO: renamed from: x6 */
    private void m67924x6() {
        this.f47502kk = (byte) -1;
        this.f47504to = (byte) -1;
        this.f47503m9 = false;
    }

    /* JADX INFO: renamed from: yj */
    public static C14176nc m67925yj() {
        C14176nc c14176nc = new C14176nc((FillFormat) null);
        c14176nc.f47502kk = (byte) 1;
        c14176nc.f47504to = (byte) 0;
        c14176nc.m67926c5().m73525k4(C12003du.m56460uz().Clone());
        c14176nc.m67927ck().f47492x1.m73525k4(C12003du.m56460uz().Clone());
        c14176nc.m67927ck().f47491kk.m73525k4(C12003du.m56385i5().Clone());
        c14176nc.m67931jd().f46043du = (byte) 0;
        c14176nc.m67929fa();
        return c14176nc;
    }

    /* JADX INFO: renamed from: c5 */
    public final C14811xp m67926c5() {
        if (this.f47499du == null) {
            this.f47499du = new C14811xp();
        }
        return this.f47499du;
    }

    /* JADX INFO: renamed from: ck */
    public final n9i m67927ck() {
        if (this.f47497c5 == null) {
            this.f47497c5 = new n9i();
        }
        return this.f47497c5;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m67928dy() {
        return this.f47503m9;
    }

    /* JADX INFO: renamed from: fa */
    public final qxi m67929fa() {
        if (this.f47501jd == null) {
            this.f47501jd = new qxi(this);
        }
        return this.f47501jd;
    }

    @Override // com.aspose.slides.IFillFormatEffectiveData
    public final byte getFillType() {
        return this.f47502kk;
    }

    @Override // com.aspose.slides.IFillFormatEffectiveData
    public final IGradientFormatEffectiveData getGradientFormat() {
        if (getFillType() == 2) {
            return this.f47500dy;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("GradientFormat is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    @Override // com.aspose.slides.IFillFormatEffectiveData
    public final IPatternFormatEffectiveData getPatternFormat() {
        if (getFillType() == 3) {
            return this.f47497c5;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("PatternFormat is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    @Override // com.aspose.slides.IFillFormatEffectiveData
    public final IPictureFillFormatEffectiveData getPictureFillFormat() {
        if (getFillType() == 4) {
            return this.f47501jd;
        }
        throw new InvalidOperationException(C14113y2.m67408k4("PictureFillFormat is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    @Override // com.aspose.slides.IFillFormatEffectiveData
    public final boolean getRotateWithShape() {
        return this.f47504to == 1;
    }

    @Override // com.aspose.slides.IFillFormatEffectiveData
    public final Integer getSolidFillColor() {
        return (Integer) C12003du.m56473x1(m67938m9());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m67930h4() {
        this.f47502kk = (byte) -1;
        this.f47504to = (byte) -1;
        C14811xp c14811xp = this.f47499du;
        if (c14811xp != null) {
            c14811xp.m73529to();
        }
        C13787ln c13787ln = this.f47500dy;
        if (c13787ln != null) {
            c13787ln.m64486k4();
        }
        n9i n9iVar = this.f47497c5;
        if (n9iVar != null) {
            n9iVar.m67901k4();
        }
        qxi qxiVar = this.f47501jd;
        if (qxiVar != null) {
            qxiVar.m69794k4();
        }
        this.f47503m9 = false;
    }

    /* JADX INFO: renamed from: jd */
    public final C13787ln m67931jd() {
        if (this.f47500dy == null) {
            this.f47500dy = new C13787ln();
        }
        return this.f47500dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m67936kk(FillFormat fillFormat) {
        if (fillFormat.getFillType() != -1) {
            this.f47502kk = fillFormat.getFillType();
            if (fillFormat.getRotateWithShape() != -1) {
                this.f47504to = fillFormat.getRotateWithShape();
            }
        }
        if (fillFormat.getFillType() == 1 && ((ColorFormat) fillFormat.getSolidFillColor()).m2138ix()) {
            m67926c5().m73523k4((ColorFormat) fillFormat.getSolidFillColor());
            return;
        }
        if (fillFormat.getFillType() == 2 && ((GradientFormat) fillFormat.getGradientFormat()).m2138ix()) {
            m67931jd().m64487k4((GradientFormat) fillFormat.getGradientFormat());
            return;
        }
        if (fillFormat.getFillType() == 3 && ((PatternFormat) fillFormat.getPatternFormat()).m2138ix()) {
            m67927ck().m67902k4((PatternFormat) fillFormat.getPatternFormat());
        } else if (fillFormat.getFillType() == 4 && ((PictureFillFormat) fillFormat.getPictureFillFormat()).m2138ix()) {
            m67929fa().m69795k4((PictureFillFormat) fillFormat.getPictureFillFormat());
        }
    }

    /* JADX INFO: renamed from: m9 */
    public C12003du m67938m9() {
        if (getFillType() == 1) {
            return this.f47499du.m73522k4();
        }
        throw new InvalidOperationException(C14113y2.m67408k4("SolidFillColor is unavailable for FillType=", C14042ak.m66410k4(FillType.class, getFillType())));
    }

    public C14176nc(InterfaceC14398rk interfaceC14398rk) {
        super(interfaceC14398rk);
        m67924x6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static C14176nc m67923x1(FillFormat fillFormat, C14176nc c14176nc) {
        C14176nc c14176nc2 = new C14176nc(fillFormat);
        c14176nc2.m67934k4((InterfaceC14672vc) c14176nc);
        return c14176nc2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67932k4(FillFormat fillFormat) {
        if (fillFormat.getFillType() == 1) {
            m67926c5().m73523k4((ColorFormat) fillFormat.getSolidFillColor());
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14176nc c14176nc) {
        if (c14176nc == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c14176nc)) {
            return true;
        }
        if (getFillType() != c14176nc.getFillType() || m67928dy() != c14176nc.m67928dy()) {
            return false;
        }
        byte fillType = getFillType();
        if (fillType == 1) {
            return m67926c5().equals(c14176nc.m67926c5());
        }
        if (fillType == 2) {
            return m67931jd().mo4836k4(c14176nc.m67931jd()) && this.f47504to == c14176nc.f47504to;
        }
        if (fillType == 3) {
            return m67927ck().mo4836k4(c14176nc.m67927ck()) && this.f47504to == c14176nc.f47504to;
        }
        if (fillType != 4) {
            return true;
        }
        return m67929fa().mo4836k4(c14176nc.m67929fa()) && this.f47504to == c14176nc.f47504to;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        byte fillType = getFillType();
        if (fillType == 1) {
            m67926c5().m73524k4(iBaseSlide, dm6Var);
            return;
        }
        if (fillType == 2) {
            m67931jd().mo4833k4(iBaseSlide, dm6Var);
        } else if (fillType == 3) {
            m67927ck().mo4833k4(iBaseSlide, dm6Var);
        } else {
            if (fillType != 4) {
                return;
            }
            m67929fa().mo4833k4(iBaseSlide, dm6Var);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m67939x1(C14176nc c14176nc) {
        this.f47504to = c14176nc.f47504to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67933k4(C14176nc c14176nc) {
        if (c14176nc.f47503m9 && !this.f47503m9) {
            this.f47502kk = (byte) 5;
            return;
        }
        this.f47502kk = c14176nc.f47502kk;
        byte fillType = getFillType();
        if (fillType == 1) {
            m67926c5().m73526k4(c14176nc.m67926c5());
            return;
        }
        if (fillType == 2) {
            m67931jd().m64488k4((InterfaceC14672vc) c14176nc.m67931jd());
        } else if (fillType == 3) {
            m67927ck().m67903k4((InterfaceC14672vc) c14176nc.m67927ck());
        } else {
            if (fillType != 4) {
                return;
            }
            m67929fa().m69796k4((InterfaceC14672vc) c14176nc.m67929fa());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67934k4(InterfaceC14672vc interfaceC14672vc) {
        C14176nc c14176nc = (C14176nc) interfaceC14672vc;
        m67933k4(c14176nc);
        m67939x1(c14176nc);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, FillFormat fillFormat) {
        m67934k4(interfaceC14672vc);
        m67936kk(fillFormat);
        IPresentationComponent parent_IPresentationComponent = fillFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, SmartArtShape.class)) {
            SmartArtShape smartArtShape = (SmartArtShape) C7019kk.m27452k4((Object) parent_IPresentationComponent, SmartArtShape.class);
            if (smartArtShape.m2821up().m4074dy().m74287x6() || smartArtShape.m2821up().m4074dy().m74240ix()) {
                this.f47502kk = (byte) 0;
            }
            if (fillFormat.getRotateWithShape() == -1 && smartArtShape.m2822wl().m71873kk().m28387wl() == null) {
                this.f47504to = (byte) 0;
            }
        }
        if ((C7019kk.m27469x1(parent_IPresentationComponent, SmartArtShape.class) || C7019kk.m27469x1(parent_IPresentationComponent, AutoShape.class)) && ((GeometryShape) C7019kk.m27452k4((Object) parent_IPresentationComponent, GeometryShape.class)).m1591yj().m3308ck() == 0 && fillFormat.getFillType() == 2 && fillFormat.getGradientFormat() != null && fillFormat.getGradientFormat().getGradientShape() == 3) {
            m67931jd().f46043du = (byte) 2;
            m67931jd().f46050x1 = 4;
        }
    }

    @Override // com.aspose.slides.AbstractC0858ck
    /* JADX INFO: renamed from: k4 */
    public boolean mo4606k4(boolean z) {
        boolean z2;
        C14176nc c14176ncM67918ne = m67918ne();
        if (c14176ncM67918ne == null || !(z || this.f47498ck == null || (c14176ncM67918ne.mo4607kk() & 4294967295L) != (4294967295L & this.f47498ck.mo4607kk()))) {
            z2 = false;
        } else {
            m67934k4((InterfaceC14672vc) c14176ncM67918ne);
            z2 = true;
        }
        this.f47498ck = c14176ncM67918ne;
        return z2;
    }
}
