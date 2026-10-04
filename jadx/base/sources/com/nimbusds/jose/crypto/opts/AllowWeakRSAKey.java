package com.nimbusds.jose.crypto.opts;

import com.nimbusds.jose.JWSSignerOption;

/* JADX INFO: loaded from: classes9.dex */
public final class AllowWeakRSAKey implements JWSSignerOption {
    private static final AllowWeakRSAKey SINGLETON = new AllowWeakRSAKey();

    private AllowWeakRSAKey() {
    }

    public static AllowWeakRSAKey getInstance() {
        return SINGLETON;
    }

    public String toString() {
        return "AllowWeakRSAKey";
    }
}
