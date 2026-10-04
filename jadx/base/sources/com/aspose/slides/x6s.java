package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x6s implements wdc {

    /* JADX INFO: renamed from: c5 */
    private XamlOptions f49993c5;

    /* JADX INFO: renamed from: du */
    private float f49994du;

    /* JADX INFO: renamed from: dy */
    private String f49995dy;

    /* JADX INFO: renamed from: h4 */
    private float f49996h4;

    /* JADX INFO: renamed from: k4 */
    private int f49997k4;

    /* JADX INFO: renamed from: kk */
    private boolean f49998kk;

    /* JADX INFO: renamed from: m9 */
    private float f49999m9;

    /* JADX INFO: renamed from: to */
    private float f50000to;

    /* JADX INFO: renamed from: x1 */
    private List<adx> f50001x1;

    public x6s(IParagraph iParagraph, XamlOptions xamlOptions) {
        if (iParagraph == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinLabelObject", "paragraph"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "XamarinLabelObject", "options"));
        }
        m73159k4(0.0f);
        m73169x1(0.0f);
        this.f49995dy = "&#x2022; ";
        m73161k4(new List<>());
        this.f49993c5 = xamlOptions;
        m73162k4(iParagraph);
    }

    /* JADX INFO: renamed from: c5 */
    private String m73151c5() {
        return C14113y2.m67402k4(" AbsoluteLayout.LayoutBounds=\"{0}, {1}, {2}, {3}\"", C14064he.m66711k4(m73175to(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m73170du(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m73171h4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m73174m9(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: dy */
    private String m73153dy() {
        String strM67402k4;
        if (m73176x1().size() < 1) {
            return C14113y2.f47374k4;
        }
        String strM67402k42 = C14113y2.m67402k4("<Label LineBreakMode=\"WordWrap\"{0}{1}>\n    <Label.FormattedText>\n        <FormattedString>", m73151c5(), m73154jd());
        if (m73173kk()) {
            strM67402k42 = C14113y2.m67400k4(strM67402k42, C14113y2.m67402k4("<Span Text=\"{0}\"{1}{2}{3}/>", this.f49995dy, m73168x1(m73176x1().get_Item(0).m3515to().m73434k4()), m73152du(m73176x1().get_Item(0).m3515to().m73441x1()), m73156k4(m73176x1().get_Item(0).m3516x1().Clone(), "TextColor")));
        }
        List.Enumerator<adx> it = m73176x1().iterator();
        while (it.hasNext()) {
            try {
                adx next = it.next();
                String strM73156k4 = m73156k4(next.m3516x1().Clone(), "TextColor");
                String strM73168x1 = m73168x1(next.m3515to().m73434k4());
                String strM73152du = m73152du(next.m3515to().m73441x1());
                String strM73157k4 = m73157k4(next.m3515to());
                String strM73167x1 = m73167x1(next.m3515to());
                String strM73156k42 = m73156k4(next.m3514kk().Clone(), "BackgroundColor");
                if (next.m3508du() != null) {
                    strM67402k4 = C14113y2.m67402k4("<Span Text=\"{0}\"{1}{2}{3}{4}{5}{6}>{7}</Span>", next.m3509k4(), strM73168x1, strM73152du, strM73156k4, strM73157k4, strM73167x1, strM73156k42, m73155k4(next.m3508du()));
                } else {
                    strM67402k4 = C14113y2.m67402k4("<Span Text=\"{0}\"{1}{2}{3}{4}{5}{6}/>", next.m3509k4(), strM73168x1, strM73152du, strM73156k4, strM73157k4, strM73167x1, strM73156k42);
                }
                strM67402k42 = C14113y2.m67400k4(strM67402k42, strM67402k4);
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
        return C14113y2.m67400k4(strM67402k42, "      </FormattedString>\n    </Label.FormattedText>\n</Label>");
    }

    /* JADX INFO: renamed from: jd */
    private String m73154jd() {
        return C14113y2.m67402k4(" HorizontalTextAlignment=\"{0}\"", m73166x1(m73172k4()));
    }

    /* JADX INFO: renamed from: kk */
    private void m73164kk(float f) {
        this.f49996h4 = f;
    }

    /* JADX INFO: renamed from: du */
    public final float m73170du() {
        return this.f49994du;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m73171h4() {
        return this.f49996h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m73172k4() {
        return this.f49997k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m73174m9() {
        return this.f49999m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m73175to() {
        return this.f50000to;
    }

    public String toString() {
        return m73153dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<adx> m73176x1() {
        return this.f50001x1;
    }

    /* JADX INFO: renamed from: du */
    private String m73152du(float f) {
        return C14064he.m66715kk(f) ? C14113y2.f47374k4 : C14113y2.m67402k4(" FontSize=\"{0}\"", C14064he.m66711k4(f, (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private String m73155k4(IHyperlink iHyperlink) {
        return C14113y2.m67402k4("<Span.GestureRecognizers>\n                    <TapGestureRecognizer Command=\"{0}\" CommandParameter=\"{1}\"/>\n                </Span.GestureRecognizers>", "{Binding ClickCommand}", iHyperlink.getExternalUrl());
    }

    /* JADX INFO: renamed from: to */
    private void m73165to(float f) {
        this.f49999m9 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private String m73166x1(int i) {
        return i != 1 ? i != 2 ? "Start" : "End" : "Center";
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m73173kk() {
        return this.f49998kk;
    }

    /* JADX INFO: renamed from: k4 */
    private String m73156k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: x1 */
    private String m73167x1(xij xijVar) {
        return (xijVar != null && xijVar.m73433du()) ? " TextDecorations=\"Underline\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    private String m73157k4(xij xijVar) {
        if (xijVar == null) {
            return C14113y2.f47374k4;
        }
        return (xijVar.m73439kk() || xijVar.m73440to()) ? C14113y2.m67402k4(" FontAttributes=\"{0}{1}{2}\"", xijVar.m73439kk() ? "Bold" : C14113y2.f47374k4, (xijVar.m73439kk() && xijVar.m73440to()) ? ", " : C14113y2.f47374k4, xijVar.m73440to() ? "Italic" : C14113y2.f47374k4) : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: x1 */
    private String m73168x1(String str) {
        return C14113y2.m67411k4(str) ? C14113y2.f47374k4 : C14113y2.m67402k4(" FontFamily=\"{0}\"", str);
    }

    /* JADX INFO: renamed from: k4 */
    private String m73158k4(String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, "\"", "&quot;"), "<", "&lt;"), ">", "&gt;"), "&", "&amp;"), "'", "&apos;"), "\u000b", "");
    }

    /* JADX INFO: renamed from: x1 */
    private void m73169x1(float f) {
        this.f49994du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73159k4(float f) {
        this.f50000to = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73160k4(int i) {
        this.f49997k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73161k4(List<adx> list) {
        this.f50001x1 = list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73162k4(IParagraph iParagraph) {
        m73160k4(iParagraph.getParagraphFormat().getAlignment());
        C12007ix c12007ixClone = ((Paragraph) iParagraph).m2170x1().Clone();
        if (c12007ixClone != null) {
            XamlOptions xamlOptions = this.f49993c5;
            m73159k4(sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56557jd()));
            m73159k4((float) C14116yg.m67477k4(m73175to(), 2));
            XamlOptions xamlOptions2 = this.f49993c5;
            m73169x1(sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56551ck()));
            m73169x1((float) C14116yg.m67477k4(m73170du(), 2));
            XamlOptions xamlOptions3 = this.f49993c5;
            m73164kk(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56550c5()));
            m73164kk((float) C14116yg.m67477k4(m73171h4(), 2));
            XamlOptions xamlOptions4 = this.f49993c5;
            m73165to(sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56575x1()));
            m73165to((float) C14116yg.m67477k4(m73174m9(), 2));
        }
        IGenericEnumerator<IPortion> it = iParagraph.getPortions().iterator();
        while (true) {
            try {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                IPortion next = it.next();
                IPortionFormatEffectiveData effective = next.getPortionFormat().getEffective();
                String strM73158k4 = m73158k4(next.getText());
                C12003du c12003duClone = ((C14176nc) effective.getFillFormat()).m67938m9().Clone();
                C12003du c12003duClone2 = ((lrb) effective).m4830h4().Clone();
                XamlOptions xamlOptions5 = this.f49993c5;
                float fM27462to = C7019kk.m27462to(Float.valueOf(sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), effective.getFontHeight())), 13);
                String fontName = effective.getLatinFont() != null ? effective.getLatinFont().getFontName() : C14113y2.f47374k4;
                boolean z2 = (effective.getFontUnderline() == 0 || effective.getFontUnderline() == -1) ? false : true;
                if (effective.getHyperlinkClick() == null || effective.getHyperlinkClick().getColorSource() != 0) {
                    z = z2;
                } else {
                    ((ColorFormat) iParagraph.getPresentation().getMasterTheme().getColorScheme().getHyperlink()).m1084to().CloneTo(c12003duClone);
                }
                xij xijVar = new xij();
                xijVar.m73436k4(fontName);
                xijVar.m73437k4(effective.getFontBold());
                xijVar.m73435k4(fM27462to);
                xijVar.m73442x1(effective.getFontItalic());
                xijVar.m73438kk(z);
                adx adxVar = new adx();
                adxVar.m3513k4(strM73158k4);
                adxVar.m3511k4(c12003duClone.Clone());
                adxVar.m3517x1(c12003duClone2.Clone());
                adxVar.m3512k4(xijVar);
                adxVar.m3510k4(effective.getHyperlinkClick());
                m73176x1().addItem(adxVar);
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
        if (iParagraph.getParagraphFormat().getBullet().getType() == 1) {
            m73163k4(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73163k4(boolean z) {
        this.f49998kk = z;
    }
}
