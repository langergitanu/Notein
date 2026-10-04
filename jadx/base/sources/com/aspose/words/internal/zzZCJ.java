package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzZCJ extends InputStream {
    private InputStream zzWHW;
    private boolean zzWHX = true;
    private final zzZD0 zzWI0;

    public zzZCJ(zzZD0 zzzd0) {
        this.zzWI0 = zzzd0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        zzZD8 zzzd8;
        int i3 = 0;
        if (this.zzWHW == null) {
            if (!this.zzWHX || (zzzd8 = (zzZD8) this.zzWI0.zzXKC()) == null) {
                return -1;
            }
            this.zzWHX = false;
            this.zzWHW = zzzd8.zzXKJ();
        }
        while (true) {
            int i4 = this.zzWHW.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                zzZD8 zzzd82 = (zzZD8) this.zzWI0.zzXKC();
                if (zzzd82 == null) {
                    this.zzWHW = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.zzWHW = zzzd82.zzXKJ();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zzZD8 zzzd8;
        if (this.zzWHW == null) {
            if (!this.zzWHX || (zzzd8 = (zzZD8) this.zzWI0.zzXKC()) == null) {
                return -1;
            }
            this.zzWHX = false;
            this.zzWHW = zzzd8.zzXKJ();
        }
        while (true) {
            int i = this.zzWHW.read();
            if (i >= 0) {
                return i;
            }
            zzZD8 zzzd82 = (zzZD8) this.zzWI0.zzXKC();
            if (zzzd82 == null) {
                this.zzWHW = null;
                return -1;
            }
            this.zzWHW = zzzd82.zzXKJ();
        }
    }
}
