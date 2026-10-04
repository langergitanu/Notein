package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IAudioFrame extends IPictureFrame {
    int getAudioCdEndTrack();

    int getAudioCdEndTrackTime();

    int getAudioCdStartTrack();

    int getAudioCdStartTrackTime();

    boolean getEmbedded();

    IAudio getEmbeddedAudio();

    boolean getHideAtShowing();

    String getLinkPathLong();

    boolean getPlayAcrossSlides();

    boolean getPlayLoopMode();

    int getPlayMode();

    boolean getRewindAudio();

    int getVolume();

    void setAudioCdEndTrack(int i);

    void setAudioCdEndTrackTime(int i);

    void setAudioCdStartTrack(int i);

    void setAudioCdStartTrackTime(int i);

    void setEmbeddedAudio(IAudio iAudio);

    void setHideAtShowing(boolean z);

    void setLinkPathLong(String str);

    void setPlayAcrossSlides(boolean z);

    void setPlayLoopMode(boolean z);

    void setPlayMode(int i);

    void setRewindAudio(boolean z);

    void setVolume(int i);
}
