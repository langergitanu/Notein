package com.huawei.hms.support.account.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.C18049ao;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.hwid.C18056d;
import com.huawei.hms.hwid.C18058f;
import com.huawei.hms.hwid.C18060h;
import com.huawei.hms.hwid.C18061i;
import com.huawei.hms.hwid.C18063j;
import com.huawei.hms.hwid.C18065l;
import com.huawei.hms.hwid.C18066m;
import com.huawei.hms.hwid.C18067n;
import com.huawei.hms.hwid.C18068o;
import com.huawei.hms.hwid.C18069p;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountIcon;
import com.huawei.hms.support.account.result.AssistTokenResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.account.AccountGetTokenOptions;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountLogoutRequest;
import com.huawei.hms.support.api.entity.account.AccountNaming;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.account.AccountSignOutReq;
import com.huawei.hms.support.api.entity.account.AccountStartAssistLoginRequest;
import com.huawei.hms.support.api.entity.account.GetAssistTokenRequest;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import java.util.Iterator;
import java.util.List;
import o0O00OOO.C25834OooO0oO;
import o0O00OOO.OooO0o;
import o0O00Oo.C25840OooO0oo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class AccountAuthServiceImpl extends HuaweiApi<AccountAuthParams> implements AccountAuthService {
    private static final Api<AccountAuthParams> ACCOUNT_AUTH_API = new Api<>("AuthAccount.API");
    private static final Long ONE_WEEK_MILLISECOND = 604800000L;
    protected static final String TAG = "[ACCOUNT]AccountAuthServiceImpl";
    private String mAccountName;
    private boolean mFromRequestToken;

    public AccountAuthServiceImpl(Activity activity, AccountAuthParams accountAuthParams, int i) {
        super(activity, ACCOUNT_AUTH_API, accountAuthParams, (AbstractClientBuilder) new C18056d(), i);
    }

    private boolean checkIdTokenSignAlg(AccountAuthParams accountAuthParams) {
        C18053as.m77659b(TAG, "checkIdTokenSignAlg", true);
        if (accountAuthParams == null) {
            C18053as.m77661d(TAG, "accountAuthParams is null", true);
            return false;
        }
        try {
            int i = new JSONObject(accountAuthParams.getSignInParams()).getInt(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG);
            return i == 1 || i == 2;
        } catch (JSONException e) {
            C18053as.m77661d(TAG, "JSONException:".concat(e.getClass().getSimpleName()), true);
            return false;
        }
    }

    private OooO0o<AssistTokenResult> doWriteGetAssistToken(GetAssistTokenRequest getAssistTokenRequest) {
        try {
            return doWrite(new C18069p(AccountNaming.getAssistToken, getAssistTokenRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.getAssistToken, 60400300)));
        } catch (JSONException unused) {
            C18053as.m77661d(TAG, "JSONException， errorcode is:2015", true);
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

    private Bitmap stringToBitmap(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            C18053as.m77661d(TAG, "stringToBitmap Exception is ".concat(e.getClass().getSimpleName()), true);
            return null;
        } catch (OutOfMemoryError unused) {
            C18053as.m77661d(TAG, "out of memory error ", true);
            return null;
        }
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public OooO0o<Void> cancelAuthorization() {
        C18053as.m77659b(TAG, "cancelAuthorization", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(getOption());
        try {
            return doWrite(new C18060h(AccountNaming.revokeAccessAccount, accountSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.revokeAccessAccount, 60400300)));
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
        List<PermissionInfo> permissionInfos;
        AccountAuthParams option = getOption();
        if (option != null && (permissionInfos = option.getPermissionInfos()) != null && permissionInfos.size() != 0) {
            Iterator<PermissionInfo> it = permissionInfos.iterator();
            while (it.hasNext()) {
                String permission = it.next().getPermission();
                if (permission != null && permission.equals(CommonConstant.LocalPermission.CARRIER_ID)) {
                    C18053as.m77659b(TAG, "permissioninfos contain carrierId and silentSignIn setApiLevel is 13", true);
                    return 13;
                }
            }
        }
        return 1;
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public OooO0o<AssistTokenResult> getAssistToken(GetAssistTokenRequest getAssistTokenRequest) {
        C18053as.m77659b(TAG, "getAssistToken", true);
        return doWriteGetAssistToken(getAssistTokenRequest);
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public OooO0o<AccountIcon> getChannel() {
        C18053as.m77659b(TAG, "getChannel", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(getOption());
        Context context = getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("ACCOUNT_CHANNEL_CACHE", 0);
        String string = sharedPreferences.getString("icon", "");
        String string2 = sharedPreferences.getString("desc", "");
        long j = sharedPreferences.getLong("cache_time", 0L);
        long jM77644a = C18049ao.m77644a();
        if (j != 0 && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && jM77644a - j < ONE_WEEK_MILLISECOND.longValue()) {
            AccountIcon accountIcon = new AccountIcon(string2, stringToBitmap(string));
            C25834OooO0oO c25834OooO0oO = new C25834OooO0oO();
            c25834OooO0oO.OooO0O0(accountIcon);
            c25834OooO0oO.OooO00o(new ApiException(new Status(0)));
            return c25834OooO0oO.f88150OooO00o;
        }
        try {
            return doWrite(new C18061i(AccountNaming.getChannelAccount, accountSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.getChannelAccount, 60400300), context));
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

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public Intent getIndependentSignInIntent(String str) {
        C18053as.m77659b(TAG, "getIndependentSignInIntent", true);
        return C18058f.m77668a(getContext(), getOption(), getSubAppID(), str);
    }

    @Override // com.huawei.hms.support.feature.service.AuthService
    public Intent getSignInIntent() {
        C18053as.m77659b(TAG, "getSignInIntent", true);
        return C18058f.m77666a(getContext(), getOption(), getSubAppID());
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public OooO0o<Void> logout() {
        C18053as.m77659b(TAG, "logout", true);
        AccountLogoutRequest accountLogoutRequest = new AccountLogoutRequest();
        accountLogoutRequest.setAccountAuthParams(getOption());
        try {
            return doWrite(new C18063j(AccountNaming.logout, accountLogoutRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.logout, 60400300)));
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

    @Override // com.huawei.hms.support.feature.service.AuthService
    public OooO0o<Void> signOut() {
        C18053as.m77659b(TAG, "signOut", true);
        C18058f.m77671a();
        AccountSignOutReq accountSignOutReq = new AccountSignOutReq();
        return doWrite(new C18067n(AccountNaming.signoutAccount, accountSignOutReq.toJson(), HiAnalyticsClient.reportEntry(getContext(), CommonNaming.signout, 60400300)));
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public OooO0o<AuthAccount> silentSignIn() {
        C18053as.m77659b(TAG, "silentSignIn", true);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        AccountAuthParams option = getOption();
        accountSignInRequest.setAccountAuthParams(option);
        boolean z = this.mFromRequestToken;
        if (z) {
            accountSignInRequest.setAccountGetTokenOptions(new AccountGetTokenOptions(this.mAccountName, z));
        }
        if (!checkIdTokenSignAlg(option)) {
            C18053as.m77661d(TAG, "idTokenSignAlg is invalid", true);
            C25840OooO0oo c25840OooO0oo = new C25840OooO0oo();
            ApiException apiException = new ApiException(new Status(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR, "idTokenSignAlg is invalid"));
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
        try {
            String json = accountSignInRequest.toJson();
            String strReportEntry = HiAnalyticsClient.reportEntry(getContext(), AccountNaming.silentSignInAccount, 60400300);
            return this.mFromRequestToken ? doWrite(new C18065l(AccountNaming.silentSignInAccount, json, strReportEntry)) : doWrite(new C18066m(AccountNaming.silentSignInAccount, json, strReportEntry));
        } catch (JSONException unused) {
            C18053as.m77661d(TAG, "JSONException, errorcode is:2015", true);
            C25840OooO0oo c25840OooO0oo2 = new C25840OooO0oo();
            ApiException apiException2 = new ApiException(new Status(2015));
            synchronized (c25840OooO0oo2.f88175OooO00o) {
                try {
                    if (!c25840OooO0oo2.f88176OooO0O0) {
                        c25840OooO0oo2.f88176OooO0O0 = true;
                        c25840OooO0oo2.f88178OooO0Oo = apiException2;
                        c25840OooO0oo2.f88175OooO00o.notifyAll();
                        c25840OooO0oo2.OooOO0o();
                    }
                    return c25840OooO0oo2;
                } finally {
                }
            }
        }
    }

    @Override // com.huawei.hms.support.account.service.AccountAuthService
    public OooO0o<Void> startAssistLogin(String str) {
        C18053as.m77659b(TAG, "startAssistLogin", true);
        try {
            return doWrite(new C18068o(AccountNaming.startAssistLogin, new AccountStartAssistLoginRequest(str).toJson(), HiAnalyticsClient.reportEntry(getContext(), AccountNaming.startAssistLogin, 60400300)));
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

    public AccountAuthServiceImpl(Context context, AccountAuthParams accountAuthParams, int i) {
        super(context, ACCOUNT_AUTH_API, accountAuthParams, new C18056d(), i);
    }

    public AccountAuthServiceImpl(Context context, AccountAuthParams accountAuthParams, String str, int i) {
        super(context, ACCOUNT_AUTH_API, accountAuthParams, new C18056d(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }

    public AccountAuthServiceImpl(Activity activity, AccountAuthParams accountAuthParams, String str, int i) {
        super(activity, ACCOUNT_AUTH_API, accountAuthParams, (AbstractClientBuilder) new C18056d(), i);
        this.mAccountName = str;
        this.mFromRequestToken = true;
    }
}
