package com.huawei.hms.support.sms;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.C18042ah;
import com.huawei.hms.hwid.C18044aj;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public class ReadSmsManager {

    /* JADX INFO: renamed from: a */
    private static final Api<Api.ApiOptions.NoOptions> f56971a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);

    /* JADX INFO: renamed from: b */
    private static final C18042ah f56972b = new C18042ah();

    public static OooO0o<Void> start(Activity activity) {
        return new C18044aj(activity, f56971a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) f56972b).m77623a();
    }

    public static OooO0o<Void> startConsent(Activity activity, String str) {
        return new C18044aj(activity, f56971a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) f56972b).m77624a(str);
    }

    public static OooO0o<Void> start(Context context) {
        return new C18044aj(context, f56971a, (Api.ApiOptions.NoOptions) null, f56972b).m77623a();
    }
}
