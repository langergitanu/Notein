package com.huawei.hms.framework.network.grs.p582h.p583f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.p582h.C17955a;
import com.huawei.hms.framework.network.grs.p582h.p584g.C17961a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.f.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17960a {
    /* JADX INFO: renamed from: a */
    public static HttpsURLConnection m77161a(String str, Context context, String str2) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            Logger.m76967w("URLConnectionHelper", "urlConnection is not an instance of HttpsURLConnection");
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        try {
            httpsURLConnection.setSSLSocketFactory(C17961a.m77164a(context));
            httpsURLConnection.setHostnameVerifier(C17961a.m77163a());
        } catch (IllegalArgumentException unused) {
            Logger.m76967w("URLConnectionHelper", "init https ssl socket failed.");
        }
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        String strM77150b = C17955a.m77150b(context, "NetworkKit-grs", str2);
        Logger.m76958d("URLConnectionHelper", "request to grs server with a User-Agent header is:" + strM77150b);
        httpsURLConnection.setRequestProperty("User-Agent", strM77150b);
        return httpsURLConnection;
    }

    /* JADX INFO: renamed from: a */
    public static void m77162a(HttpsURLConnection httpsURLConnection, String str) throws Throwable {
        OutputStream outputStream;
        String str2;
        if (str == null) {
            str2 = "sendHttpBody: The Body Data is Null";
        } else if (httpsURLConnection == null) {
            str2 = "sendHttpBody: HttpsURLConnection is Null";
        } else {
            try {
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(str.getBytes("UTF-8"));
                    outputStream.flush();
                    IoUtils.closeSecure(outputStream);
                    return;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.closeSecure(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        }
        Logger.m76963i("URLConnectionHelper", str2);
    }
}
