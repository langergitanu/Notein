package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.network.api.advance.AdvanceNetworkKit;
import com.huawei.hms.network.api.advance.WrapperLogger;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18318q0 extends AdvanceNetworkKit {

    /* JADX INFO: renamed from: a */
    public static final String f55916a = "NetworkKitAdvImpl";

    /* JADX INFO: renamed from: b */
    public static final AdvanceNetworkKit f55917b = new C18318q0();

    public static AdvanceNetworkKit getInstance() {
        return f55917b;
    }

    public void addQuicHint(boolean z, String... strArr) {
        C18305p0.m79323d().m79329a(z, strArr);
    }

    public boolean checkConnectivity() {
        return C18305p0.m79323d().m79330a();
    }

    public void evictAllConnections() {
        C18305p0.m79323d().m79331b();
    }

    public String getOption(String str) {
        return C18305p0.m79323d().m79324a("", str);
    }

    public void initConnectionPool(int i, long j, TimeUnit timeUnit) {
        C18305p0.m79323d().m79325a(i, j, timeUnit);
    }

    public void initKit(Context context, String str) {
        C18305p0.m79323d().m79326a(context, str);
    }

    public void setOptions(String str) {
        C18305p0.m79323d().m79328a(str);
    }

    public void setWrapperLogger(WrapperLogger wrapperLogger, boolean z) {
        C18305p0.m79323d().m79327a(wrapperLogger, z);
    }
}
