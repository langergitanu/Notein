package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISlideShowTransition {
    boolean getAdvanceAfter();

    long getAdvanceAfterTime();

    boolean getAdvanceOnClick();

    IAudio getSound();

    boolean getSoundIsBuiltIn();

    boolean getSoundLoop();

    int getSoundMode();

    String getSoundName();

    int getSpeed();

    int getType();

    ITransitionValueBase getValue();

    void setAdvanceAfter(boolean z);

    void setAdvanceAfterTime(long j);

    void setAdvanceOnClick(boolean z);

    void setSound(IAudio iAudio);

    void setSoundIsBuiltIn(boolean z);

    void setSoundLoop(boolean z);

    void setSoundMode(int i);

    void setSoundName(String str);

    void setSpeed(int i);

    void setType(int i);
}
