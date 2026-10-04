package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC18151e {

    /* JADX INFO: renamed from: a */
    public static volatile AbstractC18151e f54595a;

    /* JADX INFO: renamed from: c */
    public static AbstractC18151e m78274c() {
        if (f54595a == null) {
            synchronized (AbstractC18151e.class) {
                try {
                    if (f54595a == null) {
                        f54595a = new C18165f();
                    }
                } finally {
                }
            }
        }
        return f54595a;
    }

    /* JADX INFO: renamed from: a */
    public abstract LinkedHashMapPack mo78275a(String str);

    /* JADX INFO: renamed from: a */
    public abstract AbstractC18304p mo78276a(long j, long j2);

    /* JADX INFO: renamed from: a */
    public abstract void mo78277a(Context context);

    /* JADX INFO: renamed from: a */
    public abstract void mo78278a(boolean z);

    /* JADX INFO: renamed from: a */
    public abstract boolean mo78279a();

    /* JADX INFO: renamed from: b */
    public abstract void mo78280b();

    /* JADX INFO: renamed from: b */
    public abstract void mo78281b(boolean z);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo78282b(long j, long j2);
}
