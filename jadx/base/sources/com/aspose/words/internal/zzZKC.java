package com.aspose.words.internal;

import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public class zzZKC extends zzZOP {
    private InputStream zzZPb;
    private zzZ zzZPa = new zzZ(0);
    private long zzOE = -1;
    private boolean mClosed = false;

    public zzZKC(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            throw new IOException("InputStream is null");
        }
        if (!inputStream.markSupported()) {
            throw new IOException("Only rewindable two-way streams can be wrapped!");
        }
        this.zzZPb = inputStream;
        inputStream.mark(Integer.MAX_VALUE);
    }

    private long zzYq(long j) throws IOException {
        long j2 = j - this.zzZPa.zzZP9;
        if (j2 <= 0) {
            return 0L;
        }
        return zzYr(j2);
    }

    private long zzYr(long j) throws IOException {
        int i;
        long j2 = (j / 65536) + 1;
        byte[] bArr = new byte[65536];
        long j3 = 0;
        for (long j4 = 0; j4 < j2 && (i = this.zzZPb.read(bArr)) >= 0; j4++) {
            j3 += (long) i;
        }
        return j3;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canRead() {
        return !this.mClosed;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canWrite() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void close() throws IOException {
        this.zzZPb.close();
        this.mClosed = true;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void flush() throws IOException {
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getLength() throws IOException {
        long j = this.zzOE;
        if (j >= 0) {
            return j;
        }
        zzZ zzz = this.zzZPa;
        long j2 = zzz.zzZP9;
        zzH(zzz.zzZP8);
        long jZzYq = zzYq(LocationRequestCompat.PASSIVE_INTERVAL) + this.zzZPa.zzZP9;
        this.zzOE = jZzYq;
        zzH(j2);
        return jZzYq;
    }

    @Override // com.aspose.words.internal.zzZOP
    public long getPosition() throws IOException {
        return this.zzZPa.zzZP9;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzZPb.read(bArr, i, i2);
        if (i3 < 0) {
            return 0;
        }
        this.zzZPa.zzYp(i3);
        return i3;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void setLength(long j) {
        this.zzOE = j;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("Can't write to the backing InputStream.");
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void writeByte(byte b) throws IOException {
        throw new IOException("Can't write to the backing InputStream.");
    }

    @Override // com.aspose.words.internal.zzZOP
    public void zzH(long j) throws IOException {
        zzYq(j);
        this.zzZPb.reset();
        this.zzZPa.set(this.zzZPb.skip(j));
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean zzRG() {
        return !this.mClosed;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int zzRI() throws IOException {
        int i = this.zzZPb.read();
        if (i >= 0) {
            this.zzZPa.zzYp(1L);
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long zzU(long j, int i) throws IOException {
        if (i == 0) {
            zzH(j);
        } else if (i == 1) {
            zzH(this.zzZPa.zzYp(j));
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown SeekOrigin type.");
            }
            zzH(getLength() + j);
        }
        return this.zzZPa.zzZP9;
    }

    public static class zzZ {
        long zzZP8;
        long zzZP9;

        private zzZ() {
            this.zzZP9 = 0L;
            this.zzZP8 = 0L;
        }

        private void zzeZ() {
            long j = this.zzZP9;
            if (j > this.zzZP8) {
                this.zzZP8 = j;
            }
        }

        public final void set(long j) {
            this.zzZP9 = j;
            zzeZ();
        }

        public final long zzYp(long j) {
            this.zzZP9 += j;
            zzeZ();
            return this.zzZP9;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }
}
