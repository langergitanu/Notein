package com.huawei.hms.account.internal.p573ui.activity;

import Oooo0.C20855OooooOO;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.hwid.C18034a;
import com.huawei.hms.hwid.C18049ao;
import com.huawei.hms.hwid.C18050ap;
import com.huawei.hms.hwid.C18052ar;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.hwid.C18054b;
import com.huawei.hms.hwid.C18058f;
import com.huawei.hms.hwid.C18059g;
import com.huawei.hms.p588ui.SafeIntent;
import com.huawei.hms.support.account.request.AccountAuthParams;
import com.huawei.hms.support.account.result.AccountAuthResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.account.AccountSignInRequest;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.utils.HMSPackageManager;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AccountSignInHubActivity extends Activity {

    /* JADX INFO: renamed from: e */
    private C18054b f52365e;

    /* JADX INFO: renamed from: f */
    private int f52366f;

    /* JADX INFO: renamed from: a */
    private String f52361a = null;

    /* JADX INFO: renamed from: b */
    private boolean f52362b = false;

    /* JADX INFO: renamed from: c */
    private AccountSignInRequest f52363c = null;

    /* JADX INFO: renamed from: d */
    private AccountAuthResult f52364d = null;

    /* JADX INFO: renamed from: g */
    private String f52367g = CommonNaming.signinIntent;

    /* JADX INFO: renamed from: b */
    private void m75724b() {
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "checkMinVersion start.", true);
        C18034a.m77607a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.account.internal.ui.activity.AccountSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                if (i == 0) {
                    C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "version check ok", true);
                    AccountSignInHubActivity.this.m75725c();
                } else {
                    C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "version check failed", true);
                    AccountSignInHubActivity.this.m75715a(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m75725c() {
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "startSignInActivity", true);
        try {
            startActivityForResult(m75726d(), this.f52366f == 1 ? 16588 : 16587);
        } catch (ActivityNotFoundException e) {
            this.f52362b = true;
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "Launch sign in Intent failed. hms is probably being updated：".concat(e.getClass().getSimpleName()), true);
            m75715a(17);
        }
    }

    /* JADX INFO: renamed from: d */
    private Intent m75726d() {
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        String stringExtra2 = intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST");
        String action = intent.getAction();
        try {
            C18054b c18054bM77662a = C18054b.m77662a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(60400300);
            if (c18054bM77662a.m77633c() != null) {
                kitSdkVersion.setSubAppId(c18054bM77662a.m77633c());
            }
            if (this.f52366f == 1) {
                C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 11", true);
                kitSdkVersion.setApiLevel(11);
            }
            if (m75727e().booleanValue()) {
                C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "setApiLevel is 13", true);
                kitSdkVersion.setApiLevel(13);
            }
            Intent intentBuild = kitSdkVersion.build();
            C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "current package name is " + getPackageName(), true);
            intentBuild.setPackage(getPackageName());
            return intentBuild;
        } catch (Exception e) {
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "getSignInIntent failed because:".concat(e.getClass().getSimpleName()), true);
            return new Intent();
        }
    }

    /* JADX INFO: renamed from: e */
    private Boolean m75727e() {
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "checkCarrierIdPermission begin", true);
        AccountAuthParams accountAuthParams = this.f52363c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return Boolean.FALSE;
        }
        List<PermissionInfo> permissionInfos = accountAuthParams.getPermissionInfos();
        if (C18050ap.m77650b(permissionInfos).booleanValue()) {
            Iterator<PermissionInfo> it = permissionInfos.iterator();
            while (it.hasNext()) {
                String permission = it.next().getPermission();
                if (permission != null && permission.equals(CommonConstant.LocalPermission.CARRIER_ID)) {
                    C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "permissioninfos contain carrierId", true);
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        C18054b c18054b;
        super.onActivityResult(i, i2, intent);
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", C20855OooooOO.OooO0OO(i, i2, "onActivityResult: requestCode：", " , resultCode："), true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.f52362b) {
            return;
        }
        if (i == 16587 || i == 16588) {
            int statusCode = 8;
            if (safeIntent == null || (stringExtra = intent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) == null) {
                m75715a(i2 > 0 ? i2 : 8);
                return;
            }
            try {
                this.f52364d = new AccountAuthResult().fromJson(stringExtra);
                if (i == 16587) {
                    C18059g.m77675a().m77677a(this.f52364d.getAccount(), this.f52363c.getAccountAuthParams());
                }
                statusCode = this.f52364d.getStatus().getStatusCode();
            } catch (JSONException unused) {
                this.f52364d = null;
                C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "onActivityResult: JsonException", true);
            }
            int i3 = statusCode;
            String str = this.f52361a;
            if (str != null && (c18054b = this.f52365e) != null) {
                HiAnalyticsClient.reportExit(this, this.f52367g, str, c18054b.m77629a(), C18052ar.m77657a(i3), i3, (int) this.f52365e.m77631b());
            }
            setResult(i2, safeIntent);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (m75722a(intent)) {
            m75716a(0, "invalid intent");
        }
        m75720a(intent.getBooleanExtra("intent.extra.isfullscreen", false));
        String action = intent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action) && !TextUtils.equals("com.huawei.hms.account.signIn", action) && !TextUtils.equals("com.huawei.hms.account.picker.signIn", action)) {
            m75716a(0, action != null ? OooO00o.OooO00o("unknow Action:", action) : "unknow Action:");
        }
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        try {
            this.f52363c = AccountSignInRequest.fromJson(intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST"));
        } catch (JSONException unused) {
            this.f52363c = null;
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            m75716a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.f52365e = C18054b.m77662a(stringExtra);
        } catch (JSONException unused2) {
            this.f52365e = null;
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "onCreate: JsonException", true);
        }
        if (this.f52363c == null || this.f52365e == null) {
            m75716a(0, "Activity started with invalid sign in request info");
            return;
        }
        if (!m75721a()) {
            m75715a(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR);
            return;
        }
        int intExtra = intent.getIntExtra("INDEPENDENT_SIGN_IN_FLAG", 0);
        this.f52366f = intExtra;
        if (intExtra != 1 || m75723b(intent).booleanValue()) {
            C18049ao.m77645a(this);
            if (bundle != null) {
                restoreInstanceState(bundle);
            } else {
                this.f52361a = HiAnalyticsClient.reportEntry(this, this.f52367g, 60400300);
                m75724b();
            }
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "onSaveInstanceState start", true);
        String str = this.f52361a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f52361a = bundle.getString("HiAnalyticsTransId");
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m75721a() {
        AccountAuthParams accountAuthParams = this.f52363c.getAccountAuthParams();
        if (accountAuthParams == null) {
            return false;
        }
        try {
            int iOptInt = new JSONObject(accountAuthParams.getSignInParams()).optInt(CommonConstant.RequestParams.KEY_ID_TOKEN_SIGN_ALG, 2);
            return iOptInt == 1 || iOptInt == 2;
        } catch (JSONException e) {
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "JSONException:".concat(e.getClass().getSimpleName()), true);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private Boolean m75723b(Intent intent) {
        String stringExtra = intent.getStringExtra("ACCESS_TOKEN");
        AccountAuthParams accountAuthParams = this.f52363c.getAccountAuthParams();
        if (accountAuthParams == null) {
            m75719a("accountAuthParams is null");
            return Boolean.FALSE;
        }
        List<Scope> requestScopeList = accountAuthParams.getRequestScopeList();
        if (!TextUtils.isEmpty(stringExtra) && !C18050ap.m77649a(requestScopeList).booleanValue() && requestScopeList.size() == 1) {
            this.f52367g = CommonNaming.independentsigninIntent;
            return Boolean.TRUE;
        }
        m75719a("independent sign in params error");
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: a */
    private boolean m75722a(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getStringExtra("ANYTHING");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m75716a(int i, String str) {
        C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "errMessage is: " + str, true);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m75715a(int i) {
        int i2;
        C18054b c18054b;
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "onSignInAccountFailed: retCode：" + i, true);
        String str = this.f52361a;
        if (str == null || (c18054b = this.f52365e) == null) {
            i2 = i;
        } else {
            i2 = i;
            HiAnalyticsClient.reportExit(this, this.f52367g, str, c18054b.m77629a(), C18052ar.m77657a(i), i2, (int) this.f52365e.m77631b());
        }
        Status status = new Status(i2);
        AccountAuthResult accountAuthResult = new AccountAuthResult();
        accountAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, accountAuthResult.toJson());
        } catch (JSONException unused) {
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    /* JADX INFO: renamed from: a */
    private void m75719a(String str) {
        C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "onIndependentSignInFailed errMessage:" + str, true);
        Status status = new Status(CommonConstant.RETCODE.SIGN_IN_PARAMS_ERROR, str);
        AccountAuthResult accountAuthResult = new AccountAuthResult();
        accountAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, accountAuthResult.toJson());
        } catch (JSONException unused) {
            C18053as.m77661d("[ACCOUNTSDK]AccountSignInHubActivity", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    /* JADX INFO: renamed from: a */
    private void m75720a(boolean z) {
        C18053as.m77659b("[ACCOUNTSDK]AccountSignInHubActivity", "isActivityFullScreen is :" + z, true);
        if (z) {
            C18058f.m77673a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            C18058f.m77672a(this);
        }
    }
}
