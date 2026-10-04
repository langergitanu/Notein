package com.huawei.hms.hwid;

import android.os.Looper;

/* JADX INFO: renamed from: com.huawei.hms.hwid.r */
/* JADX INFO: loaded from: classes8.dex */
public class C18071r {
    /* JADX INFO: renamed from: a */
    public static void m77704a() {
        m77705a("Must not be called on the main application thread");
    }

    /* JADX INFO: renamed from: a */
    public static void m77705a(String str) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new IllegalStateException(str);
        }
    }
}
