package com.vivo.penengine.impl;

import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class EngineLog {
    private static final String BASE_TAG = "EngineLog_";

    /* JADX INFO: renamed from: d */
    public static void m80593d(String str, String str2) {
        Log.d(BASE_TAG + str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m80595e(String str, String str2) {
        Log.e(BASE_TAG + str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m80597i(String str, String str2) {
        Log.i(BASE_TAG + str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m80599v(String str, String str2) {
        Log.v(BASE_TAG + str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m80601w(String str, String str2) {
        Log.w(BASE_TAG + str, str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m80594d(String str, String str2, Throwable th) {
        Log.d(BASE_TAG + str, str2, th);
    }

    /* JADX INFO: renamed from: e */
    public static void m80596e(String str, String str2, Throwable th) {
        Log.e(BASE_TAG + str, str2, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m80598i(String str, String str2, Throwable th) {
        Log.i(BASE_TAG + str, str2, th);
    }

    /* JADX INFO: renamed from: v */
    public static void m80600v(String str, String str2, Throwable th) {
        Log.v(BASE_TAG + str, str2, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m80602w(String str, String str2, Throwable th) {
        Log.w(BASE_TAG + str, str2, th);
    }

    /* JADX INFO: renamed from: w */
    public static void m80603w(String str, Throwable th) {
        Log.w(BASE_TAG + str, th);
    }
}
