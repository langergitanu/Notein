package com.alipay.apmobilesecuritysdk.p009e;

import android.content.Context;
import android.content.SharedPreferences;
import o0000OoO.C24224OooO00o;
import o00Oo.C25025OooO00o;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0191g {
    /* JADX INFO: renamed from: a */
    public static synchronized String m175a(Context context, String str) {
        String string = context.getSharedPreferences("openapi_file_pri", 0).getString("openApi" + str, "");
        if (C24224OooO00o.OooO0O0(string)) {
            return "";
        }
        String strOooO0Oo = C25025OooO00o.OooO0Oo(C25025OooO00o.OooO00o(), string);
        return C24224OooO00o.OooO0O0(strOooO0Oo) ? "" : strOooO0Oo;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m176a() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m177a(Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
        if (editorEdit != null) {
            editorEdit.clear();
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m178a(Context context, String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("openapi_file_pri", 0).edit();
            if (editorEdit != null) {
                editorEdit.putString("openApi" + str, C25025OooO00o.OooO0O0(C25025OooO00o.OooO00o(), str2));
                editorEdit.commit();
            }
        } catch (Throwable unused) {
        }
    }
}
