package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import com.microsoft.identity.client.internal.MsalUtils;
import o0000OoO.C24224OooO00o;
import o00OO0o0.C25000OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public class UmidSdkWrapper {
    public static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    public static final String UMIDTOKEN_KEY_NAME = "umidtk";
    public static volatile String cachedUmidToken = "";
    public static volatile boolean initUmidFinished = false;

    public static String compatUmidBug(Context context, String str) {
        if (!C24224OooO00o.OooO0O0(str) && !C24224OooO00o.OooO0OO(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains(MsalUtils.QUERY_STRING_SYMBOL)) {
            utdid = "";
        }
        return C24224OooO00o.OooO0O0(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        return cachedUmidToken;
    }

    public static String startUmidTaskSync(Context context, int i) {
        return "";
    }

    public static synchronized void updateLocalUmidToken(Context context, String str) {
        if (C24224OooO00o.OooO0Oo(str)) {
            C25000OooO0Oo.OooO00o(context, str);
            cachedUmidToken = str;
        }
    }
}
