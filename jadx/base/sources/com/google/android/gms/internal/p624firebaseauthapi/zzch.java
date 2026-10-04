package com.google.android.gms.internal.p624firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes7.dex */
public final class zzch {
    private static final zzch zza = new zzch();

    private zzch() {
    }

    public static zzch zza() {
        return zza;
    }

    public static zzch zza(zzch zzchVar) throws GeneralSecurityException {
        if (zzchVar != null) {
            return zzchVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
