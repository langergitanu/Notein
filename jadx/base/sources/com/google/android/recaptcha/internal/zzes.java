package com.google.android.recaptcha.internal;

import android.content.Context;
import com.huawei.hms.network.embedded.C18126c2;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final InterfaceC33636Oooo00o zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = interfaceC33636Oooo00o;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzei zzeiVar;
        zztx zztxVarZzk;
        int iZzN;
        int i;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : OooOo.oo0o0Oo(20, 20, zzeiVar2.zzd())) {
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        iZzN = zztxVarZzk.zzN();
                        i = iZzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (iZzN == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzrdVarZzi.zzq(zztxVarZzk.zzf());
                    } else if (i == 1) {
                        zzrdVarZzi.zzr(zztxVarZzk.zzg());
                    } else {
                        if (i != 2) {
                            throw new C32442OooOO0o();
                        }
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                    arrayList.add(zzejVar);
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), C18126c2.f54377z, C18126c2.f54377z);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        C33609OooO0oo.OooO0OO(this.zzd, null, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}
