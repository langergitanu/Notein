package oo0oOO0;

import android.content.Intent;
import android.content.IntentFilter;
import o00O0O0o.OooOO0O;

/* JADX INFO: renamed from: oo0oOO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C35001OooO0o extends AbstractC34999OooO0OO<Boolean> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f125696OooO = OooOO0O.OooO0o0("StorageNotLowTracker");

    @Override // oo0oOO0.AbstractC35000OooO0Oo
    public final Object OooO00o() {
        Intent intentRegisterReceiver = this.f125690OooO0O0.registerReceiver(null, OooO0o());
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // oo0oOO0.AbstractC34999OooO0OO
    public final IntentFilter OooO0o() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // oo0oOO0.AbstractC34999OooO0OO
    public final void OooO0oO(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        OooOO0O.OooO0OO().OooO00o(f125696OooO, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            OooO0OO(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            OooO0OO(Boolean.TRUE);
        }
    }
}
