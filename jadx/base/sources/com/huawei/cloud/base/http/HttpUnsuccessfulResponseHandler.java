package com.huawei.cloud.base.http;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpUnsuccessfulResponseHandler {
    boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException;
}
