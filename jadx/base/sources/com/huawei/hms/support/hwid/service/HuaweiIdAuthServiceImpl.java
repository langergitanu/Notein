package com.huawei.hms.support.hwid.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.C18036ab;
import com.huawei.hms.hwid.C18037ac;
import com.huawei.hms.hwid.C18038ad;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.hwid.C18075v;
import com.huawei.hms.hwid.C18077x;
import com.huawei.hms.hwid.C18079z;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.api.entity.hwid.SignOutReq;
import com.huawei.hms.support.api.hwid.HuaweiIdGetTokenOptions;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdAuthServiceImpl extends HuaweiApi<HuaweiIdAuthParams> implements HuaweiIdAuthService {
    private static final Api<HuaweiIdAuthParams> HUAWEI_ID_AUTH_API = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);
    protected static final String TAG = "[HUAWEIIDSDK]HuaweiIdAuthService";
    private String mAccountName;
    private boolean mFromRequestToken;

    public HuaweiIdAuthServiceImpl(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams, int i) {
        super(activity, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, (AbstractClientBuilder) new C18075v(), i);
    }

    private HuaweiIdAuthParams setSignInParams(String str) {
        HuaweiIdAuthParams option = getOption();
        try {
            new JSONObject(str);
            try {
                HuaweiIdAuthParams huaweiIdAuthParamsM80721clone = option.m80721clone();
                huaweiIdAuthParamsM80721clone.setSignInParams(str);
                return huaweiIdAuthParamsM80721clone;
            } catch (CloneNotSupportedException unused) {
                C18053as.m77661d(TAG, "CloneNotSupportedException", true);
                return option;
            }
        } catch (JSONException unused2) {
            C18053as.m77661d(TAG, "JSONException", true);
            return option;
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public OooO0o<Void> cancelAuthorization() {
        C18053as.m77659b(TAG, "cancelAuthorization", true);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(getOption());
        try {
            return doWrite(new C18079z(CommonNaming.revokeAccess, huaweiIdSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.revokeAccess, 60400300)));
        } catch (JSONException unused) {
            C18053as.m77661d(TAG, "JSONException, errorcode is:2015", true);
            C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
            ApiException apiException = new ApiException(new Status(2015));
            synchronized (c25840OooO0oo.f88175OooO00o) {
                try {
                    if (!c25840OooO0oo.f88176OooO0O0) {
                        c25840OooO0oo.f88176OooO0O0 = true;
                        c25840OooO0oo.f88178OooO0Oo = apiException;
                        c25840OooO0oo.f88175OooO00o.notifyAll();
                        c25840OooO0oo.OooOO0o();
                    }
                    return c25840OooO0oo;
                } finally {
                }
            }
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 1;
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public Intent getSignInIntent() {
        return getSignInIntent("");
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public OooO0o<Void> signOut() {
        C18053as.m77659b(TAG, "signOut", true);
        C18077x.m77713a();
        SignOutReq signOutReq = new SignOutReq();
        return doWrite(new C18038ad(CommonNaming.signout, signOutReq.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.signout, 60400300)));
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public OooO0o<AuthHuaweiId> silentSignIn() {
        return silentSignIn("");
    }

    public HuaweiIdAuthServiceImpl(Context context, HuaweiIdAuthParams huaweiIdAuthParams, int i) {
        super(context, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, new C18075v(), i);
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public Intent getSignInIntent(String str) {
        C18053as.m77659b(TAG, "getSignInIntent", true);
        return C18077x.m77710a(getContext(), setSignInParams(str), getSubAppID());
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthService
    public OooO0o<AuthHuaweiId> silentSignIn(String str) {
        C18053as.m77659b(TAG, "silentSignIn", true);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdAuthParams(setSignInParams(str));
        boolean z = this.mFromRequestToken;
        if (z) {
            huaweiIdSignInRequest.setHuaweiIdGetTokenOptions(new HuaweiIdGetTokenOptions(this.mAccountName, z));
        }
        try {
            String json = huaweiIdSignInRequest.toJson();
            String strReportEntry = HiAnalyticsClient.reportEntry(getContext(), CommonNaming.silentSignIn, 60400300);
            return this.mFromRequestToken ? doWrite(new C18036ab(CommonNaming.silentSignIn, json, strReportEntry)) : doWrite(new C18037ac(CommonNaming.silentSignIn, json, strReportEntry));
        } catch (JSONException unused) {
            C18053as.m77661d(TAG, "JSONException, errorcode is:2015", true);
            C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
            ApiException apiException = new ApiException(new Status(2015));
            synchronized (c25840OooO0oo.f88175OooO00o) {
                try {
                    if (!c25840OooO0oo.f88176OooO0O0) {
                        c25840OooO0oo.f88176OooO0O0 = true;
                        c25840OooO0oo.f88178OooO0Oo = apiException;
                        c25840OooO0oo.f88175OooO00o.notifyAll();
                        c25840OooO0oo.OooOO0o();
                    }
                    return c25840OooO0oo;
                } finally {
                }
            }
        }
    }

    public HuaweiIdAuthServiceImpl(Context context, HuaweiIdAuthParams huaweiIdAuthParams, String str, int i) {
        super(context, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, new C18075v(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    public HuaweiIdAuthServiceImpl(Activity activity, HuaweiIdAuthParams huaweiIdAuthParams, String str, int i) {
        super(activity, HUAWEI_ID_AUTH_API, huaweiIdAuthParams, (AbstractClientBuilder) new C18075v(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }
}
