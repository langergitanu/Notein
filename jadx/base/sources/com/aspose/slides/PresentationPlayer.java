package com.aspose.slides;

import com.aspose.slides.PresentationAnimationsGenerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: loaded from: classes3.dex */
public class PresentationPlayer implements IDisposable {

    /* JADX INFO: renamed from: du */
    private FrameTick f3158du;

    /* JADX INFO: renamed from: k4 */
    private final PresentationAnimationsGenerator f3159k4;

    /* JADX INFO: renamed from: kk */
    private int f3160kk = 0;

    /* JADX INFO: renamed from: to */
    private double f3161to = 0.0d;

    /* JADX INFO: renamed from: x1 */
    private final C14628uc f3162x1;

    public interface FrameTick {
        void invoke(PresentationPlayer presentationPlayer, FrameTickEventArgs frameTickEventArgs);
    }

    public PresentationPlayer(PresentationAnimationsGenerator presentationAnimationsGenerator, double d) {
        if (presentationAnimationsGenerator == null) {
            throw new ArgumentNullException("generator");
        }
        this.f3159k4 = presentationAnimationsGenerator;
        this.f3162x1 = new C14628uc(1000.0d / d);
        presentationAnimationsGenerator.setNewAnimation(new PresentationAnimationsGenerator.NewAnimation() { // from class: com.aspose.slides.PresentationPlayer.1
            @Override // com.aspose.slides.PresentationAnimationsGenerator.NewAnimation
            public void invoke(IPresentationAnimationPlayer iPresentationAnimationPlayer) {
                PresentationPlayer.this.m2448k4(iPresentationAnimationPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public void m2448k4(IPresentationAnimationPlayer iPresentationAnimationPlayer) {
        int iM71651k4 = this.f3162x1.m71651k4(iPresentationAnimationPlayer.getDuration());
        double dM71650k4 = this.f3162x1.m71650k4();
        FrameTickEventArgs frameTickEventArgs = new FrameTickEventArgs(this, iPresentationAnimationPlayer);
        for (int i = 0; i < iM71651k4; i++) {
            this.f3161to = ((double) this.f3160kk) * dM71650k4;
            iPresentationAnimationPlayer.setTimePosition(((double) i) * dM71650k4);
            FrameTick frameTick = this.f3158du;
            if (frameTick != null) {
                frameTick.invoke(this, frameTickEventArgs);
            }
            this.f3160kk++;
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f3159k4.setNewAnimation(null);
    }

    public final int getFrameIndex() {
        return this.f3160kk;
    }

    public void setFrameTick(FrameTick frameTick) {
        this.f3158du = frameTick;
    }
}
