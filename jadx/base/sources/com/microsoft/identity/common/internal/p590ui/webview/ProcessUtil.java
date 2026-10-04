package com.microsoft.identity.common.internal.p590ui.webview;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.huawei.hms.network.embedded.C18361t4;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessUtil {
    public static final String AuthServiceProcess = "auth";

    public static boolean isRunningOnAuthService(Context context) {
        String str = context.getPackageName() + ":auth";
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C18361t4.f56218b);
        if (activityManager == null || activityManager.getRunningAppProcesses() == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
