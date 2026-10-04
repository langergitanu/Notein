package com.google.android.gms.internal.p624firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class zzzu implements zzzp<KeyFactory> {
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzzp
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
