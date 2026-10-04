package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.FipsUnapprovedOperationException;
import com.aspose.words.internal.zzYW0;
import com.aspose.words.internal.zzZ0P;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzQU implements zzH7 {
    private zzZ4V zzLK;

    public zzQU(int i) {
        zzZ4M zzz4mZzYn = zzYn(i);
        if (zzz4mZzYn instanceof zzZ0S) {
            new zzZ0P.zzR();
            this.zzLK = zzZ0P.zzR.zzX((zzZ0P.zzQ) zzz4mZzYn);
        } else if (!zzS1.isInFipsMode()) {
            new zzYW0.zzR();
            this.zzLK = zzYW0.zzR.zzZ((zzYXO) zzz4mZzYn);
        } else {
            throw new FipsUnapprovedOperationException("An attempt to open a file which uses " + zzYm(i).getName() + " algorithm. This algorithm is not on the FIPS approved algorithms list.");
        }
    }

    public static zzZ5K zzYm(int i) {
        if (i == 1) {
            return zzZ0P.zzZ.zzWdL;
        }
        if (i == 2) {
            return zzZ0P.zzZ.zzWdJ;
        }
        if (i == 3) {
            return zzZ0P.zzZ.zzWdH;
        }
        if (i == 4) {
            return zzZ0P.zzZ.zzWdF;
        }
        if (i == 5) {
            return zzZ0P.zzZ.zzWdD;
        }
        if (i == 8) {
            return zzYW0.zzZ.zzW1W;
        }
        throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Unsupported hash algorithm: "));
    }

    private static zzZ4M zzYn(int i) {
        if (i == 1) {
            return zzZ0P.zzWex;
        }
        if (i == 2) {
            return zzZ0P.zzWev;
        }
        if (i == 3) {
            return zzZ0P.zzWet;
        }
        if (i == 4) {
            return zzZ0P.zzWer;
        }
        if (i == 5) {
            return zzZ0P.zzWep;
        }
        if (i == 8) {
            return zzYW0.zzW2d;
        }
        throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Unsupported hash algorithm: "));
    }

    @Override // com.aspose.words.internal.zzH7
    public final void reset() {
        this.zzLK.reset();
    }

    @Override // com.aspose.words.internal.zzH7
    public final int zzQI() {
        return this.zzLK.zzQI();
    }

    @Override // com.aspose.words.internal.zzH7
    public final void zzW(byte[] bArr, int i, int i2) {
        this.zzLK.zzXGT().update(bArr, i, i2);
    }

    @Override // com.aspose.words.internal.zzH7
    public final int zzo(byte[] bArr) {
        try {
            this.zzLK.zzXGT().flush();
            this.zzLK.zzXGT().close();
        } catch (IOException e) {
            zzZHV.zzZ(e);
        }
        byte[] bArrZzXI5 = this.zzLK.zzXI5();
        System.arraycopy(bArrZzXI5, 0, bArr, 0, bArrZzXI5.length);
        return bArrZzXI5.length;
    }
}
