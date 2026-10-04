package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: loaded from: classes.dex */
final class zzax extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        zzc.zzi(bundle, "BillingClient");
        throw null;
    }
}
