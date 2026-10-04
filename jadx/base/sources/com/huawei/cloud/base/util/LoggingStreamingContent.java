package com.huawei.cloud.base.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class LoggingStreamingContent implements StreamingContent {
    private final StreamingContent content;
    private final int contentLoggingLimit;
    private final Logger logger;

    public LoggingStreamingContent(StreamingContent streamingContent, Logger logger, int i) {
        this.content = streamingContent;
        this.logger = logger;
        this.contentLoggingLimit = i;
    }

    @Override // com.huawei.cloud.base.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        LoggingOutputStream loggingOutputStream = new LoggingOutputStream(outputStream, this.logger, this.contentLoggingLimit);
        try {
            this.content.writeTo(loggingOutputStream);
            loggingOutputStream.getLogStream().close();
            outputStream.flush();
        } catch (Throwable th) {
            loggingOutputStream.getLogStream().close();
            throw th;
        }
    }
}
