package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
class v5j {
    /* JADX INFO: renamed from: k4 */
    public static <T> String m72076k4(VideoFrame videoFrame, TemplateContext<T> templateContext) {
        if (videoFrame != null) {
            return alz.m3667k4(templateContext.getOutput().getResourcePath(videoFrame.getEmbeddedVideo()), (String) templateContext.getGlobal().get("slidesPath"));
        }
        throw new InvalidOperationException("Parameter videoFrame can't be null");
    }
}
