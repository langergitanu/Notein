package com.huawei.hms.hwid;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.hwid.internal.p585ui.activity.HwIdSignInHubActivity;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.utils.Util;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hwid.x */
/* JADX INFO: loaded from: classes8.dex */
public final class C18077x {
    /* JADX INFO: renamed from: a */
    public static Intent m77710a(Context context, HuaweiIdAuthParams huaweiIdAuthParams, String str) {
        C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdAuthTool", "getSignInIntent enter", true);
        Intent intent = new Intent("com.huawei.hms.jos.signIn");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, HwIdSignInHubActivity.class);
        String appId = Util.getAppId(context);
        String packageName = context.getPackageName();
        C18072s c18072s = new C18072s();
        c18072s.m77632b(appId);
        c18072s.m77634c(packageName);
        c18072s.m77630a(60400302L);
        c18072s.m77636d(str);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(huaweiIdAuthParams);
        try {
            intent.putExtra("HUAWEIID_CP_CLIENTINFO", c18072s.m77635d());
            intent.putExtra("HUAWEIID_SIGNIN_REQUEST", huaweiIdSignInRequest.toJson());
            return intent;
        } catch (JSONException unused) {
            C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdAuthTool", "JSONException", true);
            return intent;
        }
    }

    /* JADX INFO: renamed from: b */
    public static AuthHuaweiId m77715b() {
        return C18078y.m77716a().m77719b();
    }

    /* JADX INFO: renamed from: a */
    public static HuaweiIdAuthResult m77712a(Intent intent) {
        C18053as.m77659b("[HUAWEIIDSDK]HuaweiIdAuthTool", "getSignInResultFromIntent", true);
        if (intent == null || !intent.hasExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) {
            C18053as.m77661d("[HUAWEIIDSDK]HuaweiIdAuthTool", "data or signInResult is null", true);
            return null;
        }
        try {
            return new HuaweiIdAuthResult().fromJson(intent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID));
        } catch (JSONException unused) {
            C18053as.m77661d("[HUAWEIIDSDK]HuaweiIdAuthTool", "JSONException", true);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77713a() {
        C18078y.m77716a().m77720c();
    }

    /* JADX INFO: renamed from: a */
    public static HuaweiIdAuthParams m77711a(List<Scope> list) {
        HuaweiIdAuthParamsHelper huaweiIdAuthParamsHelper = new HuaweiIdAuthParamsHelper();
        if (C18050ap.m77650b(list).booleanValue()) {
            huaweiIdAuthParamsHelper.setScopeList(list);
        }
        Iterator<Scope> it = list.iterator();
        while (it.hasNext()) {
            if (m77714a(it.next(), CommonConstant.SCOPE.SCOPE_ACCOUNT_SHIPPING_ADDRESS)) {
                huaweiIdAuthParamsHelper.setShippingAddress();
            }
        }
        return huaweiIdAuthParamsHelper.createParams();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m77714a(Scope scope, String str) {
        if (scope != null) {
            return TextUtils.equals(scope.getScopeUri(), str);
        }
        return false;
    }
}
