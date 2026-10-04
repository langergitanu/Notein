package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class zzZXR {
    private static zzZQC<zzZP1> zzbd;
    private static final zzZP1 zzbc = zzZNG.zzpZ();
    private static final zzZP1 zzbb = zzZP1.zzVq("en-NZ");
    private static boolean zzLX = false;

    private zzZXR() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzZOP zzC(String str, final int i) throws Exception {
        InputStream inputStream;
        if (!zzZVR.zzWF(str)) {
            return zzZOU.zzVj(str);
        }
        final URL urlZzf2 = new zzZKL(zzZVR.zzWv(str.replace(IOUtils.LINE_SEPARATOR_UNIX, ""))).zzf2();
        zzZOR zzzor = new zzZOR();
        ?? NewFixedThreadPool = 1;
        ?? r2 = 0;
        try {
            try {
                NewFixedThreadPool = Executors.newFixedThreadPool(1);
                try {
                    inputStream = (InputStream) NewFixedThreadPool.submit(new Callable<InputStream>() { // from class: com.aspose.words.internal.zzZXR.1
                        /* JADX INFO: Access modifiers changed from: private */
                        @Override // java.util.concurrent.Callable
                        /* JADX INFO: renamed from: zzpT, reason: merged with bridge method [inline-methods] */
                        public InputStream call() throws Exception {
                            if (zzZXR.zzZ(urlZzf2)) {
                                throw new UnknownHostException();
                            }
                            URLConnection uRLConnectionZzZ = zzZXR.zzZ(urlZzf2, i);
                            return uRLConnectionZzZ instanceof HttpURLConnection ? zzZXR.zzZ((HttpURLConnection) uRLConnectionZzZ) : uRLConnectionZzZ.getInputStream();
                        }
                    }).get(i, TimeUnit.MILLISECONDS);
                    if (inputStream != null) {
                        try {
                            zzZKB.zzZ(inputStream, zzzor);
                        } catch (Exception e) {
                            e = e;
                            zzZHV.zzZ(e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r2 = NewFixedThreadPool;
                            if (r2 != 0) {
                            }
                            if (inputStream != null) {
                            }
                            throw th;
                        }
                    }
                    NewFixedThreadPool.shutdownNow();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    zzzor.zzH(0L);
                    return zzzor;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            if (r2 != 0) {
                r2.shutdownNow();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static zzZP1 zzSV(int i) {
        try {
            return zzSW(i);
        } catch (Exception unused) {
            return null;
        }
    }

    private static zzZP1 zzSW(int i) {
        return new zzZP1(i, !zzLX);
    }

    public static zzZP1 zzU(zzZP1 zzzp1) {
        zzZNG.zzS(zzzp1);
        return zzzp1;
    }

    public static InputStream zzV(String str, Class cls) {
        return zzZZE.zzV(str, cls);
    }

    public static zzZOP zzW(String str, Class cls) {
        return zzZZE.zzW(str, cls);
    }

    public static zzZP1 zzWX(String str) {
        zzZP1 zzzp1ZzWZ = zzWZ(str);
        zzZNG.zzS(zzzp1ZzWZ);
        return zzzp1ZzWZ;
    }

    public static zzZP1 zzWY(String str) {
        try {
            return zzWZ(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static zzZP1 zzWZ(String str) {
        return new zzZP1(str);
    }

    public static zzZOP zzX0(String str) throws Exception {
        return zzC(str, 5000);
    }

    public static zzZOP zzX1(String str) {
        return zzZZE.zzW(str, zzZ1.class);
    }

    public static InputStream zzZ(byte[] bArr, String str, String str2, String str3, String str4, zzZNF zzznf) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new zzZKL(zzZVR.zzWv(str)).zzf2().openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", str2);
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.setConnectTimeout((int) zzznf.zzhA());
        if (zzZYD.zzXk(str3)) {
            httpURLConnection.setRequestProperty("Authorization", "Basic " + zzZHR.zzYI(o0Oo0oo.OooO0Oo(str3, C18241k5.f55433h, str4).getBytes()));
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection.getInputStream();
        } catch (Throwable th) {
            if (outputStream != null) {
                outputStream.close();
            }
            throw th;
        }
    }

    private static String zzpU() {
        String property = System.getProperties().getProperty("java.home");
        return !zzZYD.zzXk(property) ? "" : zzZOQ.zzZW(zzZOQ.zzZW(property, "lib"), FontManager.REMOTE_FONT_DIR);
    }

    public static String[] zzpV() {
        return new String[]{"/system/fonts", "/system/font", "/data/fonts"};
    }

    public static void zzpW() {
        zzbd.size();
        zzZNG.zzS(zzbd.pop());
    }

    public static void zzpX() {
        if (zzbd == null) {
            zzbd = new zzZQC<>();
        }
        zzbd.push(zzZNG.zzpZ());
    }

    public static String zzpY() {
        return zzZNG.zzpZ().getLocale().getLanguage();
    }

    public static zzZP1 zzpZ() {
        return zzZNG.zzpZ();
    }

    public static String zzq0() {
        return zzZNG.zzpZ().getName();
    }

    private static String zzq1() throws Exception {
        String str = System.getenv("user.home");
        return zzZYD.zzXk(str) ? zzZOQ.zzZW(zzZOQ.zzZW(str, "Library"), "Fonts") : "";
    }

    private static String zzq2() throws Exception {
        String str = System.getenv("HOME");
        return zzZYD.zzXk(str) ? zzZOQ.zzZW(zzZOQ.zzZW(str, "Library"), "Fonts") : "";
    }

    public static String[] zzq3() throws Exception {
        return new String[]{zzq1(), "/Library/Fonts", "/System/Library/Fonts/", "/System Folder/Fonts/", "/Network/Library/Fonts/"};
    }

    public static String[] zzq4() throws Exception {
        return new String[]{zzq2(), "/Library/Fonts", "/System/Library/Fonts/"};
    }

    private static String zzq5() {
        String property = System.getProperty("user.home");
        return zzZYD.zzXk(property) ? zzZOQ.zzZW(property, ".local/share/fonts") : "";
    }

    private static String zzq6() {
        String property = System.getProperty("user.home");
        return zzZYD.zzXk(property) ? zzZOQ.zzZW(property, ".fonts") : "";
    }

    public static String[] zzq7() {
        return new String[]{zzq6(), zzq5(), "/usr/share/fonts", "/usr/local/share/fonts", "/usr/X11R6/lib/X11/fonts", zzpU()};
    }

    public static String zzq8() {
        try {
            String str = System.getenv("WINDIR");
            return zzZYD.zzXk(str) ? zzZOQ.zzZW(str, "Fonts") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static void zzq9() {
    }

    private static URLConnection zzZ(HttpURLConnection httpURLConnection, URL url) throws IOException {
        return zzZ(httpURLConnection, url, 5000);
    }

    private static URLConnection zzZ(HttpURLConnection httpURLConnection, URL url, int i) throws IOException {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.01; Windows NT 5.0)");
        uRLConnectionOpenConnection.setConnectTimeout(i);
        uRLConnectionOpenConnection.setReadTimeout(i);
        uRLConnectionOpenConnection.connect();
        return uRLConnectionOpenConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream zzZ(HttpURLConnection httpURLConnection) throws IOException {
        while (true) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 300 && responseCode < 400) {
                String headerField = httpURLConnection.getHeaderField("Location");
                if (!zzZYD.zzXk(headerField)) {
                    break;
                }
                httpURLConnection = (HttpURLConnection) zzZ(httpURLConnection, new URL(headerField));
            } else {
                break;
            }
        }
        return httpURLConnection.getInputStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzZ(URL url) {
        if (url.getPort() >= 0 || url.getDefaultPort() >= 0) {
            return new InetSocketAddress(url.getHost(), url.getPort() > 0 ? url.getPort() : url.getDefaultPort()).isUnresolved();
        }
        return false;
    }

    public static /* synthetic */ URLConnection zzZ(URL url, int i) throws IOException {
        return zzZ(null, url, i);
    }
}
