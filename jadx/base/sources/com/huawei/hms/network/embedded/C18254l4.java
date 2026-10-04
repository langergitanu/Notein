package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.NetworkQualityRttListener;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18254l4 extends NetworkQualityRttListener {

    /* JADX INFO: renamed from: a */
    public static final String f55595a = "CronetNetworkQualityRtt";

    public C18254l4(Executor executor) {
        super(executor);
    }

    public void onRttObservation(int i, long j, int i2) {
        Logger.m76966v(f55595a, "onRttObservation[%s]: %d, %d", new Date(j).toString(), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
