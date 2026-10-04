package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18253l3 extends Request {

    /* JADX INFO: renamed from: f */
    public static final String f55584f = "RequestImpl";

    /* JADX INFO: renamed from: a */
    public String f55585a;

    /* JADX INFO: renamed from: b */
    public C18185g5 f55586b;

    /* JADX INFO: renamed from: c */
    public Headers f55587c;

    /* JADX INFO: renamed from: d */
    public C18321q3.e f55588d;

    /* JADX INFO: renamed from: e */
    public C18170f4 f55589e;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.l3$b */
    public static final class b extends Request.Builder {

        /* JADX INFO: renamed from: b */
        public C18185g5 f55591b;

        /* JADX INFO: renamed from: d */
        public C18321q3.e f55593d;

        /* JADX INFO: renamed from: a */
        public String f55590a = "GET";

        /* JADX INFO: renamed from: c */
        public Headers.Builder f55592c = new Headers.Builder();

        /* JADX INFO: renamed from: e */
        public C18170f4 f55594e = new C18170f4(null);

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b addHeader(String str, String str2) {
            this.f55592c.add(str, str2);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public Request build() {
            return new C18321q3.d(new C18253l3(this));
        }

        public b headers(Headers.Builder builder) {
            this.f55592c = builder;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b method(String str) {
            this.f55590a = str;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b options(String str) {
            if (TextUtils.isEmpty(str)) {
                Logger.m76967w(C18253l3.f55584f, "Request Builder options == null");
                return this;
            }
            this.f55594e.setOption(str);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b removeHeader(String str) {
            this.f55592c.removeAll(str);
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b requestBody(RequestBody requestBody) {
            if (requestBody == null || (requestBody instanceof C18321q3.e)) {
                this.f55593d = (C18321q3.e) requestBody;
                return this;
            }
            this.f55593d = new C18321q3.e(requestBody);
            return this;
        }

        public b url(C18185g5 c18185g5) {
            this.f55591b = c18185g5;
            return this;
        }

        @Override // com.huawei.hms.network.httpclient.Request.Builder
        public b url(String str) {
            this.f55591b = new C18185g5(str);
            return this;
        }
    }

    public C18253l3(b bVar) {
        this.f55585a = bVar.f55590a;
        this.f55586b = bVar.f55591b;
        this.f55587c = bVar.f55592c.build();
        this.f55588d = bVar.f55593d;
        this.f55589e = bVar.f55594e;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public RequestBody getBody() {
        return this.f55588d;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public Map<String, List<String>> getHeaders() {
        return this.f55587c.toMultimap();
    }

    public C18185g5 getHttpUrl() {
        return this.f55586b;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public String getMethod() {
        return this.f55585a;
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public String getOptions() {
        return this.f55589e.toString();
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public String getUrl() {
        return this.f55586b.getUrl();
    }

    @Override // com.huawei.hms.network.httpclient.Request
    public b newBuilder() {
        b bVar = new b();
        bVar.f55590a = this.f55585a;
        bVar.f55591b = this.f55586b;
        bVar.f55592c = this.f55587c.newBuilder();
        bVar.f55593d = this.f55588d;
        bVar.f55594e = this.f55589e;
        return bVar;
    }

    public String toString() {
        return super.toString();
    }
}
