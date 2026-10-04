package com.huawei.hms.hwid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.account.internal.p573ui.activity.AccountSignInHubActivity;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.request.AccountAuthParamsHelper;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.account.result.AuthAccount;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.utils.Util;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.hwid.f */
/* JADX INFO: loaded from: classes8.dex */
public final class C18058f {
    /* JADX INFO: renamed from: a */
    public static Intent m77666a(Context context, AccountAuthParams accountAuthParams, String str) {
        C18053as.m77659b("[AccountSDK]AccountAuthUtil", "getSignInIntent", true);
        return m77667a(context, accountAuthParams, str, 0, "");
    }

    /* JADX INFO: renamed from: b */
    public static AuthAccount m77674b() {
        return C18059g.m77675a().m77678b();
    }

    /* JADX INFO: renamed from: a */
    public static Intent m77668a(Context context, AccountAuthParams accountAuthParams, String str, String str2) {
        C18053as.m77659b("[AccountSDK]AccountAuthUtil", "getIndependentSignInIntent", true);
        return m77667a(context, accountAuthParams, str, 1, str2);
    }

    /* JADX INFO: renamed from: a */
    private static Intent m77667a(Context context, AccountAuthParams accountAuthParams, String str, int i, String str2) {
        String str3;
        JSONObject jSONObject;
        if (i == 1) {
            str3 = "com.huawei.hms.account.picker.signIn";
        } else {
            str3 = "com.huawei.hms.account.signIn";
        }
        Intent intent = new Intent(str3);
        intent.setPackage(context.getPackageName());
        intent.setClass(context, AccountSignInHubActivity.class);
        if (i == 1) {
            intent.putExtra("ACCESS_TOKEN", str2);
            intent.putExtra("INDEPENDENT_SIGN_IN_FLAG", i);
            try {
                String signInParams = accountAuthParams.getSignInParams();
                if (TextUtils.isEmpty(signInParams)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(signInParams);
                }
                jSONObject.put("ACCESS_TOKEN", str2);
                jSONObject.put("INDEPENDENT_SIGN_IN_FLAG", i);
                accountAuthParams.setSignInParams(jSONObject.toString());
            } catch (JSONException e) {
                C18053as.m77661d("[AccountSDK]AccountAuthUtil", "JSONException:".concat(e.getClass().getSimpleName()), true);
            }
        }
        String appId = Util.getAppId(context);
        String packageName = context.getPackageName();
        C18054b c18054b = new C18054b();
        c18054b.m77632b(appId);
        c18054b.m77634c(packageName);
        c18054b.m77630a(60400302L);
        c18054b.m77636d(str);
        AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
        accountSignInRequest.setAccountAuthParams(accountAuthParams);
        try {
            intent.putExtra("HUAWEIID_CP_CLIENTINFO", c18054b.m77635d());
            intent.putExtra("HUAWEIID_SIGNIN_REQUEST", accountSignInRequest.toJson());
        } catch (JSONException unused) {
            C18053as.m77661d("[AccountSDK]AccountAuthUtil", "JSONException", true);
        }
        return intent;
    }

    /* JADX INFO: renamed from: a */
    public static AccountAuthResult m77670a(Intent intent) {
        C18053as.m77659b("[AccountSDK]AccountAuthUtil", "getSignInResultFromIntent", true);
        if (intent == null || !intent.hasExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) {
            C18053as.m77661d("[AccountSDK]AccountAuthUtil", "data or signInResult is null", true);
            return null;
        }
        try {
            return new AccountAuthResult().fromJson(intent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID));
        } catch (JSONException unused) {
            C18053as.m77661d("[AccountSDK]AccountAuthUtil", "JSONException", true);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77671a() {
        C18059g.m77675a().m77679c();
    }

    /* JADX INFO: renamed from: a */
    public static AccountAuthParams m77669a(List<Scope> list) {
        AccountAuthParamsHelper accountAuthParamsHelper = new AccountAuthParamsHelper();
        if (C18050ap.m77650b(list).booleanValue()) {
            accountAuthParamsHelper.setScopeList(list);
        }
        return accountAuthParamsHelper.createParams();
    }

    /* JADX INFO: renamed from: a */
    public static void m77673a(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C18053as.m77659b("[AccountSDK]AccountAuthUtil", "android version is Higher than 9.0", true);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(5894);
            return;
        }
        C18053as.m77659b("[AccountSDK]AccountAuthUtil", "android version is Below 9.0", true);
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 4096);
        } catch (RuntimeException e) {
            C18053as.m77661d("[AccountSDK]AccountAuthUtil", "Adapt to the digging screen occur RuntimeException".concat(e.getClass().getSimpleName()), true);
        } catch (Exception e2) {
            C18053as.m77661d("[AccountSDK]AccountAuthUtil", "Adapt to the digging screen occur exception".concat(e2.getClass().getSimpleName()), true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m77672a(Activity activity) {
        try {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            activity.getWindow().addFlags(Integer.MIN_VALUE);
            activity.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility | 1024);
            int i = Build.VERSION.SDK_INT;
            activity.getWindow().setStatusBarColor(0);
            activity.getWindow().setNavigationBarColor(0);
            if (i >= 29) {
                activity.getWindow().setNavigationBarContrastEnforced(false);
            }
        } catch (Exception e) {
            C18053as.m77661d("[AccountSDK]AccountAuthUtil", "exception occured:".concat(e.getClass().getSimpleName()), true);
        }
    }
}
