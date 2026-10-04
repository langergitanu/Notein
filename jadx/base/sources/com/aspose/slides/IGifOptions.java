package com.aspose.slides;

import com.aspose.slides.android.Size;

/* JADX INFO: loaded from: classes3.dex */
public interface IGifOptions extends ISaveOptions {
    int getDefaultDelay();

    boolean getExportHiddenSlides();

    Size getFrameSize();

    int getTransitionFps();

    void setDefaultDelay(int i);

    void setExportHiddenSlides(boolean z);

    void setFrameSize(Size size);

    void setTransitionFps(int i);
}
