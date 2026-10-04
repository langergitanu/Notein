package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import java.lang.Thread;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18400w4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c */
    public static final String f56531c = "CrashHandler";

    /* JADX INFO: renamed from: d */
    public static final String f56532d = "crash_analytics";

    /* JADX INFO: renamed from: e */
    public static final int f56533e = 1024;

    /* JADX INFO: renamed from: a */
    public Thread.UncaughtExceptionHandler f56534a = null;

    /* JADX INFO: renamed from: b */
    public Context f56535b = ContextHolder.getAppContext();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.w4$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18400w4.this.f56534a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(C18400w4.this);
            C18400w4.this.m79826a();
        }
    }

    /* JADX INFO: renamed from: a */
    private String m79824a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(1024);
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append(";");
        }
        return sb.toString();
    }

    public void init() {
        try {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new a());
        } catch (RejectedExecutionException e) {
            Logger.m76964i(f56531c, "the crashHandler thread has error!", e);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (HianalyticsHelper.getInstance().isEnableReportNoSeed(this.f56535b)) {
            Logger.m76965v(f56531c, "crash coming");
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("time", "" + System.currentTimeMillis());
            linkedHashMap.put(CrashHianalyticsData.PROCESS_ID, "" + Process.myPid());
            linkedHashMap.put("thread_id", "" + Process.myTid());
            linkedHashMap.put(CrashHianalyticsData.THREAD_NAME, thread.getName());
            linkedHashMap.put("exception_name", th.getClass().getName());
            linkedHashMap.put("message", StringUtils.anonymizeMessage(th.getMessage()));
            linkedHashMap.put(CrashHianalyticsData.STACK_TRACE, m79824a(th));
            m79828a(linkedHashMap);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f56534a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m79826a() {
        if (HianalyticsHelper.getInstance().isEnableReportNoSeed(this.f56535b)) {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(this.f56535b, f56532d);
            if (pLSharedPreferences.getString("time", null) == null) {
                Logger.m76965v(f56531c, "not report");
                return;
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(HianalyticsBaseData.SDK_TYPE, "UxPP");
            linkedHashMap.put(HianalyticsBaseData.SDK_NAME, "networkkit");
            linkedHashMap.put("sdk_version", "5.0.4.300");
            linkedHashMap.put(CrashHianalyticsData.CRASH_TYPE, "crash");
            linkedHashMap.put("time", pLSharedPreferences.getString("time", ""));
            linkedHashMap.put(CrashHianalyticsData.PROCESS_ID, pLSharedPreferences.getString(CrashHianalyticsData.PROCESS_ID, ""));
            linkedHashMap.put("thread_id", pLSharedPreferences.getString("thread_id", ""));
            linkedHashMap.put(CrashHianalyticsData.THREAD_NAME, pLSharedPreferences.getString(CrashHianalyticsData.THREAD_NAME, ""));
            linkedHashMap.put("exception_name", pLSharedPreferences.getString("exception_name", ""));
            linkedHashMap.put("message", pLSharedPreferences.getString("message", ""));
            linkedHashMap.put(CrashHianalyticsData.STACK_TRACE, pLSharedPreferences.getString(CrashHianalyticsData.STACK_TRACE, ""));
            HianalyticsHelper.getInstance().onEvent(linkedHashMap, "crash");
            Logger.m76966v(f56531c, "%s", linkedHashMap);
            pLSharedPreferences.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m79828a(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null) {
            return;
        }
        Logger.m76966v(f56531c, "data = %s", linkedHashMap);
        try {
            PLSharedPreferences pLSharedPreferences = new PLSharedPreferences(this.f56535b, f56532d);
            SharedPreferences.Editor editorEdit = pLSharedPreferences.edit();
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                editorEdit.putString(entry.getKey(), entry.getValue());
            }
            editorEdit.apply();
            Logger.m76965v(f56531c, pLSharedPreferences.getString("message", null));
        } catch (InternalError unused) {
        }
    }
}
