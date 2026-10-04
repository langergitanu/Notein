package com.huawei.hms.network.p586ai;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18097a1;
import com.huawei.hms.network.embedded.C18181g1;
import com.huawei.hms.network.embedded.C18195h1;
import com.huawei.hms.network.embedded.C18237k1;
import com.huawei.hms.network.embedded.C18251l1;
import com.huawei.hms.network.embedded.C18265m1;
import com.huawei.hms.network.embedded.C18306p1;
import com.huawei.hms.network.embedded.C18357t0;
import com.huawei.hms.network.embedded.C18370u0;
import com.huawei.hms.network.embedded.C18383v0;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.api.RequestContext;
import com.huawei.hms.networkkit.embedded.C18447R;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class AIPolicyService extends PolicyNetworkService {
    public static final String TAG = "AIInterceptorService";
    public static boolean enableFlag = false;
    public String excludeDomain = ContextHolder.getResourceContext().getString(C18447R.string.aimodule_exclude_domain);

    private void destroyModel() {
        Logger.m76958d(TAG, "model destory");
        C18097a1.m77836c().m77837a();
    }

    public static boolean isAiEnable() {
        return enableFlag;
    }

    private void registModels() {
        C18383v0.m79659a().m79663a(C18357t0.f56141a, new C18265m1());
        C18383v0.m79659a().m79663a(C18357t0.f56142b, new C18195h1());
        C18097a1.m77836c().m77840a(C18357t0.f56141a, new C18251l1());
        C18097a1.m77836c().m77840a(C18357t0.f56142b, new C18181g1());
        C18097a1.m77836c().m77840a(C18357t0.f56143c, new C18237k1());
        C18306p1.m79332b().m79335a();
    }

    public static void setEnableFlag(boolean z) {
        enableFlag = z;
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void beginRequest(RequestContext requestContext) {
        if (requestContext.request().getUrl().contains(this.excludeDomain)) {
            return;
        }
        C18097a1.m77836c().m77838a(requestContext.request());
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public void endRequest(RequestContext requestContext) {
        if (requestContext.request().getUrl().contains(this.excludeDomain)) {
            return;
        }
        C18097a1.m77836c().m77839a(requestContext);
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceName() {
        return "ai";
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService, com.huawei.hms.network.inner.api.NetworkService
    public String getServiceType() {
        return AIPolicyService.class.getName();
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public String getValue(String str, String str2) {
        return null;
    }

    @Override // com.huawei.hms.network.inner.api.PolicyNetworkService
    public Map<String, String> getValues(String str, String... strArr) {
        return null;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getVersion() {
        return "5.0.4.300";
    }

    public void initModels() {
        Logger.m76958d(TAG, "check init");
        registModels();
        C18097a1.m77836c().m77841b();
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onCreate(Context context, Bundle bundle) {
        setEnableFlag(true);
        C18370u0.m79588a(bundle);
        initModels();
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onDestroy(Context context) {
        destroyModel();
    }
}
