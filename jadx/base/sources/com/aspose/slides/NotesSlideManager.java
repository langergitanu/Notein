package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class NotesSlideManager extends DomObject<Slide> implements INotesSlideManager {

    /* JADX INFO: renamed from: k4 */
    private NotesSlide f2854k4;

    public NotesSlideManager(Slide slide) {
        super(slide);
    }

    @Override // com.aspose.slides.INotesSlideManager
    public final INotesSlide addNotesSlide() {
        NotesSlide notesSlide = this.f2854k4;
        if (notesSlide == null || notesSlide.getNotesTextFrame() == null) {
            s8a s8aVar = (s8a) m2036k4().getPresentation().getMasterNotesSlideManager();
            if (s8aVar.getMasterNotesSlide() == null) {
                s8aVar.setDefaultMasterNotesSlide();
                s8aVar.m70473k4();
                s8aVar.getMasterNotesSlide().getThemeManager().setOverrideThemeEnabled(false);
                hy0.m7330k4(s8aVar.getMasterNotesSlide().getThemeManager().getOverrideTheme());
                s8aVar.getMasterNotesSlide().getThemeManager().setOverrideThemeEnabled(true);
            }
            NotesSlide notesSlide2 = this.f2854k4;
            if (notesSlide2 == null) {
                m2037k4(new NotesSlide(this));
            } else {
                z6w.m74339x1(notesSlide2, "Notes Placeholder 2");
            }
        }
        return this.f2854k4;
    }

    @Override // com.aspose.slides.INotesSlideManager
    public final INotesSlide getNotesSlide() {
        return this.f2854k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Slide m2036k4() {
        return (Slide) this.f2127h4;
    }

    @Override // com.aspose.slides.INotesSlideManager
    public final void removeNotesSlide() {
        NotesSlide notesSlide = this.f2854k4;
        notesSlide.f2850h4 = null;
        notesSlide.m398k4((InterfaceC14397rj) null);
        this.f2854k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2037k4(NotesSlide notesSlide) {
        this.f2854k4 = notesSlide;
        if (notesSlide != null) {
            notesSlide.f2850h4 = m2036k4();
        }
    }
}
