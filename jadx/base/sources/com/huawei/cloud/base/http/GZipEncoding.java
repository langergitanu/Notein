package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.StreamingContent;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class GZipEncoding implements HttpEncoding {
    private static final String TAG = "GZipEncoding";
    private static final Logger LOGGER = Logger.getLogger(TAG);

    @Override // com.huawei.cloud.base.http.HttpEncoding
    public void encode(StreamingContent streamingContent, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(outputStream) { // from class: com.huawei.cloud.base.http.GZipEncoding.1
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    flush();
                } catch (IOException e) {
                    GZipEncoding.LOGGER.m75688d(e.toString());
                }
            }
        });
        streamingContent.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }

    @Override // com.huawei.cloud.base.http.HttpEncoding
    public String getName() {
        return "gzip";
    }
}
