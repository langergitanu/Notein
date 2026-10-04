package com.huawei.hms.network.conf.api;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.api.RequestContext;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class ConfigService extends PolicyNetworkService {
    public static final String TAG = "ConfigService";

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void beginRequest(RequestContext requestContext) {
        Logger.m76965v(TAG, "beginRequest");
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void endRequest(RequestContext requestContext) {
        Logger.m76965v(TAG, "endRequest");
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceName() {
        return NetworkService.Constants.CONFIG_SERVICE;
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService, com.huawei.hms.network.inner.api.NetworkService
    public String getServiceType() {
        return ConfigService.class.getName();
    }

    public String getValue(String str) {
        return getValue(null, str);
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public Map<String, String> getValues(String str, String... strArr) {
        HashMap map = new HashMap();
        for (String str2 : strArr) {
            map.put(str2, getValue(str, str2));
        }
        return map;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getVersion() {
        return "5.0.4.300";
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onCreate(Context context, Bundle bundle) {
        ConfigAPI.init(context);
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onDestroy(Context context) {
        Logger.m76965v(TAG, "onDestroy");
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public String getValue(String str, String str2) {
        Object value = ConfigAPI.getValue(str2);
        return value instanceof String ? (String) value : value != null ? String.valueOf(value) : "";
    }

    public String getValue(String str, String str2, String str3) {
        return getValue(str2, str + "|" + str3);
    }
}
