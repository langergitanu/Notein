package com.huawei.hms.framework.network.grs.p579g.p581k;

import android.os.SystemClock;
import com.huawei.hms.framework.network.grs.p579g.C17944d;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.k.b */
/* JADX INFO: loaded from: classes7.dex */
public class C17952b {

    /* JADX INFO: renamed from: a */
    private final Future<C17944d> f53739a;

    /* JADX INFO: renamed from: b */
    private final long f53740b = SystemClock.elapsedRealtime();

    public C17952b(Future<C17944d> future) {
        this.f53739a = future;
    }

    /* JADX INFO: renamed from: a */
    public Future<C17944d> m77130a() {
        return this.f53739a;
    }

    /* JADX INFO: renamed from: b */
    public boolean m77131b() {
        return SystemClock.elapsedRealtime() - this.f53740b <= 300000;
    }
}
