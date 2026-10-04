package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class NotesSlideThemeManager extends BaseOverrideThemeManager {
    public NotesSlideThemeManager(NotesSlide notesSlide) {
        super(notesSlide);
    }

    @Override // com.aspose.slides.BaseOverrideThemeManager
    /* JADX INFO: renamed from: k4 */
    public IThemeable mo347k4() {
        return m349x1().getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
    }
}
