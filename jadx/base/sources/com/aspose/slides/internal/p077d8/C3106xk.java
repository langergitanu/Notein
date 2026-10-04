package com.aspose.slides.internal.p077d8;

import Oooo0oO.o0Oo0oo;
import android.content.pm.Signature;
import android.util.Log;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.constants.FidoConstants;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.xk */
/* JADX INFO: loaded from: classes3.dex */
class C3106xk {

    /* JADX INFO: renamed from: dy */
    private static C3106xk f9225dy = null;

    /* JADX INFO: renamed from: k4 */
    protected static String f9226k4 = "POST";

    /* JADX INFO: renamed from: kk */
    protected static String f9227kk = "PUT";

    /* JADX INFO: renamed from: m9 */
    private static boolean f9228m9 = false;

    /* JADX INFO: renamed from: to */
    protected static String f9229to = "DELETE";

    /* JADX INFO: renamed from: x1 */
    protected static String f9230x1 = "GET";

    /* JADX INFO: renamed from: du */
    private String f9231du = null;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC3078qm f9232h4 = null;

    /* JADX INFO: renamed from: k4 */
    public static C3106xk m13209k4(InterfaceC3078qm interfaceC3078qm, String str, boolean z) {
        C3106xk c3106xk = new C3106xk();
        c3106xk.m13212k4(interfaceC3078qm);
        if (str != null && str.length() > 0) {
            if ("/".equals(str.substring(str.length() - 1))) {
                str = Signature.toCharsString();
            }
            c3106xk.m13217k4(str);
        }
        c3106xk.m13218k4(z);
        f9225dy = c3106xk;
        return c3106xk;
    }

