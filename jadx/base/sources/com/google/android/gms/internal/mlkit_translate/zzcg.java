package com.google.android.gms.internal.mlkit_translate;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcg {
    public static zzcb zza(zzda zzdaVar) throws zzcc, zzci {
        zzcj zzcjVarZzb = zzdaVar.zzb();
        if (zzcjVarZzb == zzcj.LEGACY_STRICT) {
            zzdaVar.zzk(zzcj.LENIENT);
        }
        try {
            try {
                return zzcw.zza(zzdaVar);
            } catch (OutOfMemoryError e) {
                throw new zzcf("Failed parsing JSON source: " + zzdaVar.toString() + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new zzcf("Failed parsing JSON source: " + zzdaVar.toString() + " to Json", e2);
            }
        } finally {
            zzdaVar.zzk(zzcjVarZzb);
        }
    }

    public static zzcb zzb(String str) throws zzci {
        try {
            zzda zzdaVar = new zzda(new StringReader(str));
            zzcb zzcbVarZza = zza(zzdaVar);
            if (!(zzcbVarZza instanceof zzcd) && zzdaVar.zzn() != 10) {
                throw new zzci("Did not consume the entire document.");
            }
            return zzcbVarZza;
        } catch (zzdd e) {
            throw new zzci(e);
        } catch (IOException e2) {
            throw new zzcc(e2);
        } catch (NumberFormatException e3) {
            throw new zzci(e3);
        }
    }
}
