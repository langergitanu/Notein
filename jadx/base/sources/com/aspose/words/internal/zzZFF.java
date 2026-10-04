package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFF extends zzZFN {
    int zz8r;
    boolean zzWQ6;

    public zzZFF(zzZHC zzzhc, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(zzzhc, inputStream, bArr, i, i2, z);
        this.zzWQ6 = false;
        this.zz8r = 0;
    }

    @Override // com.aspose.words.internal.zzZFN, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // com.aspose.words.internal.zzZFN, java.io.Reader
    public final /* bridge */ /* synthetic */ int read() throws IOException {
        return super.read();
    }

    @Override // com.aspose.words.internal.zzZFN
    public final void zzXNI() {
        this.zzWQ6 = true;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        if (i < 0 || i + i2 > cArr.length) {
            zzZFN.zzT(cArr, i, i2);
        }
        if (this.zzWMJ == null) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int i3 = this.zzWMH;
        int iZzXNE = i3 - this.zzWMI;
        if (iZzXNE <= 0) {
            this.zz8r += i3;
            iZzXNE = zzXNE();
            if (iZzXNE <= 0) {
                if (iZzXNE == 0) {
                    zzZFN.zzXNC();
                }
                zzXND();
                return -1;
            }
        }
        if (i2 > iZzXNE) {
            i2 = iZzXNE;
        }
        int i4 = this.zzWMI;
        int i5 = i4 + i2;
        if (this.zzWQ6) {
            while (i4 < i5) {
                int i6 = i4 + 1;
                char c = (char) (this.zzWMJ[i4] & 255);
                if (c >= 127 && c <= 159) {
                    if (c == 133) {
                        c = '\n';
                    } else if (c >= 127) {
                        int i7 = this.zz8r + i6;
                        zzZFN.zzZT(c, i7, i7);
                    }
                }
                cArr[i] = c;
                i++;
                i4 = i6;
            }
        } else {
            while (i4 < i5) {
                cArr[i] = (char) (this.zzWMJ[i4] & 255);
                i++;
                i4++;
            }
        }
        this.zzWMI = i5;
        return i2;
    }
}
