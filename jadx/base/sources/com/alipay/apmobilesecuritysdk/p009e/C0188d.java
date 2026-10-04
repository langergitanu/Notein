package com.alipay.apmobilesecuritysdk.p009e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p007c.C0177a;
import com.alipay.apmobilesecuritysdk.p010f.C0194a;
import o0000OoO.C24224OooO00o;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0188d {
    /* JADX INFO: renamed from: a */
    public static C0187c m157a(String str) {
        try {
            if (C24224OooO00o.OooO0O0(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C0187c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            C0177a.m136a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0187c m161b() {
        String strM215a = C0194a.m215a("wxcasxx_v4", "key_wxcasxx_v4");
        if (C24224OooO00o.OooO0O0(strM215a)) {
            return null;
        }
        return m157a(strM215a);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0187c m163c(Context context) {
        String strM214a = C0194a.m214a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
        if (C24224OooO00o.OooO0O0(strM214a)) {
            return null;
        }
        return m157a(strM214a);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m158a() {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0187c m162b(Context context) {
        String strM214a;
        try {
            strM214a = C0194a.m214a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (C24224OooO00o.OooO0O0(strM214a)) {
                strM214a = C0194a.m215a("wxcasxx_v4", "key_wxcasxx_v4");
            }
        } catch (Throwable th) {
            throw th;
        }
        return m157a(strM214a);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m159a(Context context) {
        C0194a.m216a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
        C0194a.m217a("wxcasxx_v4", "key_wxcasxx_v4", "");
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m160a(Context context, C0187c c0187c) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", c0187c.f136a);
            jSONObject.put("deviceInfoHash", c0187c.f137b);
            jSONObject.put("timestamp", c0187c.f138c);
            jSONObject.put("tid", c0187c.f139d);
            jSONObject.put("utdid", c0187c.f140e);
            String string = jSONObject.toString();
            C0194a.m216a(context, "vkeyid_profiles_v4", "key_deviceid_v4", string);
            C0194a.m217a("wxcasxx_v4", "key_wxcasxx_v4", string);
        } catch (Exception e) {
            C0177a.m136a(e);
        }
    }
}
