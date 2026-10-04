package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.local.model.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17962a {

    /* JADX INFO: renamed from: a */
    private String f53756a;

    /* JADX INFO: renamed from: b */
    private final Map<String, C17964c> f53757b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: a */
    public C17964c m77165a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f53757b.get(str);
        }
        Logger.m76967w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public String m77169b() {
        return this.f53756a;
    }

    /* JADX INFO: renamed from: a */
    public void m77166a() {
        Map<String, C17964c> map = this.f53757b;
        if (map != null) {
            map.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m77170b(String str) {
        this.f53756a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m77167a(long j) {
    }

    /* JADX INFO: renamed from: a */
    public void m77168a(String str, C17964c c17964c) {
        if (TextUtils.isEmpty(str) || c17964c == null) {
            return;
        }
        this.f53757b.put(str, c17964c);
    }
}
