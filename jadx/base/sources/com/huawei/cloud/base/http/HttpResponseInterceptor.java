package com.huawei.cloud.base.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpResponseInterceptor {
    void interceptResponse(HttpResponse httpResponse) throws IOException;
}
