package com.alipay.apmobilesecuritysdk.p008d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p009e.C0192h;
import com.hihonor.honorid.core.data.TmemberRight;
import java.util.HashMap;
import java.util.Map;
import o0000OoO.C24224OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0181b {
    /* JADX INFO: renamed from: a */
    public static synchronized Map<String, String> m141a(Context context, Map<String, String> map) {
        HashMap map2;
        map2 = new HashMap();
        String strOooO00o = C24224OooO00o.OooO00o("tid", map);
        String strOooO00o2 = C24224OooO00o.OooO00o("utdid", map);
        String strOooO00o3 = C24224OooO00o.OooO00o(TmemberRight.TAG_USERID, map);
        String strOooO00o4 = C24224OooO00o.OooO00o("appName", map);
        String strOooO00o5 = C24224OooO00o.OooO00o("appKeyClient", map);
        String strOooO00o6 = C24224OooO00o.OooO00o("tmxSessionId", map);
        String strM192f = C0192h.m192f(context);
        String strOooO00o7 = C24224OooO00o.OooO00o("sessionId", map);
        map2.put("AC1", strOooO00o);
        map2.put("AC2", strOooO00o2);
        map2.put("AC3", "");
        map2.put("AC4", strM192f);
        map2.put("AC5", strOooO00o3);
        map2.put("AC6", strOooO00o6);
        map2.put("AC7", "");
        map2.put("AC8", strOooO00o4);
        map2.put("AC9", strOooO00o5);
        if (C24224OooO00o.OooO0Oo(strOooO00o7)) {
            map2.put("AC10", strOooO00o7);
        }
        return map2;
    }
}
