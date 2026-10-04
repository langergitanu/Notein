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
class qhd implements wdc {

    /* JADX INFO: renamed from: c5 */
    private XamlOptions f48316c5;

    /* JADX INFO: renamed from: du */
    private float f48317du;

    /* JADX INFO: renamed from: dy */
    private String f48318dy;

    /* JADX INFO: renamed from: h4 */
    private float f48319h4;

    /* JADX INFO: renamed from: k4 */
    private int f48320k4;

    /* JADX INFO: renamed from: kk */
    private boolean f48321kk;

    /* JADX INFO: renamed from: m9 */
    private float f48322m9;

    /* JADX INFO: renamed from: to */
    private float f48323to;

    /* JADX INFO: renamed from: x1 */
    private List<adx> f48324x1;

    public qhd(IParagraph iParagraph, XamlOptions xamlOptions) {
        if (iParagraph == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfTextBoxObject", "paragraph"));
        }
        if (xamlOptions == null) {
            throw new yii(C14113y2.m67402k4("In the '{0}' class was put a parameter '{1}' equal 'null'.", "WpfTextBoxObject", "options"));
        }
        m69593k4(0.0f);
        m69604x1(0.0f);
        this.f48318dy = "&#x2022; ";
        m69595k4(new List<>());
        this.f48316c5 = xamlOptions;
        m69596k4(iParagraph);
    }

