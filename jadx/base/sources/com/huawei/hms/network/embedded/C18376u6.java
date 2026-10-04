package com.huawei.hms.network.embedded;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.network.base.common.FormBody;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.base.util.HttpUtils;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.microsoft.identity.client.internal.MsalUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18376u6 {

    /* JADX INFO: renamed from: l */
    public static final String f56275l = "RequestBuilder";

    /* JADX INFO: renamed from: m */
    public static final Pattern f56276m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final Request.Builder f56277a;

    /* JADX INFO: renamed from: b */
    public String f56278b;

    /* JADX INFO: renamed from: c */
    public String f56279c;

    /* JADX INFO: renamed from: d */
    public C18185g5 f56280d;

    /* JADX INFO: renamed from: e */
    public String f56281e;

    /* JADX INFO: renamed from: f */
    public Map<String, List<String>> f56282f;

    /* JADX INFO: renamed from: g */
    public boolean f56283g;

    /* JADX INFO: renamed from: h */
    public FormBody.Builder f56284h;

    /* JADX INFO: renamed from: i */
    public RequestBody f56285i;

    /* JADX INFO: renamed from: j */
    public boolean f56286j;

    /* JADX INFO: renamed from: k */
    public C18170f4 f56287k = new C18170f4(null);

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.u6$a */
    public static class a extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final RequestBody f56288a;

        /* JADX INFO: renamed from: b */
        public final String f56289b;

        public a(RequestBody requestBody, String str) {
            this.f56288a = requestBody;
            this.f56289b = str;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public long contentLength() throws IOException {
            return this.f56288a.contentLength();
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public String contentType() {
            return this.f56289b;
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public void writeTo(OutputStream outputStream) throws IOException {
            this.f56288a.writeTo(outputStream);
        }
    }

    public C18376u6(HttpClient httpClient, String str, C18185g5 c18185g5, String str2, Headers headers, String str3, boolean z, boolean z2, boolean z3) {
        this.f56279c = str;
        this.f56280d = c18185g5;
        this.f56281e = str2;
        this.f56278b = str3;
        this.f56283g = z;
        this.f56286j = z3;
        this.f56277a = httpClient.newRequest();
        if (headers != null) {
            for (int i = 0; i < headers.size(); i++) {
                this.f56277a.addHeader(headers.name(i), headers.value(i));
            }
        }
        if (z2) {
            this.f56284h = new FormBody.Builder();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m79598b() {
        StringBuilder sb = new StringBuilder();
        Map<String, List<String>> map = this.f56282f;
        if (map != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, List<String>>> it = this.f56282f.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<String>> next = it.next();
                List<String> value = next.getValue();
                for (int i = 0; i < value.size(); i++) {
                    sb.append(next.getKey());
                    sb.append("=");
                    sb.append(value.get(i));
                    if (i != value.size() - 1) {
                        sb.append("&");
                    }
                }
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public Request m79599a() throws IOException {
        RequestBody aVar = this.f56285i;
        if (aVar == null) {
            FormBody.Builder builder = this.f56284h;
            if (builder != null) {
                aVar = builder.build();
            } else if (hasBody()) {
                aVar = RequestBodyProviders.create((String) null, new byte[0]);
            }
        }
        String str = this.f56278b;
        if (str != null) {
            if (aVar != null) {
                aVar = new a(aVar, str);
            } else {
                this.f56277a.addHeader("Content-Type", str);
            }
        }
        this.f56277a.url(getRequestUrl().getUrl()).method(this.f56279c).requestBody(aVar);
        if (this.f56286j) {
            this.f56287k.setValue(PolicyNetworkService.RequestConstants.CONNECT_EMPTY_BODY, true);
        }
        this.f56277a.options(this.f56287k.toString());
        return this.f56277a.build();
    }

    /* JADX INFO: renamed from: c */
    public void m79604c(String str, String str2) {
        String str3 = this.f56281e;
        if (str3 == null) {
            throw new AssertionError();
        }
        String strReplace = str3.replace("{" + str + "}", str2);
        if (f56276m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException(OooO00o.OooO00o("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        }
        this.f56281e = strReplace;
    }

    /* JADX INFO: renamed from: d */
    public void m79605d(String str, String str2) {
        if (this.f56282f == null) {
            this.f56282f = new HashMap();
        }
        if (this.f56282f.containsKey(str)) {
            this.f56282f.get(str).add(str2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        this.f56282f.put(str, arrayList);
    }

    public String getMethod() {
        return this.f56279c;
    }

    public String getRelativeUrl() {
        return this.f56281e;
    }

    public C18185g5 getRequestUrl() throws IOException {
        StringBuilder sb = new StringBuilder();
        if (!HttpUtils.isHttpOrGrsUrl(this.f56281e)) {
            C18185g5 c18185g5 = this.f56280d;
            if (c18185g5 == null) {
                throw new IOException("baseUrl == null", new NullPointerException("baseUrl == null"));
            }
            sb.append(c18185g5.getUrl());
        }
        sb.append(this.f56281e);
        String strM79598b = m79598b();
        if (!strM79598b.isEmpty()) {
            String str = MsalUtils.QUERY_STRING_SYMBOL;
            int iLastIndexOf = sb.lastIndexOf(MsalUtils.QUERY_STRING_SYMBOL);
            int length = sb.length();
            if (iLastIndexOf >= 0) {
                if (iLastIndexOf != length - 1) {
                    str = "&";
                    sb.append(str);
                }
                sb.append(strM79598b);
            } else {
                sb.append(str);
                sb.append(strM79598b);
            }
        }
        return new C18185g5(sb.toString());
    }

    public boolean hasBody() {
        return this.f56283g;
    }

    public void setMetricsData(String str) {
        this.f56287k.setOption(str);
    }

    public void setNetworkParameters(String str) {
        this.f56287k.setOption(str);
    }

    /* JADX INFO: renamed from: a */
    public void m79600a(RequestBody requestBody) {
        this.f56285i = requestBody;
    }

    /* JADX INFO: renamed from: b */
    public void m79603b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            this.f56278b = str2;
        } else {
            this.f56277a.addHeader(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79601a(String str) {
        this.f56281e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m79602a(String str, String str2) {
        FormBody.Builder builder = this.f56284h;
        if (builder != null) {
            builder.add(str, str2);
        }
    }
}
