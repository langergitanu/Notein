package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.C22162OooO0oo;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.android.billingclient.api.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22195OoooOo0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f67067OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f67068OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C22196OoooOoO f67069OooO0OO;

    public C22195OoooOo0(C22196OoooOoO c22196OoooOoO, boolean z) {
        Objects.requireNonNull(c22196OoooOoO);
        this.f67069OooO0OO = c22196OoooOoO;
        this.f67068OooO0O0 = z;
    }

    public final synchronized void OooO00o(Context context, IntentFilter intentFilter) {
        try {
            if (this.f67067OooO00o) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f67068OooO0O0 ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f67067OooO00o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0(Context context) {
        if (!this.f67067OooO00o) {
            zzc.zzn("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f67067OooO00o = false;
        }
    }

    public final void OooO0OO(Bundle bundle, C22162OooO0oo c22162OooO0oo, int i, zzil zzilVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            C22196OoooOoO c22196OoooOoO = this.f67069OooO0OO;
            if (byteArray != null) {
                c22196OoooOoO.f67072OooO0OO.OooO0OO(zzhx.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzeu.zza()), j, z);
            } else {
                c22196OoooOoO.f67072OooO0OO.OooO0OO(C22186Oooo0oO.OooO0O0(zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, c22162OooO0oo, null, zzilVar), j, z);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        byte b;
        int i;
        C22162OooO0oo c22162OooO0ooZzh;
        zzis zzisVar;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                b = (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) ? (byte) 2 : (byte) -1;
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                b = 1;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            b = 0;
        }
        zzil zzilVar = b != 0 ? b != 1 ? b != 2 ? zzil.BROADCAST_ACTION_UNSPECIFIED : zzil.ALTERNATIVE_BILLING_ACTION : zzil.LOCAL_PURCHASES_UPDATED_ACTION : zzil.PURCHASES_UPDATED_ACTION;
        zzil zzilVar2 = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        if (zzilVar.equals(zzilVar2) || zzilVar.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
            i = 2;
        } else {
            i = zzilVar.equals(zzil.PURCHASES_UPDATED_ACTION) ? 32 : 1;
        }
        Bundle extras = intent.getExtras();
        C22196OoooOoO c22196OoooOoO = this.f67069OooO0OO;
        if (extras == null) {
            zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            C22190OoooO00 c22190OoooO00 = c22196OoooOoO.f67072OooO0OO;
            zzie zzieVar = zzie.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            C22162OooO0oo c22162OooO0oo = C22179Oooo.f67027OooO0oo;
            c22190OoooO00.OooO00o(C22186Oooo0oO.OooO0O0(zzieVar, i, c22162OooO0oo, null, zzilVar));
            OooOOO0 oooOOO0 = c22196OoooOoO.f67071OooO0O0;
            if (oooOOO0 != null) {
                oooOOO0.OooO00o(c22162OooO0oo, null);
                return;
            }
            return;
        }
        if (i == 2) {
            int i2 = zzc.zza;
            C22162OooO0oo.OooO00o OooO00o2 = C22162OooO0oo.OooO00o();
            OooO00o2.f66939OooO00o = zzc.zzb(intent.getExtras(), "BillingBroadcastManager");
            Bundle extras2 = intent.getExtras();
            if (extras2 == null) {
                zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
            } else {
                Object obj = extras2.get("SUB_RESPONSE_CODE");
                if (obj == null) {
                    zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                } else if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                    OooO00o2.f66940OooO0O0 = iIntValue;
                    OooO00o2.f66941OooO0OO = zzc.zzj(intent.getExtras(), "BillingBroadcastManager");
                    c22162OooO0ooZzh = OooO00o2.OooO00o();
                } else {
                    zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                }
            }
            iIntValue = 0;
            OooO00o2.f66940OooO0O0 = iIntValue;
            OooO00o2.f66941OooO0OO = zzc.zzj(intent.getExtras(), "BillingBroadcastManager");
            c22162OooO0ooZzh = OooO00o2.OooO00o();
        } else {
            c22162OooO0ooZzh = zzc.zzh(intent, "BillingBroadcastManager");
        }
        C22162OooO0oo c22162OooO0oo2 = c22162OooO0ooZzh;
        long j = extras.getLong("billingClientTransactionId", 0L);
        boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
        if (!zzilVar.equals(zzil.PURCHASES_UPDATED_ACTION) && !zzilVar.equals(zzilVar2)) {
            if (zzilVar.equals(zzil.ALTERNATIVE_BILLING_ACTION)) {
                if (c22162OooO0oo2.f66936OooO00o != 0) {
                    OooO0OO(extras, c22162OooO0oo2, i, zzilVar, j, z);
                    c22196OoooOoO.f67071OooO0O0.OooO00o(c22162OooO0oo2, zzbt.zzk());
                    return;
                }
                c22196OoooOoO.getClass();
                zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                zzie zzieVar2 = zzie.MISSING_USER_CHOICE_BILLING_LISTENER;
                C22162OooO0oo c22162OooO0oo3 = C22179Oooo.f67027OooO0oo;
                c22196OoooOoO.f67072OooO0OO.OooO0OO(C22186Oooo0oO.OooO0O0(zzieVar2, i, c22162OooO0oo3, null, zzilVar), j, z);
                c22196OoooOoO.f67071OooO0O0.OooO00o(c22162OooO0oo3, zzbt.zzk());
                return;
            }
            return;
        }
        List<Purchase> listZzl = zzc.zzl(extras);
        if (c22162OooO0oo2.f66936OooO00o == 0) {
            C22190OoooO00 c22190OoooO002 = c22196OoooOoO.f67072OooO0OO;
            zzib zzibVarOooO0OO = C22186Oooo0oO.OooO0OO(i, zzilVar);
            c22190OoooO002.getClass();
            try {
                zzhz zzhzVar = (zzhz) zzibVarOooO0OO.zzm();
                zzja zzjaVar = (zzja) zzibVarOooO0OO.zzA().zzm();
                zzjaVar.zza(z);
                zzhzVar.zzm(zzjaVar);
                zzib zzibVar = (zzib) zzhzVar.zze();
                if (j == 0) {
                    zzisVar = c22190OoooO002.f67059OooO0O0;
                } else {
                    zziq zziqVar = (zziq) c22190OoooO002.f67059OooO0O0.zzm();
                    zziqVar.zzo(j);
                    zzisVar = (zzis) zziqVar.zze();
                }
                c22190OoooO002.OooO0oO(zzibVar, zzisVar);
            } catch (Throwable th) {
                zzc.zzo("BillingLogger", "Unable to log.", th);
            }
        } else {
            OooO0OO(extras, c22162OooO0oo2, i, zzilVar, j, z);
        }
        c22196OoooOoO.f67071OooO0O0.OooO00o(c22162OooO0oo2, listZzl);
    }
}
