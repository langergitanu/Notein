package com.alipay.apmobilesecuritysdk.p009e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p007c.C0177a;
import com.alipay.apmobilesecuritysdk.p010f.C0194a;
import o0000OoO.C24224OooO00o;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0189e {
    /* JADX INFO: renamed from: a */
    public static C0190f m164a(Context context) {
        if (context == null) {
            return null;
        }
        String strM214a = C0194a.m214a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (C24224OooO00o.OooO0O0(strM214a)) {
            strM214a = C0194a.m215a("device_feature_file_name", "device_feature_file_key");
        }
        if (C24224OooO00o.OooO0O0(strM214a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM214a);
            C0190f c0190f = new C0190f();
            c0190f.m166a(jSONObject.getString("imei"));
            c0190f.m168b(jSONObject.getString("imsi"));
            c0190f.m170c(jSONObject.getString("mac"));
            c0190f.m172d(jSONObject.getString("bluetoothmac"));
            c0190f.m174e(jSONObject.getString("gsi"));
            return c0190f;
        } catch (Exception e) {
            C0177a.m136a(e);
            return null;
        }
    }
}
