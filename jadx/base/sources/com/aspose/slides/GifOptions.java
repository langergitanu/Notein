package com.aspose.slides;

import com.aspose.slides.android.Size;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
public class GifOptions extends SaveOptions implements IGifOptions {

    /* JADX INFO: renamed from: k4 */
    private C12023wl f2391k4 = new C12023wl();

    /* JADX INFO: renamed from: kk */
    private int f2392kk;

    /* JADX INFO: renamed from: to */
    private int f2393to;

    /* JADX INFO: renamed from: x1 */
    private boolean f2394x1;

    public GifOptions() {
        setTransitionFps(25);
        m1593k4(C12023wl.f40585k4.Clone());
        setDefaultDelay(1000);
    }

    @Override // com.aspose.slides.IGifOptions
    public final int getDefaultDelay() {
        return this.f2393to;
    }

    @Override // com.aspose.slides.IGifOptions
    public final boolean getExportHiddenSlides() {
        return this.f2394x1;
    }

    @Override // com.aspose.slides.IGifOptions
    public final Size getFrameSize() {
        return (Size) C12023wl.m56858x1(m1592k4());
    }

    @Override // com.aspose.slides.IGifOptions
    public final int getTransitionFps() {
        return this.f2392kk;
    }

    /* JADX INFO: renamed from: k4 */
    public C12023wl m1592k4() {
        return this.f2391k4.Clone();
    }

    @Override // com.aspose.slides.IGifOptions
    public final void setDefaultDelay(int i) {
        this.f2393to = i;
    }

    @Override // com.aspose.slides.IGifOptions
    public final void setExportHiddenSlides(boolean z) {
        this.f2394x1 = z;
    }

    @Override // com.aspose.slides.IGifOptions
    public final void setFrameSize(Size size) {
        m1593k4(C12023wl.m56855k4(size));
    }

    @Override // com.aspose.slides.IGifOptions
    public final void setTransitionFps(int i) {
        this.f2392kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public void m1593k4(C12023wl c12023wl) {
        this.f2391k4 = c12023wl.Clone();
    }
}
