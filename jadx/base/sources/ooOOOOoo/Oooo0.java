package ooOOOOoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Process;
import ooOOOOoo.C35078OooOo0o;
import ooOOOOoo.C35083OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements Oooo000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C35078OooOo0o.OooO00o f126023OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f126022OooO00o = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f126024OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f126025OooO0Oo = new OooO0O0();

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C35078OooOo0o.OooO00o oooO00o;
            if ("miui.intent.action.MIRROR_STATE_CHANGED".equals(intent.getAction())) {
                boolean booleanExtra = intent.getBooleanExtra("connect_state", false);
                Oooo0 oooo0 = Oooo0.this;
                if (booleanExtra && !oooo0.f126022OooO00o && (oooO00o = oooo0.f126023OooO0O0) != null) {
                    oooo0.OooO0O0(context, oooO00o);
                }
                oooo0.f126022OooO00o = booleanExtra;
            }
        }
    }

    public class OooO0O0 extends AbstractBinderC35082OooOoo {
        public OooO0O0() {
            attachInterface(this, "com.xiaomi.mirror.IRelayCallback");
        }
    }

    @Override // ooOOOOoo.Oooo000
    public final int OooO00o(Context context, C35083OooOoo0.OooO0O0 oooO0O0, Bundle bundle) {
        if (this.f126023OooO0O0 == null) {
            return -1;
        }
        bundle.putString("relay_package_name", context.getPackageName());
        bundle.putInt("relay_data_type", C35083OooOoo0.OooO00o(oooO0O0));
        bundle.putInt("relay_app_pid", Process.myPid());
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("bundle", bundle);
        try {
            C35085OooOooo.OooO00o(context.getContentResolver(), "syncRelayData", bundle2);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // ooOOOOoo.Oooo000
    public final void OooO0O0(Context context, C35078OooOo0o.OooO00o oooO00o) {
        this.f126023OooO0O0 = oooO00o;
        try {
            Bundle bundle = new Bundle();
            OooO0O0 oooO0O0 = this.f126025OooO0Oo;
            oooO0O0.getClass();
            bundle.putBinder("relayCallback", oooO0O0);
            C35085OooOooo.OooO00o(context.getContentResolver(), "registerRelayCallback", bundle);
        } catch (Exception e) {
            e.toString();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("miui.intent.action.MIRROR_STATE_CHANGED");
        context.registerReceiver(this.f126024OooO0OO, intentFilter, "android.permission.INJECT_EVENTS", null);
    }

    @Override // ooOOOOoo.Oooo000
    public final int OooO0OO(Context context, C35083OooOoo0.OooO0O0 oooO0O0, Bundle bundle) {
        bundle.putString("relay_package_name", context.getPackageName());
        bundle.putInt("relay_data_type", C35083OooOoo0.OooO00o(oooO0O0));
        bundle.putInt("relay_app_pid", Process.myPid());
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("bundle", bundle);
        try {
            C35085OooOooo.OooO00o(context.getContentResolver(), "showRelayData", bundle2);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // ooOOOOoo.Oooo000
    /* JADX INFO: renamed from: a */
    public final int mo80640a(Context context) {
        C35083OooOoo0.OooO0O0 oooO0O0 = C35083OooOoo0.OooO0O0.f126014OooOo0o;
        Bundle bundle = new Bundle();
        bundle.putString("relay_package_name", context.getPackageName());
        bundle.putInt("relay_data_type", C35083OooOoo0.OooO00o(oooO0O0));
        bundle.putInt("relay_app_pid", Process.myPid());
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("bundle", bundle);
        try {
            C35085OooOooo.OooO00o(context.getContentResolver(), "cancelRelayData", bundle2);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // ooOOOOoo.Oooo000
    /* JADX INFO: renamed from: a */
    public final void mo80641a(Context context) {
        this.f126023OooO0O0 = null;
        try {
            Bundle bundle = new Bundle();
            OooO0O0 oooO0O0 = this.f126025OooO0Oo;
            oooO0O0.getClass();
            bundle.putBinder("relayCallback", oooO0O0);
            C35085OooOooo.OooO00o(context.getContentResolver(), "unRegisterRelayCallback", bundle);
        } catch (Exception e) {
            e.toString();
        }
        context.unregisterReceiver(this.f126024OooO0OO);
    }
}
