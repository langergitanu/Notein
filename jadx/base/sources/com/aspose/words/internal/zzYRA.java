package com.aspose.words.internal;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRA implements KeyStore.LoadStoreParameter {
    private final OutputStream out;
    private final boolean zzVWY;
    private final KeyStore.ProtectionParameter zzVX6;

    public final OutputStream getOutputStream() {
        return this.out;
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public final KeyStore.ProtectionParameter getProtectionParameter() {
        return this.zzVX6;
    }

    public final boolean zzXBX() {
        return this.zzVWY;
    }
}
