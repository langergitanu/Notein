package com.huawei.hms.network.embedded;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.LimitQueue;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.j */
/* JADX INFO: loaded from: classes9.dex */
public class C18221j extends AbstractC18179g<InterfaceC18382v, Long> {

    /* JADX INFO: renamed from: c */
    public static final String f55294c = "SignalInfoCache";

    /* JADX INFO: renamed from: d */
    public static volatile C18221j f55295d = new C18221j();

    /* JADX INFO: renamed from: a */
    public LimitQueue<InterfaceC18382v> f55296a = new LimitQueue<>(8);

    /* JADX INFO: renamed from: b */
    public InterfaceC18382v f55297b;

    /* JADX INFO: renamed from: c */
    public static C18221j m78830c() {
        return f55295d;
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public int mo78515a(long j, long j2) {
        if (this.f55296a.size() <= 1) {
            return 0;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (int i = 0; i < this.f55296a.size(); i++) {
            InterfaceC18382v interfaceC18382v = this.f55296a.get(i);
            if (j <= interfaceC18382v.mo79586g() && interfaceC18382v.mo79586g() <= j2) {
                linkedHashSet.add(Integer.valueOf(interfaceC18382v.mo79585f()));
                linkedHashSet2.add(Integer.valueOf(interfaceC18382v.mo79585f()));
            }
        }
        return (linkedHashSet.size() <= 1 && linkedHashSet2.size() <= 1) ? 0 : 3;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC18382v m78832b() {
        InterfaceC18382v interfaceC18382v = this.f55297b;
        return interfaceC18382v != null ? interfaceC18382v : new C18369u();
    }

    /* JADX INFO: renamed from: a */
    public C18369u m78831a(long j) {
        C18369u c18369u = new C18369u();
        c18369u.m79579a(NetworkUtil.getWifiRssi(ContextHolder.getResourceContext()));
        c18369u.m79580a(j);
        Logger.m76965v(f55294c, c18369u);
        return c18369u;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a */
    public InterfaceC18382v mo78516a() {
        return this.f55296a.peekLast();
    }

    @Override // com.huawei.hms.network.embedded.AbstractC18179g
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo78517a(Long l) {
        InterfaceC18382v interfaceC18382vPeekLast = this.f55296a.peekLast();
        this.f55297b = m78831a(SystemClock.elapsedRealtime());
        if (interfaceC18382vPeekLast == null || Math.abs(interfaceC18382vPeekLast.mo79587h() - this.f55297b.mo79587h()) > 15 || Math.abs(interfaceC18382vPeekLast.mo79585f() - this.f55297b.mo79585f()) > 15) {
            this.f55296a.add(this.f55297b);
            return;
        }
        Logger.m76965v(f55294c, "the signal not meet interval!" + this.f55297b.mo79585f() + "/" + this.f55297b.mo79587h());
    }
}
