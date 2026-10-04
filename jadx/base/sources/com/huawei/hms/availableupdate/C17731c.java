package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.availableupdate.c */
/* JADX INFO: loaded from: classes6.dex */
public class C17731c {

    /* JADX INFO: renamed from: b */
    public static final C17731c f52483b = new C17731c();

    /* JADX INFO: renamed from: c */
    public static final Object f52484c = new Object();

    /* JADX INFO: renamed from: a */
    public final List<Activity> f52485a = new ArrayList(1);

    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v0, types: [void] */
    /* JADX INFO: renamed from: a */
    public void m75819a(Activity activity) {
        synchronized (f52484c) {
            try {
                for (Activity activity2 : this.f52485a) {
                    if (activity2 != 0 && activity2 != activity && activity2.printStackTrace() == 0) {
                        activity2.finish();
                    }
                }
                this.f52485a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75820b(Activity activity) {
        synchronized (f52484c) {
            this.f52485a.remove(activity);
        }
    }
}
