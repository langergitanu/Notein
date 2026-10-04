package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IHyperlink {
    boolean equals(IHyperlink iHyperlink);

    int getActionType();

    int getColorSource();

    String getExternalUrl();

    String getExternalUrlOriginal();

    boolean getHighlightClick();

    boolean getHistory();

    IAudio getSound();

    boolean getStopSoundOnClick();

    String getTargetFrame();

    ISlide getTargetSlide();

    String getTooltip();

    void setColorSource(int i);

    void setHighlightClick(boolean z);

    void setHistory(boolean z);

    void setSound(IAudio iAudio);

    void setStopSoundOnClick(boolean z);

    void setTargetFrame(String str);

    void setTooltip(String str);
}
