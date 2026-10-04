package com.aspose.slides;

import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p172hu.AbstractC4682du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public final class TextFrameFormat extends PVIObject implements IChartTextBlockFormat, ITextFrameFormat {

    /* JADX INFO: renamed from: c5 */
    private rm1 f3529c5;

    /* JADX INFO: renamed from: ck */
    private w0l f3530ck;

    /* JADX INFO: renamed from: du */
    private int f3531du;

    /* JADX INFO: renamed from: dy */
    private ktk f3532dy;

    /* JADX INFO: renamed from: h4 */
    private TextStyle f3533h4;

    /* JADX INFO: renamed from: jd */
    private ThreeDFormat f3534jd;

    /* JADX INFO: renamed from: k4 */
    final ParagraphFormat.AbstractC0555k4 f3535k4;

    /* JADX INFO: renamed from: kk */
    AbstractC0653k4 f3536kk;

    /* JADX INFO: renamed from: m9 */
    private kp9 f3537m9;

    /* JADX INFO: renamed from: to */
    long f3538to;

    /* JADX INFO: renamed from: x1 */
    static final AbstractC4682du<TextFrameFormat, w0l, w0l> f3528x1 = new AbstractC4682du<TextFrameFormat, w0l, w0l>() { // from class: com.aspose.slides.TextFrameFormat.2
        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
        public String getDelegateId() {
            return "Aspose.Slides.TextFrameFormatEffectiveData.CreateEmpty(Aspose.Slides.TextFrameFormat,Aspose.Slides.TextFrameFormatEffectiveData)";
        }

        @Override // com.aspose.slides.internal.p172hu.AbstractC4682du
        /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public w0l mo445k4(TextFrameFormat textFrameFormat, w0l w0lVar) {
            return w0l.m72607k4(textFrameFormat, w0lVar);
        }
    };

    /* JADX INFO: renamed from: fa */
    private static final w0l f3527fa = w0l.f49730kk;

    /* JADX INFO: renamed from: com.aspose.slides.TextFrameFormat$k4 */
    public static abstract class AbstractC0653k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo481k4();
    }

    public TextFrameFormat() {
        super(null);
        this.f3535k4 = new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.TextFrameFormat.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.TextFrameFormat.OnParentPropertiesChanded(Aspose.Slides.ParagraphFormat)";
            }
        };
        this.f3538to = 0L;
        this.f3531du = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static xmh m2933k4(ITextFrameFormat iTextFrameFormat) {
        if (C7019kk.m27469x1(iTextFrameFormat, TextFrameFormat.class)) {
            return ((TextFrameFormat) C7019kk.m27452k4((Object) iTextFrameFormat, TextFrameFormat.class)).m2963to();
        }
        xmh xmhVar = new xmh();
        xmhVar.f50160x1 = iTextFrameFormat.getMarginLeft();
        xmhVar.f50158kk = iTextFrameFormat.getMarginTop();
        xmhVar.f50159to = iTextFrameFormat.getMarginRight();
        xmhVar.f50157du = iTextFrameFormat.getMarginBottom();
        return xmhVar;
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new i5k(this.f3533h4, this.f3534jd, this.f3537m9, this.f3532dy, this.f3529c5);
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: N_ */
    public void mo334N_() {
        this.f3534jd = new ThreeDFormat(this);
        this.f3533h4 = new TextStyle(this);
        this.f3537m9 = new kp9(this);
        this.f3532dy = new ktk(this);
        this.f3529c5 = new rm1(this);
        if (getParent_IPresentationComponent() == null || getParent_IPresentationComponent().getPresentation() == null) {
            return;
        }
        this.f3533h4.f3547k4.mo27432x1(this.f3535k4);
        ((TextStyle) ((Presentation) getParent_IPresentationComponent().getPresentation()).getDefaultTextStyle()).f3547k4.mo27432x1(this.f3535k4);
    }

    /* JADX INFO: renamed from: ak */
    public final long m2935ak() {
        return ((((this.f3538to & 4294967295L) + (((getParent_IPresentationComponent() == null || !C7019kk.m27469x1(getParent_IPresentationComponent(), Shape.class)) ? 0L : ((Shape) getParent_IPresentationComponent()).f3307jd) & 4294967295L)) & 4294967295L) + (((long) m2967v4()) & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: ar */
    public final boolean m2936ar() {
        if (m2138ix()) {
            return m2969x1().m7524wy();
        }
        return false;
    }

    /* JADX INFO: renamed from: b3 */
    public final w0l m2937b3() {
        w0l[] w0lVarArr = {this.f3530ck};
        w0l w0lVar = (w0l) AbstractC0858ck.m4598k4(w0l.class, w0lVarArr, this, f3528x1);
        w0l w0lVar2 = w0lVarArr[0];
        this.f3530ck = w0lVar2;
        if (w0lVar2 != null) {
            w0lVar2.m4604k4(w0l.class);
        }
        return w0lVar;
    }

    /* JADX INFO: renamed from: bv */
    public final void m2938bv() {
        m2145uz();
        m2969x1().m7481c6();
    }

    /* JADX INFO: renamed from: c5 */
    public final byte m2939c5() {
        if (m2138ix()) {
            return m2969x1().m7517u4();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: ck */
    public final float m2940ck() {
        if (m2138ix()) {
            return m2969x1().m7513qq();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: dq */
    public final void m2941dq() {
        this.f3538to++;
        AbstractC0653k4 abstractC0653k4 = this.f3536kk;
        if (abstractC0653k4 != null) {
            abstractC0653k4.mo481k4();
        }
    }

    /* JADX INFO: renamed from: du */
    public final ktk m2942du() {
        m2146wl();
        return this.f3532dy;
    }

    /* JADX INFO: renamed from: dy */
    public final kp9 m2944dy() {
        m2146wl();
        return this.f3537m9;
    }

    /* JADX INFO: renamed from: fa */
    public final float m2946fa() {
        if (m2138ix()) {
            return m2969x1().m7476ar();
        }
        return Float.NaN;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final byte getAnchoringType() {
        if (m2138ix()) {
            return m2969x1().m7479c5();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final byte getAutofitType() {
        if (m2138ix()) {
            return m2969x1().m7519up();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final byte getCenterText() {
        if (m2138ix()) {
            return m2969x1().m7482ck();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final int getColumnCount() {
        if (m2138ix()) {
            return m2969x1().m7532yj();
        }
        return 0;
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final double getColumnSpacing() {
        if (m2138ix()) {
            return m2969x1().m7508ks();
        }
        return Double.NaN;
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final ITextFrameFormatEffectiveData getEffective() {
        return m2937b3();
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final boolean getKeepTextFlat() {
        if (m2138ix()) {
            return m2969x1().m7504k4();
        }
        return false;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final double getMarginBottom() {
        return m2963to().f50157du;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final double getMarginLeft() {
        return m2963to().f50160x1;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final double getMarginRight() {
        return m2963to().f50159to;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final double getMarginTop() {
        return m2963to().f50158kk;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final float getRotationAngle() {
        if (m2138ix()) {
            return m2969x1().m7514rv();
        }
        return Float.NaN;
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final ITextStyle getTextStyle() {
        return m2959m9();
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final byte getTextVerticalType() {
        if (m2138ix()) {
            return m2969x1().m7489fa();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final IThreeDFormat getThreeDFormat() {
        m2146wl();
        return this.f3534jd;
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final byte getTransform() {
        if (m2138ix()) {
            return m2969x1().m7494jd();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2969x1().m7530xk();
        }
        return 1L;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final byte getWrapText() {
        if (m2138ix()) {
            return m2969x1().m7487dy();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: h4 */
    public final rm1 m2947h4() {
        m2146wl();
        return this.f3529c5;
    }

    /* JADX INFO: renamed from: jd */
    public final byte m2949jd() {
        if (m2138ix()) {
            return m2969x1().m7521uz();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m2956kk(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7480c5(b);
        }
    }

    /* JADX INFO: renamed from: ks */
    public final byte m2957ks() {
        if (m2138ix()) {
            return m2969x1().m7522v4();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: lr */
    public final byte m2958lr() {
        AutoShape autoShape;
        if (getTextVerticalType() == -1) {
            ISlideComponent iSlideComponent = (ISlideComponent) C7019kk.m27452k4((Object) getParent_IPresentationComponent(), ISlideComponent.class);
            BaseSlide baseSlide = iSlideComponent != null ? (BaseSlide) iSlideComponent.getSlide() : null;
            TextFrame textFrame = (TextFrame) C7019kk.m27452k4((Object) getParent_Immediate(), TextFrame.class);
            Shape shape = textFrame != null ? (Shape) C7019kk.m27452k4((Object) textFrame.getParent_Immediate(), Shape.class) : null;
            if (baseSlide != null && shape != null && shape.getPlaceholder() != null) {
                Shape[] shapeArrMo399k4 = baseSlide.mo399k4(shape.getPlaceholder());
                if (shapeArrMo399k4.length > 0 && (autoShape = (AutoShape) C7019kk.m27452k4((Object) shapeArrMo399k4[0], AutoShape.class)) != null && autoShape.getTextFrame() != null) {
                    return ((TextFrameFormat) autoShape.getTextFrame().getTextFrameFormat()).m2958lr();
                }
            }
        }
        return getTextVerticalType();
    }

    /* JADX INFO: renamed from: m9 */
    public final TextStyle m2959m9() {
        m2146wl();
        return this.f3533h4;
    }

    /* JADX INFO: renamed from: ne */
    public final byte m2961ne() {
        if (m2138ix()) {
            return m2969x1().m7477b3();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: rv */
    public final byte m2962rv() {
        if (m2138ix()) {
            return m2969x1().m7509lr();
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setAnchoringType(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7526x1(b);
            m2941dq();
        }
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setAutofitType(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7492h4(b);
            m2941dq();
        }
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setCenterText(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7516to(b);
            m2941dq();
        }
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final void setColumnCount(int i) {
        if (i < 0) {
            i = 0;
        }
        m2141k4((Integer) 0, Integer.valueOf(i));
        if (m2138ix()) {
            m2969x1().m7499k4(i);
            m2941dq();
        }
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final void setColumnSpacing(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        m2141k4(Double.valueOf(Double.NaN), Double.valueOf(d));
        if (m2138ix()) {
            m2969x1().m7497k4(d);
            m2941dq();
        }
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final void setKeepTextFlat(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m2969x1().m7503k4(z);
        }
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setMarginBottom(double d) {
        xmh xmhVarClone = m2963to().Clone();
        xmhVarClone.f50157du = d;
        m2953k4(xmhVarClone.Clone());
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setMarginLeft(double d) {
        xmh xmhVarClone = m2963to().Clone();
        xmhVarClone.f50160x1 = d;
        m2953k4(xmhVarClone.Clone());
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setMarginRight(double d) {
        xmh xmhVarClone = m2963to().Clone();
        xmhVarClone.f50159to = d;
        m2953k4(xmhVarClone.Clone());
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setMarginTop(double d) {
        xmh xmhVarClone = m2963to().Clone();
        xmhVarClone.f50158kk = d;
        m2953k4(xmhVarClone.Clone());
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setRotationAngle(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m2969x1().m7498k4(f);
        }
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setTextVerticalType(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7486du(b);
            m2941dq();
        }
    }

    @Override // com.aspose.slides.ITextFrameFormat
    public final void setTransform(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7506kk(b);
        }
    }

    @Override // com.aspose.slides.IChartTextBlockFormat, com.aspose.slides.ITextFrameFormat
    public final void setWrapText(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7496k4(b);
        }
    }

    /* JADX INFO: renamed from: to */
    public final xmh m2963to() {
        return m2138ix() ? m2969x1().m7505kk() : i5k.f5627k4;
    }

    /* JADX INFO: renamed from: um */
    public final boolean m2965um() {
        if (!m2138ix()) {
            return true;
        }
        m2145uz();
        return m2969x1().m7484dq();
    }

    /* JADX INFO: renamed from: up */
    public final byte m2966up() {
        if (m2138ix()) {
            return m2969x1().m7518um();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: v4 */
    public final int m2967v4() {
        m2146wl();
        return this.f3531du;
    }

    /* JADX INFO: renamed from: wy */
    public final void m2968wy() {
        this.f3530ck = null;
        TextStyle textStyle = this.f3533h4;
        if (textStyle != null) {
            textStyle.m2978c5();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final i5k m2969x1() {
        return (i5k) m2144u4();
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m2973x6() {
        if (m2138ix()) {
            return m2969x1().m7531yd();
        }
        return false;
    }

    /* JADX INFO: renamed from: yd */
    public final void m2974yd() {
        if (m2138ix()) {
            m2145uz();
            m2969x1().m7475ak();
        }
    }

    /* JADX INFO: renamed from: yj */
    public final byte m2975yj() {
        if (m2138ix()) {
            return m2969x1().m7478bv();
        }
        return (byte) -1;
    }

    public TextFrameFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3535k4 = new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.TextFrameFormat.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.TextFrameFormat.OnParentPropertiesChanded(Aspose.Slides.ParagraphFormat)";
            }
        };
        this.f3538to = 0L;
        this.f3531du = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static xmh m2934k4(ITextFrameFormatEffectiveData iTextFrameFormatEffectiveData) {
        xmh xmhVar = new xmh();
        xmhVar.f50160x1 = iTextFrameFormatEffectiveData.getMarginLeft();
        xmhVar.f50158kk = iTextFrameFormatEffectiveData.getMarginTop();
        xmhVar.f50159to = iTextFrameFormatEffectiveData.getMarginRight();
        xmhVar.f50157du = iTextFrameFormatEffectiveData.getMarginBottom();
        return xmhVar;
    }

    /* JADX INFO: renamed from: du */
    public final void m2943du(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7483ck(b);
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m2945dy(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7533yj(b);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m2948h4(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7490fa(b);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m2960m9(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7520up(b);
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m2964to(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7495jd(b);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2970x1(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7488dy(b);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2950k4(byte b) {
        m2141k4((Byte) (byte) -1, Byte.valueOf(b));
        if (m2138ix()) {
            m2969x1().m7511m9(b);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2971x1(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m2969x1().m7507kk(f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2951k4(float f) {
        m2141k4(Float.valueOf(Float.NaN), Float.valueOf(f));
        if (m2138ix()) {
            m2969x1().m7527x1(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final void m2972x1(ITextFrameFormat iTextFrameFormat) {
        if (m2138ix() || ((PVIObject) iTextFrameFormat).m2138ix()) {
            m2145uz();
            m2969x1().m7500k4(iTextFrameFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2952k4(TextFrameFormat textFrameFormat) {
        if (m2138ix() || textFrameFormat.m2138ix()) {
            m2145uz();
            m2969x1().m7501k4(textFrameFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2953k4(xmh xmhVar) {
        m2141k4(i5k.f5627k4.Clone(), xmhVar.Clone());
        if (m2138ix()) {
            m2969x1().m7502k4(xmhVar.Clone());
            m2941dq();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2954k4(boolean z) {
        m2141k4(Boolean.FALSE, Boolean.valueOf(z));
        if (m2138ix()) {
            m2969x1().m7528x1(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2955k4(ITextFrameFormat[] iTextFrameFormatArr) {
        xmh xmhVarClone = m2963to().Clone();
        double d = xmhVarClone.f50160x1;
        w0l w0lVar = f3527fa;
        boolean z = false;
        if (C3085sv.m13088k4(d, C14116yg.m67477k4(w0lVar.getMarginLeft(), 1)) && C3085sv.m13088k4(xmhVarClone.f50159to, C14116yg.m67477k4(w0lVar.getMarginRight(), 1)) && C3085sv.m13088k4(xmhVarClone.f50158kk, C14116yg.m67477k4(w0lVar.getMarginTop(), 1)) && C3085sv.m13088k4(xmhVarClone.f50157du, C14116yg.m67477k4(w0lVar.getMarginBottom(), 1))) {
            return false;
        }
        for (ITextFrameFormat iTextFrameFormat : iTextFrameFormatArr) {
            xmh xmhVarClone2 = m2933k4(iTextFrameFormat).Clone();
            if (!C14044b3.m66437kk(xmhVarClone2.f50160x1) || !C14044b3.m66437kk(xmhVarClone2.f50159to) || !C14044b3.m66437kk(xmhVarClone2.f50158kk) || !C14044b3.m66437kk(xmhVarClone2.f50157du)) {
                if (C3085sv.m13088k4(xmhVarClone.f50160x1, xmhVarClone2.f50160x1) && C3085sv.m13088k4(xmhVarClone.f50159to, xmhVarClone2.f50159to) && C3085sv.m13088k4(xmhVarClone.f50158kk, xmhVarClone2.f50158kk) && C3085sv.m13088k4(xmhVarClone.f50157du, xmhVarClone2.f50157du)) {
                    z = true;
                }
                return !z;
            }
        }
        return true;
    }
}
