package com.alipay.sdk.app;

import OooOO0.OooO0O0;
import OooOooO.C20741OooOOoo;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.aspose.slides.C22226Oooo0oo;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import o00Oo0o0.C25047OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class APayEntranceActivity extends Activity {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final ConcurrentHashMap<String, OooO00o> f66825OooOoO = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f66826OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f66827OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C25047OooO00o f66828OooOoO0;

    public interface OooO00o {
        /* JADX INFO: renamed from: a */
        void mo224a(String str);
    }

    @Override // android.app.Activity
    public final void finish() {
        String str = this.f66826OooOo;
        C25047OooO00o c25047OooO00o = this.f66828OooOoO0;
        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, "|");
        sbOooO0OO.append(TextUtils.isEmpty(this.f66827OooOo0o));
        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "BSAFinish", sbOooO0OO.toString());
        if (TextUtils.isEmpty(this.f66827OooOo0o)) {
            this.f66827OooOo0o = C20741OooOOoo.OooO0O0();
            C25047OooO00o c25047OooO00o2 = this.f66828OooOoO0;
            if (c25047OooO00o2 != null) {
                c25047OooO00o2.f85040OooO0oo = true;
            }
        }
        if (str != null) {
            OooO00o oooO00oRemove = f66825OooOoO.remove(str);
            if (oooO00oRemove != null) {
                oooO00oRemove.mo224a(this.f66827OooOo0o);
            } else {
                o00OOOOo.OooO00o.OooO0oO(this.f66828OooOoO0, "wr", "refNull", "session=".concat(str));
            }
        }
        try {
            super.finish();
        } catch (Throwable th) {
            o00OOOOo.OooO00o.OooO0Oo(this.f66828OooOoO0, "wr", "APStartFinish", th);
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C25047OooO00o c25047OooO00o = this.f66828OooOoO0;
        StringBuilder sb = new StringBuilder();
        OooO0O0.OooO0Oo(i, this.f66826OooOo, "|", ",", sb);
        sb.append(i2);
        o00OOOOo.OooO00o.OooO0OO(c25047OooO00o, "biz", "BSAOnAR", sb.toString());
        if (i == 1000) {
            if (intent != null) {
                try {
                    this.f66827OooOo0o = intent.getStringExtra("result");
                } catch (Throwable unused) {
                }
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            String string = extras.getString("ap_order_info");
            String string2 = extras.getString("ap_target_packagename");
            this.f66826OooOo = extras.getString("ap_session");
            String string3 = extras.getString("ap_local_info", "{}");
            if (!TextUtils.isEmpty(this.f66826OooOo)) {
                String str = this.f66826OooOo;
                HashMap<UUID, C25047OooO00o> map = C25047OooO00o.C19671OooO00o.f85044OooO00o;
                C25047OooO00o c25047OooO00oRemove = TextUtils.isEmpty(str) ? null : C25047OooO00o.C19671OooO00o.f85045OooO0O0.remove(str);
                this.f66828OooOoO0 = c25047OooO00oRemove;
                o00OOOOo.OooO00o.OooO0OO(c25047OooO00oRemove, "biz", "BSAEntryCreate", this.f66826OooOo + "|" + SystemClock.elapsedRealtime());
            }
            Intent intent = new Intent();
            intent.putExtra("order_info", string);
            intent.putExtra("localInfo", string3);
            intent.setClassName(string2, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            try {
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                o00OOOOo.OooO00o.OooO0Oo(this.f66828OooOoO0, "wr", "APStartEx", th);
                finish();
            }
            if (this.f66828OooOoO0 != null) {
                Context applicationContext = getApplicationContext();
                C25047OooO00o c25047OooO00o = this.f66828OooOoO0;
                o00OOOOo.OooO00o.OooO00o(applicationContext, string, c25047OooO00o.f85036OooO0Oo, c25047OooO00o);
                this.f66828OooOoO0.f85032OooO = true;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
