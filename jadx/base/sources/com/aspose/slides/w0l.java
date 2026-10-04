package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: loaded from: classes3.dex */
class w0l extends AbstractC0858ck<TextFrameFormat, w0l> implements ITextFrameFormatEffectiveData {

    /* JADX INFO: renamed from: kk */
    static final w0l f49730kk = m72608up();

    /* JADX INFO: renamed from: ar */
    private byte f49731ar;

    /* JADX INFO: renamed from: bv */
    private byte f49732bv;

    /* JADX INFO: renamed from: c5 */
    private byte f49733c5;

    /* JADX INFO: renamed from: ck */
    private byte f49734ck;

    /* JADX INFO: renamed from: du */
    private double f49735du;

    /* JADX INFO: renamed from: dy */
    private byte f49736dy;

    /* JADX INFO: renamed from: fa */
    private byte f49737fa;

    /* JADX INFO: renamed from: h4 */
    private double f49738h4;

    /* JADX INFO: renamed from: ix */
    private float f49739ix;

    /* JADX INFO: renamed from: jd */
    private byte f49740jd;

    /* JADX INFO: renamed from: ks */
    private byte f49741ks;

    /* JADX INFO: renamed from: m9 */
    private double f49742m9;

    /* JADX INFO: renamed from: ne */
    private f3b f49743ne;

    /* JADX INFO: renamed from: qq */
    private byte f49744qq;

    /* JADX INFO: renamed from: rv */
    private float f49745rv;

    /* JADX INFO: renamed from: to */
    private double f49746to;

    /* JADX INFO: renamed from: u4 */
    private float f49747u4;

    /* JADX INFO: renamed from: um */
    private byte f49748um;

    /* JADX INFO: renamed from: up */
    private int f49749up;

    /* JADX INFO: renamed from: uz */
    private byte f49750uz;

    /* JADX INFO: renamed from: v4 */
    private boolean f49751v4;

    /* JADX INFO: renamed from: wl */
    private byte f49752wl;

    /* JADX INFO: renamed from: x6 */
    private byte f49753x6;

    /* JADX INFO: renamed from: yj */
    private double f49754yj;

