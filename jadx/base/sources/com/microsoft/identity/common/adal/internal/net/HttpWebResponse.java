package com.microsoft.identity.common.adal.internal.net;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class HttpWebResponse {
    private final String mResponseBody;
    private final Map<String, List<String>> mResponseHeaders;
    private final int mStatusCode;

    public HttpWebResponse(int i, String str, Map<String, List<String>> map) {
        this.mStatusCode = i;
        this.mResponseBody = str;
        this.mResponseHeaders = map;
    }

    public String getBody() {
        return this.mResponseBody;
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.mResponseHeaders;
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }
}
