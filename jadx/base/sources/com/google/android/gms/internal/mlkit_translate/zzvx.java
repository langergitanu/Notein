package com.google.android.gms.internal.mlkit_translate;

import android.util.Log;
import java.net.HttpURLConnection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
final class zzvx implements zzwg {
    final /* synthetic */ zzvy zza;
    private final String zzb;
    private final Date zzc;
    private final zzud zzd;
    private zzw zze;
    private zzvq zzf;

    public zzvx(zzvy zzvyVar, String str, Date date, zzud zzudVar) {
        this.zza = zzvyVar;
        this.zzb = str;
        this.zzc = date;
        this.zzd = zzudVar;
    }

    @Override // com.google.android.gms.internal.mlkit_translate.zzwg
    public final boolean zza() throws zzwa {
        try {
            zzvr zzvrVar = this.zza.zzg;
            Log.d("MLKit RemoteConfigRestC", "Creating HTTP connection to remote config service");
            HttpURLConnection httpURLConnectionZzb = zzvrVar.zzb();
            zzvy zzvyVar = this.zza;
            zzvt zzvtVarZza = zzvyVar.zzg.zza(httpURLConnectionZzb, zzvyVar.zzf.zza().zza(), this.zzb, zzw.zzc(), null, zzw.zzc(), this.zzc, "o:a:mlkit:1.0.0", null, this.zzd);
            Log.d("MLKit RemoteConfigRestC", "Got FetchResponse");
            zzvq zzvqVarZza = zzvtVarZza.zza();
            this.zzf = zzvqVarZza;
            JSONObject jSONObjectZzc = zzvqVarZza.zzc();
            try {
                this.zze = zzvy.zzj(jSONObjectZzc);
                return true;
            } catch (JSONException e) {
                this.zzd.zzb(zzsi.RPC_RETURNED_MALFORMED_RESULT);
                Log.e("MLKit RemoteConfigRestC", "Fetched remote config setting has invalid format: ".concat(String.valueOf(jSONObjectZzc)), e);
                return false;
            }
        } catch (zzwa e2) {
            Log.e("MLKit RemoteConfigRestC", "Creating HTTP connection to remote config service failed", e2);
            this.zzd.zzb(zzsi.NO_CONNECTION);
            return false;
        }
    }

    public final zzw zzb() {
        return this.zze;
    }

    public final zzvq zzc() {
        return this.zzf;
    }
}
