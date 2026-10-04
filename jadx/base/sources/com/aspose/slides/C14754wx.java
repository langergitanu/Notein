package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.wx */
/* JADX INFO: loaded from: classes3.dex */
final class C14754wx extends AbstractC0858ck<EffectFormat, C14754wx> implements IEffectFormatEffectiveData {

    /* JADX INFO: renamed from: fa */
    private static final C14754wx f49862fa = m72943dy();

    /* JADX INFO: renamed from: c5 */
    rhs f49863c5;

    /* JADX INFO: renamed from: ck */
    private C14754wx f49864ck;

    /* JADX INFO: renamed from: du */
    C1241i6 f49865du;

    /* JADX INFO: renamed from: dy */
    him f49866dy;

    /* JADX INFO: renamed from: h4 */
    zg0 f49867h4;

    /* JADX INFO: renamed from: jd */
    i1e f49868jd;

    /* JADX INFO: renamed from: kk */
    C1194hc f49869kk;

    /* JADX INFO: renamed from: m9 */
    vmd f49870m9;

    /* JADX INFO: renamed from: to */
    C1132g5 f49871to;

    public C14754wx(EffectFormat effectFormat) {
        super(effectFormat);
        m72946m9();
    }

    /* JADX INFO: renamed from: c5 */
    private C14754wx m72942c5() {
        Shape shape = (Shape) C7019kk.m27452k4((Object) m4601W_().getParent_IPresentationComponent(), Shape.class);
        if (shape == null || !shape.isGrouped() || !shape.getEffectFormat().isNoEffects() || shape.m2573s7() == null) {
            return null;
        }
        C14754wx c14754wxM1389m9 = ((EffectFormat) shape.m2573s7().getEffectFormat()).m1389m9();
        if (c14754wxM1389m9.isNoEffects()) {
            return null;
        }
        return c14754wxM1389m9;
    }