    /* JADX INFO: renamed from: c5 */
    private String m69585c5() {
        return C14113y2.m67402k4(" Margin=\"{0}, {1}\"", C14064he.m66711k4(m69610to(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m69605du(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: ck */
    private String m69586ck() {
        return C14113y2.m67402k4(" HorizontalAlignment=\"{0}\" VerticalAlignment=\"Top\"", m69601x1(m69607k4()));
    }

    /* JADX INFO: renamed from: dy */
    private String m69588dy() {
        if (m69611x1().size() < 1) {
            return C14113y2.f47374k4;
        }
        String strM67402k4 = C14113y2.m67402k4("<TextBlock TextWrapping=\"Wrap\"{0}{1}{2}>", m69585c5(), m69589jd(), m69586ck());
        if (m69608kk()) {
            strM67402k4 = C14113y2.m67400k4(strM67402k4, C14113y2.m67402k4("<Run Text=\"{0}\"{1}{2}{3}/>", this.f48318dy, m69603x1(m69611x1().get_Item(0).m3515to().m73434k4()), m69587du(m69611x1().get_Item(0).m3515to().m73441x1()), m69590k4(m69611x1().get_Item(0).m3516x1().Clone(), "Foreground")));
        }
        List.Enumerator<adx> it = m69611x1().iterator();
        while (it.hasNext()) {
            try {
                adx next = it.next();
                String strM69603x1 = m69603x1(next.m3515to().m73434k4());
                String strM69587du = m69587du(next.m3515to().m73441x1());
                String strM69590k4 = m69590k4(next.m3516x1().Clone(), "Foreground");
                String strM69591k4 = m69591k4(next.m3515to());
                String strM69602x1 = m69602x1(next.m3515to());
                String strM69598kk = m69598kk(next.m3515to());
                String strM69590k42 = m69590k4(next.m3514kk().Clone(), "Background");
                strM67402k4 = C14113y2.m67400k4(strM67402k4, next.m3508du() != null ? C14113y2.m67402k4("<Hyperlink NavigateUri=\"{0}\"><Run Text=\"{1}\"{2}{3}{4}{5}{6}{7}{8}/></Hyperlink>", next.m3508du().getExternalUrl(), next.m3509k4(), strM69603x1, strM69587du, strM69590k4, strM69591k4, strM69602x1, strM69598kk, strM69590k42) : C14113y2.m67402k4("<Run Text=\"{0}\"{1}{2}{3}{4}{5}{6}{7}/>", next.m3509k4(), strM69603x1, strM69587du, strM69590k4, strM69591k4, strM69602x1, strM69598kk, strM69590k42));
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
        return C14113y2.m67400k4(strM67402k4, "</TextBlock>");
    }

    /* JADX INFO: renamed from: jd */
    private String m69589jd() {
        return C14113y2.m67402k4(" Width=\"{0}\" Height=\"{1}\"", C14064he.m66711k4(m69606h4(), (InterfaceC14073kp) C11697x1.m55250kk()), C14064he.m66711k4(m69609m9(), (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: kk */
    private String m69598kk(xij xijVar) {
        return (xijVar != null && xijVar.m73433du()) ? " TextDecorations=\"Underline\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: du */
    public final float m69605du() {
        return this.f48317du;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m69606h4() {
        return this.f48319h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m69607k4() {
        return this.f48320k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m69609m9() {
        return this.f48322m9;
    }

    /* JADX INFO: renamed from: to */
    public final float m69610to() {
        return this.f48323to;
    }

    public String toString() {
        return m69588dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final List<adx> m69611x1() {
        return this.f48324x1;
    }

    /* JADX INFO: renamed from: du */
    private String m69587du(float f) {
        return C14064he.m66715kk(f) ? C14113y2.f47374k4 : C14113y2.m67402k4(" FontSize=\"{0}\"", C14064he.m66711k4(f, (InterfaceC14073kp) C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    private String m69590k4(C12003du c12003du, String str) {
        return (c12003du == null || C12003du.m56403k4(c12003du, C12003du.f40505to)) ? C14113y2.f47374k4 : C14113y2.m67402k4(" {0}=\"#{1}{2}{3}{4}\"", str, C14098up.m67320k4(c12003du.m56501c5(), "X2"), C14098up.m67320k4(c12003du.m56507jd(), "X2"), C14098up.m67320k4(c12003du.m56502ck(), "X2"), C14098up.m67320k4(c12003du.m56505fa(), "X2"));
    }

    /* JADX INFO: renamed from: kk */
    private void m69599kk(float f) {
        this.f48319h4 = f;
    }

    /* JADX INFO: renamed from: to */
    private void m69600to(float f) {
        this.f48322m9 = f;
    }

    /* JADX INFO: renamed from: x1 */
    private String m69601x1(int i) {
        return i != 1 ? i != 2 ? "Left" : "Right" : "Center";
    }

    /* JADX INFO: renamed from: k4 */
    private String m69591k4(xij xijVar) {
        return (xijVar != null && xijVar.m73439kk()) ? " FontWeight=\"Bold\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: x1 */
    private String m69602x1(xij xijVar) {
        return (xijVar != null && xijVar.m73440to()) ? " FontStyle=\"Italic\"" : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m69608kk() {
        return this.f48321kk;
    }

    /* JADX INFO: renamed from: k4 */
    private String m69592k4(String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, "\"", "&quot;"), "<", "&lt;"), ">", "&gt;"), "&", "&amp;"), "'", "&apos;"), "\u000b", "");
    }

    /* JADX INFO: renamed from: x1 */
    private String m69603x1(String str) {
        return C14113y2.m67411k4(str) ? C14113y2.f47374k4 : C14113y2.m67402k4(" FontFamily=\"{0}\"", str);
    }

    /* JADX INFO: renamed from: k4 */
    private void m69593k4(float f) {
        this.f48323to = f;
    }

    /* JADX INFO: renamed from: x1 */
    private void m69604x1(float f) {
        this.f48317du = f;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69594k4(int i) {
        this.f48320k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69595k4(List<adx> list) {
        this.f48324x1 = list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69596k4(IParagraph iParagraph) {
        float fM70913k4;
        float fM70913k42;
        m69594k4(iParagraph.getParagraphFormat().getAlignment());
        if (iParagraph.getParagraphFormat().getBullet().getType() == 1) {
            m69597k4(true);
        }
        C12007ix c12007ixClone = ((Paragraph) iParagraph).m2170x1().Clone();
        if (c12007ixClone != null) {
            if (m69608kk()) {
                XamlOptions xamlOptions = this.f48316c5;
                fM70913k4 = sza.m70913k4(xamlOptions, xamlOptions.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56557jd()) - 40.0f;
            } else {
                XamlOptions xamlOptions2 = this.f48316c5;
                fM70913k4 = sza.m70913k4(xamlOptions2, xamlOptions2.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56557jd());
            }
            m69593k4(fM70913k4);
            m69593k4((float) C14116yg.m67477k4(m69610to(), 2));
            XamlOptions xamlOptions3 = this.f48316c5;
            m69604x1(sza.m70913k4(xamlOptions3, xamlOptions3.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56551ck()));
            m69604x1((float) C14116yg.m67477k4(m69605du(), 2));
            if (m69608kk()) {
                XamlOptions xamlOptions4 = this.f48316c5;
                fM70913k42 = sza.m70913k4(xamlOptions4, xamlOptions4.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56550c5()) + 1.0f + 40.0f;
            } else {
                XamlOptions xamlOptions5 = this.f48316c5;
                fM70913k42 = sza.m70913k4(xamlOptions5, xamlOptions5.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56550c5()) + 1.0f;
            }
            m69599kk(fM70913k42);
            m69599kk((float) C14116yg.m67477k4(m69606h4(), 2));
            XamlOptions xamlOptions6 = this.f48316c5;
            m69600to(sza.m70913k4(xamlOptions6, xamlOptions6.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), c12007ixClone.m56575x1()));
            m69600to((float) C14116yg.m67477k4(m69609m9(), 2));
        }
        IGenericEnumerator<IPortion> it = iParagraph.getPortions().iterator();
        while (it.hasNext()) {
            try {
                IPortion next = it.next();
                IPortionFormatEffectiveData effective = next.getPortionFormat().getEffective();
                String strM69592k4 = m69592k4(next.getText());
                C12003du c12003duClone = ((C14176nc) effective.getFillFormat()).m67938m9().Clone();
                C12003du c12003duClone2 = ((lrb) effective).m4830h4().Clone();
                XamlOptions xamlOptions7 = this.f48316c5;
                float fM67477k4 = (float) C14116yg.m67477k4(C7019kk.m27462to(Float.valueOf(sza.m70913k4(xamlOptions7, xamlOptions7.m3114x1().Clone(), ((SlideSize) iParagraph.getPresentation().getSlideSize()).m2755k4().Clone(), effective.getFontHeight())), 13), 2);
                String fontName = effective.getLatinFont() != null ? effective.getLatinFont().getFontName() : C14113y2.f47374k4;
                boolean z = (effective.getFontUnderline() == 0 || effective.getFontUnderline() == -1) ? false : true;
                if (effective.getHyperlinkClick() != null && effective.getHyperlinkClick().getColorSource() == 0) {
                    ((ColorFormat) iParagraph.getPresentation().getMasterTheme().getColorScheme().getHyperlink()).m1084to().CloneTo(c12003duClone);
                    z = true;
                }
                xij xijVar = new xij();
                xijVar.m73436k4(fontName);
                xijVar.m73437k4(effective.getFontBold());
                xijVar.m73435k4(fM67477k4);
                xijVar.m73442x1(effective.getFontItalic());
                xijVar.m73438kk(z);
                adx adxVar = new adx();
                adxVar.m3513k4(strM69592k4);
                adxVar.m3511k4(c12003duClone.Clone());
                adxVar.m3517x1(c12003duClone2.Clone());
                adxVar.m3512k4(xijVar);
                adxVar.m3510k4(effective.getHyperlinkClick());
                m69611x1().addItem(adxVar);
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
    }

    /* JADX INFO: renamed from: k4 */
    private void m69597k4(boolean z) {
        this.f48321kk = z;
    }
}
