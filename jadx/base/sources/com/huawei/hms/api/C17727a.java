package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.api.a */
/* JADX INFO: loaded from: classes6.dex */
class C17727a {

    /* JADX INFO: renamed from: b */
    static final C17727a f52472b = new C17727a();

    /* JADX INFO: renamed from: c */
    private static final Object f52473c = new Object();

    /* JADX INFO: renamed from: a */
    List<Activity> f52474a = new ArrayList(1);

    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v0, types: [void] */
    /* JADX INFO: renamed from: a */
    public void m75802a(Activity activity) {
        synchronized (f52473c) {
            try {
                for (Activity activity2 : this.f52474a) {
                    if (activity2 != 0 && activity2 != activity && activity2.printStackTrace() == 0) {
                        activity2.finish();
                    }
                }
                this.f52474a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75803b(Activity activity) {
        synchronized (f52473c) {
            this.f52474a.remove(activity);
        }
    }
}
