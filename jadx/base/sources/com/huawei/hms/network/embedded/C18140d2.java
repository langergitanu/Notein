package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18140d2 implements NetworkReceiver {

    /* JADX INFO: renamed from: b */
    public static final String f54510b = "DNSNetworkReceiver";

    /* JADX INFO: renamed from: a */
    public NetworkInfo f54511a;

    public C18140d2() {
        NetworkInfo networkInfo = NetworkUtil.getNetworkInfo(ContextHolder.getAppContext());
        this.f54511a = networkInfo;
        Logger.m76966v(f54510b, "lastActivityNetInfo: %s", networkInfo == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : networkInfo.toString());
    }

    /* JADX INFO: renamed from: a */
    private boolean m78158a(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        return NetworkUtil.isChangeToConnected(networkInfo, networkInfo2) || NetworkUtil.isConnectTypeChange(networkInfo, networkInfo2);
    }

    @Override // com.huawei.hms.network.inner.api.NetworkReceiver
    public void onReceiveMsg(Context context, Intent intent) {
        NetworkInfo networkInfo = NetworkUtil.getNetworkInfo(context);
        if (networkInfo == null) {
            Logger.m76965v(f54510b, "Get NetworkInfo failed");
            return;
        }
        Logger.m76966v(f54510b, "networkInfo: %s", networkInfo);
        if (m78158a(this.f54511a, networkInfo)) {
            C18224j2.m78842a(networkInfo);
            this.f54511a = networkInfo;
        }
    }
}
