package com.google.android.gms.internal.mlkit_translate;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzbh {
    static final zzbh zzb = zzb();

    public /* synthetic */ zzbh(zzbg zzbgVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzbh zzb() {
        Object[] objArr = 0;
        try {
            try {
                return new zzbd(null);
            } catch (ClassNotFoundException unused) {
                return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new zzbf(0 == true ? 1 : 0) : new zzav(0 == true ? 1 : 0);
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused2) {
            return new zzbf(objArr == true ? 1 : 0);
        }
    }

    public abstract File zza();
}
