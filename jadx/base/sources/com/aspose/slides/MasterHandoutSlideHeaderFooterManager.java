package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class MasterHandoutSlideHeaderFooterManager extends BaseHandoutNotesSlideHeaderFooterManager implements IMasterHandoutSlideHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final MasterHandoutSlide f2684k4;

    public MasterHandoutSlideHeaderFooterManager(MasterHandoutSlide masterHandoutSlide) {
        super(masterHandoutSlide);
        this.f2684k4 = masterHandoutSlide;
    }

    @Override // com.aspose.slides.BaseSlideHeaderFooterManager
    /* JADX INFO: renamed from: kk */
    public void mo417kk(byte b) {
        if (m422x1(b)) {
            return;
        }
        if (b == 4) {
            t4w.m70938kk(this.f2684k4, "Date Placeholder 2");
            return;
        }
        if (b == 5) {
            t4w.m70939to(this.f2684k4, "Slide Number Placeholder 4");
        } else if (b == 6) {
            t4w.m70940x1(this.f2684k4, "Footer Placeholder 3");
        } else {
            if (b != 7) {
                throw new ArgumentOutOfRangeException("placeholderType");
            }
            t4w.m70937k4(this.f2684k4, "Header Placeholder 1");
        }
    }
}
