package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.C22162OooO0oo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* JADX INFO: loaded from: classes.dex */
final class zzay extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C22162OooO0oo.OooO00o OooO00o2 = C22162OooO0oo.OooO00o();
        OooO00o2.f66939OooO00o = i;
        if (i == 0) {
            OooO00o2.OooO00o();
            throw null;
        }
        if (bundle == null) {
            C22162OooO0oo c22162OooO0oo = C22179Oooo.f67020OooO00o;
            zzie zzieVar = zzie.REASON_UNSPECIFIED;
            throw null;
        }
        OooO00o2.f66941OooO0OO = zzc.zzj(bundle, "BillingClient");
        int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
        zzie zzieVarZzb = i2 != 0 ? zzie.zzb(i2) : zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
        C22162OooO0oo c22162OooO0ooOooO00o = OooO00o2.OooO00o();
        String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
        int i3 = C22186Oooo0oO.f67057OooO00o;
        C22186Oooo0oO.OooO0O0(zzieVarZzb, 16, c22162OooO0ooOooO00o, string, zzil.BROADCAST_ACTION_UNSPECIFIED);
        throw null;
    }
}
