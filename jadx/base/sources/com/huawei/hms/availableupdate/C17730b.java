package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.huawei.hms.availableupdate.b */
/* JADX INFO: loaded from: classes6.dex */
public class C17730b {

    /* JADX INFO: renamed from: c */
    public static final C17730b f52479c = new C17730b();

    /* JADX INFO: renamed from: d */
    public static final Object f52480d = new Object();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f52481a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public List<Activity> f52482b = new ArrayList(1);

    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v0, types: [void] */
    /* JADX INFO: renamed from: a */
    public void m75816a(Activity activity) {
        synchronized (f52480d) {
            try {
                for (Activity activity2 : this.f52482b) {
                    if (activity2 != 0 && activity2 != activity && activity2.printStackTrace() == 0) {
                        activity2.finish();
                    }
                }
                this.f52482b.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75818b(Activity activity) {
        synchronized (f52480d) {
            this.f52482b.remove(activity);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75817a(boolean z) {
        this.f52481a.set(z);
    }

    /* JADX INFO: renamed from: a */
    public AtomicBoolean m75815a() {
        return this.f52481a;
    }
}
