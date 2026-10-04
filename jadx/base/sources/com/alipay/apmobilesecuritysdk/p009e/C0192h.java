package com.alipay.apmobilesecuritysdk.p009e;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.UUID;
import o0000OoO.C24224OooO00o;
import o000ooo.C24746OooO00o;
import o00OO0o0.C24997OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.h */
/* JADX INFO: loaded from: classes.dex */
public class C0192h {

    /* JADX INFO: renamed from: a */
    public static String f146a = "";

    /* JADX INFO: renamed from: a */
    public static long m179a(Context context) {
        String strOooO00o = C24997OooO00o.OooO00o(context, "update_time_interval");
        if (!C24224OooO00o.OooO0Oo(strOooO00o)) {
            return C18385v2.f56338j;
        }
        try {
            return Long.parseLong(strOooO00o);
        } catch (Exception unused) {
            return C18385v2.f56338j;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m184b(Context context) {
        return C24997OooO00o.OooO00o(context, "last_apdid_env");
    }

    /* JADX INFO: renamed from: c */
    public static void m186c(Context context, String str) {
        m182a(context, "last_apdid_env", str);
    }

    /* JADX INFO: renamed from: d */
    public static String m188d(Context context) {
        return C24997OooO00o.OooO00o(context, "dynamic_key");
    }

    /* JADX INFO: renamed from: e */
    public static String m190e(Context context) {
        return C24997OooO00o.OooO00o(context, "apse_degrade");
    }

    /* JADX INFO: renamed from: f */
    public static String m192f(Context context) {
        String str;
        SharedPreferences.Editor editorEdit;
        synchronized (C0192h.class) {
            try {
                if (C24224OooO00o.OooO0O0(f146a)) {
                    String string = context.getSharedPreferences("alipay_vkey_random", 0).getString("random", "");
                    f146a = string;
                    if (C24224OooO00o.OooO0O0(string)) {
                        String strOooO0OO = C24746OooO00o.OooO0OO(UUID.randomUUID().toString());
                        f146a = strOooO0OO;
                        if (strOooO0OO != null && (editorEdit = context.getSharedPreferences("alipay_vkey_random", 0).edit()) != null) {
                            editorEdit.putString("random", strOooO0OO);
                            editorEdit.commit();
                        }
                    }
                }
                str = f146a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static void m194g(Context context, String str) {
        m182a(context, "apse_degrade", str);
    }

    /* JADX INFO: renamed from: h */
    public static long m195h(Context context, String str) {
        try {
            String strOooO00o = C24997OooO00o.OooO00o(context, "vkey_valid" + str);
            if (C24224OooO00o.OooO0O0(strOooO00o)) {
                return 0L;
            }
            return Long.parseLong(strOooO00o);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m180a(Context context, String str) {
        m182a(context, "update_time_interval", str);
    }

    /* JADX INFO: renamed from: b */
    public static void m185b(Context context, String str) {
        m182a(context, "last_machine_boot_time", str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m187c(Context context) {
        String strOooO00o = C24997OooO00o.OooO00o(context, "log_switch");
        return strOooO00o != null && "1".equals(strOooO00o);
    }

    /* JADX INFO: renamed from: d */
    public static void m189d(Context context, String str) {
        m182a(context, "agent_switch", str);
    }

    /* JADX INFO: renamed from: e */
    public static void m191e(Context context, String str) {
        m182a(context, "dynamic_key", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m181a(Context context, String str, long j) {
        C24997OooO00o.OooO0O0(context, OooO00o.OooO00o("vkey_valid", str), String.valueOf(j));
    }

    /* JADX INFO: renamed from: f */
    public static void m193f(Context context, String str) {
        m182a(context, "webrtc_url", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m182a(Context context, String str, String str2) {
        C24997OooO00o.OooO0O0(context, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m183a(Context context, boolean z) {
        m182a(context, "log_switch", z ? "1" : "0");
    }
}
