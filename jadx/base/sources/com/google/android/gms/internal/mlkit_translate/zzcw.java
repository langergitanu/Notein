package com.google.android.gms.internal.mlkit_translate;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzcw {
    public static zzcb zza(zzda zzdaVar) throws zzcf {
        boolean z;
        try {
            try {
                zzdaVar.zzn();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return (zzcb) zzcy.zza.zza(zzdaVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return zzcd.zza;
                }
                throw new zzci(e);
            }
        } catch (zzdd e3) {
            throw new zzci(e3);
        } catch (IOException e4) {
            throw new zzcc(e4);
        } catch (NumberFormatException e5) {
            throw new zzci(e5);
        }
    }
}
