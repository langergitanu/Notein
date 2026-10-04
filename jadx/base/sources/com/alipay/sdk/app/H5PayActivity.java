package com.alipay.sdk.app;

import OooOooO.C20741OooOOoo;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alipay.sdk.p011m.p012x.C0200d;
import com.alipay.sdk.p011m.p012x.C0201e;
import com.orion.notein.domain.models.note.NoteMeta;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import o00OOOO0.OooO0OO;
import o00OOOOo.OooO00o;
import o00OOOoO.C25016OooO00o;
import o00Oo0o0.C25047OooO00o;
import o00Oo0oO.C25052OooO0Oo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class H5PayActivity extends Activity {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f66831OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C0200d f66832OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f66833OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f66834OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f66835OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f66836OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f66837OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public WeakReference<C25047OooO00o> f66838OooOooO;

    public void OooO00o() {
        Object obj = PayTask.f173h;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        OooO00o();
        super.finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        C0200d.OooO0OO oooO0OO;
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            WeakReference<C25047OooO00o> weakReference = this.f66838OooOooO;
            C25047OooO00o c25047OooO00o = weakReference == null ? null : weakReference.get();
            if (i != 1010 || intent == null || (oooO0OO = OooO0OO.f84884OooO00o) == null) {
                return;
            }
            OooO0OO.f84884OooO00o = null;
            if (i2 != -1) {
                if (i2 != 0) {
                    OooO00o.OooO0oO(c25047OooO00o, "biz", "TbUnknown", "" + i2);
                    return;
                } else {
                    OooO00o.OooO0OO(c25047OooO00o, "biz", "TbCancel", intent.toUri(1));
                    oooO0OO.OooO00o(false, null, "CANCELED");
                    return;
                }
            }
            OooO00o.OooO0OO(c25047OooO00o, "biz", "TbOk", intent.toUri(1));
            JSONObject jSONObject = new JSONObject();
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    try {
                        jSONObject.put(str, String.valueOf(extras.get(str)));
                    } catch (Throwable unused) {
                    }
                }
            }
            oooO0OO.OooO00o(true, jSONObject, "OK");
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        C0200d c0200d = this.f66832OooOo0o;
        if (c0200d == null) {
            finish();
        } else {
            if (c0200d.OooO00o()) {
                c0200d.OooO0o0();
                return;
            }
            c0200d.OooO0o0();
            C20741OooOOoo.f59588OooO0O0 = C20741OooOOoo.OooO0O0();
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        try {
            super.requestWindowFeature(1);
            getWindow().addFlags(8192);
        } catch (Throwable th) {
            C25052OooO0Oo.OooO00o(th);
        }
        super.onCreate(bundle);
        try {
            C25047OooO00o c25047OooO00oOooO00o = C25047OooO00o.C19671OooO00o.OooO00o(getIntent());
            if (c25047OooO00oOooO00o == null) {
                finish();
                return;
            }
            this.f66838OooOooO = new WeakReference<>(c25047OooO00oOooO00o);
            if (C25016OooO00o.OooO00o().f84908OooO0O0) {
                setRequestedOrientation(3);
            } else {
                setRequestedOrientation(1);
            }
            try {
                Bundle extras = getIntent().getExtras();
                String string = extras.getString("url", null);
                this.f66831OooOo = string;
                if (Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(string).matches()) {
                    this.f66833OooOoO = extras.getString("cookie", null);
                    this.f66834OooOoO0 = extras.getString("method", null);
                    this.f66835OooOoOO = extras.getString(NoteMeta.PROPERTY_TITLE, null);
                    this.f66836OooOoo = extras.getString("version", "v1");
                    this.f66837OooOoo0 = extras.getBoolean("backisexit", false);
                    try {
                        C0200d c0200d = new C0200d(this, this.f66836OooOoo, c25047OooO00oOooO00o);
                        setContentView(c0200d);
                        String str = this.f66835OooOoOO;
                        String str2 = this.f66834OooOoO0;
                        boolean z = this.f66837OooOoo0;
                        synchronized (c0200d) {
                            c0200d.f66860OooOoOO = str2;
                            c0200d.f66864OooOooo.getTitle().setText(str);
                            c0200d.f66859OooOoO = z;
                        }
                        String str3 = this.f66831OooOo;
                        String str4 = this.f66833OooOoO;
                        if (!TextUtils.isEmpty(str4)) {
                            CookieSyncManager.createInstance(c0200d.f66858OooOo0o.getApplicationContext()).sync();
                            CookieManager.getInstance().setCookie(str3, str4);
                            CookieSyncManager.getInstance().sync();
                        }
                        c0200d.OooO0O0(this.f66831OooOo);
                        this.f66832OooOo0o = c0200d;
                    } catch (Throwable th2) {
                        OooO00o.OooO0Oo(c25047OooO00oOooO00o, "biz", "GetInstalledAppEx", th2);
                        finish();
                    }
                } else {
                    finish();
                }
            } catch (Exception unused) {
                finish();
            }
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C0200d c0200d = this.f66832OooOo0o;
        if (c0200d != null) {
            synchronized (c0200d) {
                c0200d.f66864OooOooo.OooO0OO();
                Stack stack = (Stack) c0200d.f66865Oooo000.f59743OooO00o;
                if (!stack.isEmpty()) {
                    Iterator it = stack.iterator();
                    while (it.hasNext()) {
                        ((C0201e) it.next()).OooO0OO();
                    }
                    stack.clear();
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            try {
                WeakReference<C25047OooO00o> weakReference = this.f66838OooOooO;
                OooO00o.OooO0Oo(weakReference == null ? null : weakReference.get(), "biz", "H5PayDataAnalysisError", th);
            } catch (Throwable unused) {
            }
        }
    }
}
