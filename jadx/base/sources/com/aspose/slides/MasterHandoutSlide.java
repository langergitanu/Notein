package com.aspose.slides;

import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: loaded from: classes3.dex */
public class MasterHandoutSlide extends BaseSlide implements IMasterHandoutSlide {

    /* JADX INFO: renamed from: c5 */
    private final MasterThemeManager f2680c5;

    /* JADX INFO: renamed from: dy */
    private MasterHandoutSlideHeaderFooterManager f2681dy;

    /* JADX INFO: renamed from: h4 */
    private g4c f2682h4;

    /* JADX INFO: renamed from: m9 */
    private lyy f2683m9;

    public MasterHandoutSlide(t4w t4wVar) {
        super(t4wVar);
        if (this.f2683m9 == null) {
            this.f2683m9 = new lyy();
        }
        if (this.f2682h4 == null) {
            this.f2682h4 = new g4c();
        }
        this.f2683m9.m6934k4(this);
        MasterThemeManager masterThemeManager = new MasterThemeManager(this);
        this.f2680c5 = masterThemeManager;
        MasterTheme masterTheme = new MasterTheme((InterfaceC14397rj) t4wVar.f2127h4);
        hy0.m7330k4(masterTheme);
        masterThemeManager.setOverrideTheme(masterTheme);
        masterThemeManager.setOverrideThemeEnabled(true);
        m397k4(new C14168n5(this));
    }

    @Override // com.aspose.slides.IMasterHandoutSlide
    public final IMasterHandoutSlideHeaderFooterManager getHeaderFooterManager() {
        if (this.f2681dy == null) {
            this.f2681dy = new MasterHandoutSlideHeaderFooterManager(this);
        }
        return this.f2681dy;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public boolean getShowMasterShapes() {
        return false;
    }

    @Override // com.aspose.slides.IMasterThemeable
    public final IMasterThemeManager getThemeManager() {
        return this.f2680c5;
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: kk */
    public AbstractC0919dx mo400kk() {
        if (this.f2682h4 == null) {
            this.f2682h4 = new g4c();
        }
        return this.f2682h4;
    }

    /* JADX INFO: renamed from: ne */
    public final lyy m1929ne() {
        if (this.f2683m9 == null) {
            this.f2683m9 = new lyy();
        }
        return this.f2683m9;
    }

    @Override // com.aspose.slides.BaseSlide, com.aspose.slides.IBaseSlide
    public void setShowMasterShapes(boolean z) {
        if (z) {
            throw new NotSupportedException("MasterHandoutSlide doesn't contain another master slide and doesn't support this setter.");
        }
    }

    @Override // com.aspose.slides.BaseSlide
    /* JADX INFO: renamed from: to */
    public AbstractC1165gx mo404to() {
        if (this.f2683m9 == null) {
            this.f2683m9 = new lyy();
        }
        return this.f2683m9;
    }

    /* JADX INFO: renamed from: x6 */
    public final g4c m1930x6() {
        if (this.f2682h4 == null) {
            this.f2682h4 = new g4c();
        }
        return this.f2682h4;
    }
}
