package com.google.android.gms.internal.mlkit_translate;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
final class zzcx extends zzck {
    private static final zzcb zzd(zzda zzdaVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            return new zzch(zzdaVar.zze());
        }
        if (i2 == 6) {
            return new zzch(new zzcm(zzdaVar.zze()));
        }
        if (i2 == 7) {
            return new zzch(Boolean.valueOf(zzdaVar.zzm()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzdb.zza(i)));
        }
        zzdaVar.zzj();
        return zzcd.zza;
    }

    private static final zzcb zze(zzda zzdaVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzdaVar.zzf();
            return new zzca();
        }
        if (i2 != 2) {
            return null;
        }
        zzdaVar.zzg();
        return new zzce();
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzck
    public final /* bridge */ /* synthetic */ Object zza(zzda zzdaVar) throws IOException {
        int iZzn = zzdaVar.zzn();
        zzcb zzcbVarZze = zze(zzdaVar, iZzn);
        if (zzcbVarZze == null) {
            return zzd(zzdaVar, iZzn);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzdaVar.zzl()) {
                String strZzd = zzcbVarZze instanceof zzce ? zzdaVar.zzd() : null;
                int iZzn2 = zzdaVar.zzn();
                zzcb zzcbVarZze2 = zze(zzdaVar, iZzn2);
                zzcb zzcbVarZzd = zzcbVarZze2 == null ? zzd(zzdaVar, iZzn2) : zzcbVarZze2;
                if (zzcbVarZze instanceof zzca) {
                    ((zzca) zzcbVarZze).zza(zzcbVarZzd);
                } else {
                    ((zzce) zzcbVarZze).zzf(strZzd, zzcbVarZzd);
                }
                if (zzcbVarZze2 != null) {
                    arrayDeque.addLast(zzcbVarZze);
                    zzcbVarZze = zzcbVarZzd;
                }
            } else {
                if (zzcbVarZze instanceof zzca) {
                    zzdaVar.zzh();
                } else {
                    zzdaVar.zzi();
                }
                if (arrayDeque.isEmpty()) {
                    return zzcbVarZze;
                }
                zzcbVarZze = (zzcb) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzck
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzdc zzdcVar, zzcb zzcbVar) throws IOException {
        if (zzcbVar == null || (zzcbVar instanceof zzcd)) {
            zzdcVar.zzf();
            return;
        }
        if (zzcbVar instanceof zzch) {
            zzch zzchVar = (zzch) zzcbVar;
            if (zzchVar.zzj()) {
                zzdcVar.zzg(zzchVar.zzd());
                return;
            } else if (zzchVar.zzi()) {
                zzdcVar.zzi(zzchVar.zzh());
                return;
            } else {
                zzdcVar.zzh(zzchVar.zze());
                return;
            }
        }
        if (zzcbVar instanceof zzca) {
            zzdcVar.zza();
            Iterator it = ((zzca) zzcbVar).iterator();
            while (it.hasNext()) {
                zzb(zzdcVar, (zzcb) it.next());
            }
            zzdcVar.zzc();
            return;
        }
        if (!(zzcbVar instanceof zzce)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzcbVar.getClass())));
        }
        zzdcVar.zzb();
        for (Map.Entry entry : zzcbVar.zzb().zze()) {
            zzdcVar.zze((String) entry.getKey());
            zzb(zzdcVar, (zzcb) entry.getValue());
        }
        zzdcVar.zzd();
    }
}
