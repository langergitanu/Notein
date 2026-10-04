package com.alipay.apmobilesecuritysdk.p009e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p007c.C0177a;
import com.alipay.apmobilesecuritysdk.p010f.C0194a;
import com.microsoft.identity.common.java.commands.DeviceCodeFlowAuthResultCommand;
import o0000OoO.C24224OooO00o;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0185a {
    /* JADX INFO: renamed from: a */
    public static C0186b m150a(String str) {
        try {
            if (C24224OooO00o.OooO0O0(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C0186b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            C0177a.m136a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0186b m154b() {
        String strM215a = C0194a.m215a("wxcasxx_v3", "wxcasxx");
        if (C24224OooO00o.OooO0O0(strM215a)) {
            return null;
        }
        return m150a(strM215a);
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0186b m156c(Context context) {
        String strM214a = C0194a.m214a(context, "vkeyid_profiles_v3", DeviceCodeFlowAuthResultCommand.DEVICE_ID_CLAIM);
        if (C24224OooO00o.OooO0O0(strM214a)) {
            return null;
        }
        return m150a(strM214a);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m151a() {
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0186b m155b(Context context) {
        String strM214a;
        try {
            strM214a = C0194a.m214a(context, "vkeyid_profiles_v3", DeviceCodeFlowAuthResultCommand.DEVICE_ID_CLAIM);
            if (C24224OooO00o.OooO0O0(strM214a)) {
                strM214a = C0194a.m215a("wxcasxx_v3", "wxcasxx");
            }
        } catch (Throwable th) {
            throw th;
        }
        return m150a(strM214a);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m152a(Context context) {
        C0194a.m216a(context, "vkeyid_profiles_v3", DeviceCodeFlowAuthResultCommand.DEVICE_ID_CLAIM, "");
        C0194a.m217a("wxcasxx_v3", "wxcasxx", "");
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m153a(Context context, C0186b c0186b) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", c0186b.f133a);
            jSONObject.put("deviceInfoHash", c0186b.f134b);
            jSONObject.put("timestamp", c0186b.f135c);
            String string = jSONObject.toString();
            C0194a.m216a(context, "vkeyid_profiles_v3", DeviceCodeFlowAuthResultCommand.DEVICE_ID_CLAIM, string);
            C0194a.m217a("wxcasxx_v3", "wxcasxx", string);
        } catch (Exception e) {
            C0177a.m136a(e);
        }
    }
}
