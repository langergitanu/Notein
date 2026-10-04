package com.google.android.gms.internal.p624firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
final class zzzm<JcePrimitiveT> implements zzzn<JcePrimitiveT> {
    private final zzzp<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzzn
    public final JcePrimitiveT zza(String str) throws GeneralSecurityException {
        Iterator<Provider> it = zzzj.zza(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzzm(zzzp<JcePrimitiveT> zzzpVar) {
        this.zza = zzzpVar;
    }
}
