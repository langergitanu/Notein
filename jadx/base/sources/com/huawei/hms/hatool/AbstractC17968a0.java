package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18196h2;
import com.orion.notein.domain.models.backup.BackupEvent;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import o0O00oO0.C25847OooO0Oo;
import o0O0O0O.OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.a0 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC17968a0 {

    /* JADX INFO: renamed from: com.huawei.hms.hatool.a0$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C17971b0 m77199a(String str, byte[] bArr, Map<String, String> map) {
        return m77200a(str, bArr, map, "POST");
    }

    /* JADX INFO: renamed from: b */
    public static String m77203b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return C18021t0.m77532a(inputStream);
            } catch (IOException unused) {
                C18030y.m77591f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
                C18021t0.m77533a((Closeable) inputStream);
                return "";
            }
        } finally {
            C18021t0.m77533a((Closeable) inputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: a */
    public static C17971b0 m77200a(String str, byte[] bArr, Map<String, String> map, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (TextUtils.isEmpty(str)) {
            return new C17971b0(-100, "");
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        int responseCode = BackupEvent.ERROR_TOKEN_EXPIRED;
        try {
            try {
                str = m77201a((String) str, bArr.length, (Map<String, String>) map, str2);
                try {
                    if (str == 0) {
                        C17971b0 c17971b0 = new C17971b0(BackupEvent.ERROR_INVALID_TOKEN, "");
                        C18021t0.m77533a((Closeable) null);
                        C18021t0.m77533a((Closeable) null);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b0;
                    }
                    map = str.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(map);
                    } catch (a unused) {
                    } catch (SecurityException unused2) {
                    } catch (ConnectException unused3) {
                    } catch (UnknownHostException unused4) {
                    } catch (SSLHandshakeException unused5) {
                    } catch (SSLPeerUnverifiedException unused6) {
                    } catch (IOException unused7) {
                    }
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        responseCode = str.getResponseCode();
                        C17971b0 c17971b02 = new C17971b0(responseCode, m77203b(str));
                        C18021t0.m77533a((Closeable) bufferedOutputStream);
                        C18021t0.m77533a((Closeable) map);
                        C18021t0.m77536a((HttpURLConnection) str);
                        return c17971b02;
                    } catch (a unused8) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "PostRequest(byte[]): No ssl socket factory set!");
                        C17971b0 c17971b03 = new C17971b0(BackupEvent.ERROR_INVALID_TOKEN, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b03;
                    } catch (SecurityException unused9) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "SecurityException with HttpClient. Please check INTERNET permission.");
                        C17971b0 c17971b04 = new C17971b0(responseCode, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b04;
                    } catch (ConnectException unused10) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "Network is unreachable or Connection refused");
                        C17971b0 c17971b05 = new C17971b0(responseCode, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b05;
                    } catch (UnknownHostException unused11) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "No address associated with hostname or No network");
                        C17971b0 c17971b06 = new C17971b0(responseCode, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b06;
                    } catch (SSLHandshakeException unused12) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "Chain validation failed,Certificate expired");
                        C17971b0 c17971b07 = new C17971b0(responseCode, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b07;
                    } catch (SSLPeerUnverifiedException unused13) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "Certificate has not been verified,Request is restricted!");
                        C17971b0 c17971b08 = new C17971b0(responseCode, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b08;
                    } catch (IOException unused14) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18030y.m77591f("hmsSdk", "events PostRequest(byte[]): IOException occurred.");
                        C17971b0 c17971b09 = new C17971b0(responseCode, "");
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        return c17971b09;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream2 = bufferedOutputStream;
                        C18021t0.m77533a((Closeable) bufferedOutputStream2);
                        C18021t0.m77533a((Closeable) map);
                        if (str != 0) {
                            C18021t0.m77536a((HttpURLConnection) str);
                        }
                        throw th;
                    }
                } catch (a unused15) {
                    map = 0;
                } catch (SecurityException unused16) {
                    map = 0;
                } catch (ConnectException unused17) {
                    map = 0;
                } catch (UnknownHostException unused18) {
                    map = 0;
                } catch (SSLHandshakeException unused19) {
                    map = 0;
                } catch (SSLPeerUnverifiedException unused20) {
                    map = 0;
                } catch (IOException unused21) {
                    map = 0;
                } catch (Throwable th2) {
                    th = th2;
                    map = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (a unused22) {
            str = 0;
            map = 0;
        } catch (SecurityException unused23) {
            str = 0;
            map = 0;
        } catch (ConnectException unused24) {
            str = 0;
            map = 0;
        } catch (UnknownHostException unused25) {
            str = 0;
            map = 0;
        } catch (SSLHandshakeException unused26) {
            str = 0;
            map = 0;
        } catch (SSLPeerUnverifiedException unused27) {
            str = 0;
            map = 0;
        } catch (IOException unused28) {
            str = 0;
            map = 0;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            map = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static HttpURLConnection m77201a(String str, int i, Map<String, String> map, String str2) throws ProtocolException, a {
        if (TextUtils.isEmpty(str)) {
            C18030y.m77583b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        m77202a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(C18196h2.f55021c);
        httpURLConnection.setReadTimeout(C18196h2.f55021c);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    public static void m77202a(HttpURLConnection httpURLConnection) throws a {
        String str;
        C25847OooO0Oo c25847OooO0OoOooO00o;
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            try {
                c25847OooO0OoOooO00o = C25847OooO0Oo.OooO00o(AbstractC17970b.m77230i());
            } catch (IOException unused) {
                str = "getSocketFactory(): IO Exception!";
                C18030y.m77591f("hmsSdk", str);
                c25847OooO0OoOooO00o = null;
            } catch (IllegalAccessException unused2) {
                str = "getSocketFactory(): Illegal Access Exception ";
                C18030y.m77591f("hmsSdk", str);
                c25847OooO0OoOooO00o = null;
            } catch (KeyStoreException unused3) {
                str = "getSocketFactory(): Key Store exception";
                C18030y.m77591f("hmsSdk", str);
                c25847OooO0OoOooO00o = null;
            } catch (NoSuchAlgorithmException unused4) {
                str = "getSocketFactory(): Algorithm Exception!";
                C18030y.m77591f("hmsSdk", str);
                c25847OooO0OoOooO00o = null;
            } catch (GeneralSecurityException unused5) {
                str = "getSocketFactory(): General Security Exception";
                C18030y.m77591f("hmsSdk", str);
                c25847OooO0OoOooO00o = null;
            }
            if (c25847OooO0OoOooO00o == null) {
                throw new a("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory(c25847OooO0OoOooO00o);
            httpsURLConnection.setHostnameVerifier(new OooO00o());
        }
    }
}
