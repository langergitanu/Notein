package com.huawei.agconnect.common.api;

import com.huawei.agconnect.credential.obs.C17643u;

/* JADX INFO: loaded from: classes8.dex */
public class Logger {
    private static final C17643u SINGLETON = new C17643u();

    /* JADX INFO: renamed from: d */
    public static void m75326d(String str, String str2) {
        SINGLETON.m75604b(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m75327e(String str, String str2) {
        SINGLETON.m75603a(str, str2, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m75329i(String str, String str2) {
        SINGLETON.m75605c(str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m75330v(String str, String str2) {
        SINGLETON.m75602a(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m75331w(String str, String str2) {
        SINGLETON.m75606d(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m75328e(String str, String str2, Throwable th) {
        SINGLETON.m75603a(str, str2, th);
    }
}
