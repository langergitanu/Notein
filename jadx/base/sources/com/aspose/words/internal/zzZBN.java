package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBN extends zzZD4 {
    private int zzWHP;

    public zzZBN() {
        this.zzWHP = -1;
    }

    private int zzXKr() throws IOException {
        if (this.zzWHP < 0) {
            Enumeration enumerationZzXKE = zzXKE();
            int iZzXL6 = 0;
            while (enumerationZzXKE.hasMoreElements()) {
                iZzXL6 += ((zzZDK) enumerationZzXKE.nextElement()).zzXL0().zzXL2().zzXL6();
            }
            this.zzWHP = iZzXL6;
        }
        return this.zzWHP;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        int iZzXKr = zzXKr();
        return zzZBC.zzg4(iZzXKr) + 1 + iZzXKr;
    }

    @Override // com.aspose.words.internal.zzZD4, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzZD7 zzzd7ZzXKG = zzzd7.zzXKG();
        int iZzXKr = zzXKr();
        zzzd7.write(48);
        zzzd7.zzg7(iZzXKr);
        Enumeration enumerationZzXKE = zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzzd7ZzXKG.zzY((zzZDK) enumerationZzXKE.nextElement());
        }
    }

    public zzZBN(zzZDK zzzdk) {
        super(zzzdk);
        this.zzWHP = -1;
    }

    public zzZBN(zzZDJ zzzdj) {
        super(zzzdj);
        this.zzWHP = -1;
    }
}
