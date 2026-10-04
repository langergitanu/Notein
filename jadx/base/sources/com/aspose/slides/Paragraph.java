package com.aspose.slides;

import android.graphics.RectF;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Paragraph implements IParagraph, InterfaceC14397rj {

    /* JADX INFO: renamed from: c5 */
    private Portion f2944c5;

    /* JADX INFO: renamed from: du */
    private ParagraphCollection f2945du;

    /* JADX INFO: renamed from: dy */
    private ISlideComponent f2946dy;

    /* JADX INFO: renamed from: h4 */
    private final PortionCollection f2947h4;

    /* JADX INFO: renamed from: k4 */
    ud9 f2948k4;

    /* JADX INFO: renamed from: kk */
    private PortionFormat f2949kk;

    /* JADX INFO: renamed from: m9 */
    private IPresentationComponent f2950m9;

    /* JADX INFO: renamed from: to */
    private boolean f2951to;

    /* JADX INFO: renamed from: x1 */
    private ParagraphFormat f2952x1;

    public Paragraph() {
        this.f2952x1 = new ParagraphFormat(this);
        this.f2947h4 = new PortionCollection(this);
        this.f2948k4 = new ud9(this);
    }

    /* JADX INFO: renamed from: k4 */
    private IHyperlink m2148k4(int i, int i2) {
        while (i <= i2) {
            if (getPortions().get_Item(i).getPortionFormat().getHyperlinkClick() != null) {
                return getPortions().get_Item(i).getPortionFormat().getHyperlinkClick();
            }
            i++;
        }
        return null;
    }

    /* JADX INFO: renamed from: ks */
    private void m2151ks() {
        ParagraphCollection paragraphCollection = this.f2945du;
        if (paragraphCollection != null) {
            paragraphCollection.m2182x1(this);
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m2152rv() {
        this.f2949kk.m2307k4(this.f2944c5);
    }

    /* JADX INFO: renamed from: c5 */
    public final void m2153c5() {
        if (m2154ck() == null) {
            throw new InvalidOperationException("Paragraph should be assigned to the ParagraphCollection");
        }
        if (m2154ck().m2179kk() == null) {
            throw new InvalidOperationException("Paragraph should be assigned to the TextFrame");
        }
    }

    /* JADX INFO: renamed from: ck */
    public final ParagraphCollection m2154ck() {
        return this.f2945du;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m2155du() {
        return this.f2951to;
    }

    /* JADX INFO: renamed from: dy */
    public final void m2156dy() {
        Hyperlink hyperlink;
        int i = 0;
        while (i < getPortions().getCount()) {
            int[] iArr = {0};
            int[] iArr2 = {0};
            C14062gk[] c14062gkArr = {null};
            m2150k4(i, iArr, iArr2, c14062gkArr);
            int i2 = iArr[0];
            int i3 = iArr2[0];
            C14062gk c14062gk = c14062gkArr[0];
            if (c14062gk != null && i2 >= 0 && i3 >= 0 && (hyperlink = (Hyperlink) m2148k4(i2, i3)) != null && !C14113y2.m67411k4(hyperlink.getExternalUrlOriginal()) && !C14113y2.m67448x1(hyperlink.getExternalUrlOriginal(), "mailto")) {
                m2149k4(i2, i3, c14062gk, hyperlink);
            }
            if (i3 == -1) {
                return;
            } else {
                i = i3 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    public final IPresentationComponent m2157fa() {
        IPresentationComponent iPresentationComponent = this.f2950m9;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2945du, iPresentationComponentArr);
            this.f2950m9 = iPresentationComponentArr[0];
        }
        return this.f2950m9;
    }

    @Override // com.aspose.slides.IParagraph
    public final IPortionFormat getEndParagraphPortionFormat() {
        return this.f2949kk;
    }

    @Override // com.aspose.slides.IParagraph
    public final int getLinesCount() {
        return this.f2948k4.m71669k4();
    }

    @Override // com.aspose.slides.IParagraph
    public final IParagraphFormat getParagraphFormat() {
        return this.f2952x1;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2945du;
    }

    @Override // com.aspose.slides.IParagraph
    public final IPortionCollection getPortions() {
        return this.f2947h4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (m2157fa() != null) {
            return m2157fa().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IParagraph
    public final RectF getRect() {
        return (RectF) C12007ix.m56540h4(m2170x1());
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (m2169up() != null) {
            return m2169up().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IParagraph
    public final String getText() {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((m2157fa() == null || m2157fa().getPresentation() == null) ? null : (ctm) ((Presentation) m2157fa().getPresentation()).m2399x6(), bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        C14113y2.m67403k4(" ", strArr[0]);
        return ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1) || Arrays.equals(iArrM2334k4, r1s.f48531x1)) ? m2168to() : C3038bv.m12790k4(m2168to());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m2158h4() {
        m2151ks();
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m2159jd() {
        if (m2161k4().m2201m9()) {
            return true;
        }
        PortionFormat portionFormat = this.f2949kk;
        if (portionFormat != null && portionFormat.m358fa()) {
            return true;
        }
        IGenericEnumerator<IPortion> it = getPortions().iterator();
        while (it.hasNext()) {
            try {
                if (((Portion) it.next()).m2281dy()) {
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

    @Override // com.aspose.slides.IParagraph
    public final void joinPortionsWithSameFormatting() {
        int i = 0;
        while (i < getPortions().getCount() - 1) {
            IPortion iPortion = getPortions().get_Item(i);
            int i2 = i + 1;
            IPortion iPortion2 = getPortions().get_Item(i2);
            boolean smartTagClean = iPortion2.getPortionFormat().getSmartTagClean();
            iPortion2.getPortionFormat().setSmartTagClean(iPortion.getPortionFormat().getSmartTagClean());
            try {
                if (iPortion.getPortionFormat().equals(iPortion2.getPortionFormat())) {
                    iPortion.setText(C14113y2.m67408k4(iPortion.getText(), getPortions().get_Item(i2).getText()));
                    getPortions().removeAt(i2);
                    iPortion2 = null;
                } else {
                    i = i2;
                }
                if (iPortion2 != null) {
                }
            } finally {
                iPortion2.getPortionFormat().setSmartTagClean(smartTagClean);
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final IPortionFormat m2166kk() {
        if (this.f2949kk == null) {
            return null;
        }
        Portion portion = new Portion();
        portion.f3052x1 = this.f2949kk;
        this.f2944c5 = portion;
        portion.m2288k4((PortionCollection) getPortions());
        m2152rv();
        return this.f2949kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m2167m9() {
        ParagraphCollection paragraphCollectionM2154ck = m2154ck();
        if (paragraphCollectionM2154ck != null) {
            return paragraphCollectionM2154ck.m2176k4(this);
        }
        return -1;
    }

    @Override // com.aspose.slides.IParagraph
    public final void setEndParagraphPortionFormat(IPortionFormat iPortionFormat) {
        this.f2949kk = (PortionFormat) iPortionFormat;
        Portion portion = new Portion();
        PortionFormat portionFormat = this.f2949kk;
        portion.f3052x1 = portionFormat;
        this.f2944c5 = portion;
        if (portionFormat.getParent_Immediate() == null) {
            this.f2944c5.m2288k4((PortionCollection) getPortions());
        }
        m2152rv();
    }

    @Override // com.aspose.slides.IParagraph
    public final void setText(String str) {
        if (C14113y2.m67384k4(str, ParagraphCollection.f2953k4) != -1) {
            throw new PptxException("Can't assign string which contains paragraph break character");
        }
        PortionFormat portionFormat = getPortions().getCount() > 0 ? (PortionFormat) getPortions().get_Item(0).getPortionFormat() : null;
        getPortions().clear();
        if (portionFormat == null) {
            getPortions().add(new Portion(str));
            return;
        }
        Portion portion = new Portion(portionFormat);
        portion.setText(str);
        getPortions().add(portion);
    }

    /* JADX INFO: renamed from: to */
    public final String m2168to() {
        String strM67400k4 = "";
        for (int i = 0; i < this.f2947h4.getCount(); i++) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, ((Portion) this.f2947h4.get_Item(i)).m2283h4());
        }
        return strM67400k4;
    }

    /* JADX INFO: renamed from: up */
    public final ISlideComponent m2169up() {
        ISlideComponent iSlideComponent = this.f2946dy;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f2945du, iSlideComponentArr);
            this.f2946dy = iSlideComponentArr[0];
        }
        return this.f2946dy;
    }

    /* JADX INFO: renamed from: x1 */
    public C12007ix m2170x1() {
        return this.f2948k4.m71670x1();
    }

    /* JADX INFO: renamed from: yj */
    public final void m2172yj() {
        this.f2952x1.m2202rv();
        IGenericEnumerator<IPortion> it = getPortions().iterator();
        while (it.hasNext()) {
            try {
                ((Portion) it.next()).m2294up();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    public Paragraph(Paragraph paragraph) {
        this();
        m2163k4(paragraph);
    }

    /* JADX INFO: renamed from: k4 */
    public final Paragraph m2160k4(IParagraphFormat iParagraphFormat) {
        Paragraph paragraph = new Paragraph((ParagraphFormat) iParagraphFormat);
        this.f2952x1.m2207x1(paragraph.f2952x1);
        paragraph.f2951to = this.f2951to;
        if (this.f2947h4.getCount() <= 0) {
            paragraph.f2947h4.add(new Portion(paragraph.f2952x1.m2204to()));
            return paragraph;
        }
        for (int i = 0; i < this.f2947h4.getCount(); i++) {
            paragraph.f2947h4.add(((Portion) this.f2947h4.get_Item(i)).m2285k4(paragraph.f2952x1.m2204to()));
        }
        return paragraph;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2171x1(Paragraph paragraph) {
        this.f2952x1.m2196k4(paragraph.f2952x1);
        m2151ks();
    }

    public Paragraph(ParagraphFormat paragraphFormat) {
        this.f2952x1 = new ParagraphFormat(this);
        this.f2947h4 = new PortionCollection(this);
        this.f2952x1.m2196k4(paragraphFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final ParagraphFormat m2161k4() {
        return this.f2952x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m2149k4(int i, int i2, C14062gk c14062gk, Hyperlink hyperlink) {
        if (c14062gk == null) {
            throw new ArgumentNullException("uri");
        }
        if (hyperlink == null) {
            throw new ArgumentNullException("hyperlink");
        }
        if (i < 0) {
            throw new ArgumentException("startPortionIndex");
        }
        if (i2 < i) {
            throw new ArgumentException("lastPortionIndex");
        }
        try {
            C14062gk c14062gkM66638k4 = C14062gk.m66638k4(new URI(hyperlink.getExternalUrlOriginal()));
            if (C14062gk.m66647k4(c14062gk, c14062gkM66638k4)) {
                return;
            }
            String strM67408k4 = C14113y2.f47374k4;
            if (c14062gk.m66683ix() && (C14113y2.m67411k4(c14062gk.m66680fa()) || C14113y2.m67363du("/", c14062gk.m66680fa()))) {
                strM67408k4 = hyperlink.getExternalUrlOriginal();
            } else if (!c14062gk.m66683ix()) {
                strM67408k4 = C14113y2.m67408k4(c14062gkM66638k4.m66678du(), "/".equals(c14062gkM66638k4.m66680fa()) ? "" : c14062gkM66638k4.m66680fa());
            }
            if (C14113y2.m67411k4(strM67408k4)) {
                return;
            }
            IPortion iPortion = getPortions().get_Item(i);
            iPortion.setText(strM67408k4);
            if (i >= i2) {
                return;
            }
            while (true) {
                i++;
                if (i > i2) {
                    return;
                }
                IPortion iPortion2 = getPortions().get_Item(i);
                iPortion2.setText("");
                ((PortionFormat) iPortion2.getPortionFormat()).m361k4((BasePortionFormat) iPortion.getPortionFormat());
            }
        } catch (UriFormatException e) {
            C3085sv.m13082k4(e);
        } catch (URISyntaxException e2) {
            C3085sv.m13082k4(e2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m2150k4(int i, int[] iArr, int[] iArr2, C14062gk[] c14062gkArr) {
        c14062gkArr[0] = null;
        iArr2[0] = -1;
        iArr[0] = -1;
        if (i < 0 || i >= getPortions().getCount()) {
            return;
        }
        C6765kp c6765kp = new C6765kp();
        for (int i2 = i; i2 < getPortions().getCount(); i2++) {
            if (getPortions().get_Item(i2).getPortionFormat().getHyperlinkClick() == null) {
                if (iArr[0] == -1) {
                    iArr[0] = i2;
                    iArr2[0] = i2;
                    return;
                }
                return;
            }
            String strM67440x1 = C14113y2.m67440x1(C14113y2.m67401k4(getPortions().get_Item(i2).getText(), "\u000b", ""));
            if (c14062gkArr[0] != null && !"".equals(strM67440x1)) {
                iArr2[0] = i2;
            }
            if (!"".equals(strM67440x1)) {
                c6765kp.m26792k4(getPortions().get_Item(i2).getText());
                if (i2 == i) {
                    if (C14113y2.m67448x1(getPortions().get_Item(i2).getText(), "www.")) {
                        if (!C14062gk.m66650k4(c6765kp.toString(), 0, c14062gkArr)) {
                            return;
                        }
                    } else if (!C14062gk.m66650k4(c6765kp.toString(), 1, c14062gkArr) && !C14113y2.m67448x1(getPortions().get_Item(i2).getText(), "http")) {
                        return;
                    }
                } else if (!C14062gk.m66650k4(c6765kp.toString(), 0, c14062gkArr)) {
                    return;
                }
                if (i2 == getPortions().getCount()) {
                    return;
                }
                if (iArr[0] == -1) {
                    iArr[0] = i2;
                }
                iArr2[0] = i2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2162k4(IPortionFormat iPortionFormat) {
        m2151ks();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2163k4(Paragraph paragraph) {
        this.f2952x1.m2196k4((ParagraphFormat) paragraph.getParagraphFormat());
        this.f2951to = paragraph.f2951to;
        this.f2949kk = paragraph.f2949kk;
        for (int i = 0; i < paragraph.getPortions().getCount(); i++) {
            this.f2947h4.add(new Portion((Portion) paragraph.getPortions().get_Item(i)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2164k4(ParagraphCollection paragraphCollection) {
        if (C14067j2.m66729x1(paragraphCollection, this.f2945du)) {
            return;
        }
        this.f2945du = paragraphCollection;
        this.f2950m9 = null;
        this.f2946dy = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2165k4(boolean z) {
        this.f2951to = z;
        m2158h4();
    }
}
