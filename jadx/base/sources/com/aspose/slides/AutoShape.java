package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoShape extends GeometryShape implements IAutoShape {

    /* JADX INFO: renamed from: k4 */
    private boolean f221k4;

    /* JADX INFO: renamed from: kk */
    private boolean f222kk;

    /* JADX INFO: renamed from: x1 */
    private TextFrame f223x1;

    public AutoShape(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new C0880d4(), new AutoShapeLock());
        this.f221k4 = false;
        m2560k4(new C14863yw(this));
    }

    @Override // com.aspose.slides.IAutoShape
    public final ITextFrame addTextFrame(String str) {
        if (this.f223x1 == null) {
            this.f223x1 = new TextFrame(this);
        }
        ((ParagraphCollection) this.f223x1.getParagraphs()).m2178k4(str);
        return this.f223x1;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: c5 */
    public long mo275c5() {
        long j = this.f3307jd & 4294967295L;
        TextFrame textFrame = this.f223x1;
        return (j + ((textFrame != null ? textFrame.f3519k4.m2935ak() : 0L) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: ck */
    public final TextFrame m276ck() {
        if (this.f223x1 == null) {
            this.f223x1 = new TextFrame(this);
        }
        return this.f223x1;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: dy */
    public void mo277dy() {
        this.f3301ck = mo275c5();
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: fa */
    public boolean mo278fa() {
        if (super.mo278fa() || getShapeStyle() != null) {
            return true;
        }
        if ((getPlaceholder() != null && getPresentation().getSourceFormat() != 0 && (getPlaceholder().getType() == 2 || getPlaceholder().getType() == 3)) || getAutoShapeLock().getSizeLocked() || getAutoShapeLock().getShapeTypeLocked()) {
            return true;
        }
        if (m288x1() == null) {
            return false;
        }
        if (m288x1().m2902ck()) {
            return true;
        }
        return m288x1().m2908jd().m2957ks() == 1 && ((ThreeDFormat) getThreeDFormat()).m3003du();
    }

    @Override // com.aspose.slides.IAutoShape
    public final IAutoShapeLock getAutoShapeLock() {
        return (IAutoShapeLock) super.getShapeLock();
    }

    @Override // com.aspose.slides.Shape, com.aspose.slides.IShape
    public final IAutoShapeLock getShapeLock() {
        return (IAutoShapeLock) super.getShapeLock();
    }

    @Override // com.aspose.slides.IAutoShape
    public final ITextFrame getTextFrame() {
        return this.f223x1;
    }

    @Override // com.aspose.slides.IAutoShape
    public final boolean getUseBackgroundFill() {
        return this.f221k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final IFillFormat m279h4() {
        if (m2581um() == null) {
            return null;
        }
        return m2581um().getFillFormat();
    }

    @Override // com.aspose.slides.IAutoShape
    public final boolean isTextBox() {
        return this.f222kk;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        super.mo280jd();
        this.f223x1.f3519k4.m2974yd();
        IGenericEnumerator<IParagraph> it = this.f223x1.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                Paragraph paragraph = (Paragraph) it.next();
                paragraph.m2161k4().m2209yj();
                IGenericEnumerator<IPortion> it2 = paragraph.getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        ((Portion) it2.next()).m2295x1().m2313um();
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
        w0l w0lVarM2937b3 = this.f223x1.f3519k4.m2937b3();
        if (w0lVarM2937b3.getAutofitType() == 1) {
            this.f223x1.f3519k4.m2950k4(w0lVarM2937b3.getAutofitType());
            ((C14863yw) m2546bz()).m74117x1();
            if (this.f223x1.f3519k4.m2940ck() == 1.0f || this.f223x1.f3519k4.m2946fa() == 0.0f) {
                this.f223x1.f3519k4.m2974yd();
            }
        }
    }

    @Override // com.aspose.slides.GeometryShape
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0880d4 mo272to() {
        return (C0880d4) super.mo272to();
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m285kk() {
        if (m288x1() != null && m288x1().getParagraphs().getCount() > 0) {
            IParagraph iParagraph = m288x1().getParagraphs().get_Item(0);
            if (iParagraph.getPortions().getCount() > 0 && iParagraph.getPortions().get_Item(0).getField() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m9 */
    public final Shape m286m9() {
        AutoShape autoShape = new AutoShape(this);
        autoShape.m2568kk(m2584wp());
        autoShape.setFrame(getFrame());
        autoShape.getFillFormat().setFillType((byte) 0);
        autoShape.addTextFrame(" ");
        autoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 0);
        m2558k4(autoShape);
        return m2581um();
    }

    @Override // com.aspose.slides.IAutoShape
    public final void setUseBackgroundFill(boolean z) {
        this.f221k4 = z;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m287up() {
        TextFrame textFrame = this.f223x1;
        if (textFrame == null) {
            return false;
        }
        return textFrame.m2906fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final TextFrame m288x1() {
        return this.f223x1;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo282k4(float f, float f2, float f3) {
        if (getTextFrame() == null) {
            super.mo282k4(f, f2, f3);
            return;
        }
        Shape[] shapeArrM2547c6 = m2547c6();
        TextFrameFormat textFrameFormat = (TextFrameFormat) getTextFrame().getTextFrameFormat();
        textFrameFormat.m2959m9().m2983k4(f3);
        if (C7019kk.m27469x1(getSlide(), Slide.class) && (shapeArrM2547c6.length == 0 || textFrameFormat.m2955k4(m274k4(shapeArrM2547c6)))) {
            textFrameFormat.m2953k4(xmh.m73494k4(textFrameFormat.m2963to(), f3).Clone());
        }
        IGenericEnumerator<IPortion> it = getTextFrame().getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                Paragraph paragraph = (Paragraph) it.next();
                paragraph.m2161k4().m2194k4(f3);
                if (paragraph.getEndParagraphPortionFormat() != null) {
                    ((PortionFormat) paragraph.getEndParagraphPortionFormat()).m2306k4(f3);
                }
                if (!C14064he.m66715kk(paragraph.getParagraphFormat().getSpaceWithin()) && paragraph.getParagraphFormat().getSpaceWithin() < 0.0f) {
                    paragraph.getParagraphFormat().setSpaceWithin(paragraph.getParagraphFormat().getSpaceWithin() * f3);
                }
                it = paragraph.getPortions().iterator();
                while (it.hasNext()) {
                    try {
                        Portion portion = (Portion) it.next();
                        portion.m2295x1().m2306k4(f3);
                        if (C7019kk.m27469x1(getSlide(), Slide.class) && C14064he.m66715kk(portion.m2295x1().getFontHeight()) && shapeArrM2547c6.length == 0) {
                            portion.m2295x1().setFontHeight(portion.m2295x1().m2305bv().m4837m9());
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
        super.mo282k4(f, f2, f3);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m289x1(TextFrame textFrame) {
        m2546bz().mo5640kk();
        ((TextFrameFormat) textFrame.getTextFrameFormat()).m2953k4(this.f223x1.m2909k4(this).Clone().m69114k4().Clone());
        Shape[] shapeArrM2547c6 = m2547c6();
        TextFrame[] textFrameArr = shapeArrM2547c6.length == 0 ? null : new TextFrame[shapeArrM2547c6.length];
        for (int i = 0; i < shapeArrM2547c6.length; i++) {
            GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shapeArrM2547c6[i], GeometryShape.class);
            if (geometryShape != null) {
                TextFrame textFrameM288x1 = C7019kk.m27469x1(geometryShape, AutoShape.class) ? ((AutoShape) geometryShape).m288x1() : C7019kk.m27469x1(geometryShape, SmartArtShape.class) ? ((SmartArtShape) geometryShape).m2820kk() : null;
                if (textFrameM288x1 != null) {
                    textFrameArr[i] = textFrameM288x1;
                }
            }
        }
        this.f223x1.m2921k4(textFrameArr, textFrame);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m283k4(TextFrame textFrame) {
        this.f223x1 = textFrame;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m284k4(boolean z) {
        this.f222kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    private ITextFrameFormat[] m274k4(Shape[] shapeArr) {
        ITextFrameFormat[] iTextFrameFormatArr = new ITextFrameFormat[shapeArr.length];
        for (int i = 0; i < shapeArr.length; i++) {
            AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) shapeArr[i], AutoShape.class);
            if (autoShape != null) {
                iTextFrameFormatArr[i] = autoShape.getTextFrame().getTextFrameFormat();
            }
        }
        return iTextFrameFormatArr;
    }
}
