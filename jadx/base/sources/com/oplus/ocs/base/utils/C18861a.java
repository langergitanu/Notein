package com.oplus.ocs.base.utils;

import android.util.Log;

/* JADX INFO: renamed from: com.oplus.ocs.base.utils.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C18861a {

    /* JADX INFO: renamed from: a */
    private static boolean f57607a = true;

    /* JADX INFO: renamed from: a */
    public static void m80545a(String str, String str2) {
        if (f57607a) {
            Log.d("CapabilityBase.".concat(String.valueOf(str)), str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m80546b(String str, String str2) {
        Log.i("CapabilityBase.".concat(String.valueOf(str)), str2);
    }

    /* JADX INFO: renamed from: c */
    public static void m80547c(String str, String str2) {
        Log.w("CapabilityBase.".concat(String.valueOf(str)), str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m80548d(String str, String str2) {
        Log.e("CapabilityBase.".concat(String.valueOf(str)), str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m80544a(String str) {
        if (f57607a) {
            Log.d("CapabilityBase", str);
        }
    }
}
