package o00OoOoO;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.common.net.HttpHeaders;
import com.microsoft.identity.common.java.commands.SilentTokenCommand;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oo.C25057OooO00o;
import o00Oo0oo.C25060OooO0OO;
import o00Oo0oo.CallableC25061OooO0Oo;

/* JADX INFO: renamed from: o00OoOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25070OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final CookieManager f85096OooO00o = new CookieManager();

    /* JADX INFO: renamed from: o00OoOoO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19674OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f85097OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f85098OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, String> f85099OooO0OO;

        public C19674OooO00o(String str, byte[] bArr, Map map) {
            this.f85097OooO00o = str;
            this.f85098OooO0O0 = bArr;
            this.f85099OooO0OO = map;
        }

        public final String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f85097OooO00o, this.f85099OooO0OO);
        }
    }

    /* JADX INFO: renamed from: o00OoOoO.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<String, List<String>> f85100OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final byte[] f85101OooO0O0;

        public OooO0O0(byte[] bArr, Map map) {
            this.f85100OooO00o = map;
            this.f85101OooO0O0 = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO0O0 OooO00o(Context context, C19674OooO00o c19674OooO00o) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        URL url;
        CookieManager cookieManager;
        if (context != null) {
            try {
                c19674OooO00o.toString();
                url = new URL(c19674OooO00o.f85097OooO00o);
                Proxy proxyOooO0O0 = OooO0O0(context);
                Objects.toString(proxyOooO0O0);
                httpURLConnection = proxyOooO0O0 != null ? (HttpURLConnection) url.openConnection(proxyOooO0O0) : (HttpURLConnection) url.openConnection();
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = null;
            }
            try {
                System.setProperty("http.keepAlive", TelemetryEventStrings.Value.FALSE);
                boolean z = httpURLConnection instanceof HttpsURLConnection;
                cookieManager = f85096OooO00o;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection.setRequestProperty(HttpHeaders.COOKIE, TextUtils.join(";", cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
                httpURLConnection.setReadTimeout(SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("User-Agent", "msp");
                byte[] bArr = c19674OooO00o.f85098OooO0O0;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream;binary/octet-stream");
                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, "UTF-8");
                    httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
                    httpURLConnection.setRequestProperty(HttpHeaders.KEEP_ALIVE, "timeout=180, max=100");
                }
                Map<String, String> map = c19674OooO00o.f85099OooO0OO;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                httpURLConnection.setDoInput(true);
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    httpURLConnection.setDoOutput(true);
                }
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                    } catch (Throwable th4) {
                        th2 = th4;
                        bufferedInputStream = null;
                        try {
                            C25052OooO0Oo.OooO00o(th2);
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable unused) {
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } else {
                    bufferedOutputStream = null;
                }
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                bufferedOutputStream = null;
                bufferedInputStream = null;
                C25052OooO0Oo.OooO00o(th2);
                if (httpURLConnection != null) {
                }
                if (bufferedInputStream != null) {
                }
                if (bufferedOutputStream != null) {
                }
                return null;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i = bufferedInputStream.read(bArr2, 0, 1024);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null && headerFields.get(null) != null) {
                    TextUtils.join(",", headerFields.get(null));
                }
                List<String> list = headerFields.get(HttpHeaders.SET_COOKIE);
                if (list != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        List<HttpCookie> list2 = HttpCookie.parse(it.next());
                        if (list2 != null && !list2.isEmpty()) {
                            cookieManager.getCookieStore().add(url.toURI(), list2.get(0));
                        }
                    }
                }
                OooO0O0 oooO0O0 = new OooO0O0(byteArray, headerFields);
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable unused4) {
                }
                try {
                    bufferedInputStream.close();
                } catch (Throwable unused5) {
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable unused6) {
                    }
                }
                return oooO0O0;
            } catch (Throwable th6) {
                th2 = th6;
                C25052OooO0Oo.OooO00o(th2);
                if (httpURLConnection != null) {
                }
                if (bufferedInputStream != null) {
                }
                if (bufferedOutputStream != null) {
                }
                return null;
            }
        }
        return null;
    }

    public static Proxy OooO0O0(Context context) {
        String lowerCase = "none";
        try {
            ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = C25057OooO00o.f85081OooO00o;
            Context applicationContext = context == null ? null : context.getApplicationContext();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            NetworkInfo networkInfo = (NetworkInfo) C25057OooO00o.OooO0O0(2, 10L, timeUnit, new C25060OooO0OO(), new CallableC25061OooO0Oo(applicationContext), false, 10L, timeUnit, null, false);
            if (networkInfo != null && networkInfo.isAvailable()) {
                lowerCase = networkInfo.getType() == 1 ? "wifi" : networkInfo.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        if (lowerCase != null && !lowerCase.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
