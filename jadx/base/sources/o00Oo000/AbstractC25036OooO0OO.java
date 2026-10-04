package o00Oo000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.api.client.testing.util.TestableByteArrayInputStream;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import o000ooOO.C24741OooOO0o;
import o00OOOo0.C25015OooO00o;
import o00OOOoO.C25017OooO0O0;
import o00OOooO.C25019OooO00o;
import o00OOooO.C25020OooO0O0;
import o00Oo0o.C25046OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0o0.C25048OooO0O0;
import o00Oo0oO.C25052OooO0Oo;
import o00Oo0oO.OooOOOO;
import o00OoOoO.C25070OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00Oo000.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25036OooO0OO {
    public static boolean OooO(C25070OooO00o.OooO0O0 oooO0O0) {
        List<String> list = oooO0O0.f85100OooO00o.get("msp-gzip");
        return Boolean.valueOf(list == null ? null : TextUtils.join(",", list)).booleanValue();
    }

    public static JSONObject OooO0oo(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C18437z2.f56754h, str);
        jSONObject2.put("method", str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    public String OooO00o(C25047OooO00o c25047OooO00o) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put("device", Build.MODEL);
        map.put("namespace", "com.alipay.mobilecashier");
        map.put("api_name", "com.alipay.mcpay");
        map.put("api_version", OooOO0());
        return OooO0OO(c25047OooO00o, map, new HashMap<>());
    }

    public String OooO0O0(C25047OooO00o c25047OooO00o, String str, JSONObject jSONObject) {
        C25048OooO0O0 c25048OooO0O0OooO0O0 = C25048OooO0O0.OooO0O0();
        C25046OooO00o c25046OooO00oOooO00o = C25046OooO00o.OooO00o((Context) c25048OooO0O0OooO0O0.f85047OooO00o);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        boolean z = false;
        try {
            JSONObject[] jSONObjectArr = {jSONObject2, jSONObject};
            for (int i = 0; i < 2; i++) {
                JSONObject jSONObject4 = jSONObjectArr[i];
                if (jSONObject4 != null) {
                    Iterator<String> itKeys = jSONObject4.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
        } catch (JSONException e) {
            C25052OooO0Oo.OooO00o(e);
        }
        try {
            jSONObject3.put("external_info", str);
            jSONObject3.put("tid", c25046OooO00oOooO00o.f85026OooO00o);
            jSONObject3.put("user_agent", C25017OooO0O0.OooO0Oo().OooO00o(c25047OooO00o, c25046OooO00oOooO00o, OooOO0O()));
            jSONObject3.put("has_alipay", OooOOOO.OooOO0(c25047OooO00o, (Context) c25048OooO0O0OooO0O0.f85047OooO00o, o00OOOO0.OooO00o.f84883OooO0Oo, false));
            try {
                if (((Context) c25048OooO0O0OooO0O0.f85047OooO00o).getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            jSONObject3.put("has_msp_app", z);
            jSONObject3.put("app_key", "2014052600006128");
            jSONObject3.put("utdid", c25048OooO0O0OooO0O0.OooO00o());
            jSONObject3.put("new_client_key", c25046OooO00oOooO00o.f85027OooO0O0);
            jSONObject3.put("pa", C25017OooO0O0.OooO0OO((Context) c25048OooO0O0OooO0O0.f85047OooO00o));
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(c25047OooO00o, "biz", "BodyErr", th);
            C25052OooO0Oo.OooO00o(th);
        }
        return jSONObject3.toString();
    }

    public String OooO0OO(C25047OooO00o c25047OooO00o, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            jSONObject3.put(entry2.getKey(), entry2.getValue());
        }
        jSONObject2.put("params", jSONObject3);
        jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
        return jSONObject.toString();
    }

    public HashMap OooO0Oo(String str, boolean z) {
        HashMap map = new HashMap();
        map.put("msp-gzip", String.valueOf(z));
        map.put("Operation-Type", "alipay.msp.cashier.dispatch.bytes");
        map.put("content-type", "application/octet-stream");
        map.put("Version", "2.0");
        map.put("AppId", "TAOBAO");
        String strOooO00o = "";
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("&");
            if (strArrSplit.length != 0) {
                String strOooO00o2 = null;
                String strOooO00o3 = null;
                String strOooO00o4 = null;
                String strOooO00o5 = null;
                for (String str2 : strArrSplit) {
                    if (TextUtils.isEmpty(strOooO00o2)) {
                        strOooO00o2 = !str2.contains("biz_type") ? null : C25034OooO00o.OooO00o(str2);
                    }
                    if (TextUtils.isEmpty(strOooO00o3)) {
                        strOooO00o3 = !str2.contains("biz_no") ? null : C25034OooO00o.OooO00o(str2);
                    }
                    if (TextUtils.isEmpty(strOooO00o4)) {
                        strOooO00o4 = (!str2.contains("trade_no") || str2.startsWith("out_trade_no")) ? null : C25034OooO00o.OooO00o(str2);
                    }
                    if (TextUtils.isEmpty(strOooO00o5)) {
                        strOooO00o5 = !str2.contains("app_userid") ? null : C25034OooO00o.OooO00o(str2);
                    }
                }
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(strOooO00o2)) {
                    sb.append("biz_type=" + strOooO00o2 + ";");
                }
                if (!TextUtils.isEmpty(strOooO00o3)) {
                    sb.append("biz_no=" + strOooO00o3 + ";");
                }
                if (!TextUtils.isEmpty(strOooO00o4)) {
                    sb.append("trade_no=" + strOooO00o4 + ";");
                }
                if (!TextUtils.isEmpty(strOooO00o5)) {
                    sb.append("app_userid=" + strOooO00o5 + ";");
                }
                String string = sb.toString();
                strOooO00o = string.endsWith(";") ? androidx.core.content.OooO0OO.OooO00o(1, 0, string) : string;
            }
        }
        map.put("Msp-Param", strOooO00o);
        map.put("des-mode", "CBC");
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x006f: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:15:0x006f */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0107 A[EXC_TOP_SPLITTER, PHI: r0 r6
      0x0107: PHI (r0v22 byte[]) = (r0v48 byte[]), (r0v51 byte[]), (r0v51 byte[]) binds: [B:71:0x0105, B:141:0x0107, B:52:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x0107: PHI (r6v3 java.io.DataOutputStream) = (r6v13 java.io.DataOutputStream), (r6v14 java.io.DataOutputStream), (r6v14 java.io.DataOutputStream) binds: [B:71:0x0105, B:141:0x0107, B:52:0x00e5] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C25035OooO0O0 OooO0o(C25047OooO00o c25047OooO00o, Context context, String str, String str2, boolean z) throws Throwable {
        boolean z2;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        byte[] byteArray2;
        C25070OooO00o.OooO0O0 oooO0O0OooO00o;
        TestableByteArrayInputStream testableByteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream;
        String str3;
        String str4;
        C25035OooO0O0 c25035OooO0O0;
        String strOooO00o = OooOOOO.OooO00o(24);
        String strOooO00o2 = OooO00o(c25047OooO00o);
        String strOooO0O0 = OooO0O0(c25047OooO00o, str, OooO0oO());
        HashMap mapOooO0Oo = OooO0Oo(str, false);
        String str5 = (String) mapOooO0Oo.get("iSr");
        byte[] bytes = strOooO00o2.getBytes();
        byte[] bytes2 = strOooO0O0.getBytes();
        try {
            bytes2 = C25020OooO0O0.OooO00o(bytes2);
            z2 = true;
        } catch (Exception unused) {
            z2 = false;
        }
        byte[] bArr = bytes2;
        try {
            try {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA).generatePublic(new X509EncodedKeySpec(C25019OooO00o.OooO0OO(C25015OooO00o.f84903OooO00o)));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, publicKeyGeneratePublic);
                byte[] bytes3 = strOooO00o.getBytes("UTF-8");
                int blockSize = cipher.getBlockSize();
                byteArrayOutputStream2 = new ByteArrayOutputStream();
                for (int i = 0; i < bytes3.length; i += blockSize) {
                    try {
                        byteArrayOutputStream2.write(cipher.doFinal(bytes3, i, bytes3.length - i < blockSize ? bytes3.length - i : blockSize));
                    } catch (Exception e) {
                        e = e;
                        C25052OooO0Oo.OooO00o(e);
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e2) {
                                e = e2;
                                byteArray = null;
                                C25052OooO0Oo.OooO00o(e);
                            }
                        }
                        byteArray = null;
                    }
                }
                byteArray = byteArrayOutputStream2.toByteArray();
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException e3) {
                    e = e3;
                    C25052OooO0Oo.OooO00o(e);
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream3;
                Throwable th2 = th;
                if (byteArrayOutputStream != null) {
                    throw th2;
                }
                try {
                    byteArrayOutputStream.close();
                    throw th2;
                } catch (IOException e4) {
                    C25052OooO0Oo.OooO00o(e4);
                    throw th2;
                }
            }
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            Throwable th22 = th;
            if (byteArrayOutputStream != null) {
            }
        }
        byte[][] bArr2 = {bytes, byteArray, C24741OooOO0o.OooO0O0(strOooO00o, str5, bArr)};
        try {
            byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                dataOutputStream2 = new DataOutputStream(byteArrayOutputStream5);
                for (int i2 = 0; i2 < 3; i2++) {
                    try {
                        try {
                            byte[] bArr3 = bArr2[i2];
                            dataOutputStream2.write(String.format(Locale.getDefault(), "%05d", Integer.valueOf(bArr3.length)).getBytes());
                            dataOutputStream2.write(bArr3);
                        } catch (Exception e6) {
                            e = e6;
                            C25052OooO0Oo.OooO00o(e);
                            if (byteArrayOutputStream5 != null) {
                                try {
                                    byteArrayOutputStream5.close();
                                } catch (Exception unused2) {
                                }
                            }
                            byteArray2 = null;
                            if (dataOutputStream2 != null) {
                                dataOutputStream2.close();
                            }
                            oooO0O0OooO00o = C25070OooO00o.OooO00o(context, new C25070OooO00o.C19674OooO00o(str2, byteArray2, OooO0Oo(str, z2)));
                            if (oooO0O0OooO00o == null) {
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream4 = byteArrayOutputStream5;
                        dataOutputStream = dataOutputStream2;
                        if (byteArrayOutputStream4 != null) {
                            try {
                                byteArrayOutputStream4.close();
                            } catch (Exception unused3) {
                            }
                        }
                        if (dataOutputStream != null) {
                            throw th;
                        }
                        try {
                            dataOutputStream.close();
                            throw th;
                        } catch (Exception unused4) {
                            throw th;
                        }
                    }
                }
                dataOutputStream2.flush();
                byteArray2 = byteArrayOutputStream5.toByteArray();
                try {
                    byteArrayOutputStream5.close();
                } catch (Exception unused5) {
                }
            } catch (Exception e7) {
                e = e7;
                dataOutputStream2 = null;
                C25052OooO0Oo.OooO00o(e);
                if (byteArrayOutputStream5 != null) {
                }
                byteArray2 = null;
                if (dataOutputStream2 != null) {
                }
                oooO0O0OooO00o = C25070OooO00o.OooO00o(context, new C25070OooO00o.C19674OooO00o(str2, byteArray2, OooO0Oo(str, z2)));
                if (oooO0O0OooO00o == null) {
                }
            } catch (Throwable th5) {
                th = th5;
                byteArrayOutputStream4 = byteArrayOutputStream5;
                dataOutputStream = null;
                if (byteArrayOutputStream4 != null) {
                }
                if (dataOutputStream != null) {
                }
            }
        } catch (Exception e8) {
            e = e8;
            byteArrayOutputStream5 = null;
        } catch (Throwable th6) {
            th = th6;
            byteArrayOutputStream4 = null;
        }
        try {
            dataOutputStream2.close();
        } catch (Exception unused6) {
        }
        oooO0O0OooO00o = C25070OooO00o.OooO00o(context, new C25070OooO00o.C19674OooO00o(str2, byteArray2, OooO0Oo(str, z2)));
        if (oooO0O0OooO00o == null) {
            throw new RuntimeException("Response is null.");
        }
        boolean zOooO = OooO(oooO0O0OooO00o);
        byte[] bArr4 = oooO0O0OooO00o.f85101OooO0O0;
        String str6 = (String) mapOooO0Oo.get("iSr");
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr4);
                try {
                    byte[] bArr5 = new byte[5];
                    byteArrayInputStream.read(bArr5);
                    byte[] bArr6 = new byte[Integer.parseInt(new String(bArr5))];
                    byteArrayInputStream.read(bArr6);
                    str3 = new String(bArr6);
                } catch (Exception e9) {
                    e = e9;
                    str3 = null;
                    C25052OooO0Oo.OooO00o(e);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception unused7) {
                        }
                    }
                    str4 = null;
                    if (str3 == null) {
                    }
                    if (c25035OooO0O0 != null) {
                    }
                }
                try {
                    byte[] bArr7 = new byte[5];
                    byteArrayInputStream.read(bArr7);
                    int i3 = Integer.parseInt(new String(bArr7));
                    if (i3 > 0) {
                        byte[] bArr8 = new byte[i3];
                        byteArrayInputStream.read(bArr8);
                        byte[] bArrOooO00o = C24741OooOO0o.OooO00o(strOooO00o, str6, bArr8);
                        if (zOooO) {
                            bArrOooO00o = C25020OooO0O0.OooO0O0(bArrOooO00o);
                        }
                        str4 = new String(bArrOooO00o);
                    } else {
                        str4 = null;
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused8) {
                    }
                } catch (Exception e10) {
                    e = e10;
                    C25052OooO0Oo.OooO00o(e);
                    if (byteArrayInputStream != null) {
                    }
                    str4 = null;
                }
            } catch (Throwable th7) {
                th = th7;
                testableByteArrayInputStream = "iSr";
                if (testableByteArrayInputStream != 0) {
                    try {
                        testableByteArrayInputStream.close();
                    } catch (Exception unused9) {
                    }
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            byteArrayInputStream = null;
        } catch (Throwable th8) {
            th = th8;
            testableByteArrayInputStream = 0;
            if (testableByteArrayInputStream != 0) {
            }
            throw th;
        }
        c25035OooO0O0 = (str3 == null || str4 != null) ? new C25035OooO0O0(str3, str4) : null;
        if (c25035OooO0O0 != null) {
            return c25035OooO0O0;
        }
        String str7 = (String) c25035OooO0O0.f85014OooO0O0;
        if (TextUtils.isEmpty(str7)) {
            return c25035OooO0O0;
        }
        try {
            JSONObject jSONObject = new JSONObject(str7).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!jSONObject.has("params")) {
                return c25035OooO0O0;
            }
            String strOptString = jSONObject.getJSONObject("params").optString("public_key", null);
            if (TextUtils.isEmpty(strOptString)) {
                return c25035OooO0O0;
            }
            C25017OooO0O0.OooO0O0(strOptString);
            return z ? OooO0o(c25047OooO00o, context, str, str2, false) : c25035OooO0O0;
        } catch (JSONException e12) {
            C25052OooO0Oo.OooO00o(e12);
            return c25035OooO0O0;
        }
    }

    public C25035OooO0O0 OooO0o0(Context context, String str, C25047OooO00o c25047OooO00o) throws Throwable {
        if (context != null) {
            TextUtils.isEmpty("https://mobilegw.alipay.com/mgw.htm");
        }
        return OooO0o(c25047OooO00o, context, str, "https://mobilegw.alipay.com/mgw.htm", true);
    }

    public abstract JSONObject OooO0oO() throws JSONException;

    public String OooOO0() {
        return "4.9.0";
    }

    public abstract boolean OooOO0O();
}
