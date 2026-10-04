package oo0oOO0;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00O0O0o.OooOO0O;

/* JADX INFO: renamed from: oo0oOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34998OooO0O0 extends AbstractC34999OooO0OO<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f125684OooO = OooOO0O.OooO0o0("BatteryNotLowTracker");

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f125690OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        OooOO0O.OooO0OO().OooO0O0(f125684OooO, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // oo0oOO0.AbstractC34999OooO0OO
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // oo0oOO0.AbstractC34999OooO0OO
    public final void OooO0oO(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        OooOO0O.OooO0OO().OooO00o(f125684OooO, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            OooO0OO(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            OooO0OO(Boolean.FALSE);
        }
    }
}
