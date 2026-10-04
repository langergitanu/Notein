package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p077d8.C3065k4;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.wzi;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class MasterSlide extends BaseSlide implements IMasterSlide {

    /* JADX INFO: renamed from: c5 */
    TextStyle f2691c5;

    /* JADX INFO: renamed from: ck */
    TextStyle f2692ck;

    /* JADX INFO: renamed from: dy */
    TextStyle f2693dy;

    /* JADX INFO: renamed from: fa */
    TextStyle f2694fa;

    /* JADX INFO: renamed from: h4 */
    MasterLayoutSlideCollection f2695h4;

    /* JADX INFO: renamed from: jd */
    TextStyle f2696jd;

    /* JADX INFO: renamed from: ks */
    private hj3 f2697ks;

    /* JADX INFO: renamed from: m9 */
    TextStyle f2698m9;

    /* JADX INFO: renamed from: rv */
    private MasterSlideHeaderFooterManager f2699rv;

    /* JADX INFO: renamed from: up */
    boolean f2700up;

    /* JADX INFO: renamed from: x6 */
    private final MasterThemeManager f2701x6;

    /* JADX INFO: renamed from: yj */
    private wzi f2702yj;

    public MasterSlide(MasterSlideCollection masterSlideCollection) {
        super(masterSlideCollection);
        if (this.f2702yj == null) {
            this.f2702yj = new wzi();
        }
        if (this.f2697ks == null) {
            this.f2697ks = new hj3();
        }
        this.f2697ks.m6934k4(this);
        m1944x6().f49885k4 = new wzi.AbstractC14759k4() { // from class: com.aspose.slides.MasterSlide.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.MasterSlide.AddEmptyLayout(Aspose.Slides.SlideLayoutType)";
            }

            @Override // com.aspose.slides.wzi.AbstractC14759k4
            /* JADX INFO: renamed from: k4 */
            public ILayoutSlide mo1945k4(byte b) {
                return MasterSlide.this.m1943x1(b);
            }
        };
        this.f2701x6 = new MasterThemeManager(this);
        this.f2695h4 = new MasterLayoutSlideCollection(this);
        this.f2698m9 = new TextStyle(this);
        this.f2693dy = new TextStyle(this);
        this.f2691c5 = new TextStyle(this);
        this.f2696jd = new TextStyle(this);
        this.f2692ck = new TextStyle(this);
        this.f2694fa = new TextStyle(this);
        this.f1076k4 = new SlideShowTransition(this);
        m397k4(new C14168n5(this));
    }

    @Override // com.aspose.slides.IMasterSlide
    public final IMasterSlide applyExternalThemeToDependingSlides(String str) {
        try {
            return new C1209hm(C3141rv.m13406kk(str), ((Presentation) getPresentation()).m2349du()).m7222k4(this);
        } catch (C3065k4 e) {
            throw new PptxReadException("External theme reading aborted.", e);
        } catch (RuntimeException e2) {
            throw new PptxException("Applying external theme aborted.", e2);
        }
    }

    @Override // com.aspose.slides.IMasterSlide
    public final ITextStyle getBodyStyle() {
        return this.f2693dy;
    }

    @Override // com.aspose.slides.IMasterSlide
    public final ISlide[] getDependingSlides() {
        List list = new List();
        int size = getPresentation().getSlides().size();
        for (int i = 0; i < size; i++) {
            if (((Slide) getPresentation().getSlides().get_Item(i)).m2713v4() == this) {
                list.addItem(getPresentation().getSlides().get_Item(i));
            }
        }
        return list.size() > 0 ? (ISlide[]) list.toArray(new ISlide[0]) : SlideCollection.f3396x1;
    }

    @Override // com.aspose.slides.IMasterSlide
    public final IMasterSlideHeaderFooterManager getHeaderFooterManager() {
        return m1937ix();
    }

    @Override // com.aspose.slides.IMasterSlide
    public final IMasterLayoutSlideCollection getLayoutSlides() {
        return this.f2695h4;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public String getName() {
        return this.f2701x6.getOverrideTheme().getName();
    }

    @Override // com.aspose.slides.IMasterSlide
    public final ITextStyle getOtherStyle() {
        return this.f2694fa;
    }

    @Override // com.aspose.slides.IMasterSlide
    public final boolean getPreserve() {
        return this.f2700up;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public boolean getShowMasterShapes() {
        return false;
    }

    @Override // com.aspose.slides.IMasterThemeable
    public final IMasterThemeManager getThemeManager() {
        return this.f2701x6;
    }

    @Override // com.aspose.slides.IMasterSlide
    public final ITextStyle getTitleStyle() {
        return this.f2698m9;
    }

    @Override // com.aspose.slides.IMasterSlide
    public final boolean hasDependingSlides() {
        int size = getPresentation().getSlides().size();
        for (int i = 0; i < size; i++) {
            if (((Slide) getPresentation().getSlides().get_Item(i)).m2713v4() == this) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ix */
    public final MasterSlideHeaderFooterManager m1937ix() {
        if (this.f2699rv == null) {
            this.f2699rv = new MasterSlideHeaderFooterManager(this);
        }
        return this.f2699rv;
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: k4 */
    public void mo393k4(float f, float f2, float f3) {
        if (BaseSlide.m380k4(f) || BaseSlide.m380k4(f2)) {
            super.mo393k4(f, f2, f3);
            this.f2698m9.m2983k4(f3);
            this.f2693dy.m2983k4(f3);
            this.f2694fa.m2983k4(f3);
        }
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: kk */
    public AbstractC0919dx mo400kk() {
        if (this.f2702yj == null) {
            this.f2702yj = new wzi();
        }
        return this.f2702yj;
    }

    /* JADX INFO: renamed from: ne */
    public final hj3 m1938ne() {
        if (this.f2697ks == null) {
            this.f2697ks = new hj3();
        }
        return this.f2697ks;
    }

    /* JADX INFO: renamed from: qq */
    public final void m1939qq() {
        this.f1084x1.m5437k4(this);
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setName(String str) {
        this.f2701x6.getOverrideTheme().setName(str);
    }

    @Override // com.aspose.slides.IMasterSlide
    public final void setPreserve(boolean z) {
        this.f2700up = z;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setShowMasterShapes(boolean z) {
        if (z) {
            throw new NotSupportedException("MasterSlide doesn't contain another master slide and doesn't support this setter.");
        }
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: to */
    public AbstractC1165gx mo404to() {
        if (this.f2697ks == null) {
            this.f2697ks = new hj3();
        }
        return this.f2697ks;
    }

    /* JADX INFO: renamed from: u4 */
    public final ITextStyle m1940u4() {
        return this.f2691c5;
    }

    /* JADX INFO: renamed from: uz */
    public final ITextStyle m1941uz() {
        return this.f2696jd;
    }

    /* JADX INFO: renamed from: wl */
    public final ITextStyle m1942wl() {
        return this.f2692ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final ILayoutSlide m1943x1(byte b) {
        return new LayoutSlide(this, b);
    }

    /* JADX INFO: renamed from: x6 */
    public final wzi m1944x6() {
        if (this.f2702yj == null) {
            this.f2702yj = new wzi();
        }
        return this.f2702yj;
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: x1 */
    public void mo408x1(float f, float f2) {
        super.mo408x1(f, f2);
        IGenericEnumerator<ILayoutSlide> it = getLayoutSlides().iterator();
        while (it.hasNext()) {
            try {
                ((LayoutSlide) it.next()).mo408x1(f, f2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
