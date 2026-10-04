package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class gfe extends AbstractC14882ze {

    /* JADX INFO: renamed from: c5 */
    private String f5235c5;

    /* JADX INFO: renamed from: ck */
    private Hyperlink f5236ck;

    /* JADX INFO: renamed from: fa */
    private boolean f5237fa;

    /* JADX INFO: renamed from: jd */
    private Hyperlink f5238jd;

    /* JADX INFO: renamed from: up */
    private final HyperlinkManager f5239up;

    /* JADX INFO: renamed from: yj */
    private final cgl f5240yj;

    public gfe(PortionFormat portionFormat) {
        super(portionFormat.getParent_Immediate(), portionFormat.m366to(), portionFormat.m356du(), portionFormat.m357dy(), portionFormat.m354c5(), portionFormat.m359h4(), portionFormat.m365m9(), portionFormat.m367up());
        this.f5240yj = portionFormat.m2311ne();
        this.f5235c5 = t8l.f49076wl.f49504k4;
        this.f5237fa = false;
        this.f5239up = new HyperlinkManager(portionFormat);
    }

    /* JADX INFO: renamed from: bz */
    public final IHyperlink m6588bz() {
        return this.f5236ck;
    }

    /* JADX INFO: renamed from: e0 */
    public final IHyperlink m6589e0() {
        return this.f5238jd;
    }

    @Override // com.aspose.slides.AbstractC14882ze
    public boolean equals(Object obj) {
        if (C7019kk.m27469x1(obj, IBasePortionFormat.class) && !AbstractC14882ze.m74430k4(this, (IBasePortionFormat) obj)) {
            return false;
        }
        if (!C7019kk.m27469x1(obj, IPortionFormat.class)) {
            return true;
        }
        IPortionFormat iPortionFormat = (IPortionFormat) obj;
        return iPortionFormat != null && C14113y2.m67363du(m6600ts(), iPortionFormat.getBookmarkId()) && C3085sv.m13090k4(m6589e0(), iPortionFormat.getHyperlinkClick()) && C3085sv.m13090k4(m6588bz(), iPortionFormat.getHyperlinkMouseOver());
    }

    /* JADX INFO: renamed from: g8 */
    public final boolean m6590g8() {
        return m74466kk(19);
    }

    @Override // com.aspose.slides.AbstractC14882ze
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.aspose.slides.AbstractC14882ze
    /* JADX INFO: renamed from: k4 */
    public void mo6591k4(BasePortionFormat basePortionFormat) {
        super.mo6591k4(basePortionFormat);
        if (C7019kk.m27469x1(basePortionFormat, PortionFormat.class)) {
            PortionFormat portionFormat = (PortionFormat) C7019kk.m27452k4((Object) basePortionFormat, PortionFormat.class);
            m6592k4(portionFormat.getHyperlinkClick());
            m6604x1(portionFormat.getHyperlinkMouseOver());
            m6595kk(portionFormat.getBookmarkId());
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m6595kk(String str) {
        this.f5235c5 = str;
        m74439dq();
    }

    /* JADX INFO: renamed from: qm */
    public final IHyperlinkManager m6597qm() {
        return this.f5239up;
    }

    /* JADX INFO: renamed from: ss */
    public final boolean m6598ss() {
        return m74483v4() == 524288 && (this.f50540dy.m5689k4() & 4294967295L) == 4294967295L && m74451k4().isFormatNotDefined() && ((FillFormat) m74486x1()).m1452c5() && EffectFormat.m1383k4((EffectFormat) m74461kk()) && ((ColorFormat) m74475to()).m1072fa() && m74441du().isFormatNotDefined() && ((FillFormat) m74446h4()).m1452c5() && C3085sv.m13089k4(m74493x6(), Float.NaN) && C3085sv.m13090k4(m74471ne(), (Object) null) && C3085sv.m13090k4(m74448ix(), (Object) null) && C3085sv.m13090k4(m74479u4(), (Object) null) && C3085sv.m13090k4(m74482uz(), (Object) null) && C3085sv.m13089k4(m74484wl(), Float.NaN) && C3085sv.m13089k4(m74472qq(), Float.NaN) && m74432ar() == null && m74480um() == null && C3085sv.m13089k4(m74434bv(), Float.NaN) && m6600ts() == null && C3085sv.m13090k4(m6589e0(), (Object) null) && C3085sv.m13090k4(m6588bz(), (Object) null);
    }

    /* JADX INFO: renamed from: sv */
    public final cgl m6599sv() {
        return this.f5240yj;
    }

    /* JADX INFO: renamed from: ts */
    public final String m6600ts() {
        return this.f5235c5;
    }

    /* JADX INFO: renamed from: wp */
    public final boolean m6601wp() {
        return this.f5237fa;
    }

    @Override // com.aspose.slides.AbstractC14882ze
    /* JADX INFO: renamed from: wy */
    public void mo6602wy() {
        super.mo6602wy();
        m6592k4((IHyperlink) null);
        m6604x1((IHyperlink) null);
        m6595kk((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.AbstractC14882ze
    /* JADX INFO: renamed from: x1 */
    public void mo6603x1(BasePortionFormat basePortionFormat) {
        super.mo6603x1(basePortionFormat);
        IPortionFormat iPortionFormat = (IPortionFormat) basePortionFormat;
        if (iPortionFormat.getBookmarkId() != null) {
            this.f5235c5 = iPortionFormat.getBookmarkId();
        }
        if (iPortionFormat.getHyperlinkClick() != null) {
            this.f5238jd = (Hyperlink) iPortionFormat.getHyperlinkClick();
        }
        if (iPortionFormat.getHyperlinkMouseOver() != null) {
            this.f5236ck = (Hyperlink) iPortionFormat.getHyperlinkMouseOver();
        }
        m6606x1(iPortionFormat.getSmartTagClean());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6592k4(IHyperlink iHyperlink) {
        Hyperlink hyperlink = (Hyperlink) iHyperlink;
        this.f5238jd = hyperlink;
        if (iHyperlink != null) {
            hyperlink.m1694k4(this.f5239up.m1704k4());
        }
        m74439dq();
    }

    /* JADX INFO: renamed from: kk */
    public final void m6596kk(boolean z) {
        this.f5237fa = z;
        m74439dq();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6604x1(IHyperlink iHyperlink) {
        Hyperlink hyperlink = (Hyperlink) iHyperlink;
        this.f5236ck = hyperlink;
        if (iHyperlink != null) {
            hyperlink.m1694k4(this.f5239up.m1704k4());
        }
        m74439dq();
    }

    @Override // com.aspose.slides.AbstractC14882ze
    /* JADX INFO: renamed from: k4 */
    public void mo6593k4(PortionFormat portionFormat) {
        super.mo6593k4(portionFormat);
        if (m6589e0() != null) {
            portionFormat.setHyperlinkClick(m6589e0());
        }
        if (m6588bz() != null) {
            portionFormat.setHyperlinkMouseOver(m6588bz());
        }
        if (m6600ts() != null) {
            portionFormat.setBookmarkId(m6600ts());
        }
        portionFormat.setSmartTagClean(m6590g8());
    }

    @Override // com.aspose.slides.AbstractC14882ze
    /* JADX INFO: renamed from: x1 */
    public void mo6605x1(PortionFormat portionFormat) {
        super.mo6605x1(portionFormat);
        m6606x1(portionFormat.getSmartTagClean());
        if (m6589e0() == null) {
            m6592k4(portionFormat.getHyperlinkClick());
        }
        if (m6588bz() == null) {
            m6604x1(portionFormat.getHyperlinkMouseOver());
        }
        if (m6600ts() == null) {
            m6595kk(portionFormat.getBookmarkId());
        }
        if (m74471ne() == null) {
            m74457k4(portionFormat.getLatinFont());
        }
        if (m74448ix() == null) {
            m74490x1(portionFormat.getEastAsianFont());
        }
        if (m74479u4() == null) {
            m74465kk(portionFormat.getComplexScriptFont());
        }
    }

    @Override // com.aspose.slides.AbstractC14882ze
    /* JADX INFO: renamed from: k4 */
    public void mo6594k4(lrb lrbVar) {
        super.mo6594k4(lrbVar);
        m6595kk(lrbVar.getBookmarkId());
        m6592k4(lrbVar.getHyperlinkClick());
        m6604x1(lrbVar.getHyperlinkMouseOver());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6606x1(boolean z) {
        if (m74466kk(19) != z) {
            m74456k4(19, z);
            m74439dq();
        }
    }
}
