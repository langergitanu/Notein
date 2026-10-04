package com.huawei.hms.network.embedded;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18141d3<T> extends Response<T> {

    /* JADX INFO: renamed from: g */
    public static final int f54512g = 100;

    /* JADX INFO: renamed from: a */
    public T f54513a;

    /* JADX INFO: renamed from: b */
    public C18321q3.g f54514b;

    /* JADX INFO: renamed from: c */
    public Map<String, List<String>> f54515c;

    /* JADX INFO: renamed from: d */
    public int f54516d;

    /* JADX INFO: renamed from: e */
    public String f54517e;

    /* JADX INFO: renamed from: f */
    public String f54518f;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.d3$b */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        public T f54519a;

        /* JADX INFO: renamed from: b */
        public C18321q3.g f54520b;

        /* JADX INFO: renamed from: c */
        public Map<String, List<String>> f54521c;

        /* JADX INFO: renamed from: d */
        public int f54522d;

        /* JADX INFO: renamed from: e */
        public String f54523e;

        /* JADX INFO: renamed from: f */
        public String f54524f;

        public b() {
        }

        public b body(T t) {
            this.f54519a = t;
            return this;
        }

        public C18141d3<T> build() {
            return new C18141d3<>(this);
        }

        public b code(int i) {
            this.f54522d = i;
            return this;
        }

        public b errorBody(ResponseBody responseBody) {
            if (responseBody == null || (responseBody instanceof C18321q3.g)) {
                this.f54520b = (C18321q3.g) responseBody;
                return this;
            }
            this.f54520b = new C18321q3.g(responseBody);
            return this;
        }

        public b headers(Map<String, List<String>> map) {
            this.f54521c = map;
            return this;
        }

        public b message(String str) {
            this.f54523e = str;
            return this;
        }

        public b url(String str) {
            this.f54524f = str;
            return this;
        }

        public b(C18141d3<T> c18141d3) {
            this.f54519a = (T) c18141d3.f54513a;
            this.f54521c = c18141d3.f54515c;
            this.f54522d = c18141d3.f54516d;
            this.f54523e = c18141d3.f54517e;
            this.f54524f = c18141d3.f54518f;
            this.f54520b = c18141d3.f54514b;
        }
    }

    public C18141d3(b<T> bVar) {
        this.f54513a = (T) bVar.f54519a;
        this.f54514b = bVar.f54520b;
        this.f54515c = bVar.f54521c;
        this.f54516d = bVar.f54522d;
        this.f54517e = bVar.f54523e;
        this.f54518f = bVar.f54524f;
        m78165s();
    }

    public static boolean hasBody(Response<ResponseBody> response) {
        int code = response.getCode();
        if ((code < 100 || code >= 200) && code != 204 && code != 304) {
            return true;
        }
        Headers headersM77737of = Headers.m77737of(response.getHeaders());
        String str = headersM77737of.get("Content-Length");
        return !(str.isEmpty() || StringUtils.stringToLong(str, -1L) == -1) || "chunked".equalsIgnoreCase(headersM77737of.get(HttpHeaders.TRANSFER_ENCODING));
    }

    /* JADX INFO: renamed from: s */
    private void m78165s() {
        if (this.f54514b == null && (this.f54513a instanceof C18321q3.g) && !isSuccessful()) {
            this.f54514b = (C18321q3.g) this.f54513a;
            this.f54513a = null;
        }
    }

    @Override // com.huawei.hms.network.httpclient.Response, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        T t = this.f54513a;
        if (t instanceof Closeable) {
            ((Closeable) t).close();
            this.f54513a = null;
        }
        C18321q3.g gVar = this.f54514b;
        if (gVar != null) {
            gVar.close();
            this.f54514b = null;
        }
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public T getBody() {
        return this.f54513a;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public int getCode() {
        return this.f54516d;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public ResponseBody getErrorBody() {
        return this.f54514b;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public Map<String, List<String>> getHeaders() {
        return this.f54515c;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public String getMessage() {
        return this.f54517e;
    }

    @Override // com.huawei.hms.network.httpclient.Response
    public String getUrl() {
        return this.f54518f;
    }

    public b newBuilder() {
        return new b(this);
    }
}
