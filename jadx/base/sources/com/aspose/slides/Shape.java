package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Shape implements IShape, InterfaceC14397rj {

    /* JADX INFO: renamed from: dq */
    private static final float[] f3295dq = {270.0f, 180.0f, 90.0f, 0.0f};

    /* JADX INFO: renamed from: ak */
    private er8 f3296ak;

    /* JADX INFO: renamed from: ar */
    private final b8i f3297ar;

    /* JADX INFO: renamed from: b3 */
    private Shape f3298b3;

    /* JADX INFO: renamed from: bv */
    private String f3299bv;

    /* JADX INFO: renamed from: c5 */
    LineFormat f3300c5;

    /* JADX INFO: renamed from: ck */
    long f3301ck;

    /* JADX INFO: renamed from: du */
    private final pga f3302du;

    /* JADX INFO: renamed from: dy */
    FillFormat f3303dy;

    /* JADX INFO: renamed from: fa */
    boolean f3304fa;

    /* JADX INFO: renamed from: h4 */
    private final viu f3305h4;

    /* JADX INFO: renamed from: ix */
    private boolean f3306ix;

    /* JADX INFO: renamed from: jd */
    long f3307jd;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14397rj f3308k4;

    /* JADX INFO: renamed from: kk */
    private ISlideComponent f3309kk;

    /* JADX INFO: renamed from: ks */
    private final CustomData f3310ks;

    /* JADX INFO: renamed from: lr */
    private boolean f3311lr;

    /* JADX INFO: renamed from: m9 */
    private final IBaseShapeLock f3312m9;

    /* JADX INFO: renamed from: ne */
    private final HyperlinkManager f3313ne;

    /* JADX INFO: renamed from: qq */
    private nd1 f3314qq;

    /* JADX INFO: renamed from: rv */
    private Hyperlink f3315rv;

    /* JADX INFO: renamed from: to */
    private ShapeCollection f3316to;

    /* JADX INFO: renamed from: u4 */
    private byte f3317u4;

    /* JADX INFO: renamed from: um */
    private String f3318um;

    /* JADX INFO: renamed from: up */
    final AbstractC7018k4<AbstractC0612k4> f3319up;

    /* JADX INFO: renamed from: uz */
    private ThreeDFormat f3320uz;

    /* JADX INFO: renamed from: v4 */
    private String f3321v4;

    /* JADX INFO: renamed from: wl */
    private EffectFormat f3322wl;

    /* JADX INFO: renamed from: wy */
    private boolean f3323wy;

    /* JADX INFO: renamed from: x1 */
    private IPresentationComponent f3324x1;

    /* JADX INFO: renamed from: x6 */
    private Hyperlink f3325x6;

    /* JADX INFO: renamed from: xk */
    private int f3326xk;

    /* JADX INFO: renamed from: yd */
    private AbstractC0612k4 f3327yd;

    /* JADX INFO: renamed from: yj */
    private Placeholder f3328yj;

    /* JADX INFO: renamed from: com.aspose.slides.Shape$k4 */
    public static abstract class AbstractC0612k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo1223k4(Shape shape);
    }

    public Shape(InterfaceC14397rj interfaceC14397rj) {
        this(interfaceC14397rj, new pga(), new viu(), new BaseShapeLock());
        m2560k4((er8) null);
    }

    /* JADX INFO: renamed from: ck */
    private idf<ILineFormat, LineFormat> m2533ck() {
        return this.f3297ar.mo4046k4();
    }

    /* JADX INFO: renamed from: kk */
    private C0735a7 m2539kk() {
        for (Shape shape : m2547c6()) {
            GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) shape, GeometryShape.class);
            if (geometryShape != null && geometryShape.m1591yj().m3308ck() != -1 && ((SketchFormat) geometryShape.getLineFormat().getSketchFormat()).m2670du().m3308ck() != -1) {
                return ((SketchFormat) geometryShape.getLineFormat().getSketchFormat()).m2670du();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    private void m2541to() {
        List list = new List();
        for (GroupShape groupShapeM2573s7 = m2573s7(); groupShapeM2573s7.m2594xw() != null; groupShapeM2573s7 = groupShapeM2573s7.m2573s7()) {
            list.addItem(groupShapeM2573s7);
        }
        for (int i = 0; i < list.size(); i++) {
            ((GroupShape) list.get_Item(i)).m1651rv();
        }
    }

    /* JADX INFO: renamed from: P_ */
    public nd1 mo1214P_() {
        return m2548dq();
    }

    /* JADX INFO: renamed from: Q_ */
    public void mo1642Q_() {
        AbstractC0612k4 abstractC0612k4 = this.f3327yd;
        if (abstractC0612k4 != null) {
            abstractC0612k4.mo1223k4(this);
        }
        removePlaceholder();
        m2592x1((InterfaceC14397rj) null);
    }

    /* JADX INFO: renamed from: R_ */
    public C12025x6[] mo1215R_() {
        return m2546bz().m5643rv();
    }

    /* JADX INFO: renamed from: S_ */
    public float[] mo1216S_() {
        return f3295dq;
    }

    @Override // com.aspose.slides.IShape
    public final IPlaceholder addPlaceholder(IPlaceholder iPlaceholder) {
        if (isGrouped()) {
            throw new InvalidOperationException("Grouped shape cannot be a placeholder.");
        }
        if (this.f3328yj == null) {
            this.f3328yj = new Placeholder();
            ((BaseSlide) getSlide()).f1084x1.m5440x1(this);
        }
        this.f3328yj.m2271k4((Placeholder) iPlaceholder);
        return this.f3328yj;
    }

    /* JADX INFO: renamed from: ak */
    public final boolean m2543ak() {
        return this.f3304fa;
    }

    /* JADX INFO: renamed from: b3 */
    public final void m2544b3() {
        LineFormat lineFormat = (LineFormat) C7019kk.m27452k4((Object) getLineFormat(), LineFormat.class);
        if (lineFormat != null) {
            lineFormat.f2628x1.mo27429k4(new w7b() { // from class: com.aspose.slides.Shape.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.Shape.OnSketchFormatChanged()";
                }

                @Override // com.aspose.slides.w7b
                /* JADX INFO: renamed from: k4 */
                public void mo1905k4() {
                    Shape.this.m2535k4();
                }
            });
            lineFormat.f2628x1.mo27432x1(new w7b() { // from class: com.aspose.slides.Shape.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.Slides.Shape.OnSketchFormatChanged()";
                }

                @Override // com.aspose.slides.w7b
                /* JADX INFO: renamed from: k4 */
                public void mo1905k4() {
                    Shape.this.m2535k4();
                }
            });
        }
    }

    /* JADX INFO: renamed from: bv */
    public final ThreeDFormat m2545bv() {
        if (this.f3320uz == null) {
            this.f3320uz = new ThreeDFormat(this);
        }
        return this.f3320uz;
    }

    /* JADX INFO: renamed from: bz */
    public final er8 m2546bz() {
        return this.f3296ak;
    }

    /* JADX INFO: renamed from: c5 */
    public long mo275c5() {
        return this.f3307jd;
    }

    /* JADX INFO: renamed from: c6 */
    public final Shape[] m2547c6() {
        Placeholder placeholder;
        BaseSlide baseSlideM2583vj = m2583vj();
        return (baseSlideM2583vj == null || (placeholder = this.f3328yj) == null) ? BaseSlide.f1067du : baseSlideM2583vj.mo399k4(placeholder);
    }

    /* JADX INFO: renamed from: dq */
    public final nd1 m2548dq() {
        if (this.f3314qq == null) {
            this.f3314qq = new nd1();
        }
        return this.f3314qq;
    }

    /* JADX INFO: renamed from: du */
    public pga mo272to() {
        return this.f3302du;
    }

    /* JADX INFO: renamed from: dy */
    public void mo277dy() {
    }

    /* JADX INFO: renamed from: e0 */
    public C12009k4 m2549e0() {
        return m2553k4(1, 1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: f9 */
    public final IPresentationComponent m2550f9() {
        IPresentationComponent iPresentationComponent = this.f3324x1;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            ISlideComponent[] iSlideComponentArr = {this.f3309kk};
            kke.m63957k4(this.f3308k4, iPresentationComponentArr, iSlideComponentArr);
            this.f3324x1 = iPresentationComponentArr[0];
            this.f3309kk = iSlideComponentArr[0];
        }
        return this.f3324x1;
    }

    /* JADX INFO: renamed from: fa */
    public boolean mo278fa() {
        return !getEffectFormat().isNoEffects() || ((FillFormat) getFillFormat()).m1459to() || ((LineFillFormat) getLineFormat().getFillFormat()).m1881to() || m2576t6().getSlide().getTimeline().getMainSequence().getCount(this) > 0 || !C14113y2.m67411k4(getAlternativeText()) || !C14113y2.m67411k4(getAlternativeTextTitle());
    }

    /* JADX INFO: renamed from: g8 */
    public final C12007ix m2551g8() {
        ShapeFrame shapeFrameM5646yj = m2546bz().m5646yj();
        if (!m2572qm()) {
            return shapeFrameM5646yj.m2660k4();
        }
        return new C12007ix(((shapeFrameM5646yj.getWidth() / 2.0f) + shapeFrameM5646yj.getX()) - (shapeFrameM5646yj.getHeight() / 2.0f), ((shapeFrameM5646yj.getHeight() / 2.0f) + shapeFrameM5646yj.getY()) - (shapeFrameM5646yj.getWidth() / 2.0f), shapeFrameM5646yj.getHeight(), shapeFrameM5646yj.getWidth());
    }

    @Override // com.aspose.slides.IShape
    public final String getAlternativeText() {
        return this.f3299bv;
    }

    @Override // com.aspose.slides.IShape
    public final String getAlternativeTextTitle() {
        return this.f3321v4;
    }

    @Override // com.aspose.slides.IShape
    public final IShape getBasePlaceholder() {
        Shape shapeM5439x1;
        BaseSlide baseSlideM2583vj = m2583vj();
        if (baseSlideM2583vj != null && this.f3328yj != null) {
            if (C7019kk.m27469x1(baseSlideM2583vj, Slide.class)) {
                LayoutSlide layoutSlideM2687bv = ((Slide) baseSlideM2583vj).m2687bv();
                if (layoutSlideM2687bv == null) {
                    return null;
                }
                MasterSlide masterSlide = (MasterSlide) layoutSlideM2687bv.getMasterSlide();
                if (this.f3328yj.getIndex() != 4294967295L) {
                    return layoutSlideM2687bv.f1084x1.m5436k4(this.f3328yj);
                }
                if (this.f3328yj.getType() == 8) {
                    Shape shapeM5439x12 = layoutSlideM2687bv.f1084x1.m5439x1(this.f3328yj);
                    if (shapeM5439x12 != null && this.f3328yj.getSize() == shapeM5439x12.getPlaceholder().getSize() && this.f3328yj.getIndex() == shapeM5439x12.getPlaceholder().getIndex()) {
                        return shapeM5439x12;
                    }
                } else if (this.f3328yj.getType() != 1 && this.f3328yj.getType() != 2 && (shapeM5439x1 = layoutSlideM2687bv.f1084x1.m5439x1(this.f3328yj)) != null) {
                    return shapeM5439x1;
                }
                if (masterSlide != null) {
                    return masterSlide.f1084x1.m5435k4(this.f3328yj, (Placeholder) null);
                }
                return null;
            }
            if (C7019kk.m27469x1(baseSlideM2583vj, LayoutSlide.class)) {
                MasterSlide masterSlide2 = (MasterSlide) ((LayoutSlide) baseSlideM2583vj).getMasterSlide();
                if (masterSlide2 == null) {
                    return null;
                }
                return masterSlide2.f1084x1.m5435k4(this.f3328yj, (Placeholder) null);
            }
            if (C7019kk.m27469x1(baseSlideM2583vj, NotesSlide.class) && getPresentation() != null && getPresentation().getMasterNotesSlideManager().getMasterNotesSlide() != null) {
                return ((BaseSlide) getPresentation().getMasterNotesSlideManager().getMasterNotesSlide()).f1084x1.m5435k4(this.f3328yj, (Placeholder) null);
            }
        }
        return null;
    }

    @Override // com.aspose.slides.IShape
    public final byte getBlackWhiteMode() {
        return this.f3317u4;
    }

    @Override // com.aspose.slides.IShape
    public final int getConnectionSiteCount() {
        return m2546bz().m5627c5().length;
    }

    @Override // com.aspose.slides.IShape
    public final ICustomData getCustomData() {
        return this.f3310ks;
    }

    @Override // com.aspose.slides.IShape
    public IEffectFormat getEffectFormat() {
        return m2595yd();
    }

    @Override // com.aspose.slides.IShape
    public IFillFormat getFillFormat() {
        return this.f3303dy;
    }

    @Override // com.aspose.slides.IShape
    public final IShapeFrame getFrame() {
        m2546bz().mo5640kk();
        return m2593xk();
    }

    @Override // com.aspose.slides.IShape
    public final float getHeight() {
        return getFrame().getHeight();
    }

    @Override // com.aspose.slides.IShape
    public final boolean getHidden() {
        return this.f3306ix;
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final IHyperlink getHyperlinkClick() {
        return this.f3315rv;
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final IHyperlinkManager getHyperlinkManager() {
        return this.f3313ne;
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final IHyperlink getHyperlinkMouseOver() {
        return this.f3325x6;
    }

    @Override // com.aspose.slides.IShape
    public final IImage getImage() {
        return new yyn(m2549e0());
    }

    @Override // com.aspose.slides.IShape
    public ILineFormat getLineFormat() {
        return m2582v4();
    }

    @Override // com.aspose.slides.IShape
    public final String getName() {
        return this.f3318um;
    }

    @Override // com.aspose.slides.IShape
    public final long getOfficeInteropShapeId() {
        return mo272to().m69039ix();
    }

    @Override // com.aspose.slides.IShape
    public final IGroupShape getParentGroup() {
        return m2573s7();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3308k4;
    }

    @Override // com.aspose.slides.IShape
    public final IPlaceholder getPlaceholder() {
        return this.f3328yj;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (m2550f9() != null) {
            return m2550f9().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IShape
    public final IShapeFrame getRawFrame() {
        m2546bz().mo5640kk();
        nd1 nd1VarMo1214P_ = mo1214P_();
        tbp tbpVarClone = nd1VarMo1214P_.m67982k4().Clone();
        tbp tbpVarClone2 = m2575sv().Clone();
        return new ShapeFrame(tbpVarClone.f49090k4, tbpVarClone.f49091x1, tbpVarClone2.f49090k4, tbpVarClone2.f49091x1, nd1VarMo1214P_.m67989to(), nd1VarMo1214P_.m67980du(), nd1VarMo1214P_.m67988kk());
    }

    @Override // com.aspose.slides.IShape
    public final float getRotation() {
        return m2593xk().getRotation();
    }

    @Override // com.aspose.slides.IShape
    public IBaseShapeLock getShapeLock() {
        return this.f3312m9;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        return m2583vj();
    }

    @Override // com.aspose.slides.IShape
    public IThreeDFormat getThreeDFormat() {
        return m2545bv();
    }

    @Override // com.aspose.slides.IShape
    @Deprecated
    public final Bitmap getThumbnail() {
        return (Bitmap) C12009k4.m56588k4(m2549e0());
    }

    @Override // com.aspose.slides.IShape
    public final long getUniqueId() {
        if (this.f3326xk == -1) {
            if (getPresentation() == null) {
                throw new NullReferenceException("Presentation couldn't be empty.");
            }
            this.f3326xk = (int) ((Presentation) getPresentation()).m2390to();
        }
        return ((long) this.f3326xk) & 4294967295L;
    }

    @Override // com.aspose.slides.IShape
    public final float getWidth() {
        return getFrame().getWidth();
    }

    @Override // com.aspose.slides.IShape
    public final float getX() {
        return getFrame().getX();
    }

    @Override // com.aspose.slides.IShape
    public final float getY() {
        return getFrame().getY();
    }

    @Override // com.aspose.slides.IShape
    public int getZOrderPosition() {
        if (m2594xw() != null) {
            return m2594xw().indexOf(this);
        }
        return 0;
    }

    /* JADX INFO: renamed from: gi */
    public final void m2552gi() {
        nd1 nd1VarM2548dq = m2548dq();
        nd1VarM2548dq.m67987k4(new tbp(Double.NaN, Double.NaN));
        m2555k4(Double.NaN, Double.NaN);
        nd1VarM2548dq.m67985k4(Float.NaN, (byte) -1, (byte) -1);
        if (C7019kk.m27469x1(this, GroupShape.class)) {
            GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) this, GroupShape.class);
            tbp tbpVar = tbp.f49088kk;
            groupShape.m1647k4(tbpVar.Clone());
            ((GroupShape) C7019kk.m27452k4((Object) this, GroupShape.class)).m1654x1(tbpVar.Clone());
        }
        m2570kp();
    }

    @Override // com.aspose.slides.IShape
    public final boolean isDecorative() {
        return this.f3311lr;
    }

    @Override // com.aspose.slides.IShape
    public final boolean isGrouped() {
        return (m2594xw() == null || m2594xw().m2617ix().m2594xw() == null) ? false : true;
    }

    @Override // com.aspose.slides.IShape
    public final boolean isTextHolder() {
        return this.f3328yj != null;
    }

    /* JADX INFO: renamed from: ix */
    public IFillFormatEffectiveData mo1585ix() {
        return null;
    }

    /* JADX INFO: renamed from: jd */
    public void mo280jd() {
        if (!C7019kk.m27469x1(m2583vj(), Slide.class)) {
            throw new InvalidOperationException("Reset method is appliable only for Slide's shapes.");
        }
        this.f3303dy.m1455h4();
        LineFormat lineFormat = this.f3300c5;
        if (lineFormat != null) {
            lineFormat.m1895h4();
        }
        EffectFormat effectFormat = this.f3322wl;
        if (effectFormat != null) {
            effectFormat.m1386h4();
        }
        ThreeDFormat threeDFormat = this.f3320uz;
        if (threeDFormat != null) {
            threeDFormat.m3006jd();
        }
        m2552gi();
    }

    /* JADX INFO: renamed from: kp */
    public final void m2570kp() {
        this.f3307jd++;
    }

    /* JADX INFO: renamed from: lr */
    public final LineFormat m2571lr() {
        return m2586x1(this);
    }

    /* JADX INFO: renamed from: ne */
    public ILineFormatEffectiveData mo1587ne() {
        return null;
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m2572qm() {
        float fM2658k4 = ShapeFrame.m2658k4(m2548dq().m67988kk());
        return (m2548dq().m67980du() == 1) ^ (m2548dq().m67989to() == 1) ? (fM2658k4 > 45.0f && fM2658k4 <= 135.0f) || (fM2658k4 > 225.0f && fM2658k4 <= 315.0f) : (fM2658k4 >= 45.0f && fM2658k4 < 135.0f) || (fM2658k4 >= 225.0f && fM2658k4 < 315.0f);
    }

    @Override // com.aspose.slides.IShape
    public final void removePlaceholder() {
        if (this.f3328yj != null) {
            ((BaseSlide) getSlide()).f1084x1.m5438k4(this);
        }
        this.f3328yj = null;
    }

    /* JADX INFO: renamed from: s7 */
    public final GroupShape m2573s7() {
        if (m2594xw() != null) {
            return m2594xw().m2617ix();
        }
        GroupShape[] groupShapeArr = {null};
        kke.m63959k4(GroupShape.class, this.f3308k4, groupShapeArr);
        return groupShapeArr[0];
    }

    @Override // com.aspose.slides.IShape
    public final void setAlternativeText(String str) {
        this.f3299bv = str;
    }

    @Override // com.aspose.slides.IShape
    public final void setAlternativeTextTitle(String str) {
        this.f3321v4 = str;
    }

    @Override // com.aspose.slides.IShape
    public final void setBlackWhiteMode(byte b) {
        this.f3317u4 = b;
    }

    @Override // com.aspose.slides.IShape
    public final void setDecorative(boolean z) {
        this.f3311lr = z;
    }

    @Override // com.aspose.slides.IShape
    public final void setFrame(IShapeFrame iShapeFrame) {
        if (C14064he.m66715kk(iShapeFrame.getX()) || C14064he.m66715kk(iShapeFrame.getY()) || C14064he.m66715kk(iShapeFrame.getWidth()) || C14064he.m66715kk(iShapeFrame.getHeight()) || iShapeFrame.getFlipH() == -1 || iShapeFrame.getFlipV() == -1 || C14064he.m66715kk(iShapeFrame.getRotation())) {
            throw new ArgumentException(C14113y2.m67408k4("Value of each property of the assigned IShapeFrame instance must ", "be not undefined (must be not NaN or NotDefined)."));
        }
        m2559k4((ShapeFrame) iShapeFrame);
        m2570kp();
        if (C7019kk.m27469x1(this, GroupShape.class)) {
            m2536k4((GroupShape) this);
        }
    }

    @Override // com.aspose.slides.IShape
    public final void setHeight(float f) {
        if (C14116yg.m67480k4(getHeight() - f) > 1.0E-4d) {
            mo2264x1(f);
        }
    }

    @Override // com.aspose.slides.IShape
    public final void setHidden(boolean z) {
        this.f3306ix = z;
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final void setHyperlinkClick(IHyperlink iHyperlink) {
        Hyperlink hyperlink = (Hyperlink) iHyperlink;
        this.f3315rv = hyperlink;
        if (iHyperlink != null) {
            hyperlink.m1694k4((IHyperlinkContainer) this);
        }
    }

    @Override // com.aspose.slides.IHyperlinkContainer
    public final void setHyperlinkMouseOver(IHyperlink iHyperlink) {
        Hyperlink hyperlink = (Hyperlink) iHyperlink;
        this.f3325x6 = hyperlink;
        if (iHyperlink != null) {
            hyperlink.m1694k4((IHyperlinkContainer) this);
        }
    }

    @Override // com.aspose.slides.IShape
    public final void setName(String str) {
        if (str == null) {
            throw new ArgumentNullException("Must be not null. Use empty string value.");
        }
        this.f3318um = str;
    }

    @Override // com.aspose.slides.IShape
    public final void setRawFrame(IShapeFrame iShapeFrame) {
        C1258im c1258im = new C1258im();
        c1258im.f5734x1 = iShapeFrame.getRotation();
        c1258im.f5733to = iShapeFrame.getFlipH() == 1;
        c1258im.f5732kk = iShapeFrame.getFlipV() == 1;
        nuk nukVar = new nuk();
        nukVar.f47615k4 = new oju(iShapeFrame.getX(), iShapeFrame.getY());
        nukVar.f47617x1 = new oju(iShapeFrame.getWidth(), iShapeFrame.getHeight());
        nukVar.f47616kk = c1258im;
        m2563k4(nukVar.Clone());
        m2570kp();
    }

    @Override // com.aspose.slides.IShape
    public final void setRotation(float f) {
        IShapeFrame frame = getFrame();
        float fM2658k4 = ShapeFrame.m2658k4(f);
        if (C14116yg.m67480k4(frame.getRotation() - fM2658k4) > 1.0E-4d) {
            setFrame(new ShapeFrame(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight(), frame.getFlipH(), frame.getFlipV(), fM2658k4));
            m2570kp();
        }
    }

    @Override // com.aspose.slides.IShape
    public final void setWidth(float f) {
        if (C14116yg.m67480k4(getWidth() - f) > 1.0E-4d) {
            mo2261k4(f);
        }
    }

    @Override // com.aspose.slides.IShape
    public final void setX(float f) {
        IShapeFrame frame = getFrame();
        if (C14116yg.m67480k4(frame.getX() - f) > 1.0E-4d) {
            setFrame(new ShapeFrame(f, frame.getY(), frame.getWidth(), frame.getHeight(), frame.getFlipH(), frame.getFlipV(), frame.getRotation()));
            m2570kp();
        }
    }

    @Override // com.aspose.slides.IShape
    public final void setY(float f) {
        IShapeFrame frame = getFrame();
        if (C14116yg.m67480k4(frame.getY() - f) > 1.0E-4d) {
            setFrame(new ShapeFrame(frame.getX(), f, frame.getWidth(), frame.getHeight(), frame.getFlipH(), frame.getFlipV(), frame.getRotation()));
            m2570kp();
        }
    }

    /* JADX INFO: renamed from: ss */
    public final long m2574ss() {
        if ((mo272to().m69039ix() & 4294967295L) != 0) {
            throw new InvalidOperationException("ShapeId had been created already.");
        }
        if (m2583vj() == null) {
            throw new NullReferenceException("Slide couldn't be empty.");
        }
        long jM383ck = m2583vj().m383ck();
        m2568kk(jM383ck);
        return jM383ck;
    }

    /* JADX INFO: renamed from: sv */
    public final tbp m2575sv() {
        return mo1214P_().m67990x1();
    }

    /* JADX INFO: renamed from: t6 */
    public final ISlideComponent m2576t6() {
        ISlideComponent iSlideComponent = this.f3309kk;
        if (iSlideComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {this.f3324x1};
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63957k4(this.f3308k4, iPresentationComponentArr, iSlideComponentArr);
            this.f3324x1 = iPresentationComponentArr[0];
            this.f3309kk = iSlideComponentArr[0];
        }
        return this.f3309kk;
    }

    /* JADX INFO: renamed from: ts */
    public final ShapeFrame m2580ts() {
        m2546bz().mo5640kk();
        nuk nukVarClone = m2546bz().m5641ks().Clone();
        m2546bz().m5637k4(nukVarClone.Clone()).CloneTo(nukVarClone);
        oju ojuVar = nukVarClone.f47615k4;
        float f = ojuVar.f47836k4;
        float f2 = ojuVar.f47837x1;
        oju ojuVar2 = nukVarClone.f47617x1;
        float f3 = ojuVar2.f47836k4;
        float f4 = ojuVar2.f47837x1;
        C1258im c1258im = nukVarClone.f47616kk;
        boolean z = c1258im.f5733to;
        boolean z2 = c1258im.f5732kk;
        return new ShapeFrame(f, f2, f3, f4, z ? (byte) 1 : (byte) 0, z2 ? (byte) 1 : (byte) 0, c1258im.f5734x1);
    }

    /* JADX INFO: renamed from: um */
    public final Shape m2581um() {
        return this.f3298b3;
    }

    /* JADX INFO: renamed from: uz */
    public viu mo1638uz() {
        return this.f3305h4;
    }

    /* JADX INFO: renamed from: v4 */
    public final LineFormat m2582v4() {
        m2533ck().mo4417k4(this.f3300c5, new AbstractC0740ab<ILineFormat>() { // from class: com.aspose.slides.Shape.2
            @Override // com.aspose.slides.AbstractC0740ab
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo2597k4(ILineFormat iLineFormat) {
                Shape.this.f3300c5 = new LineFormat(this);
                Shape.this.f3300c5.m1896k4(iLineFormat);
            }
        });
        if (this.f3300c5 == null) {
            this.f3300c5 = new LineFormat(this);
        }
        return this.f3300c5;
    }

    /* JADX INFO: renamed from: vj */
    public final BaseSlide m2583vj() {
        if (m2576t6() != null) {
            return (BaseSlide) m2576t6().getSlide();
        }
        return null;
    }

    /* JADX INFO: renamed from: wp */
    public final long m2584wp() {
        return mo272to().m69039ix();
    }

    @Override // com.aspose.slides.IShape
    public final void writeAsSvg(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Shape.5
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Shape.this.m2589x1(abstractC3150x6);
            }
        });
    }

    /* JADX INFO: renamed from: wy */
    public final boolean m2585wy() {
        return this.f3323wy;
    }

    /* JADX INFO: renamed from: x1 */
    public final LineFormat m2586x1(Shape shape) {
        if (this.f3300c5 == null) {
            return null;
        }
        if (m2533ck().mo4419k4(this.f3300c5)) {
            this.f3300c5.m1898k4(shape);
        }
        return this.f3300c5;
    }

    /* JADX INFO: renamed from: xk */
    public final ShapeFrame m2593xk() {
        return m2546bz().m5631fa();
    }

    /* JADX INFO: renamed from: xw */
    public final ShapeCollection m2594xw() {
        return this.f3316to;
    }

    /* JADX INFO: renamed from: yd */
    public final EffectFormat m2595yd() {
        if (this.f3322wl == null) {
            this.f3322wl = new EffectFormat(this);
        }
        return this.f3322wl;
    }

    public Shape(InterfaceC14397rj interfaceC14397rj, pga pgaVar, IBaseShapeLock iBaseShapeLock) {
        this(interfaceC14397rj, pgaVar, new viu(), iBaseShapeLock);
    }

    @Override // com.aspose.slides.IShape
    public final IImage getImage(int i, float f, float f2) {
        return new yyn(m2546bz().m5636k4(i, f, f2));
    }

    @Override // com.aspose.slides.IShape
    @Deprecated
    public final Bitmap getThumbnail(int i, float f, float f2) {
        return (Bitmap) C12009k4.m56588k4(m2553k4(i, f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2553k4(int i, float f, float f2) {
        return m2546bz().m5636k4(i, f, f2);
    }

    /* JADX INFO: renamed from: kk */
    public final nuk m2566kk(ShapeFrame shapeFrame) {
        C1258im c1258im = new C1258im();
        c1258im.f5734x1 = shapeFrame.getRotation();
        c1258im.f5733to = shapeFrame.getFlipH() == 1;
        c1258im.f5732kk = shapeFrame.getFlipV() == 1;
        nuk nukVar = new nuk();
        nukVar.f47615k4 = new oju(shapeFrame.getX(), shapeFrame.getY());
        nukVar.f47617x1 = new oju(shapeFrame.getWidth(), shapeFrame.getHeight());
        nukVar.f47616kk = c1258im;
        return m2567kk(nukVar.Clone());
    }

    /* JADX INFO: renamed from: to */
    public final void m2577to(long j) {
        BaseSlide baseSlideM2583vj = m2583vj();
        mo272to().m69039ix();
        if (baseSlideM2583vj == null) {
            throw new NullReferenceException("Slide couldn't be empty.");
        }
        long j2 = j & 4294967295L;
        if ((baseSlideM2583vj.m388jd() & 4294967295L) <= j2) {
            baseSlideM2583vj.m395k4((j2 + 1) & 4294967295L, true);
        }
        mo272to().m69040k4(j);
    }

    @Override // com.aspose.slides.IShape
    public final void writeAsSvg(OutputStream outputStream, final ISVGOptions iSVGOptions) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Shape.6
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Shape.this.m2561k4(abstractC3150x6, iSVGOptions);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public void mo2264x1(float f) {
        m2591x1(new oju(m2593xk().getWidth(), f));
    }

    public Shape(InterfaceC14397rj interfaceC14397rj, pga pgaVar, viu viuVar, IBaseShapeLock iBaseShapeLock) {
        this.f3306ix = false;
        this.f3317u4 = (byte) -1;
        this.f3318um = "";
        this.f3299bv = "";
        this.f3321v4 = "";
        this.f3311lr = false;
        this.f3307jd = 0L;
        this.f3301ck = 4294967295L;
        this.f3304fa = false;
        this.f3319up = new AbstractC7018k4<AbstractC0612k4>() { // from class: com.aspose.slides.Shape.1
            {
                Shape.this.f3327yd = new AbstractC0612k4() { // from class: com.aspose.slides.Shape.1.1
                    @Override // com.aspose.slides.Shape.AbstractC0612k4
                    /* JADX INFO: renamed from: k4 */
                    public void mo1223k4(Shape shape) {
                        Iterator it = ((AbstractC7018k4) C06061.this).f19081x1.iterator();
                        while (it.hasNext()) {
                            ((AbstractC0612k4) it.next()).mo1223k4(shape);
                        }
                    }
                };
            }
        };
        this.f3326xk = -1;
        this.f3312m9 = iBaseShapeLock;
        m2558k4((Shape) null);
        this.f3303dy = new FillFormat(this);
        this.f3310ks = new CustomData(this);
        this.f3313ne = new HyperlinkManager(this);
        m2592x1(interfaceC14397rj);
        this.f3302du = pgaVar;
        this.f3305h4 = viuVar;
        this.f3297ar = xnd.m73516k4(m2550f9());
        this.f3320uz = null;
        this.f3322wl = null;
        this.f3314qq = null;
        m2569kk(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m2535k4() {
        SketchFormat sketchFormat = (SketchFormat) C7019kk.m27452k4((Object) getLineFormat().getSketchFormat(), SketchFormat.class);
        C12007ix c12007ixClone = ((ShapeFrame) getFrame()).m2660k4().Clone();
        C0735a7 c0735a7M1591yj = ((GeometryShape) this).m1591yj();
        C0735a7 c0735a7M2670du = sketchFormat.m2670du();
        C0735a7 c0735a7M2539kk = m2539kk();
        if (c0735a7M2670du.m3308ck() == -1 && sketchFormat.getSketchType() != 0 && c0735a7M2539kk == null) {
            sketchFormat.m2676k4(C0735a7.m3305k4(c0735a7M1591yj));
        }
        if (sketchFormat.getSketchType() == -1 || sketchFormat.getSketchType() == 0) {
            m2537k4(c0735a7M2670du);
            return;
        }
        c0735a7M1591yj.m3320k4(bzf.m4400k4(((BaseSlide) getSlide()).m384du(), c12007ixClone.Clone(), m2538k4(sketchFormat, c0735a7M2539kk), sketchFormat.getSketchType()));
        c0735a7M1591yj.m3317k4(0);
    }

    /* JADX INFO: renamed from: kk */
    public final nuk m2567kk(nuk nukVar) {
        float f;
        List list;
        int i;
        boolean z;
        float f2 = nukVar.f47616kk.f5734x1;
        tbp tbpVarClone = tbp.f49089to.Clone();
        tbp tbpVarClone2 = nukVar.f47617x1.m68629x1().Clone();
        tbp tbpVarClone3 = oju.m68619k4(nukVar.f47615k4, oju.m68618k4(nukVar.f47617x1, 2)).m68629x1().Clone();
        List list2 = new List();
        for (GroupShape groupShapeM2573s7 = m2573s7(); groupShapeM2573s7.m2594xw() != null; groupShapeM2573s7 = groupShapeM2573s7.m2573s7()) {
            list2.addItem(groupShapeM2573s7);
        }
        boolean z2 = true;
        int size = list2.size() - 1;
        boolean z3 = false;
        boolean z4 = false;
        while (size >= 0) {
            GroupShape groupShape = (GroupShape) list2.get_Item(size);
            nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
            float fM67988kk = f2 - nd1VarMo1214P_.m67988kk();
            if ((nd1VarMo1214P_.m67989to() == z2 ? z2 : false) ^ (nd1VarMo1214P_.m67980du() == z2 ? z2 : false)) {
                fM67988kk = -fM67988kk;
            }
            groupShape.m2572qm();
            if (groupShape.m2572qm()) {
                tbpVarClone.m71065kk();
                boolean z5 = z4;
                z4 = z3;
                z3 = z5;
            }
            boolean z6 = z3 ^ (nd1VarMo1214P_.m67989to() == z2 ? z2 : false);
            z4 ^= nd1VarMo1214P_.m67980du() == z2 ? z2 : false;
            tbp tbpVarClone4 = groupShape.m1643ck().Clone();
            tbpVarClone.f49090k4 *= tbpVarClone4.f49090k4;
            List list3 = list2;
            tbpVarClone.f49091x1 *= tbpVarClone4.f49091x1;
            double d = ((double) ((-nd1VarMo1214P_.m67988kk()) / 180.0f)) * 3.141592653589793d;
            double dM67470dy = C14116yg.m67470dy(d);
            double dM67495m9 = C14116yg.m67495m9(d);
            tbp tbpVarClone5 = tbp.m71060x1(tbp.m71060x1(tbpVarClone3, nd1VarMo1214P_.m67982k4()), tbp.m71053k4(groupShape.m2575sv(), 2)).Clone();
            tbp tbpVarClone6 = tbp.m71054k4(groupShape.m1649kk(), tbp.m71053k4(groupShape.m1652to(), 2)).Clone();
            if (size > 0) {
                list = list3;
                GroupShape groupShape2 = (GroupShape) list.get_Item(size - 1);
                f = fM67988kk;
                i = size;
                tbp tbpVarClone7 = tbp.m71054k4(groupShape2.mo1214P_().m67982k4(), tbp.m71053k4(groupShape2.m2575sv(), 2)).Clone();
                tbpVarClone3.f49090k4 = (((double) (nd1VarMo1214P_.m67989to() == 1 ? -1 : 1)) * ((tbpVarClone5.f49090k4 * dM67470dy) - (tbpVarClone5.f49091x1 * dM67495m9))) - (tbpVarClone.f49090k4 * (tbpVarClone7.f49090k4 - tbpVarClone6.f49090k4));
                tbpVarClone3.f49091x1 = (((tbpVarClone5.f49091x1 * dM67470dy) + (tbpVarClone5.f49090k4 * dM67495m9)) * ((double) (nd1VarMo1214P_.m67980du() == 1 ? -1 : 1))) - ((tbpVarClone7.f49091x1 - tbpVarClone6.f49091x1) * tbpVarClone.f49091x1);
                tbp.m71054k4(tbpVarClone3, tbpVarClone7).CloneTo(tbpVarClone3);
                z = true;
            } else {
                f = fM67988kk;
                list = list3;
                i = size;
                tbpVarClone3.f49090k4 = ((((double) (nd1VarMo1214P_.m67989to() == 1 ? -1 : 1)) * ((tbpVarClone5.f49090k4 * dM67470dy) - (tbpVarClone5.f49091x1 * dM67495m9))) / tbpVarClone.f49090k4) + tbpVarClone6.f49090k4;
                z = true;
                tbpVarClone3.f49091x1 = ((((tbpVarClone5.f49091x1 * dM67470dy) + (tbpVarClone5.f49090k4 * dM67495m9)) * ((double) (nd1VarMo1214P_.m67980du() == 1 ? -1 : 1))) / tbpVarClone.f49091x1) + tbpVarClone6.f49091x1;
            }
            size = i - 1;
            list2 = list;
            z2 = z;
            z3 = z6;
            f2 = f;
        }
        float fM2658k4 = ShapeFrame.m2658k4(f2);
        if ((fM2658k4 <= 45.0f || fM2658k4 >= 135.0f) && (fM2658k4 <= 225.0f || fM2658k4 >= 315.0f)) {
            tbpVarClone2.f49090k4 /= tbpVarClone.f49090k4;
            tbpVarClone2.f49091x1 /= tbpVarClone.f49091x1;
        } else {
            tbpVarClone2.f49090k4 /= tbpVarClone.f49091x1;
            tbpVarClone2.f49091x1 /= tbpVarClone.f49090k4;
            boolean z7 = z4;
            z4 = z3;
            z3 = z7;
        }
        C1258im c1258im = nukVar.f47616kk;
        boolean z8 = c1258im.f5733to ^ z3;
        boolean z9 = c1258im.f5732kk ^ z4;
        C1258im c1258im2 = new C1258im();
        c1258im2.f5734x1 = fM2658k4;
        c1258im2.f5733to = z8;
        c1258im2.f5732kk = z9;
        nuk nukVar2 = new nuk();
        tbp.m71060x1(tbpVarClone3, tbp.m71053k4(tbpVarClone2, 2)).m71061du().CloneTo(nukVar2.f47615k4);
        tbpVarClone2.m71061du().CloneTo(nukVar2.f47617x1);
        nukVar2.f47616kk = c1258im2;
        return nukVar2;
    }

    /* JADX INFO: renamed from: to */
    public final void m2578to(String str) {
        if (getPresentation() == null) {
            throw new NullReferenceException("Presentation couldn't be empty.");
        }
        int[] iArr = {this.f3326xk};
        boolean z = !C14057f9.m66590k4(str, iArr) || iArr[0] < 0;
        this.f3326xk = iArr[0];
        this.f3326xk = (int) (z ? ((Presentation) getPresentation()).m2390to() : ((Presentation) getPresentation()).m2356k4(((long) this.f3326xk) & 4294967295L));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2587x1(float f, float f2, float f3) {
        float height;
        m2579to(true);
        if (C7019kk.m27469x1(getSlide(), MasterSlide.class) || C7019kk.m27469x1(getSlide(), LayoutSlide.class)) {
            setX(getX() * f);
            setWidth(getWidth() * f);
            setY(getY() * f2);
            height = getHeight() * f2;
        } else {
            if (getSlide() == null) {
                throw new NullReferenceException("Slide couldn't be empty.");
            }
            C12015qq c12015qqClone = ((SlideSize) getSlide().getPresentation().getSlideSize()).m2755k4().Clone();
            setX((getX() * f) + ((f - f3) * (((c12015qqClone.m56699x1() / f) / 2.0f) - getX())));
            setWidth(getWidth() * f3);
            setY((getY() * f2) + ((f2 - f3) * (((c12015qqClone.m56697kk() / f2) / 2.0f) - getY())));
            height = getHeight() * f3;
        }
        setHeight(height);
        m2579to(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2554k4(byte b, byte b2, byte b3, long j, boolean z) {
        this.f3328yj = new Placeholder(b, b2, b3, j, z);
        if (getSlide() != null) {
            ((BaseSlide) getSlide()).f1084x1.m5440x1(this);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m2568kk(long j) {
        if ((mo272to().m69039ix() & 4294967295L) != 0) {
            throw new InvalidOperationException("ShapeId had been initialized already.");
        }
        m2577to(j);
    }

    /* JADX INFO: renamed from: to */
    public final void m2579to(boolean z) {
        mo277dy();
        this.f3304fa = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2588x1(ShapeFrame shapeFrame) {
        m2563k4(m2566kk(shapeFrame).Clone());
        m2541to();
    }

    /* JADX INFO: renamed from: x1 */
    private void m2542x1(er8 er8Var) {
        this.f3296ak = er8Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2555k4(double d, double d2) {
        mo1650kk(new tbp(d, d2));
    }

    /* JADX INFO: renamed from: k4 */
    public void mo2261k4(float f) {
        m2591x1(new oju(f, m2593xk().getHeight()));
    }

    /* JADX INFO: renamed from: kk */
    public void mo1650kk(tbp tbpVar) {
        m2548dq().m67992x1(tbpVar.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public void m2589x1(AbstractC3150x6 abstractC3150x6) {
        m2561k4(abstractC3150x6, (ISVGOptions) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo1646k4(float f, float f2) {
        Shape[] shapeArrM2547c6 = m2547c6();
        if (shapeArrM2547c6.length != 0 && getX() == shapeArrM2547c6[0].getX() && getY() == shapeArrM2547c6[0].getY() && getWidth() == shapeArrM2547c6[0].getWidth() && getHeight() == shapeArrM2547c6[0].getHeight()) {
            return;
        }
        m2579to(true);
        if (C7019kk.m27469x1(getSlide(), MasterSlide.class) || C7019kk.m27469x1(getSlide(), LayoutSlide.class)) {
            setX(getX() * f);
            setWidth(getWidth() * f);
            setY(getY() * f2);
            setHeight(getHeight() * f2);
        } else {
            if (getSlide() == null) {
                throw new NullReferenceException("Slide couldn't be empty.");
            }
            C12015qq c12015qqClone = ((SlideSize) getSlide().getPresentation().getSlideSize()).m2755k4().Clone();
            setX(((c12015qqClone.m56699x1() - (c12015qqClone.m56699x1() / f)) / 2.0f) + getX());
            setY(((c12015qqClone.m56697kk() - (c12015qqClone.m56697kk() / f2)) / 2.0f) + getY());
        }
        m2579to(false);
    }

    /* JADX INFO: renamed from: kk */
    public final void m2569kk(boolean z) {
        this.f3323wy = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2590x1(nuk nukVar) {
        m2563k4(m2567kk(nukVar.Clone()).Clone());
        m2541to();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo282k4(float f, float f2, float f3) {
        Shape[] shapeArrM2547c6 = m2547c6();
        if (shapeArrM2547c6.length != 0 && getX() == shapeArrM2547c6[0].getX() && getY() == shapeArrM2547c6[0].getY() && getWidth() == shapeArrM2547c6[0].getWidth() && getHeight() == shapeArrM2547c6[0].getHeight()) {
            return;
        }
        m2587x1(f, f2, f3);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2591x1(oju ojuVar) {
        ShapeFrame shapeFrameM2593xk = m2593xk();
        setFrame(new ShapeFrame(shapeFrameM2593xk.getX(), shapeFrameM2593xk.getY(), ojuVar.f47836k4, ojuVar.f47837x1, shapeFrameM2593xk.getFlipH(), shapeFrameM2593xk.getFlipV(), shapeFrameM2593xk.getRotation()));
        m2570kp();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2556k4(EffectFormat effectFormat) {
        this.f3322wl = effectFormat;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2592x1(InterfaceC14397rj interfaceC14397rj) {
        this.f3308k4 = interfaceC14397rj;
        this.f3324x1 = null;
        this.f3309kk = null;
        this.f3316to = (ShapeCollection) C7019kk.m27452k4((Object) interfaceC14397rj, ShapeCollection.class);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2536k4(GroupShape groupShape) {
        IGenericEnumerator<IShape> it = groupShape.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (C7019kk.m27469x1(shape, GroupShape.class)) {
                    m2536k4((GroupShape) shape);
                } else {
                    shape.mo277dy();
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
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2557k4(LineFormat lineFormat) {
        this.f3300c5 = lineFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2558k4(Shape shape) {
        this.f3298b3 = shape;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2559k4(ShapeFrame shapeFrame) {
        m2588x1(shapeFrame);
    }

    /* JADX INFO: renamed from: k4 */
    private void m2537k4(C0735a7 c0735a7) {
        if (c0735a7.m3308ck() == -1) {
            ((GeometryShape) this).m1591yj().m3331x1(-1);
        } else {
            ((GeometryShape) this).mo272to().m70449k4(C0735a7.m3305k4(c0735a7).m3314k4());
            c0735a7.m3317k4(-1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2560k4(er8 er8Var) {
        if (er8Var == null) {
            er8Var = new er8(this);
        }
        m2542x1(er8Var);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2561k4(AbstractC3150x6 abstractC3150x6, ISVGOptions iSVGOptions) {
        m2546bz().m5639k4(abstractC3150x6, iSVGOptions);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2562k4(nd1 nd1Var) {
        this.f3314qq = nd1Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2563k4(nuk nukVar) {
        mo2564k4(nukVar.f47615k4.m68629x1().Clone(), nukVar.f47617x1.m68629x1().Clone(), nukVar.f47616kk.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo2564k4(tbp tbpVar, tbp tbpVar2, C1258im c1258im) {
        nd1 nd1VarM2548dq = m2548dq();
        nd1VarM2548dq.m67987k4(tbpVar.Clone());
        mo1650kk(tbpVar2.Clone());
        nd1VarM2548dq.m67986k4(c1258im.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2565k4(oju ojuVar) {
        IShapeFrame frame = getFrame();
        if (frame.getX() == ojuVar.f47836k4 && frame.getY() == ojuVar.f47837x1) {
            return false;
        }
        setFrame(new ShapeFrame(ojuVar.f47836k4, ojuVar.f47837x1, frame.getWidth(), frame.getHeight(), frame.getFlipH(), frame.getFlipV(), frame.getRotation()));
        m2570kp();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private ShapeElement[] m2538k4(SketchFormat sketchFormat, C0735a7 c0735a7) {
        return sketchFormat.m2670du().m3308ck() != -1 ? sketchFormat.m2670du().m3327k4(this, getX(), getY(), getWidth(), getHeight()) : c0735a7 != null ? c0735a7.m3327k4(this, getX(), getY(), getWidth(), getHeight()) : ((GeometryShape) this).m1591yj().m3327k4(this, getX(), getY(), getWidth(), getHeight());
    }
}
