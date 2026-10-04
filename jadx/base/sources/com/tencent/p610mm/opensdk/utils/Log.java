package com.tencent.p610mm.opensdk.utils;

/* JADX INFO: loaded from: classes10.dex */
public class Log {
    private static ILog logImpl;

    /* JADX INFO: renamed from: d */
    public static void m80583d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.d(str, str2);
        } else {
            iLog.m80578d(str, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m80584e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.e(str, str2);
        } else {
            iLog.m80579e(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m80585i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.i(str, str2);
        } else {
            iLog.m80580i(str, str2);
        }
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* JADX INFO: renamed from: v */
    public static void m80586v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.v(str, str2);
        } else {
            iLog.m80581v(str, str2);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m80587w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.w(str, str2);
        } else {
            iLog.m80582w(str, str2);
        }
    }
}
