package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class NotesSlide extends BaseSlide implements INotesSlide {

    /* JADX INFO: renamed from: c5 */
    private NotesSlideHeaderFooterManager f2847c5;

    /* JADX INFO: renamed from: ck */
    private boolean f2848ck;

    /* JADX INFO: renamed from: dy */
    private ac6 f2849dy;

    /* JADX INFO: renamed from: h4 */
    Slide f2850h4;

    /* JADX INFO: renamed from: jd */
    private final NotesSlideThemeManager f2851jd;

    /* JADX INFO: renamed from: m9 */
    private tob f2852m9;

    public NotesSlide(NotesSlideManager notesSlideManager) {
        super(notesSlideManager);
        if (this.f2849dy == null) {
            this.f2849dy = new ac6();
        }
        if (this.f2852m9 == null) {
            this.f2852m9 = new tob();
        }
        this.f2849dy.m6934k4(this);
        this.f2851jd = new NotesSlideThemeManager(this);
        this.f2850h4 = notesSlideManager.m2036k4();
        this.f2848ck = true;
        z6w.m74337k4(this);
        m397k4(new l6i(this));
    }

    @Override // com.aspose.slides.INotesSlide
    public final INotesSlideHeaderFooterManager getHeaderFooterManager() {
        if (this.f2847c5 == null) {
            this.f2847c5 = new NotesSlideHeaderFooterManager(this);
        }
        return this.f2847c5;
    }

    @Override // com.aspose.slides.INotesSlide
    public final ITextFrame getNotesTextFrame() {
        IGenericEnumerator<IShape> it = getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (shape.getPlaceholder() != null && shape.getPlaceholder().getType() == 1 && C7019kk.m27469x1(shape, AutoShape.class)) {
                    return ((AutoShape) shape).getTextFrame();
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

    @Override // com.aspose.slides.INotesSlide
    public final ISlide getParentSlide() {
        return this.f2850h4;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public boolean getShowMasterShapes() {
        return this.f2848ck;
    }

    @Override // com.aspose.slides.IOverrideThemeable
    public final IOverrideThemeManager getThemeManager() {
        return this.f2851jd;
    }

    /* JADX INFO: renamed from: ix */
    public final ac6 m2032ix() {
        if (this.f2849dy == null) {
            this.f2849dy = new ac6();
        }
        return this.f2849dy;
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: k4 */
    public Shape[] mo399k4(IPlaceholder iPlaceholder) {
        if (getPresentation() == null || getPresentation().getMasterNotesSlideManager().getMasterNotesSlide() == null) {
            return BaseSlide.f1067du;
        }
        Shape shapeM5435k4 = ((BaseSlide) getPresentation().getMasterNotesSlideManager().getMasterNotesSlide()).f1084x1.m5435k4(iPlaceholder, (Placeholder) null);
        return shapeM5435k4 == null ? BaseSlide.f1067du : new Shape[]{shapeM5435k4};
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: kk */
    public AbstractC0919dx mo400kk() {
        if (this.f2852m9 == null) {
            this.f2852m9 = new tob();
        }
        return this.f2852m9;
    }

    /* JADX INFO: renamed from: ne */
    public final tob m2033ne() {
        if (this.f2852m9 == null) {
            this.f2852m9 = new tob();
        }
        return this.f2852m9;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setShowMasterShapes(boolean z) {
        this.f2848ck = z;
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: to */
    public AbstractC1165gx mo404to() {
        if (this.f2849dy == null) {
            this.f2849dy = new ac6();
        }
        return this.f2849dy;
    }

    /* JADX INFO: renamed from: x6 */
    public final l6i m2034x6() {
        return (l6i) m407x1();
    }
}
