package com.alipay.apmobilesecuritysdk.p010f;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;
import o0000OoO.C24224OooO00o;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C24999OooO0OO;
import o00OO0o0.C25001OooO0o0;
import o00Oo.C25025OooO00o;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.f.a */
/* JADX INFO: loaded from: classes.dex */
public class C0194a {
    /* JADX INFO: renamed from: a */
    public static String m214a(Context context, String str, String str2) {
        if (context != null && !C24224OooO00o.OooO0O0(str) && !C24224OooO00o.OooO0O0(str2)) {
            try {
                String string = context.getSharedPreferences(str, 0).getString(str2, "");
                if (C24224OooO00o.OooO0O0(string)) {
                    return null;
                }
                return C25025OooO00o.OooO0Oo(C25025OooO00o.OooO00o(), string);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m215a(String str, String str2) {
        synchronized (C0194a.class) {
            if (!C24224OooO00o.OooO0O0(str) && !C24224OooO00o.OooO0O0(str2)) {
                try {
                    String strOooO00o = C24998OooO0O0.OooO00o(str);
                    if (!C24224OooO00o.OooO0O0(strOooO00o)) {
                        String string = new JSONObject(strOooO00o).getString(str2);
                        if (!C24224OooO00o.OooO0O0(string)) {
                            return C25025OooO00o.OooO0Oo(C25025OooO00o.OooO00o(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m216a(Context context, String str, String str2, String str3) {
        if (C24224OooO00o.OooO0O0(str) || C24224OooO00o.OooO0O0(str2) || context == null) {
            return;
        }
        try {
            String strOooO0O0 = C25025OooO00o.OooO0O0(C25025OooO00o.OooO00o(), str3);
            HashMap map = new HashMap();
            map.put(str2, strOooO0O0);
            C25001OooO0o0.OooO00o(context, str, map);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m217a(String str, String str2, String str3) {
        synchronized (C0194a.class) {
            try {
                if (C24224OooO00o.OooO0O0(str) || C24224OooO00o.OooO0O0(str2)) {
                    return;
                }
                try {
                    String strOooO00o = C24998OooO0O0.OooO00o(str);
                    JSONObject jSONObject = new JSONObject();
                    if (C24224OooO00o.OooO0Oo(strOooO00o)) {
                        try {
                            jSONObject = new JSONObject(strOooO00o);
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                    }
                    jSONObject.put(str2, C25025OooO00o.OooO0O0(C25025OooO00o.OooO00o(), str3));
                    jSONObject.toString();
                    try {
                        System.clearProperty(str);
                    } catch (Throwable unused2) {
                    }
                    if (C24999OooO0OO.OooO00o()) {
                        String str4 = ".SystemConfig" + File.separator + str;
                        if (C24999OooO0OO.OooO00o()) {
                            File file = new File(Environment.getExternalStorageDirectory(), str4);
                            if (file.exists() && file.isFile()) {
                                file.delete();
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
