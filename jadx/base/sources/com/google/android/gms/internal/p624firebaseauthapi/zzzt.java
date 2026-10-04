package com.google.android.gms.internal.p624firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class zzzt implements zzzp<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p624firebaseauthapi.zzzp
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
