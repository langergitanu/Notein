package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutSlide extends BaseSlide implements ILayoutSlide {

    /* JADX INFO: renamed from: c5 */
    private LayoutSlideHeaderFooterManager f2574c5;

    /* JADX INFO: renamed from: ck */
    private byte f2575ck;

    /* JADX INFO: renamed from: dy */
    private ey6 f2576dy;

    /* JADX INFO: renamed from: fa */
    private final LayoutSlideThemeManager f2577fa;

    /* JADX INFO: renamed from: h4 */
    private final ParagraphFormat.AbstractC0555k4 f2578h4;

    /* JADX INFO: renamed from: jd */
    private MasterSlide f2579jd;

    /* JADX INFO: renamed from: m9 */
    private tgu f2580m9;

    /* JADX INFO: renamed from: up */
    private boolean f2581up;

    public LayoutSlide(IMasterSlide iMasterSlide, byte b) {
        super((MasterLayoutSlideCollection) iMasterSlide.getLayoutSlides());
        this.f2578h4 = new ParagraphFormat.AbstractC0555k4() { // from class: com.aspose.slides.LayoutSlide.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.PlaceholderCollection.ParentSlideParagraphChanged(Aspose.Slides.ParagraphFormat)";
            }
        };
        if (this.f2576dy == null) {
            this.f2576dy = new ey6();
        }
        if (this.f2580m9 == null) {
            this.f2580m9 = new tgu();
        }
        this.f2576dy.m6934k4(this);
        this.f2577fa = new LayoutSlideThemeManager(this);
        ((GlobalLayoutSlideCollection) iMasterSlide.getPresentation().getLayoutSlides()).mo1851k4(this);
        setMasterSlide(iMasterSlide);
        this.f2575ck = b;
        this.f2581up = true;
        this.f1076k4 = new SlideShowTransition(this);
        m397k4(new C14168n5(this));
    }

    /* JADX INFO: renamed from: k4 */
    private MasterSlide m1844k4(IMasterSlide iMasterSlide) {
        IGenericEnumerator<IMasterSlide> it = getPresentation().getMasters().iterator();
        while (it.hasNext()) {
            try {
                MasterSlide masterSlide = (MasterSlide) it.next();
                if (masterSlide == iMasterSlide) {
                    return masterSlide;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: u4 */
    private void m1846u4() {
        MasterSlide masterSlide = this.f2579jd;
        if (masterSlide != null) {
            masterSlide.f1084x1.f4741k4.mo27429k4(this.f2578h4);
        }
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final ISlide[] getDependingSlides() {
        List list = new List();
        int size = getPresentation().getSlides().size();
        for (int i = 0; i < size; i++) {
            if (((Slide) getPresentation().getSlides().get_Item(i)).m2687bv() == this) {
                list.addItem(getPresentation().getSlides().get_Item(i));
            }
        }
        return list.size() > 0 ? (ISlide[]) list.toArray(new ISlide[0]) : SlideCollection.f3396x1;
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final ILayoutSlideHeaderFooterManager getHeaderFooterManager() {
        if (this.f2574c5 == null) {
            this.f2574c5 = new LayoutSlideHeaderFooterManager(this);
        }
        return this.f2574c5;
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final byte getLayoutType() {
        return this.f2575ck;
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final IMasterSlide getMasterSlide() {
        return this.f2579jd;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public boolean getShowMasterShapes() {
        return this.f2581up;
    }

    @Override // com.aspose.slides.IOverrideThemeable
    public final IOverrideThemeManager getThemeManager() {
        return this.f2577fa;
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final boolean hasDependingSlides() {
        int size = getPresentation().getSlides().size();
        for (int i = 0; i < size; i++) {
            if (((Slide) getPresentation().getSlides().get_Item(i)).getLayoutSlide() == this) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ix */
    public final void m1847ix() {
        MasterSlide masterSlide = this.f2579jd;
        if (masterSlide != null) {
            masterSlide.f1084x1.f4741k4.mo27432x1(this.f2578h4);
        }
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: kk */
    public AbstractC0919dx mo400kk() {
        if (this.f2580m9 == null) {
            this.f2580m9 = new tgu();
        }
        return this.f2580m9;
    }

    /* JADX INFO: renamed from: ne */
    public final ey6 m1848ne() {
        if (this.f2576dy == null) {
            this.f2576dy = new ey6();
        }
        return this.f2576dy;
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final void remove() {
        if (m403rv() == null) {
            throw new PptxEditException("Slide is already removed from presentation.");
        }
        synchronized (((LayoutSlideCollection) m403rv().getLayoutSlides()).f2583k4.getSyncRoot()) {
            try {
                if (hasDependingSlides()) {
                    throw new PptxEditException("Error removing layout slide: this layout slide is used in presentation.");
                }
                m1846u4();
                ((LayoutSlideCollection) this.f2579jd.getLayoutSlides()).f2583k4.removeItem(this);
                ((LayoutSlideCollection) m403rv().getLayoutSlides()).f2583k4.removeItem(this);
                this.f2579jd = null;
                m398k4((InterfaceC14397rj) null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.ILayoutSlide
    public final void setMasterSlide(IMasterSlide iMasterSlide) {
        if (this.f2579jd == iMasterSlide) {
            return;
        }
        if (iMasterSlide != null && iMasterSlide.getPresentation() != getPresentation()) {
            throw new PptxEditException("Master slide must be from the same presentation.");
        }
        if (this.f2579jd != null) {
            MasterSlide masterSlideM1844k4 = m1844k4(iMasterSlide);
            if (masterSlideM1844k4 != null) {
                m1845k4(masterSlideM1844k4);
                return;
            }
            remove();
        }
        this.f2579jd = (MasterSlide) iMasterSlide;
        if (iMasterSlide != null) {
            m1847ix();
            m398k4((LayoutSlideCollection) this.f2579jd.getLayoutSlides());
            ((LayoutSlideCollection) this.f2579jd.getLayoutSlides()).mo1851k4(this);
        }
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setShowMasterShapes(boolean z) {
        this.f2581up = z;
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: to */
    public AbstractC1165gx mo404to() {
        if (this.f2576dy == null) {
            this.f2576dy = new ey6();
        }
        return this.f2576dy;
    }

    /* JADX INFO: renamed from: x6 */
    public final tgu m1849x6() {
        if (this.f2580m9 == null) {
            this.f2580m9 = new tgu();
        }
        return this.f2580m9;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1845k4(MasterSlide masterSlide) {
        ((LayoutSlideCollection) this.f2579jd.getLayoutSlides()).f2583k4.removeItem(this);
        this.f2579jd = masterSlide;
        m1847ix();
        m398k4((LayoutSlideCollection) this.f2579jd.getLayoutSlides());
        ((LayoutSlideCollection) this.f2579jd.getLayoutSlides()).mo1851k4(this);
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: k4 */
    public Shape[] mo399k4(IPlaceholder iPlaceholder) {
        Shape shapeM5435k4;
        MasterSlide masterSlide = this.f2579jd;
        if (masterSlide != null && (shapeM5435k4 = masterSlide.f1084x1.m5435k4(iPlaceholder, (Placeholder) null)) != null) {
            return new Shape[]{shapeM5435k4};
        }
        return BaseSlide.f1067du;
    }
}
