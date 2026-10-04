package ooOOOOoo;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.C22504OooOOOo;
import java.util.ArrayList;
import o0oooo.C31862OooO00o;
import o0ooooO0.InterfaceC31872OooO00o;
import ooOOOOoo.C35081OooOoOO;
import ooOOOOoo.C35083OooOoo0;

/* JADX INFO: renamed from: ooOOOOoo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35078OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Application f125993OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C35080OooOoO0 f125994OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C22504OooOOOo f125995OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f125996OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: ooOOOOoo.OooOo0o$OooO00o */
    public class OooO00o {
        public OooO00o() {
        }

        public final void OooO00o(Bundle bundle) {
            C35077OooOo0O.OooO0o0("RH", "onRelayDataUpdate, bundle=%s", bundle);
            C35078OooOo0o c35078OooOo0o = C35078OooOo0o.this;
            C35083OooOoo0.OooO0O0 oooO0O0 = C35078OooOo0o.OooO0O0((C31862OooO00o) c35078OooOo0o.f125994OooO0O0.get()) ? C35083OooOoo0.OooO0O0.f126013OooOo : C35083OooOoo0.OooO0O0.f126014OooOo0o;
            C35081OooOoOO c35081OooOoOO = C35081OooOoOO.OooO00o.f126011OooO00o;
            int iOooO00o = !c35081OooOoOO.OooO00o() ? -1 : c35081OooOoOO.f126010OooO0OO.OooO00o(c35081OooOoOO.f126008OooO00o, oooO0O0, c35078OooOo0o.OooO0OO());
            c35078OooOo0o.f125995OooO0OO.getClass();
            InterfaceC31872OooO00o interfaceC31872OooO00o = C35079OooOoO.f126001OooO0oo;
            if (iOooO00o != 0 || interfaceC31872OooO00o == null) {
                return;
            }
            interfaceC31872OooO00o.OooO0O0();
        }
    }

    public C35078OooOo0o(Application application, C35080OooOoO0 c35080OooOoO0) {
        PackageInfo packageInfo;
        this.f125993OooO00o = application;
        this.f125994OooO0O0 = c35080OooOoO0;
        C35081OooOoOO c35081OooOoOO = C35081OooOoOO.OooO00o.f126011OooO00o;
        c35081OooOoOO.f126008OooO00o = application;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 30) {
            String str = Build.MANUFACTURER;
            if ("Xiaomi".equals(str) || "blackshark".equals(str)) {
                try {
                    packageInfo = application.getPackageManager().getPackageInfo("com.xiaomi.mirror", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (Build.VERSION.SDK_INT >= 28 && packageInfo != null) {
                    C35081OooOoOO.f126007OooO0Oo = packageInfo.getLongVersionCode();
                    if (packageInfo.applicationInfo.uid == 1000 && packageInfo.getLongVersionCode() >= 20000) {
                        z = true;
                    }
                }
            }
        }
        c35081OooOoOO.f126009OooO0O0 = z;
        if (c35081OooOoOO.OooO00o()) {
            if (C35081OooOoOO.f126007OooO0Oo >= 30000) {
                c35081OooOoOO.f126010OooO0OO = new Oooo0();
                return;
            }
            C35084OooOooO c35084OooOooO = new C35084OooOooO();
            c35081OooOoOO.f126010OooO0OO = c35084OooOooO;
            c35084OooOooO.f126016OooO00o = application.getPackageName();
            C35087Oooo00o.OooO00o().OooO0O0(application, c35084OooOooO.f126019OooO0Oo);
            C35087Oooo00o c35087Oooo00oOooO00o = C35087Oooo00o.OooO00o();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("miui.intent.action.MIRROR_STATE_CHANGED");
            application.registerReceiver(c35087Oooo00oOooO00o.f126033OooO0o0, intentFilter, "android.permission.INJECT_EVENTS", null);
        }
    }

    public static boolean OooO0O0(C31862OooO00o c31862OooO00o) {
        if (c31862OooO00o == null) {
            C35077OooOo0O.OooO0Oo("RH", "check support applink, session is null", null);
            return false;
        }
        if (TextUtils.equals("com.android.browser", c31862OooO00o.f113561OooO00o.getPackageName())) {
            C35077OooOo0O.OooO0o0("RH", "check support applink, package is browser", null);
            return true;
        }
        boolean z = !TextUtils.isEmpty(C35074OooOOo0.OooO0Oo(null));
        C35077OooOo0O.OooO0o0("RH", "check support applink, result is" + z, null);
        return z;
    }

    public final void OooO00o() {
        C35077OooOo0O.OooO0o0("RH", "cancel", null);
        try {
            C35081OooOoOO c35081OooOoOO = C35081OooOoOO.OooO00o.f126011OooO00o;
            if (c35081OooOoOO.OooO00o()) {
                c35081OooOoOO.f126010OooO0OO.mo80640a((Context) c35081OooOoOO.f126008OooO00o);
            }
            Application application = this.f125993OooO00o;
            if (c35081OooOoOO.OooO00o()) {
                c35081OooOoOO.f126010OooO0OO.mo80641a((Context) application);
            }
        } catch (Throwable th) {
            Log.e(C35077OooOo0O.OooO00o("RH"), "unRegisterAppCallback error, exception", th);
        }
    }

    public final Bundle OooO0OO() {
        C35080OooOoO0 c35080OooOoO0 = this.f125994OooO0O0;
        boolean zOooO0O0 = OooO0O0((C31862OooO00o) c35080OooOoO0.get());
        Application application = this.f125993OooO00o;
        if (!zOooO0O0) {
            Bundle bundle = new Bundle();
            C31862OooO00o c31862OooO00o = (C31862OooO00o) c35080OooOoO0.get();
            if (c31862OooO00o != null) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(application.getPackageName());
                bundle.putStringArrayList("relay_intent_package_list", arrayList);
                bundle.putParcelable("relay_intent_uri", (Uri) c31862OooO00o.f113562OooO0O0.get());
                bundle.putString("relay_intent_description_string", "");
            }
            C35077OooOo0O.OooO0O0("RH", "getAppRelayParam, bundle=%s", bundle);
            return bundle;
        }
        Bundle bundle2 = new Bundle();
        C31862OooO00o c31862OooO00o2 = (C31862OooO00o) c35080OooOoO0.get();
        if (c31862OooO00o2 != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            arrayList2.add(application.getPackageName());
            arrayList2.add("com.android.browser");
            bundle2.putStringArrayList("relay_browser_package_list", arrayList2);
            String strOooO0Oo = C35074OooOOo0.OooO0Oo(null);
            String strOooO0Oo2 = C35074OooOOo0.OooO0Oo(c31862OooO00o2.f113562OooO0O0);
            if (TextUtils.isEmpty(strOooO0Oo)) {
                strOooO0Oo = strOooO0Oo2;
            }
            bundle2.putString("relay_browser_url", strOooO0Oo);
            bundle2.putString("relay_browser_cookie", null);
            bundle2.putInt("relay_browser_url_type", 0);
        }
        C35077OooOo0O.OooO0O0("RH", "getBrowserRelayParam, bundle=%s", bundle2);
        return bundle2;
    }

    public final void OooO0Oo() {
        C35077OooOo0O.OooO0o0("RH", "showRelayData", null);
        C35083OooOoo0.OooO0O0 oooO0O0 = OooO0O0((C31862OooO00o) this.f125994OooO0O0.get()) ? C35083OooOoo0.OooO0O0.f126013OooOo : C35083OooOoo0.OooO0O0.f126014OooOo0o;
        C35081OooOoOO c35081OooOoOO = C35081OooOoOO.OooO00o.f126011OooO00o;
        Bundle bundleOooO0OO = OooO0OO();
        if (c35081OooOoOO.OooO00o()) {
            c35081OooOoOO.f126010OooO0OO.OooO0OO(c35081OooOoOO.f126008OooO00o, oooO0O0, bundleOooO0OO);
        }
    }
}
