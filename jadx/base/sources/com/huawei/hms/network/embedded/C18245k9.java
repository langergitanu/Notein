package com.huawei.hms.network.embedded;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k9 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18245k9 {

    /* JADX INFO: renamed from: a */
    public final Set<C18216i8> f55435a = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public synchronized void m78980a(C18216i8 c18216i8) {
        this.f55435a.remove(c18216i8);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m78981b(C18216i8 c18216i8) {
        this.f55435a.add(c18216i8);
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m78982c(C18216i8 c18216i8) {
        return this.f55435a.contains(c18216i8);
    }
}
