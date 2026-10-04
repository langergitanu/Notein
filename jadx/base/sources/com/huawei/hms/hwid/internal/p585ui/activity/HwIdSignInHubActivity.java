package com.huawei.hms.hwid.internal.p585ui.activity;

import Oooo0.C20855OooooOO;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.hwid.C18049ao;
import com.huawei.hms.hwid.C18052ar;
import com.huawei.hms.hwid.C18053as;
import com.huawei.hms.hwid.C18058f;
import com.huawei.hms.hwid.C18070q;
import com.huawei.hms.hwid.C18072s;
import com.huawei.hms.hwid.C18078y;
import com.huawei.hms.p588ui.SafeIntent;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.common.CommonNaming;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.hwid.result.HuaweiIdAuthResult;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthAPIService;
import com.huawei.hms.utils.HMSPackageManager;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class HwIdSignInHubActivity extends Activity {

    /* JADX INFO: renamed from: a */
    private String f53971a = null;

    /* JADX INFO: renamed from: b */
    private boolean f53972b = false;

    /* JADX INFO: renamed from: c */
    private HuaweiIdSignInRequest f53973c = null;

    /* JADX INFO: renamed from: d */
    private HuaweiIdAuthResult f53974d = null;

    /* JADX INFO: renamed from: e */
    private C18072s f53975e;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m77689b() {
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "startSignInActivity", true);
        try {
            startActivityForResult(m77690c(), 16587);
        } catch (ActivityNotFoundException e) {
            this.f53972b = true;
            C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", "Launch sign in Intent failed. hms is probably being updated：".concat(e.getClass().getSimpleName()), true);
            m77684a(17);
        }
    }

    /* JADX INFO: renamed from: c */
    private Intent m77690c() {
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "getJosSignInIntent", true);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        String stringExtra2 = intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST");
        String action = intent.getAction();
        try {
            C18072s c18072sM77706a = C18072s.m77706a(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setKitSdkVersion(60400300);
            if (c18072sM77706a.m77633c() != null) {
                kitSdkVersion.setSubAppId(c18072sM77706a.m77633c());
            }
            Intent intentBuild = kitSdkVersion.build();
            C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "get package name of hms is " + HMSPackageManager.getInstance(this).getHMSPackageName(), true);
            C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "Current package name is " + getPackageName(), true);
            intentBuild.setPackage(getPackageName());
            return intentBuild;
        } catch (Exception e) {
            C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", "getSignInIntent failed because:".concat(e.getClass().getSimpleName()), true);
            return new Intent();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        C18072s c18072s;
        super.onActivityResult(i, i2, intent);
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", C20855OooooOO.OooO0OO(i, i2, "onActivityResult: requestCode：", " , resultCode："), true);
        SafeIntent safeIntent = intent != null ? new SafeIntent(intent) : null;
        if (this.f53972b || i != 16587) {
            return;
        }
        int statusCode = 8;
        if (safeIntent == null || (stringExtra = intent.getStringExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID)) == null) {
            if (i2 <= 0) {
                i2 = 8;
            }
            m77684a(i2);
            return;
        }
        try {
            this.f53974d = new HuaweiIdAuthResult().fromJson(stringExtra);
            C18078y.m77716a().m77718a(this.f53974d.getHuaweiId(), this.f53973c.getHuaweiIdAuthParams());
            statusCode = this.f53974d.getStatus().getStatusCode();
        } catch (JSONException unused) {
            this.f53974d = null;
            C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", "onActivityResult: JsonException", true);
        }
        int i3 = statusCode;
        String str = this.f53971a;
        if (str != null && (c18072s = this.f53975e) != null) {
            HiAnalyticsClient.reportExit(this, CommonNaming.signinIntent, str, c18072s.m77629a(), C18052ar.m77657a(i3), i3, (int) this.f53975e.m77631b());
            C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + this.f53975e.m77631b(), true);
        }
        setResult(i2, safeIntent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (m77688a(intent)) {
            m77685a(0, "invalid intent");
        }
        boolean booleanExtra = intent.getBooleanExtra("intent.extra.isfullscreen", false);
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "isActivityFullScreen is :" + booleanExtra, true);
        if (booleanExtra) {
            C18058f.m77673a(getWindow());
            getWindow().setFlags(1024, 1024);
        } else {
            C18058f.m77672a(this);
        }
        String action = intent.getAction();
        if (!TextUtils.equals("com.huawei.hms.jos.signIn", action)) {
            m77685a(0, action != null ? OooO00o.OooO00o("unknow Action:", action) : "unknow Action:");
        }
        String stringExtra = intent.getStringExtra("HUAWEIID_CP_CLIENTINFO");
        try {
            this.f53973c = HuaweiIdSignInRequest.fromJson(intent.getStringExtra("HUAWEIID_SIGNIN_REQUEST"));
        } catch (JSONException unused) {
            this.f53973c = null;
            C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            m77685a(0, "Activity started with invalid cp client info");
            return;
        }
        try {
            this.f53975e = C18072s.m77706a(stringExtra);
        } catch (JSONException unused2) {
            this.f53975e = null;
            C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", "onCreate: JsonException", true);
        }
        if (this.f53973c == null || this.f53975e == null) {
            m77685a(0, "Activity started with invalid sign in request info");
            return;
        }
        C18049ao.m77645a(this);
        if (bundle != null) {
            restoreInstanceState(bundle);
        } else {
            this.f53971a = HiAnalyticsClient.reportEntry(this, CommonNaming.signinIntent, 60400300);
            m77683a();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.f53971a;
        if (str == null || bundle == null) {
            return;
        }
        bundle.putString("HiAnalyticsTransId", str);
    }

    public void restoreInstanceState(Bundle bundle) {
        if (bundle != null) {
            this.f53971a = bundle.getString("HiAnalyticsTransId");
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m77688a(Intent intent) {
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
    private void m77685a(int i, String str) {
        C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", str, true);
        setResult(0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77684a(int i) {
        int i2;
        C18072s c18072s;
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "onSignInAccountFailed: retCode：" + i, true);
        String str = this.f53971a;
        if (str == null || (c18072s = this.f53975e) == null) {
            i2 = i;
        } else {
            i2 = i;
            HiAnalyticsClient.reportExit(this, CommonNaming.signinIntent, str, c18072s.m77629a(), C18052ar.m77657a(i), i2, (int) this.f53975e.m77631b());
            C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "report: api=hwid.signinintentversion=" + this.f53975e.m77631b(), true);
        }
        Status status = new Status(i2);
        HuaweiIdAuthResult huaweiIdAuthResult = new HuaweiIdAuthResult();
        huaweiIdAuthResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(HuaweiIdAuthAPIService.EXTRA_AUTH_HUAWEI_ID, huaweiIdAuthResult.toJson());
        } catch (JSONException unused) {
            C18053as.m77661d("[HUAWEIIDSDK]HwIdSignInClientHub", "convert result to json failed", true);
        }
        setResult(0, intent);
        finish();
    }

    /* JADX INFO: renamed from: a */
    private void m77683a() {
        C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "checkMinVersion start.", true);
        C18070q.m77703a(this, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.hwid.internal.ui.activity.HwIdSignInHubActivity.1
            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                if (i == 0) {
                    C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check ok", true);
                    HwIdSignInHubActivity.this.m77689b();
                } else {
                    C18053as.m77659b("[HUAWEIIDSDK]HwIdSignInClientHub", "version check failed", true);
                    HwIdSignInHubActivity.this.m77684a(i);
                }
            }
        });
    }
}
