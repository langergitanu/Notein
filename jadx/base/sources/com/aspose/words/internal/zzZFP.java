package com.aspose.words.internal;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFP extends zzZFN {
    boolean zzWQ6;
    int zzWU6;

    public zzZFP(zzZHC zzzhc, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(zzzhc, inputStream, bArr, i, i2, z);
        this.zzWQ6 = false;
        this.zzWU6 = 0;
    }

    private void zzXp(char c) throws IOException {
        StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(c, "Invalid ascii byte; value above 7-bit ascii range (", "; at pos #");
        sbOooO0OO.append(this.zzWU6 + this.zzWMI);
        sbOooO0OO.append(")");
        throw new CharConversionException(sbOooO0OO.toString());
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
            this.zzWU6 += i3;
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
        while (i4 < i5) {
            int i6 = i4 + 1;
            char c = (char) this.zzWMJ[i4];
            if (c >= 127) {
                if (c > 127) {
                    zzXp(c);
                } else if (this.zzWQ6) {
                    int i7 = this.zzWU6 + this.zzWMI;
                    zzZFN.zzZT(c, i7, i7);
                }
            }
            cArr[i] = c;
            i++;
            i4 = i6;
        }
        this.zzWMI = i5;
        return i2;
    }
}
