package OooOOo0;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.BundleCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: renamed from: OooOOo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20467OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Intent f58440OooO00o;

    public C20467OooO0o0(Intent intent) {
        this.f58440OooO00o = intent;
    }

    /* JADX INFO: renamed from: OooOOo0.OooO0o0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Intent f58441OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final C20463OooO00o f58442OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f58443OooO0OO;

        public OooO00o() {
            this.f58441OooO00o = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            this.f58442OooO0O0 = new C20463OooO00o();
            this.f58443OooO0OO = true;
        }

        public final C20467OooO0o0 OooO00o() {
            Intent intent = this.f58441OooO00o;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f58443OooO0OO);
            this.f58442OooO0O0.getClass();
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            return new C20467OooO0o0(intent);
        }

        public OooO00o(C20468OooO0oO c20468OooO0oO) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
            this.f58441OooO00o = intent;
            this.f58442OooO0O0 = new C20463OooO00o();
            this.f58443OooO0OO = true;
            if (c20468OooO0oO != null) {
                intent.setPackage(c20468OooO0oO.f58446OooO0OO.getPackageName());
                BinderC20465OooO0OO binderC20465OooO0OO = c20468OooO0oO.f58445OooO0O0;
                Bundle bundle = new Bundle();
                BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", binderC20465OooO0OO);
                intent.putExtras(bundle);
            }
        }
    }
}
