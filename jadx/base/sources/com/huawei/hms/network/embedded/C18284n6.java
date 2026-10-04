package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.NetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18284n6 {

    /* JADX INFO: renamed from: c */
    public static final String f55773c = "ServicePolicyExecutor";

    /* JADX INFO: renamed from: a */
    public JSONObject f55774a;

    /* JADX INFO: renamed from: b */
    public PolicyNetworkService f55775b;

    public C18284n6(String str) {
        try {
            this.f55774a = TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (JSONException unused) {
            this.f55774a = new JSONObject();
            Logger.m76967w(f55773c, "call method NetworkServiceManager init set options occur JSONException");
        }
        PolicyNetworkService policyNetworkService = NetworkKitInnerImpl.getInstance().getPolicyNetworkService(NetworkService.Constants.CONFIG_SERVICE);
        this.f55775b = policyNetworkService;
        if (policyNetworkService == null) {
            throw new IllegalStateException("configPolicyService is error");
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m79257a(String str) {
        try {
            return this.f55774a.has(str) ? this.f55774a.getBoolean(str) : this.f55775b.getBoolean(null, str);
        } catch (JSONException unused) {
            return this.f55775b.getBoolean(null, str);
        }
    }
}
