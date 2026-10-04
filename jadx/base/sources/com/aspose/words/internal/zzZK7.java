package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK7 extends InputStream {
    private long zzZO6 = -1;
    zzZOP zzZO7;

    public zzZK7(zzZOP zzzop) {
        this.zzZO7 = zzzop;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return (int) (this.zzZO7.getLength() - this.zzZO7.getPosition());
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.zzZO7.close();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        try {
            this.zzZO6 = this.zzZO7.getPosition();
        } catch (Exception e) {
            zzZHV.zzZ(e);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.zzZO7.zzRI();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        long j = this.zzZO6;
        if (j > -1) {
            try {
                this.zzZO7.zzH(j);
            } catch (Exception e) {
                zzZHV.zzZ(e);
            }
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            long position = this.zzZO7.getPosition();
            long length = this.zzZO7.getLength();
            if (position >= length) {
                return 0L;
            }
            if (position + j > length) {
                j = length - position;
            }
            return this.zzZO7.zzU(j, 1) - position;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            int i3 = this.zzZO7.read(bArr, i, i2);
            if (i3 == 0) {
                return -1;
            }
            return i3;
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }
}
