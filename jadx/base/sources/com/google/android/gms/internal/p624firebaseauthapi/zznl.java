package com.google.android.gms.internal.p624firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zznl<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public static <E extends Enum<E>, O> zznk<E, O> zza() {
        return new zznk<>();
    }

    private zznl(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final E zza(O o2) throws GeneralSecurityException {
        E e = this.zzb.get(o2);
        if (e != null) {
            return e;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o2)));
    }

    public final O zza(E e) throws GeneralSecurityException {
        O o2 = this.zza.get(e);
        if (o2 != null) {
            return o2;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e)));
    }
}
