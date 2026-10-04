package o0oooOOo;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import o0oooOOo.C31844OooO0OO;
import o0oooOo.C31853OooO0OO;
import oO0oO0O0.InterfaceC34009OooO00o;

/* JADX INFO: renamed from: o0oooOOo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31849OooO0oo implements com.xiaomi.account.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InterfaceC34009OooO00o f113514OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public com.xiaomi.account.OooO0O0 f113515OooO0o0;

    @Override // com.xiaomi.account.OooO0O0
    public final int OooO0o() throws RemoteException {
        com.xiaomi.account.OooO0O0 oooO0O0 = this.f113515OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0.OooO0o();
        }
        return 0;
    }

    @Override // com.xiaomi.account.OooO0O0
    public final boolean OooO0oO(String str) throws RemoteException {
        com.xiaomi.account.OooO0O0 oooO0O0 = this.f113515OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0.OooO0oO(str);
        }
        return false;
    }

    @Override // com.xiaomi.account.OooO0O0
    public final boolean OooOO0O() throws RemoteException {
        com.xiaomi.account.OooO0O0 oooO0O0 = this.f113515OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0.OooOO0O();
        }
        return false;
    }

    @Override // com.xiaomi.account.OooO0O0
    public final void OooOOo(C31844OooO0OO.OooO00o.OooO0O0 oooO0O0, Bundle bundle) throws RemoteException {
        com.xiaomi.account.OooO0O0 oooO0O02 = this.f113515OooO0o0;
        if (oooO0O02 != null) {
            oooO0O02.OooOOo(oooO0O0, bundle);
        }
    }

    public final void OooOo0(C31844OooO0OO.OooO00o.OooO0O0 oooO0O0, C31845OooO0Oo c31845OooO0Oo) throws RemoteException, C31853OooO0OO, C31843OooO0O0 {
        c31845OooO0Oo.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("extra_response_type", c31845OooO0Oo.f113487OooO0o);
        Boolean bool = c31845OooO0Oo.f113486OooO0Oo;
        if (bool != null) {
            bundle.putBoolean("extra_skip_confirm", bool.booleanValue());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("extra_state", null);
        }
        String str = c31845OooO0Oo.f113483OooO00o;
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("extra_scope", str);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("extra_deviceid", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("extra_display", null);
        }
        bundle.putInt("extra_platform", 0);
        boolean z = c31845OooO0Oo.f113489OooO0oO;
        bundle.putBoolean("extra_native_oauth", z);
        Boolean bool2 = c31845OooO0Oo.f113491OooOO0;
        if (bool2 != null) {
            bundle.putBoolean("extra_use_system_account_login", bool2.booleanValue());
        }
        Boolean bool3 = c31845OooO0Oo.f113492OooOO0O;
        if (bool3 != null) {
            bundle.putBoolean("extra_use_system_browser_login", bool3.booleanValue());
        }
        String str2 = c31845OooO0Oo.f113482OooO;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("extra_loginType", str2);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("extra_bannerBiz", null);
        }
        Boolean bool4 = c31845OooO0Oo.f113493OooOO0o;
        if (bool4 != null) {
            bundle.putBoolean("extra_hideQrApps", bool4.booleanValue());
        }
        bundle.putString("extra_client_id", String.valueOf(c31845OooO0Oo.f113484OooO0O0));
        bundle.putString("extra_redirect_uri", c31845OooO0Oo.f113485OooO0OO);
        if (!bool2.booleanValue() && !OooO0oO("FEATURE_NOT_USE_SYSTEM_ACCOUNT_LOGIN")) {
            Log.e("XiaomiAuthService", "this version of miui only support system account login");
            throw new C31843OooO0O0();
        }
        if (z && OooO0o() < 1) {
            Log.e("XiaomiAuthService", "this version of miui not support fast Oauth");
            throw new C31843OooO0O0();
        }
        if (!OooO0oO("FEATURE_DEV_DEVICEID") && !TextUtils.isEmpty(null)) {
            throw new C31843OooO0O0();
        }
        if (!OooOO0O()) {
            throw new C31843OooO0O0();
        }
        this.f113515OooO0o0.OooOOo(oooO0O0, bundle);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        throw new IllegalStateException();
    }
}
