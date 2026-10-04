package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
final class qxw {

    /* JADX INFO: renamed from: k4 */
    private IMasterThemeManager f48427k4;

    /* JADX INFO: renamed from: kk */
    private boolean f48428kk;

    /* JADX INFO: renamed from: x1 */
    private IOverrideThemeManager f48429x1;

    public qxw(LayoutSlide layoutSlide) {
        this.f48428kk = false;
        this.f48429x1 = layoutSlide.getThemeManager();
        this.f48428kk = false;
    }

    /* JADX INFO: renamed from: du */
    public final FontScheme m69803du() {
        return (FontScheme) m69810x1().getFontScheme();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m69804h4() {
        return this.f48428kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final IThemeManager m69805k4() {
        return this.f48428kk ? this.f48427k4 : this.f48429x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C13682je m69807kk() {
        return this.f48428kk ? ((MasterThemeManager) this.f48427k4).mo348kk() : ((BaseOverrideThemeManager) this.f48429x1).mo348kk();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m69808m9() {
        return this.f48428kk ? this.f48427k4.isOverrideThemeEnabled() : this.f48429x1.isOverrideThemeEnabled();
    }

    /* JADX INFO: renamed from: to */
    public final FormatScheme m69809to() {
        return (FormatScheme) m69810x1().getFormatScheme();
    }

    /* JADX INFO: renamed from: x1 */
    public final ITheme m69810x1() {
        return this.f48428kk ? this.f48427k4.getOverrideTheme() : this.f48429x1.getOverrideTheme();
    }

    public qxw(MasterHandoutSlide masterHandoutSlide) {
        this.f48428kk = false;
        this.f48427k4 = masterHandoutSlide.getThemeManager();
        this.f48428kk = true;
    }

    /* JADX INFO: renamed from: k4 */
    public static qxw m69802k4(BaseSlide baseSlide) {
        if (C7019kk.m27452k4((Object) baseSlide, MasterNotesSlide.class) != null) {
            return new qxw((MasterNotesSlide) C7019kk.m27452k4((Object) baseSlide, MasterNotesSlide.class));
        }
        if (C7019kk.m27452k4((Object) baseSlide, MasterHandoutSlide.class) != null) {
            return new qxw((MasterHandoutSlide) C7019kk.m27452k4((Object) baseSlide, MasterHandoutSlide.class));
        }
        if (C7019kk.m27452k4((Object) baseSlide, MasterSlide.class) != null) {
            return new qxw((MasterSlide) C7019kk.m27452k4((Object) baseSlide, MasterSlide.class));
        }
        if (C7019kk.m27452k4((Object) baseSlide, LayoutSlide.class) != null) {
            return new qxw((LayoutSlide) C7019kk.m27452k4((Object) baseSlide, LayoutSlide.class));
        }
        if (C7019kk.m27452k4((Object) baseSlide, Slide.class) != null) {
            return new qxw((Slide) C7019kk.m27452k4((Object) baseSlide, Slide.class));
        }
        if (C7019kk.m27452k4((Object) baseSlide, NotesSlide.class) != null) {
            return new qxw((NotesSlide) C7019kk.m27452k4((Object) baseSlide, NotesSlide.class));
        }
        throw new NotImplementedException(C14113y2.m67407k4("Unknown slide [", C14067j2.m66727k4(baseSlide), "] for Theme Context!"));
    }

    public qxw(MasterNotesSlide masterNotesSlide) {
        this.f48428kk = false;
        this.f48427k4 = masterNotesSlide.getThemeManager();
        this.f48428kk = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69806k4(boolean z) {
        if (this.f48428kk) {
            this.f48427k4.setOverrideThemeEnabled(z);
        }
    }

    public qxw(MasterSlide masterSlide) {
        this.f48428kk = false;
        this.f48427k4 = masterSlide.getThemeManager();
        this.f48428kk = true;
    }

    public qxw(NotesSlide notesSlide) {
        this.f48428kk = false;
        this.f48429x1 = notesSlide.getThemeManager();
        this.f48428kk = false;
    }

    public qxw(Slide slide) {
        this.f48428kk = false;
        this.f48429x1 = slide.getThemeManager();
        this.f48428kk = false;
    }
}
