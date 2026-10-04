package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Hyperlink extends PVIObject implements IHyperlink, InterfaceC14397rj {

    /* JADX INFO: renamed from: k4 */
    static final String f2470k4 = null;

    /* JADX INFO: renamed from: du */
    private String f2471du;

    /* JADX INFO: renamed from: h4 */
    private boolean f2472h4;

    /* JADX INFO: renamed from: kk */
    private final C0867cr f2473kk;

    /* JADX INFO: renamed from: m9 */
    private String f2474m9;

    /* JADX INFO: renamed from: to */
    private int f2475to;

    /* JADX INFO: renamed from: x1 */
    private IHyperlinkContainer f2476x1;

    private Hyperlink(int i) {
        super(null);
        this.f2473kk = new C0867cr();
        m1687k4(false, null, i);
    }

    /* JADX INFO: renamed from: ck */
    private String m1684ck() {
        C14062gk c14062gk;
        String str;
        IHyperlinkContainer iHyperlinkContainer = this.f2476x1;
        if (iHyperlinkContainer == null) {
            return this.f2474m9;
        }
        String str2 = this.f2474m9;
        IParagraph[] iParagraphArr = {null};
        boolean zM63959k4 = kke.m63959k4(IParagraph.class, (InterfaceC14397rj) iHyperlinkContainer, iParagraphArr);
        boolean z = false;
        IParagraph iParagraph = iParagraphArr[0];
        if (zM63959k4) {
            IGenericEnumerator<IPortion> it = iParagraph.getPortions().iterator();
            c14062gk = null;
            str = "";
            while (it.hasNext()) {
                try {
                    IPortion next = it.next();
                    if (equals(next.getPortionFormat().getHyperlinkClick()) || equals(next.getPortionFormat().getHyperlinkMouseOver())) {
                        String strM67408k4 = C14113y2.m67408k4(str, ((Portion) next).m2283h4());
                        C14062gk[] c14062gkArr = {c14062gk};
                        boolean z2 = C14062gk.m66650k4(strM67408k4, 1, c14062gkArr) && !C14113y2.m67359c5(strM67408k4, " ") && C12380dy.m57977kk(strM67408k4, "^((https?|ftp|file)\\:\\/)|[a-z]\\:\\\\", 66);
                        c14062gk = c14062gkArr[0];
                        if (!z2) {
                            break;
                        }
                        str = strM67408k4;
                    } else if (!"".equals(str)) {
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        } else {
            c14062gk = null;
            str = "";
        }
        if (!"".equals(str)) {
            C14062gk[] c14062gkArr2 = {null};
            if (iParagraph.getPresentation().getSourceFormat() == 0 && (C14113y2.m67363du(this.f2473kk.m4797kk(), str) || (c14062gk != null && C14062gk.m66650k4(this.f2474m9, 1, c14062gkArr2) && C14113y2.m67363du(c14062gkArr2[0].m66697x1(), c14062gk.m66697x1()) && !C14113y2.m67363du(c14062gk.m66694u4(), c14062gk.m66697x1())))) {
                z = true;
            }
            if (!z) {
                return m1685du(str);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: fa */
    private int m1686fa() {
        if (C14113y2.m67411k4(this.f2471du)) {
            return 1;
        }
        String strM67368h4 = C14113y2.m67368h4(m1690du());
        if (!C14113y2.m67448x1(strM67368h4, "ppaction://")) {
            return -1;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://noaction")) {
            return 0;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkshowjump?jump=firstslide")) {
            return 2;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkshowjump?jump=previousslide")) {
            return 3;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkshowjump?jump=nextslide")) {
            return 4;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkshowjump?jump=lastslideviewed")) {
            return 7;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkshowjump?jump=lastslide")) {
            return 5;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkshowjump?jump=endshow")) {
            return 6;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinksldjump")) {
            return 8;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkfile")) {
            return 10;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://hlinkpres")) {
            return 11;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://media")) {
            return 12;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://macro?name=")) {
            return 13;
        }
        if (C14113y2.m67448x1(strM67368h4, "ppaction://program")) {
            return 14;
        }
        return C14113y2.m67448x1(strM67368h4, "ppaction://customshow") ? 9 : -1;
    }

    public static Hyperlink getEndShow() {
        return new Hyperlink(6);
    }

    public static Hyperlink getFirstSlide() {
        return new Hyperlink(2);
    }

    public static Hyperlink getLastSlide() {
        return new Hyperlink(5);
    }

    public static Hyperlink getLastVievedSlide() {
        return new Hyperlink(7);
    }

    public static Hyperlink getMedia() {
        return new Hyperlink(12);
    }

    public static Hyperlink getNextSlide() {
        return new Hyperlink(4);
    }

    public static Hyperlink getNoAction() {
        return new Hyperlink(0);
    }

    public static Hyperlink getPreviousSlide() {
        return new Hyperlink(3);
    }

    public static boolean op_Equality(Hyperlink hyperlink, Hyperlink hyperlink2) {
        if (C14067j2.m66729x1(hyperlink, hyperlink2)) {
            return true;
        }
        if (C14067j2.m66729x1(hyperlink, null)) {
            return false;
        }
        return hyperlink.equals((IHyperlink) hyperlink2);
    }

    public static boolean op_Inequality(Hyperlink hyperlink, Hyperlink hyperlink2) {
        if (C14067j2.m66729x1(hyperlink, hyperlink2)) {
            return false;
        }
        if (C14067j2.m66729x1(hyperlink, null)) {
            return true;
        }
        return !hyperlink.equals((IHyperlink) hyperlink2);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new C14747wq();
    }

    /* JADX INFO: renamed from: c5 */
    public final String m1689c5() {
        if (m2138ix()) {
            return m1701x1().m72862c5();
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final String m1690du() {
        if (!C14113y2.m67411k4(this.f2471du)) {
            return this.f2471du;
        }
        switch (this.f2475to) {
            case -1:
                return null;
            case 0:
                return "ppaction://noaction";
            case 1:
                return f2470k4;
            case 2:
                return "ppaction://hlinkshowjump?jump=firstslide";
            case 3:
                return "ppaction://hlinkshowjump?jump=previousslide";
            case 4:
                return "ppaction://hlinkshowjump?jump=nextslide";
            case 5:
                return "ppaction://hlinkshowjump?jump=lastslide";
            case 6:
                return "ppaction://hlinkshowjump?jump=endshow";
            case 7:
                return "ppaction://hlinkshowjump?jump=lastslideviewed";
            case 8:
                return "ppaction://hlinksldjump";
            case 9:
                return "ppaction://customshow";
            case 10:
                return "ppaction://hlinkfile";
            case 11:
                return "ppaction://hlinkpres";
            case 12:
                return "ppaction://media";
            case 13:
                return C14113y2.m67408k4("ppaction://macro?name=", this.f2474m9);
            case 14:
                return "ppaction://program";
            default:
                throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m1691dy() {
        if (m2138ix()) {
            return m1701x1().m72864dy();
        }
        return false;
    }

    @Override // com.aspose.slides.IHyperlink
    public final boolean equals(IHyperlink iHyperlink) {
        return iHyperlink != null && m1688k4((Hyperlink) iHyperlink);
    }

    @Override // com.aspose.slides.IHyperlink
    public final int getActionType() {
        return this.f2475to;
    }

    @Override // com.aspose.slides.IHyperlink
    public final int getColorSource() {
        if (m2138ix()) {
            return m1701x1().m72875m9();
        }
        return 0;
    }

    @Override // com.aspose.slides.IHyperlink
    public final String getExternalUrl() {
        if (this.f2472h4) {
            return m1684ck();
        }
        return null;
    }

    @Override // com.aspose.slides.IHyperlink
    public final String getExternalUrlOriginal() {
        if (this.f2472h4) {
            return this.f2474m9;
        }
        return null;
    }

    @Override // com.aspose.slides.IHyperlink
    public final boolean getHighlightClick() {
        if (m2138ix()) {
            return m1701x1().m72877to();
        }
        return false;
    }

    @Override // com.aspose.slides.IHyperlink
    public final boolean getHistory() {
        if (m2138ix()) {
            return m1701x1().m72874kk();
        }
        return true;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return (InterfaceC14397rj) this.f2476x1;
    }

    @Override // com.aspose.slides.IHyperlink
    public final IAudio getSound() {
        if (m2138ix()) {
            return m1701x1().m72865h4();
        }
        return null;
    }

    @Override // com.aspose.slides.IHyperlink
    public final boolean getStopSoundOnClick() {
        if (m2138ix()) {
            return m1701x1().m72863du();
        }
        return false;
    }

    @Override // com.aspose.slides.IHyperlink
    public final String getTargetFrame() {
        if (m2138ix()) {
            return m1701x1().m72867k4();
        }
        return null;
    }

    @Override // com.aspose.slides.IHyperlink
    public final ISlide getTargetSlide() {
        int actionType;
        IBaseSlide slide;
        ISlide iSlide;
        if (m1693jd() != null && (actionType = getActionType()) > 1 && actionType < 6) {
            IPortionFormat iPortionFormat = (IPortionFormat) C7019kk.m27452k4((Object) m1693jd(), IPortionFormat.class);
            IShape iShape = (IShape) C7019kk.m27452k4((Object) m1693jd(), IShape.class);
            if (iPortionFormat != null) {
                if (C7019kk.m27469x1(iPortionFormat, PortionFormat.class)) {
                    slide = ((PortionFormat) iPortionFormat).getSlide();
                    iSlide = (ISlide) C7019kk.m27452k4((Object) slide, ISlide.class);
                }
                iSlide = null;
            } else {
                if (iShape != null) {
                    slide = ((Shape) iShape).getSlide();
                    iSlide = (ISlide) C7019kk.m27452k4((Object) slide, ISlide.class);
                }
                iSlide = null;
            }
            if (iSlide != null) {
                if (actionType == 2) {
                    if (iSlide.getPresentation().getSlides().size() > 0) {
                        return iSlide.getPresentation().getSlides().get_Item(0);
                    }
                    return null;
                }
                if (actionType == 3) {
                    if (iSlide.getSlideNumber() > 1) {
                        return iSlide.getPresentation().getSlides().get_Item(iSlide.getSlideNumber() - 2);
                    }
                    return null;
                }
                if (actionType == 4) {
                    if (iSlide.getPresentation().getSlides().size() > iSlide.getSlideNumber()) {
                        return iSlide.getPresentation().getSlides().get_Item(iSlide.getSlideNumber());
                    }
                    return null;
                }
                if (actionType != 5) {
                    return iSlide;
                }
                if (iSlide.getPresentation().getSlides().size() > 0) {
                    return iSlide.getPresentation().getSlides().get_Item(iSlide.getPresentation().getSlides().size() - 1);
                }
                return null;
            }
        }
        return m1699to().m4793k4();
    }

    @Override // com.aspose.slides.IHyperlink
    public final String getTooltip() {
        if (m2138ix()) {
            return m1701x1().m72878x1();
        }
        return null;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m1701x1().m72866jd();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m1692h4() {
        return this.f2472h4;
    }

    @Override // com.aspose.slides.PVIObject
    public int hashCode() {
        return (m1689c5() != null ? m1689c5().hashCode() : 0) + (m1690du() != null ? m1690du().hashCode() : 0);
    }

    /* JADX INFO: renamed from: jd */
    public final IHyperlinkContainer m1693jd() {
        return this.f2476x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1694k4(IHyperlinkContainer iHyperlinkContainer) {
        this.f2476x1 = iHyperlinkContainer;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1697kk(String str) {
        if (this.f2472h4) {
            this.f2474m9 = str;
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final String m1698m9() {
        if (this.f2472h4) {
            return null;
        }
        return this.f2475to == 13 ? "" : this.f2474m9;
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setColorSource(int i) {
        m2141k4((Integer) 0, Integer.valueOf(i));
        if (m2138ix()) {
            m1701x1().m72868k4(i);
        }
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setHighlightClick(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1701x1().m72880x1(z);
        }
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setHistory(boolean z) {
        m2141k4(Boolean.TRUE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1701x1().m72871k4(z);
        }
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setSound(IAudio iAudio) {
        m2145uz();
        m1701x1().m72869k4(iAudio);
        if (iAudio != null) {
            m1701x1().m72873kk(false);
        }
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setStopSoundOnClick(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m1701x1().m72873kk(z);
            if (z) {
                m1701x1().m72869k4((IAudio) null);
            }
        }
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setTargetFrame(String str) {
        m2141k4((String) null, str);
        if (m2138ix()) {
            m1701x1().m72870k4(str);
        }
    }

    @Override // com.aspose.slides.IHyperlink
    public final void setTooltip(String str) {
        m2141k4((String) null, str);
        if (m2138ix()) {
            m1701x1().m72879x1(str);
        }
    }

    /* JADX INFO: renamed from: to */
    public final C0867cr m1699to() {
        return this.f2473kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14747wq m1701x1() {
        return (C14747wq) m2144u4();
    }

    public Hyperlink(Hyperlink hyperlink, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(null);
        this.f2473kk = new C0867cr();
        m1687k4(hyperlink.m1692h4(), hyperlink.f2474m9, hyperlink.getActionType());
        m1699to().m4794k4(hyperlink.m1699to().m4793k4());
        m1695k4(hyperlink.m1690du());
        setTargetFrame(str);
        setTooltip(str2);
        setHistory(z);
        setStopSoundOnClick(z2);
        setHighlightClick(z3);
        m1700to(hyperlink.m1689c5());
    }

    /* JADX INFO: renamed from: du */
    private static String m1685du(String str) {
        return C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, "%20", " "), "%", "%25"), "[", "%5B"), "]", "%5D"), "<", "%3C"), ">", "%3E"), "{", "%7B"), "}", "%7D"), "^", "%5E"), " ", "%20");
    }

    @Override // com.aspose.slides.PVIObject
    public boolean equals(Object obj) {
        Hyperlink hyperlink = (Hyperlink) C7019kk.m27452k4(obj, Hyperlink.class);
        return hyperlink != null && m1688k4(hyperlink);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1695k4(String str) {
        this.f2471du = str;
        this.f2475to = m1686fa();
    }

    /* JADX INFO: renamed from: to */
    public final void m1700to(String str) {
        m2141k4((String) null, str);
        if (m2138ix()) {
            m1701x1().m72872kk(str);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1702x1(String str) {
        if (this.f2472h4) {
            return;
        }
        this.f2474m9 = str;
    }

    public Hyperlink(ISlide iSlide) {
        super(null);
        this.f2473kk = new C0867cr();
        m1687k4(false, null, 8);
        m1699to().m4794k4(iSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1696k4(boolean z) {
        this.f2472h4 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1703x1(boolean z) {
        m2145uz();
        m1701x1().m72876to(z);
    }

    public Hyperlink(String str) {
        super(null);
        this.f2473kk = new C0867cr();
        m1687k4(true, str, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1687k4(boolean z, String str, int i) {
        this.f2475to = i;
        this.f2472h4 = z;
        this.f2474m9 = str;
    }

    public Hyperlink(boolean z, String str, int i) {
        super(null);
        this.f2473kk = new C0867cr();
        m1687k4(z, str, i);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m1688k4(Hyperlink hyperlink) {
        boolean z = C14113y2.m67363du(getExternalUrlOriginal(), hyperlink.getExternalUrlOriginal()) && C14113y2.m67363du(m1698m9(), hyperlink.m1698m9()) && getTargetSlide() == hyperlink.getTargetSlide() && C14113y2.m67363du(m1689c5(), hyperlink.m1689c5()) && C14113y2.m67363du(m1690du(), hyperlink.m1690du());
        return (m2138ix() || hyperlink.m2138ix()) ? z && C14113y2.m67363du(getTargetFrame(), hyperlink.getTargetFrame()) && C14113y2.m67363du(getTooltip(), hyperlink.getTooltip()) && getHistory() == hyperlink.getHistory() && getHighlightClick() == hyperlink.getHighlightClick() && getStopSoundOnClick() == hyperlink.getStopSoundOnClick() && getColorSource() == hyperlink.getColorSource() && getSound() == hyperlink.getSound() : z;
    }
}
