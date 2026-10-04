package com.huawei.hms.network.embedded;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.api.advance.WrapperLogger;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.excutor.PolicyExecutor;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.p0 */
/* JADX INFO: loaded from: classes9.dex */
public class C18305p0 {

    /* JADX INFO: renamed from: b */
    public static final String f55847b = "ComposedNetworkKit";

    /* JADX INFO: renamed from: c */
    public static final C18305p0 f55848c = new C18305p0();

    /* JADX INFO: renamed from: a */
    public PolicyExecutor f55849a;

    /* JADX INFO: renamed from: c */
    private Bundle m79322c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(PolicyNetworkService.NetworkServiceConstants.IS_DYNAMIC, ContextHolder.getKitContext() != null);
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public static C18305p0 m79323d() {
        return f55848c;
    }

    /* JADX INFO: renamed from: a */
    public String m79324a(String str, String str2) {
        PolicyExecutor policyExecutor = this.f55849a;
        return policyExecutor != null ? policyExecutor.getValue(str, str2) : "";
    }

    /* JADX INFO: renamed from: b */
    public void m79331b() {
        C18255l5.getInstance().evictAll();
    }

    /* JADX INFO: renamed from: a */
    public void m79325a(int i, long j, TimeUnit timeUnit) {
        C18255l5.init(i, j, timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public void m79326a(Context context, String str) {
        ContextHolder.setAppContext(context);
        new C18400w4().init();
        HianalyticsHelper.getInstance();
        NetworkKitInnerImpl.getInstance().init(context, str, m79322c()).setProtocolStackManager(new C18211i3());
        C18143d5.init();
        AbstractC18151e.m78274c().mo78277a(context);
        C18197h3.registerNetworkState(context);
        this.f55849a = new PolicyExecutor();
        NetworkKitInnerImpl.getInstance().setPolicyExecutor(this.f55849a);
    }

    /* JADX INFO: renamed from: a */
    public void m79327a(WrapperLogger wrapperLogger, boolean z) {
        Logger.setExtLogger(new C18321q3.k(wrapperLogger), z);
    }

    /* JADX INFO: renamed from: a */
    public void m79328a(String str) {
        if (str == null) {
            Logger.m76967w(f55847b, "setOptions == null");
            return;
        }
        PolicyExecutor policyExecutor = this.f55849a;
        if (policyExecutor != null) {
            policyExecutor.setOptions(str);
            NetworkKitInnerImpl.getInstance().setPolicyExecutor(this.f55849a);
            HianalyticsHelper.getInstance().setHaTag(this.f55849a.getString("", PolicyNetworkService.GlobalConstants.HA_TAG));
            if (HianalyticsHelper.getInstance().isEnableReport(ContextHolder.getAppContext())) {
                AbstractC18151e.m78274c().mo78278a(this.f55849a.getBoolean("", PolicyNetworkService.GlobalConstants.ENABLE_DETECT_WITH_HTTP));
            }
            HianalyticsHelper.getInstance().enablePrivacyPolicy(this.f55849a.getBoolean("", PolicyNetworkService.GlobalConstants.ENABLE_PRIVACY_POLICY));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m79329a(boolean z, String... strArr) {
        C18240k4.getInstance().addQuicHint(Arrays.asList(strArr), z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m79330a() {
        return AbstractC18151e.m78274c().mo78279a();
    }
}
