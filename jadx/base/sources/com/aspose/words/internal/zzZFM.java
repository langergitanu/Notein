package com.aspose.words.internal;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFM extends zzZF9 {
    boolean zzWMB;
    boolean zzWMC;
    int zzWMD;
    zzZDU zzWME;

    public zzZFM(zzZHC zzzhc, String str, zzZF7 zzzf7, Reader reader, boolean z) {
        super(zzzhc, null, null, null, zzzf7, reader, z);
        this.zzWME = null;
        this.zzWMD = 0;
        this.zzWMC = false;
        this.zzWMB = false;
    }

    private void zzUR(int i, int i2) {
        if (!this.zzWMC) {
            this.zzWME.zzI(this.zzZnz, i, i2 - i);
            return;
        }
        char[] cArr = this.zzZnz;
        char[] cArrZzXLk = this.zzWME.zzXLk();
        int iZzXLj = this.zzWME.zzXLj();
        if (this.zzWMB && cArr[i] == '\n') {
            i++;
        }
        while (i < i2) {
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\r') {
                if (i3 >= i2) {
                    this.zzWMB = true;
                } else if (cArr[i3] == '\n') {
                    i3 = i + 2;
                }
                c = '\n';
            }
            i = i3;
            int i4 = iZzXLj + 1;
            cArrZzXLk[iZzXLj] = c;
            if (i4 >= cArrZzXLk.length) {
                cArrZzXLk = this.zzWME.zzXLi();
                iZzXLj = 0;
            } else {
                iZzXLj = i4;
            }
        }
        this.zzWME.zzge(iZzXLj);
    }

    @Override // com.aspose.words.internal.zzZF9, com.aspose.words.internal.zzZF1
    public final int zzW(zzZF3 zzzf3) throws IOException, zzZQS {
        if (this.zzWME != null) {
            int i = this.zzWMR;
            int i2 = this.zzWMD;
            if (i > i2) {
                zzUR(i2, i);
            }
            this.zzWMD = 0;
        }
        return super.zzW(zzzf3);
    }

    @Override // com.aspose.words.internal.zzZF9, com.aspose.words.internal.zzZF1
    public final boolean zzZ(zzZF3 zzzf3, int i) throws IOException, zzZQS {
        if (this.zzWME != null) {
            int i2 = zzzf3.zzWMi;
            if (this.zzWMR - i2 > 0) {
                int i3 = this.zzWMD;
                if (i2 > i3) {
                    zzUR(i3, i2);
                }
                this.zzWMD = 0;
            }
        }
        return super.zzZ(zzzf3, i);
    }

    public final void zzgR(int i) {
        if (this.zzWME != null) {
            int i2 = this.zzWMD;
            if (i > i2) {
                zzUR(i2, i);
            }
            this.zzWME = null;
        }
    }

    public final void zzZ(zzZDU zzzdu, int i, boolean z) {
        this.zzWME = zzzdu;
        this.zzWMD = i;
        this.zzWMC = z;
        this.zzWMB = false;
    }
}
