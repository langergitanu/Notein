package com.aspose.slides;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.android.Size;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p466vu.AbstractC11874k4;
import com.aspose.slides.internal.p466vu.C11875x1;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Slide extends BaseSlide implements ISlide {

    /* JADX INFO: renamed from: c5 */
    private LayoutSlide f3380c5;

    /* JADX INFO: renamed from: ck */
    private SlideHeaderFooterManager f3381ck;

    /* JADX INFO: renamed from: dy */
    private ey6 f3382dy;

    /* JADX INFO: renamed from: fa */
    private final SlideThemeManager f3383fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC0625k4 f3384h4;

    /* JADX INFO: renamed from: jd */
    private final NotesSlideManager f3385jd;

    /* JADX INFO: renamed from: ks */
    private boolean f3386ks;

    /* JADX INFO: renamed from: m9 */
    private rq8 f3387m9;

    /* JADX INFO: renamed from: rv */
    private int f3388rv;

    /* JADX INFO: renamed from: up */
    private boolean f3389up;

    /* JADX INFO: renamed from: yj */
    private final List<IComment> f3390yj;

    /* JADX INFO: renamed from: com.aspose.slides.Slide$k4 */
    public static abstract class AbstractC0625k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo2723k4();
    }

    public Slide(SlideCollection slideCollection) {
        super(slideCollection);
        this.f3390yj = new List<>();
        if (this.f3387m9 == null) {
            this.f3387m9 = new rq8();
        }
        if (this.f3382dy == null) {
            this.f3382dy = new ey6();
        }
        this.f3382dy.m6934k4(this);
        this.f3383fa = new SlideThemeManager(this);
        this.f3385jd = new NotesSlideManager(this);
        this.f3386ks = true;
        this.f3388rv = -1;
        this.f1076k4 = new SlideShowTransition(this);
        m397k4(new q1f(this));
    }

    /* JADX INFO: renamed from: ak */
    private void m2681ak() {
        LayoutSlide layoutSlide = this.f3380c5;
        if (layoutSlide != null) {
            layoutSlide.f1084x1.f4741k4.mo27432x1(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.Slide.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(Slide.this.f1084x1) + "Aspose.Slides.PlaceholderCollection.ParentSlideParagraphChanged(Aspose.Slides.ParagraphFormat)";
                }
            });
        }
    }

    /* JADX INFO: renamed from: b3 */
    private void m2682b3() {
        if (this.f3380c5 == null) {
            return;
        }
        m2710u4().m418to();
    }

    /* JADX INFO: renamed from: dq */
    private void m2683dq() {
        LayoutSlide layoutSlide = this.f3380c5;
        if (layoutSlide != null) {
            layoutSlide.f1084x1.f4741k4.mo27429k4(new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.Slide.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(Slide.this.f1084x1) + "Aspose.Slides.PlaceholderCollection.ParentSlideParagraphChanged(Aspose.Slides.ParagraphFormat)";
                }
            });
        }
    }

    /* JADX INFO: renamed from: wy */
    private void m2684wy() {
        if (this.f3380c5 == null) {
            return;
        }
        ((PresentationHeaderFooterManager) getPresentation().getHeaderFooterManager()).m2428k4(this, m2687bv());
    }

    /* JADX INFO: renamed from: ar */
    public final int m2686ar() {
        int i = this.f3388rv;
        return i == -1 ? getSlideNumber() : i;
    }

    /* JADX INFO: renamed from: bv */
    public final LayoutSlide m2687bv() {
        return this.f3380c5;
    }

    @Override // com.aspose.slides.ISlide
    public final ISlideHeaderFooterManager getHeaderFooterManager() {
        return m2710u4();
    }

    @Override // com.aspose.slides.ISlide
    public final boolean getHidden() {
        return !this.f3389up;
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage() {
        return new yyn(m2711um());
    }

    @Override // com.aspose.slides.ISlide
    public final ILayoutSlide getLayoutSlide() {
        return this.f3380c5;
    }

    @Override // com.aspose.slides.ISlide
    public final INotesSlideManager getNotesSlideManager() {
        return this.f3385jd;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public boolean getShowMasterShapes() {
        return this.f3386ks;
    }

    @Override // com.aspose.slides.ISlide
    public final IComment[] getSlideComments(ICommentAuthor iCommentAuthor) {
        Object[] array;
        if (iCommentAuthor == null) {
            array = this.f3390yj.toArray(new IComment[0]);
        } else {
            List list = new List(this.f3390yj.size());
            List.Enumerator<IComment> it = this.f3390yj.iterator();
            while (it.hasNext()) {
                try {
                    Comment comment = (Comment) it.next();
                    if (comment.getAuthor() == iCommentAuthor) {
                        list.addItem(comment);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            array = list.toArray(new IComment[0]);
        }
        return (IComment[]) array;
    }

    @Override // com.aspose.slides.ISlide
    public final int getSlideNumber() {
        return getPresentation().getSlides().indexOf(this) + getPresentation().getFirstSlideNumber();
    }

    @Override // com.aspose.slides.IOverrideThemeable
    public final IOverrideThemeManager getThemeManager() {
        return this.f3383fa;
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail() {
        return (Bitmap) C12009k4.m56588k4(m2711um());
    }

    /* JADX INFO: renamed from: ix */
    public final ey6 m2688ix() {
        if (this.f3382dy == null) {
            this.f3382dy = new ey6();
        }
        return this.f3382dy;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void joinPortionsWithSameFormatting() {
        if (getNotesSlideManager().getNotesSlide() != null) {
            getNotesSlideManager().getNotesSlide().joinPortionsWithSameFormatting();
        }
        super.joinPortionsWithSameFormatting();
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2689k4(IRenderingOptions iRenderingOptions) {
        return m2690k4(iRenderingOptions, 0.2f, 0.2f);
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: kk */
    public AbstractC0919dx mo400kk() {
        if (this.f3387m9 == null) {
            this.f3387m9 = new rq8();
        }
        return this.f3387m9;
    }

    /* JADX INFO: renamed from: lr */
    public final int m2707lr() {
        int i = (!m2714wl() || m2713v4().getShapes().size() <= 0) ? 0 : 1;
        if (m2712uz() && getLayoutSlide().getShapes().size() > 0) {
            i++;
        }
        if (getShapes().size() > 0) {
            i++;
        }
        if (m2714wl() && m2713v4().getControls().size() > 0) {
            i++;
        }
        if (m2712uz() && getLayoutSlide().getControls().size() > 0) {
            i++;
        }
        return getControls().size() > 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: ne */
    public final rq8 m2708ne() {
        if (this.f3387m9 == null) {
            this.f3387m9 = new rq8();
        }
        return this.f3387m9;
    }

    /* JADX INFO: renamed from: qq */
    public final int m2709qq() {
        return getPresentation().getSlides().indexOf(this);
    }

    @Override // com.aspose.slides.ISlide
    public final void remove() {
        if (m403rv() == null) {
            throw new PptxEditException("Slide is already removed from presentation.");
        }
        m403rv().getSlides().remove(this);
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final void renderToGraphics(IRenderingOptions iRenderingOptions, Canvas canvas) {
        m2698k4(iRenderingOptions, AbstractC12008jd.m56583k4(canvas));
    }

    @Override // com.aspose.slides.ISlide
    public final void reset() {
        IGenericEnumerator<IShape> it = getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                Placeholder placeholder = (Placeholder) shape.getPlaceholder();
                if (placeholder != null && (placeholder.getIndex() & 4294967295L) != 4294967295L) {
                    shape.mo280jd();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        List.Enumerator<Shape> it2 = this.f3380c5.m385dy().iterator();
        while (it2.hasNext()) {
            try {
                Shape next = it2.next();
                Placeholder placeholder2 = (Placeholder) next.getPlaceholder();
                if (placeholder2 != null && (placeholder2.getIndex() & 4294967295L) != 4294967295L && m406x1(placeholder2.getIndex()) == null && placeholder2.getType() != 6 && placeholder2.getType() != 7 && placeholder2.getType() != 5 && placeholder2.getType() != 4) {
                    Shape shape2 = (Shape) getShapes().addClone(next);
                    shape2.addPlaceholder(placeholder2);
                    if (C7019kk.m27469x1(shape2, AutoShape.class)) {
                        ((AutoShape) shape2).m288x1().setText("");
                    }
                    shape2.mo280jd();
                }
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
    }

    @Override // com.aspose.slides.ISlide
    public final void setHidden(boolean z) {
        this.f3389up = !z;
    }

    @Override // com.aspose.slides.ISlide
    public final void setLayoutSlide(ILayoutSlide iLayoutSlide) {
        m2685x1(iLayoutSlide);
        m2683dq();
        m2682b3();
        this.f3380c5 = (LayoutSlide) iLayoutSlide;
        m2684wy();
        m2681ak();
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setShowMasterShapes(boolean z) {
        this.f3386ks = z;
    }

    @Override // com.aspose.slides.ISlide
    public final void setSlideNumber(int i) {
        if (i < getPresentation().getFirstSlideNumber()) {
            getPresentation().setFirstSlideNumber(i);
        }
        getPresentation().getSlides().reorder(i - 1, this);
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: to */
    public AbstractC1165gx mo404to() {
        if (this.f3382dy == null) {
            this.f3382dy = new ey6();
        }
        return this.f3382dy;
    }

    /* JADX INFO: renamed from: u4 */
    public final SlideHeaderFooterManager m2710u4() {
        if (this.f3381ck == null) {
            this.f3381ck = new SlideHeaderFooterManager(this);
        }
        return this.f3381ck;
    }

    /* JADX INFO: renamed from: um */
    public C12009k4 m2711um() {
        return m2706kk(0.2f, 0.2f);
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m2712uz() {
        return this.f3386ks && this.f3380c5 != null;
    }

    /* JADX INFO: renamed from: v4 */
    public final IMasterSlide m2713v4() {
        LayoutSlide layoutSlide = this.f3380c5;
        if (layoutSlide == null) {
            return null;
        }
        return layoutSlide.getMasterSlide();
    }

    /* JADX INFO: renamed from: wl */
    public final boolean m2714wl() {
        return m2712uz() && this.f3380c5.getShowMasterShapes() && this.f3380c5.getMasterSlide() != null;
    }

    @Override // com.aspose.slides.ISlide
    public final void writeAsSvg(OutputStream outputStream) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Slide.1
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Slide.this.m2703k4(abstractC3150x6);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public IImage m2715x1(IRenderingOptions iRenderingOptions, C12023wl c12023wl) {
        return new yyn(m2691k4(iRenderingOptions, c12023wl.Clone()));
    }

    /* JADX INFO: renamed from: x6 */
    public final q1f m2721x6() {
        return (q1f) m407x1();
    }

    /* JADX INFO: renamed from: yd */
    public final AbstractC0625k4 m2722yd() {
        return this.f3384h4;
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage(float f, float f2) {
        return new yyn(m2706kk(f, f2));
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail(float f, float f2) {
        return (Bitmap) C12009k4.m56588k4(m2706kk(f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2690k4(IRenderingOptions iRenderingOptions, float f, float f2) {
        float fM56697kk;
        C12023wl c12023wl = new C12023wl();
        C12015qq c12015qqClone = ((SlideSize) m403rv().getSlideSize()).m2755k4().Clone();
        if (((RenderingOptions) iRenderingOptions).m2474k4().getNotesPosition() != 0) {
            c12023wl.m56860k4(C7019kk.m27462to(Float.valueOf((((NotesSize) m403rv().getNotesSize()).m2030k4().m56699x1() + (iRenderingOptions.getNotesCommentsLayouting().getCommentsPosition() == 2 ? ((RenderingOptions) iRenderingOptions).m2474k4().getCommentsAreaWidth() : 0.0f)) * f), 13));
            fM56697kk = ((NotesSize) m403rv().getNotesSize()).m2030k4().m56697kk();
        } else {
            c12023wl.m56860k4(C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1() * f), 13));
            fM56697kk = c12015qqClone.m56697kk();
        }
        c12023wl.m56866x1(C7019kk.m27462to(Float.valueOf(fM56697kk * f2), 13));
        return m2691k4(iRenderingOptions, c12023wl.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public C12009k4 m2706kk(float f, float f2) {
        C12015qq c12015qqClone = ((SlideSize) getPresentation().getSlideSize()).m2755k4().Clone();
        return m2693k4(new C12023wl(OooO.OooO00o(c12015qqClone.m56699x1() * f, 14), OooO.OooO00o(C7019kk.m27462to(Float.valueOf(c12015qqClone.m56697kk()), 13) * f2, 14)).Clone());
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final void renderToGraphics(IRenderingOptions iRenderingOptions, Canvas canvas, float f, float f2) {
        m2699k4(iRenderingOptions, AbstractC12008jd.m56583k4(canvas), f, f2);
    }

    @Override // com.aspose.slides.ISlide
    public final void writeAsSvg(OutputStream outputStream, final ISVGOptions iSVGOptions) {
        C11875x1.m55458k4(new AbstractC11874k4(outputStream) { // from class: com.aspose.slides.Slide.2
            @Override // com.aspose.slides.internal.p466vu.AbstractC11874k4
            /* JADX INFO: renamed from: k4 */
            public void mo1976k4(AbstractC3150x6 abstractC3150x6) {
                Slide.this.m2704k4(abstractC3150x6, iSVGOptions);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public IImage m2716x1(C12023wl c12023wl) {
        return new yyn(m2693k4(c12023wl.Clone()));
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage(IRenderingOptions iRenderingOptions) {
        return new yyn(m2689k4(iRenderingOptions));
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail(IRenderingOptions iRenderingOptions) {
        return (Bitmap) C12009k4.m56588k4(m2689k4(iRenderingOptions));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2691k4(IRenderingOptions iRenderingOptions, C12023wl c12023wl) {
        TiffOptions tiffOptions = new TiffOptions();
        tiffOptions.m3016x1().m2027k4(iRenderingOptions.getNotesCommentsLayouting());
        tiffOptions.m3015k4(c12023wl.Clone());
        tiffOptions.setDefaultRegularFont(iRenderingOptions.getDefaultRegularFont());
        tiffOptions.setWarningCallback(iRenderingOptions.getWarningCallback());
        tiffOptions.getInkOptions().setHideInk(iRenderingOptions.getInkOptions().getHideInk());
        tiffOptions.getInkOptions().setInterpretMaskOpAsOpacity(iRenderingOptions.getInkOptions().getInterpretMaskOpAsOpacity());
        tiffOptions.setGradientStyle(iRenderingOptions.getGradientStyle());
        return m2692k4(tiffOptions);
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final void renderToGraphics(IRenderingOptions iRenderingOptions, Canvas canvas, Size size) {
        m2700k4(iRenderingOptions, AbstractC12008jd.m56583k4(canvas), C12023wl.m56855k4(size));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2717x1(int i) {
        this.f3388rv = i;
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage(IRenderingOptions iRenderingOptions, float f, float f2) {
        return new yyn(m2690k4(iRenderingOptions, f, f2));
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail(IRenderingOptions iRenderingOptions, float f, float f2) {
        return (Bitmap) C12009k4.m56588k4(m2690k4(iRenderingOptions, f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2692k4(ITiffOptions iTiffOptions) {
        return m2721x6().m69370k4(iTiffOptions);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2718x1(IComment iComment) {
        this.f3390yj.removeItem(iComment);
    }

    /* JADX INFO: renamed from: x1 */
    private void m2685x1(ILayoutSlide iLayoutSlide) {
        if (iLayoutSlide != null && iLayoutSlide.getPresentation() != getPresentation()) {
            throw new PptxEditException("Layout slide must be from the same presentation.");
        }
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage(IRenderingOptions iRenderingOptions, Size size) {
        return m2715x1(iRenderingOptions, C12023wl.m56855k4(size));
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail(IRenderingOptions iRenderingOptions, Size size) {
        return (Bitmap) C12009k4.m56588k4(m2691k4(iRenderingOptions, C12023wl.m56855k4(size)));
    }

    /* JADX INFO: renamed from: k4 */
    public C12009k4 m2693k4(C12023wl c12023wl) {
        return m2721x6().m69371k4(c12023wl.Clone());
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage(ITiffOptions iTiffOptions) {
        return new yyn(m2692k4(iTiffOptions));
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail(ITiffOptions iTiffOptions) {
        return (Bitmap) C12009k4.m56588k4(m2692k4(iTiffOptions));
    }

    /* JADX INFO: renamed from: k4 */
    public final C14250os m2694k4(boolean z, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, List<Integer> list, InterruptionToken interruptionToken) {
        C14250os c14250os = new C14250os(C7019kk.m27462to(Float.valueOf(((SlideSize) getPresentation().getSlideSize()).m2755k4().m56699x1()), 13), C7019kk.m27462to(Float.valueOf(((SlideSize) getPresentation().getSlideSize()).m2755k4().m56697kk()), 13), 72.0f, 72.0f, z, c13700js, ((Presentation) getPresentation()).m2385ks(), list);
        m2721x6().m69376k4(c14250os, c12210k4, c13700js, interruptionToken);
        return c14250os;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2719x1(LayoutSlide layoutSlide) {
        this.f3380c5 = layoutSlide;
    }

    @Override // com.aspose.slides.ISlide
    public final IImage getImage(Size size) {
        return m2716x1(C12023wl.m56855k4(size));
    }

    @Override // com.aspose.slides.ISlide
    @Deprecated
    public final Bitmap getThumbnail(Size size) {
        return (Bitmap) C12009k4.m56588k4(m2693k4(C12023wl.m56855k4(size)));
    }

    /* JADX INFO: renamed from: k4 */
    public final C14250os m2695k4(boolean z, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, InterruptionToken interruptionToken) {
        C14250os c14250os = new C14250os(C7019kk.m27462to(Float.valueOf(((SlideSize) getPresentation().getSlideSize()).m2755k4().m56699x1()), 13), C7019kk.m27462to(Float.valueOf(((SlideSize) getPresentation().getSlideSize()).m2755k4().m56697kk()), 13), 72.0f, 72.0f, z, c13700js, ((Presentation) getPresentation()).m2385ks(), null);
        m2721x6().m69376k4(c14250os, c12210k4, c13700js, interruptionToken);
        return c14250os;
    }

    /* JADX INFO: renamed from: x1 */
    public final IComment[] m2720x1(ICommentAuthor iCommentAuthor) {
        List list = new List();
        for (IComment iComment : getSlideComments(iCommentAuthor)) {
            if (C7019kk.m27469x1(iComment, ModernComment.class)) {
                list.addItem(iComment);
            }
        }
        return (IComment[]) list.toArray(new IComment[0]);
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: k4 */
    public void mo393k4(float f, float f2, float f3) {
        if (BaseSlide.m380k4(f) || BaseSlide.m380k4(f2)) {
            super.mo393k4(f, f2, f3);
            NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) getNotesSlideManager().getNotesSlide(), NotesSlide.class);
            if (notesSlide != null) {
                notesSlide.mo393k4(f, f2, f3);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2696k4(IComment iComment) {
        this.f3390yj.addItem(iComment);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2697k4(ILayoutSlide iLayoutSlide) {
        m2701k4((LayoutSlide) iLayoutSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2698k4(IRenderingOptions iRenderingOptions, AbstractC12008jd abstractC12008jd) {
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m403rv().m2385ks().m7126k4((String) null);
        } else {
            m403rv().m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            if (iRenderingOptions.getNotesCommentsLayouting().getNotesPosition() == 1) {
                throw new InvalidOperationException("Use NotesPositions.BottomTruncated instead of NotesPositions.BottomFull as result may overflow one page!");
            }
            C0866cq.m4762k4(m403rv(), iRenderingOptions.getNotesCommentsLayouting(), m2709qq() + 1, abstractC12008jd);
        } finally {
            m403rv().m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2699k4(IRenderingOptions iRenderingOptions, AbstractC12008jd abstractC12008jd, float f, float f2) {
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m403rv().m2385ks().m7126k4((String) null);
        } else {
            m403rv().m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            if (iRenderingOptions.getNotesCommentsLayouting().getNotesPosition() == 1) {
                throw new InvalidOperationException("Use NotesPositions.BottomTruncated instead of NotesPositions.BottomFull as result may overflow one page!");
            }
            C0866cq.m4763k4(m403rv(), iRenderingOptions.getNotesCommentsLayouting(), m2709qq() + 1, abstractC12008jd, f, f2);
            m403rv().m2385ks().m7126k4((String) null);
        } catch (Throwable th) {
            m403rv().m2385ks().m7126k4((String) null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m2700k4(IRenderingOptions iRenderingOptions, AbstractC12008jd abstractC12008jd, C12023wl c12023wl) {
        if (C14113y2.m67411k4(iRenderingOptions.getDefaultRegularFont())) {
            m403rv().m2385ks().m7126k4((String) null);
        } else {
            m403rv().m2385ks().m7126k4(iRenderingOptions.getDefaultRegularFont());
        }
        try {
            if (iRenderingOptions.getNotesCommentsLayouting().getNotesPosition() == 1) {
                throw new InvalidOperationException("Use NotesPositions.BottomTruncated instead of NotesPositions.BottomFull as result may overflow one page!");
            }
            C0866cq.m4764k4(m403rv(), iRenderingOptions.getNotesCommentsLayouting(), m2709qq() + 1, abstractC12008jd, c12023wl.Clone());
        } finally {
            m403rv().m2385ks().m7126k4((String) null);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2701k4(LayoutSlide layoutSlide) {
        m2685x1((ILayoutSlide) layoutSlide);
        m2683dq();
        m2710u4().m420x1(layoutSlide);
        this.f3380c5 = layoutSlide;
        m2681ak();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2702k4(AbstractC0625k4 abstractC0625k4) {
        this.f3384h4 = abstractC0625k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m2703k4(AbstractC3150x6 abstractC3150x6) {
        m2704k4(abstractC3150x6, (ISVGOptions) null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m2704k4(AbstractC3150x6 abstractC3150x6, ISVGOptions iSVGOptions) {
        m2721x6().m69373k4(abstractC3150x6, iSVGOptions);
    }

    /* JADX INFO: renamed from: k4 */
    public final IComment[] m2705k4(ICommentAuthor iCommentAuthor) {
        List list = new List();
        for (IComment iComment : getSlideComments(iCommentAuthor)) {
            if (!C7019kk.m27469x1(iComment, ModernComment.class)) {
                list.addItem(iComment);
            }
        }
        return (IComment[]) list.toArray(new IComment[0]);
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: k4 */
    public Shape[] mo399k4(IPlaceholder iPlaceholder) {
        if (this.f3380c5 == null) {
            return BaseSlide.f1067du;
        }
        if (iPlaceholder.getIndex() == 4294967295L) {
            Shape shapeM5439x1 = this.f3380c5.f1084x1.m5439x1((Placeholder) iPlaceholder);
            shapeM5435k4 = this.f3380c5.getMasterSlide() != null ? ((BaseSlide) this.f3380c5.getMasterSlide()).f1084x1.m5435k4(iPlaceholder, (Placeholder) null) : null;
            return shapeM5439x1 == null ? shapeM5435k4 == null ? BaseSlide.f1067du : new Shape[]{shapeM5435k4} : shapeM5435k4 == null ? new Shape[]{shapeM5439x1} : new Shape[]{shapeM5439x1, shapeM5435k4};
        }
        Placeholder placeholder = (Placeholder) iPlaceholder;
        Shape shapeM5436k4 = this.f3380c5.f1084x1.m5436k4(placeholder);
        if (shapeM5436k4 != null && this.f3380c5.getMasterSlide() != null) {
            shapeM5435k4 = ((BaseSlide) this.f3380c5.getMasterSlide()).f1084x1.m5435k4(shapeM5436k4.getPlaceholder(), placeholder);
        }
        return shapeM5436k4 == null ? BaseSlide.f1067du : shapeM5435k4 == null ? new Shape[]{shapeM5436k4} : new Shape[]{shapeM5436k4, shapeM5435k4};
    }
}
