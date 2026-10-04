package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.android.billingclient.api.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22186Oooo0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f67057OooO00o = 0;

    static {
        int i = InterfaceC22187Oooo0oo.f67058OooO00o;
    }

    public static String OooO00o(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + C18241k5.f55433h + zzbj.zzb(exc.getMessage());
            int i = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzhx OooO0O0(zzie zzieVar, int i, C22162OooO0oo c22162OooO0oo, String str, zzil zzilVar) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(c22162OooO0oo.f66936OooO00o);
            zzicVarZzc.zzl(c22162OooO0oo.f66938OooO0OO);
            int i2 = c22162OooO0oo.f66937OooO0O0;
            if (i2 != 0) {
                zzicVarZzc.zzm(i2);
            }
            if (zzieVar != null) {
                zzicVarZzc.zzn(zzieVar);
            }
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(i);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhvVarZzc.zza(zzilVar);
            }
            return (zzhx) zzhvVarZzc.zze();
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzib OooO0OO(int i, zzil zzilVar) {
        try {
            zzhz zzhzVarZzc = zzib.zzc();
            zzhzVarZzc.zzo(i);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhzVarZzc.zza(zzilVar);
            }
            return (zzib) zzhzVarZzc.zze();
        } catch (Exception e) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
