package com.google.common.p563io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
final class MultiInputStream extends InputStream {

    /* JADX INFO: renamed from: in */
    private InputStream f51748in;

    /* JADX INFO: renamed from: it */
    private Iterator<? extends ByteSource> f51749it;

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f51749it = (Iterator) Preconditions.checkNotNull(it);
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.f51749it.hasNext()) {
            this.f51748in = this.f51749it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f51748in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f51748in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f51748in = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f51748in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.f51748in;
        if (inputStream == null || j <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f51748in.skip(j - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f51748in;
            if (inputStream == null) {
                return -1;
            }
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                return i3;
            }
            advance();
        }
    }
}
