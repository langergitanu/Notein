package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC22252OooO0oo;
import com.bumptech.glide.load.data.InterfaceC22255OooO0Oo;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o00Ooo0o.C25117OooO0o0;
import o00Ooo0o.EnumC25112OooO00o;
import o00OoooO.C25183OooOO0;
import o00o0O0.C25310OooO0OO;
import o00o0O0.C25315OooO0oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 implements InterfaceC22255OooO0Oo<InputStream> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f67208OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C25183OooOO0 f67209OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public InputStream f67210OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public HttpURLConnection f67211OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile boolean f67212OooOoOO;

    public static class OooO00o {
    }

    public OooOO0(C25183OooOO0 c25183OooOO0, int i) {
        this.f67209OooOo0o = c25183OooOO0;
        this.f67208OooOo = i;
    }

    public static int OooO0o0(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0O0() {
        InputStream inputStream = this.f67210OooOoO;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f67211OooOoO0;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f67211OooOoO0 = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final EnumC25112OooO00o OooO0OO() {
        return EnumC25112OooO00o.f85369OooOo;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void OooO0Oo(EnumC22252OooO0oo enumC22252OooO0oo, InterfaceC22255OooO0Oo.OooO00o<? super InputStream> oooO00o) {
        C25183OooOO0 c25183OooOO0 = this.f67209OooOo0o;
        int i = C25315OooO0oo.f86154OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                oooO00o.OooO0o0(OooO0o(c25183OooOO0.OooO0Oo(), 0, null, c25183OooOO0.f85711OooO0O0.OooO0O0()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                oooO00o.OooO0o(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C25315OooO0oo.OooO00o(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    public final InputStream OooO0o(URL url, int i, URL url2, Map<String, String> map) throws C25117OooO0o0 {
        if (i >= 5) {
            throw new C25117OooO0o0("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C25117OooO0o0("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            int i2 = this.f67208OooOo;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f67211OooOoO0 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f67210OooOoO = this.f67211OooOoO0.getInputStream();
                if (this.f67212OooOoOO) {
                    return null;
                }
                int iOooO0o0 = OooO0o0(this.f67211OooOoO0);
                int i3 = iOooO0o0 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f67211OooOoO0;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f67210OooOoO = new C25310OooO0OO(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f67210OooOoO = httpURLConnection2.getInputStream();
                        }
                        return this.f67210OooOoO;
                    } catch (IOException e) {
                        throw new C25117OooO0o0("Failed to obtain InputStream", OooO0o0(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iOooO0o0 == -1) {
                        throw new C25117OooO0o0("Http request failed", iOooO0o0, null);
                    }
                    try {
                        throw new C25117OooO0o0(this.f67211OooOoO0.getResponseMessage(), iOooO0o0, null);
                    } catch (IOException e2) {
                        throw new C25117OooO0o0("Failed to get a response message", iOooO0o0, e2);
                    }
                }
                String headerField = this.f67211OooOoO0.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C25117OooO0o0("Received empty or null redirect url", iOooO0o0, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    OooO0O0();
                    return OooO0o(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C25117OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Bad redirect url: ", headerField), iOooO0o0, e3);
                }
            } catch (IOException e4) {
                throw new C25117OooO0o0("Failed to connect or obtain data", OooO0o0(this.f67211OooOoO0), e4);
            }
        } catch (IOException e5) {
            throw new C25117OooO0o0("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC22255OooO0Oo
    public final void cancel() {
        this.f67212OooOoOO = true;
    }
}
