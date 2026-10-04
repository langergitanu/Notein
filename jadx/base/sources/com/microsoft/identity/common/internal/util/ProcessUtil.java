package com.microsoft.identity.common.internal.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.huawei.hms.network.embedded.C18361t4;
import com.microsoft.identity.common.internal.broker.BrokerData;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessUtil {
    private ProcessUtil() {
    }

    public static Handler getPreferredHandler() {
        return Looper.myLooper() != null ? new Handler(Looper.myLooper()) : new Handler(Looper.getMainLooper());
    }

    private static String getProcessName(Context context) {
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getApplicationContext().getSystemService(C18361t4.f56218b)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static boolean isBrokerProcess(Context context) {
        String processName = getProcessName(context);
        Iterator<BrokerData> it = BrokerData.getKnownBrokerApps().iterator();
        while (it.hasNext()) {
            if ((it.next().getPackageName() + ":auth").equalsIgnoreCase(processName)) {
                return true;
            }
        }
        return false;
    }
}
