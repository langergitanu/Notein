package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IVideoCollection extends IGenericCollection<IVideo> {
    IVideo addVideo(IVideo iVideo);

    @Deprecated
    IVideo addVideo(InputStream inputStream);

    IVideo addVideo(InputStream inputStream, int i);

    IVideo addVideo(byte[] bArr);

    IVideo get_Item(int i);
}
