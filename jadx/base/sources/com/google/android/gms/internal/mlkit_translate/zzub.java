package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzub {
    private static zzub zza;
    private final zztz zzb;
    private final zzug zzc;
    private final zzue zzd;
    private zzuh zze;

    public zzub(Context context, zzua zzuaVar) {
        zzue zzueVar = new zzue(context);
        this.zzd = zzueVar;
        this.zzc = new zzug(context);
        this.zzb = new zztz(zzuaVar, zzueVar);
    }

    public static synchronized zzub zzb(Context context) {
        try {
            if (zza == null) {
                zza = new zzub(context, zzui.zza);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public final zztw zza() {
        Preconditions.checkState(this.zze != null);
        return this.zze.zzb();
    }

    public final String zzc() throws InterruptedException {
        Preconditions.checkState(this.zze != null);
        Preconditions.checkState(this.zze != null);
        if (this.zze.zze()) {
            zzud zzudVar = new zzud();
            zzudVar.zzg();
            try {
                if (this.zzb.zzc(zzudVar)) {
                    this.zze = this.zzb.zza();
                }
            } finally {
                zzudVar.zze();
                this.zzd.zza(zzoq.INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN, zzudVar);
            }
        }
        Preconditions.checkState(this.zze != null);
        return this.zze.zzd();
    }

    public final void zzd() throws InterruptedException, IOException {
        zzue zzueVar;
        zzoq zzoqVar;
        zzud zzudVar = new zzud();
        zzudVar.zzg();
        try {
            zzuh zzuhVarZza = this.zzc.zza(zzudVar);
            if (zzuhVarZza != null) {
                this.zze = zzuhVarZza;
            } else {
                final zzud zzudVar2 = new zzud();
                zzudVar2.zzg();
                try {
                    byte[] bArr = new byte[17];
                    zzuc.zza.nextBytes(bArr);
                    bArr[0] = (byte) ((bArr[0] & 15) | 112);
                    String strSubstring = Base64.encodeToString(bArr, 11).substring(0, 22);
                    Log.d("MLKitInstallationIdGenerator", "Generated installation id: ".concat(String.valueOf(strSubstring)));
                    final zztw zztwVar = new zztw(strSubstring);
                    final zztz zztzVar = this.zzb;
                    if (zzwh.zza(new zzwg() { // from class: com.google.android.gms.internal.mlkit_translate.zzty
                        @Override // com.google.android.gms.internal.mlkit_translate.zzwg
                        public final boolean zza() {
                            return zztzVar.zzb(zztwVar, zzudVar2);
                        }
                    })) {
                        zzuh zzuhVarZza2 = this.zzb.zza();
                        this.zze = zzuhVarZza2;
                        if (zzuhVarZza2 != null) {
                            this.zzc.zzc(zzuhVarZza2, zzudVar2);
                        }
                        zzudVar2.zze();
                        zzueVar = this.zzd;
                        zzoqVar = zzoq.INSTALLATION_ID_REGISTER_NEW_ID;
                    } else {
                        zzudVar2.zzd(zzsi.RPC_EXPONENTIAL_BACKOFF_FAILED);
                        zzudVar2.zzd(zzsi.RPC_ERROR);
                        zzudVar2.zze();
                        zzueVar = this.zzd;
                        zzoqVar = zzoq.INSTALLATION_ID_REGISTER_NEW_ID;
                    }
                    zzueVar.zza(zzoqVar, zzudVar2);
                } catch (Throwable th) {
                    zzudVar2.zze();
                    this.zzd.zza(zzoq.INSTALLATION_ID_REGISTER_NEW_ID, zzudVar2);
                    throw th;
                }
            }
            zzudVar.zze();
            this.zzd.zza(zzoq.INSTALLATION_ID_INIT, zzudVar);
        } catch (Throwable th2) {
            zzudVar.zze();
            this.zzd.zza(zzoq.INSTALLATION_ID_INIT, zzudVar);
            throw th2;
        }
    }
}
