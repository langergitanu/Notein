package com.huawei.hms.drive;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.huawei.hms.drive.ad */
/* JADX INFO: loaded from: classes6.dex */
public class C17767ad {

    /* JADX INFO: renamed from: a */
    private static final String f52545a = "h";

    /* JADX INFO: renamed from: a */
    public static String m75937a(String str) {
        Context contextM76904a = C17891z.m76904a();
        if (contextM76904a == null) {
            return "";
        }
        try {
            return contextM76904a.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C17766ac.m75936d(f52545a, "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            C17766ac.m75936d(f52545a, "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            C17766ac.m75936d(f52545a, "throwable");
            return "";
        }
    }
}
