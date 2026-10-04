package com.aspose.words.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzZBH extends zzZBE {
    private boolean zzWHE;
    private boolean zzWHF;
    private int zzWHG;
    private int zzWHH;

    public zzZBH(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.zzWHF = false;
        this.zzWHE = true;
        this.zzWHH = inputStream.read();
        int i2 = inputStream.read();
        this.zzWHG = i2;
        if (i2 < 0) {
            throw new EOFException();
        }
        zzXKp();
    }

    private boolean zzXKp() {
        if (!this.zzWHF && this.zzWHE && this.zzWHH == 0 && this.zzWHG == 0) {
            this.zzWHF = true;
            zzXKo();
        }
        return this.zzWHF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzWHE || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.zzWHF) {
            return -1;
        }
        int i3 = this.zzWId.read(bArr, i + 2, i2 - 2);
        if (i3 < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.zzWHH;
        bArr[i + 1] = (byte) this.zzWHG;
        this.zzWHH = this.zzWId.read();
        int i4 = this.zzWId.read();
        this.zzWHG = i4;
        if (i4 >= 0) {
            return i3 + 2;
        }
        throw new EOFException();
    }

    public final void zzOP(boolean z) {
        this.zzWHE = z;
        zzXKp();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (zzXKp()) {
            return -1;
        }
        int i = this.zzWId.read();
        if (i >= 0) {
            int i2 = this.zzWHH;
            this.zzWHH = this.zzWHG;
            this.zzWHG = i;
            return i2;
        }
        throw new EOFException();
    }
}
