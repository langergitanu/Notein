package com.huawei.agconnect.remoteconfig;

import android.content.Context;
import com.huawei.agconnect.AGCInitFinishManager;
import com.huawei.agconnect.core.Service;
import com.huawei.agconnect.core.ServiceRegistrar;
import com.huawei.agconnect.remoteconfig.internal.C17671a;
import com.huawei.agconnect.remoteconfig.internal.C17677b;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ConfigRegistrar implements ServiceRegistrar {
    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public List<Service> getServices(Context context) {
        return Arrays.asList(Service.builder(C17671a.class).build());
    }

    @Override // com.huawei.agconnect.core.ServiceRegistrar
    public void initialize(Context context) {
        AGCInitFinishManager.getInstance().addAGCInitFinishCallback(new AGCInitFinishManager.AGCInitFinishCallback() { // from class: com.huawei.agconnect.remoteconfig.ConfigRegistrar.1
            @Override // com.huawei.agconnect.AGCInitFinishManager.AGCInitFinishCallback
            public void onFinish() {
                C17677b.m75662a().m75664b();
            }
        });
    }
}
