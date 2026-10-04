package com.alipay.sdk.app;

import OooOooO.C20741OooOOoo;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import o00OO0.OooO0OO;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25052OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class PayResultActivity extends Activity {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final HashMap<String, Object> f66839OooOo = new HashMap<>();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C25047OooO00o f66840OooOo0o = null;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static volatile String f66841OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static volatile String f66842OooO0O0;
    }

    public static void OooO00o(PayResultActivity payResultActivity, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent();
        try {
            intent.setPackage("hk.alipay.wallet");
            intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession=" + URLEncoder.encode(str, "UTF-8") + "&orderSuffix=" + URLEncoder.encode(str2, "UTF-8") + "&packageName=" + URLEncoder.encode(str3, "UTF-8") + "&externalPkgName=" + URLEncoder.encode(str3, "UTF-8")));
        } catch (UnsupportedEncodingException e) {
            C25052OooO0Oo.OooO00o(e);
        }
        try {
            payResultActivity.startActivity(intent);
        } catch (Throwable unused) {
            payResultActivity.finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Object obj;
        Object obj2;
        Object obj3;
        super.onCreate(bundle);
        try {
            intent = getIntent();
        } catch (Throwable unused) {
            finish();
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("orderSuffix"))) {
            OooO00o.f66841OooO00o = intent.getStringExtra("phonecashier.pay.hash");
            String stringExtra = intent.getStringExtra("orderSuffix");
            String stringExtra2 = intent.getStringExtra("externalPkgName");
            C25047OooO00o c25047OooO00oOooO00o = C25047OooO00o.C19671OooO00o.OooO00o(intent);
            this.f66840OooOo0o = c25047OooO00oOooO00o;
            if (c25047OooO00oOooO00o == null) {
                finish();
            }
            OooO00o(this, OooO00o.f66841OooO00o, stringExtra, stringExtra2);
            new Handler().postDelayed(new OooO0OO(this), 300);
            return;
        }
        if (this.f66840OooOo0o == null) {
            finish();
        }
        String stringExtra3 = intent.getStringExtra("phonecashier.pay.result");
        int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
        if (intExtra == 0 || !TextUtils.equals(OooO00o.f66841OooO00o, String.valueOf(intExtra))) {
            o00OOOOo.OooO00o.OooO0oO(this.f66840OooOo0o, "biz", "SchemePayWrongHashEx", "Expected " + OooO00o.f66841OooO00o + ", got " + intExtra);
            String str = OooO00o.f66841OooO00o;
            OooO00o.f66842OooO0O0 = C20741OooOOoo.OooO0O0();
            HashMap<String, Object> map = f66839OooOo;
            if (map != null && str != null && (obj = map.get(str)) != null) {
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
            new Handler().postDelayed(new OooO0OO(this), 300);
            return;
        }
        if (TextUtils.isEmpty(stringExtra3)) {
            String str2 = OooO00o.f66841OooO00o;
            OooO00o.f66842OooO0O0 = C20741OooOOoo.OooO0O0();
            HashMap<String, Object> map2 = f66839OooOo;
            if (map2 != null && str2 != null && (obj2 = map2.get(str2)) != null) {
                synchronized (obj2) {
                    obj2.notifyAll();
                }
            }
        } else {
            String str3 = OooO00o.f66841OooO00o;
            OooO00o.f66842OooO0O0 = stringExtra3;
            HashMap<String, Object> map3 = f66839OooOo;
            if (map3 != null && str3 != null && (obj3 = map3.get(str3)) != null) {
                synchronized (obj3) {
                    obj3.notifyAll();
                }
            }
        }
        OooO00o.f66841OooO00o = "";
        new Handler().postDelayed(new OooO0OO(this), 300);
        return;
        finish();
    }
}
