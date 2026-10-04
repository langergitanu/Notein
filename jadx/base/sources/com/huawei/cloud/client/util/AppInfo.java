package com.huawei.cloud.client.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class AppInfo {
    public static final String SDK_VERSION = "5.0.0.307";

    /* JADX INFO: renamed from: a */
    private static boolean f52325a;
    public static String appId;
    public static File cacheDir;
    public static String packageName;
    public static String versionName;

    public static synchronized void init(Context context) {
        try {
            if (f52325a) {
                return;
            }
            try {
                cacheDir = context.getCacheDir();
                packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 128);
                versionName = packageInfo.versionName;
                String string = packageInfo.applicationInfo.metaData.getString("com.huawei.hms.client.appid");
                if (string != null && !string.split("=")[1].equals("")) {
                    appId = string.split("=")[1];
                }
                f52325a = true;
            } catch (PackageManager.NameNotFoundException unused) {
                f52325a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
