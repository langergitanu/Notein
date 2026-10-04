package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYH3 extends OutputStream {

    /* JADX INFO: renamed from: ed */
    private Signature f50855ed;

    public zzYH3(Signature signature) {
        this.f50855ed = signature;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f50855ed.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.f50855ed.update(bArr);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f50855ed.update((byte) i);
        } catch (SignatureException e) {
            throw new IOException(e.getMessage());
        }
    }
}
