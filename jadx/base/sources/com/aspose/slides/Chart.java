package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Chart extends GraphicalObject implements IChart {

    /* JADX INFO: renamed from: ak */
    private static final Object[] f1294ak = new Object[0];

    /* JADX INFO: renamed from: ar */
    private final AxesManager f1295ar;

    /* JADX INFO: renamed from: b3 */
    private C1162gu f1296b3;

    /* JADX INFO: renamed from: bv */
    private GroupShape f1297bv;

    /* JADX INFO: renamed from: dq */
    private int f1298dq;

    /* JADX INFO: renamed from: du */
    private int f1299du;

    /* JADX INFO: renamed from: h4 */
    private boolean f1300h4;

    /* JADX INFO: renamed from: ix */
    private Legend f1301ix;

    /* JADX INFO: renamed from: k4 */
    int f1302k4;

    /* JADX INFO: renamed from: kk */
    private ChartWall f1303kk;

    /* JADX INFO: renamed from: ks */
    private DataTable f1304ks;

    /* JADX INFO: renamed from: lr */
    private boolean f1305lr;

    /* JADX INFO: renamed from: m9 */
    private final ChartTitle f1306m9;

    /* JADX INFO: renamed from: ne */
    private boolean f1307ne;

    /* JADX INFO: renamed from: qq */
    private ChartTextFormat f1308qq;

    /* JADX INFO: renamed from: rv */
    private int f1309rv;

    /* JADX INFO: renamed from: to */
    private ChartWall f1310to;

    /* JADX INFO: renamed from: u4 */
    private boolean f1311u4;

    /* JADX INFO: renamed from: um */
    private final ChartThemeManager f1312um;

    /* JADX INFO: renamed from: uz */
    private ChartData f1313uz;

    /* JADX INFO: renamed from: v4 */
    private final C13726kf f1314v4;

    /* JADX INFO: renamed from: wl */
    private ChartPlotArea f1315wl;

    /* JADX INFO: renamed from: wy */
    private boolean f1316wy;

    /* JADX INFO: renamed from: x1 */
    private ChartWall f1317x1;

    /* JADX INFO: renamed from: x6 */
    private Rotation3D f1318x6;

    /* JADX INFO: renamed from: yd */
    private C13682je f1319yd;

    /* JADX INFO: renamed from: yj */
    private boolean f1320yj;

    public Chart(ShapeCollection shapeCollection, int i) {
        super(shapeCollection, new C0907dn());
        this.f1299du = 1;
        this.f1300h4 = false;
        this.f1320yj = false;
        this.f1309rv = 2;
        this.f1307ne = true;
        this.f1311u4 = true;
        this.f1305lr = true;
        this.f3300c5 = new LineFormat(this);
        this.f1313uz = new ChartData(this);
        this.f1295ar = new AxesManager(this);
        setType(i);
        this.f1312um = new ChartThemeManager(this);
        this.f1306m9 = new ChartTitle(this);
        this.f1317x1 = new ChartWall(this);
        this.f1303kk = new ChartWall(this);
        this.f1310to = new ChartWall(this);
        this.f1301ix = new Legend(this);
        this.f1304ks = new DataTable(this);
        this.f1318x6 = new Rotation3D(this);
        this.f1315wl = new ChartPlotArea(this);
        this.f1319yd = new C13682je();
        this.f1314v4 = new C13726kf(this);
        this.f1296b3 = new C1162gu(this);
        m2560k4(new C0878d2(this));
    }

    /* JADX INFO: renamed from: ck */
    public final void m503ck() {
        int iIntValue;
        IChartSeriesCollection series = getChartData().getSeries();
        List list = new List();
        IGenericEnumerator<IChartSeries> it = series.iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (!list.containsItem(Integer.valueOf(chartSeries.getType()))) {
                    list.addItem(Integer.valueOf(chartSeries.getType()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (list.size() == 1) {
            iIntValue = ((Integer) list.get_Item(0)).intValue();
        } else if (list.size() <= 1) {
            return;
        } else {
            iIntValue = 73;
        }
        this.f1302k4 = iIntValue;
    }

    @Override // com.aspose.slides.IThemeable
    public final IThemeEffectiveData createThemeEffective() {
        return getThemeManager().createThemeEffective();
    }

    @Override // com.aspose.slides.IChart
    public final IAxesManager getAxes() {
        return this.f1295ar;
    }

    @Override // com.aspose.slides.IChart
    public final IChartWall getBackWall() {
        return this.f1317x1;
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return this;
    }

    @Override // com.aspose.slides.IChart
    public final IChartData getChartData() {
        return this.f1313uz;
    }

    @Override // com.aspose.slides.IChart
    public final IDataTable getChartDataTable() {
        return this.f1304ks;
    }

    @Override // com.aspose.slides.IChart
    public final IChartTitle getChartTitle() {
        return this.f1306m9;
    }

    @Override // com.aspose.slides.IChart
    public final int getDisplayBlanksAs() {
        return this.f1309rv;
    }

    @Override // com.aspose.slides.IChart
    public final IChartWall getFloor() {
        return this.f1310to;
    }

    @Override // com.aspose.slides.IChart
    public final ILegend getLegend() {
        return this.f1301ix;
    }

    @Override // com.aspose.slides.IChart
    public final IChartPlotArea getPlotArea() {
        return this.f1315wl;
    }

    @Override // com.aspose.slides.IChart
    public final boolean getPlotVisibleCellsOnly() {
        return this.f1311u4;
    }

    @Override // com.aspose.slides.IChart
    public final IRotation3D getRotation3D() {
        return this.f1318x6;
    }

    @Override // com.aspose.slides.IChart
    public final boolean getShowDataLabelsOverMaximum() {
        return this.f1305lr;
    }

    @Override // com.aspose.slides.IChart
    public final IChartWall getSideWall() {
        return this.f1303kk;
    }

    @Override // com.aspose.slides.IChart
    public final int getStyle() {
        return this.f1299du;
    }

    @Override // com.aspose.slides.IFormattedTextContainer
    public final IChartTextFormat getTextFormat() {
        if (ChartTypeCharacterizer.m767to(getType())) {
            return null;
        }
        if (this.f1308qq == null) {
            this.f1308qq = new ChartTextFormat(this);
        }
        return this.f1308qq;
    }

    @Override // com.aspose.slides.IOverrideThemeable
    public final IOverrideThemeManager getThemeManager() {
        return this.f1312um;
    }

    @Override // com.aspose.slides.IChart
    public final int getType() {
        m503ck();
        return this.f1302k4;
    }

    @Override // com.aspose.slides.IChart
    public final IGroupShape getUserShapes() {
        if (this.f1297bv == null) {
            this.f1297bv = new GroupShape(this);
        }
        m505k4().m4898x1();
        return this.f1297bv;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du[] m504h4() {
        return igr.m7631k4(this, getStyle() + 1);
    }

    @Override // com.aspose.slides.IChart
    public final boolean hasDataTable() {
        return this.f1320yj;
    }

    @Override // com.aspose.slides.IChart
    public final boolean hasLegend() {
        return this.f1307ne;
    }

    @Override // com.aspose.slides.IChart
    public final boolean hasRoundedCorners() {
        return this.f1316wy;
    }

    @Override // com.aspose.slides.IChart
    public final boolean hasTitle() {
        return this.f1300h4;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        super.mo280jd();
        m2559k4(((Slide) m2583vj()).m2687bv().m406x1(getPlaceholder().getIndex()).m2593xk());
    }

    /* JADX INFO: renamed from: k4 */
    public final C0878d2 m505k4() {
        return (C0878d2) m2546bz();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m512kk() {
        return m511k4(getType());
    }

    /* JADX INFO: renamed from: ks */
    public final C13726kf m513ks() {
        return this.f1314v4;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m514m9() {
        return this.f1298dq;
    }

    /* JADX INFO: renamed from: rv */
    public final C1162gu m515rv() {
        return this.f1296b3;
    }

    @Override // com.aspose.slides.IChart
    public final void setDataTable(boolean z) {
        this.f1320yj = z;
    }

    @Override // com.aspose.slides.IChart
    public final void setDisplayBlanksAs(int i) {
        this.f1309rv = i;
    }

    @Override // com.aspose.slides.IChart
    public final void setLegend(boolean z) {
        this.f1307ne = z;
    }

    @Override // com.aspose.slides.IChart
    public final void setPlotVisibleCellsOnly(boolean z) {
        this.f1311u4 = z;
    }

    @Override // com.aspose.slides.IChart
    public final void setRoundedCorners(boolean z) {
        this.f1316wy = z;
    }

    @Override // com.aspose.slides.IChart
    public final void setShowDataLabelsOverMaximum(boolean z) {
        this.f1305lr = z;
    }

    @Override // com.aspose.slides.IChart
    public final void setStyle(int i) {
        this.f1299du = i;
    }

    @Override // com.aspose.slides.IChart
    public final void setTitle(boolean z) {
        this.f1300h4 = z;
    }

    @Override // com.aspose.slides.IChart
    public final void setType(int i) {
        if (i == 73) {
            throw new InvalidOperationException("It's meaningless to assign ChartType.SeriesOfMixedTypes value to Chart.Type.");
        }
        this.f1302k4 = i;
        IGenericEnumerator<IChartSeries> it = getChartData().getSeries().iterator();
        while (it.hasNext()) {
            try {
                ((ChartSeries) it.next()).setType(i);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f1295ar.m315kk();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m516to() {
        IGenericEnumerator<IChartSeries> it = getChartData().getSeries().iterator();
        while (it.hasNext()) {
            try {
                if (!m511k4(it.next().getType())) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: up */
    public final C13682je m517up() {
        return this.f1319yd;
    }

    @Override // com.aspose.slides.IChart
    public final void validateChartLayout() {
        if (!m512kk()) {
            throw new NotSupportedException("Calculation of automatic values and chart layout is not supported for this chart type");
        }
        new C0974f2(new C14365qy(this, null, null)).m7148h4();
    }

    @Override // com.aspose.slides.GraphicalObject
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final C0907dn mo268du() {
        return (C0907dn) super.mo268du();
    }

    /* JADX INFO: renamed from: yj */
    public final GroupShape m521yj() {
        return this.f1297bv;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C12003du m506k4(byte b) {
        IBaseSlide iBaseSlideM2713v4;
        ColorFormat colorFormatM390k4;
        IColorScheme colorScheme;
        int iIntValue = C13682je.f45474k4.m13011kk(Byte.valueOf(b)).intValue();
        if (iIntValue == 13) {
            iIntValue = 1;
        }
        if (iIntValue == 15) {
            iIntValue = 3;
        }
        if (m517up().m63294k4()) {
            byte bM63289k4 = m517up().m63289k4(iIntValue);
            if (!getThemeManager().isOverrideThemeEnabled() || (colorScheme = getThemeManager().getOverrideTheme().getColorScheme()) == null) {
                if (C7019kk.m27469x1(getSlide(), MasterSlide.class)) {
                    iBaseSlideM2713v4 = getSlide();
                } else if (C7019kk.m27469x1(getSlide(), LayoutSlide.class)) {
                    iBaseSlideM2713v4 = ((LayoutSlide) C7019kk.m27452k4((Object) getSlide(), LayoutSlide.class)).getMasterSlide();
                } else {
                    if (((Slide) C7019kk.m27452k4((Object) getSlide(), Slide.class)).m2713v4() == null) {
                        return C12003du.f40505to;
                    }
                    iBaseSlideM2713v4 = ((Slide) C7019kk.m27452k4((Object) getSlide(), Slide.class)).m2713v4();
                }
                colorFormatM390k4 = ((MasterSlide) C7019kk.m27452k4((Object) iBaseSlideM2713v4, MasterSlide.class)).m390k4(iIntValue);
            } else {
                colorFormatM390k4 = (ColorFormat) colorScheme.getByColorSchemeIndex(bM63289k4);
            }
        }
        return colorFormatM390k4.m1084to();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m519x1(int i) {
        this.f1298dq = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m507k4(IChartTextFormat iChartTextFormat, C12003du c12003du) {
        C12003du c12003duClone = c12003du.Clone();
        C14911zr c14911zrM717x6 = ((ChartPortionFormat) iChartTextFormat.getPortionFormat()).m717x6();
        if (c14911zrM717x6.getFillFormat().getFillType() == 1 && C12003du.m56476x1(((C14176nc) c14911zrM717x6.getFillFormat()).m67938m9(), C12003du.f40505to)) {
            ((C14176nc) c14911zrM717x6.getFillFormat()).m67938m9().CloneTo(c12003duClone);
        }
        return c12003duClone;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12003du m508k4(C12003du c12003du, ITextFrame iTextFrame) {
        if (iTextFrame != null && iTextFrame.getParagraphs().getCount() > 0) {
            IParagraph iParagraph = iTextFrame.getParagraphs().get_Item(0);
            IPortionFormat defaultPortionFormat = iParagraph.getParagraphFormat().getDefaultPortionFormat();
            IFillFormatEffectiveData fillFormat = (defaultPortionFormat.getFillFormat() == null || defaultPortionFormat.getFillFormat().getFillType() == 0 || defaultPortionFormat.getFillFormat().getFillType() == -1) ? null : defaultPortionFormat.getEffective().getFillFormat();
            if (iParagraph.getPortions().getCount() > 0) {
                IPortionFormat portionFormat = iParagraph.getPortions().get_Item(0).getPortionFormat();
                IPortionFormatEffectiveData effective = portionFormat.getEffective();
                if (portionFormat.getFillFormat() != null && portionFormat.getFillFormat().getFillType() != 0 && portionFormat.getFillFormat().getFillType() != -1) {
                    fillFormat = effective.getFillFormat();
                }
            }
            if (fillFormat != null && fillFormat.getFillType() == 1) {
                C14176nc c14176nc = (C14176nc) fillFormat;
                if (!C12003du.m56403k4(c14176nc.m67938m9(), C12003du.f40505to)) {
                    return c14176nc.m67938m9();
                }
            }
        }
        return c12003du;
    }

    /* JADX INFO: renamed from: k4 */
    private C12013m9 m502k4(FontData fontData, float f, int i, String str) {
        if (fontData == null) {
            throw new ArgumentNullException("fontData");
        }
        C12013m9 c12013m9M7123k4 = ((Presentation) getPresentation()).m2385ks().m7123k4(fontData.getFontName(), f, i);
        if (((Presentation) getPresentation()).m2385ks().m7134x1(fontData.getFontName()) == null && !C14113y2.m67448x1(c12013m9M7123k4.m56648m9(), fontData.getFontName())) {
            for (String str2 : C13678ja.m63262k4(fontData.m1485k4(), fontData.m1490x1() & 255, fontData.m1488kk(), str)) {
                C12013m9 c12013m9M7123k42 = ((Presentation) getPresentation()).m2385ks().m7123k4(str2, f, i);
                if (C14113y2.m67448x1(c12013m9M7123k42.m56651x1().m56527du(), str2)) {
                    return c12013m9M7123k42;
                }
            }
        }
        return c12013m9M7123k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m509k4(IChartTextFormat iChartTextFormat) {
        C14911zr c14911zrM717x6 = ((ChartPortionFormat) iChartTextFormat.getPortionFormat()).m717x6();
        boolean fontBold = c14911zrM717x6.getFontBold();
        int i = fontBold;
        if (c14911zrM717x6.getFontItalic()) {
            i = (fontBold ? 1 : 0) | 2;
        }
        return m502k4((FontData) c14911zrM717x6.getLatinFont(), c14911zrM717x6.m4837m9(), i, c14911zrM717x6.getLanguageId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final C12013m9 m510k4(IChartTextFormat iChartTextFormat, TextFrame textFrame) {
        if (iChartTextFormat == null) {
            throw new ArgumentNullException("textFormatOfAutoText");
        }
        if (textFrame == null) {
            throw new ArgumentNullException("textFrameForOverriding");
        }
        C14911zr c14911zrM717x6 = ((ChartPortionFormat) iChartTextFormat.getPortionFormat()).m717x6();
        boolean fontBold = c14911zrM717x6.getFontBold();
        int i = fontBold;
        if (c14911zrM717x6.getFontItalic()) {
            i = (fontBold ? 1 : 0) | 2;
        }
        float fM4837m9 = c14911zrM717x6.m4837m9();
        IFontData latinFont = c14911zrM717x6.getLatinFont();
        if (textFrame.getParagraphs().getCount() > 0) {
            IParagraph iParagraph = textFrame.getParagraphs().get_Item(0);
            IPortionFormat defaultPortionFormat = iParagraph.getParagraphFormat().getDefaultPortionFormat();
            IPortionFormatEffectiveData effective = defaultPortionFormat.getEffective();
            float fontHeight = defaultPortionFormat.getFontHeight();
            IFontData latinFont2 = defaultPortionFormat.getLatinFont() == null ? null : effective.getLatinFont();
            byte fontBold2 = defaultPortionFormat.getFontBold();
            byte fontItalic = defaultPortionFormat.getFontItalic();
            if (iParagraph.getPortions().getCount() > 0) {
                IPortionFormat portionFormat = iParagraph.getPortions().get_Item(0).getPortionFormat();
                IPortionFormatEffectiveData effective2 = portionFormat.getEffective();
                if (!C14064he.m66715kk(portionFormat.getFontHeight())) {
                    fontHeight = portionFormat.getFontHeight();
                }
                if (portionFormat.getLatinFont() != null) {
                    latinFont2 = effective2.getLatinFont();
                }
                if (portionFormat.getFontBold() != -1) {
                    fontBold2 = portionFormat.getFontBold();
                }
                if (portionFormat.getFontItalic() != -1) {
                    fontItalic = portionFormat.getFontItalic();
                }
            }
            if (!C14064he.m66715kk(fontHeight)) {
                fM4837m9 = fontHeight;
            }
            if (latinFont2 != null) {
                latinFont = latinFont2;
            }
            i = i;
            if (fontBold2 == 1) {
                i = (i == true ? 1 : 0) | true;
            } else if (fontBold2 == 0) {
                i = (i == true ? 1 : 0) & (-2);
            }
            if (fontItalic == 1) {
                i = (i == true ? 1 : 0) | 2;
            } else if (fontItalic == 0) {
                i = (i == true ? 1 : 0) & (-3);
            }
        }
        return m502k4((FontData) latinFont, fM4837m9, i, c14911zrM717x6.getLanguageId());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0038 A[FALL_THROUGH, RETURN] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m511k4(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 26 && i != 28 && i != 29 && i != 31 && i != 32 && i != 34 && i != 35) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                            break;
                                        case 73:
                                            return m516to();
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                            return true;
                                        default:
                                            return false;
                                    }
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 60:
                                case 61:
                                    return true;
                            }
                        case 47:
                        case 48:
                        case 49:
                            break;
                    }
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
            }
        }
        return true;
    }
}
