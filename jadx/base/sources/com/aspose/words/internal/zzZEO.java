package com.aspose.words.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZEO extends zzYFZ implements zzZET {
    static final zzZDV zzWKm;
    protected zzZQL zzWKo = null;
    protected zzZDY<zzZGU, zzZGN> zzWKn = null;
    private zzZDV zzWQm = zzWKm;
    protected final zzZHC zzWML = zzZHC.zzXPT();

    static {
        zzZDV zzzdvZzXLK = zzZE4.zzXLK();
        zzWKm = zzzdvZzXLK;
        zzzdvZzXLK.zzXLw();
    }

    private zzYFW zzS(InputStream inputStream) throws zzZQS {
        if (inputStream != null) {
            return zzY(zzXMa(), null, zzZF8.zzZ((String) null, (zzZF7) null, inputStream), false, false);
        }
        throw new IllegalArgumentException("Null InputStream is not a valid argument");
    }

    private zzZHC zzXMa() {
        return this.zzWML.zzZ(this.zzWQm.zzXLx());
    }

    public final zzZHC zzXMb() {
        return this.zzWML;
    }

    public final void zzXPj() {
        this.zzWML.zzXPj();
    }

    @Override // com.aspose.words.internal.zzZET
    public final synchronized void zzY(zzZDV zzzdv) {
        try {
            if (zzzdv.zzW(this.zzWQm)) {
                if (zzzdv.size() <= 12000 && zzzdv.version() <= 500) {
                    this.zzWQm.zzX(zzzdv);
                }
                this.zzWQm = zzWKm;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.aspose.words.internal.zzZET
    public final synchronized zzZGN zzZ(zzZGU zzzgu) {
        zzZDY<zzZGU, zzZGN> zzzdy = this.zzWKn;
        if (zzzdy == null) {
            return null;
        }
        return zzzdy.zzYG(zzzgu);
    }

    @Override // com.aspose.words.internal.zzZET
    public final synchronized void zzZ(zzZGU zzzgu, zzZGN zzzgn) {
        try {
            if (this.zzWKn == null) {
                this.zzWKn = new zzZDY<>(this.zzWML.zzXPR());
            }
            this.zzWKn.zzB(zzzgu, zzzgn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzZQR zzZ(zzZQR zzzqr, zzZQX zzzqx) throws zzZQS {
        zzYFR zzyfr = new zzYFR(zzzqr, zzzqx);
        if (!zzzqx.zzZ(zzyfr)) {
            zzyfr.next();
        }
        return zzyfr;
    }

    private zzYFW zzY(zzZHC zzzhc, zzZF7 zzzf7, zzZFE zzzfe, boolean z, boolean z2) throws zzZQS {
        return zzZ(zzzhc, null, zzzfe, false, false);
    }

    private zzYFW zzY(Reader reader) throws zzZQS {
        return zzY(zzXMa(), null, zzZFA.zzZ(null, null, reader, null), false, false);
    }

    @Override // com.aspose.words.internal.zzZQW
    public final zzZQR zzZ(InputStream inputStream) throws zzZQS {
        return zzS(inputStream);
    }

    public final zzZQR zzZ(Reader reader) throws zzZQS {
        return zzY(reader);
    }

    private zzYFW zzZ(zzZHC zzzhc, zzZF7 zzzf7, zzZFE zzzfe, boolean z, boolean z2) throws zzZQS {
        if (!z2) {
            z2 = zzzhc.zzXPM();
        }
        try {
            Reader readerZzZ = zzzfe.zzZ(zzzhc, true, 0);
            if (zzzfe.zzXNx()) {
                zzzhc.zzXPk();
            }
            return zzZEP.zzZ(zzZFD.zzZ(zzzhc, zzzfe, zzzf7, readerZzZ, z2), this, zzzhc, zzzfe, z);
        } catch (IOException e) {
            throw new zzZFU(e);
        }
    }
}
