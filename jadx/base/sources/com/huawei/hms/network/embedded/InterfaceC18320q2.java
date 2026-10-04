package com.huawei.hms.network.embedded;

import com.huawei.hms.network.embedded.AbstractRunnableC18294o2;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q2 */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC18320q2 {

    /* JADX INFO: renamed from: a */
    public static final String f55925a = "Dns";

    /* JADX INFO: renamed from: b */
    public static final InterfaceC18320q2 f55926b = new a();

    /* JADX INFO: renamed from: c */
    public static final InterfaceC18320q2 f55927c = new b();

    /* JADX INFO: renamed from: d */
    public static final InterfaceC18320q2 f55928d = new c();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q2$a */
    public static class a implements InterfaceC18320q2 {
        @Override // com.huawei.hms.network.embedded.InterfaceC18320q2
        public C18385v2 lookup(String str) {
            return C18307p2.m79337a(new C18359t2(str, "dns_sync_query", new AbstractRunnableC18294o2.b()));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q2$b */
    public static class b implements InterfaceC18320q2 {
        @Override // com.huawei.hms.network.embedded.InterfaceC18320q2
        public C18385v2 lookup(String str) {
            return C18307p2.m79337a(new C18280n2(str, null));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.q2$c */
    public static class c implements InterfaceC18320q2 {
        @Override // com.huawei.hms.network.embedded.InterfaceC18320q2
        public C18385v2 lookup(String str) {
            return C18307p2.m79337a(new C18346s2(str, "dns_sync_query", new AbstractRunnableC18294o2.b()));
        }
    }

    C18385v2 lookup(String str);
}
