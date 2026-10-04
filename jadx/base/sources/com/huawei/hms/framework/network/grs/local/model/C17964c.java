package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.local.model.c */
/* JADX INFO: loaded from: classes7.dex */
public class C17964c {

    /* JADX INFO: renamed from: a */
    private String f53760a;

    /* JADX INFO: renamed from: b */
    private final Map<String, C17965d> f53761b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c */
    private List<C17963b> f53762c = new ArrayList(16);

    /* JADX INFO: renamed from: a */
    public C17965d m77177a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f53761b.get(str);
        }
        Logger.m76967w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public String m77181b() {
        return this.f53760a;
    }

    /* JADX INFO: renamed from: c */
    public void m77183c(String str) {
        this.f53760a = str;
    }

    /* JADX INFO: renamed from: a */
    public List<C17963b> m77178a() {
        return this.f53762c;
    }

    /* JADX INFO: renamed from: b */
    public void m77182b(String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m77179a(String str, C17965d c17965d) {
        if (TextUtils.isEmpty(str) || c17965d == null) {
            return;
        }
        this.f53761b.put(str, c17965d);
    }

    /* JADX INFO: renamed from: a */
    public void m77180a(List<C17963b> list) {
        this.f53762c = list;
    }
}
