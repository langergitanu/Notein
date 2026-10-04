package com.aspose.words.internal;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
final class zzZGI {
    int zzWNJ;
    int zzWNK;
    final boolean zzWNL;
    final boolean zzWNM;
    final boolean zzWNN;
    final Writer zzZGU;

    public final void zzU(char[] cArr, int i) throws zzZQS {
        int i2 = this.zzWNJ;
        if (i2 < i) {
            if (this.zzWNK > 0) {
                try {
                    this.zzZGU.write(cArr, i2, i - i2);
                } catch (IOException e) {
                    throw new zzZFU(e);
                }
            }
            this.zzWNJ = i;
        }
    }

    public final void zzXOt() {
        this.zzWNK--;
    }

    public final void zzXx(char c) throws zzZQS {
        if (this.zzWNK > 0) {
            try {
                this.zzZGU.write(c);
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
    }

    public final void zzgW(int i) {
        this.zzWNK++;
        this.zzWNJ = i;
    }

    public final void zzy3(String str) throws zzZQS {
        if (this.zzWNK > 0) {
            try {
                this.zzZGU.write(str);
            } catch (IOException e) {
                throw new zzZFU(e);
            }
        }
    }
}
