package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.embedded.C18141d3;
import com.huawei.hms.network.embedded.C18295o3;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18172f6 implements InterfaceC18267m3 {

    /* JADX INFO: renamed from: g */
    public static final String f54734g = "URLConnectionRequestTask";

    /* JADX INFO: renamed from: a */
    public C18186g6 f54735a;

    /* JADX INFO: renamed from: b */
    public C18321q3.d f54736b;

    /* JADX INFO: renamed from: c */
    public HttpURLConnection f54737c;

    /* JADX INFO: renamed from: d */
    public C18144d6 f54738d = new C18144d6();

    /* JADX INFO: renamed from: e */
    public volatile boolean f54739e;

    /* JADX INFO: renamed from: f */
    public boolean f54740f;

    public C18172f6(C18186g6 c18186g6) {
        this.f54735a = c18186g6;
    }

    /* JADX INFO: renamed from: a */
    private C18141d3<ResponseBody> m78415a(C18144d6 c18144d6, HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (this.f54739e) {
            httpURLConnection.disconnect();
            throw C18127c3.m78085a("Canceled");
        }
        c18144d6.m78188e();
        C18141d3.b bVar = new C18141d3.b();
        Map<String, List<String>> mapM78418a = m78418a(httpURLConnection.getHeaderFields());
        c18144d6.m78182a(mapM78418a);
        c18144d6.m78187d();
        C18295o3.b bVar2 = new C18295o3.b();
        String contentType = httpURLConnection.getContentType();
        MediaType mediaType = contentType != null ? MediaType.parse(contentType) : null;
        bVar2.inputStream(responseCode >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream()).contentLength(httpURLConnection.getContentLength()).contentType(contentType).charSet(mediaType != null ? mediaType.charset() : null);
        C18295o3 c18295o3Build = bVar2.build();
        c18144d6.m78184b(c18295o3Build.getContentLength());
        bVar.body(new C18321q3.g(c18295o3Build)).code(responseCode).message(httpURLConnection.getResponseMessage()).url(this.f54736b != null ? httpURLConnection.getURL() == null ? this.f54736b.getUrl() : httpURLConnection.getURL().toString() : null).headers(mapM78418a);
        if (!this.f54739e) {
            return bVar.build();
        }
        httpURLConnection.disconnect();
        throw C18127c3.m78085a("Canceled");
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public void cancel() {
        this.f54739e = true;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public InterfaceC18267m3 m80716clone() {
        return new C18172f6(this.f54735a);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18321q3.f<ResponseBody> execute(C18321q3.d dVar, WebSocket webSocket) throws Exception {
        Logger.m76963i(f54734g, "the request has used the URLConnection!");
        if (webSocket != null) {
            Logger.m76967w(f54734g, "URLConnection can't use websocket");
            throw C18127c3.m78091d("URLConnection can't use websocket");
        }
        this.f54738d.m78180a(dVar.getUrl());
        try {
            synchronized (this) {
                if (this.f54740f) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f54740f = true;
            }
            if (this.f54739e) {
                throw C18127c3.m78085a("Canceled");
            }
            this.f54736b = dVar;
            this.f54737c = m78416a(this.f54738d, dVar);
            if (this.f54739e) {
                this.f54737c.disconnect();
                throw C18127c3.m78085a("Canceled");
            }
            C18321q3.f<ResponseBody> fVar = new C18321q3.f<>(m78415a(this.f54738d, this.f54737c));
            this.f54738d.m78178a(fVar);
            return fVar;
        } catch (Exception e) {
            this.f54738d.m78179a(e);
            throw e;
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18199h5 getConnectionInfo() {
        return null;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public RequestFinishedInfo getRequestFinishedInfo() {
        return this.f54738d.getRequestFinishedInfo();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public boolean isCanceled() {
        return this.f54739e;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public synchronized boolean isExecuted() {
        return this.f54740f;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18267m3
    public C18321q3.d request() {
        return this.f54736b;
    }

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m78416a(C18144d6 c18144d6, C18321q3.d dVar) throws IOException {
        URL url = new URL(dVar.getUrl());
        c18144d6.m78185b(url.getHost());
        HttpURLConnection httpURLConnectionM78417a = m78417a(url);
        c18144d6.m78181a(url.getHost(), "", "", this);
        c18144d6.m78186c();
        m78419a(httpURLConnectionM78417a, Headers.m77737of(dVar.getHeaders()));
        httpURLConnectionM78417a.setConnectTimeout(dVar.getNetConfig().getConnectTimeout());
        httpURLConnectionM78417a.setReadTimeout(dVar.getNetConfig().getReadTimeout());
        httpURLConnectionM78417a.setDoInput(true);
        httpURLConnectionM78417a.setRequestMethod(dVar.getMethod());
        c18144d6.m78183b();
        if (dVar.getBody() == null) {
            return httpURLConnectionM78417a;
        }
        c18144d6.m78176a();
        httpURLConnectionM78417a.setDoOutput(true);
        httpURLConnectionM78417a.setRequestProperty("Content-Type", dVar.getBody().contentType());
        OutputStream outputStream = null;
        try {
            if (dVar.getBody().contentLength() != -1) {
                httpURLConnectionM78417a.setFixedLengthStreamingMode((int) dVar.getBody().contentLength());
            }
            Logger.m76963i(f54734g, "maybe you should override the RequestBody's contentLength() ");
            outputStream = httpURLConnectionM78417a.getOutputStream();
            dVar.getBody().writeTo(outputStream);
            outputStream.flush();
            IoUtils.closeSecure(outputStream);
            return httpURLConnectionM78417a;
        } catch (Throwable th) {
            IoUtils.closeSecure(outputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private HttpURLConnection m78417a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) (this.f54735a.getProxy() != null ? url.openConnection(this.f54735a.getProxy()) : url.openConnection());
        if (!(httpURLConnection instanceof HttpsURLConnection)) {
            return httpURLConnection;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        httpsURLConnection.setSSLSocketFactory(this.f54735a.getSslSocketFactory());
        httpsURLConnection.setHostnameVerifier(this.f54735a.getHostnameVerifier());
        return httpsURLConnection;
    }

    /* JADX INFO: renamed from: a */
    private Map<String, List<String>> m78418a(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            map2.put(TextUtils.isEmpty(entry.getKey()) ? CloudMetaExtra.DEFINE_NON_PARENT_ID : entry.getKey(), entry.getValue());
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    private void m78419a(HttpURLConnection httpURLConnection, Headers headers) {
        if (httpURLConnection == null || headers == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < headers.size(); i++) {
            String strName = headers.name(i);
            httpURLConnection.addRequestProperty(strName, headers.value(i));
            if (!z && StringUtils.toLowerCase(strName).equals("user-agent")) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        httpURLConnection.addRequestProperty("User-Agent", C18347s3.getUserAgent(ContextHolder.getAppContext()));
    }
}
