package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZC0 extends zzZD2 {
    private int zzWHP;

    public zzZC0() {
        this.zzWHP = -1;
    }

    private int zzXKr() throws IOException {
        if (this.zzWHP < 0) {
            Enumeration enumerationZzXKE = zzXKE();
            int iZzXL6 = 0;
            while (enumerationZzXKE.hasMoreElements()) {
                iZzXL6 += ((zzZDK) enumerationZzXKE.nextElement()).zzXL0().zzXL3().zzXL6();
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

    @Override // com.aspose.words.internal.zzZD2, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzZD7 zzzd7ZzXKH = zzzd7.zzXKH();
        int iZzXKr = zzXKr();
        zzzd7.write(49);
        zzzd7.zzg7(iZzXKr);
        Enumeration enumerationZzXKE = zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzzd7ZzXKH.zzY((zzZDK) enumerationZzXKE.nextElement());
        }
    }

    public zzZC0(zzZDK zzzdk) {
        super(zzzdk);
        this.zzWHP = -1;
    }

    public zzZC0(zzZDJ zzzdj) {
        super(zzzdj, true);
        this.zzWHP = -1;
    }

    public zzZC0(zzZDJ zzzdj, byte b) {
        super(zzzdj, false);
        this.zzWHP = -1;
    }
}
