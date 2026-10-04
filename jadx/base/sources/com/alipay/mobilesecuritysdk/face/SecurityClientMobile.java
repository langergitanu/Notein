package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p005a.C0175a;
import com.hihonor.honorid.core.data.TmemberRight;
import java.util.HashMap;
import java.util.Map;
import o0000OoO.C24224OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("utdid", C24224OooO00o.OooO00o("utdid", map));
        map2.put("tid", C24224OooO00o.OooO00o("tid", map));
        map2.put(TmemberRight.TAG_USERID, C24224OooO00o.OooO00o(TmemberRight.TAG_USERID, map));
        APSecuritySdk.getInstance(context).initToken(0, map2, null);
        return C0175a.m122a(context);
    }
}
