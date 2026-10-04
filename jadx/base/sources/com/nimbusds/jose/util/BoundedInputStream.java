package com.nimbusds.jose.util;

import android.support.v4.media.session.OooO00o;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class BoundedInputStream extends InputStream {

    /* JADX INFO: renamed from: in */
    private final InputStream f57432in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream, long j) {
        this.pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j;
        this.f57432in = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            return this.f57432in.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.propagateClose) {
            this.f57432in.close();
        }
    }

    public long getLimitBytes() {
        return this.max;
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.f57432in.mark(i);
        this.mark = this.pos;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f57432in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            throw new IOException(OooO00o.OooO00o(this.max, " bytes", new StringBuilder("Exceeded configured input limit of ")));
        }
        int i = this.f57432in.read();
        this.pos++;
        return i;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f57432in.reset();
        this.pos = this.mark;
    }

    public void setPropagateClose(boolean z) {
        this.propagateClose = z;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.max;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.pos);
        }
        long jSkip = this.f57432in.skip(j);
        this.pos += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f57432in.toString();
    }

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            throw new IOException(OooO00o.OooO00o(this.max, " bytes", new StringBuilder("Exceeded configured input limit of ")));
        }
        int i3 = this.f57432in.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.pos + ((long) i3);
        this.pos = j2;
        long j3 = this.max;
        if (j3 < 0 || j2 < j3) {
            return i3;
        }
        throw new IOException(OooO00o.OooO00o(this.max, " bytes", new StringBuilder("Exceeded configured input limit of ")));
    }
}
