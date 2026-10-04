package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IVideoFrame extends IPictureFrame {
    IVideo getEmbeddedVideo();

    boolean getFullScreenMode();

    boolean getHideAtShowing();

    String getLinkPathLong();

    boolean getPlayLoopMode();

    int getPlayMode();

    boolean getRewindVideo();

    float getTrimFromEnd();

    float getTrimFromStart();

    int getVolume();

    void setEmbeddedVideo(IVideo iVideo);

    void setFullScreenMode(boolean z);

    void setHideAtShowing(boolean z);

    void setLinkPathLong(String str);

    void setPlayLoopMode(boolean z);

    void setPlayMode(int i);

    void setRewindVideo(boolean z);

    void setTrimFromEnd(float f);

    void setTrimFromStart(float f);

    void setVolume(int i);
}
