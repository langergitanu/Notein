package com.huawei.agconnect.credential.obs;

import android.util.Log;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.u */
/* JADX INFO: loaded from: classes8.dex */
public class C17643u {

    /* JADX INFO: renamed from: a */
    private static final String f52190a = "AGC_LOG";

    /* JADX INFO: renamed from: b */
    private static final String f52191b = "[AGC_LOG]";

    /* JADX INFO: renamed from: a */
    public void m75602a(String str, String str2) {
        if (m75601a(2)) {
            Log.d(f52191b + str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75604b(String str, String str2) {
        if (m75601a(3)) {
            Log.d(f52191b + str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75605c(String str, String str2) {
        if (m75601a(4)) {
            Log.i(f52191b + str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m75606d(String str, String str2) {
        if (m75601a(5)) {
            Log.w(f52191b + str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75603a(String str, String str2, Throwable th) {
        if (m75601a(6)) {
            Log.e(f52191b + str, str2, th);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m75601a(int i) {
        return Log.isLoggable(f52190a, i);
    }
}
