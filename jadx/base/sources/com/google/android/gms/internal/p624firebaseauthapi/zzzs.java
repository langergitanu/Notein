package com.google.android.gms.internal.p624firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes7.dex */
public final class zzzs implements zzzp<Cipher> {
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzzp
    public final /* synthetic */ Cipher zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
