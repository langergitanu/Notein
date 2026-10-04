package com.android.billingclient.api;

import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjo;

/* JADX INFO: renamed from: com.android.billingclient.api.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22190OoooO00 implements InterfaceC22187Oooo0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public zzis f67059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C22191OoooO0O f67060OooO0OO;

    public C22190OoooO00(Context context, zzis zzisVar) {
        C22191OoooO0O c22191OoooO0O = new C22191OoooO0O();
        try {
            TransportRuntime.initialize(context);
            c22191OoooO0O.f67062OooO0O0 = TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE).getTransport("PLAY_BILLING_LIBRARY", zzji.class, Encoding.m74894of("proto"), new C22189OoooO0());
        } catch (Throwable unused) {
            c22191OoooO0O.f67061OooO00o = true;
        }
        this.f67060OooO0OO = c22191OoooO0O;
        this.f67059OooO0O0 = zzisVar;
    }

    public final void OooO00o(zzhx zzhxVar) {
        try {
            OooO0o(zzhxVar, this.f67059OooO0O0);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void OooO0O0(zzhx zzhxVar, int i, long j) {
        try {
            zziq zziqVar = (zziq) this.f67059OooO0O0.zzm();
            zziqVar.zzm(i);
            zzis zzisVar = (zzis) zziqVar.zze();
            this.f67059OooO0O0 = zzisVar;
            if (j != 0) {
                zziq zziqVar2 = (zziq) zzisVar.zzm();
                zziqVar2.zzo(j);
                zzisVar = (zzis) zziqVar2.zze();
            }
            OooO0o(zzhxVar, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void OooO0OO(zzhx zzhxVar, long j, boolean z) {
        zzis zzisVar;
        try {
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j == 0) {
                zzisVar = this.f67059OooO0O0;
            } else {
                zziq zziqVar = (zziq) this.f67059OooO0O0.zzm();
                zziqVar.zzo(j);
                zzisVar = (zzis) zziqVar.zze();
            }
            OooO0o(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void OooO0Oo(zzhx zzhxVar, int i, long j, boolean z) {
        zzis zzisVar;
        try {
            zziq zziqVar = (zziq) this.f67059OooO0O0.zzm();
            zziqVar.zzm(i);
            this.f67059OooO0O0 = (zzis) zziqVar.zze();
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j == 0) {
                zzisVar = this.f67059OooO0O0;
            } else {
                zziq zziqVar2 = (zziq) this.f67059OooO0O0.zzm();
                zziqVar2.zzo(j);
                zzisVar = (zzis) zziqVar2.zze();
            }
            OooO0o(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void OooO0o(zzhx zzhxVar, zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zza(zzhxVar);
            this.f67060OooO0OO.OooO00o((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void OooO0o0(zzjo zzjoVar) {
        try {
            C22191OoooO0O c22191OoooO0O = this.f67060OooO0OO;
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(this.f67059OooO0O0);
            zzjgVarZzc.zzo(zzjoVar);
            c22191OoooO0O.OooO00o((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    public final void OooO0oO(zzib zzibVar, zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zzl(zzibVar);
            this.f67060OooO0OO.OooO00o((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }
}
