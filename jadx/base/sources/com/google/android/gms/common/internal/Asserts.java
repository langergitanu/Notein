package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    public static void checkMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", androidx.core.database.OooO00o.OooO00o("checkMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS NOT the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(str);
    }

    public static void checkNotMainThread(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", androidx.core.database.OooO00o.OooO00o("checkNotMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(str);
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void checkNull(Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void checkNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static void checkNull(Object obj, Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
