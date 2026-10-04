package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import com.huawei.hms.network.embedded.C18361t4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "<init>", "()V", "getAppProcessDetails", "", "Lcom/google/firebase/sessions/ProcessDetails;", "context", "Landroid/content/Context;", "getMyProcessDetails", "getProcessName", "", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final String getProcessName() throws Throwable {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            String strMyProcessName = Process.myProcessName();
            OooOOO0.OooO0o(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    public final List<ProcessDetails> getAppProcessDetails(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        OooOOO0.OooO0oO(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(C18361t4.f56218b);
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C34434OooOoO.f123453OooOo0o;
        }
        List listOooo0o0 = OooOo.Oooo0o0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listOooo0o0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            OooOOO0.OooO0o(processName, "processName");
            arrayList2.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, OooOOO0.OooO0O0(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final ProcessDetails getMyProcessDetails(Context context) {
        Object next;
        OooOOO0.OooO0oO(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? new ProcessDetails(getProcessName(), iMyPid, 0, false) : processDetails;
    }
}
