package com.aspose.slides.internal.p217k4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5588k4 extends C5604x1 {
    public C5588k4() {
    }

    public C5588k4(InputStream inputStream) throws IOException {
        this(inputStream, null);
    }

    public C5588k4(InputStream inputStream, int i, int i2, String str) throws IOException {
        m22994k4(str != null ? new InputStreamReader(inputStream, str) : new InputStreamReader(inputStream), i, i2);
    }

    public C5588k4(InputStream inputStream, int i, String str) throws IOException {
        this(inputStream, i, 1024, str);
    }

    public C5588k4(InputStream inputStream, String str) throws IOException {
        this(inputStream, 1024, str);
    }
}
