package com.aspose.words.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes5.dex */
public class zzYRI implements KeyStore.LoadStoreParameter {

    /* JADX INFO: renamed from: in */
    private final InputStream f51255in;
    private final OutputStream out;
    private final KeyStore.ProtectionParameter zzVX6;

    public final InputStream getInputStream() {
        if (this.out == null) {
            return this.f51255in;
        }
        throw new UnsupportedOperationException("parameter configured for storage OutputStream present");
    }

    public final OutputStream getOutputStream() {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            return outputStream;
        }
        throw new UnsupportedOperationException("parameter not configured for storage - no OutputStream");
    }

    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return this.zzVX6;
    }
}
