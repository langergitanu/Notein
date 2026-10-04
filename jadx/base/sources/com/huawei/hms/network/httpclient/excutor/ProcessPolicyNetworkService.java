package com.huawei.hms.network.httpclient.excutor;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18292o0;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.api.RequestContext;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessPolicyNetworkService extends PolicyNetworkService {
    public static final String TAG = "ProcessPolicyNetworkService";
    public C18292o0 baseConfig = new C18292o0("");

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void beginRequest(RequestContext requestContext) {
        Logger.m76965v(TAG, "context");
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void endRequest(RequestContext requestContext) {
        Logger.m76965v(TAG, "context");
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceName() {
        return ProcessPolicyNetworkService.class.getName();
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService, com.huawei.hms.network.inner.api.NetworkService
    public String getServiceType() {
        return ProcessPolicyNetworkService.class.getName();
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public String getValue(String str, String str2) {
        return this.baseConfig.get(str2);
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public Map<String, String> getValues(String str, String... strArr) {
        HashMap map = new HashMap();
        for (String str2 : strArr) {
            String value = getValue(str, str2);
            if (!value.isEmpty()) {
                map.put(str2, value);
            }
        }
        return map;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getVersion() {
        return "5.0.4.300";
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onCreate(Context context, Bundle bundle) {
        Logger.m76965v(TAG, "onCreate");
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onDestroy(Context context) {
        Logger.m76965v(TAG, "onDestroy");
    }

    public void setValue(String str, Object obj) {
        this.baseConfig.setValue(str, obj);
    }

    public void setValues(String str) {
        Logger.m76965v(TAG, "options = " + str);
        this.baseConfig.setOption(str);
    }
}
