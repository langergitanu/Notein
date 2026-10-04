package com.huawei.hms.network.httpclient.excutor;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.conf.api.ConfigService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.api.RequestContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class PolicyExecutor extends PolicyNetworkService {
    public static final String TAG = "PolicyExecutor";
    public final List<PolicyNetworkService> policyNetworkServices;
    public final ProcessPolicyNetworkService processPolicyNetworkService;

    public PolicyExecutor() {
        ArrayList arrayList = new ArrayList();
        this.policyNetworkServices = arrayList;
        ProcessPolicyNetworkService processPolicyNetworkService = new ProcessPolicyNetworkService();
        this.processPolicyNetworkService = processPolicyNetworkService;
        arrayList.add(processPolicyNetworkService);
        PolicyNetworkService policyNetworkService = NetworkKitInnerImpl.getInstance().getPolicyNetworkService("ai");
        if (policyNetworkService != null) {
            arrayList.add(policyNetworkService);
        }
        arrayList.add(NetworkKitInnerImpl.getInstance().getPolicyNetworkService(NetworkService.Constants.CONFIG_SERVICE));
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void beginRequest(RequestContext requestContext) {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                policyNetworkService.beginRequest(requestContext);
            }
        }
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void endRequest(RequestContext requestContext) {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                policyNetworkService.endRequest(requestContext);
            }
        }
    }

    public String getRequestPramas(String str, String str2) {
        Map<String, String> values = getValues(str, str2, (String[]) PolicyNetworkService.RequestConstants.REQUEST_CONSTANTS.toArray(new String[0]));
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : values.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
            Logger.m76967w(TAG, "getRequestPramas JSONException");
        }
        return jSONObject.toString();
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceName() {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                String serviceName = policyNetworkService.getServiceName();
                if (!TextUtils.isEmpty(serviceName)) {
                    return serviceName;
                }
            }
        }
        return "";
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService, com.huawei.hms.network.inner.api.NetworkService
    public String getServiceType() {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                String serviceType = policyNetworkService.getServiceType();
                if (!TextUtils.isEmpty(serviceType)) {
                    return serviceType;
                }
            }
        }
        return "";
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public String getValue(String str, String str2) {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                String value = policyNetworkService.getValue(str, str2);
                if (!TextUtils.isEmpty(value)) {
                    return value;
                }
            }
        }
        return "";
    }

    public Map<String, String> getValues(String str, String str2, String... strArr) {
        HashMap map = new HashMap();
        for (String str3 : strArr) {
            Iterator<PolicyNetworkService> it = this.policyNetworkServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PolicyNetworkService next = it.next();
                if (next != null) {
                    String value = (!(next instanceof ConfigService) || str == null) ? next.getValue(str2, str3) : ((ConfigService) next).getValue(str, str2, str3);
                    if (!TextUtils.isEmpty(value)) {
                        map.put(str3, value);
                        break;
                    }
                }
            }
        }
        return map;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getVersion() {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                String version = policyNetworkService.getVersion();
                if (!TextUtils.isEmpty(version)) {
                    return version;
                }
            }
        }
        return "";
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onCreate(Context context, Bundle bundle) {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                policyNetworkService.onCreate(context, bundle);
            }
        }
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onDestroy(Context context) {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                policyNetworkService.onDestroy(context);
            }
        }
    }

    public void setOptions(String str) {
        this.processPolicyNetworkService.setValues(str);
    }

    public void setValue(String str, Object obj) {
        this.processPolicyNetworkService.setValue(str, obj);
    }

    public String getValue(String str, String str2, String str3) {
        for (PolicyNetworkService policyNetworkService : this.policyNetworkServices) {
            if (policyNetworkService != null) {
                String value = (!(policyNetworkService instanceof ConfigService) || str == null) ? policyNetworkService.getValue(str2, str3) : ((ConfigService) policyNetworkService).getValue(str, str2, str3);
                if (!TextUtils.isEmpty(value)) {
                    return value;
                }
            }
        }
        return "";
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public Map<String, String> getValues(String str, String... strArr) {
        HashMap map = new HashMap();
        for (String str2 : strArr) {
            Iterator<PolicyNetworkService> it = this.policyNetworkServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PolicyNetworkService next = it.next();
                if (next != null) {
                    String value = next.getValue(str, str2);
                    if (!TextUtils.isEmpty(value)) {
                        map.put(str2, value);
                        break;
                    }
                }
            }
        }
        return map;
    }
}
