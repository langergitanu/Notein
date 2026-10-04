package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.AbstractRunnableC18294o2;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18307p2 {

    /* JADX INFO: renamed from: a */
    public static final String f55854a = "DNResolverManager";

    /* JADX INFO: renamed from: b */
    public static Set<String> f55855b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: c */
    public static final C18099a3 f55856c = C18099a3.m77842a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.p2$a */
    public static class a implements AbstractRunnableC18294o2.a {
        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2.a
        /* JADX INFO: renamed from: a */
        public void mo79266a(String str, C18385v2 c18385v2) {
            Logger.m76965v(C18307p2.f55854a, "lazyUpdateCallback onRespone : " + c18385v2);
            C18224j2.m78843a(str, c18385v2);
            C18307p2.f55855b.remove(str);
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2.a
        /* JADX INFO: renamed from: a */
        public void mo79267a(String str, Throwable th) {
            Logger.m76965v(C18307p2.f55854a, "lazyUpdateCallback onFailure");
            C18307p2.f55855b.remove(str);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.p2$b */
    public static class b extends AbstractRunnableC18294o2 {
        public b(String str, int i, String str2) {
            super(str, i, str2);
        }

        @Override // com.huawei.hms.network.embedded.AbstractRunnableC18294o2
        /* JADX INFO: renamed from: c */
        public C18385v2 mo79227c() {
            C18385v2 c18385v2M77846c = C18307p2.f55856c.m77846c(this.f55809a);
            C18307p2.f55855b.remove(this.f55809a);
            return c18385v2M77846c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18385v2 m79337a(AbstractRunnableC18294o2 abstractRunnableC18294o2) {
        abstractRunnableC18294o2.run();
        return abstractRunnableC18294o2.m79263a();
    }

    /* JADX INFO: renamed from: a */
    public static C18385v2 m79338a(String str, int i) throws UnknownHostException {
        C18385v2 c18385v2M77845b = i != 1 ? f55856c.m77845b(str) : InterfaceC18320q2.f55927c.lookup(str);
        Logger.m76963i(f55854a, str + " from server result is: " + c18385v2M77845b);
        return c18385v2M77845b;
    }

    /* JADX INFO: renamed from: a */
    public static void m79339a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || f55855b.contains(str)) {
            return;
        }
        f55855b.add(str);
        Logger.m76964i(f55854a, "enter Dns lazy update flow, domain: %s, trigger type: %s, source: %s", str, str2, C18126c2.m78048j().m78054a(i));
        f55856c.m77844a(i == 3 ? new b(str, i, str2) : new C18359t2(str, str2, new a()));
    }
}
