package com.nimbusds.jose.crypto.p599bc;

import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;

/* JADX INFO: loaded from: classes9.dex */
public final class BouncyCastleFIPSProviderSingleton {
    private static BouncyCastleFipsProvider bouncyCastleFIPSProvider;

    private BouncyCastleFIPSProviderSingleton() {
    }

    public static BouncyCastleFipsProvider getInstance() {
        if (bouncyCastleFIPSProvider == null) {
            bouncyCastleFIPSProvider = new BouncyCastleFipsProvider();
        }
        return bouncyCastleFIPSProvider;
    }
}
