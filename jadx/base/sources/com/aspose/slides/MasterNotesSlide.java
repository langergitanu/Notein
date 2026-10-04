package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class MasterNotesSlide extends BaseSlide implements IMasterNotesSlide {

    /* JADX INFO: renamed from: c5 */
    private MasterNotesSlideHeaderFooterManager f2685c5;

    /* JADX INFO: renamed from: dy */
    private ac6 f2686dy;

    /* JADX INFO: renamed from: h4 */
    private TextStyle f2687h4;

    /* JADX INFO: renamed from: jd */
    private final MasterThemeManager f2688jd;

    /* JADX INFO: renamed from: m9 */
    private wun f2689m9;

    public MasterNotesSlide(s8a s8aVar) {
        super(s8aVar);
        if (this.f2686dy == null) {
            this.f2686dy = new ac6();
        }
        if (this.f2689m9 == null) {
            this.f2689m9 = new wun();
        }
        this.f2686dy.m6934k4(this);
        MasterThemeManager masterThemeManager = new MasterThemeManager(this);
        this.f2688jd = masterThemeManager;
        MasterTheme masterTheme = new MasterTheme((InterfaceC14397rj) s8aVar.f2127h4);
        hy0.m7330k4(masterTheme);
        masterThemeManager.setOverrideTheme(masterTheme);
        masterThemeManager.setOverrideThemeEnabled(true);
        this.f2687h4 = new TextStyle(this);
        m397k4(new C14168n5(this));
    }

    @Override // com.aspose.slides.IMasterNotesSlide
    public final IMasterNotesSlideHeaderFooterManager getHeaderFooterManager() {
        if (this.f2685c5 == null) {
            this.f2685c5 = new MasterNotesSlideHeaderFooterManager(this);
        }
        return this.f2685c5;
    }

    @Override // com.aspose.slides.IMasterNotesSlide
    public final ITextStyle getNotesStyle() {
        return this.f2687h4;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public boolean getShowMasterShapes() {
        return false;
    }

    @Override // com.aspose.slides.IMasterThemeable
    public final IMasterThemeManager getThemeManager() {
        return this.f2688jd;
    }

    /* JADX INFO: renamed from: ix */
    public final void m1931ix() {
        IGenericEnumerator<IShape> it = getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (shape.getPlaceholder() != null && shape.getPlaceholder().getType() == 14) {
                    C12015qq c12015qqClone = ((SlideSize) getPresentation().getSlideSize()).m2755k4().Clone();
                    float width = shape.getWidth();
                    shape.setWidth((shape.getHeight() * c12015qqClone.m56699x1()) / c12015qqClone.m56697kk());
                    shape.setX(((width - shape.getWidth()) / 2.0f) + shape.getX());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: kk */
    public AbstractC0919dx mo400kk() {
        if (this.f2689m9 == null) {
            this.f2689m9 = new wun();
        }
        return this.f2689m9;
    }

    /* JADX INFO: renamed from: ne */
    public final ac6 m1932ne() {
        if (this.f2686dy == null) {
            this.f2686dy = new ac6();
        }
        return this.f2686dy;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setShowMasterShapes(boolean z) {
        if (z) {
            throw new NotSupportedException("MasterNotesSlide doesn't contain another master slide and doesn't support this setter.");
        }
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: to */
    public AbstractC1165gx mo404to() {
        if (this.f2686dy == null) {
            this.f2686dy = new ac6();
        }
        return this.f2686dy;
    }

    /* JADX INFO: renamed from: x6 */
    public final wun m1933x6() {
        if (this.f2689m9 == null) {
            this.f2689m9 = new wun();
        }
        return this.f2689m9;
    }
}
