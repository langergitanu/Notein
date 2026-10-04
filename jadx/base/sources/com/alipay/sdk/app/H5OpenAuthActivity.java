package com.alipay.sdk.app;

import android.content.Intent;
import android.net.Uri;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import o00OOOOo.OooO00o;
import o00Oo0o0.C25047OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class H5OpenAuthActivity extends H5PayActivity {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f66830OooOooo = false;

    @Override // com.alipay.sdk.app.H5PayActivity
    public final void OooO00o() {
    }

    @Override // com.alipay.sdk.app.H5PayActivity, android.app.Activity
    public final void onDestroy() {
        if (this.f66830OooOooo) {
            try {
                C25047OooO00o c25047OooO00oOooO00o = C25047OooO00o.C19671OooO00o.OooO00o(getIntent());
                if (c25047OooO00oOooO00o != null) {
                    OooO00o.OooO0o(this, "", c25047OooO00oOooO00o.f85036OooO0Oo, c25047OooO00oOooO00o);
                }
            } catch (Throwable unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        try {
            C25047OooO00o c25047OooO00oOooO00o = C25047OooO00o.C19671OooO00o.OooO00o(intent);
            try {
                super.startActivity(intent);
                Uri data = intent != null ? intent.getData() : null;
                if (data == null || !data.toString().startsWith("alipays://platformapi/startapp")) {
                    return;
                }
                finish();
            } catch (Throwable th) {
                String string = (intent == null || intent.getData() == null) ? CloudMetaExtra.DEFINE_NON_PARENT_ID : intent.getData().toString();
                if (c25047OooO00oOooO00o != null) {
                    OooO00o.OooO0o0(c25047OooO00oOooO00o, "StartActivityEx", th, string);
                }
                this.f66830OooOooo = true;
                throw th;
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
