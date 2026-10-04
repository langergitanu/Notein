package com.huawei.hms.drive;

import android.content.Context;

/* JADX INFO: renamed from: com.huawei.hms.drive.z */
/* JADX INFO: loaded from: classes6.dex */
public class C17891z {

    /* JADX INFO: renamed from: a */
    private static Context f53490a;

    /* JADX INFO: renamed from: a */
    public static Context m76904a() {
        return f53490a;
    }

    /* JADX INFO: renamed from: a */
    public static void m76905a(Context context) {
        if (context == null || f53490a != null) {
            return;
        }
        f53490a = context.getApplicationContext();
    }
}
