package com.aspose.slides;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IAudioCollection extends IGenericCollection<IAudio> {
    IAudio addAudio(IAudio iAudio);

    @Deprecated
    IAudio addAudio(InputStream inputStream);

    IAudio addAudio(InputStream inputStream, int i);

    IAudio addAudio(byte[] bArr);

    IAudio get_Item(int i);
}
