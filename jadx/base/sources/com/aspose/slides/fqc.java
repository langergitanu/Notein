package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class fqc extends AbstractC0858ck<ParagraphFormat, fqc> implements IParagraphFormatEffectiveData, InterfaceC1134g7 {

    /* JADX INFO: renamed from: u4 */
    static final fqc f5096u4 = m6268k4(lrb.m64515jd());

    /* JADX INFO: renamed from: uz */
    private static final fqc f5097uz = new fqc((ParagraphFormat) null, (lrb) null);

    /* JADX INFO: renamed from: c5 */
    byte f5098c5;

    /* JADX INFO: renamed from: ck */
    byte f5099ck;

    /* JADX INFO: renamed from: du */
    int f5100du;

    /* JADX INFO: renamed from: dy */
    float f5101dy;

    /* JADX INFO: renamed from: fa */
    byte f5102fa;

    /* JADX INFO: renamed from: h4 */
    float f5103h4;

    /* JADX INFO: renamed from: ix */
    final lrb f5104ix;

    /* JADX INFO: renamed from: jd */
    byte f5105jd;

    /* JADX INFO: renamed from: kk */
    C13750kw f5106kk;

    /* JADX INFO: renamed from: ks */
    float f5107ks;

    /* JADX INFO: renamed from: m9 */
    float f5108m9;

    /* JADX INFO: renamed from: ne */
    int f5109ne;

    /* JADX INFO: renamed from: rv */
    float f5110rv;

    /* JADX INFO: renamed from: to */
    short f5111to;

    /* JADX INFO: renamed from: up */
    float f5112up;

    /* JADX INFO: renamed from: x6 */
    SortedList<Double, eza> f5113x6;

    /* JADX INFO: renamed from: yj */
    float f5114yj;

    public fqc(ParagraphFormat paragraphFormat, fqc fqcVar, int i) {
        super(paragraphFormat);
        m6271h4();
        if (fqcVar == null) {
            this.f5104ix = new lrb(this);
            this.f5106kk = new C13750kw(this);
        } else {
            this.f5106kk = new C13750kw(this, fqcVar.f5106kk);
            m6274k4(fqcVar);
            this.f5104ix = new lrb(this, fqcVar.f5104ix);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static fqc m6263c5() {
        return m6268k4(lrb.m64513ck());
    }

    /* JADX INFO: renamed from: dy */
    public static fqc m6264dy() {
        return f5097uz;
    }

    /* JADX INFO: renamed from: jd */
    public static fqc m6265jd() {
        return m6268k4(lrb.m64514fa());
    }

    /* JADX INFO: renamed from: k4 */
    public static fqc m6266k4(ParagraphFormat paragraphFormat) {
        IPresentationComponent parent_IPresentationComponent = paragraphFormat.getParent_IPresentationComponent();
        if (parent_IPresentationComponent == null) {
            return f5096u4;
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, Paragraph.class)) {
            Paragraph paragraph = (Paragraph) parent_IPresentationComponent;
            return (fqc) ((TextStyle) paragraph.m2154ck().m2179kk().getTextFrameFormat().getTextStyle()).getEffective().getLevel(paragraph.getParagraphFormat().getDepth() > 0 ? paragraph.getParagraphFormat().getDepth() : (short) 0);
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, Field.class)) {
            return ((Field) parent_IPresentationComponent).m1446kk().m2282fa().m2161k4().m2200ks();
        }
        if (C7019kk.m27469x1(parent_IPresentationComponent, IFormattedTextContainer.class)) {
            return ((ParagraphFormat) ((IFormattedTextContainer) parent_IPresentationComponent).getTextFormat().getParagraphFormat()).m2200ks();
        }
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final int getAlignment() {
        return this.f5100du;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final IBulletFormatEffectiveData getBullet() {
        return this.f5106kk;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final IPortionFormatEffectiveData getDefaultPortionFormat() {
        return this.f5104ix;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getDefaultTabSize() {
        return this.f5110rv;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final short getDepth() {
        return this.f5111to;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final boolean getEastAsianLineBreak() {
        return this.f5098c5 == 1;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final int getFontAlignment() {
        return this.f5109ne;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final boolean getHangingPunctuation() {
        return this.f5102fa == 1;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getIndent() {
        return this.f5107ks;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final boolean getLatinLineBreak() {
        return this.f5099ck == 1;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getMarginLeft() {
        return this.f5112up;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getMarginRight() {
        return this.f5114yj;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final boolean getRightToLeft() {
        return this.f5105jd == 1;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getSpaceAfter() {
        return this.f5101dy;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getSpaceBefore() {
        return this.f5108m9;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final float getSpaceWithin() {
        if (m4601W_() == null) {
            return this.f5103h4;
        }
        Paragraph paragraph = (Paragraph) C7019kk.m27452k4((Object) m4601W_().getParent_ISlideComponent(), Paragraph.class);
        if (paragraph != null && this.f5103h4 >= 0.0f) {
            w0l w0lVarM2937b3 = paragraph.m2154ck().m2179kk().m2908jd().m2937b3();
            if (w0lVarM2937b3.getAutofitType() == 1) {
                return C3085sv.m13070k4(this.f5103h4 - (w0lVarM2937b3.m72611dy() * 100.0f), 0.0f, Float.POSITIVE_INFINITY);
            }
        }
        return this.f5103h4;
    }

    @Override // com.aspose.slides.IParagraphFormatEffectiveData
    public final ITabEffectiveData[] getTabs() {
        ITabEffectiveData[] iTabEffectiveDataArr = new ITabEffectiveData[this.f5113x6.size()];
        for (int i = 0; i < this.f5113x6.size(); i++) {
            iTabEffectiveDataArr[i] = this.f5113x6.getValues().get_Item(i);
        }
        return iTabEffectiveDataArr;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m6271h4() {
        this.f5111to = (short) -1;
        this.f5100du = -1;
        this.f5103h4 = Float.NaN;
        this.f5108m9 = Float.NaN;
        this.f5101dy = Float.NaN;
        this.f5098c5 = (byte) -1;
        this.f5105jd = (byte) -1;
        this.f5099ck = (byte) -1;
        this.f5102fa = (byte) -1;
        this.f5112up = Float.NaN;
        this.f5114yj = Float.NaN;
        this.f5107ks = Float.NaN;
        this.f5110rv = Float.NaN;
        this.f5113x6 = new SortedList<>();
        this.f5109ne = -1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m6276kk(ParagraphFormat paragraphFormat) {
        this.f5106kk.m64222x1(paragraphFormat.m2206x1());
        if (paragraphFormat.m2192h4() != -1) {
            this.f5111to = paragraphFormat.m2192h4();
        }
        if (paragraphFormat.getAlignment() != -1) {
            this.f5100du = paragraphFormat.getAlignment();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getSpaceWithin()), Float.valueOf(Float.NaN))) {
            this.f5103h4 = paragraphFormat.getSpaceWithin();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getSpaceBefore()), Float.valueOf(Float.NaN))) {
            this.f5108m9 = paragraphFormat.getSpaceBefore();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getSpaceAfter()), Float.valueOf(Float.NaN))) {
            this.f5101dy = paragraphFormat.getSpaceAfter();
        }
        if (paragraphFormat.getEastAsianLineBreak() != -1) {
            this.f5098c5 = paragraphFormat.getEastAsianLineBreak();
        }
        if (paragraphFormat.getRightToLeft() != -1) {
            this.f5105jd = paragraphFormat.getRightToLeft();
        }
        if (paragraphFormat.getLatinLineBreak() != -1) {
            this.f5099ck = paragraphFormat.getLatinLineBreak();
        }
        if (paragraphFormat.getHangingPunctuation() != -1) {
            this.f5102fa = paragraphFormat.getHangingPunctuation();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getMarginLeft()), Float.valueOf(Float.NaN))) {
            this.f5112up = paragraphFormat.getMarginLeft();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getMarginRight()), Float.valueOf(Float.NaN))) {
            this.f5114yj = paragraphFormat.getMarginRight();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getIndent()), Float.valueOf(Float.NaN))) {
            this.f5107ks = paragraphFormat.getIndent();
        }
        if (!C14067j2.m66728k4(Float.valueOf(paragraphFormat.getDefaultTabSize()), Float.valueOf(Float.NaN))) {
            this.f5110rv = paragraphFormat.getDefaultTabSize();
        }
        if (paragraphFormat.m2188ck() > 0) {
            this.f5113x6.clear();
            for (int i = 0; i < paragraphFormat.m2188ck(); i++) {
                eza ezaVar = new eza((Tab) paragraphFormat.getTabs().get_Item(i));
                this.f5113x6.addItem(Double.valueOf(ezaVar.getPosition()), ezaVar);
            }
        }
        if (paragraphFormat.getFontAlignment() != -1) {
            this.f5109ne = paragraphFormat.getFontAlignment();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final float m6277m9() {
        return this.f5103h4;
    }

    @Override // com.aspose.slides.InterfaceC1134g7
    /* JADX INFO: renamed from: x1 */
    public final short mo6278x1() {
        return this.f5111to;
    }

    public fqc(ParagraphFormat paragraphFormat, lrb lrbVar) {
        super(paragraphFormat);
        this.f5106kk = new C13750kw(this);
        m6271h4();
        this.f5104ix = lrbVar == null ? new lrb(this) : lrbVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static fqc m6267k4(ParagraphFormat paragraphFormat, fqc fqcVar) {
        return new fqc(paragraphFormat, fqcVar, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m6270x1(ParagraphFormat paragraphFormat) {
        Cell cellM2191fa;
        Paragraph paragraph = (Paragraph) C7019kk.m27452k4((Object) paragraphFormat.getParent_IPresentationComponent(), Paragraph.class);
        IFontsEffectiveData minor = null;
        GeometryShape geometryShape = paragraph == null ? null : (GeometryShape) C7019kk.m27452k4((Object) paragraph.m2154ck().m2179kk().getParent_Immediate(), GeometryShape.class);
        TextFrame textFrameM2179kk = paragraph == null ? null : paragraph.m2154ck().m2179kk();
        IParagraphFormat level = textFrameM2179kk == null ? null : textFrameM2179kk.getTextFrameFormat().getTextStyle().getLevel(paragraph.getParagraphFormat().getDepth());
        if (geometryShape != null && geometryShape.getShapeStyle() != null && level == null) {
            IShapeStyle shapeStyle = geometryShape.getShapeStyle();
            IThemeEffectiveData iThemeEffectiveDataCreateThemeEffective = paragraphFormat.getSlide().createThemeEffective();
            byte fontCollectionIndex = shapeStyle.getFontCollectionIndex();
            if (fontCollectionIndex == 1) {
                minor = iThemeEffectiveDataCreateThemeEffective.getFontScheme().getMinor();
            } else if (fontCollectionIndex == 2) {
                minor = iThemeEffectiveDataCreateThemeEffective.getFontScheme().getMajor();
            }
            if (minor != null) {
                return true;
            }
        }
        return (paragraphFormat.m2191fa() == null || (cellM2191fa = paragraphFormat.m2191fa()) == null || cellM2191fa.m464fa() == null || cellM2191fa.m464fa().m73908x1() == null) ? false : true;
    }

    public fqc(fz8 fz8Var, ParagraphFormat paragraphFormat) {
        super((InterfaceC14398rk) fz8Var);
        this.f5106kk = new C13750kw(this);
        m6271h4();
        this.f5104ix = new lrb(this, paragraphFormat.m2204to());
        m6276kk(paragraphFormat);
    }

    /* JADX INFO: renamed from: k4 */
    private static fqc m6268k4(lrb lrbVar) {
        fqc fqcVar = new fqc((ParagraphFormat) null, lrbVar);
        fqcVar.f5106kk = C13750kw.m64211h4();
        fqcVar.f5111to = (short) 0;
        fqcVar.f5100du = 0;
        fqcVar.f5103h4 = 100.0f;
        fqcVar.f5108m9 = 0.0f;
        fqcVar.f5101dy = 0.0f;
        fqcVar.f5098c5 = (byte) 0;
        fqcVar.f5105jd = (byte) 0;
        fqcVar.f5099ck = (byte) 0;
        fqcVar.f5102fa = (byte) 0;
        fqcVar.f5112up = 0.0f;
        fqcVar.f5114yj = 0.0f;
        fqcVar.f5107ks = 0.0f;
        fqcVar.f5110rv = 72.0f;
        fqcVar.f5109ne = 0;
        return fqcVar;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(fqc fqcVar) {
        Double d;
        Double d2;
        if (fqcVar == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, fqcVar)) {
            return true;
        }
        if (this.f5113x6.size() != fqcVar.f5113x6.size()) {
            return false;
        }
        IGenericEnumerator<Double> it = this.f5113x6.getKeys().iterator();
        do {
            try {
                boolean zHasNext = it.hasNext();
                Class cls = Double.TYPE;
                if (!zHasNext) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    it = fqcVar.f5113x6.getKeys().iterator();
                    do {
                        try {
                            if (!it.hasNext()) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                return this.f5106kk.mo4836k4(fqcVar.f5106kk) && this.f5111to == fqcVar.f5111to && this.f5100du == fqcVar.f5100du && this.f5103h4 == fqcVar.f5103h4 && this.f5108m9 == fqcVar.f5108m9 && this.f5101dy == fqcVar.f5101dy && this.f5098c5 == fqcVar.f5098c5 && this.f5105jd == fqcVar.f5105jd && this.f5099ck == fqcVar.f5099ck && this.f5102fa == fqcVar.f5102fa && this.f5112up == fqcVar.f5112up && this.f5114yj == fqcVar.f5114yj && this.f5107ks == fqcVar.f5107ks && this.f5110rv == fqcVar.f5110rv && this.f5109ne == fqcVar.f5109ne && this.f5104ix.mo4835k4(fqcVar.f5104ix);
                            }
                            d = (Double) C7019kk.m27464to(it.next(), cls);
                            d.doubleValue();
                            if (!this.f5113x6.containsKey(d)) {
                                break;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    } while (fqcVar.f5113x6.get_Item(d).mo4836k4(this.f5113x6.get_Item(d)));
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
                d2 = (Double) C7019kk.m27464to(it.next(), cls);
                d2.doubleValue();
                if (!fqcVar.f5113x6.containsKey(d2)) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        } while (this.f5113x6.get_Item(d2).mo4836k4(fqcVar.f5113x6.get_Item(d2)));
        return false;
    }

    public fqc(fz8 fz8Var, fqc fqcVar, int i) {
        super((InterfaceC14398rk) fz8Var);
        m6271h4();
        this.f5106kk = new C13750kw(this, fqcVar.f5106kk);
        m6274k4(fqcVar);
        this.f5104ix = new lrb(this, fqcVar.f5104ix);
    }

    @Override // com.aspose.slides.InterfaceC1134g7
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14271p9 mo6272k4() {
        return this.f5106kk;
    }

    public fqc(fz8 fz8Var, fqc fqcVar, ParagraphFormat paragraphFormat) {
        super((InterfaceC14398rk) fz8Var);
        m6271h4();
        this.f5106kk = new C13750kw(this, fqcVar.f5106kk);
        m6274k4(fqcVar);
        this.f5104ix = new lrb(this, fqcVar.f5104ix, paragraphFormat.m2204to());
        m6276kk(paragraphFormat);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo6273k4(IBaseSlide iBaseSlide) {
        this.f5106kk.mo6273k4(iBaseSlide);
        this.f5104ix.mo6273k4(iBaseSlide);
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4 */
    public void mo4833k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        this.f5106kk.mo4833k4(iBaseSlide, dm6Var);
        IGenericEnumerator<eza> it = this.f5113x6.getValues().iterator();
        while (it.hasNext()) {
            try {
                it.next().mo4833k4(iBaseSlide, dm6Var);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f5104ix.mo4833k4(iBaseSlide, dm6Var);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6274k4(fqc fqcVar) {
        this.f5111to = fqcVar.f5111to;
        this.f5100du = fqcVar.f5100du;
        this.f5103h4 = fqcVar.f5103h4;
        this.f5108m9 = fqcVar.f5108m9;
        this.f5101dy = fqcVar.f5101dy;
        this.f5098c5 = fqcVar.f5098c5;
        this.f5105jd = fqcVar.f5105jd;
        this.f5099ck = fqcVar.f5099ck;
        this.f5102fa = fqcVar.f5102fa;
        this.f5112up = fqcVar.f5112up;
        this.f5114yj = fqcVar.f5114yj;
        this.f5107ks = fqcVar.f5107ks;
        this.f5110rv = fqcVar.f5110rv;
        this.f5113x6.clear();
        IGenericEnumerator<KeyValuePair<Double, eza>> it = fqcVar.f5113x6.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<Double, eza> next = it.next();
                eza ezaVar = new eza();
                ezaVar.m5788k4((InterfaceC14672vc) next.getValue());
                this.f5113x6.addItem(Double.valueOf(ezaVar.getPosition()), ezaVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f5109ne = fqcVar.f5109ne;
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, ParagraphFormat paragraphFormat) {
        fqc fqcVar = (fqc) interfaceC14672vc;
        this.f5106kk.m64216k4((InterfaceC14672vc) fqcVar.f5106kk);
        m6274k4(fqcVar);
        this.f5104ix.m64524x1(fqcVar.f5104ix);
        IFontsEffectiveData[] iFontsEffectiveDataArr = {null};
        uc0[] uc0VarArr = {null};
        m6269k4(iFontsEffectiveDataArr, uc0VarArr);
        this.f5104ix.m64520k4(iFontsEffectiveDataArr[0], uc0VarArr[0]);
        this.f5104ix.m64523x1(paragraphFormat.m2204to());
        m6276kk(paragraphFormat);
        this.f5106kk.m64220kk(paragraphFormat.m2206x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m6269k4(IFontsEffectiveData[] iFontsEffectiveDataArr, uc0[] uc0VarArr) {
        Paragraph paragraph = (Paragraph) C7019kk.m27452k4((Object) m4601W_().getParent_IPresentationComponent(), Paragraph.class);
        GeometryShape geometryShape = paragraph == null ? null : (GeometryShape) C7019kk.m27452k4((Object) paragraph.m2154ck().m2179kk().getParent_Immediate(), GeometryShape.class);
        TextFrame textFrameM2179kk = paragraph == null ? null : paragraph.m2154ck().m2179kk();
        byte fontCollectionIndex = (geometryShape == null || geometryShape.getShapeStyle() == null || (textFrameM2179kk == null ? null : textFrameM2179kk.getTextFrameFormat().getTextStyle().getLevel(paragraph.getParagraphFormat().getDepth())) != null) ? (byte) 0 : geometryShape.getShapeStyle().getFontCollectionIndex();
        Cell cellM2191fa = m4601W_().m2191fa();
        uc0VarArr[0] = null;
        if (cellM2191fa != null && cellM2191fa.m464fa() != null) {
            uc0 uc0VarM73908x1 = cellM2191fa.m464fa().m73908x1();
            uc0VarArr[0] = uc0VarM73908x1;
            if (uc0VarM73908x1 != null) {
                fontCollectionIndex = uc0VarM73908x1.m71656h4();
            }
        }
        iFontsEffectiveDataArr[0] = null;
        if (fontCollectionIndex != 0) {
            IThemeEffectiveData iThemeEffectiveDataCreateThemeEffective = m4601W_().getSlide().createThemeEffective();
            if (fontCollectionIndex == 1) {
                iFontsEffectiveDataArr[0] = iThemeEffectiveDataCreateThemeEffective.getFontScheme().getMinor();
            } else {
                if (fontCollectionIndex != 2) {
                    return;
                }
                iFontsEffectiveDataArr[0] = iThemeEffectiveDataCreateThemeEffective.getFontScheme().getMajor();
            }
        }
    }
}
