package com.huawei.hms.hatool;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.hatool.g0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17986g0 {
    /* JADX INFO: renamed from: a */
    public static long m77328a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C18030y.m77591f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences sharedPreferencesM77332b = m77332b(context, str);
        return sharedPreferencesM77332b != null ? sharedPreferencesM77332b.getLong(str2, j) : j;
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m77332b(Context context, String str) {
        return context.getSharedPreferences(m77335c(context, str), 0);
    }

    /* JADX INFO: renamed from: c */
    public static String m77335c(Context context, String str) {
        String packageName = context.getPackageName();
        String strM77255n = AbstractC17973c.m77255n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(strM77255n)) {
            return C22237OooO0o0.OooO00o("hms_", str, C18115b5.CONNECTOR, packageName);
        }
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("hms_", str, C18115b5.CONNECTOR, packageName, C18115b5.CONNECTOR);
        sbOooO0O0.append(strM77255n);
        return sbOooO0O0.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m77329a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C18030y.m77591f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences sharedPreferencesM77332b = m77332b(context, str);
        return sharedPreferencesM77332b != null ? sharedPreferencesM77332b.getString(str2, str3) : str3;
    }

    /* JADX INFO: renamed from: b */
    public static void m77333b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C18030y.m77591f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesM77332b = m77332b(context, str);
        if (sharedPreferencesM77332b != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM77332b.edit();
            editorEdit.putLong(str2, j);
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, ?> m77330a(Context context, String str) {
        return m77332b(context, str).getAll();
    }

    /* JADX INFO: renamed from: b */
    public static void m77334b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C18030y.m77590e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferencesM77332b = m77332b(context, str);
        if (sharedPreferencesM77332b != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM77332b.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77331a(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            C18030y.m77591f("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        if (strArr == null) {
            C18030y.m77591f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
            return;
        }
        SharedPreferences sharedPreferencesM77332b = m77332b(context, str);
        if (sharedPreferencesM77332b != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesM77332b.edit();
            if (strArr.length == 0) {
                editorEdit.clear();
                editorEdit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (sharedPreferencesM77332b.contains(str2)) {
                    editorEdit.remove(str2);
                    editorEdit.commit();
                }
            }
        }
    }
}
