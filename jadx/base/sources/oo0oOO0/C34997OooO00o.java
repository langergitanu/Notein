package oo0oOO0;

import android.content.Intent;
import android.content.IntentFilter;
import o00O0O0o.OooOO0O;

/* JADX INFO: renamed from: oo0oOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34997OooO00o extends AbstractC34999OooO0OO<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f125683OooO = OooOO0O.OooO0o0("BatteryChrgTracker");

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f125690OooO0O0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            OooOO0O.OooO0OO().OooO0O0(f125683OooO, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // oo0oOO0.AbstractC34999OooO0OO
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // oo0oOO0.AbstractC34999OooO0OO
    public final void OooO0oO(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        OooOO0O.OooO0OO().OooO00o(f125683OooO, "Received ".concat(action), new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                OooO0OO(Boolean.FALSE);
                break;
            case "android.os.action.DISCHARGING":
                OooO0OO(Boolean.FALSE);
                break;
            case "android.os.action.CHARGING":
                OooO0OO(Boolean.TRUE);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                OooO0OO(Boolean.TRUE);
                break;
        }
    }
}
