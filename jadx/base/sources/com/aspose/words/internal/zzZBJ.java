package com.aspose.words.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzZBJ extends zzZBE {
    private static final byte[] zzWHK = new byte[0];
    private int zzWHI;
    private final int zzWHJ;

    public zzZBJ(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.zzWHJ = i;
        this.zzWHI = i;
        if (i == 0) {
            zzXKo();
        }
    }

    @Override // com.aspose.words.internal.zzZBE
    public final int getRemaining() {
        return this.zzWHI;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.zzWHI == 0) {
            return -1;
        }
        int i = this.zzWId.read();
        if (i >= 0) {
            int i2 = this.zzWHI - 1;
            this.zzWHI = i2;
            if (i2 == 0) {
                zzXKo();
            }
            return i;
        }
        throw new EOFException("DEF length " + this.zzWHJ + " object truncated by " + this.zzWHI);
    }

    public final byte[] toByteArray() throws IOException {
        int i = this.zzWHI;
        if (i == 0) {
            return zzWHK;
        }
        byte[] bArr = new byte[i];
        int iZzZ = i - zzYG9.zzZ(this.zzWId, bArr);
        this.zzWHI = iZzZ;
        if (iZzZ == 0) {
            zzXKo();
            return bArr;
        }
        throw new EOFException("DEF length " + this.zzWHJ + " object truncated by " + this.zzWHI);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzWHI;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.zzWId.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.zzWHI - i4;
            this.zzWHI = i5;
            if (i5 == 0) {
                zzXKo();
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.zzWHJ + " object truncated by " + this.zzWHI);
    }
}
