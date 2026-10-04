package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.network.embedded.C18250l0;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import o0O00oO0.C25847OooO0Oo;
import o0O00oO0.OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18264m0 {

    /* JADX INFO: renamed from: a */
    public static final String f55641a = "m0";

    /* JADX INFO: renamed from: b */
    public static SSLSocketFactory f55642b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: a */
    public static C18356t m79109a(Context context, String str, String str2) throws Throwable {
        HttpsURLConnection httpsURLConnection;
        Object obj;
        HttpsURLConnection httpsURLConnection2;
        String str3;
        try {
            f55642b = OooO00o.OooO00o(context);
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            Logger.m76968w(f55641a, "catch exception when create sslSocketFactory", e);
        }
        C18356t c18356t = new C18356t();
        ?? r1 = 0;
        HttpsURLConnection httpsURLConnection3 = null;
        try {
            try {
                httpsURLConnection2 = (HttpsURLConnection) new URL(str).openConnection();
                str3 = C18250l0.a.f55451a;
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            httpsURLConnection2.addRequestProperty(C18250l0.a.f55451a, context.getPackageName());
            httpsURLConnection2.addRequestProperty(C18250l0.a.f55452b, str2);
            httpsURLConnection2.setRequestMethod("POST");
            httpsURLConnection2.setSSLSocketFactory(f55642b);
            httpsURLConnection2.setHostnameVerifier(C25847OooO0Oo.f88202OooO0Oo);
            c18356t.m79541a(httpsURLConnection2.getResponseCode());
            obj = str3;
            httpsURLConnection = httpsURLConnection2;
        } catch (IOException e3) {
            e = e3;
            httpsURLConnection3 = httpsURLConnection2;
            Logger.m76965v(f55641a, "connection query fail");
            c18356t.m79541a(ExceptionCode.getErrorCodeFromException(e));
            r1 = httpsURLConnection3;
            if (httpsURLConnection3 != null) {
                httpsURLConnection = httpsURLConnection3;
                obj = httpsURLConnection3;
            }
            return c18356t;
        } catch (Throwable th2) {
            th = th2;
            r1 = httpsURLConnection2;
            if (r1 != 0) {
                r1.disconnect();
            }
            throw th;
        }
        httpsURLConnection.disconnect();
        r1 = obj;
        return c18356t;
    }

    /* JADX INFO: renamed from: a */
    public static String m79110a(Context context) {
        String str = f55641a;
        Logger.m76965v(str, "entry to getDomainName function");
        Map<String, String> mapSynGetGrsUrls = new GrsClient(context, new GrsBaseInfo()).synGetGrsUrls(C18250l0.n.f55526j);
        if (mapSynGetGrsUrls == null || mapSynGetGrsUrls.isEmpty()) {
            return "";
        }
        String str2 = mapSynGetGrsUrls.get(new ArrayList(mapSynGetGrsUrls.keySet()).get(new SecureRandom().nextInt(mapSynGetGrsUrls.size())));
        Logger.m76965v(str, "domain in random: " + str2);
        return str2;
    }
}
