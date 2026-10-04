package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.zr */
/* JADX INFO: loaded from: classes3.dex */
final class C14911zr extends AbstractC0872cw<ChartPortionFormat, C14911zr> implements InterfaceC14720w1 {

    /* JADX INFO: renamed from: gi */
    private static final C14911zr f50710gi = m74770c5();

    /* JADX INFO: renamed from: kp */
    private InterfaceC14397rj f50711kp;

    /* JADX INFO: renamed from: ss */
    private Chart f50712ss;

    /* JADX INFO: renamed from: wp */
    boolean f50713wp;

    public C14911zr() {
        this.f50713wp = false;
    }

    /* JADX INFO: renamed from: c5 */
    private static C14911zr m74770c5() {
        C14911zr c14911zr = new C14911zr();
        ((AbstractC0872cw) c14911zr).f4475to = C14176nc.m67917ks();
        c14911zr.f4454c5 = C14176nc.m67917ks();
        c14911zr.f4480uz = 10.0f;
        c14911zr.f4483wy = 8.0f;
        return c14911zr;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C14911zr m74771k4(ChartPortionFormat chartPortionFormat) {
        IChart chart;
        IChartTextFormat textFormat;
        IChartPortionFormat portionFormat;
        C0859cl c0859clM63791c5;
        IPresentationComponent parent_IPresentationComponent = chartPortionFormat.getParent_IPresentationComponent();
        if (parent_IPresentationComponent == null) {
            return f50710gi;
        }
        if (!C7019kk.m27469x1(parent_IPresentationComponent, IChartComponent.class)) {
            throw new NotImplementedException();
        }
        IChartComponent iChartComponent = (IChartComponent) C7019kk.m27452k4((Object) parent_IPresentationComponent, IChartComponent.class);
        if (ChartTypeCharacterizer.m767to(((Chart) iChartComponent.getChart()).getChartData().getSeries().get_Item(0).getType()) && ((Chart) iChartComponent.getChart()).m513ks().m63805kk()) {
            Chart chart2 = (Chart) iChartComponent.getChart();
            if (C7019kk.m27469x1(iChartComponent, ChartTitle.class)) {
                c0859clM63791c5 = iChartComponent.getChart().getChartTitle() == iChartComponent ? chart2.m513ks().m63824yd() : chart2.m513ks().m63794du();
            } else {
                if (!C7019kk.m27469x1(parent_IPresentationComponent, LegendEntryProperties.class)) {
                    if (C7019kk.m27469x1(iChartComponent, Legend.class)) {
                        c0859clM63791c5 = chart2.m513ks().m63788ar();
                    } else if (C7019kk.m27469x1(iChartComponent, DataTable.class)) {
                        c0859clM63791c5 = chart2.m513ks().m63806ks();
                    } else if (C7019kk.m27469x1(iChartComponent, Trendline.class)) {
                        c0859clM63791c5 = chart2.m513ks().m63819wy();
                    } else {
                        if (C7019kk.m27469x1(parent_IPresentationComponent, DataLabel.class) || C7019kk.m27469x1(parent_IPresentationComponent, DataLabelFormat.class)) {
                            c0859clM63791c5 = chart2.m513ks().m63791c5();
                        }
                        if (!C7019kk.m27469x1(iChartComponent, Axis.class)) {
                        }
                    }
                }
                textFormat = ((Legend) iChartComponent.getChart().getLegend()).getTextFormat();
                portionFormat = textFormat.getPortionFormat();
            }
            portionFormat = c0859clM63791c5.m4617kk().getPortionFormat();
        } else {
            if (!C7019kk.m27469x1(iChartComponent, Axis.class)) {
                return m74773k4(iChartComponent);
            }
            if (C7019kk.m27469x1(iChartComponent, Legend.class) || C7019kk.m27469x1(iChartComponent, DataTable.class) || C7019kk.m27469x1(iChartComponent, ChartTitle.class) || C7019kk.m27469x1(iChartComponent, Trendline.class)) {
                chart = iChartComponent.getChart();
            } else {
                if (C7019kk.m27469x1(parent_IPresentationComponent, LegendEntryProperties.class)) {
                    textFormat = ((Legend) iChartComponent.getChart().getLegend()).getTextFormat();
                } else if (C7019kk.m27469x1(iChartComponent, C14609ty.class)) {
                    textFormat = ((C14609ty) iChartComponent).m71459to().getTextFormat();
                } else {
                    if (!C7019kk.m27469x1(iChartComponent, DataLabelFormat.class)) {
                        if (C7019kk.m27469x1(iChartComponent, Chart.class)) {
                            return f50710gi;
                        }
                        throw new NotImplementedException();
                    }
                    DataLabelFormat dataLabelFormat = (DataLabelFormat) C7019kk.m27452k4((Object) iChartComponent, DataLabelFormat.class);
                    if (C7019kk.m27469x1(dataLabelFormat.m1315h4(), DataLabelCollection.class)) {
                        chart = dataLabelFormat.m1315h4().getChart();
                    } else {
                        if (!C7019kk.m27469x1(dataLabelFormat.m1315h4(), DataLabel.class)) {
                            throw new NotImplementedException();
                        }
                        textFormat = ((DataLabelFormat) ((DataLabel) dataLabelFormat.m1315h4()).m1294dy().getLabels().getDefaultDataLabelFormat()).getTextFormat();
                    }
                }
                portionFormat = textFormat.getPortionFormat();
            }
            textFormat = ((Chart) chart).getTextFormat();
            portionFormat = textFormat.getPortionFormat();
        }
        return ((ChartPortionFormat) portionFormat).m717x6();
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m74775kk(ChartPortionFormat chartPortionFormat) {
        ITextFrame textFrameForOverriding;
        if (chartPortionFormat.m716rv() == null) {
            return false;
        }
        if (C7019kk.m27469x1(chartPortionFormat.m716rv(), ChartTitle.class)) {
            boolean zM63805kk = ((Chart) C7019kk.m27452k4((Object) ((ChartTitle) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), ChartTitle.class)).getChart(), Chart.class)).m513ks().m63805kk();
            if (C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), InterfaceC14397rj.class)).getParent_Immediate(), Chart.class) && !zM63805kk) {
                return true;
            }
            textFrameForOverriding = ((ChartTitle) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), ChartTitle.class)).getTextFrameForOverriding();
        } else {
            textFrameForOverriding = C7019kk.m27469x1(chartPortionFormat.m716rv(), Trendline.class) ? ((Trendline) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), Trendline.class)).getTextFrameForOverriding() : (C7019kk.m27469x1(chartPortionFormat.m716rv(), DataLabelFormat.class) && C7019kk.m27469x1(((DataLabelFormat) chartPortionFormat.m716rv()).getParent_Immediate(), DataLabel.class)) ? ((DataLabel) C7019kk.m27452k4((Object) ((DataLabelFormat) chartPortionFormat.m716rv()).getParent_Immediate(), DataLabel.class)).getTextFrameForOverriding() : C7019kk.m27469x1(chartPortionFormat.m716rv(), C14609ty.class) ? ((C14609ty) chartPortionFormat.m716rv()).getTextFrameForOverriding() : null;
        }
        if (textFrameForOverriding == null || textFrameForOverriding.getParagraphs().getCount() <= 0) {
            return false;
        }
        IGenericEnumerator<IParagraph> it = textFrameForOverriding.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                if (m74774k4(it.next().getParagraphFormat().getDefaultPortionFormat())) {
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }

    /* JADX INFO: renamed from: to */
    public static C14911zr m74776to(ChartPortionFormat chartPortionFormat) {
        if (chartPortionFormat.m716rv() == null || !C7019kk.m27469x1(chartPortionFormat.m716rv(), ChartTitle.class)) {
            return (C14911zr) AbstractC0858ck.m4597k4(C14911zr.class, chartPortionFormat, new AbstractC4682du<ChartPortionFormat, C14911zr, C14911zr>() { // from class: com.aspose.slides.zr.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.ChartPortionFormatEffectiveData.CreateEmpty(Aspose.Slides.Charts.ChartPortionFormat,Aspose.Slides.ChartPortionFormatEffectiveData)";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
                /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                public C14911zr mo445k4(ChartPortionFormat chartPortionFormat2, C14911zr c14911zr) {
                    return C14911zr.m74777x1(chartPortionFormat2, c14911zr);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static C14911zr m74777x1(ChartPortionFormat chartPortionFormat, C14911zr c14911zr) {
        return new C14911zr(chartPortionFormat, c14911zr);
    }

    public C14911zr(ChartPortionFormat chartPortionFormat) {
        super(chartPortionFormat);
        this.f50713wp = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74780x1(ChartPortionFormat chartPortionFormat) {
        if (chartPortionFormat.m715ne()) {
            return;
        }
        m4831k4((BasePortionFormat) chartPortionFormat);
        if (!C7019kk.m27469x1(chartPortionFormat.m716rv(), ChartTitle.class) || C14064he.m66715kk(chartPortionFormat.getFontHeight())) {
            return;
        }
        this.f50713wp = true;
    }

    public C14911zr(ChartPortionFormat chartPortionFormat, C14911zr c14911zr) {
        super(chartPortionFormat);
        m4834k4((InterfaceC14672vc) c14911zr);
        this.f50713wp = c14911zr.f50713wp;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x004c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C14911zr m74773k4(IChartComponent iChartComponent) {
        C0859cl c0859clM63808m9;
        Chart chart = (Chart) iChartComponent.getChart();
        boolean zM63805kk = ((Chart) iChartComponent.getChart()).m513ks().m63805kk();
        C14911zr c14911zrM717x6 = null;
        ChartPortionFormat chartPortionFormat = iChartComponent.getChart().getTextFormat() != null ? (ChartPortionFormat) ((Chart) iChartComponent.getChart()).getTextFormat().getPortionFormat() : null;
        if (zM63805kk) {
            switch (ChartTypeCharacterizer.m762k4(iChartComponent.getChart().getChartData().getSeries().get_Item(0).getType())) {
                case 1:
                    c0859clM63808m9 = chart.m513ks().m63808m9();
                    c14911zrM717x6 = ((ChartPortionFormat) c0859clM63808m9.m4617kk().getPortionFormat()).m717x6();
                    break;
                case 2:
                case 7:
                case 8:
                    if (iChartComponent != iChartComponent.getChart().getAxes().getHorizontalAxis() && iChartComponent != iChartComponent.getChart().getAxes().getSecondaryHorizontalAxis()) {
                        c0859clM63808m9 = chart.m513ks().m63793dq();
                    }
                    c14911zrM717x6 = ((ChartPortionFormat) c0859clM63808m9.m4617kk().getPortionFormat()).m717x6();
                    break;
                case 4:
                    if (iChartComponent == iChartComponent.getChart().getAxes().getHorizontalAxis() || iChartComponent == iChartComponent.getChart().getAxes().getSecondaryHorizontalAxis()) {
                    }
                    c14911zrM717x6 = ((ChartPortionFormat) c0859clM63808m9.m4617kk().getPortionFormat()).m717x6();
                    break;
            }
            if (c14911zrM717x6 != null) {
                if (chartPortionFormat != null) {
                    c14911zrM717x6.m74780x1(chartPortionFormat);
                }
                return c14911zrM717x6;
            }
        }
        if (chartPortionFormat != null) {
            return chartPortionFormat.m717x6();
        }
        throw new ArgumentException("Chart Portion Format cannot be null.");
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo6273k4(IBaseSlide iBaseSlide) {
        IFontData latinFont;
        IFontsEffectiveData major;
        if (iBaseSlide != null) {
            InterfaceC14397rj interfaceC14397rj = (InterfaceC14397rj) m4601W_();
            this.f50711kp = interfaceC14397rj;
            Chart[] chartArr = {this.f50712ss};
            kke.m63959k4(Chart.class, interfaceC14397rj, chartArr);
            Chart chart = chartArr[0];
            this.f50712ss = chart;
            IFontSchemeEffectiveData fontScheme = chart.createThemeEffective().getFontScheme();
            if (this.f4476ts) {
                major = fontScheme.getMinor();
            } else {
                IFontSchemeEffectiveData fontScheme2 = iBaseSlide.createThemeEffective().getFontScheme();
                FontData fontData = this.f4482wl;
                String fontName = fontData.getFontName();
                if (fontName.charAt(0) == '+') {
                    latinFont = C14113y2.m67448x1(fontName, "+mn") ? fontScheme2.getMinor().getLatinFont() : fontData;
                    if (C14113y2.m67448x1(fontName, "+mj")) {
                        major = fontScheme2.getMajor();
                    }
                } else {
                    latinFont = fontData;
                }
            }
            latinFont = major.getLatinFont();
        } else {
            latinFont = null;
        }
        m4832k4(iBaseSlide, latinFont);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, ChartPortionFormat chartPortionFormat) {
        ITextFrame textFrameForOverriding;
        m4834k4(interfaceC14672vc);
        this.f50713wp = ((C14911zr) interfaceC14672vc).f50713wp;
        m74780x1(chartPortionFormat);
        if (chartPortionFormat.m716rv() == null) {
            return;
        }
        float fontHeight = Float.NaN;
        IFontData latinFont = null;
        if (C7019kk.m27469x1(chartPortionFormat.m716rv(), ChartTitle.class)) {
            if (((Chart) C7019kk.m27452k4((Object) ((ChartTitle) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), ChartTitle.class)).getChart(), Chart.class)).m513ks().m63805kk()) {
                this.f50713wp = true;
            }
            if (C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), InterfaceC14397rj.class)).getParent_Immediate(), Chart.class)) {
                if (this.f4460e0) {
                    this.f4480uz = 18.0f;
                } else if (!this.f50713wp) {
                    float f = this.f4480uz * 1.2f;
                    if (!C14067j2.m66728k4(Float.valueOf(f), Float.valueOf(Float.NaN))) {
                        this.f4480uz = f;
                    }
                    this.f50713wp = true;
                    this.f4460e0 = false;
                }
            }
            if (ChartTypeCharacterizer.m767to(((ChartTitle) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), ChartTitle.class)).getChart().getChartData().getSeries().get_Item(0).getType())) {
                this.f4453bz = false;
            }
            if (this.f4453bz) {
                this.f4465jd = (byte) 1;
            }
            textFrameForOverriding = ((ChartTitle) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), ChartTitle.class)).getTextFrameForOverriding();
        } else {
            textFrameForOverriding = C7019kk.m27469x1(chartPortionFormat.m716rv(), Trendline.class) ? ((Trendline) C7019kk.m27452k4((Object) chartPortionFormat.m716rv(), Trendline.class)).getTextFrameForOverriding() : (C7019kk.m27469x1(chartPortionFormat.m716rv(), DataLabelFormat.class) && C7019kk.m27469x1(((DataLabelFormat) chartPortionFormat.m716rv()).getParent_Immediate(), DataLabel.class)) ? ((DataLabel) C7019kk.m27452k4((Object) ((DataLabelFormat) chartPortionFormat.m716rv()).getParent_Immediate(), DataLabel.class)).getTextFrameForOverriding() : C7019kk.m27469x1(chartPortionFormat.m716rv(), C14609ty.class) ? ((C14609ty) chartPortionFormat.m716rv()).getTextFrameForOverriding() : null;
        }
        if (textFrameForOverriding == null || textFrameForOverriding.getParagraphs().getCount() == 0) {
            return;
        }
        IGenericEnumerator<IParagraph> it = textFrameForOverriding.getParagraphs().iterator();
        byte fontBold = -1;
        byte fontItalic = -1;
        IFillFormat fillFormat = null;
        while (it.hasNext()) {
            try {
                IPortionFormat defaultPortionFormat = it.next().getParagraphFormat().getDefaultPortionFormat();
                if (C14064he.m66715kk(fontHeight)) {
                    fontHeight = defaultPortionFormat.getFontHeight();
                }
                if (latinFont == null) {
                    latinFont = defaultPortionFormat.getLatinFont();
                }
                if (fontBold == -1) {
                    fontBold = defaultPortionFormat.getFontBold();
                }
                if (fillFormat == null) {
                    fillFormat = defaultPortionFormat.getFillFormat();
                }
                if (fontItalic == -1) {
                    fontItalic = defaultPortionFormat.getFontItalic();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (!C14064he.m66715kk(fontHeight)) {
            this.f4480uz = fontHeight;
            this.f4460e0 = false;
        }
        if (latinFont != null) {
            this.f4482wl = (FontData) latinFont;
            this.f4476ts = false;
        }
        if (fontBold != -1) {
            this.f4465jd = fontBold;
            this.f4453bz = false;
        }
        if (fontItalic != -1) {
            this.f4456ck = fontItalic;
        }
        if (fillFormat == null || fillFormat.getFillType() == -1) {
            return;
        }
        ((AbstractC0872cw) this).f4475to.m67932k4((FillFormat) fillFormat);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m74774k4(IPortionFormat iPortionFormat) {
        if (iPortionFormat != null) {
            return (C14064he.m66715kk(iPortionFormat.getFontHeight()) && iPortionFormat.getLatinFont() == null && iPortionFormat.getFontBold() == -1 && iPortionFormat.getFillFormat().getFillType() == -1 && iPortionFormat.getFontItalic() == -1) ? false : true;
        }
        throw new ArgumentNullException("portionFormat");
    }

    @Override // com.aspose.slides.AbstractC0872cw, com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(C14911zr c14911zr) {
        if (C14067j2.m66729x1(this, c14911zr)) {
            return true;
        }
        return super.mo4836k4(c14911zr);
    }
}
