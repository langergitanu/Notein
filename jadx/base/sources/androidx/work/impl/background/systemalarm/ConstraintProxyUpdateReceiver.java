package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o00O0O0o.OooOO0O;
import o00O0Ooo.C24902OooOO0;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f66719OooO00o = OooOO0O.OooO0o0("ConstrntProxyUpdtRecvr");

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Context f66720OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Intent f66721OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f66722OooOoO0;

        public OooO00o(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f66721OooOo0o = intent;
            this.f66720OooOo = context;
            this.f66722OooOoO0 = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f66722OooOoO0;
            Context context = this.f66720OooOo;
            Intent intent = this.f66721OooOo0o;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                OooOO0O.OooO0OO().OooO00o(ConstraintProxyUpdateReceiver.f66719OooO00o, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
                C24902OooOO0.OooO00o(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C24902OooOO0.OooO00o(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C24902OooOO0.OooO00o(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C24902OooOO0.OooO00o(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            o00O0OO0.OooOO0O.OoooooO(context).f84363OooO0Oo.OooO00o(new OooO00o(intent, context, goAsync()));
        } else {
            OooOO0O.OooO0OO().OooO00o(f66719OooO00o, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
