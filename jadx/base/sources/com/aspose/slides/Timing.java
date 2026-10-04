package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
public class Timing implements ITiming, InterfaceC14397rj {

    /* JADX INFO: renamed from: ck */
    private final InterfaceC14397rj f3590ck;

    /* JADX INFO: renamed from: fa */
    private boolean f3593fa;

    /* JADX INFO: renamed from: jd */
    int f3595jd;

    /* JADX INFO: renamed from: up */
    private int f3600up;

    /* JADX INFO: renamed from: k4 */
    float f3596k4 = 0.0f;

    /* JADX INFO: renamed from: x1 */
    float f3601x1 = 0.0f;

    /* JADX INFO: renamed from: kk */
    boolean f3597kk = false;

    /* JADX INFO: renamed from: to */
    float f3599to = Float.NaN;

    /* JADX INFO: renamed from: du */
    float f3591du = 1.0f;

    /* JADX INFO: renamed from: h4 */
    float f3594h4 = Float.NaN;

    /* JADX INFO: renamed from: m9 */
    int f3598m9 = -1;

    /* JADX INFO: renamed from: dy */
    float f3592dy = 1.0f;

    /* JADX INFO: renamed from: c5 */
    float f3589c5 = Float.NaN;

    public Timing(InterfaceC14397rj interfaceC14397rj) {
        this.f3590ck = interfaceC14397rj;
    }

    @Override // com.aspose.slides.ITiming
    public final float getAccelerate() {
        return this.f3596k4;
    }

    @Override // com.aspose.slides.ITiming
    public final boolean getAutoReverse() {
        return this.f3597kk;
    }

    @Override // com.aspose.slides.ITiming
    public final float getDecelerate() {
        return this.f3601x1;
    }

    @Override // com.aspose.slides.ITiming
    public final float getDuration() {
        return C7019kk.m27469x1(this.f3590ck, Effect.class) ? ((Effect) this.f3590ck).m1376to() : m3017k4();
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f3590ck;
    }

    @Override // com.aspose.slides.ITiming
    public final float getRepeatCount() {
        return this.f3591du;
    }

    @Override // com.aspose.slides.ITiming
    public final float getRepeatDuration() {
        return this.f3594h4;
    }

    @Override // com.aspose.slides.ITiming
    public final boolean getRepeatUntilEndSlide() {
        return C14064he.m66703du(this.f3591du) && !getRepeatUntilNextClick();
    }

    @Override // com.aspose.slides.ITiming
    public final boolean getRepeatUntilNextClick() {
        return this.f3593fa;
    }

    @Override // com.aspose.slides.ITiming
    public final int getRestart() {
        return this.f3598m9;
    }

    @Override // com.aspose.slides.ITiming
    public final boolean getRewind() {
        Effect effect = (Effect) C7019kk.m27452k4((Object) this.f3590ck, Effect.class);
        if (effect != null && effect.getPresetClassType() == 4 && effect.getTargetShape() != null) {
            IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) effect.getTargetShape(), IAudioFrame.class);
            if (iAudioFrame != null) {
                return iAudioFrame.getRewindAudio();
            }
            IVideoFrame iVideoFrame = (IVideoFrame) C7019kk.m27452k4((Object) effect.getTargetShape(), IVideoFrame.class);
            if (iVideoFrame != null) {
                return iVideoFrame.getRewindVideo();
            }
        }
        return m3021x1() == 0;
    }

    @Override // com.aspose.slides.ITiming
    public final float getSpeed() {
        return this.f3592dy;
    }

    @Override // com.aspose.slides.ITiming
    public final float getTriggerDelayTime() {
        return this.f3589c5;
    }

    @Override // com.aspose.slides.ITiming
    public final int getTriggerType() {
        return this.f3595jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m3017k4() {
        return this.f3599to;
    }

    @Override // com.aspose.slides.ITiming
    public final void setAccelerate(float f) {
        this.f3596k4 = f;
    }

    @Override // com.aspose.slides.ITiming
    public final void setAutoReverse(boolean z) {
        this.f3597kk = z;
    }

    @Override // com.aspose.slides.ITiming
    public final void setDecelerate(float f) {
        this.f3601x1 = f;
    }

    @Override // com.aspose.slides.ITiming
    public final void setDuration(float f) {
        if (C7019kk.m27469x1(this.f3590ck, Effect.class)) {
            ((Effect) this.f3590ck).m1373k4(f);
        } else {
            m3018k4(f);
        }
    }

    @Override // com.aspose.slides.ITiming
    public final void setRepeatCount(float f) {
        this.f3591du = f;
        if (C14064he.m66703du(f)) {
            return;
        }
        this.f3593fa = false;
    }

    @Override // com.aspose.slides.ITiming
    public final void setRepeatDuration(float f) {
        this.f3594h4 = f;
    }

    @Override // com.aspose.slides.ITiming
    public final void setRepeatUntilEndSlide(boolean z) {
        if (z) {
            this.f3591du = Float.POSITIVE_INFINITY;
            this.f3593fa = false;
        } else {
            if (getRepeatUntilNextClick()) {
                return;
            }
            this.f3591du = 1.0f;
        }
    }

    @Override // com.aspose.slides.ITiming
    public final void setRepeatUntilNextClick(boolean z) {
        this.f3593fa = z;
        if (z) {
            this.f3591du = Float.POSITIVE_INFINITY;
        }
    }

    @Override // com.aspose.slides.ITiming
    public final void setRestart(int i) {
        this.f3598m9 = i;
    }

    @Override // com.aspose.slides.ITiming
    public final void setRewind(boolean z) {
        Effect effect = (Effect) C7019kk.m27452k4((Object) this.f3590ck, Effect.class);
        if (effect != null && effect.getPresetClassType() == 4 && effect.getTargetShape() != null) {
            IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) effect.getTargetShape(), IAudioFrame.class);
            if (iAudioFrame != null) {
                iAudioFrame.setRewindAudio(z);
                return;
            }
            IVideoFrame iVideoFrame = (IVideoFrame) C7019kk.m27452k4((Object) effect.getTargetShape(), IVideoFrame.class);
            if (iVideoFrame != null) {
                iVideoFrame.setRewindVideo(z);
                return;
            }
        }
        m3019k4(z ? 0 : 2);
    }

    @Override // com.aspose.slides.ITiming
    public final void setSpeed(float f) {
        this.f3592dy = f;
    }

    @Override // com.aspose.slides.ITiming
    public final void setTriggerDelayTime(float f) {
        this.f3589c5 = f;
    }

    @Override // com.aspose.slides.ITiming
    public final void setTriggerType(int i) {
        this.f3595jd = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m3021x1() {
        return this.f3600up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3018k4(float f) {
        this.f3599to = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3019k4(int i) {
        this.f3600up = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3020k4(ITiming iTiming) {
        setAccelerate(iTiming.getAccelerate());
        setDecelerate(iTiming.getDecelerate());
        setAutoReverse(iTiming.getAutoReverse());
        m3018k4(((Timing) iTiming).m3017k4());
        setRepeatCount(iTiming.getRepeatCount());
        setRepeatDuration(iTiming.getRepeatDuration());
        setRestart(iTiming.getRestart());
        setSpeed(iTiming.getSpeed());
        setTriggerDelayTime(iTiming.getTriggerDelayTime());
        setTriggerType(iTiming.getTriggerType());
    }
}
