package com.nimbusds.jose.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultResourceRetriever extends AbstractRestrictedResourceRetriever implements RestrictedResourceRetriever {
    private boolean disconnectAfterUse;
    private Proxy proxy;
    private final SSLSocketFactory sslSocketFactory;

    public DefaultResourceRetriever() {
        this(0, 0);
    }

    private InputStream getInputStream(HttpURLConnection httpURLConnection, int i) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        return i > 0 ? new BoundedInputStream(inputStream, getSizeLimit()) : inputStream;
    }

    public boolean disconnectsAfterUse() {
        return this.disconnectAfterUse;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public HttpURLConnection openConnection(URL url) throws IOException {
        Proxy proxy = this.proxy;
        return proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
    }

    @Override // com.nimbusds.jose.util.ResourceRetriever
    public Resource retrieveResource(URL url) throws IOException {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
                httpURLConnectionOpenConnection.setConnectTimeout(getConnectTimeout());
                httpURLConnectionOpenConnection.setReadTimeout(getReadTimeout());
                SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
                if (sSLSocketFactory != null && (httpURLConnectionOpenConnection instanceof HttpsURLConnection)) {
                    ((HttpsURLConnection) httpURLConnectionOpenConnection).setSSLSocketFactory(sSLSocketFactory);
                }
                if (getHeaders() != null && !getHeaders().isEmpty()) {
                    for (Map.Entry<String, List<String>> entry : getHeaders().entrySet()) {
                        Iterator<String> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            httpURLConnectionOpenConnection.addRequestProperty(entry.getKey(), it.next());
                        }
                    }
                }
                InputStream inputStream = getInputStream(httpURLConnectionOpenConnection, getSizeLimit());
                try {
                    String inputStreamToString = IOUtils.readInputStreamToString(inputStream, StandardCharsets.UTF_8);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    int responseCode = httpURLConnectionOpenConnection.getResponseCode();
                    String responseMessage = httpURLConnectionOpenConnection.getResponseMessage();
                    if (responseCode <= 299 && responseCode >= 200) {
                        Resource resource = new Resource(inputStreamToString, httpURLConnectionOpenConnection.getContentType());
                        if (this.disconnectAfterUse) {
                            httpURLConnectionOpenConnection.disconnect();
                        }
                        return resource;
                    }
                    throw new IOException("HTTP " + responseCode + ": " + responseMessage);
                } finally {
                }
            } catch (Throwable th) {
                if (this.disconnectAfterUse && 0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (ClassCastException e) {
            throw new IOException("Couldn't open HTTP(S) connection: " + e.getMessage(), e);
        }
    }

    public void setDisconnectsAfterUse(boolean z) {
        this.disconnectAfterUse = z;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public DefaultResourceRetriever(int i, int i2) {
        this(i, i2, 0);
    }

    public DefaultResourceRetriever(int i, int i2, int i3) {
        this(i, i2, i3, true);
    }

    public DefaultResourceRetriever(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, null);
    }

    public DefaultResourceRetriever(int i, int i2, int i3, boolean z, SSLSocketFactory sSLSocketFactory) {
        super(i, i2, i3);
        this.disconnectAfterUse = z;
        this.sslSocketFactory = sSLSocketFactory;
    }
}
