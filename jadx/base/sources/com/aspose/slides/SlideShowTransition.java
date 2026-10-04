package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: loaded from: classes3.dex */
public class SlideShowTransition extends DomObject<BaseSlide> implements ISlideShowTransition {

    /* JADX INFO: renamed from: c5 */
    private boolean f3408c5;

    /* JADX INFO: renamed from: ck */
    private final v2n f3409ck;

    /* JADX INFO: renamed from: du */
    Audio f3410du;

    /* JADX INFO: renamed from: dy */
    private boolean f3411dy;

    /* JADX INFO: renamed from: fa */
    private boolean f3412fa;

    /* JADX INFO: renamed from: jd */
    private final xxx f3413jd;

    /* JADX INFO: renamed from: k4 */
    TransitionValueBase f3414k4;

    /* JADX INFO: renamed from: kk */
    int f3415kk;

    /* JADX INFO: renamed from: m9 */
    int f3416m9;

    /* JADX INFO: renamed from: to */
    long f3417to;

    /* JADX INFO: renamed from: x1 */
    boolean f3418x1;

    public SlideShowTransition(BaseSlide baseSlide) {
        super(baseSlide);
        this.f3418x1 = true;
        this.f3415kk = 0;
        this.f3417to = 0L;
        this.f3416m9 = -1;
        this.f3414k4 = new TransitionValueBase(0);
        this.f3413jd = new xxx(this);
        this.f3409ck = new v2n();
    }

