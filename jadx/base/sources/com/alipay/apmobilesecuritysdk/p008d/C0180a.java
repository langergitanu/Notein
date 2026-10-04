package com.alipay.apmobilesecuritysdk.p008d;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import o0000OoO.C24224OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0180a {
    /* JADX INFO: renamed from: a */
    public static synchronized Map<String, String> m140a(Context context, Map<String, String> map) {
        HashMap map2;
        String str;
        String strOooO00o = C24224OooO00o.OooO00o("appchannel", map);
        map2 = new HashMap();
        map2.put("AA1", context.getPackageName());
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            str = "0.0.0";
        }
        map2.put("AA2", str);
        map2.put("AA3", "APPSecuritySDK-ALIPAYSDK");
        map2.put("AA4", "3.4.0.202206130311");
        map2.put("AA6", strOooO00o);
        return map2;
    }
}
