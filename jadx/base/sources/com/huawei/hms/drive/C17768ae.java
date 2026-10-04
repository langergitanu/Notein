package com.huawei.hms.drive;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.huawei.hms.drive.ae */
/* JADX INFO: loaded from: classes6.dex */
public class C17768ae {

    /* JADX INFO: renamed from: a */
    private static SharedPreferences f52546a;

    /* JADX INFO: renamed from: a */
    public static synchronized SharedPreferences m75938a(Context context) {
        try {
            if (f52546a == null) {
                f52546a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f52546a;
    }

    /* JADX INFO: renamed from: b */
    public static String m75940b(String str, String str2, Context context) {
        return m75938a(context).getString(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m75939a(String str, String str2, Context context) {
        m75938a(context).edit().putString(str, str2).apply();
    }
}
