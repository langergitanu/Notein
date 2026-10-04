package o00O0Ooo;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.C18361t4;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: o00O0Ooo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24906OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f84522OooO00o = o00O0O0o.OooOO0O.OooO0o0("ProcessUtils");

    public static boolean OooO00o(Context context, androidx.work.OooO00o oooO00o) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object objInvoke;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, C24906OooOOO0.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
            } catch (Throwable th) {
                o00O0O0o.OooOO0O.OooO0OO().OooO00o(f84522OooO00o, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) context.getSystemService(C18361t4.f56218b);
                if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
                    processName = null;
                } else {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            processName = runningAppProcessInfo.processName;
                            break;
                        }
                    }
                    processName = null;
                }
            }
        }
        oooO00o.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
