package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
public final class PortionFormat extends BasePortionFormat implements IPortionFormat {

    /* JADX INFO: renamed from: k4 */
    static final AbstractC4682du<PortionFormat, lrb, lrb> f3055k4 = new AbstractC4682du<PortionFormat, lrb, lrb>() { // from class: com.aspose.slides.PortionFormat.1
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.PortionFormatEffectiveData.CreateEmpty(Aspose.Slides.PortionFormat,Aspose.Slides.PortionFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public lrb mo445k4(PortionFormat portionFormat, lrb lrbVar) {
            return lrb.m64517k4(portionFormat, lrbVar);
        }
    };

    /* JADX INFO: renamed from: kk */
    private lrb f3056kk;

    /* JADX INFO: renamed from: x1 */
    private final cgl f3057x1;

    public PortionFormat() {
        this(null);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m2303to(PortionFormat portionFormat) {
        if (portionFormat == null) {
            return true;
        }
        return BasePortionFormat.m353kk(portionFormat) && portionFormat.getBookmarkId() == null && portionFormat.getHyperlinkClick() == null && portionFormat.getHyperlinkMouseOver() == null;
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new gfe(this);
    }

    /* JADX INFO: renamed from: ar */
    public final PortionFormat m2304ar() {
        PortionFormat portionFormat = new PortionFormat();
        portionFormat.m361k4((BasePortionFormat) this);
        return portionFormat;
    }

    /* JADX INFO: renamed from: bv */
    public final lrb m2305bv() {
        lrb[] lrbVarArr = {this.f3056kk};
        lrb lrbVar = (lrb) AbstractC0858ck.m4598k4(lrb.class, lrbVarArr, this, f3055k4);
        lrb lrbVar2 = lrbVarArr[0];
        this.f3056kk = lrbVar2;
        if (lrbVar2 != null) {
            lrbVar2.m4604k4(lrb.class);
        }
        return lrbVar;
    }

    @Override // com.aspose.slides.IPortionFormat
    public final String getBookmarkId() {
        return (String) m2139k4((vha) t8l.f49076wl);
    }

    @Override // com.aspose.slides.IPortionFormat
    public final IPortionFormatEffectiveData getEffective() {
        return m2305bv();
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final IHyperlink getHyperlinkClick() {
        if (m2138ix()) {
            return mo368x1().m6589e0();
        }
        return null;
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final IHyperlinkManager getHyperlinkManager() {
        m2145uz();
        return mo368x1().m6597qm();
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final IHyperlink getHyperlinkMouseOver() {
        if (m2138ix()) {
            return mo368x1().m6588bz();
        }
        return null;
    }

    @Override // com.aspose.slides.IPortionFormat
    public final boolean getSmartTagClean() {
        return ((Boolean) m2139k4((vha) t8l.f49070qq)).booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2306k4(float f) {
        setFontHeight(getFontHeight() * f);
        setSpacing(getSpacing() * f);
    }

    @Override // com.aspose.slides.BasePortionFormat
    /* JADX INFO: renamed from: ks, reason: merged with bridge method [inline-methods] */
    public final gfe mo368x1() {
        return (gfe) m2144u4();
    }

    /* JADX INFO: renamed from: lr */
    public final boolean m2310lr() {
        if (m2138ix()) {
            return ((gfe) m2144u4()).m6598ss();
        }
        return true;
    }

    /* JADX INFO: renamed from: ne */
    public final cgl m2311ne() {
        m2146wl();
        return this.f3057x1;
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m2312rv() {
        if (m2138ix()) {
            return mo368x1().m6601wp();
        }
        return false;
    }

    @Override // com.aspose.slides.IPortionFormat
    public final void setBookmarkId(String str) {
        m2142k4((vha<String, TRealObject>) t8l.f49076wl, str);
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final void setHyperlinkClick(IHyperlink iHyperlink) {
        m2141k4((IHyperlink) null, iHyperlink);
        if (m2138ix()) {
            mo368x1().m6592k4(iHyperlink);
            if (iHyperlink != null) {
                ((Hyperlink) mo368x1().m6589e0()).m1694k4((IHyperlinkContainer) this);
            }
        }
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final void setHyperlinkMouseOver(IHyperlink iHyperlink) {
        m2141k4((IHyperlink) null, iHyperlink);
        if (m2138ix()) {
            mo368x1().m6604x1(iHyperlink);
            if (iHyperlink != null) {
                ((Hyperlink) mo368x1().m6588bz()).m1694k4((IHyperlinkContainer) this);
            }
        }
    }

    @Override // com.aspose.slides.IPortionFormat
    public final void setSmartTagClean(boolean z) {
        m2142k4((vha<Boolean, TRealObject>) t8l.f49070qq, Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: um */
    public final void m2313um() {
        if (m2138ix()) {
            m2140k4((Object) null);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m2314v4() {
        this.f3056kk = null;
    }

    /* JADX INFO: renamed from: x6 */
    public final ParagraphFormat m2317x6() {
        return (ParagraphFormat) C7019kk.m27452k4((Object) getParent_Immediate(), ParagraphFormat.class);
    }

    public PortionFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        m2146wl();
        this.f3057x1 = new cgl(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2307k4(Portion portion) {
        m2147x1(portion);
        m2143qq();
        m2314v4();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2315x1(lrb lrbVar) {
        m2145uz();
        mo368x1().m74491x1(lrbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2308k4(lrb lrbVar) {
        m2145uz();
        mo368x1().mo6594k4(lrbVar);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2316x1(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        mo368x1().m6596kk(z);
    }
}
