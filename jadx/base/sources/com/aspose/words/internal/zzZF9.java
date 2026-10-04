package com.aspose.words.internal;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
public class zzZF9 extends zzZFO {
    final zzZHC zzWML;
    final boolean zzWMf;
    protected Reader zzWMg;
    int zzWMs;
    int zzWMt;
    int zzWMu;

    public zzZF9(zzZHC zzzhc, zzZF1 zzzf1, String str, String str2, zzZF7 zzzf7, Reader reader, boolean z) {
        super(zzzf1, str, str2, zzzf7);
        this.zzWMu = 0;
        this.zzWMt = 1;
        this.zzWMs = 0;
        this.zzWML = zzzhc;
        this.zzWMg = reader;
        this.zzWMf = z;
        this.zzZnz = zzzhc.zzh5(zzzhc.zzXPH());
    }

    private void zzP4(boolean z) throws IOException {
        char[] cArr = this.zzZnz;
        if (cArr != null) {
            this.zzZnz = null;
            this.zzWML.zzN(cArr);
        }
        Reader reader = this.zzWMg;
        if (reader != null) {
            if (reader instanceof zzZFN) {
                ((zzZFN) reader).zzXND();
            }
            if (z) {
                Reader reader2 = this.zzWMg;
                this.zzWMg = null;
                reader2.close();
            }
        }
    }

    @Override // com.aspose.words.internal.zzZF1
    public final void close() throws IOException {
        if (this.zzZnz != null) {
            zzP4(this.zzWMf);
        }
    }

    @Override // com.aspose.words.internal.zzZF1
    public int zzW(zzZF3 zzzf3) throws IOException, zzZQS {
        char[] cArr = this.zzZnz;
        if (cArr == null) {
            return -1;
        }
        int i = this.zzWMg.read(cArr, 0, cArr.length);
        if (i > 0) {
            zzzf3.zzWLX = this.zzZnz;
            zzzf3.zzWMi = 0;
            this.zzWMR = i;
            zzzf3.zzWMh = i;
            return i;
        }
        this.zzWMR = 0;
        zzzf3.zzWMi = 0;
        zzzf3.zzWMh = 0;
        if (i != 0) {
            return -1;
        }
        throw new zzZFV("Reader (of type " + this.zzWMg.getClass().getName() + ") returned 0 characters, even when asked to read up to " + this.zzZnz.length, zzXNG());
    }

    @Override // com.aspose.words.internal.zzZF1
    public final boolean zzXNB() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZFO, com.aspose.words.internal.zzZF1
    public final void zzZ(zzZF3 zzzf3) {
        zzzf3.zzWLW = this.zzWMu;
        zzzf3.zzWLV = this.zzWMt;
        zzzf3.zzWLU = this.zzWMs;
    }

    public final void zzZS(int i, int i2, int i3) {
        this.zzWMu = i;
        this.zzWMt = i2;
        this.zzWMs = i3;
    }

    @Override // com.aspose.words.internal.zzZF1
    public boolean zzZ(zzZF3 zzzf3, int i) throws IOException, zzZQS {
        char[] cArr = this.zzZnz;
        if (cArr == null) {
            return false;
        }
        int i2 = zzzf3.zzWMi;
        int i3 = this.zzWMR - i2;
        zzzf3.zzWLW += (long) i2;
        zzzf3.zzWLU -= i2;
        if (i3 > 0) {
            System.arraycopy(cArr, i2, cArr, 0, i3);
            i -= i3;
        }
        zzzf3.zzWLX = this.zzZnz;
        zzzf3.zzWMi = 0;
        this.zzWMR = i3;
        while (i > 0) {
            char[] cArr2 = this.zzZnz;
            int length = cArr2.length - i3;
            int i4 = this.zzWMg.read(cArr2, i3, length);
            if (i4 <= 0) {
                if (i4 != 0) {
                    this.zzWMR = i3;
                    zzzf3.zzWMh = i3;
                    return false;
                }
                throw new zzZFV("Reader (of type " + this.zzWMg.getClass().getName() + ") returned 0 characters, even when asked to read up to " + length, zzXNG());
            }
            i3 += i4;
            i -= i4;
        }
        this.zzWMR = i3;
        zzzf3.zzWMh = i3;
        return true;
    }
}
