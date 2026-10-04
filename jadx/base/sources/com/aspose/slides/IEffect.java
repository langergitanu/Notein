package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IEffect {
    IColorFormat getAfterAnimationColor();

    int getAfterAnimationType();

    int getAnimateTextType();

    IBehaviorCollection getBehaviors();

    float getDelayBetweenTextParts();

    int getPresetClassType();

    ISequence getSequence();

    IAudio getSound();

    boolean getStopPreviousSound();

    int getSubtype();

    IShape getTargetShape();

    ITextAnimation getTextAnimation();

    ITiming getTiming();

    int getType();

    void setAfterAnimationColor(IColorFormat iColorFormat);

    void setAfterAnimationType(int i);

    void setAnimateTextType(int i);

    void setBehaviors(IBehaviorCollection iBehaviorCollection);

    void setDelayBetweenTextParts(float f);

    void setPresetClassType(int i);

    void setSound(IAudio iAudio);

    void setStopPreviousSound(boolean z);

    void setSubtype(int i);

    void setTiming(ITiming iTiming);

    void setType(int i);
}
