package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.aj */
/* JADX INFO: loaded from: classes8.dex */
public class C18044aj extends HuaweiApi<Api.ApiOptions.NoOptions> {
    public C18044aj(Activity activity, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(activity, api, noOptions, abstractClientBuilder);
    }

    /* JADX INFO: renamed from: b */
    private C18040af m77622b() {
        return new C18040af(getContext().getPackageName());
    }

    /* JADX INFO: renamed from: a */
    public OooO0o<Void> m77623a() {
        String strM77615a = m77622b().m77615a();
        if (!TextUtils.isEmpty(strM77615a)) {
            return doWrite(new C18045ak(CommonNaming.startSmsRetriever, strM77615a, HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startSmsRetriever, 60400300)));
        }
        C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
        ApiException apiException = new ApiException(new Status(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.SMS_PARAM_ERROR));
        synchronized (c25840OooO0oo.f88175OooO00o) {
            try {
                if (!c25840OooO0oo.f88176OooO0O0) {
                    c25840OooO0oo.f88176OooO0O0 = true;
                    c25840OooO0oo.f88178OooO0Oo = apiException;
                    c25840OooO0oo.f88175OooO00o.notifyAll();
                    c25840OooO0oo.OooOO0o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c25840OooO0oo;
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    public C18044aj(Context context, Api<Api.ApiOptions.NoOptions> api, Api.ApiOptions.NoOptions noOptions, AbstractClientBuilder abstractClientBuilder) {
        super(context, api, noOptions, abstractClientBuilder);
    }

    /* JADX INFO: renamed from: a */
    public OooO0o<Void> m77624a(String str) {
        C18053as.m77659b("ReadSmsService", "startConsent enter", true);
        if (str != null && str.length() > 120) {
            C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
            ApiException apiException = new ApiException(new Status(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.SMS_PARAM_ERROR));
            synchronized (c25840OooO0oo.f88175OooO00o) {
                try {
                    if (!c25840OooO0oo.f88176OooO0O0) {
                        c25840OooO0oo.f88176OooO0O0 = true;
                        c25840OooO0oo.f88178OooO0Oo = apiException;
                        c25840OooO0oo.f88175OooO00o.notifyAll();
                        c25840OooO0oo.OooOO0o();
                    }
                } finally {
                }
            }
            return c25840OooO0oo;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", getContext().getPackageName());
            jSONObject.put("phoneNumber", str);
        } catch (JSONException unused) {
            C18053as.m77661d("ReadSmsService", "toJson failed", true);
        }
        if (TextUtils.isEmpty(jSONObject.toString())) {
            C25840OooO0oo c25840OooO0oo2 = new C25840OooO0oo();
            ApiException apiException2 = new ApiException(new Status(CommonConstant.RETCODE.SMS_RETRIEVER_PARAM_FAILED, CommonConstant.RETCODE.SMS_PARAM_ERROR));
            synchronized (c25840OooO0oo2.f88175OooO00o) {
                try {
                    if (!c25840OooO0oo2.f88176OooO0O0) {
                        c25840OooO0oo2.f88176OooO0O0 = true;
                        c25840OooO0oo2.f88178OooO0Oo = apiException2;
                        c25840OooO0oo2.f88175OooO00o.notifyAll();
                        c25840OooO0oo2.OooOO0o();
                    }
                } finally {
                }
            }
            return c25840OooO0oo2;
        }
        return doWrite(new C18046al(CommonNaming.startConsent, jSONObject.toString(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.startConsent, 60400300)));
    }
}
