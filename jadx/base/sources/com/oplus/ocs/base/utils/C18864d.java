package com.oplus.ocs.base.utils;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.oplus.ocs.base.utils.d */
/* JADX INFO: loaded from: classes9.dex */
public final class C18864d {
    /* JADX INFO: renamed from: a */
    public static <T> T m80553a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* JADX INFO: renamed from: b */
    public static void m80557b(String str) {
        if (C18862b.m80549a()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m80555a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m80554a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: a */
    public static void m80556a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
