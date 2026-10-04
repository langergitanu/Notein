package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.huawei.hms.base.log.C17734a;
import com.huawei.hms.base.log.C17737d;

/* JADX INFO: loaded from: classes9.dex */
public class HMSLog {

    /* JADX INFO: renamed from: a */
    public static final C17734a f56968a = new C17734a();

    /* JADX INFO: renamed from: a */
    public static String m80168a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    /* JADX INFO: renamed from: d */
    public static void m80169d(String str, String str2) {
        f56968a.m75823a(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m80172e(String str, String str2) {
        f56968a.m75823a(6, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m80174i(String str, String str2) {
        f56968a.m75823a(4, str, str2);
    }

    public static void init(Context context, int i, String str) {
        C17734a c17734a = f56968a;
        c17734a.m75824a(context, i, str);
        c17734a.m75826a(str, "============================================================================\n====== " + m80168a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f56968a.m75827a(6);
    }

    public static boolean isInfoEnable() {
        return f56968a.m75827a(4);
    }

    public static boolean isWarnEnable() {
        return f56968a.m75827a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z) throws IllegalArgumentException {
        if (hMSExtLogger == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        C17737d c17737d = new C17737d(hMSExtLogger);
        if (z) {
            f56968a.m75825a(c17737d);
        } else {
            f56968a.m75821a().mo75830a(c17737d);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m80175w(String str, String str2) {
        f56968a.m75823a(5, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m80173e(String str, String str2, Throwable th) {
        f56968a.m75828b(6, str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m80170e(String str, long j, String str2) {
        f56968a.m75823a(6, str, "[" + j + "] " + str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m80171e(String str, long j, String str2, Throwable th) {
        f56968a.m75828b(6, str, "[" + j + "] " + str2, th);
    }
}
