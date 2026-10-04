package com.huawei.hms.network.embedded;

import com.aspose.words.internal.C22246OooO0oo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18222j0 {

    /* JADX INFO: renamed from: a */
    public static final String f55298a = "PingNet";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4 A[PHI: r3 r5 r10 r11 r12
      0x00f4: PHI (r3v3 com.huawei.hms.network.embedded.k0) = (r3v1 com.huawei.hms.network.embedded.k0), (r3v4 com.huawei.hms.network.embedded.k0) binds: [B:55:0x00cf, B:62:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r5v7 java.io.BufferedReader) = (r5v5 java.io.BufferedReader), (r5v8 java.io.BufferedReader) binds: [B:55:0x00cf, B:62:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r10v12 java.lang.Process) = (r10v17 java.lang.Process), (r10v18 java.lang.Process) binds: [B:55:0x00cf, B:62:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r11v6 java.io.InputStreamReader) = (r11v4 java.io.InputStreamReader), (r11v7 java.io.InputStreamReader) binds: [B:55:0x00cf, B:62:0x00f2] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r12v11 java.io.InputStream) = (r12v19 java.io.InputStream), (r12v20 java.io.InputStream) binds: [B:55:0x00cf, B:62:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.ProcessBuilder] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C18236k0 m78837a(String str, int i, int i2, StringBuffer stringBuffer) throws Throwable {
        Process processStart;
        InputStream inputStream;
        BufferedReader bufferedReader;
        ?? r12;
        ?? r10;
        InputStream inputStream2;
        Process process;
        InputStream inputStream3;
        Process process2;
        InputStream inputStream4;
        Process process3;
        C18236k0 c18236k0 = new C18236k0(str, i, i2, stringBuffer);
        ?? processBuilder = new ProcessBuilder(m78836a(c18236k0));
        processBuilder.redirectErrorStream(true);
        InputStreamReader inputStreamReader = null;
        try {
            try {
                processStart = processBuilder.start();
                try {
                    inputStream = processStart.getInputStream();
                    try {
                        InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, Charset.forName("utf-8"));
                        try {
                            bufferedReader = new BufferedReader(inputStreamReader2);
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    m78835a(c18236k0.m78947g(), line);
                                    c18236k0 = m78833a(line, c18236k0);
                                } catch (IOException e) {
                                    e = e;
                                    inputStreamReader = inputStreamReader2;
                                    process3 = processStart;
                                    inputStream4 = inputStream;
                                    Logger.m76967w(f55298a, "the ping has ioException:" + e.getClass().getSimpleName());
                                    process2 = process3;
                                    inputStream3 = inputStream4;
                                    processBuilder = process3;
                                    stringBuffer = inputStream4;
                                    if (process3 != null) {
                                        process2.destroy();
                                        processBuilder = process2;
                                        stringBuffer = inputStream3;
                                    }
                                    IoUtils.closeSecure((InputStream) stringBuffer);
                                    IoUtils.closeSecure((Reader) inputStreamReader);
                                    IoUtils.closeSecure((Reader) bufferedReader);
                                    return c18236k0;
                                } catch (InterruptedException e2) {
                                    e = e2;
                                    inputStreamReader = inputStreamReader2;
                                    process = processStart;
                                    inputStream2 = inputStream;
                                    Logger.m76967w(f55298a, "the ping has interruptedException:" + e.getClass().getSimpleName());
                                    processBuilder = process;
                                    stringBuffer = inputStream2;
                                    if (process != null) {
                                        process2 = process;
                                        inputStream3 = inputStream2;
                                        process2.destroy();
                                        processBuilder = process2;
                                        stringBuffer = inputStream3;
                                    }
                                    IoUtils.closeSecure((InputStream) stringBuffer);
                                    IoUtils.closeSecure((Reader) inputStreamReader);
                                    IoUtils.closeSecure((Reader) bufferedReader);
                                    return c18236k0;
                                } catch (Throwable th) {
                                    th = th;
                                    inputStreamReader = inputStreamReader2;
                                    r10 = processStart;
                                    r12 = inputStream;
                                    if (r10 != 0) {
                                        r10.destroy();
                                    }
                                    IoUtils.closeSecure((InputStream) r12);
                                    IoUtils.closeSecure((Reader) inputStreamReader);
                                    IoUtils.closeSecure((Reader) bufferedReader);
                                    throw th;
                                }
                            }
                            if (processStart.waitFor() == 0) {
                                Logger.m76965v(f55298a, "exec cmd success.");
                                m78835a(c18236k0.m78947g(), "exec cmd success.");
                                c18236k0.m78937a(true);
                            } else {
                                Logger.m76965v(f55298a, "exec cmd fail.");
                                m78835a(c18236k0.m78947g(), "exec cmd fail.");
                                c18236k0.m78944d(null);
                                c18236k0.m78937a(false);
                            }
                            m78835a(c18236k0.m78947g(), "exec finished.");
                            processStart.destroy();
                            IoUtils.closeSecure(inputStream);
                            IoUtils.closeSecure((Reader) inputStreamReader2);
                            IoUtils.closeSecure((Reader) bufferedReader);
                            return c18236k0;
                        } catch (IOException e3) {
                            e = e3;
                            bufferedReader = null;
                        } catch (InterruptedException e4) {
                            e = e4;
                            bufferedReader = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = null;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        bufferedReader = null;
                        process3 = processStart;
                        inputStream4 = inputStream;
                        Logger.m76967w(f55298a, "the ping has ioException:" + e.getClass().getSimpleName());
                        process2 = process3;
                        inputStream3 = inputStream4;
                        processBuilder = process3;
                        stringBuffer = inputStream4;
                        if (process3 != null) {
                        }
                        IoUtils.closeSecure((InputStream) stringBuffer);
                        IoUtils.closeSecure((Reader) inputStreamReader);
                        IoUtils.closeSecure((Reader) bufferedReader);
                        return c18236k0;
                    } catch (InterruptedException e6) {
                        e = e6;
                        bufferedReader = null;
                        process = processStart;
                        inputStream2 = inputStream;
                        Logger.m76967w(f55298a, "the ping has interruptedException:" + e.getClass().getSimpleName());
                        processBuilder = process;
                        stringBuffer = inputStream2;
                        if (process != null) {
                        }
                        IoUtils.closeSecure((InputStream) stringBuffer);
                        IoUtils.closeSecure((Reader) inputStreamReader);
                        IoUtils.closeSecure((Reader) bufferedReader);
                        return c18236k0;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedReader = null;
                        r10 = processStart;
                        r12 = inputStream;
                        if (r10 != 0) {
                        }
                        IoUtils.closeSecure((InputStream) r12);
                        IoUtils.closeSecure((Reader) inputStreamReader);
                        IoUtils.closeSecure((Reader) bufferedReader);
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                    inputStream = null;
                } catch (InterruptedException e8) {
                    e = e8;
                    inputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                }
            } catch (Throwable th5) {
                th = th5;
                r10 = processBuilder;
                r12 = stringBuffer;
            }
        } catch (IOException e9) {
            e = e9;
            processStart = null;
            inputStream = null;
        } catch (InterruptedException e10) {
            e = e10;
            processStart = null;
            inputStream = null;
        } catch (Throwable th6) {
            th = th6;
            processStart = null;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18236k0 m78833a(String str, C18236k0 c18236k0) {
        String strM78834a = m78834a(str);
        if (strM78834a != null) {
            c18236k0.m78944d(strM78834a);
            Logger.m76965v(f55298a, "ping time:".concat(strM78834a));
        }
        if (str.contains("avg")) {
            int iIndexOf = str.indexOf("/", 20);
            int iIndexOf2 = str.indexOf(".", iIndexOf);
            int i = iIndexOf + 1;
            Logger.m76965v(f55298a, C22246OooO0oo.OooO00o(new StringBuilder("ping avg time:"), str, TranslateLanguage.MALAY, i, iIndexOf2));
            c18236k0.m78935a(C22246OooO0oo.OooO00o(new StringBuilder(), str, TranslateLanguage.MALAY, i, iIndexOf2));
        }
        if (str.contains("packet loss")) {
            int iIndexOf3 = str.indexOf("%");
            StringBuilder sb = new StringBuilder("packet loss rate:");
            int i2 = iIndexOf3 - 2;
            sb.append(str.substring(i2, iIndexOf3));
            Logger.m76965v(f55298a, sb.toString());
            c18236k0.m78942c(str.substring(i2, iIndexOf3));
        }
        return c18236k0;
    }

    /* JADX INFO: renamed from: a */
    public static String m78834a(String str) {
        String strSubstring = null;
        for (String str2 : str.split(IOUtils.LINE_SEPARATOR_UNIX)) {
            if (str2.contains("time=")) {
                strSubstring = str2.substring(str2.indexOf("time=") + 5);
                Logger.m76965v(f55298a, "the ping time is : " + strSubstring);
            }
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: a */
    public static void m78835a(StringBuffer stringBuffer, String str) {
        if (stringBuffer != null) {
            stringBuffer.append(str);
            stringBuffer.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m78836a(C18236k0 c18236k0) {
        return new String[]{"ping", "-c", String.valueOf(c18236k0.m78943d()), "-w", String.valueOf(c18236k0.m78946f()), c18236k0.m78938b()};
    }
}