    /* JADX INFO: renamed from: kk */
    private static String m13214kk(String str) {
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m13215x1(String str) {
        if (str == null) {
            str = "";
        }
        return m13214kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    private String m13210k4() {
        return this.f9231du;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m13211k4(Long l) {
        return m13214kk(l.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014b A[EDGE_INSN: B:119:0x014b->B:52:0x014b BREAK  A[LOOP:1: B:49:0x0140->B:51:0x0147], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147 A[Catch: all -> 0x00c0, Exception -> 0x00c3, IOException -> 0x00c6, dq -> 0x00ca, LOOP:1: B:49:0x0140->B:51:0x0147, LOOP_END, TryCatch #0 {all -> 0x00c0, blocks: (B:23:0x0093, B:24:0x0099, B:27:0x00b6, B:28:0x00bb, B:48:0x0133, B:49:0x0140, B:51:0x0147, B:52:0x014b, B:60:0x016b, B:61:0x0175, B:62:0x0176, B:64:0x0183, B:67:0x018d, B:69:0x0193, B:71:0x019b, B:73:0x01a1, B:75:0x01c0, B:78:0x01cb, B:79:0x01d0, B:80:0x01d1, B:81:0x01d6, B:82:0x01d7, B:83:0x01dc, B:84:0x01dd, B:85:0x01e2, B:86:0x01e3, B:87:0x01e8, B:37:0x00cd, B:40:0x00d7, B:41:0x00f9, B:42:0x00fd, B:44:0x0105, B:45:0x0128, B:94:0x01fa, B:95:0x0207), top: B:109:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0183 A[Catch: all -> 0x00c0, Exception -> 0x00c3, IOException -> 0x00c6, dq -> 0x00ca, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:23:0x0093, B:24:0x0099, B:27:0x00b6, B:28:0x00bb, B:48:0x0133, B:49:0x0140, B:51:0x0147, B:52:0x014b, B:60:0x016b, B:61:0x0175, B:62:0x0176, B:64:0x0183, B:67:0x018d, B:69:0x0193, B:71:0x019b, B:73:0x01a1, B:75:0x01c0, B:78:0x01cb, B:79:0x01d0, B:80:0x01d1, B:81:0x01d6, B:82:0x01d7, B:83:0x01dc, B:84:0x01dd, B:85:0x01e2, B:86:0x01e3, B:87:0x01e8, B:37:0x00cd, B:40:0x00d7, B:41:0x00f9, B:42:0x00fd, B:44:0x0105, B:45:0x0128, B:94:0x01fa, B:95:0x0207), top: B:109:0x0093 }] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String, java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m13216k4(String str, String str2, Map<String, String> map, String str3, Map<String, String> map2) throws C3045dq {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        byte[] byteArray;
        int responseCode;
        String str4;
        InterfaceC3078qm interfaceC3078qm;
        if (m13210k4() == null || m13210k4().length() == 0) {
            throw new C3045dq(1005, new String[]{m13210k4()});
        }
        ?? sb = new StringBuilder(m13210k4());
        sb.append(str);
        if (map.keySet().size() > 0) {
            String str5 = MsalUtils.QUERY_STRING_SYMBOL;
            boolean z = true;
            for (String str6 : map.keySet()) {
                if (z) {
                    z = false;
                } else {
                    str5 = "&";
                }
                Log.d(sb, str5);
                sb.append(map.get(str6));
            }
        }
        HashMap map3 = new HashMap();
        if (str2.equals(f9230x1) && (interfaceC3078qm = this.f9232h4) != 0) {
            interfaceC3078qm.mo12808k4(sb, map3);
        }
        try {
            URL url = new URL(sb.toString());
            String string = UUID.randomUUID().toString();
            String str7 = new SimpleDateFormat("MMddyyhhmm").format(Calendar.getInstance().getTime());
            String strOooO0Oo = o0Oo0oo.OooO0Oo(str7, ",", string);
            HttpsURLConnection httpsURLConnection2 = null;
            try {
                try {
                    try {
                        httpsURLConnection = (HttpsURLConnection) url.openConnection();
                    } finally {
                    }
                } catch (IOException e) {
                    e = e;
                }
                try {
                    httpsURLConnection.setConnectTimeout(0);
                    httpsURLConnection.setRequestProperty("Content-Type", "application/xml");
                    httpsURLConnection.setRequestProperty("User-agent", C3089ts.m13127k4());
                    if (!str2.equals(f9230x1)) {
                        if (str2.equals(f9226k4)) {
                            m13213k4(map3, httpsURLConnection, str3);
                            httpsURLConnection.setRequestMethod("POST");
                            httpsURLConnection.setDoOutput(true);
                            outputStream = httpsURLConnection.getOutputStream();
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                            bufferedWriter.write(str3);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                        } else {
                            if (!str2.equals(f9227kk)) {
                                str4 = str2.equals(f9229to) ? "DELETE" : "GET";
                                inputStream = httpsURLConnection.getInputStream();
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                bArr = new byte[1024];
                                while (true) {
                                    i = inputStream.read(bArr, 0, 1024);
                                    if (i == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                                byteArrayOutputStream.flush();
                                byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                byteArrayOutputStream.close();
                                responseCode = httpsURLConnection.getResponseCode();
                                if (responseCode == 200 && responseCode != 202 && responseCode != 201) {
                                    throw new C3045dq(responseCode, new String(byteArray, "utf8"));
                                }
                                String str8 = new String(byteArray, "utf8");
                                if (str2.equals(f9230x1)) {
                                    String headerField = httpsURLConnection.getHeaderField("nonce");
                                    if (headerField == null || !headerField.equals(strOooO0Oo)) {
                                        throw new C3045dq(401, "not allowed");
                                    }
                                    String headerField2 = httpsURLConnection.getHeaderField(FidoConstants.WEBAUTHN_RESPONSE_SIGNATURE_JSON_KEY);
                                    if (headerField2 == null) {
                                        throw new C3045dq(401, "not allowed");
                                    }
                                    byte[] bytes = str8.getBytes("utf8");
                                    if (bytes == null) {
                                        throw new C3045dq(401, "not allowed");
                                    }
                                    byte[] bytes2 = str7.getBytes("utf8");
                                    byte[] bytes3 = string.getBytes("utf8");
                                    byte[] bArr2 = new byte[bytes.length + bytes2.length + bytes3.length];
                                    System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
                                    System.arraycopy(bytes2, 0, bArr2, 0, bytes2.length);
                                    System.arraycopy(bytes3, 0, bArr2, 0, bytes3.length);
                                    InterfaceC3078qm interfaceC3078qm2 = this.f9232h4;
                                    if (interfaceC3078qm2 == null) {
                                        throw new C3045dq(401, "not allowed");
                                    }
                                    if (!interfaceC3078qm2.mo12807k4(bArr2).equals(headerField2)) {
                                        throw new C3045dq(401, "not allowed");
                                    }
                                }
                                return str8;
                            }
                            m13213k4(map3, httpsURLConnection, str3);
                            httpsURLConnection.setRequestMethod("PUT");
                            httpsURLConnection.setDoOutput(true);
                            outputStream = httpsURLConnection.getOutputStream();
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                            bufferedWriter2.write(str3);
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                        }
                        outputStream.close();
                        inputStream = httpsURLConnection.getInputStream();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        bArr = new byte[1024];
                        while (true) {
                            i = inputStream.read(bArr, 0, 1024);
                            if (i == -1) {
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                        byteArrayOutputStream.flush();
                        byteArray = byteArrayOutputStream.toByteArray();
                        inputStream.close();
                        byteArrayOutputStream.close();
                        responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode == 200) {
                        }
                        String str82 = new String(byteArray, "utf8");
                        if (str2.equals(f9230x1)) {
                        }
                        return str82;
                    }
                    httpsURLConnection.setRequestProperty("nonce", strOooO0Oo);
                    httpsURLConnection.setRequestMethod(str4);
                    inputStream = httpsURLConnection.getInputStream();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    bArr = new byte[1024];
                    while (true) {
                        i = inputStream.read(bArr, 0, 1024);
                        if (i == -1) {
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                    byteArrayOutputStream.flush();
                    byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    byteArrayOutputStream.close();
                    responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                    }
                    String str822 = new String(byteArray, "utf8");
                    if (str2.equals(f9230x1)) {
                    }
                    return str822;
                } catch (IOException e2) {
                    e = e2;
                    httpsURLConnection2 = httpsURLConnection;
                    if (httpsURLConnection2 == null) {
                        throw new IllegalStateException(e.getMessage());
                    }
                    try {
                        throw new C3045dq(httpsURLConnection2.getResponseCode(), e.getMessage());
                    } catch (IOException e3) {
                        throw new IllegalStateException(e.getMessage() + IOUtils.LINE_SEPARATOR_WINDOWS + e3.getMessage());
                    }
                }
            } catch (C3045dq e4) {
                throw e4;
            } catch (Exception e5) {
                throw new C3045dq(999, e5.getMessage());
            }
        } catch (Exception e6) {
            throw new C3045dq(0, e6.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m13212k4(InterfaceC3078qm interfaceC3078qm) {
        this.f9232h4 = interfaceC3078qm;
    }

    /* JADX INFO: renamed from: k4 */
    public void m13217k4(String str) {
        this.f9231du = str;
    }

    /* JADX INFO: renamed from: k4 */
    private void m13213k4(Map<String, String> map, HttpsURLConnection httpsURLConnection, Object obj) {
        if (this.f9232h4 != null) {
            map.clear();
            this.f9232h4.mo12808k4(new StringBuilder((String) obj), map);
            for (String str : map.keySet()) {
                httpsURLConnection.setRequestProperty(str, map.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m13218k4(boolean z) {
        f9228m9 = z;
    }
}
