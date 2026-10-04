package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i */
/* JADX INFO: loaded from: classes9.dex */
public class C18207i extends AbstractC18179g<InterfaceC18343s, String> {

    /* JADX INFO: renamed from: b */
    public static final String f55077b = "NetworkInfoCache";

    /* JADX INFO: renamed from: c */
    public static volatile C18207i f55078c = new C18207i();

    /* JADX INFO: renamed from: a */
    public LimitQueue<InterfaceC18343s> f55079a = new LimitQueue<>(8);

    /* JADX INFO: renamed from: b */
    public static C18207i m78741b() {
        return f55078c;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public int mo78515a(long j, long j2) {
        if (this.f55079a.size() <= 1) {
            return 0;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (int i = 0; i < this.f55079a.size(); i++) {
            InterfaceC18343s interfaceC18343s = this.f55079a.get(i);
            if (j <= interfaceC18343s.mo79440b() && interfaceC18343s.mo79440b() <= j2) {
                linkedHashSet.add(Integer.valueOf(interfaceC18343s.mo79441c()));
                linkedHashSet2.add(interfaceC18343s.mo79436a());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return !linkedHashSet2.isEmpty() ? 2 : 0;
        }
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public C18330r m78742a(long j) {
        C18330r c18330r = new C18330r();
        c18330r.m79437a(NetworkUtil.netWork(ContextHolder.getResourceContext()));
        c18330r.m79439a(NetworkUtil.getNetworkStatus(ContextHolder.getResourceContext()));
        c18330r.m79438a(j);
        return c18330r;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public InterfaceC18343s mo78516a() {
        return this.f55079a.peekLast();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo78517a(String str) {
        C18330r c18330rM78742a = m78742a(SystemClock.elapsedRealtime());
        InterfaceC18343s interfaceC18343sPeekLast = this.f55079a.peekLast();
        if (interfaceC18343sPeekLast != null && interfaceC18343sPeekLast.mo79441c() == c18330rM78742a.mo79441c() && interfaceC18343sPeekLast.mo79436a() == c18330rM78742a.mo79436a()) {
            Logger.m76965v(f55077b, "the network change don't meet interval!");
        } else {
            this.f55079a.add(c18330rM78742a);
        }
    }
}
