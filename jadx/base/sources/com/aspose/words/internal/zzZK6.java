package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK6 extends OutputStream {
    zzZOP zzZO7;

    public zzZK6(zzZOP zzzop) {
        this.zzZO7 = zzzop;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.zzZO7.close();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.zzZO7.flush();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.zzZO7.writeByte((byte) i);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.zzZO7.write(bArr, i, i2);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }
}
