package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkReceiver;
import java.util.Iterator;
import o0O00o.AbstractC25843OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18197h3 extends AbstractC25843OooO00o {

    /* JADX INFO: renamed from: a */
    public static final String f55023a = "NetworkStateReceiver";

    public static void registerNetworkState(Context context) {
        if (context == null) {
            Logger.m76967w(f55023a, "invalid parameter");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C18197h3(), intentFilter);
        Logger.m76965v(f55023a, "Register Network State Listen Success!");
    }

    @Override // o0O00o.AbstractC25843OooO00o
    public void onReceiveMsg(Context context, Intent intent) {
        Logger.m76965v(f55023a, "Capture network state change");
        Iterator<NetworkReceiver> it = NetworkKitInnerImpl.getInstance().getNetworkBroadcastManager().m79046a().iterator();
        while (it.hasNext()) {
            it.next().onReceiveMsg(context, intent);
        }
    }
}
