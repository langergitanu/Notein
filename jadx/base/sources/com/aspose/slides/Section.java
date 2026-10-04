package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14047bz;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class Section extends DomObject<SectionCollection> implements ISection {

    /* JADX INFO: renamed from: k4 */
    private String f3282k4;

    /* JADX INFO: renamed from: kk */
    private ISlide f3283kk;

    /* JADX INFO: renamed from: x1 */
    private C14047bz f3284x1;

    public Section(String str, SectionCollection sectionCollection, ISlide iSlide) {
        super(sectionCollection);
        this.f3284x1 = new C14047bz();
        this.f3282k4 = str;
        this.f3283kk = iSlide;
        C14047bz.m66536x1().CloneTo(this.f3284x1);
    }

    @Override // com.aspose.slides.ISection
    public final String getName() {
        return this.f3282k4;
    }

    @Override // com.aspose.slides.ISection
    public final UUID getSectionId() {
        return C14047bz.m66534k4(m2517k4());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[LOOP:1: B:15:0x0068->B:17:0x0072, LOOP_START, PHI: r3
      0x0068: PHI (r3v5 int) = (r3v2 int), (r3v6 int) binds: [B:14:0x0066, B:17:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080 A[LOOP:2: B:18:0x0080->B:20:0x008a, LOOP_START, PHI: r3
      0x0080: PHI (r3v3 int) = (r3v2 int), (r3v4 int) binds: [B:14:0x0066, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.ISection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ISectionSlideCollection getSlidesListOfSection() {
        ISlide startedFromSlide;
        SectionSlideCollection sectionSlideCollection = new SectionSlideCollection(this);
        if (getStartedFromSlide() != null) {
            Presentation presentation = (Presentation) C7019kk.m27452k4((Object) ((InterfaceC14397rj) C7019kk.m27452k4((Object) this.f2127h4, InterfaceC14397rj.class)).getParent_Immediate(), Presentation.class);
            SectionCollection sectionCollection = (SectionCollection) C7019kk.m27452k4((Object) this.f2127h4, SectionCollection.class);
            int iIndexOf = presentation.getSlides().indexOf(getStartedFromSlide());
            int iIndexOf2 = sectionCollection.indexOf(this);
            if (sectionCollection.indexOf(this) != sectionCollection.size() - 1) {
                do {
                    iIndexOf2++;
                    if (iIndexOf2 >= sectionCollection.size()) {
                        startedFromSlide = null;
                        break;
                    }
                } while (sectionCollection.get_Item(iIndexOf2).getStartedFromSlide() == null);
                startedFromSlide = sectionCollection.get_Item(iIndexOf2).getStartedFromSlide();
                if (startedFromSlide == null) {
                    while (iIndexOf < presentation.getSlides().indexOf(startedFromSlide)) {
                        sectionSlideCollection.m2524x1(presentation.getSlides().get_Item(iIndexOf));
                        iIndexOf++;
                    }
                } else {
                    while (iIndexOf < presentation.getSlides().size()) {
                        sectionSlideCollection.m2524x1(presentation.getSlides().get_Item(iIndexOf));
                        iIndexOf++;
                    }
                }
            } else {
                startedFromSlide = null;
                if (startedFromSlide == null) {
                }
            }
        }
        return sectionSlideCollection;
    }

    @Override // com.aspose.slides.ISection
    public final ISlide getStartedFromSlide() {
        return this.f3283kk;
    }

    /* JADX INFO: renamed from: k4 */
    public C14047bz m2517k4() {
        return this.f3284x1;
    }

    @Override // com.aspose.slides.ISection
    public final void setName(String str) {
        this.f3282k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2518k4(ISlide iSlide) {
        this.f3283kk = iSlide;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2519k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f3284x1);
    }
}
