package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MasterNotesSlideHeaderFooterManager extends BaseHandoutNotesSlideHeaderFooterManager implements IMasterNotesSlideHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final MasterNotesSlide f2690k4;

    public MasterNotesSlideHeaderFooterManager(MasterNotesSlide masterNotesSlide) {
        super(masterNotesSlide);
        this.f2690k4 = masterNotesSlide;
    }

    /* JADX INFO: renamed from: du */
    private Presentation m1934du() {
        return this.f2690k4.m403rv();
    }

    @Override // com.aspose.slides.BaseSlideHeaderFooterManager
    /* JADX INFO: renamed from: kk */
    public void mo417kk(byte b) {
        if (m422x1(b)) {
            return;
        }
        if (b == 4) {
            s8a.m70470kk(this.f2690k4, "Date Placeholder 2");
            return;
        }
        if (b == 5) {
            s8a.m70471to(this.f2690k4, "Slide Number Placeholder 6");
        } else if (b == 6) {
            s8a.m70472x1(this.f2690k4, "Footer Placeholder 5");
        } else {
            if (b != 7) {
                throw new ArgumentOutOfRangeException("placeholderType");
            }
            s8a.m70468k4(this.f2690k4, "Header Placeholder 1");
        }
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setDateTimeAndChildDateTimesText(String str) {
        m1935x1((byte) 4, str, true);
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setDateTimeAndChildDateTimesVisibility(boolean z) {
        m1936x1((byte) 4, z);
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setFooterAndChildFootersText(String str) {
        m1935x1((byte) 6, str, false);
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setFooterAndChildFootersVisibility(boolean z) {
        m1936x1((byte) 6, z);
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setHeaderAndChildHeadersText(String str) {
        m1935x1((byte) 7, str, false);
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setHeaderAndChildHeadersVisibility(boolean z) {
        m1936x1((byte) 7, z);
    }

    @Override // com.aspose.slides.IMasterNotesSlideHeaderFooterManager
    public final void setSlideNumberAndChildSlideNumbersVisibility(boolean z) {
        m1936x1((byte) 5, z);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1935x1(byte b, String str, boolean z) {
        m413k4(b, str, z);
        IGenericEnumerator<ISlide> it = m1934du().getSlides().iterator();
        while (it.hasNext()) {
            try {
                NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) it.next().getNotesSlideManager().getNotesSlide(), NotesSlide.class);
                if (notesSlide != null) {
                    ((NotesSlideHeaderFooterManager) notesSlide.getHeaderFooterManager()).m413k4(b, str, z);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1936x1(byte b, boolean z) {
        m414k4(b, z);
        IGenericEnumerator<ISlide> it = m1934du().getSlides().iterator();
        while (it.hasNext()) {
            try {
                NotesSlide notesSlide = (NotesSlide) C7019kk.m27452k4((Object) it.next().getNotesSlideManager().getNotesSlide(), NotesSlide.class);
                if (notesSlide != null) {
                    ((NotesSlideHeaderFooterManager) notesSlide.getHeaderFooterManager()).m414k4(b, z);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
