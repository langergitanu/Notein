package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
public class SlideShowSettings {

    /* JADX INFO: renamed from: du */
    private boolean f3403du;

    /* JADX INFO: renamed from: k4 */
    final com.aspose.slides.internal.p332p7.k6v f3404k4;

    /* JADX INFO: renamed from: kk */
    private SlideShowType f3405kk = null;

    /* JADX INFO: renamed from: to */
    private SlidesRange f3406to;

    /* JADX INFO: renamed from: x1 */
    private final IColorFormat f3407x1;

    public SlideShowSettings(Presentation presentation, com.aspose.slides.internal.p332p7.k6v k6vVar) {
        if (k6vVar == null) {
            com.aspose.slides.internal.p332p7.k6v k6vVar2 = new com.aspose.slides.internal.p332p7.k6v();
            this.f3404k4 = k6vVar2;
            k6vVar2.m35160x1(true);
        } else {
            this.f3404k4 = k6vVar;
        }
        this.f3407x1 = new ColorFormat(presentation);
    }

    public final boolean getLoop() {
        return this.f3404k4.m35154kk();
    }

    public final IColorFormat getPenColor() {
        return this.f3407x1;
    }

    public final boolean getShowAnimation() {
        return this.f3404k4.m35145du();
    }

    public final boolean getShowMediaControls() {
        return this.f3403du;
    }

    public final boolean getShowNarration() {
        return this.f3404k4.m35157to();
    }

    public final SlideShowType getSlideShowType() {
        return this.f3405kk;
    }

    public final SlidesRange getSlides() {
        return this.f3406to;
    }

    public final boolean getUseTimings() {
        return this.f3404k4.m35147h4();
    }

    public final void setLoop(boolean z) {
        this.f3404k4.m35152k4(z);
    }

    public final void setShowAnimation(boolean z) {
        this.f3404k4.m35153kk(z);
    }

    public final void setShowMediaControls(boolean z) {
        this.f3403du = z;
    }

    public final void setShowNarration(boolean z) {
        this.f3404k4.m35160x1(z);
    }

    public final void setSlideShowType(SlideShowType slideShowType) {
        if (slideShowType == null) {
            throw new ArgumentNullException("value");
        }
        this.f3405kk = slideShowType;
    }

    public final void setSlides(SlidesRange slidesRange) {
        this.f3406to = slidesRange;
    }

    public final void setUseTimings(boolean z) {
        this.f3404k4.m35156to(z);
    }
}