    /* JADX INFO: renamed from: dy */
    private static C14754wx m72943dy() {
        C14754wx c14754wx = new C14754wx((EffectFormat) null);
        c14754wx.f49869kk = null;
        c14754wx.f49871to = null;
        c14754wx.f49865du = null;
        c14754wx.f49867h4 = null;
        c14754wx.f49870m9 = null;
        c14754wx.f49866dy = null;
        c14754wx.f49863c5 = null;
        c14754wx.f49868jd = null;
        return c14754wx;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14754wx m72944k4(EffectFormat effectFormat) {
        C14754wx c14754wxM6307k4;
        IPresentationComponent parent_IPresentationComponent = effectFormat.getParent_IPresentationComponent();
        if (C7019kk.m27469x1(parent_IPresentationComponent, Shape.class)) {
            Shape shape = (Shape) parent_IPresentationComponent;
            if (C7019kk.m27469x1(shape, GeometryShape.class)) {
                GeometryShape geometryShape = (GeometryShape) shape;
                if (geometryShape.getShapeStyle() != null) {
                    IShapeStyle shapeStyle = geometryShape.getShapeStyle();
                    fuq fuqVar = (fuq) AbstractC0858ck.m4596k4(effectFormat).createThemeEffective();
                    return (fuqVar == null || (c14754wxM6307k4 = fuqVar.m6307k4(shapeStyle.getEffectStyleIndex())) == null) ? f49862fa : c14754wxM6307k4;
                }
            }
            Shape shape2 = (Shape) shape.getBasePlaceholder();
            return shape2 != null ? shape2.m2595yd().m1389m9() : f49862fa;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, FormatScheme.class)) {
            return f49862fa;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, Portion.class)) {
            Portion portion = (Portion) parent_IPresentationComponent;
            return portion.getParent_Immediate() == null ? f49862fa : (C14754wx) portion.m2282fa().m2161k4().m2200ks().f5104ix.getEffectFormat();
        }
        if (!C7019kk.m27469x1(parent_IPresentationComponent, ChartSeries.class)) {
            throw new NotImplementedException();
        }
        ChartSeries chartSeries = (ChartSeries) C7019kk.m27452k4((Object) parent_IPresentationComponent, ChartSeries.class);
        if (chartSeries.getType() != 32 && ((ChartTypeCharacterizer.isChartTypeDoughnut(chartSeries.getType()) || ChartTypeCharacterizer.isChartTypePie(chartSeries.getType()) || ChartTypeCharacterizer.isChartTypeColumn(chartSeries.getType()) || ChartTypeCharacterizer.isChartTypeBar(chartSeries.getType())) && (chartSeries.getChart().getStyle() < 32 || chartSeries.getChart().getStyle() > 39))) {
            fuq fuqVar2 = (fuq) AbstractC0858ck.m4596k4(effectFormat).createThemeEffective();
            long style = ((((((long) (chartSeries.getChart().getStyle() + 1)) & 4294967295L) / 9) & 4294967295L) % 3) & 4294967295L;
            if (fuqVar2 != null) {
                C14754wx c14754wxM6307k42 = fuqVar2.m6307k4(style);
                return c14754wxM6307k42 == null ? f49862fa : c14754wxM6307k42;
            }
        }
        return f49862fa;
    }

    /* JADX INFO: renamed from: m9 */
    private void m72946m9() {
        this.f49869kk = null;
        this.f49871to = null;
        this.f49865du = null;
        this.f49867h4 = null;
        this.f49870m9 = null;
        this.f49866dy = null;
        this.f49863c5 = null;
        this.f49868jd = null;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IBlurEffectiveData getBlurEffect() {
        return this.f49869kk;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IFillOverlayEffectiveData getFillOverlayEffect() {
        return this.f49871to;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IGlowEffectiveData getGlowEffect() {
        return this.f49865du;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IInnerShadowEffectiveData getInnerShadowEffect() {
        return this.f49867h4;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IOuterShadowEffectiveData getOuterShadowEffect() {
        return this.f49870m9;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IPresetShadowEffectiveData getPresetShadowEffect() {
        return this.f49866dy;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final IReflectionEffectiveData getReflectionEffect() {
        return this.f49863c5;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final ISoftEdgeEffectiveData getSoftEdgeEffect() {
        return this.f49868jd;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m72947h4() {
        this.f49869kk = null;
        this.f49871to = null;
        this.f49865du = null;
        this.f49867h4 = null;
        this.f49870m9 = null;
        this.f49866dy = null;
        this.f49863c5 = null;
        this.f49868jd = null;
    }

    @Override // com.aspose.slides.IEffectFormatEffectiveData
    public final boolean isNoEffects() {
        return this.f49869kk == null && this.f49871to == null && this.f49865du == null && this.f49867h4 == null && this.f49870m9 == null && this.f49866dy == null && this.f49863c5 == null && this.f49868jd == null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72951x1(EffectFormat effectFormat) {
        if (effectFormat.m1390to()) {
            this.f49869kk = effectFormat.getBlurEffect() == null ? null : (C1194hc) ((lft) effectFormat.getBlurEffect()).getEffective();
            this.f49871to = effectFormat.getFillOverlayEffect() == null ? null : (C1132g5) ((lft) effectFormat.getFillOverlayEffect()).getEffective();
            this.f49865du = effectFormat.getGlowEffect() == null ? null : (C1241i6) ((lft) effectFormat.getGlowEffect()).getEffective();
            this.f49867h4 = effectFormat.getInnerShadowEffect() == null ? null : (zg0) ((lft) effectFormat.getInnerShadowEffect()).getEffective();
            this.f49870m9 = effectFormat.getOuterShadowEffect() == null ? null : (vmd) ((lft) effectFormat.getOuterShadowEffect()).getEffective();
            this.f49866dy = effectFormat.getPresetShadowEffect() == null ? null : (him) ((lft) effectFormat.getPresetShadowEffect()).getEffective();
            this.f49863c5 = effectFormat.getReflectionEffect() == null ? null : (rhs) ((lft) effectFormat.getReflectionEffect()).getEffective();
            this.f49868jd = effectFormat.getSoftEdgeEffect() != null ? (i1e) ((lft) effectFormat.getSoftEdgeEffect()).getEffective() : null;
        }
    }

    public C14754wx(InterfaceC14398rk interfaceC14398rk) {
        super(interfaceC14398rk);
        m72946m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14754wx m72945k4(EffectFormat effectFormat, C14754wx c14754wx) {
        C14754wx c14754wx2 = new C14754wx(effectFormat);
        if (c14754wx != null) {
            c14754wx2.m72948k4((InterfaceC14672vc) c14754wx);
        }
        return c14754wx2;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        C1132g5 c1132g5 = this.f49871to;
        if (c1132g5 != null) {
            c1132g5.mo4351k4(iBaseSlide, dm6Var);
        }
        C1241i6 c1241i6 = this.f49865du;
        if (c1241i6 != null) {
            c1241i6.mo4351k4(iBaseSlide, dm6Var);
        }
        zg0 zg0Var = this.f49867h4;
        if (zg0Var != null) {
            zg0Var.mo4351k4(iBaseSlide, dm6Var);
        }
        vmd vmdVar = this.f49870m9;
        if (vmdVar != null) {
            vmdVar.mo4351k4(iBaseSlide, dm6Var);
        }
        him himVar = this.f49866dy;
        if (himVar != null) {
            himVar.mo4351k4(iBaseSlide, dm6Var);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72948k4(InterfaceC14672vc interfaceC14672vc) {
        C14754wx c14754wx = (C14754wx) interfaceC14672vc;
        this.f49869kk = c14754wx.f49869kk;
        this.f49871to = c14754wx.f49871to;
        this.f49865du = c14754wx.f49865du;
        this.f49867h4 = c14754wx.f49867h4;
        this.f49870m9 = c14754wx.f49870m9;
        this.f49866dy = c14754wx.f49866dy;
        this.f49863c5 = c14754wx.f49863c5;
        this.f49868jd = c14754wx.f49868jd;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, EffectFormat effectFormat) {
        m72948k4(interfaceC14672vc);
        m72951x1(effectFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14754wx c14754wx) {
        if (c14754wx == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c14754wx)) {
            return true;
        }
        return C3085sv.m13090k4(this.f49869kk, c14754wx.f49869kk) && C3085sv.m13090k4(this.f49871to, c14754wx.f49871to) && C3085sv.m13090k4(this.f49865du, c14754wx.f49865du) && C3085sv.m13090k4(this.f49867h4, c14754wx.f49867h4) && C3085sv.m13090k4(this.f49870m9, c14754wx.f49870m9) && C3085sv.m13090k4(this.f49866dy, c14754wx.f49866dy) && C3085sv.m13090k4(this.f49863c5, c14754wx.f49863c5) && C3085sv.m13090k4(this.f49868jd, c14754wx.f49868jd);
    }

    @Override // com.aspose.slides.AbstractC0858ck
    /* JADX INFO: renamed from: k4 */
    public boolean mo4606k4(boolean z) {
        boolean z2;
        C14754wx c14754wxM72942c5 = m72942c5();
        if (c14754wxM72942c5 == null || !(z || this.f49864ck == null || (c14754wxM72942c5.mo4607kk() & 4294967295L) != (4294967295L & this.f49864ck.mo4607kk()))) {
            z2 = false;
        } else {
            m72948k4((InterfaceC14672vc) c14754wxM72942c5);
            z2 = true;
        }
        this.f49864ck = c14754wxM72942c5;
        return z2;
    }
}
