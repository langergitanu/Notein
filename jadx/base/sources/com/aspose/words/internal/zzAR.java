package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.zzZ0P;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzAR implements zzGG {
    private zzZ4T zzse;
    private final int zzsf;

    public zzAR(int i) {
        this.zzsf = i;
    }

    private static zzZ0P.zzY zzVd(int i) {
        if (i == 1) {
            return zzZ0P.zzWew;
        }
        if (i == 2) {
            return zzZ0P.zzWeu;
        }
        if (i == 3) {
            return zzZ0P.zzWes;
        }
        if (i == 4) {
            return zzZ0P.zzWeq;
        }
        if (i == 5) {
            return zzZ0P.zzWeo;
        }
        throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Unsupported hash algorithm: "));
    }

    @Override // com.aspose.words.internal.zzGG
    public final int getSize() {
        return this.zzse.zzXGR();
    }

    @Override // com.aspose.words.internal.zzGG
    public final void init(byte[] bArr) {
        zzZ0P.zzY zzyZzVd = zzVd(this.zzsf);
        this.zzse = new zzZ0P.zzS().zzZ(new zzZ43(zzyZzVd, bArr), zzyZzVd);
    }

    @Override // com.aspose.words.internal.zzGG
    public final byte[] zz1(byte[] bArr) {
        try {
            this.zzse.zzXGQ().update(bArr, 0, bArr.length);
            this.zzse.zzXGQ().flush();
            this.zzse.zzXGQ().close();
        } catch (IOException e) {
            zzZHV.zzZ(e);
        }
        return this.zzse.zzXGP();
    }
}
