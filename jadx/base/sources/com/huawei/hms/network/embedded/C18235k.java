package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PowerUtils;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k */
/* JADX INFO: loaded from: classes9.dex */
public class C18235k extends AbstractC18179g<InterfaceC18408x, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final String f55378a = "SystemControlCache";

    /* JADX INFO: renamed from: b */
    public static C18235k f55379b = new C18235k();

    /* JADX INFO: renamed from: b */
    public static C18235k m78931b() {
        return f55379b;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public int mo78515a(long j, long j2) {
        Logger.m76965v(f55378a, "the data will not be update,and always default");
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public C18395w m78932a(long j) {
        C18395w c18395w = new C18395w();
        c18395w.m79809c(PowerUtils.isDozeIdleMode(ContextHolder.getResourceContext()));
        c18395w.m79807b(PowerUtils.isAppIdleMode(ContextHolder.getResourceContext()));
        c18395w.m79804a(PowerUtils.isWhilteList(ContextHolder.getResourceContext()));
        c18395w.m79806b(PowerUtils.readPowerSaverMode(ContextHolder.getResourceContext()));
        c18395w.m79802a(PowerUtils.readDataSaverMode(ContextHolder.getResourceContext()));
        c18395w.m79803a(j);
        return c18395w;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public InterfaceC18408x mo78516a() {
        return m78932a(SystemClock.elapsedRealtime());
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo78517a(Boolean bool) {
        m78932a(SystemClock.elapsedRealtime());
    }
}
