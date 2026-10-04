package com.aspose.slides;

import com.aspose.slides.android.Size;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
public class TiffOptions extends SaveOptions implements ITiffOptions {

    /* JADX INFO: renamed from: c5 */
    private InkOptions f3579c5;

    /* JADX INFO: renamed from: du */
    private int f3580du;

    /* JADX INFO: renamed from: dy */
    private NotesCommentsLayoutingOptions f3581dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f3582h4;

    /* JADX INFO: renamed from: jd */
    private ISlidesLayoutOptions f3583jd;

    /* JADX INFO: renamed from: k4 */
    private C12023wl f3584k4;

    /* JADX INFO: renamed from: kk */
    private long f3585kk;

    /* JADX INFO: renamed from: m9 */
    private int f3586m9;

    /* JADX INFO: renamed from: to */
    private int f3587to;

    /* JADX INFO: renamed from: x1 */
    private long f3588x1;

    public TiffOptions() {
        C12023wl c12023wl = new C12023wl();
        this.f3584k4 = c12023wl;
        this.f3588x1 = 96L;
        this.f3585kk = 96L;
        this.f3587to = 0;
        this.f3580du = 32;
        this.f3586m9 = 0;
        C12023wl.f40585k4.CloneTo(c12023wl);
        this.f3581dy = new NotesCommentsLayoutingOptions();
        this.f3579c5 = new InkOptions();
    }

    @Override // com.aspose.slides.ITiffOptions
    public final int getBwConversionMode() {
        return this.f3586m9;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final int getCompressionType() {
        return this.f3587to;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final long getDpiX() {
        return this.f3588x1;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final long getDpiY() {
        return this.f3585kk;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final Size getImageSize() {
        return (Size) C12023wl.m56858x1(m3014k4());
    }

    @Override // com.aspose.slides.ITiffOptions
    public final IInkOptions getInkOptions() {
        return this.f3579c5;
    }

    @Override // com.aspose.slides.ITiffOptions
    @Deprecated
    public final INotesCommentsLayoutingOptions getNotesCommentsLayouting() {
        return this.f3581dy;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final int getPixelFormat() {
        return this.f3580du;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final boolean getShowHiddenSlides() {
        return this.f3582h4;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final ISlidesLayoutOptions getSlidesLayoutOptions() {
        return this.f3583jd;
    }

    /* JADX INFO: renamed from: k4 */
    public C12023wl m3014k4() {
        return this.f3584k4;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setBwConversionMode(int i) {
        this.f3586m9 = i;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setCompressionType(int i) {
        this.f3587to = i;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setDpiX(long j) {
        this.f3588x1 = j;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setDpiY(long j) {
        this.f3585kk = j;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setImageSize(Size size) {
        m3015k4(C12023wl.m56855k4(size));
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setPixelFormat(int i) {
        this.f3580du = i;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setShowHiddenSlides(boolean z) {
        this.f3582h4 = z;
    }

    @Override // com.aspose.slides.ITiffOptions
    public final void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions) {
        if (C7019kk.m27469x1(iSlidesLayoutOptions, NotesCommentsLayoutingOptions.class)) {
            this.f3581dy = (NotesCommentsLayoutingOptions) iSlidesLayoutOptions;
        }
        this.f3583jd = iSlidesLayoutOptions;
    }

    /* JADX INFO: renamed from: x1 */
    public final NotesCommentsLayoutingOptions m3016x1() {
        return this.f3581dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m3015k4(C12023wl c12023wl) {
        c12023wl.CloneTo(this.f3584k4);
    }
}
