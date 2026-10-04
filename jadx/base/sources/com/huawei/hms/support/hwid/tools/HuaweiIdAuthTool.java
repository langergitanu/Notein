package com.huawei.hms.support.hwid.tools;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hwid.C18035aa;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.hwid.C18071r;
import com.huawei.hms.hwid.C18073t;
import com.huawei.hms.hwid.C18077x;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.common.HuaweiIdAuthException;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthServiceImpl;
import com.huawei.hms.utils.HMSPackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o0O00OOO.InterfaceC25832OooO0Oo;
import o0O00OOO.InterfaceC25833OooO0o0;
import o0O00OOO.OooO0o;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class HuaweiIdAuthTool {
    protected static final String TAG = "[HUAWEIIDSDK]HuaweiIdAuthTool";

    /* JADX INFO: renamed from: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool$a */
    public static class C18488a {

        /* JADX INFO: renamed from: a */
        private int f56957a;

        private C18488a() {
        }

        /* JADX INFO: renamed from: a */
        public void m80154a(int i) {
            this.f56957a = i;
        }

        /* JADX INFO: renamed from: a */
        public int m80153a() {
            return this.f56957a;
        }
    }

    private HuaweiIdAuthTool() {
    }

    /* JADX INFO: renamed from: a */
    private static void m80149a(final OooO0o<Void> oooO0o) throws HuaweiIdAuthException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C18488a c18488a = new C18488a();
        oooO0o.OooO0o0(new InterfaceC25833OooO0o0<Void>() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.2
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r3) {
                C18053as.m77659b(HuaweiIdAuthTool.TAG, "deleteAuthInfo Success.", true);
                countDownLatch.countDown();
                c18488a.m80154a(0);
            }
        }).OooO0OO(new InterfaceC25832OooO0Oo() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.1
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                int statusCode = ((ApiException) oooO0o.OooO0o()).getStatusCode();
                C18053as.m77659b(HuaweiIdAuthTool.TAG, "deleteAuthInfo fail: " + statusCode, true);
                countDownLatch.countDown();
                c18488a.m80154a(statusCode);
            }
        });
        try {
            if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                throw new HuaweiIdAuthException("connection timeout[907135004 ].");
            }
        } catch (InterruptedException unused) {
            c18488a.m80154a(8);
        }
        if (c18488a.m80153a() != 0) {
            if (c18488a.m80153a() == 8) {
                throw new HuaweiIdAuthException("unknown interruption[8].");
            }
            if (c18488a.m80153a() == 2010) {
                C18053as.m77660c(TAG, "invalid arguments[907135000].", true);
            }
        }
        C18053as.m77659b(TAG, "deleteAuthInfo return[success]", true);
    }

    /* JADX INFO: renamed from: b */
    private static Account m80150b(Context context, String str) throws HuaweiIdAuthException {
        if (context == null) {
            C18053as.m77659b(TAG, "context is null", true);
            throw new HuaweiIdAuthException("context is null");
        }
        String hMSPackageName = HMSPackageManager.getInstance(context).getHMSPackageName();
        C18053as.m77659b(TAG, "get package name of hms is " + hMSPackageName, true);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new Account(str, hMSPackageName);
    }

    public static void deleteAuthInfo(Context context, String str) throws HuaweiIdAuthException {
        m80148a(context, str);
    }

    @Deprecated
    public static String requestAccessToken(Context context, String str, List<Scope> list, Bundle bundle) throws HuaweiIdAuthException {
        return requestAccessToken(context, m80150b(context, str), list, bundle);
    }

    public static String requestUnionId(Context context, String str) throws HuaweiIdAuthException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Scope("openid"));
        return m80144a(context, m80150b(context, str), arrayList, new Bundle(), "requestUnionId").m77643c();
    }

    public static void deleteAuthInfo(Activity activity, String str) throws HuaweiIdAuthException {
        m80148a(activity, str);
    }

    @Deprecated
    public static String requestAccessToken(Activity activity, String str, List<Scope> list, Bundle bundle) throws HuaweiIdAuthException {
        return requestAccessToken(activity, m80150b(activity, str), list, bundle);
    }

    @Deprecated
    public static String requestAccessToken(Context context, String str, List<Scope> list) throws HuaweiIdAuthException {
        return requestAccessToken(context, m80150b(context, str), list, new Bundle());
    }

    @Deprecated
    public static String requestAccessToken(Activity activity, String str, List<Scope> list) throws HuaweiIdAuthException {
        return requestAccessToken(activity, m80150b(activity, str), list, new Bundle());
    }

    public static String requestAccessToken(Context context, Account account, List<Scope> list) throws HuaweiIdAuthException {
        return requestAccessToken(context, account, list, new Bundle());
    }

    public static String requestUnionId(Activity activity, String str) throws HuaweiIdAuthException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Scope("openid"));
        return m80144a(activity, m80150b(activity, str), arrayList, new Bundle(), "requestUnionId").m77643c();
    }

    public static String requestAccessToken(Activity activity, Account account, List<Scope> list) throws HuaweiIdAuthException {
        return requestAccessToken(activity, account, list, new Bundle());
    }

    public static String requestAccessToken(Context context, Account account, List<Scope> list, Bundle bundle) throws HuaweiIdAuthException {
        return m80144a(context, account, list, bundle, "requestAccessToken").m77641b();
    }

    public static String requestAccessToken(Activity activity, Account account, List<Scope> list, Bundle bundle) throws HuaweiIdAuthException {
        return m80144a(activity, account, list, bundle, "requestAccessToken").m77641b();
    }

    /* JADX INFO: renamed from: a */
    private static void m80148a(Context context, String str) throws HuaweiIdAuthException {
        boolean z;
        C18071r.m77704a();
        C18077x.m77713a();
        if (context != null) {
            if (context instanceof Activity) {
                z = true;
            } else {
                m80146a(context);
                z = false;
            }
            if (TextUtils.isEmpty(str)) {
                C18053as.m77659b(TAG, "accessToken is null or empty.", true);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(CommonConstant.KEY_ACCESS_TOKEN, str);
                HuaweiIdAuthServiceImpl huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl(context, (HuaweiIdAuthParams) null, 60400300);
                if (z) {
                    huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl((Activity) context, (HuaweiIdAuthParams) null, 60400300);
                }
                m80149a((OooO0o<Void>) huaweiIdAuthServiceImpl.doWrite(new C18035aa(CommonNaming.signout, jSONObject.toString(), HiAnalyticsClient.reportEntry(context, CommonNaming.signout, 60400300))));
                return;
            } catch (JSONException unused) {
                throw new HuaweiIdAuthException("json error.");
            }
        }
        throw new HuaweiIdAuthException("Context or Activity is null.");
    }

    /* JADX INFO: renamed from: a */
    private static C18073t m80144a(Context context, Account account, List<Scope> list, Bundle bundle, String str) throws HuaweiIdAuthException {
        boolean z;
        HuaweiIdAuthServiceImpl huaweiIdAuthServiceImpl;
        C18071r.m77704a();
        if (context != null) {
            if (context instanceof Activity) {
                z = true;
            } else {
                m80146a(context);
                z = false;
            }
            m80147a(context, account, list, bundle);
            HuaweiIdAuthParams huaweiIdAuthParamsCreateParams = new HuaweiIdAuthParamsHelper().setAccessToken().setScopeList(list).createParams();
            String str2 = account == null ? "" : account.name;
            if (z) {
                huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl((Activity) context, huaweiIdAuthParamsCreateParams, str2, 60400300);
            } else {
                huaweiIdAuthServiceImpl = new HuaweiIdAuthServiceImpl(context, huaweiIdAuthParamsCreateParams, str2, 60400300);
            }
            return m80145a(huaweiIdAuthServiceImpl, str);
        }
        throw new HuaweiIdAuthException("Context or Activity is null.");
    }

    /* JADX INFO: renamed from: a */
    private static void m80146a(Context context) throws HuaweiIdAuthException {
        int iIsHuaweiMobileServicesAvailable = new AvailableAdapter(40000300).isHuaweiMobileServicesAvailable(context);
        C18053as.m77659b(TAG, "checkDependentHMSVersion result is: " + iIsHuaweiMobileServicesAvailable, true);
        if (1 == iIsHuaweiMobileServicesAvailable) {
            throw new HuaweiIdAuthException("hms apk is not exist[2013]");
        }
        if (2 == iIsHuaweiMobileServicesAvailable) {
            throw new HuaweiIdAuthException("hms apk version is low[2013]");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m80147a(Context context, Account account, List<Scope> list, Bundle bundle) throws HuaweiIdAuthException {
        String hMSPackageName = HMSPackageManager.getInstance(context).getHMSPackageName();
        C18053as.m77659b(TAG, "get package name of hms is " + hMSPackageName, true);
        String str = (account == null || hMSPackageName.equals(account.type)) ? null : "Account type is not supported.";
        if (!TextUtils.isEmpty(str)) {
            throw new HuaweiIdAuthException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    private static C18073t m80145a(HuaweiIdAuthService huaweiIdAuthService, String str) throws HuaweiIdAuthException {
        C18053as.m77659b(TAG, "start countDownLatch innerSignIn:" + str, true);
        final C18073t c18073t = new C18073t();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        OooO0o<AuthHuaweiId> oooO0oSilentSignIn = huaweiIdAuthService.silentSignIn();
        oooO0oSilentSignIn.OooO0o0(new InterfaceC25833OooO0o0<AuthHuaweiId>() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.3
            @Override // o0O00OOO.InterfaceC25833OooO0o0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AuthHuaweiId authHuaweiId) {
                C18053as.m77659b(HuaweiIdAuthTool.TAG, "silentSignIn success", true);
                c18073t.m77639a(0);
                c18073t.m77640a(authHuaweiId.getAccessToken());
                c18073t.m77642b(authHuaweiId.getUnionId());
                countDownLatch.countDown();
            }
        });
        oooO0oSilentSignIn.OooO0OO(new InterfaceC25832OooO0Oo() { // from class: com.huawei.hms.support.hwid.tools.HuaweiIdAuthTool.4
            @Override // o0O00OOO.InterfaceC25832OooO0Oo
            public void onFailure(Exception exc) {
                C18053as.m77659b(HuaweiIdAuthTool.TAG, "silentSignIn fail", true);
                if (exc instanceof ApiException) {
                    c18073t.m77639a(((ApiException) exc).getStatusCode());
                }
                countDownLatch.countDown();
            }
        });
        boolean zAwait = false;
        try {
            zAwait = countDownLatch.await(10L, TimeUnit.SECONDS);
            if (!zAwait) {
                throw new HuaweiIdAuthException("connection timeout[907135004 ].");
            }
        } catch (InterruptedException unused) {
            C18053as.m77661d(TAG, "innerSignIn InterruptedException.", true);
            c18073t.m77639a(8);
        }
        C18053as.m77659b(TAG, str + " end countDownLatch awaitValue:" + zAwait, true);
        int iM77638a = c18073t.m77638a();
        if (iM77638a == 0) {
            return c18073t;
        }
        C18053as.m77661d(TAG, str + " fail, error code is:" + iM77638a, true);
        throw new HuaweiIdAuthException(str + " error[" + iM77638a + "]");
    }
}
