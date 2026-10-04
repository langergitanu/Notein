package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3074na;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class TextFrame implements ITextFrame, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    static final C3074na<Byte, Integer> f3512du;

    /* JADX INFO: renamed from: c5 */
    private final ParagraphCollection f3513c5;

    /* JADX INFO: renamed from: dy */
    private ISlideComponent f3515dy;

    /* JADX INFO: renamed from: fa */
    private HyperlinkQueries f3516fa;

    /* JADX INFO: renamed from: h4 */
    private final InterfaceC14397rj f3517h4;

    /* JADX INFO: renamed from: jd */
    private IParagraphFormat[] f3518jd;

    /* JADX INFO: renamed from: k4 */
    final TextFrameFormat f3519k4;

    /* JADX INFO: renamed from: ks */
    private boolean f3521ks;

    /* JADX INFO: renamed from: m9 */
    private IPresentationComponent f3522m9;

    /* JADX INFO: renamed from: to */
    final InterfaceC13762l4 f3523to;

    /* JADX INFO: renamed from: up */
    private boolean f3524up;

    /* JADX INFO: renamed from: x1 */
    C14321pz f3525x1;

    /* JADX INFO: renamed from: yj */
    private TextFrame f3526yj;

    /* JADX INFO: renamed from: ck */
    private int f3514ck = -1;

    /* JADX INFO: renamed from: kk */
    final C14467sr f3520kk = new C14467sr();

    static {
        C3074na<Byte, Integer> c3074na = new C3074na<>();
        f3512du = c3074na;
        c3074na.m13009k4((byte) 0, 1);
        c3074na.m13009k4((byte) 2, 1);
        c3074na.m13009k4((byte) 1, 2);
        c3074na.m13009k4((byte) 3, 2);
        c3074na.m13009k4((byte) 8, 2);
        c3074na.m13009k4((byte) 9, 2);
        c3074na.m13009k4((byte) 10, 2);
        c3074na.m13009k4((byte) 11, 2);
        c3074na.m13009k4((byte) 12, 2);
        c3074na.m13009k4((byte) 13, 2);
        c3074na.m13009k4((byte) 14, 2);
        c3074na.m13009k4((byte) 15, 2);
        c3074na.m13009k4((byte) 4, 0);
        c3074na.m13009k4((byte) 5, 0);
        c3074na.m13009k4((byte) 6, 0);
        c3074na.m13009k4((byte) 7, 0);
    }

    public TextFrame(InterfaceC14397rj interfaceC14397rj) {
        if (interfaceC14397rj == null) {
            throw new ArgumentNullException();
        }
        if (!C7019kk.m27469x1(interfaceC14397rj, AutoShape.class) && !C7019kk.m27469x1(interfaceC14397rj, Cell.class) && !C7019kk.m27469x1(interfaceC14397rj, IOverridableText.class) && !C7019kk.m27469x1(interfaceC14397rj, SmartArtShape.class)) {
            throw new ArgumentException(C14113y2.m67408k4("Incorrect type of parent ISlideComponent: ", C14067j2.m66727k4(interfaceC14397rj).mo48629x6()));
        }
        this.f3517h4 = interfaceC14397rj;
        this.f3519k4 = new TextFrameFormat(this);
        this.f3513c5 = new ParagraphCollection(this);
        m2932x1(true);
        this.f3523to = new s8c(this);
    }

    /* JADX INFO: renamed from: k4 */
    private static MasterSlide m2893k4(BaseSlide baseSlide) {
        Object masterSlide;
        Slide slide = (Slide) C7019kk.m27452k4((Object) baseSlide, Slide.class);
        if (slide != null) {
            masterSlide = slide.m2713v4();
        } else {
            LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) baseSlide, LayoutSlide.class);
            masterSlide = layoutSlide != null ? layoutSlide.getMasterSlide() : C7019kk.m27452k4((Object) baseSlide, MasterSlide.class);
        }
        return (MasterSlide) masterSlide;
    }

    /* JADX INFO: renamed from: up */
    private ParagraphFormat[] m2899up() {
        ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[9];
        int i = 0;
        if (getPresentation() != null) {
            TextStyle textStyle = ((Presentation) getPresentation()).f3085kk;
            while (i < 9) {
                paragraphFormatArr[i] = (ParagraphFormat) textStyle.getLevel(i);
                i++;
            }
        } else {
            while (i < 9) {
                paragraphFormatArr[i] = Presentation.f3062h4;
                i++;
            }
        }
        return paragraphFormatArr;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m2901c5() {
        return this.f3513c5.m2175du();
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m2902ck() {
        if (this.f3519k4.m2936ar()) {
            return true;
        }
        Dictionary dictionary = new Dictionary();
        IGenericEnumerator<IParagraph> it = getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                Paragraph paragraph = (Paragraph) it.next();
                if (paragraph.m2159jd()) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
                Float[] fArr = {Float.valueOf(0.0f)};
                boolean zTryGetValue = dictionary.tryGetValue(Short.valueOf(paragraph.m2161k4().m2192h4()), fArr);
                float fFloatValue = fArr[0].floatValue();
                if (!zTryGetValue) {
                    dictionary.addItem(Short.valueOf(paragraph.m2161k4().m2192h4()), Float.valueOf(paragraph.m2161k4().getMarginLeft()));
                } else if (!C14064he.m66715kk(fFloatValue) || !C14064he.m66715kk(paragraph.m2161k4().getMarginLeft())) {
                    if (paragraph.m2161k4().getMarginLeft() != fFloatValue) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        return true;
                    }
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
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final pj5 m2903du() {
        return m2909k4((GeometryShape) getParent_Immediate());
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m2905dy() {
        return this.f3521ks;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m2906fa() {
        IGenericEnumerator<IParagraph> it = getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        if (C7019kk.m27469x1(it2.next(), MathPortion.class)) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return true;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }

    @Override // com.aspose.slides.ITextFrame
    public final IHyperlinkQueries getHyperlinkQueries() {
        if (this.f3516fa == null) {
            this.f3516fa = new HyperlinkQueries(this);
        }
        return this.f3516fa;
    }

    @Override // com.aspose.slides.ITextFrame
    public final IParagraphCollection getParagraphs() {
        return this.f3513c5;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3517h4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (m2924kk() != null) {
            return m2924kk().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (m2924kk() != null) {
            return m2924kk().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.ITextFrame
    public final String getText() {
        return m2894k4((m2929x1() == null || m2929x1().getPresentation() == null) ? null : (ctm) ((Presentation) m2929x1().getPresentation()).m2399x6());
    }

    @Override // com.aspose.slides.ITextFrame
    public final ITextFrameFormat getTextFrameFormat() {
        return this.f3519k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final IParagraphFormat[] m2907h4() {
        C14321pz c14321pz;
        if (this.f3518jd == null || this.f3514ck != this.f3519k4.m2967v4()) {
            InterfaceC14397rj interfaceC14397rj = this.f3517h4;
            if (interfaceC14397rj != null) {
                if (C7019kk.m27469x1(interfaceC14397rj, AutoShape.class) || C7019kk.m27469x1(this.f3517h4, SmartArtShape.class)) {
                    C14321pz[] c14321pzArr = {this.f3525x1};
                    this.f3518jd = m2923k4(c14321pzArr);
                    c14321pz = c14321pzArr[0];
                } else {
                    BaseSlide baseSlide = (BaseSlide) C7019kk.m27452k4((Object) this.f3517h4, BaseSlide.class);
                    if (baseSlide != null) {
                        C14321pz[] c14321pzArr2 = {this.f3525x1};
                        this.f3518jd = m2898k4(baseSlide, c14321pzArr2);
                        c14321pz = c14321pzArr2[0];
                    } else {
                        Cell cell = (Cell) C7019kk.m27452k4((Object) this.f3517h4, Cell.class);
                        if (cell != null) {
                            BaseSlide baseSlide2 = (BaseSlide) getSlide();
                            MasterSlide masterSlideM2893k4 = m2893k4(baseSlide2);
                            C14321pz[] c14321pzArr3 = {this.f3525x1};
                            this.f3518jd = m2897k4(baseSlide2, masterSlideM2893k4, cell.m464fa().m73908x1(), c14321pzArr3);
                            c14321pz = c14321pzArr3[0];
                        } else {
                            this.f3514ck = this.f3519k4.m2967v4();
                            this.f3518jd = m2899up();
                        }
                    }
                }
                this.f3525x1 = c14321pz;
                this.f3514ck = this.f3519k4.m2967v4();
            } else {
                this.f3514ck = this.f3519k4.m2967v4();
                this.f3518jd = m2899up();
            }
        }
        return this.f3518jd;
    }

    @Override // com.aspose.slides.ITextFrame
    @Deprecated
    public final void highlightRegex(String str, Integer num, ITextHighlightingOptions iTextHighlightingOptions) {
        m2931x1(str, C12003du.m56401k4(num), iTextHighlightingOptions);
    }

    @Override // com.aspose.slides.ITextFrame
    public final void highlightText(String str, Integer num) {
        m2917k4(str, C12003du.m56401k4(num));
    }

    /* JADX INFO: renamed from: jd */
    public final TextFrameFormat m2908jd() {
        return this.f3519k4;
    }

    @Override // com.aspose.slides.ITextFrame
    public final void joinPortionsWithSameFormatting() {
        IGenericEnumerator<IParagraph> it = getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                it.next().joinPortionsWithSameFormatting();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final ISlideComponent m2924kk() {
        ISlideComponent iSlideComponent = this.f3515dy;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f3517h4, iSlideComponentArr);
            this.f3515dy = iSlideComponentArr[0];
        }
        return this.f3515dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m2926m9() {
        kp9 kp9VarM2944dy = this.f3519k4.m2944dy();
        return (kp9VarM2944dy == null || kp9VarM2944dy.m64091k4() == -1 || kp9VarM2944dy.m64091k4() == 41 || kp9VarM2944dy.m64091k4() == 0) ? false : true;
    }

    @Override // com.aspose.slides.ITextFrame
    public final void replaceRegex(Pattern pattern, String str, IFindResultCallback iFindResultCallback) {
        m2915k4(C12380dy.m57968k4(pattern), str, iFindResultCallback);
    }

    @Override // com.aspose.slides.ITextFrame
    public final void replaceText(String str, String str2, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("Text to replacement can not be null or empty", "oldText");
        }
        int i = (iTextSearchOptions == null || iTextSearchOptions.getCaseSensitive()) ? 0 : 66;
        String strM57987kk = new C12380dy("\\-\\[\\]\\{\\}\\(\\)\\*\\+\\?\\.\\,\\\\\\^\\$\\|#\\s").m57987kk(str, "\\$0");
        if (iTextSearchOptions != null && iTextSearchOptions.getWholeWordsOnly()) {
            strM57987kk = C14113y2.m67408k4("\\b", strM57987kk, "\\b");
        }
        C12380dy c12380dy = new C12380dy(strM57987kk, i);
        m2911k4(c12380dy, iFindResultCallback);
        m2914k4(c12380dy, str2);
    }

    @Override // com.aspose.slides.ITextFrame
    public final void setText(String str) {
        m2916k4(str);
        if (C7019kk.m27469x1(m2924kk(), AutoShape.class)) {
            ((AutoShape) m2924kk()).m284k4(true);
        }
    }

    /* JADX INFO: renamed from: to */
    public final TextFrame m2927to() {
        return this.f3526yj;
    }

    /* JADX INFO: renamed from: x1 */
    public final IPresentationComponent m2929x1() {
        IPresentationComponent iPresentationComponent = this.f3522m9;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f3517h4, iPresentationComponentArr);
            this.f3522m9 = iPresentationComponentArr[0];
        }
        return this.f3522m9;
    }

    /* JADX INFO: renamed from: du */
    public final void m2904du(TextFrame textFrame) {
        this.f3526yj = textFrame;
    }

    @Override // com.aspose.slides.ITextFrame
    public final void highlightRegex(Pattern pattern, Integer num, IFindResultCallback iFindResultCallback) {
        m2913k4(C12380dy.m57968k4(pattern), C12003du.m56401k4(num), iFindResultCallback);
    }

    @Override // com.aspose.slides.ITextFrame
    @Deprecated
    public final void highlightText(String str, Integer num, ITextHighlightingOptions iTextHighlightingOptions) {
        m2918k4(str, C12003du.m56401k4(num), iTextHighlightingOptions);
    }

    /* JADX INFO: renamed from: k4 */
    public final pj5 m2909k4(Shape shape) {
        ITextFrameFormatEffectiveData effective = this.f3519k4.getEffective();
        pj5 pj5Var = new pj5();
        pj5Var.f48081x1 = (float) effective.getMarginLeft();
        pj5Var.f48079kk = (float) effective.getMarginTop();
        pj5Var.f48080to = (float) effective.getMarginRight();
        pj5Var.f48078du = (float) effective.getMarginBottom();
        if (!pj5Var.m69117x1()) {
            for (Shape shape2 : shape.m2547c6()) {
                TextFrame textFrameM288x1 = C7019kk.m27469x1(shape2, AutoShape.class) ? ((AutoShape) shape2).m288x1() : C7019kk.m27469x1(shape2, SmartArtShape.class) ? ((SmartArtShape) shape2).m2820kk() : null;
                if (textFrameM288x1 != null) {
                    pj5Var.m69113k4(textFrameM288x1.f3519k4.m2963to().m73499k4().Clone()).CloneTo(pj5Var);
                    if (pj5Var.m69117x1()) {
                    }
                }
            }
            return pj5Var.m69113k4(new pj5(7.2f, 3.6f, 7.2f, 3.6f));
        }
        return pj5Var;
    }

    /* JADX INFO: renamed from: kk */
    public final void m2925kk(TextFrame textFrame) {
        this.f3519k4.m2952k4(textFrame.f3519k4);
    }

    /* JADX INFO: renamed from: to */
    public final void m2928to(TextFrame textFrame) {
        this.f3513c5.clear();
        IGenericEnumerator<IParagraph> it = textFrame.f3513c5.iterator();
        while (it.hasNext()) {
            try {
                this.f3513c5.add(new Paragraph((Paragraph) it.next()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2930x1(ITextFrame iTextFrame) {
        if (iTextFrame == null) {
            throw new ArgumentNullException("source");
        }
        m2910k4(iTextFrame);
        for (int i = 0; i < iTextFrame.getParagraphs().getCount(); i++) {
            Paragraph paragraph = (Paragraph) iTextFrame.getParagraphs().get_Item(i);
            Paragraph paragraph2 = (Paragraph) getParagraphs().get_Item(i);
            paragraph2.m2171x1(paragraph);
            for (int i2 = 0; i2 < paragraph.getPortions().getCount(); i2++) {
                ((Portion) paragraph2.getPortions().get_Item(i2)).m2287k4((Portion) paragraph.getPortions().get_Item(i2));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private String m2894k4(ctm ctmVar) {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4(ctmVar, bArr);
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
        return ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1) || Arrays.equals(iArrM2334k4, r1s.f48531x1)) ? m2901c5() : C3038bv.m12790k4(m2901c5());
    }

    @Override // com.aspose.slides.ITextFrame
    public final void highlightText(String str, Integer num, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        m2919k4(str, C12003du.m56401k4(num), iTextSearchOptions, iFindResultCallback);
    }

    /* JADX INFO: renamed from: x1 */
    public void m2931x1(String str, C12003du c12003du, ITextHighlightingOptions iTextHighlightingOptions) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("Regex to highlight can not be null or empty", "regex");
        }
        int i = (iTextHighlightingOptions == null || iTextHighlightingOptions.getCaseSensitive()) ? 0 : 66;
        if (iTextHighlightingOptions != null && iTextHighlightingOptions.getWholeWordsOnly() && !C14113y2.m67359c5(str, "\\b")) {
            str = C14113y2.m67408k4("\\b", str, "\\b");
        }
        C12380dy c12380dy = new C12380dy(str, i);
        m2911k4(c12380dy, (IFindResultCallback) null);
        m2912k4(c12380dy, c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m2895k4(IShapeStyle iShapeStyle, BaseSlide baseSlide, ParagraphFormat paragraphFormat, ITextStyle iTextStyle, ParagraphFormat[] paragraphFormatArr, C14321pz[] c14321pzArr) {
        if (iShapeStyle.getFontColor().getColorType() != -1) {
            IFillFormat fillFormat = paragraphFormat.m2204to().getFillFormat();
            c14321pzArr[0] = ((ColorFormat) iShapeStyle.getFontColor()).m1068c5();
            fillFormat.setFillType((byte) 1);
            fillFormat.getSolidFillColor().copyFrom(iShapeStyle.getFontColor());
            for (int i = 0; i < paragraphFormatArr.length; i++) {
                if (paragraphFormatArr[i] != null) {
                    ParagraphFormat paragraphFormat2 = new ParagraphFormat((ParagraphFormat) iTextStyle.getLevel(i), this);
                    paragraphFormatArr[i] = paragraphFormat2;
                    IFillFormat fillFormat2 = paragraphFormat2.m2204to().getFillFormat();
                    fillFormat2.setFillType((byte) 1);
                    fillFormat2.getSolidFillColor().copyFrom(iShapeStyle.getFontColor());
                }
            }
        }
        byte fontCollectionIndex = iShapeStyle.getFontCollectionIndex();
        IFontsEffectiveData major = fontCollectionIndex != 1 ? fontCollectionIndex != 2 ? null : baseSlide.createThemeEffective().getFontScheme().getMajor() : baseSlide.m402m9().createThemeEffective().getFontScheme().getMinor();
        if (major != null) {
            paragraphFormat.m2204to().setLatinFont(major.getLatinFont());
            paragraphFormat.m2204to().setEastAsianFont(major.getEastAsianFont());
            paragraphFormat.m2204to().setComplexScriptFont(major.getComplexScriptFont());
            for (int i2 = 0; i2 < paragraphFormatArr.length; i2++) {
                ParagraphFormat paragraphFormat3 = paragraphFormatArr[i2];
                if (paragraphFormat3 != null) {
                    paragraphFormat3.m2204to().setLatinFont(major.getLatinFont());
                    paragraphFormatArr[i2].m2204to().setEastAsianFont(major.getEastAsianFont());
                    paragraphFormatArr[i2].m2204to().setComplexScriptFont(major.getComplexScriptFont());
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2932x1(boolean z) {
        this.f3521ks = z;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m2900x1(TextFrame textFrame) {
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        if (((MathPortion) C7019kk.m27452k4((Object) it2.next(), MathPortion.class)) != null) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return true;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return false;
        }
        it.dispose();
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2910k4(ITextFrame iTextFrame) {
        TextFrame textFrame = (TextFrame) C7019kk.m27452k4((Object) iTextFrame, TextFrame.class);
        if (textFrame == null) {
            return;
        }
        m2925kk(textFrame);
        m2928to(textFrame);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2911k4(C12380dy c12380dy, IFindResultCallback iFindResultCallback) {
        this.f3520kk.m70737h4();
        String strM2901c5 = m2901c5();
        if (c12380dy.m57988to(strM2901c5)) {
            IGenericEnumerator<IParagraph> it = getParagraphs().iterator();
            int length = 0;
            while (it.hasNext()) {
                try {
                    IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                    while (it2.hasNext()) {
                        try {
                            Portion portion = (Portion) it2.next();
                            this.f3520kk.m70740k4(portion, length);
                            length += portion.m2283h4().length();
                        } catch (Throwable th) {
                            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                                it2.dispose();
                            }
                            throw th;
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    length++;
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            Iterator<C12385to> it3 = c12380dy.m57986kk(strM2901c5).iterator();
            while (it3.hasNext()) {
                try {
                    C12385to next = it3.next();
                    if (C14113y2.m67384k4(next.mo57995kk(), new char[]{ControlChar.PARAGRAPH_BREAK_CHAR, '\n'}) < 0) {
                        this.f3520kk.m70739k4(next.mo57994k4(), next.mo57996x1());
                        if (iFindResultCallback != null) {
                            iFindResultCallback.foundResult(this, getText(), next.mo57995kk(), next.mo57994k4());
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it3).dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2912k4(C12380dy c12380dy, C12003du c12003du) {
        if (this.f3520kk.m70742to().size() == 0) {
            return;
        }
        String strM2901c5 = m2901c5();
        Portion portion = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int iIntValue = 0;
        while (i < strM2901c5.length()) {
            boolean z3 = true;
            if (this.f3520kk.m70738k4().size() > 0 && i == this.f3520kk.m70738k4().get_Item(0).intValue()) {
                portion = this.f3520kk.m70743x1().get_Item(0);
                this.f3520kk.m70738k4().removeAt(0);
                this.f3520kk.m70743x1().removeAt(0);
                if (this.f3520kk.m70741kk().size() <= 0 || portion.m2283h4().length() + i <= this.f3520kk.m70741kk().get_Item(0).intValue()) {
                    z2 = false;
                } else if (i < this.f3520kk.m70741kk().get_Item(0).intValue()) {
                    int iIntValue2 = this.f3520kk.m70741kk().get_Item(0).intValue() - i;
                    String strM67443x1 = C14113y2.m67443x1(portion.m2283h4(), 0, iIntValue2);
                    String strM67422kk = C14113y2.m67422kk(portion.m2283h4(), iIntValue2);
                    Portion portion2 = new Portion(portion);
                    portion2.m2289k4(strM67443x1);
                    portion.m2289k4(strM67422kk);
                    this.f3520kk.m70738k4().insertItem(0, this.f3520kk.m70741kk().get_Item(0));
                    this.f3520kk.m70743x1().insertItem(0, portion);
                    portion.m2282fa().getPortions().insert(portion.m2282fa().getPortions().indexOf(portion), portion2);
                    z2 = false;
                    portion = portion2;
                } else {
                    if (portion.m2283h4().length() + i > this.f3520kk.m70742to().get_Item(0).intValue() + this.f3520kk.m70741kk().get_Item(0).intValue()) {
                        int iIntValue3 = (this.f3520kk.m70742to().get_Item(0).intValue() + this.f3520kk.m70741kk().get_Item(0).intValue()) - i;
                        String strM67443x12 = C14113y2.m67443x1(portion.m2283h4(), 0, iIntValue3);
                        String strM67422kk2 = C14113y2.m67422kk(portion.m2283h4(), iIntValue3);
                        Portion portion3 = new Portion(portion);
                        portion3.m2289k4(strM67422kk2);
                        portion.m2289k4(strM67443x12);
                        this.f3520kk.m70738k4().insertItem(0, Integer.valueOf(this.f3520kk.m70742to().get_Item(0).intValue() + this.f3520kk.m70741kk().get_Item(0).intValue()));
                        this.f3520kk.m70743x1().insertItem(0, portion3);
                        portion.m2282fa().getPortions().insert(portion.m2282fa().getPortions().indexOf(portion) + 1, portion3);
                    }
                    z2 = false;
                }
            }
            if (iIntValue == 0) {
                iIntValue = this.f3520kk.m70742to().get_Item(0).intValue();
            }
            if (!z) {
                z = i == this.f3520kk.m70741kk().get_Item(0).intValue();
            }
            if (z) {
                if (z2) {
                    z3 = z2;
                } else {
                    ((ColorFormat) portion.getPortionFormat().getHighlightColor()).m1080k4(c12003du.Clone());
                }
                iIntValue--;
                if (iIntValue == 0) {
                    this.f3520kk.m70741kk().removeAt(0);
                    this.f3520kk.m70742to().removeAt(0);
                    z = false;
                }
                z2 = z3;
            }
            if (this.f3520kk.m70741kk().size() == 0) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2913k4(C12380dy c12380dy, C12003du c12003du, IFindResultCallback iFindResultCallback) {
        if (c12380dy == null) {
            throw new ArgumentException("Regex to highlight can not be null", "regex");
        }
        m2911k4(c12380dy, iFindResultCallback);
        m2912k4(c12380dy, c12003du.Clone());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final void m2914k4(C12380dy c12380dy, String str) {
        List list = new List();
        List list2 = new List();
        if (this.f3520kk.m70742to().size() == 0) {
            return;
        }
        String strM2901c5 = m2901c5();
        Portion portion = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int iIntValue = 0;
        while (i < strM2901c5.length()) {
            boolean z3 = true;
            if (this.f3520kk.m70738k4().size() > 0 && i == this.f3520kk.m70738k4().get_Item(0).intValue()) {
                portion = this.f3520kk.m70743x1().get_Item(0);
                this.f3520kk.m70738k4().removeAt(0);
                this.f3520kk.m70743x1().removeAt(0);
                if (this.f3520kk.m70741kk().size() <= 0 || portion.m2283h4().length() + i <= this.f3520kk.m70741kk().get_Item(0).intValue()) {
                    z2 = false;
                } else if (i < this.f3520kk.m70741kk().get_Item(0).intValue()) {
                    int iIntValue2 = this.f3520kk.m70741kk().get_Item(0).intValue() - i;
                    String strM67443x1 = C14113y2.m67443x1(portion.m2283h4(), 0, iIntValue2);
                    String strM67422kk = C14113y2.m67422kk(portion.m2283h4(), iIntValue2);
                    Portion portion2 = new Portion(portion);
                    portion2.m2289k4(strM67443x1);
                    portion.m2289k4(strM67422kk);
                    this.f3520kk.m70738k4().insertItem(0, this.f3520kk.m70741kk().get_Item(0));
                    this.f3520kk.m70743x1().insertItem(0, portion);
                    portion.m2282fa().getPortions().insert(portion.m2282fa().getPortions().indexOf(portion), portion2);
                    z2 = false;
                    portion = portion2;
                } else {
                    if (portion.m2283h4().length() + i > this.f3520kk.m70742to().get_Item(0).intValue() + this.f3520kk.m70741kk().get_Item(0).intValue()) {
                        int iIntValue3 = (this.f3520kk.m70742to().get_Item(0).intValue() + this.f3520kk.m70741kk().get_Item(0).intValue()) - i;
                        String strM67443x12 = C14113y2.m67443x1(portion.m2283h4(), 0, iIntValue3);
                        String strM67422kk2 = C14113y2.m67422kk(portion.m2283h4(), iIntValue3);
                        Portion portion3 = new Portion(portion);
                        portion3.m2289k4(strM67422kk2);
                        portion.m2289k4(strM67443x12);
                        this.f3520kk.m70738k4().insertItem(0, Integer.valueOf(this.f3520kk.m70742to().get_Item(0).intValue() + this.f3520kk.m70741kk().get_Item(0).intValue()));
                        this.f3520kk.m70743x1().insertItem(0, portion3);
                        portion.m2282fa().getPortions().insert(portion.m2282fa().getPortions().indexOf(portion) + 1, portion3);
                    }
                    z2 = false;
                }
            }
            if (iIntValue == 0) {
                iIntValue = this.f3520kk.m70742to().get_Item(0).intValue();
            }
            if (!z) {
                z = i == this.f3520kk.m70741kk().get_Item(0).intValue();
            }
            if (z) {
                if (z2) {
                    z3 = z2;
                } else if (i == this.f3520kk.m70741kk().get_Item(0).intValue()) {
                    list.addItem(portion);
                } else {
                    list2.addItem(portion);
                }
                iIntValue--;
                if (iIntValue == 0) {
                    this.f3520kk.m70741kk().removeAt(0);
                    this.f3520kk.m70742to().removeAt(0);
                    z = false;
                }
                z2 = z3;
            }
            if (this.f3520kk.m70741kk().size() == 0) {
                break;
            } else {
                i++;
            }
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Portion) it.next()).setText(str);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = list2.iterator();
        while (it.hasNext()) {
            try {
                Portion portion4 = (Portion) it.next();
                portion4.m2282fa().getPortions().remove(portion4);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2915k4(C12380dy c12380dy, String str, IFindResultCallback iFindResultCallback) {
        if (c12380dy == null) {
            throw new ArgumentException("Regex to replacement can not be null", "regex");
        }
        m2911k4(c12380dy, iFindResultCallback);
        m2914k4(c12380dy, str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2916k4(String str) {
        this.f3513c5.m2178k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2917k4(String str, C12003du c12003du) {
        m2919k4(str, c12003du.Clone(), new TextSearchOptions(), (IFindResultCallback) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2918k4(String str, C12003du c12003du, ITextHighlightingOptions iTextHighlightingOptions) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("Text to highlight can not be null or empty", "text");
        }
        int i = (iTextHighlightingOptions == null || iTextHighlightingOptions.getCaseSensitive()) ? 0 : 66;
        String strM57987kk = new C12380dy("[-[\\\\]{}()*+?.,\\\\^$|#\\s]").m57987kk(str, "\\$0");
        if (iTextHighlightingOptions != null && iTextHighlightingOptions.getWholeWordsOnly()) {
            strM57987kk = C14113y2.m67408k4("\\b", strM57987kk, "\\b");
        }
        C12380dy c12380dy = new C12380dy(strM57987kk, i);
        m2911k4(c12380dy, (IFindResultCallback) null);
        m2912k4(c12380dy, c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void m2919k4(String str, C12003du c12003du, ITextSearchOptions iTextSearchOptions, IFindResultCallback iFindResultCallback) {
        if (C14113y2.m67411k4(str)) {
            throw new ArgumentException("Text to highlight can not be null or empty", "text");
        }
        int i = (iTextSearchOptions == null || iTextSearchOptions.getCaseSensitive()) ? 0 : 66;
        String strM57987kk = new C12380dy("[-[\\\\]{}()*+?.,\\\\^$|#\\s]").m57987kk(str, "\\$0");
        if (iTextSearchOptions != null && iTextSearchOptions.getWholeWordsOnly()) {
            strM57987kk = C14113y2.m67408k4("\\b", strM57987kk, "\\b");
        }
        C12380dy c12380dy = new C12380dy(strM57987kk, i);
        m2911k4(c12380dy, iFindResultCallback);
        m2912k4(c12380dy, c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2920k4(boolean z) {
        this.f3524up = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2921k4(TextFrame[] textFrameArr, TextFrame textFrame) {
        TextFrameFormat textFrameFormat = (TextFrameFormat) textFrame.getTextFrameFormat();
        textFrameFormat.setTextVerticalType(this.f3519k4.m2958lr());
        int columnCount = this.f3519k4.getColumnCount();
        double columnSpacing = this.f3519k4.getColumnSpacing();
        byte wrapText = this.f3519k4.getWrapText();
        byte anchoringType = this.f3519k4.getAnchoringType();
        byte centerText = this.f3519k4.getCenterText();
        int i = 0;
        if (textFrameArr != null) {
            for (int i2 = 0; i2 < textFrameArr.length; i2++) {
                if (columnCount == 0) {
                    columnCount = textFrameArr[i2].f3519k4.getColumnCount();
                }
                if (C14044b3.m66437kk(columnSpacing)) {
                    columnSpacing = textFrameArr[i2].f3519k4.getColumnSpacing();
                }
                if (wrapText == -1) {
                    wrapText = textFrameArr[i2].f3519k4.getWrapText();
                }
                if (anchoringType == -1) {
                    anchoringType = textFrameArr[i2].f3519k4.getAnchoringType();
                }
                if (centerText == -1) {
                    centerText = textFrameArr[i2].f3519k4.getCenterText();
                }
            }
        }
        textFrameFormat.setColumnCount(columnCount);
        textFrameFormat.setColumnSpacing(columnSpacing);
        textFrameFormat.setWrapText(wrapText);
        textFrameFormat.setAnchoringType(anchoringType);
        textFrameFormat.setCenterText(centerText);
        IParagraphFormat[] iParagraphFormatArrM2907h4 = m2907h4();
        while (i < iParagraphFormatArrM2907h4.length) {
            int i3 = i + 1;
            ((TextStyle) textFrame.getTextFrameFormat().getTextStyle()).m2985k4(i3, (ParagraphFormat) iParagraphFormatArrM2907h4[i]);
            i = i3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2922k4() {
        return this.f3524up;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m2896k4(TextFrame textFrame) {
        IGenericEnumerator<IPortion> it = textFrame.getParagraphs().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            try {
                it = it.next().getPortions().iterator();
                while (it.hasNext()) {
                    try {
                        if (((MathPortion) C7019kk.m27452k4((Object) it.next(), MathPortion.class)) != null) {
                            z = true;
                        } else {
                            z2 = true;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        return z && z2;
    }

    /* JADX INFO: renamed from: k4 */
    private IParagraphFormat[] m2897k4(BaseSlide baseSlide, IMasterSlide iMasterSlide, uc0 uc0Var, C14321pz[] c14321pzArr) {
        ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[9];
        c14321pzArr[0] = null;
        TextStyle textStyle = ((Presentation) baseSlide.getPresentation()).f3085kk;
        if (iMasterSlide != null) {
            textStyle = (TextStyle) iMasterSlide.getOtherStyle();
        }
        int i = 0;
        if (uc0Var != null) {
            while (i < 9) {
                ParagraphFormat paragraphFormat = (ParagraphFormat) textStyle.getLevel(i);
                paragraphFormatArr[i] = paragraphFormat;
                if (paragraphFormat == null) {
                    paragraphFormatArr[i] = new ParagraphFormat(Presentation.f3062h4, this);
                } else {
                    paragraphFormatArr[i] = paragraphFormat.m2203to(Presentation.f3062h4);
                }
                i++;
            }
        } else {
            while (i < 9) {
                paragraphFormatArr[i] = new ParagraphFormat(Presentation.f3062h4, this);
                i++;
            }
        }
        if (uc0Var != null) {
            c14321pzArr[0] = ((ColorFormat) uc0Var.m71662m9()).m1086x1((IBaseSlide) baseSlide);
            for (int i2 = 0; i2 < 9; i2++) {
                paragraphFormatArr[i2].m2204to().setFontBold(uc0Var.m71657k4());
                paragraphFormatArr[i2].m2204to().setFontItalic(uc0Var.m71665x1());
                if (c14321pzArr[0] != null) {
                    paragraphFormatArr[i2].m2204to().getFillFormat().setFillType((byte) 1);
                    paragraphFormatArr[i2].m2204to().getFillFormat().getSolidFillColor().setSchemeColor(12);
                }
            }
        }
        if (this.f3519k4.m2959m9() != null) {
            for (int i3 = 0; i3 < 9; i3++) {
                paragraphFormatArr[i3] = this.f3519k4.m2959m9().m2992x1(i3, paragraphFormatArr[i3]);
            }
        }
        return paragraphFormatArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final IParagraphFormat[] m2923k4(C14321pz[] c14321pzArr) {
        IPlaceholder placeholder;
        IShapeStyle iShapeStyle;
        Shape[] shapeArrM2547c6;
        BaseSlide baseSlide;
        c14321pzArr[0] = null;
        Shape[] shapeArr = new Shape[0];
        if (C7019kk.m27469x1(this.f3517h4, GeometryShape.class)) {
            InterfaceC14397rj interfaceC14397rj = this.f3517h4;
            GeometryShape geometryShape = (GeometryShape) interfaceC14397rj;
            baseSlide = (BaseSlide) ((GeometryShape) interfaceC14397rj).getSlide();
            placeholder = geometryShape.getPlaceholder();
            IShapeStyle shapeStyle = geometryShape.getShapeStyle();
            shapeArrM2547c6 = geometryShape.m2547c6();
            iShapeStyle = shapeStyle;
        } else {
            placeholder = null;
            iShapeStyle = null;
            shapeArrM2547c6 = shapeArr;
            baseSlide = null;
        }
        if (C7019kk.m27469x1(this.f3517h4, Cell.class)) {
            baseSlide = (BaseSlide) ((Cell) this.f3517h4).m465h4().mo485k4().getSlide();
        }
        BaseSlide baseSlide2 = baseSlide;
        if (baseSlide2 == null) {
            return null;
        }
        ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[9];
        Presentation presentation = (Presentation) getPresentation();
        MasterSlide masterSlideM2893k4 = m2893k4(baseSlide2);
        if (presentation == null) {
            throw new NullReferenceException("Presentation couldn't be empty.");
        }
        ITextStyle titleStyle = presentation.f3085kk;
        if (masterSlideM2893k4 != null && placeholder != null) {
            int iIntValue = f3512du.m13012x1(Byte.valueOf(placeholder.getType())).intValue();
            if (iIntValue == 1) {
                titleStyle = masterSlideM2893k4.getTitleStyle();
            } else if (iIntValue == 2) {
                titleStyle = masterSlideM2893k4.getBodyStyle();
            } else if (iIntValue == 3) {
                titleStyle = masterSlideM2893k4.getOtherStyle();
            }
        }
        ITextStyle iTextStyle = titleStyle;
        for (int i = 0; i < 9; i++) {
            paragraphFormatArr[i] = (ParagraphFormat) iTextStyle.getLevel(i);
        }
        ParagraphFormat paragraphFormat = new ParagraphFormat((ParagraphFormat) iTextStyle.getDefaultParagraphFormat(), this);
        if (iShapeStyle != null) {
            m2895k4(iShapeStyle, baseSlide2, paragraphFormat, iTextStyle, paragraphFormatArr, c14321pzArr);
        }
        for (int length = shapeArrM2547c6.length - 1; length >= 0; length--) {
            GeometryShape geometryShape2 = (GeometryShape) C7019kk.m27452k4((Object) shapeArrM2547c6[length], GeometryShape.class);
            if (geometryShape2 != null) {
                TextFrame textFrameM288x1 = C7019kk.m27469x1(geometryShape2, AutoShape.class) ? ((AutoShape) geometryShape2).m288x1() : C7019kk.m27469x1(geometryShape2, SmartArtShape.class) ? ((SmartArtShape) geometryShape2).m2820kk() : null;
                if (textFrameM288x1 != null) {
                    if (geometryShape2.getShapeStyle() != null) {
                        ITextStyle iTextStyle2 = iTextStyle;
                        ParagraphFormat[] paragraphFormatArr2 = paragraphFormatArr;
                        BaseSlide baseSlide3 = baseSlide2;
                        ParagraphFormat paragraphFormat2 = paragraphFormat;
                        m2895k4(geometryShape2.getShapeStyle(), baseSlide3, paragraphFormat2, iTextStyle2, paragraphFormatArr2, c14321pzArr);
                        baseSlide2 = baseSlide3;
                        paragraphFormat = paragraphFormat2;
                        iTextStyle = iTextStyle2;
                        paragraphFormatArr = paragraphFormatArr2;
                    }
                    for (int i2 = 0; i2 < 9; i2++) {
                        paragraphFormatArr[i2] = textFrameM288x1.f3519k4.m2959m9().m2992x1(i2, paragraphFormatArr[i2]);
                    }
                    paragraphFormat = textFrameM288x1.f3519k4.m2959m9().m2982k4(paragraphFormat);
                }
            }
        }
        for (int i3 = 0; i3 < 9; i3++) {
            paragraphFormatArr[i3] = this.f3519k4.m2959m9().m2992x1(i3, paragraphFormatArr[i3]);
        }
        ParagraphFormat paragraphFormatM2203to = this.f3519k4.m2959m9().m2982k4(paragraphFormat).m2203to(Presentation.f3062h4);
        for (int i4 = 0; i4 < 9; i4++) {
            ParagraphFormat paragraphFormat3 = paragraphFormatArr[i4];
            paragraphFormatArr[i4] = paragraphFormat3 == null ? paragraphFormatM2203to : paragraphFormat3.m2203to(Presentation.f3062h4);
        }
        return paragraphFormatArr;
    }

    /* JADX INFO: renamed from: k4 */
    private ParagraphFormat[] m2898k4(BaseSlide baseSlide, C14321pz[] c14321pzArr) {
        ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[9];
        c14321pzArr[0] = null;
        MasterSlide masterSlideM2893k4 = m2893k4(baseSlide);
        TextStyle textStyle = ((Presentation) getPresentation()).f3085kk;
        for (int i = 0; i < 9; i++) {
            paragraphFormatArr[i] = (ParagraphFormat) textStyle.getLevel(i);
        }
        ParagraphFormat paragraphFormat = new ParagraphFormat(((InterfaceC14397rj) textStyle.getDefaultParagraphFormat()).getParent_Immediate());
        if (masterSlideM2893k4 != null) {
            paragraphFormat = paragraphFormat.m2203to((ParagraphFormat) masterSlideM2893k4.getBodyStyle().getDefaultParagraphFormat());
        }
        for (int i2 = 0; i2 < 9; i2++) {
            ParagraphFormat paragraphFormat2 = paragraphFormatArr[i2];
            paragraphFormatArr[i2] = paragraphFormat2 == null ? paragraphFormat : paragraphFormat2.m2203to(Presentation.f3062h4);
        }
        return paragraphFormatArr;
    }
}
