package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class VideoPlayerHtmlControllerFactory implements IVideoPlayerHtmlControllerFactory {
    @Override // com.aspose.slides.IVideoPlayerHtmlControllerFactory
    public final IVideoPlayerHtmlController createVideoPlayerHtmlController(String str, String str2, String str3) {
        return new VideoPlayerHtmlController(str, str2, str3);
    }
}
