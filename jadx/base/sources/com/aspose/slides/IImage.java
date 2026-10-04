package com.aspose.slides;

import com.aspose.slides.android.Size;
import com.aspose.slides.p559ms.System.IDisposable;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface IImage extends IDisposable {
    int getHeight();

    Size getSize();

    int getWidth();

    void save(OutputStream outputStream, int i);

    void save(String str);

    void save(String str, int i);
}