    /* JADX INFO: renamed from: k4 */
    public static TransitionValueBase m2747k4(int i) {
        switch (i) {
            case 0:
                return new TransitionValueBase(0);
            case 1:
            case 15:
            case 31:
            case 32:
                OrientationTransition orientationTransition = new OrientationTransition(i);
                orientationTransition.setDirection((byte) 1);
                return orientationTransition;
            case 2:
            case 4:
                return new OrientationTransition(i);
            case 3:
            case 7:
            case 8:
            case 10:
            case 11:
            case 14:
            case 18:
            case 26:
            case 40:
            case 46:
            case 48:
            case 49:
            case 50:
                return new EmptyTransition(i);
            case 5:
            case 12:
                return new EightDirectionTransition(i);
            case 6:
                return new OptionalBlackTransition(i);
            case 9:
                return new OptionalBlackTransition(i);
            case 13:
                SideDirectionTransition sideDirectionTransition = new SideDirectionTransition(i);
                sideDirectionTransition.setDirection(1);
                return sideDirectionTransition;
            case 16:
                SplitTransition splitTransition = new SplitTransition(i);
                splitTransition.setOrientation((byte) 1);
                return splitTransition;
            case 17:
                return new CornerDirectionTransition(i);
            case 19:
                return new WheelTransition(i);
            case 20:
            case 27:
            case 28:
            case 29:
            case 30:
                return new SideDirectionTransition(i);
            case 21:
                return new InOutTransition(i);
            case 22:
                SideDirectionTransition sideDirectionTransition2 = new SideDirectionTransition(i);
                sideDirectionTransition2.setDirection(3);
                return sideDirectionTransition2;
            case 23:
            case 24:
            case 47:
            case 54:
            case 55:
                LeftRightDirectionTransition leftRightDirectionTransition = new LeftRightDirectionTransition(i);
                leftRightDirectionTransition.setDirection(1);
                return leftRightDirectionTransition;
            case 25:
                return new RippleTransition(i);
            case 33:
            case 34:
            case 35:
            case 44:
            case 45:
            case 51:
            case 52:
            case 53:
                LeftRightDirectionTransition leftRightDirectionTransition2 = new LeftRightDirectionTransition(i);
                leftRightDirectionTransition2.setDirection(0);
                return leftRightDirectionTransition2;
            case 36:
                SideDirectionTransition sideDirectionTransition3 = new SideDirectionTransition(i);
                sideDirectionTransition3.setDirection(1);
                return sideDirectionTransition3;
            case 37:
                GlitterTransition glitterTransition = new GlitterTransition(i);
                glitterTransition.setDirection(0);
                glitterTransition.setPattern(1);
                return glitterTransition;
            case 38:
                InOutTransition inOutTransition = new InOutTransition(i);
                inOutTransition.setDirection(0);
                return inOutTransition;
            case 39:
                FlyThroughTransition flyThroughTransition = new FlyThroughTransition(i);
                flyThroughTransition.setDirection(0);
                return flyThroughTransition;
            case 41:
                return new ShredTransition(i);
            case 42:
                RevealTransition revealTransition = new RevealTransition(i);
                revealTransition.setDirection(1);
                return revealTransition;
            case 43:
                return new WheelTransition(i);
            case 56:
                MorphTransition morphTransition = new MorphTransition(i);
                morphTransition.setMorphType(0);
                return morphTransition;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        if (C7019kk.m27469x1(obj, SlideShowTransition.class)) {
            return m2750k4((ISlideShowTransition) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final boolean getAdvanceAfter() {
        return this.f3412fa;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final long getAdvanceAfterTime() {
        return this.f3417to;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final boolean getAdvanceOnClick() {
        return this.f3418x1;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final IAudio getSound() {
        return this.f3410du;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final boolean getSoundIsBuiltIn() {
        return this.f3411dy;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final boolean getSoundLoop() {
        return this.f3408c5;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final int getSoundMode() {
        return this.f3416m9;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final String getSoundName() {
        Audio audio = this.f3410du;
        if (audio != null) {
            return audio.m255k4().m72978k4();
        }
        throw new PptxException("Sound property is not assigned. Sound property must be assigned to use the SoundName property.");
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final int getSpeed() {
        return this.f3415kk;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final int getType() {
        return this.f3414k4.f3608k4;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final ITransitionValueBase getValue() {
        return this.f3414k4;
    }

    public int hashCode() {
        return 23454;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setAdvanceAfter(boolean z) {
        this.f3412fa = z;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setAdvanceAfterTime(long j) {
        this.f3417to = j;
        setAdvanceAfter(true);
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setAdvanceOnClick(boolean z) {
        this.f3418x1 = z;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setSound(IAudio iAudio) {
        this.f3410du = (Audio) iAudio;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setSoundIsBuiltIn(boolean z) {
        this.f3411dy = z;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setSoundLoop(boolean z) {
        this.f3408c5 = z;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setSoundMode(int i) {
        this.f3416m9 = i;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setSoundName(String str) {
        Audio audio = this.f3410du;
        if (audio == null) {
            throw new PptxException("Sound property is not assigned. Sound property must be assigned to use the SoundName property.");
        }
        audio.m255k4().m72979k4(str);
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setSpeed(int i) {
        this.f3415kk = i;
    }

    @Override // com.aspose.slides.ISlideShowTransition
    public final void setType(int i) {
        TransitionValueBase transitionValueBaseM2747k4 = m2747k4(i);
        if (transitionValueBaseM2747k4 != null) {
            this.f3414k4 = transitionValueBaseM2747k4;
        }
        int[] iArr = {this.f3415kk};
        int[] iArr2 = {0};
        boolean zM2748k4 = m2748k4(i, iArr, iArr2);
        this.f3415kk = iArr[0];
        int i2 = iArr2[0];
        if (zM2748k4) {
            this.f3413jd.m73639k4(C14057f9.m66591x1(i2));
        }
        m2749k4().m73641kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final v2n m2751x1() {
        return this.f3409ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final xxx m2749k4() {
        return this.f3413jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m2752x1(ISlideShowTransition iSlideShowTransition) {
        if (iSlideShowTransition == null) {
            return;
        }
        SlideShowTransition slideShowTransition = (SlideShowTransition) iSlideShowTransition;
        this.f3414k4 = slideShowTransition.f3414k4;
        this.f3415kk = slideShowTransition.f3415kk;
        this.f3418x1 = slideShowTransition.f3418x1;
        this.f3417to = slideShowTransition.f3417to;
        setAdvanceAfter(slideShowTransition.getAdvanceAfter());
        this.f3408c5 = slideShowTransition.f3408c5;
        this.f3411dy = slideShowTransition.f3411dy;
        this.f3416m9 = slideShowTransition.f3416m9;
        this.f3410du = slideShowTransition.f3410du;
        this.f3409ck.m72060k4(slideShowTransition.f3409ck.m72059k4());
        this.f3413jd.m73639k4(slideShowTransition.f3413jd.m73637k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m2748k4(int i, int[] iArr, int[] iArr2) {
        switch (i) {
            case 1:
            case 28:
            case 30:
            case 34:
            case 35:
                iArr[0] = 2;
                iArr2[0] = 1600;
                return true;
            case 2:
                iArr[0] = 2;
                iArr2[0] = 2500;
                return true;
            case 3:
            case 7:
            case 39:
                iArr[0] = 2;
                iArr2[0] = 800;
                return true;
            case 4:
            case 10:
            case 14:
            default:
                return false;
            case 5:
            case 11:
            case 12:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 40:
            case 43:
                iArr[0] = 2;
                iArr2[0] = 1000;
                return true;
            case 6:
                iArr[0] = 0;
                iArr2[0] = 100;
                return true;
            case 8:
            case 21:
            case 24:
            case 27:
                iArr[0] = 2;
                iArr2[0] = 1200;
                return true;
            case 9:
                iArr[0] = 1;
                iArr2[0] = 700;
                return true;
            case 16:
            case 32:
                iArr[0] = 2;
                iArr2[0] = 1500;
                return true;
            case 22:
                iArr[0] = 2;
                iArr2[0] = 4000;
                return true;
            case 23:
                iArr[0] = 2;
                iArr2[0] = 1100;
                return true;
            case 25:
            case 31:
                iArr[0] = 2;
                iArr2[0] = 1400;
                return true;
            case 26:
                iArr[0] = 2;
                iArr2[0] = 4400;
                return true;
            case 29:
            case 33:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 56:
                iArr[0] = 2;
                iArr2[0] = 2000;
                return true;
            case 36:
                iArr[0] = 2;
                iArr2[0] = 1300;
                return true;
            case 37:
                iArr[0] = 2;
                iArr2[0] = 3900;
                return true;
            case 38:
                iArr[0] = 2;
                iArr2[0] = 900;
                return true;
            case 41:
                iArr[0] = 2;
                iArr2[0] = 3000;
                return true;
            case 42:
                iArr[0] = 2;
                iArr2[0] = 3400;
                return true;
            case 46:
                iArr[0] = 2;
                iArr2[0] = 6000;
                return true;
            case 51:
            case 52:
            case 53:
            case 54:
                iArr[0] = 2;
                iArr2[0] = 1250;
                return true;
            case 55:
                iArr[0] = 2;
                iArr2[0] = 3250;
                return true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m2750k4(ISlideShowTransition iSlideShowTransition) {
        Audio audio;
        if (iSlideShowTransition == null) {
            return false;
        }
        SlideShowTransition slideShowTransition = (SlideShowTransition) iSlideShowTransition;
        return !((this.f3410du == null) ^ (slideShowTransition.f3410du == null)) && this.f3414k4.mo1275k4(slideShowTransition.f3414k4) && this.f3418x1 == slideShowTransition.f3418x1 && this.f3415kk == slideShowTransition.f3415kk && this.f3417to == slideShowTransition.f3417to && getAdvanceAfter() == slideShowTransition.getAdvanceAfter() && ((audio = this.f3410du) == null || audio.m257kk() == slideShowTransition.f3410du.m257kk()) && this.f3411dy == slideShowTransition.f3411dy && this.f3408c5 == slideShowTransition.f3408c5 && this.f3416m9 == slideShowTransition.f3416m9 && this.f3413jd.m73640k4(slideShowTransition.f3413jd) && this.f3409ck.m72061k4(slideShowTransition.f3409ck);
    }
}
