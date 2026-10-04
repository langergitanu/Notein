package com.huawei.cloud.base.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpIOExceptionHandler {
    boolean handleIOException(HttpRequest httpRequest, boolean z) throws IOException;
}
