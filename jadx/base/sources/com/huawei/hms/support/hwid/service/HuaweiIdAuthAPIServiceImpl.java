package com.huawei.hms.support.hwid.service;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.api.HuaweiApiClientImpl;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.common.api.internal.OptionalPendingResultImpl;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.hwid.C18077x;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.api.entity.hwid.QueryShippingAddressReq;
import com.huawei.hms.support.api.entity.hwid.QueryShippingAddressResp;
import com.huawei.hms.support.api.entity.hwid.RevokeAccessResp;
import com.huawei.hms.support.api.entity.hwid.ShippingAddressInfo;
import com.huawei.hms.support.api.entity.hwid.ShippingAddressParcelable;
import com.huawei.hms.support.api.entity.hwid.SignInReq;
import com.huawei.hms.support.api.entity.hwid.SignInResp;
import com.huawei.hms.support.api.entity.hwid.SignOutReq;
import com.huawei.hms.support.api.entity.hwid.SignOutResp;
import com.huawei.hms.support.api.hwid.AddressResult;
import com.huawei.hms.support.api.hwid.SignInResult;
import com.huawei.hms.support.hwid.HuaweiIdAuthAPIManager;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import o0O00OOO.OooO0OO;
import o0O00OOO.OooO0o;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdAuthAPIServiceImpl implements HuaweiIdAuthAPIService {

    /* JADX INFO: renamed from: a */
    private HuaweiApiClient f56939a = null;

    /* JADX INFO: renamed from: b */
    private WeakReference<Activity> f56940b = null;

    public static class SignOutNoConnectPendingResult extends PendingResultImpl<Status, SignOutResp> {

        /* JADX INFO: renamed from: a */
        private ResultCallback f56945a;

        public SignOutNoConnectPendingResult(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        public ResultCallback getCallback() {
            return this.f56945a;
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl, com.huawei.hms.support.api.client.PendingResult
        public void setResultCallback(ResultCallback<Status> resultCallback) {
            this.f56945a = resultCallback;
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public Status onComplete(SignOutResp signOutResp) {
            Status status = new Status(0);
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "signOut onComplete", true);
            return status;
        }
    }

    public static class SignOutOnCompleteListener implements OooO0OO<Void> {

        /* JADX INFO: renamed from: a */
        private final SignOutNoConnectPendingResult f56946a;

        public SignOutOnCompleteListener(SignOutNoConnectPendingResult signOutNoConnectPendingResult) {
            this.f56946a = signOutNoConnectPendingResult;
        }

        @Override // o0O00OOO.OooO0OO
        public void onComplete(OooO0o<Void> oooO0o) {
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "SignOutOnCompleteListener onComplete", true);
            if (this.f56946a == null) {
                C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "signOutResultPendingResult is null", true);
                return;
            }
            Status status = Status.FAILURE;
            if (oooO0o.OooO()) {
                status = Status.SUCCESS;
            } else {
                Exception excOooO0o = oooO0o.OooO0o();
                if (excOooO0o == null || !(excOooO0o instanceof ApiException)) {
                    C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "wrong exception while failed", true);
                } else {
                    status = new Status(((ApiException) excOooO0o).getStatusCode());
                }
            }
            ResultCallback callback = this.f56946a.getCallback();
            if (callback != null) {
                callback.onResult(status);
            } else {
                C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "set Result callback after signOut completed", true);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl$a */
    public class C18480a implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private C18480a() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) == null || value.getStatusCode() != 0) {
                return;
            }
            C18053as.m77658a("HuaweiIdAuthAPIServiceImpl", "get notice has intent.", true);
            Activity validActivity = Util.getValidActivity((Activity) HuaweiIdAuthAPIServiceImpl.this.f56940b.get(), HuaweiIdAuthAPIServiceImpl.this.f56939a.getTopActivity());
            if (validActivity == null) {
                C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "showNotice no valid activity!", true);
                return;
            }
            try {
                validActivity.startActivity(noticeIntent);
            } catch (Exception e) {
                C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "startActivity exception".concat(e.getClass().getSimpleName()), true);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl$b */
    public static class C18481b extends PendingResultImpl<AddressResult, QueryShippingAddressResp> {
        public C18481b(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AddressResult onComplete(QueryShippingAddressResp queryShippingAddressResp) {
            Bundle extras;
            if (queryShippingAddressResp == null) {
                C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "queryShippingAddressResp is invalid.", true);
                return new AddressResult(new Status(2005));
            }
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "QueryShippingAddress.ResultCode:" + queryShippingAddressResp.getRetCode(), true);
            int retCode = queryShippingAddressResp.getRetCode();
            AddressResult addressResult = new AddressResult();
            addressResult.setStatus(queryShippingAddressResp.getCommonStatus());
            ArrayList<ShippingAddressInfo> shippingAddressInfoList = null;
            if (retCode == 0) {
                Intent data = queryShippingAddressResp.getData();
                if (data == null || (extras = data.getExtras()) == null) {
                    C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "data or bundle is null", true);
                } else {
                    extras.setClassLoader(getClass().getClassLoader());
                    ShippingAddressParcelable shippingAddressParcelable = (ShippingAddressParcelable) extras.getParcelable(CommonConstant.RETKEY.SHIPPING_ADDRESS);
                    if (shippingAddressParcelable != null) {
                        shippingAddressInfoList = shippingAddressParcelable.getShippingAddressInfoList();
                    } else {
                        C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "shippingAddressParcelable is null", true);
                    }
                }
            } else {
                C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "retCode is not ok", true);
            }
            addressResult.setShippingAddressInfoList(shippingAddressInfoList);
            return addressResult;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl$c */
    public static class C18482c extends PendingResultImpl<Status, RevokeAccessResp> {
        public C18482c(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status onComplete(RevokeAccessResp revokeAccessResp) {
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "RevokeAccessPendingResult onComplete", true);
            return new Status(revokeAccessResp.getRetCode());
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl$d */
    public static class C18483d extends PendingResultImpl<Status, SignOutResp> {
        public C18483d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status onComplete(SignOutResp signOutResp) {
            Status status = new Status(0);
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "signOut onComplete", true);
            return status;
        }
    }

    /* JADX INFO: renamed from: c */
    private int m80134c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "parse homeZone error.", true);
            return 0;
        }
    }

    public static int conversionGender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int conversionHomeZone(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static HashSet<Scope> conversionScopes(String str) {
        HashSet<Scope> hashSet = new HashSet<>();
        if (str != null) {
            for (String str2 : str.split(" ")) {
                hashSet.add(new Scope(str2));
            }
        }
        return hashSet;
    }

    public static int conversionStatus(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private PendingResult<Status> m80136d(HuaweiApiClient huaweiApiClient) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter signOutNoConnected", true);
        OooO0o<Void> oooO0oSignOut = HuaweiIdAuthManager.getService(huaweiApiClient.getContext(), getSignInOption(huaweiApiClient)).signOut();
        SignOutNoConnectPendingResult signOutNoConnectPendingResult = new SignOutNoConnectPendingResult(huaweiApiClient, CommonNaming.signout, new SignOutReq());
        oooO0oSignOut.OooO00o(new SignOutOnCompleteListener(signOutNoConnectPendingResult));
        return signOutNoConnectPendingResult;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public PendingResult<Status> cancelAuthorization(HuaweiApiClient huaweiApiClient) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter cancelAuthorization", true);
        this.f56939a = huaweiApiClient;
        return new C18482c(huaweiApiClient, CommonNaming.revokeAccess, m80135c(huaweiApiClient));
    }

    public HuaweiIdAuthResult getHuaweiIdSignInResultFromIntent(Intent intent) {
        Status status;
        Bundle extras;
        HuaweiIdAuthResult huaweiIdAuthResult = new HuaweiIdAuthResult();
        if (intent == null || (extras = intent.getExtras()) == null) {
            status = new Status(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR);
            C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "getSignInResult error", true);
        } else {
            int i = extras.getInt(CommonConstant.RETKEY.RETCODE, 0);
            status = new Status(i);
            if (i == 0) {
                huaweiIdAuthResult.setAuthHuaweiId(m80127a(extras));
                C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "getSignInResult success", true);
            } else {
                C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "getSignInResult fail", true);
            }
        }
        huaweiIdAuthResult.setStatus(status);
        return huaweiIdAuthResult;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public SignInResult getHwIdSignInResultFromIntent(Intent intent) {
        Bundle extras;
        PendingIntent activity;
        if (intent == null || (extras = intent.getExtras()) == null) {
            SignInResult signInResult = new SignInResult(new Status(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR));
            C18053as.m77661d("HuaweiIdAuthAPIServiceImpl", "getSignInResult error", true);
            return signInResult;
        }
        int i = extras.getInt(CommonConstant.RETKEY.RETCODE, 0);
        if (i != 0) {
            if (i == 2002 || i == 2004) {
                Random random = new Random();
                C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "SDK version >= 23", true);
                activity = PendingIntent.getActivity(this.f56939a.getContext(), random.nextInt(), intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                activity = null;
            }
            Status status = new Status(i, (String) null, activity);
            SignInResult signInResult2 = new SignInResult(status);
            signInResult2.setStatus(status);
            signInResult2.setData(intent);
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "getSignInResult fail", true);
            return signInResult2;
        }
        String string = extras.getString(CommonConstant.RETKEY.GENDER);
        String string2 = extras.getString(CommonConstant.RETKEY.USERID, "");
        String string3 = extras.getString(CommonConstant.RETKEY.STATUS);
        String string4 = extras.getString(CommonConstant.RETKEY.SCOPE);
        String string5 = extras.getString(CommonConstant.RETKEY.ID_TOKEN);
        String string6 = extras.getString(CommonConstant.RETKEY.EMAIL);
        String string7 = extras.getString(CommonConstant.RETKEY.FAMILY_NAME);
        String string8 = extras.getString(CommonConstant.RETKEY.GIVEN_NAME);
        String string9 = extras.getString(CommonConstant.RETKEY.AGE_RANGE);
        String string10 = extras.getString(CommonConstant.RETKEY.HOME_ZONE);
        AuthHuaweiId authHuaweiIdBuild = AuthHuaweiId.build(extras.getString(CommonConstant.RETKEY.OPENID, ""), string2, extras.getString(CommonConstant.RETKEY.DISPLAYNAME, ""), extras.getString(CommonConstant.RETKEY.PHOTOURL), extras.getString(CommonConstant.RETKEY.ACCESS_TOKEN, ""), extras.getString(CommonConstant.RETKEY.SERVICECOUNTRYCODE, ""), conversionStatus(string3), conversionGender(string), conversionScopes(string4), extras.getString(CommonConstant.RETKEY.SERVICEAUTHCODE, ""), extras.getString(CommonConstant.RETKEY.UNIONID, ""), extras.getString(CommonConstant.RETKEY.COUNTRYCODE, ""));
        authHuaweiIdBuild.setIdToken(string5);
        authHuaweiIdBuild.setEmail(string6);
        authHuaweiIdBuild.setFamilyName(string7);
        authHuaweiIdBuild.setGivenName(string8);
        authHuaweiIdBuild.setAgeRange(string9);
        authHuaweiIdBuild.setHomeZone(conversionHomeZone(string10));
        Status status2 = new Status(i);
        SignInResult signInResult3 = new SignInResult(status2);
        signInResult3.setStatus(status2);
        signInResult3.setAuthHuaweiId(authHuaweiIdBuild);
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "getSignInResult success", true);
        return signInResult3;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public Intent getSignInIntent(HuaweiApiClient huaweiApiClient) {
        Context context = huaweiApiClient.getContext();
        HuaweiIdAuthParams signInOption = getSignInOption(huaweiApiClient);
        if (signInOption == null) {
            return null;
        }
        return C18077x.m77710a(context, signInOption, huaweiApiClient.getSubAppInfo() != null ? huaweiApiClient.getSubAppInfo().getSubAppID() : null);
    }

    public HuaweiIdAuthParams getSignInOption(HuaweiApiClient huaweiApiClient) {
        Api.ApiOptions apiOptions;
        Map<Api<?>, Api.ApiOptions> apiMap = huaweiApiClient.getApiMap();
        if (apiMap == null || (apiOptions = apiMap.get(HuaweiIdAuthAPIManager.HUAWEI_OAUTH_API)) == null || !(apiOptions instanceof HuaweiIdAuthParams)) {
            return null;
        }
        return (HuaweiIdAuthParams) apiOptions;
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public HuaweiIdAuthResult parseHuaweiIdFromIntent(Intent intent) {
        return C18077x.m77712a(intent);
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public PendingResult<AddressResult> queryShippingAddress(HuaweiApiClient huaweiApiClient, AuthHuaweiId authHuaweiId) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter queryShippingAddress", true);
        return new C18481b(huaweiApiClient, CommonNaming.queryShippingAddress, new QueryShippingAddressReq(authHuaweiId));
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public PendingResult<SignInResult> signIn(Activity activity, HuaweiApiClient huaweiApiClient) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter signIn", true);
        Checker.checkNonNull(activity, "Activity must not be null.");
        Checker.checkNonNull(huaweiApiClient, "HuaweiApiClient must not be null.");
        List<Scope> listM80128a = m80128a(huaweiApiClient);
        List<PermissionInfo> listM80133b = m80133b(huaweiApiClient);
        HashSet hashSet = new HashSet();
        Iterator<Scope> it = listM80128a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getScopeUri());
        }
        HashSet hashSet2 = new HashSet();
        Iterator<PermissionInfo> it2 = listM80133b.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().getPermission());
        }
        SignInReq signInReq = new SignInReq(hashSet, hashSet2);
        this.f56939a = huaweiApiClient;
        this.f56940b = new WeakReference<>(activity);
        return new PendingResultImpl<SignInResult, SignInResp>(huaweiApiClient, CommonNaming.signin, signInReq) { // from class: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl.1
            @Override // com.huawei.hms.support.api.PendingResultImpl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SignInResult onComplete(SignInResp signInResp) {
                C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "signIn onComplete:" + signInResp.getRetCode(), true);
                HuaweiIdAuthAPIServiceImpl.this.m80129a(signInResp.getRetCode());
                Intent data = signInResp.getData();
                data.putExtra(CommonConstant.RETKEY.RETCODE, signInResp.getRetCode());
                return HuaweiIdAuthAPIServiceImpl.this.getHwIdSignInResultFromIntent(data);
            }
        };
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public PendingResult<SignInResult> signInBackend(HuaweiApiClient huaweiApiClient) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter signInBackend", true);
        Checker.checkNonNull(huaweiApiClient, "HuaweiApiClient must not be null.");
        this.f56939a = huaweiApiClient;
        List<Scope> listM80128a = m80128a(huaweiApiClient);
        List<PermissionInfo> listM80133b = m80133b(huaweiApiClient);
        HashSet hashSet = new HashSet();
        Iterator<Scope> it = listM80128a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getScopeUri());
        }
        HashSet hashSet2 = new HashSet();
        Iterator<PermissionInfo> it2 = listM80133b.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().getPermission());
        }
        return new PendingResultImpl<SignInResult, SignInResp>(huaweiApiClient, CommonNaming.singinbackend, new SignInReq(hashSet, hashSet2)) { // from class: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl.2
            @Override // com.huawei.hms.support.api.PendingResultImpl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SignInResult onComplete(SignInResp signInResp) {
                C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "signInBackend onComplete:" + signInResp.getRetCode(), true);
                Intent data = signInResp.getData();
                data.putExtra(CommonConstant.RETKEY.RETCODE, signInResp.getRetCode());
                return HuaweiIdAuthAPIServiceImpl.this.getHwIdSignInResultFromIntent(data);
            }
        };
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public PendingResult<Status> signOut(HuaweiApiClient huaweiApiClient) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter signOut", true);
        return !huaweiApiClient.isConnected() ? m80136d(huaweiApiClient) : new C18483d(huaweiApiClient, CommonNaming.signout, new SignOutReq());
    }

    @Override // com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService
    public OptionalPendingResult<HuaweiIdAuthResult> silentSignIn(HuaweiApiClient huaweiApiClient) {
        C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "Enter silentSignIn", true);
        Checker.checkNonNull(huaweiApiClient, "HuaweiApiClient must not be null.");
        this.f56939a = huaweiApiClient;
        return new OptionalPendingResultImpl(new PendingResultImpl<HuaweiIdAuthResult, SignInResp>(huaweiApiClient, CommonNaming.singinbackend, m80135c(huaweiApiClient)) { // from class: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl.3
            @Override // com.huawei.hms.support.api.PendingResultImpl
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HuaweiIdAuthResult onComplete(SignInResp signInResp) {
                C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "signInBackend onComplete:" + signInResp.getRetCode(), true);
                Intent data = signInResp.getData();
                data.putExtra(CommonConstant.RETKEY.RETCODE, signInResp.getRetCode());
                return HuaweiIdAuthAPIServiceImpl.this.getHuaweiIdSignInResultFromIntent(data);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static List<PermissionInfo> m80133b(HuaweiApiClient huaweiApiClient) {
        return ((HuaweiApiClientImpl) huaweiApiClient).getPermissionInfos();
    }

    /* JADX INFO: renamed from: a */
    public static List<Scope> m80128a(HuaweiApiClient huaweiApiClient) {
        return ((HuaweiApiClientImpl) huaweiApiClient).getScopes();
    }

    /* JADX INFO: renamed from: b */
    private int m80131b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    private AuthHuaweiId m80127a(Bundle bundle) {
        if (bundle == null) {
            C18053as.m77659b("HuaweiIdAuthAPIServiceImpl", "bd is null", true);
            return new AuthHuaweiId();
        }
        String string = bundle.getString(CommonConstant.RETKEY.ACCESS_TOKEN, "");
        String string2 = bundle.getString(CommonConstant.RETKEY.SERVICEAUTHCODE, "");
        String string3 = bundle.getString(CommonConstant.RETKEY.DISPLAYNAME, "");
        String string4 = bundle.getString(CommonConstant.RETKEY.USERID, "");
        String string5 = bundle.getString(CommonConstant.RETKEY.OPENID, "");
        String string6 = bundle.getString(CommonConstant.RETKEY.PHOTOURL);
        String string7 = bundle.getString(CommonConstant.RETKEY.SERVICECOUNTRYCODE, "");
        String string8 = bundle.getString(CommonConstant.RETKEY.COUNTRYCODE, "");
        String string9 = bundle.getString(CommonConstant.RETKEY.UNIONID, "");
        int iM80125a = m80125a(bundle.getString(CommonConstant.RETKEY.GENDER));
        int iM80131b = m80131b(bundle.getString(CommonConstant.RETKEY.STATUS));
        int iM80134c = m80134c(bundle.getString(CommonConstant.RETKEY.HOME_ZONE));
        String string10 = bundle.getString(CommonConstant.RETKEY.SCOPE);
        HashSet hashSet = new HashSet();
        if (string10 != null) {
            String[] strArrSplit = string10.split(" ");
            int i = 0;
            for (int length = strArrSplit.length; i < length; length = length) {
                int i2 = i;
                hashSet.add(new Scope(strArrSplit[i2]));
                i = i2 + 1;
            }
        }
        AuthHuaweiId authHuaweiIdBuild = AuthHuaweiId.build(string5, string4, string3, string6, string, string7, iM80131b, iM80125a, hashSet, string2, string9, string8);
        authHuaweiIdBuild.setIdToken(bundle.getString(CommonConstant.RETKEY.ID_TOKEN));
        authHuaweiIdBuild.setEmail(bundle.getString(CommonConstant.RETKEY.EMAIL));
        authHuaweiIdBuild.setFamilyName(bundle.getString(CommonConstant.RETKEY.FAMILY_NAME));
        authHuaweiIdBuild.setGivenName(bundle.getString(CommonConstant.RETKEY.GIVEN_NAME));
        authHuaweiIdBuild.setAgeRange(bundle.getString(CommonConstant.RETKEY.AGE_RANGE));
        authHuaweiIdBuild.setHomeZone(iM80134c);
        return authHuaweiIdBuild;
    }

    /* JADX INFO: renamed from: c */
    private SignInReq m80135c(HuaweiApiClient huaweiApiClient) {
        List<Scope> listM80128a = m80128a(huaweiApiClient);
        List<PermissionInfo> listM80133b = m80133b(huaweiApiClient);
        HashSet hashSet = new HashSet();
        Iterator<Scope> it = listM80128a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getScopeUri());
        }
        HashSet hashSet2 = new HashSet();
        Iterator<PermissionInfo> it2 = listM80133b.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().getPermission());
        }
        return new SignInReq(hashSet, hashSet2);
    }

    /* JADX INFO: renamed from: a */
    private int m80125a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "-1";
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m80129a(int i) {
        if (i == 0 && HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f56939a.getContext()) == 0) {
            new Timer().schedule(new TimerTask() { // from class: com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIServiceImpl.4
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ConnectService.getNotice(HuaweiIdAuthAPIServiceImpl.this.f56939a, 1, "6.4.0.302").setResultCallback(new C18480a());
                }
            }, 200L);
        }
    }
}
