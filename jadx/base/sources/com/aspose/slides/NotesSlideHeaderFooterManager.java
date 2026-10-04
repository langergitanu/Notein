package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class NotesSlideHeaderFooterManager extends BaseHandoutNotesSlideHeaderFooterManager implements INotesSlideHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final NotesSlide f2853k4;

    public NotesSlideHeaderFooterManager(NotesSlide notesSlide) {
        super(notesSlide);
        this.f2853k4 = notesSlide;
    }

    /* JADX INFO: renamed from: du */
    private MasterNotesSlide m2035du() {
        return (MasterNotesSlide) this.f2853k4.getPresentation().getMasterNotesSlideManager().getMasterNotesSlide();
    }

    @Override // com.aspose.slides.BaseSlideHeaderFooterManager
    /* JADX INFO: renamed from: kk */
    public void mo417kk(byte b) {
        BaseHeaderFooterManager.m344k4(m412k4(), m2035du(), b);
    }
}
