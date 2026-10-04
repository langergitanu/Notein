package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.HashMap;
import o0O00o0O.C25845OooO00o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hatool.r0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18017r0 {
    /* JADX INFO: renamed from: a */
    public static void m77520a(String str, String str2) {
        C17971b0 c17971b0M77199a;
        String str3;
        String strReplace = "{url}/getPublicKey?keytype=2".replace("{url}", AbstractC17973c.m77247f(str, str2));
        String strM77224f = AbstractC17970b.m77224f();
        HashMap map = new HashMap();
        map.put("App-Id", strM77224f);
        try {
            c17971b0M77199a = AbstractC17968a0.m77199a(strReplace, new byte[0], map);
        } catch (Exception e) {
            C18030y.m77590e("GetPublicKey", "get pubKey response Exception :" + e.getMessage());
            c17971b0M77199a = null;
        }
        if (c17971b0M77199a == null) {
            str3 = "get pubKey response is null";
        } else if (c17971b0M77199a.m77238b() == 200) {
            if (TextUtils.isEmpty(c17971b0M77199a.m77237a())) {
                return;
            }
            m77523c(c17971b0M77199a.m77237a(), str2);
            return;
        } else {
            str3 = "get pubKey fail HttpCode :" + c17971b0M77199a.m77238b();
        }
        C18030y.m77590e("GetPublicKey", str3);
    }

    /* JADX INFO: renamed from: b */
    public static String m77522b(String str, String str2) {
        String strM77236o;
        String strM77218c = AbstractC17970b.m77218c();
        if (TextUtils.isEmpty(strM77218c)) {
            strM77218c = C17986g0.m77329a(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_version", "");
            AbstractC17970b.m77227g(strM77218c);
        }
        if ("maint".equals(str2)) {
            strM77236o = AbstractC17970b.m77235n();
            if (TextUtils.isEmpty(strM77236o)) {
                strM77236o = C25845OooO00o.OooO0O0("HiAnalytics_Sdk_Public_Sp_Key", C17986g0.m77329a(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_maint", ""));
                AbstractC17970b.m77221d(strM77236o);
            }
        } else {
            strM77236o = AbstractC17970b.m77236o();
            if (TextUtils.isEmpty(strM77236o)) {
                strM77236o = C25845OooO00o.OooO0O0("HiAnalytics_Sdk_Public_Sp_Key", C17986g0.m77329a(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_oper", ""));
                AbstractC17970b.m77223e(strM77236o);
            }
        }
        if (!TextUtils.isEmpty(strM77236o) && !TextUtils.isEmpty(strM77218c) && !m77521a()) {
            return strM77236o;
        }
        C18010o0.m77485a().m77488a(new C18004m0(str, str2));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m77523c(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("publicKey");
            String strOptString2 = jSONObject.optString("publicKeyOM");
            String strOptString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String strOptString4 = jSONObject.optString("timeInterval");
            C17986g0.m77334b(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_oper", C25845OooO00o.OooO0Oo("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
            C17986g0.m77334b(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_maint", C25845OooO00o.OooO0Oo("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
            C17986g0.m77334b(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_time_interval", strOptString4);
            C17986g0.m77334b(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_version", strOptString3);
            C17986g0.m77334b(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_time_last", str3);
            AbstractC17970b.m77223e(strOptString);
            AbstractC17970b.m77221d(strOptString2);
            AbstractC17970b.m77227g(strOptString3);
            AbstractC17970b.m77219c(str3);
            AbstractC17970b.m77225f(strOptString4);
        } catch (JSONException e) {
            C18030y.m77590e("GetPublicKey", "get pubKey parse json JSONException :" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77521a() {
        String strM77214a = AbstractC17970b.m77214a();
        if (TextUtils.isEmpty(strM77214a)) {
            strM77214a = C17986g0.m77329a(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_time_interval", "");
            AbstractC17970b.m77225f(strM77214a);
        }
        String strM77234m = AbstractC17970b.m77234m();
        if (TextUtils.isEmpty(strM77234m)) {
            strM77234m = C17986g0.m77329a(AbstractC17970b.m77230i(), "Privacy_MY", "public_key_time_last", "");
            AbstractC17970b.m77219c(strM77234m);
        }
        if (!TextUtils.isEmpty(strM77214a) && !TextUtils.isEmpty(strM77234m)) {
            try {
                if (System.currentTimeMillis() - Long.parseLong(strM77234m) <= Integer.parseInt(strM77214a)) {
                    return false;
                }
            } catch (NumberFormatException e) {
                C18030y.m77590e("GetPublicKey", "checkCachePubKey NumberFormatException :" + e.getMessage());
            }
        }
        return true;
    }
}
