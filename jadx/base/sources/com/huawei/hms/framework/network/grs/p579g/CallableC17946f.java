package com.huawei.hms.framework.network.grs.p579g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p582h.p583f.C17960a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.f */
/* JADX INFO: loaded from: classes7.dex */
public class CallableC17946f extends C17941a implements Callable<C17944d> {

    /* JADX INFO: renamed from: i */
    private static final String f53722i = "f";

    public CallableC17946f(String str, int i, C17943c c17943c, Context context, String str2, GrsBaseInfo grsBaseInfo) {
        super(str, i, c17943c, context, str2, grsBaseInfo, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0042: MOVE (r6 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:14:0x0042 */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17944d call() throws Throwable {
        HttpsURLConnection httpsURLConnectionM77161a;
        long j;
        HttpURLConnection httpURLConnection;
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        String str = f53722i;
        Logger.m76963i(str, "Get call execute");
        long jCurrentTimeMillis2 = 0;
        HttpURLConnection httpURLConnection2 = null;
        InputStream inputStream = null;
        byte[] bArr = null;
        try {
            try {
                try {
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        httpsURLConnectionM77161a = C17960a.m77161a(m77062c(), m77060a(), m77064e());
                    } catch (IOException e) {
                        e = e;
                        httpsURLConnectionM77161a = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (RuntimeException unused) {
                            Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch RuntimeException");
                        } catch (Throwable unused2) {
                            Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch Throwable");
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                httpsURLConnectionM77161a = null;
                j = 0;
            }
            try {
            } catch (IOException e3) {
                e = e3;
                j = jCurrentTimeMillis2;
                jCurrentTimeMillis2 = jElapsedRealtime;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                jCurrentTimeMillis = System.currentTimeMillis();
                Logger.m76968w(f53722i, "RequestCallable run task catch IOException", e);
                this.f53671a = new C17944d(e, jElapsedRealtime2 - jCurrentTimeMillis2);
                if (httpsURLConnectionM77161a != null) {
                    try {
                        httpsURLConnectionM77161a.disconnect();
                    } catch (RuntimeException unused3) {
                        jCurrentTimeMillis2 = j;
                        Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch RuntimeException");
                    } catch (Throwable unused4) {
                        jCurrentTimeMillis2 = j;
                        Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch Throwable");
                    }
                }
                jCurrentTimeMillis2 = j;
            }
            if (httpsURLConnectionM77161a == null) {
                Logger.m76967w(str, "create HttpsURLConnection instance by url return null.");
                if (httpsURLConnectionM77161a != null) {
                    try {
                        httpsURLConnectionM77161a.disconnect();
                        return null;
                    } catch (RuntimeException unused5) {
                        Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch RuntimeException");
                    } catch (Throwable unused6) {
                        Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch Throwable");
                    }
                }
                return null;
            }
            httpsURLConnectionM77161a.setRequestMethod("GET");
            String strM77078a = m77061b() != null ? m77061b().m77078a() : "";
            if (TextUtils.isEmpty(strM77078a)) {
                strM77078a = "&";
            }
            httpsURLConnectionM77161a.setRequestProperty("If-None-Match", strM77078a);
            httpsURLConnectionM77161a.connect();
            int responseCode = httpsURLConnectionM77161a.getResponseCode();
            if (responseCode == 200) {
                try {
                    inputStream = httpsURLConnectionM77161a.getInputStream();
                    byte[] byteArray = IoUtils.toByteArray(inputStream);
                    IoUtils.closeSecure(inputStream);
                    bArr = byteArray;
                } catch (Throwable th2) {
                    IoUtils.closeSecure(inputStream);
                    throw th2;
                }
            }
            Map<String, List<String>> headerFields = httpsURLConnectionM77161a.getHeaderFields();
            httpsURLConnectionM77161a.disconnect();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            jCurrentTimeMillis = System.currentTimeMillis();
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.f53671a = new C17944d(responseCode, headerFields, bArr, jElapsedRealtime3 - jElapsedRealtime);
            try {
                httpsURLConnectionM77161a.disconnect();
            } catch (RuntimeException unused7) {
                Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch RuntimeException");
            } catch (Throwable unused8) {
                Logger.m76967w(f53722i, "RequestCallableV1 disconnect HttpsURLConnection catch Throwable");
            }
            long j2 = jCurrentTimeMillis;
            this.f53671a.m77102b(m77062c());
            this.f53671a.m77097a(m77063d());
            this.f53671a.m77101b(jCurrentTimeMillis2);
            this.f53671a.m77098a(j2);
            if (m77061b() != null) {
                m77061b().m77079a(this.f53671a);
            }
            return this.f53671a;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection2 != null) {
            }
            throw th;
        }
    }
}
