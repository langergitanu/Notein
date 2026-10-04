package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.support.account.request.AccountAuthParams;

/* JADX INFO: renamed from: com.huawei.hms.hwid.d */
/* JADX INFO: loaded from: classes8.dex */
public class C18056d extends AbstractClientBuilder<C18055c, AccountAuthParams> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C18055c buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new C18055c(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
