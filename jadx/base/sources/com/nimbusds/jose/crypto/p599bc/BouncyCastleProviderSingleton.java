package com.nimbusds.jose.crypto.p599bc;

import oO0ooO00.C34267OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final class BouncyCastleProviderSingleton {
    private static C34267OooO00o bouncyCastleProvider;

    private BouncyCastleProviderSingleton() {
    }

    public static C34267OooO00o getInstance() {
        if (bouncyCastleProvider == null) {
            bouncyCastleProvider = new C34267OooO00o();
        }
        return bouncyCastleProvider;
    }
}
