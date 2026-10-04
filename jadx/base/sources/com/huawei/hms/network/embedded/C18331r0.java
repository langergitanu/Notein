package com.huawei.hms.network.embedded;

import android.content.Context;
import com.huawei.hms.network.NetworkKit;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18331r0 extends NetworkKit {

    /* JADX INFO: renamed from: a */
    public static final String f55987a = "NetworkKitImpl";

    /* JADX INFO: renamed from: b */
    public static final NetworkKit f55988b = new C18331r0();

    public static NetworkKit getInstance() {
        return f55988b;
    }

    @Override // com.huawei.hms.network.NetworkKit
    public void addQuicHint(boolean z, String... strArr) {
        C18305p0.m79323d().m79329a(z, strArr);
    }

    public boolean checkConnectivity() {
        return C18305p0.m79323d().m79330a();
    }

    @Override // com.huawei.hms.network.NetworkKit
    public void evictAllConnections() {
        C18305p0.m79323d().m79331b();
    }

    @Override // com.huawei.hms.network.NetworkKit
    public String getOption(String str) {
        return C18305p0.m79323d().m79324a("", str);
    }

    @Override // com.huawei.hms.network.NetworkKit
    public void initConnectionPool(int i, long j, TimeUnit timeUnit) {
        C18305p0.m79323d().m79325a(i, j, timeUnit);
    }

    public void initKit(Context context) {
        C18305p0.m79323d().m79326a(context, "");
    }

    @Override // com.huawei.hms.network.NetworkKit
    public void setOptions(String str) {
        C18305p0.m79323d().m79328a(str);
    }

    @Override // com.huawei.hms.network.NetworkKit
    public void initKit(Context context, String str) {
        C18305p0.m79323d().m79326a(context, str);
    }
}
