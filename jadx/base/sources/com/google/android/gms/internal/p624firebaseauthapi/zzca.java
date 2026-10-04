package com.google.android.gms.internal.p624firebaseauthapi;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class zzca {
    private static final CopyOnWriteArrayList<zzbx> zza = new CopyOnWriteArrayList<>();

    public static zzbx zza(String str) throws GeneralSecurityException {
        for (zzbx zzbxVar : zza) {
            if (zzbxVar.zzb(str)) {
                return zzbxVar;
            }
        }
        throw new GeneralSecurityException(OooO00o.OooO00o("No KMS client does support: ", str));
    }
}
