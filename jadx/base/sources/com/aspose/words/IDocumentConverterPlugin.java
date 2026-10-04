package com.aspose.words;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public interface IDocumentConverterPlugin {
    void convert(InputStream inputStream, OutputStream outputStream, SaveOptions saveOptions);
}