    public w0l(TextFrameFormat textFrameFormat) {
        super(textFrameFormat);
        this.f49746to = Double.NaN;
        this.f49735du = Double.NaN;
        this.f49738h4 = Double.NaN;
        this.f49742m9 = Double.NaN;
        this.f49736dy = (byte) -1;
        this.f49733c5 = (byte) -1;
        this.f49740jd = (byte) -1;
        this.f49734ck = (byte) -1;
        this.f49737fa = (byte) -1;
        this.f49749up = 0;
        this.f49754yj = Double.NaN;
        this.f49741ks = (byte) -1;
        this.f49745rv = Float.NaN;
        this.f49753x6 = (byte) -1;
        this.f49743ne = new f3b();
        this.f49739ix = Float.NaN;
        this.f49747u4 = Float.NaN;
        this.f49750uz = (byte) -1;
        this.f49752wl = (byte) -1;
        this.f49744qq = (byte) -1;
        this.f49731ar = (byte) -1;
        this.f49748um = (byte) -1;
        this.f49732bv = (byte) -1;
        this.f49751v4 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public static w0l m72606k4(TextFrameFormat textFrameFormat) {
        TextFrameFormat textFrameFormat2;
        IPresentationComponent parent_IPresentationComponent = textFrameFormat.getParent_IPresentationComponent();
        if (!C7019kk.m27469x1(parent_IPresentationComponent, TextFrame.class)) {
            if (C7019kk.m27469x1(parent_IPresentationComponent, IFormattedTextContainer.class)) {
                throw new NotImplementedException();
            }
            if (parent_IPresentationComponent == null) {
                throw new Exception("textFrameFormatParent must not be null");
            }
            throw new NotImplementedException();
        }
        TextFrame textFrame = (TextFrame) parent_IPresentationComponent;
        TextFrame textFrameM2820kk = null;
        if (C7019kk.m27469x1(textFrame.getParent_Immediate(), GeometryShape.class)) {
            GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) ((GeometryShape) textFrame.getParent_Immediate()).getBasePlaceholder(), GeometryShape.class);
            if (geometryShape == null) {
                return f49730kk;
            }
            if (C7019kk.m27469x1(geometryShape, AutoShape.class)) {
                textFrameM2820kk = ((AutoShape) geometryShape).m288x1();
            } else if (C7019kk.m27469x1(geometryShape, SmartArtShape.class)) {
                textFrameM2820kk = ((SmartArtShape) geometryShape).m2820kk();
            }
            if (textFrameM2820kk == null) {
                return f49730kk;
            }
            textFrameFormat2 = textFrameM2820kk.f3519k4;
        } else {
            if (C7019kk.m27469x1(textFrame.getParent_Immediate(), Cell.class)) {
                return f49730kk;
            }
            if (!C7019kk.m27469x1(textFrame.getParent_Immediate(), IOverridableText.class)) {
                return null;
            }
            textFrameFormat2 = (TextFrameFormat) ((IOverridableText) textFrame.getParent_Immediate()).getTextFormat().getTextBlockFormat();
        }
        return textFrameFormat2.m2937b3();
    }

    /* JADX INFO: renamed from: up */
    private static w0l m72608up() {
        w0l w0lVar = new w0l(null);
        w0lVar.f49751v4 = true;
        w0lVar.f49746to = 7.2d;
        w0lVar.f49735du = 7.2d;
        w0lVar.f49738h4 = 3.6d;
        w0lVar.f49742m9 = 3.6d;
        w0lVar.f49736dy = (byte) 1;
        w0lVar.f49733c5 = (byte) 0;
        w0lVar.f49740jd = (byte) 0;
        w0lVar.f49734ck = (byte) 0;
        w0lVar.f49737fa = (byte) 0;
        w0lVar.f49749up = 1;
        w0lVar.f49754yj = 0.0d;
        w0lVar.f49741ks = (byte) 0;
        w0lVar.f49745rv = 0.0f;
        w0lVar.f49753x6 = (byte) 0;
        w0lVar.f49743ne.f4960k4 = (byte) 0;
        w0lVar.f49739ix = 1.0f;
        w0lVar.f49747u4 = 0.0f;
        w0lVar.f49750uz = (byte) 0;
        w0lVar.f49752wl = (byte) 0;
        w0lVar.f49744qq = (byte) 0;
        w0lVar.f49731ar = (byte) 0;
        w0lVar.f49748um = (byte) 0;
        w0lVar.f49732bv = (byte) 0;
        return w0lVar;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m72609c5() {
        return this.f49750uz == 1;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m72610ck() {
        return this.f49744qq == 1;
    }

    /* JADX INFO: renamed from: dy */
    public final float m72611dy() {
        return this.f49747u4;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m72612fa() {
        return this.f49732bv == 1;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final byte getAnchoringType() {
        return this.f49733c5;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final byte getAutofitType() {
        return this.f49737fa;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final boolean getCenterText() {
        return this.f49740jd == 1;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final int getColumnCount() {
        return this.f49749up;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final float getColumnSpacing() {
        return (float) this.f49754yj;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final double getMarginBottom() {
        return this.f49742m9;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final double getMarginLeft() {
        return this.f49746to;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final double getMarginRight() {
        return this.f49735du;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final double getMarginTop() {
        return this.f49738h4;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final ITextStyleEffectiveData getTextStyle() {
        if (this.f49751v4) {
            return null;
        }
        return m4601W_().m2959m9().getEffective();
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final byte getTextVerticalType() {
        return this.f49734ck;
    }

    @Override // com.aspose.slides.ITextFrameFormatEffectiveData
    public final boolean getWrapText() {
        return this.f49736dy == 1;
    }

    /* JADX INFO: renamed from: h4 */
    public final f3b m72613h4() {
        return this.f49743ne;
    }

    /* JADX INFO: renamed from: jd */
    public final byte m72614jd() {
        return this.f49752wl;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m72618m9() {
        return this.f49739ix;
    }

    /* JADX INFO: renamed from: k4 */
    public static w0l m72607k4(TextFrameFormat textFrameFormat, w0l w0lVar) {
        w0l w0lVar2 = new w0l(textFrameFormat);
        if (w0lVar != null) {
            w0lVar2.m72615k4((InterfaceC14672vc) w0lVar);
        }
        return w0lVar2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72615k4(InterfaceC14672vc interfaceC14672vc) {
        w0l w0lVar = (w0l) interfaceC14672vc;
        this.f49746to = w0lVar.f49746to;
        this.f49735du = w0lVar.f49735du;
        this.f49738h4 = w0lVar.f49738h4;
        this.f49742m9 = w0lVar.f49742m9;
        this.f49736dy = w0lVar.f49736dy;
        this.f49733c5 = w0lVar.f49733c5;
        this.f49740jd = w0lVar.f49740jd;
        this.f49734ck = w0lVar.f49734ck;
        this.f49737fa = w0lVar.f49737fa;
        this.f49749up = w0lVar.f49749up;
        this.f49754yj = w0lVar.f49754yj;
        this.f49741ks = w0lVar.f49741ks;
        this.f49745rv = w0lVar.f49745rv;
        this.f49753x6 = w0lVar.f49753x6;
        this.f49743ne.m5817k4((InterfaceC14672vc) w0lVar.f49743ne);
        this.f49739ix = w0lVar.f49739ix;
        this.f49747u4 = w0lVar.f49747u4;
        this.f49750uz = w0lVar.f49750uz;
        this.f49752wl = w0lVar.f49752wl;
        this.f49744qq = w0lVar.f49744qq;
        this.f49731ar = w0lVar.f49731ar;
        this.f49748um = w0lVar.f49748um;
        this.f49732bv = w0lVar.f49732bv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo4883k4(InterfaceC14672vc interfaceC14672vc, TextFrameFormat textFrameFormat) {
        boolean anchorCenter;
        m72615k4(interfaceC14672vc);
        TextFrame textFrame = (TextFrame) C7019kk.m27452k4((Object) textFrameFormat.getParent_Immediate(), TextFrame.class);
        Cell cell = textFrame != null ? (Cell) C7019kk.m27452k4((Object) textFrame.getParent_Immediate(), Cell.class) : null;
        if (!C14067j2.m66728k4(Double.valueOf(textFrameFormat.getMarginLeft()), Double.valueOf(Double.NaN))) {
            this.f49746to = textFrameFormat.getMarginLeft();
        }
        if (!C14067j2.m66728k4(Double.valueOf(textFrameFormat.getMarginRight()), Double.valueOf(Double.NaN))) {
            this.f49735du = textFrameFormat.getMarginRight();
        }
        if (!C14067j2.m66728k4(Double.valueOf(textFrameFormat.getMarginTop()), Double.valueOf(Double.NaN))) {
            this.f49738h4 = textFrameFormat.getMarginTop();
        }
        if (!C14067j2.m66728k4(Double.valueOf(textFrameFormat.getMarginBottom()), Double.valueOf(Double.NaN))) {
            this.f49742m9 = textFrameFormat.getMarginBottom();
        }
        if (textFrameFormat.getWrapText() != -1) {
            this.f49736dy = textFrameFormat.getWrapText();
        }
        if (textFrameFormat.getAnchoringType() != -1) {
            this.f49733c5 = textFrameFormat.getAnchoringType();
        }
        if (cell != null && cell.getTextAnchorType() != -1) {
            this.f49733c5 = cell.getTextAnchorType();
        }
        if (textFrameFormat.getCenterText() != -1) {
            this.f49740jd = textFrameFormat.getCenterText();
        }
        if (cell != null && (anchorCenter = cell.getAnchorCenter()) != -1) {
            this.f49740jd = anchorCenter ? (byte) 1 : (byte) 0;
        }
        if (textFrameFormat.getTextVerticalType() != -1) {
            this.f49734ck = textFrameFormat.getTextVerticalType();
        }
        if (textFrameFormat.getAutofitType() != -1) {
            this.f49737fa = textFrameFormat.getAutofitType();
        }
        if (textFrameFormat.getColumnCount() != 0) {
            this.f49749up = textFrameFormat.getColumnCount();
        }
        if (!C14067j2.m66728k4(Double.valueOf(textFrameFormat.getColumnSpacing()), Double.valueOf(Double.NaN))) {
            this.f49754yj = textFrameFormat.getColumnSpacing();
        }
        if (textFrameFormat.m2939c5() != -1) {
            this.f49741ks = textFrameFormat.m2939c5();
        }
        if (!C14067j2.m66728k4(Float.valueOf(textFrameFormat.getRotationAngle()), Float.valueOf(Float.NaN))) {
            this.f49745rv = textFrameFormat.getRotationAngle();
        }
        if (textFrameFormat.m2949jd() != -1) {
            this.f49753x6 = textFrameFormat.m2949jd();
        }
        this.f49743ne.m5816k4(textFrameFormat.m2944dy());
        if (!C14067j2.m66728k4(Float.valueOf(textFrameFormat.m2940ck()), Float.valueOf(Float.NaN))) {
            this.f49739ix = textFrameFormat.m2940ck();
        }
        if (!C14067j2.m66728k4(Float.valueOf(textFrameFormat.m2946fa()), Float.valueOf(Float.NaN))) {
            this.f49747u4 = textFrameFormat.m2946fa();
        }
        if (textFrameFormat.m2966up() != -1) {
            this.f49750uz = textFrameFormat.m2966up();
        }
        if (textFrameFormat.m2975yj() != -1) {
            this.f49752wl = textFrameFormat.m2975yj();
        }
        if (textFrameFormat.m2957ks() != -1) {
            this.f49744qq = textFrameFormat.m2957ks();
        }
        if (textFrameFormat.m2962rv() != -1) {
            this.f49731ar = textFrameFormat.m2962rv();
        }
        this.f49748um = !textFrameFormat.m2973x6() ? (byte) 1 : (byte) 0;
        if (textFrameFormat.m2961ne() != -1) {
            this.f49732bv = textFrameFormat.m2961ne();
        }
    }

    @Override // com.aspose.slides.AbstractC1137ga
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo4836k4(w0l w0lVar) {
        if (w0lVar == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, w0lVar)) {
            return true;
        }
        return this.f49746to == w0lVar.f49746to && this.f49735du == w0lVar.f49735du && this.f49738h4 == w0lVar.f49738h4 && this.f49742m9 == w0lVar.f49742m9 && this.f49736dy == w0lVar.f49736dy && this.f49733c5 == w0lVar.f49733c5 && this.f49740jd == w0lVar.f49740jd && this.f49734ck == w0lVar.f49734ck && this.f49737fa == w0lVar.f49737fa && this.f49749up == w0lVar.f49749up && this.f49754yj == w0lVar.f49754yj && this.f49741ks == w0lVar.f49741ks && this.f49745rv == w0lVar.f49745rv && this.f49753x6 == w0lVar.f49753x6 && this.f49743ne.mo4836k4(w0lVar.f49743ne) && this.f49739ix == w0lVar.f49739ix && this.f49747u4 == w0lVar.f49747u4 && this.f49750uz == w0lVar.f49750uz && this.f49752wl == w0lVar.f49752wl && this.f49744qq == w0lVar.f49744qq && this.f49731ar == w0lVar.f49731ar && this.f49748um == w0lVar.f49748um && this.f49732bv == w0lVar.f49732bv;
    }
}
