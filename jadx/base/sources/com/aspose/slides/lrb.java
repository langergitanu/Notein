package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class lrb extends AbstractC0872cw<PortionFormat, lrb> implements IPortionFormatEffectiveData {

    /* JADX INFO: renamed from: f9 */
    private InterfaceC14397rj f46061f9;

    /* JADX INFO: renamed from: gi */
    long f46062gi;

    /* JADX INFO: renamed from: kp */
    Hyperlink f46063kp;

    /* JADX INFO: renamed from: s7 */
    private Cell f46064s7;

    /* JADX INFO: renamed from: ss */
    Hyperlink f46065ss;

    /* JADX INFO: renamed from: t6 */
    private Chart f46066t6;

    /* JADX INFO: renamed from: wp */
    String f46067wp;

    /* JADX INFO: renamed from: xw */
    private static final Object f46060xw = new Object();

    /* JADX INFO: renamed from: vj */
    private static final lrb f46059vj = m64515jd();

    private lrb() {
        m64518up();
    }

    /* JADX INFO: renamed from: ck */
    public static lrb m64513ck() {
        lrb lrbVar = new lrb();
        ((AbstractC0872cw) lrbVar).f4475to = C14176nc.m67925yj();
        lrbVar.f4454c5 = C14176nc.m67925yj();
        lrbVar.f4480uz = 11.0f;
        lrbVar.f4483wy = 10.0f;
        lrbVar.f46062gi = 0L;
        lrbVar.f46065ss = null;
        lrbVar.f46063kp = null;
        return lrbVar;
    }

    /* JADX INFO: renamed from: fa */
    public static lrb m64514fa() {
        lrb lrbVar = new lrb();
        ((AbstractC0872cw) lrbVar).f4475to = C14176nc.m67925yj();
        lrbVar.f4454c5 = C14176nc.m67925yj();
        lrbVar.f4480uz = 12.0f;
        lrbVar.f4482wl = new FontData("+mn-lt");
        lrbVar.f4483wy = 12.0f;
        lrbVar.f46062gi = 0L;
        lrbVar.f46065ss = null;
        lrbVar.f46063kp = null;
        return lrbVar;
    }

    /* JADX INFO: renamed from: jd */
    public static lrb m64515jd() {
        lrb lrbVar = new lrb();
        ((AbstractC0872cw) lrbVar).f4475to = C14176nc.m67925yj();
        lrbVar.f4454c5 = C14176nc.m67925yj();
        lrbVar.f4480uz = 18.0f;
        lrbVar.f4483wy = 12.0f;
        lrbVar.f46062gi = 0L;
        lrbVar.f46067wp = null;
        lrbVar.f46065ss = null;
        lrbVar.f46063kp = null;
        return lrbVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static lrb m64516k4(PortionFormat portionFormat) {
        IPresentationComponent parent_IPresentationComponent = portionFormat.getParent_IPresentationComponent();
        if (!C7019kk.m27469x1(parent_IPresentationComponent, Portion.class)) {
            if (C7019kk.m27469x1(parent_IPresentationComponent, Paragraph.class)) {
                return ((Paragraph) parent_IPresentationComponent).m2161k4().m2200ks().f5104ix;
            }
            if (parent_IPresentationComponent == null) {
                return f46059vj;
            }
            throw new NotImplementedException();
        }
        Portion portion = (Portion) parent_IPresentationComponent;
        if (portion.getParent_Immediate() == null) {
            return f46059vj;
        }
        Paragraph paragraphM2282fa = portion.m2282fa();
        TextFrame textFrameM2927to = paragraphM2282fa.m2154ck().m2179kk().m2927to();
        if (textFrameM2927to != null) {
            int iIndexOf = paragraphM2282fa.m2154ck().indexOf(paragraphM2282fa);
            IParagraph iParagraph = (iIndexOf < 0 || iIndexOf >= textFrameM2927to.getParagraphs().getCount()) ? null : textFrameM2927to.getParagraphs().get_Item(iIndexOf);
            if (iParagraph != null) {
                int iIndexOf2 = paragraphM2282fa.getPortions().indexOf(portion);
                IPortionCollection portions = iParagraph.getPortions();
                if (iIndexOf2 >= 0 && iIndexOf2 < portions.getCount()) {
                    return ((Portion) portions.get_Item(iIndexOf2)).m2295x1().m2305bv();
                }
            }
        }
        return paragraphM2282fa.m2161k4().m2200ks().f5104ix;
    }

    /* JADX INFO: renamed from: up */
    private void m64518up() {
        this.f46062gi = 4294967295L;
        this.f46067wp = null;
        this.f46065ss = null;
        this.f46063kp = null;
    }

    /* JADX INFO: renamed from: c5 */
    public final long m64519c5() {
        return this.f46062gi;
    }

    @Override // com.aspose.slides.IPortionFormatEffectiveData
    public final String getBookmarkId() {
        return this.f46067wp;
    }

    @Override // com.aspose.slides.IPortionFormatEffectiveData
    public final IHyperlink getHyperlinkClick() {
        return this.f46065ss;
    }

    @Override // com.aspose.slides.IPortionFormatEffectiveData
    public final IHyperlink getHyperlinkMouseOver() {
        return this.f46063kp;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64523x1(PortionFormat portionFormat) {
        synchronized (f46060xw) {
            try {
                if (portionFormat.m2310lr()) {
                    return;
                }
                m4831k4((BasePortionFormat) portionFormat);
                if ((portionFormat.m367up().m5689k4() & 4294967295L) != 4294967295L) {
                    this.f46062gi = portionFormat.m367up().m5689k4();
                }
                if (portionFormat.getBookmarkId() != null) {
                    this.f46067wp = portionFormat.getBookmarkId();
                }
                if (portionFormat.getHyperlinkClick() != null) {
                    this.f46065ss = (Hyperlink) C7019kk.m27452k4((Object) portionFormat.getHyperlinkClick(), Hyperlink.class);
                }
                if (portionFormat.getHyperlinkMouseOver() != null) {
                    this.f46063kp = (Hyperlink) C7019kk.m27452k4((Object) portionFormat.getHyperlinkMouseOver(), Hyperlink.class);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lrb(PortionFormat portionFormat, lrb lrbVar) {
        super(portionFormat);
        m64518up();
        m64524x1(lrbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static lrb m64517k4(PortionFormat portionFormat, lrb lrbVar) {
        return new lrb(portionFormat, lrbVar);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64524x1(InterfaceC14672vc interfaceC14672vc) {
        if (interfaceC14672vc == null) {
            return;
        }
        m4834k4(interfaceC14672vc);
        lrb lrbVar = (lrb) interfaceC14672vc;
        this.f46062gi = lrbVar.f46062gi;
        this.f46067wp = lrbVar.f46067wp;
        this.f46065ss = lrbVar.f46065ss;
        this.f46063kp = lrbVar.f46063kp;
    }

    public lrb(fqc fqcVar) {
        super(fqcVar);
        m64518up();
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo6273k4(IBaseSlide iBaseSlide) {
        IFontData latinFont;
        if (iBaseSlide != null) {
            IFontSchemeEffectiveData fontScheme = iBaseSlide.createThemeEffective().getFontScheme();
            latinFont = this.f4482wl;
            if (this.f4476ts) {
                InterfaceC14397rj interfaceC14397rj = (InterfaceC14397rj) m4601W_();
                this.f46061f9 = interfaceC14397rj;
                Cell[] cellArr = {this.f46064s7};
                kke.m63959k4(Cell.class, interfaceC14397rj, cellArr);
                Cell cell = cellArr[0];
                this.f46064s7 = cell;
                if (cell != null) {
                    latinFont = ((cell.m464fa().m73908x1() == null || this.f46064s7.m464fa().m73908x1().m71656h4() != 2) ? fontScheme.getMinor() : fontScheme.getMajor()).getLatinFont();
                }
                Chart[] chartArr = {this.f46066t6};
                kke.m63959k4(Chart.class, this.f46061f9, chartArr);
                Chart chart = chartArr[0];
                this.f46066t6 = chart;
                if (chart != null) {
                    latinFont = chart.createThemeEffective().getFontScheme().getMinor().getLatinFont();
                }
            }
        } else {
            latinFont = null;
        }
        m4832k4(iBaseSlide, latinFont);
    }

    public lrb(fqc fqcVar, PortionFormat portionFormat) {
        super(fqcVar);
        m64518up();
        m64523x1(portionFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64520k4(IFontsEffectiveData iFontsEffectiveData, uc0 uc0Var) {
        if (iFontsEffectiveData != null) {
            if (iFontsEffectiveData.getLatinFont() != null) {
                this.f4482wl = (FontData) C7019kk.m27452k4((Object) iFontsEffectiveData.getLatinFont(), FontData.class);
            }
            if (iFontsEffectiveData.getEastAsianFont() != null) {
                this.f4450ar = (FontData) C7019kk.m27452k4((Object) iFontsEffectiveData.getEastAsianFont(), FontData.class);
            }
            if (iFontsEffectiveData.getComplexScriptFont() != null) {
                this.f4452bv = (FontData) C7019kk.m27452k4((Object) iFontsEffectiveData.getComplexScriptFont(), FontData.class);
            }
        }
        if (uc0Var != null) {
            if (uc0Var.m71657k4() != -1) {
                this.f4465jd = uc0Var.m71657k4();
            }
            if (uc0Var.m71665x1() != -1) {
                this.f4456ck = uc0Var.m71665x1();
            }
            if (uc0Var.m71662m9().getColorType() != -1) {
                ((AbstractC0872cw) this).f4475to.m67926c5().m73523k4((ColorFormat) uc0Var.m71662m9());
            }
        }
    }

    public lrb(fqc fqcVar, lrb lrbVar) {
        super(fqcVar);
        m64518up();
        m64524x1(lrbVar);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, PortionFormat portionFormat) {
        m64524x1(interfaceC14672vc);
        m64523x1(portionFormat);
        GeometryShape[] geometryShapeArr = {null};
        kke.m63959k4(GeometryShape.class, portionFormat, geometryShapeArr);
        GeometryShape geometryShape = geometryShapeArr[0];
        if (geometryShape != null && geometryShape.isGrouped()) {
            C14754wx c14754wxM1389m9 = geometryShape.m2595yd().m1389m9();
            if (!c14754wxM1389m9.isNoEffects() && c14754wxM1389m9.getGlowEffect() != null) {
                ((AbstractC0872cw) this).f4458du.f49865du = c14754wxM1389m9.f49865du;
                this.f4474sv = true;
            }
        }
        if (geometryShape == null || C7019kk.m27469x1(geometryShape, SmartArtShape.class)) {
            return;
        }
        C14754wx c14754wxM1389m92 = geometryShape.m2595yd().m1389m9();
        if (c14754wxM1389m92 != null && !c14754wxM1389m92.isNoEffects() && c14754wxM1389m92.getOuterShadowEffect() != null && geometryShape.getFillFormat().getEffective().getFillType() == 0 && c14754wxM1389m92.getOuterShadowEffect() != null && !((vmd) c14754wxM1389m92.getOuterShadowEffect()).m72364h4() && !((vmd) c14754wxM1389m92.getOuterShadowEffect()).m72366m9()) {
            ((AbstractC0872cw) this).f4458du.f49870m9 = c14754wxM1389m92.f49870m9;
            this.f4462g8 = true;
        }
        if (((AbstractC0872cw) this).f4463h4.getReflectionEffect() != null || c14754wxM1389m92 == null || c14754wxM1389m92.isNoEffects() || c14754wxM1389m92.getReflectionEffect() == null) {
            return;
        }
        ((AbstractC0872cw) this).f4458du.f49863c5 = c14754wxM1389m92.f49863c5;
        this.f4471qm = true;
    }

    public lrb(fqc fqcVar, lrb lrbVar, PortionFormat portionFormat) {
        super(fqcVar);
        m64518up();
        m64524x1(lrbVar);
        m64523x1(portionFormat);
    }

    @Override // com.aspose.slides.AbstractC0872cw, com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public boolean mo4836k4(lrb lrbVar) {
        return super.mo4836k4(lrbVar) && this.f46062gi == lrbVar.f46062gi && C14113y2.m67363du(this.f46067wp, lrbVar.f46067wp) && this.f46065ss.equals((IHyperlink) lrbVar.f46065ss) && this.f46063kp.equals((IHyperlink) lrbVar.f46063kp);
    }
}
