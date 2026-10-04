package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class FrameTickEventArgs {

    /* JADX INFO: renamed from: k4 */
    private final PresentationPlayer f2383k4;

    /* JADX INFO: renamed from: x1 */
    private final IPresentationAnimationPlayer f2384x1;

    public FrameTickEventArgs(PresentationPlayer presentationPlayer, IPresentationAnimationPlayer iPresentationAnimationPlayer) {
        this.f2383k4 = presentationPlayer;
        this.f2384x1 = iPresentationAnimationPlayer;
    }

    public final IImage getFrame() {
        return this.f2384x1.getFrame();
    }

    public final PresentationPlayer getPlayer() {
        return this.f2383k4;
    }
}
