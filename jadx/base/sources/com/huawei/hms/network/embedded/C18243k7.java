package com.huawei.hms.network.embedded;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18243k7 {
    public final C18231j9 delegate;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.k7$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo78013a(String str, int i, String str2);
    }

    public C18243k7() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    /* JADX INFO: renamed from: a */
    public int m78973a() {
        return this.delegate.m78892a();
    }

    /* JADX INFO: renamed from: b */
    public void m78976b() {
        this.delegate.m78900b();
    }

    /* JADX INFO: renamed from: c */
    public int m78979c() {
        return this.delegate.m78904c();
    }

    public C18243k7(int i, long j, TimeUnit timeUnit) {
        this.delegate = new C18231j9(i, j, timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public int m78974a(String str, int i, String str2) {
        return this.delegate.m78894a(str, i, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m78977b(a aVar) {
        this.delegate.m78901b(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m78975a(a aVar) {
        this.delegate.m78898a(aVar);
    }

    /* JADX INFO: renamed from: b */
    public boolean m78978b(String str, int i, String str2) {
        return this.delegate.m78903b(str, i, str2);
    }
}
