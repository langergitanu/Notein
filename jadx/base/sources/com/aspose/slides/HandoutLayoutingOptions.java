package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class HandoutLayoutingOptions implements ISlidesLayoutOptions {

    /* JADX INFO: renamed from: k4 */
    private int f2437k4;

    /* JADX INFO: renamed from: kk */
    private boolean f2438kk;

    /* JADX INFO: renamed from: to */
    private boolean f2439to;

    /* JADX INFO: renamed from: x1 */
    private boolean f2440x1;

    public HandoutLayoutingOptions() {
        setHandout(5);
        setPrintFrameSlide(true);
        setPrintSlideNumbers(true);
    }

    public final int getHandout() {
        return this.f2437k4;
    }

    public final boolean getPrintComments() {
        return this.f2439to;
    }

    public final boolean getPrintFrameSlide() {
        return this.f2438kk;
    }

    public final boolean getPrintSlideNumbers() {
        return this.f2440x1;
    }

    public final void setHandout(int i) {
        this.f2437k4 = i;
    }

    public final void setPrintComments(boolean z) {
        this.f2439to = z;
    }

    public final void setPrintFrameSlide(boolean z) {
        this.f2438kk = z;
    }

    public final void setPrintSlideNumbers(boolean z) {
        this.f2440x1 = z;
    }
}
