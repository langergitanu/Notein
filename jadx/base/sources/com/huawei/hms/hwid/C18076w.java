package com.huawei.hms.hwid;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.w */
/* JADX INFO: loaded from: classes8.dex */
public class C18076w extends HuaweiApi<a> {

    /* JADX INFO: renamed from: a */
    private static final Api<a> f53977a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_GAME);

    /* JADX INFO: renamed from: c */
    private static final a f53978c = new a();

    /* JADX INFO: renamed from: b */
    private Context f53979b;

    /* JADX INFO: renamed from: com.huawei.hms.hwid.w$a */
    public static class a implements Api.ApiOptions.Optional {
    }

    public C18076w(Context context) {
        super(context, f53977a, f53978c, new C18075v());
        this.f53979b = context;
    }

    /* JADX INFO: renamed from: a */
    public void m77709a() {
        C18053as.m77659b("SignInNoticeClientImpl", "request Jos Notice.", true);
        String strReportEntry = HiAnalyticsClient.reportEntry(getContext(), CoreNaming.GETNOTICE, 60400300);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("noticeType", 1);
            jSONObject.put("hmsSdkVersionName", "6.4.0.302");
            jSONObject.put("cpId", Util.getCpId(this.f53979b));
            doWrite(new C18039ae(CoreNaming.GETNOTICE, jSONObject.toString(), strReportEntry));
        } catch (JSONException unused) {
            C18053as.m77660c("SignInNoticeClientImpl", "createParams Notice request meet JSONException.", true);
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }
}
