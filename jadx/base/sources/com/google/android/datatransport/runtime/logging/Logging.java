package com.google.android.datatransport.runtime.logging;

import android.os.Bundle;
import android.util.Log;
import com.alibaba.sdk.android.oss.internal.OooO00o;

/* JADX INFO: loaded from: classes6.dex */
public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, java.lang.String] */
    private static String concatTag(String str, String str2) {
        ?? r1 = Bundle.getInt(str);
        return r1.length() > 23 ? r1.substring(0, 23) : r1;
    }

    /* JADX INFO: renamed from: d */
    public static void m74896d(String str, String str2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m74900e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    private static String getTag(String str) {
        return OooO00o.OooO00o(LOG_PREFIX, str);
    }

    /* JADX INFO: renamed from: i */
    public static void m74901i(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 4)) {
            Log.i(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m74902w(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74897d(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74898d(String str, String str2, Object obj, Object obj2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74899d(String str, String str2, Object... objArr) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, objArr));
        }
    }
}
