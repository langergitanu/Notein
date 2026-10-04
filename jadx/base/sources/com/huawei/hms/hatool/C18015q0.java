package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.io.File;

/* JADX INFO: renamed from: com.huawei.hms.hatool.q0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18015q0 {
    /* JADX INFO: renamed from: a */
    public static boolean m77511a(Context context) {
        return System.currentTimeMillis() - C17986g0.m77328a(context, "Privacy_MY", "flashKeyTime", -1L) > 43200000;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77512a(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (context.checkSelfPermission(str) == 0) {
            return false;
        }
        C18030y.m77591f("hmsSdk", "not have read phone permission!");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77513a(Context context, String str, int i) {
        long length = new File(context.getFilesDir(), OooO00o.OooO00o("../shared_prefs/", C17986g0.m77335c(context, str) + ".xml")).length();
        if (length <= i) {
            return false;
        }
        C18030y.m77586c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77514a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            C18030y.m77591f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
