package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18266m2<T extends C18385v2> {

    /* JADX INFO: renamed from: b */
    public static final String f55652b = "MemoryCache";

    /* JADX INFO: renamed from: c */
    public static final int f55653c = 128;

    /* JADX INFO: renamed from: a */
    public final LruCache<String, T> f55654a = new LruCache<>(128);

    /* JADX INFO: renamed from: a */
    public void m79111a() {
        this.f55654a.evictAll();
    }

    /* JADX INFO: renamed from: b */
    public T m79114b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f55654a.get(str);
    }

    /* JADX INFO: renamed from: a */
    public boolean m79112a(String str) {
        Logger.m76966v(f55652b, "[DNS Memory Cache]remove one record，host: %s", str);
        this.f55654a.remove(str);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, T> m79115b() {
        return this.f55654a.snapshot();
    }

    /* JADX INFO: renamed from: a */
    public boolean m79113a(String str, T t) {
        if (C18196h2.m78675b(t) || TextUtils.isEmpty(str)) {
            return false;
        }
        this.f55654a.put(str, t);
        return true;
    }
}
