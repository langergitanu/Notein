package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14049c6;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphCollection extends DomObject<TextFrame> implements IParagraphCollection {

    /* JADX INFO: renamed from: du */
    private AbstractC14049c6<bjb> f2955du;

    /* JADX INFO: renamed from: m9 */
    private long f2956m9;

    /* JADX INFO: renamed from: to */
    private final List<IParagraph> f2957to;

    /* JADX INFO: renamed from: x1 */
    final AbstractC7018k4<AbstractC14049c6<bjb>> f2958x1;

    /* JADX INFO: renamed from: kk */
    private static final ParagraphFormat f2954kk = new ParagraphFormat(null);

    /* JADX INFO: renamed from: k4 */
    static final char[] f2953k4 = {ControlChar.PARAGRAPH_BREAK_CHAR};

    public ParagraphCollection(TextFrame textFrame) {
        super(textFrame);
        this.f2958x1 = new AbstractC7018k4<AbstractC14049c6<bjb>>() { // from class: com.aspose.slides.ParagraphCollection.1
            {
                ParagraphCollection.this.f2955du = new AbstractC14049c6<bjb>() { // from class: com.aspose.slides.ParagraphCollection.1.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14049c6
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public void mo1379k4(Object obj, bjb bjbVar) {
                        for (AbstractC14049c6 abstractC14049c6 : ((AbstractC7018k4) C05521.this).f19081x1) {
                            if (abstractC14049c6 != null) {
                                abstractC14049c6.mo1379k4(obj, bjbVar);
                            }
                        }
                    }
                };
            }
        };
        this.f2957to = new List<>();
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final int add(IParagraphCollection iParagraphCollection) {
        int count = getCount();
        if (iParagraphCollection.getCount() == 0) {
            return -1;
        }
        if (iParagraphCollection.getCount() == 1 && ((Paragraph) iParagraphCollection.get_Item(0)).m2168to().length() == 0) {
            return -1;
        }
        int count2 = ((iParagraphCollection.getCount() + this.f2957to.size()) & (-16)) + 16;
        if (count2 > this.f2957to.getCapacity()) {
            this.f2957to.setCapacity(count2);
        }
        IGenericEnumerator<IParagraph> it = iParagraphCollection.iterator();
        while (it.hasNext()) {
            try {
                Paragraph paragraph = new Paragraph((Paragraph) it.next());
                paragraph.m2164k4(this);
                this.f2957to.addItem(paragraph);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m2181x1();
        return count;
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void addFromHtml(String str) {
        addFromHtml(str, null, null);
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void clear() {
        List.Enumerator<IParagraph> it = this.f2957to.iterator();
        while (it.hasNext()) {
            try {
                ((Paragraph) it.next()).m2164k4((ParagraphCollection) null);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f2957to.clear();
        m2174kk(null);
        m2181x1();
    }

    public final boolean contains(IParagraph iParagraph) {
        return this.f2957to.containsItem(iParagraph);
    }

    public final void copyTo(IParagraph[] iParagraphArr, int i) {
        this.f2957to.copyToTArray(iParagraphArr, i);
    }

    /* JADX INFO: renamed from: du */
    public final String m2175du() {
        if (getCount() == 0) {
            return "";
        }
        C6765kp c6765kp = new C6765kp(((Paragraph) get_Item(0)).m2168to());
        for (int i = 1; i < getCount(); i++) {
            c6765kp.m26780k4(ControlChar.PARAGRAPH_BREAK_CHAR);
            c6765kp.m26792k4(((Paragraph) get_Item(i)).m2168to());
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final String exportToHtml(int i, int i2, ITextToHtmlConversionOptions iTextToHtmlConversionOptions) {
        C14321pz c14321pzM1086x1;
        if (iTextToHtmlConversionOptions == null) {
            iTextToHtmlConversionOptions = new TextToHtmlConversionOptions();
        }
        if (i < 0 || i >= getCount()) {
            throw new ArgumentOutOfRangeException("firstParagraphIndex");
        }
        if (i2 < 0 || i + i2 > getCount()) {
            throw new ArgumentOutOfRangeException("paragraphsCount");
        }
        C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
        try {
            v7f.m72086k4(c14047bzClone.Clone());
            Paragraph[] paragraphArr = new Paragraph[i2];
            IBaseSlide slide = getSlide();
            int textInheritanceLimit = iTextToHtmlConversionOptions.getTextInheritanceLimit();
            int i3 = 0;
            if (textInheritanceLimit != 0) {
                c14321pzM1086x1 = null;
                if (textInheritanceLimit == 1) {
                    ParagraphFormat[] paragraphFormatArr = new ParagraphFormat[9];
                    if (C7019kk.m27469x1(m2179kk().getParent_Immediate(), Cell.class)) {
                        c14321pzM1086x1 = ((ColorFormat) ((Cell) m2179kk().getParent_Immediate()).m464fa().m73908x1().m71662m9()).m1086x1(slide);
                        for (int i4 = 0; i4 < 9; i4++) {
                            paragraphFormatArr[i4] = (ParagraphFormat) m2179kk().getTextFrameFormat().getTextStyle().getLevel(i4);
                        }
                    } else if (C7019kk.m27469x1(m2179kk().getParent_Immediate(), AutoShape.class)) {
                        for (int i5 = 0; i5 < 9; i5++) {
                            paragraphFormatArr[i5] = (ParagraphFormat) m2179kk().getTextFrameFormat().getTextStyle().getLevel(i5);
                        }
                    }
                    ParagraphFormat paragraphFormat = (ParagraphFormat) m2179kk().getTextFrameFormat().getTextStyle().getDefaultParagraphFormat();
                    if (paragraphFormat == null) {
                        paragraphFormat = f2954kk;
                    }
                    for (int i6 = 0; i6 < 9; i6++) {
                        if (paragraphFormatArr[i6] == null) {
                            paragraphFormatArr[i6] = paragraphFormat;
                        }
                    }
                    while (i3 < i2) {
                        int i7 = i + i3;
                        paragraphArr[i3] = ((Paragraph) get_Item(i7)).m2160k4(paragraphFormatArr[((Paragraph) get_Item(i7)).getParagraphFormat().getDepth()]);
                        i3++;
                    }
                } else if (textInheritanceLimit == 2) {
                    while (i3 < i2) {
                        paragraphArr[i3] = ((Paragraph) get_Item(i + i3)).m2160k4(f2954kk);
                        i3++;
                    }
                }
            } else {
                IParagraphFormat[] iParagraphFormatArrM2907h4 = m2179kk().m2907h4();
                c14321pzM1086x1 = m2179kk().f3525x1;
                while (i3 < i2) {
                    int i8 = i + i3;
                    paragraphArr[i3] = ((Paragraph) get_Item(i8)).m2160k4(iParagraphFormatArrM2907h4[((Paragraph) get_Item(i8)).getParagraphFormat().getDepth()]);
                    i3++;
                }
            }
            String strM74750k4 = zqo.m74750k4(paragraphArr, (TextToHtmlConversionOptions) iTextToHtmlConversionOptions, (BaseSlide) slide, c14321pzM1086x1);
            v7f.m72089k4(c14047bzClone.Clone(), strM74750k4);
            return strM74750k4;
        } catch (RuntimeException e) {
            v7f.m72090x1(c14047bzClone.Clone());
            throw e;
        }
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final int getCount() {
        return this.f2957to.size();
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        return m2179kk().getPresentation();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return m2179kk().getSlide();
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final IParagraph get_Item(int i) {
        return this.f2957to.get_Item(i);
    }

    public final int indexOf(IParagraph iParagraph) {
        return this.f2957to.indexOf(iParagraph);
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void insert(int i, IParagraph iParagraph) {
        Paragraph paragraph = (Paragraph) iParagraph;
        if (paragraph.m2154ck() != null) {
            throw new PptxEditException("Cannot insert paragraph that is already added to another collection");
        }
        paragraph.m2164k4(this);
        this.f2957to.insertItem(i, iParagraph);
        m2181x1();
    }

    public final boolean isReadOnly() {
        return this.f2957to.isReadOnly();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IParagraph> iterator() {
        return this.f2957to.iterator();
    }

    public final IGenericEnumerator<IParagraph> iteratorJava() {
        return this.f2957to.iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m2176k4(Paragraph paragraph) {
        if (C14067j2.m66729x1(this, paragraph.m2154ck())) {
            return this.f2957to.indexOf(paragraph);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: kk */
    public final TextFrame m2179kk() {
        return (TextFrame) this.f2127h4;
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final boolean remove(IParagraph iParagraph) {
        int iIndexOf = this.f2957to.indexOf(iParagraph);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void removeAt(int i) {
        Paragraph paragraph = (Paragraph) this.f2957to.get_Item(i);
        paragraph.m2164k4((ParagraphCollection) null);
        this.f2957to.removeAt(i);
        m2174kk(paragraph);
        m2181x1();
    }

    /* JADX INFO: renamed from: to */
    public final long m2180to() {
        return this.f2956m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2181x1() {
        this.f2956m9++;
        m2179kk().f3519k4.m2941dq();
        m2179kk().m2932x1(true);
    }

    /* JADX INFO: renamed from: kk */
    private void m2174kk(Paragraph paragraph) {
        AbstractC14049c6<bjb> abstractC14049c6 = this.f2955du;
        if (abstractC14049c6 != null) {
            abstractC14049c6.mo1379k4(this, new bjb(paragraph));
        }
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void add(IParagraph iParagraph) {
        Paragraph paragraph = (Paragraph) iParagraph;
        if (paragraph.m2154ck() != null) {
            throw new PptxEditException("Cannot add paragraph that is already added to another collection");
        }
        paragraph.m2164k4(this);
        if (this.f2957to.size() > 0) {
            IParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
            IParagraphFormat paragraphFormat2 = m2179kk().getParagraphs().get_Item(this.f2957to.size() - 1).getParagraphFormat();
            if (paragraphFormat2.getBullet().getNumberedBulletStartWith() != -1 && paragraphFormat.getBullet().getNumberedBulletStartWith() == -1 && paragraphFormat2.getBullet().getType() == 2 && paragraphFormat.getBullet().getType() == 2) {
                paragraphFormat.getBullet().setNumberedBulletStartWith(paragraphFormat2.getBullet().getNumberedBulletStartWith());
            }
        }
        this.f2957to.addItem(paragraph);
        m2181x1();
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void addFromHtml(String str, IExternalResourceResolver iExternalResourceResolver, String str2) {
        new C14782xd(this, new C13845mp(iExternalResourceResolver), str2, false).m73321to(str);
    }

    @Override // com.aspose.slides.IParagraphCollection
    public final void insert(int i, IParagraphCollection iParagraphCollection) {
        if (iParagraphCollection.getCount() != 0) {
            if (iParagraphCollection.getCount() == 1 && ((Paragraph) iParagraphCollection.get_Item(0)).m2168to().length() == 0) {
                return;
            }
            this.f2957to.insertRange(i, ((ParagraphCollection) iParagraphCollection).f2957to);
            IGenericEnumerator<IParagraph> it = iParagraphCollection.iterator();
            while (it.hasNext()) {
                try {
                    Paragraph paragraph = new Paragraph((Paragraph) it.next());
                    paragraph.m2164k4(this);
                    int i2 = i + 1;
                    this.f2957to.set_Item(i, paragraph);
                    i = i2;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            m2181x1();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final IParagraph m2177k4() {
        Paragraph paragraph = new Paragraph();
        add(paragraph);
        return paragraph;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2182x1(Paragraph paragraph) {
        m2181x1();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[Catch: all -> 0x004b, LOOP:0: B:72:0x003b->B:15:0x0041, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x004b, blocks: (B:13:0x003b, B:15:0x0041), top: B:72:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[DONT_GENERATE] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2178k4(String str) {
        PortionFormat portionFormat;
        IPortionFormat endParagraphPortionFormat;
        List.Enumerator<IParagraph> it;
        Paragraph paragraph = null;
        if (getCount() > 0) {
            Paragraph paragraph2 = (Paragraph) get_Item(0);
            if (paragraph2.getPortions().getCount() > 0) {
                endParagraphPortionFormat = paragraph2.getPortions().get_Item(0).getPortionFormat();
            } else if (paragraph2.m2166kk() != null) {
                endParagraphPortionFormat = paragraph2.getEndParagraphPortionFormat();
            } else {
                portionFormat = null;
                it = this.f2957to.iterator();
                while (it.hasNext()) {
                    try {
                        ((Paragraph) it.next()).m2164k4((ParagraphCollection) null);
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                this.f2957to.clear();
                paragraph = paragraph2;
            }
            portionFormat = (PortionFormat) endParagraphPortionFormat;
            it = this.f2957to.iterator();
            while (it.hasNext()) {
            }
            this.f2957to.clear();
            paragraph = paragraph2;
        } else {
            portionFormat = null;
        }
        int i = 0;
        while (i < str.length()) {
            int iM67385k4 = C14113y2.m67385k4(str, f2953k4, i);
            if (iM67385k4 < 0) {
                iM67385k4 = str.length();
            }
            Paragraph paragraph3 = new Paragraph();
            paragraph3.getPortions().add(new Portion(C14113y2.m67443x1(str, i, iM67385k4 - i)));
            add(paragraph3);
            i = iM67385k4 + 1;
        }
        if (getCount() == 0) {
            add(new Paragraph());
            get_Item(0).getPortions().add(new Portion(""));
        }
        m2174kk(paragraph);
        if (paragraph != null) {
            IGenericEnumerator<IParagraph> it2 = iterator();
            while (it2.hasNext()) {
                try {
                    Paragraph paragraph4 = (Paragraph) it2.next();
                    paragraph4.m2171x1(paragraph);
                    if (portionFormat != null) {
                        IGenericEnumerator<IPortion> it3 = paragraph4.getPortions().iterator();
                        while (it3.hasNext()) {
                            try {
                                ((Portion) it3.next()).m2295x1().m361k4((BasePortionFormat) portionFormat);
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                    it3.dispose();
                                }
                                throw th;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                    }
                } catch (Throwable th2) {
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                    throw th2;
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
    }
}
