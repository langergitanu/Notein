package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCN extends zzZD2 {
    public zzZCN() {
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        Enumeration enumerationZzXKE = zzXKE();
        int iZzXL6 = 0;
        while (enumerationZzXKE.hasMoreElements()) {
            iZzXL6 += ((zzZDK) enumerationZzXKE.nextElement()).zzXL0().zzXL6();
        }
        return iZzXL6 + 4;
    }

    @Override // com.aspose.words.internal.zzZD2, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.write(49);
        zzzd7.write(128);
        Enumeration enumerationZzXKE = zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzzd7.zzY((zzZDK) enumerationZzXKE.nextElement());
        }
        zzzd7.write(0);
        zzzd7.write(0);
    }

    public zzZCN(zzZDK zzzdk) {
        super(zzzdk);
    }

    public zzZCN(zzZDJ zzzdj) {
        super(zzzdj, false);
    }

    public zzZCN(zzZDK[] zzzdkArr) {
        super(zzzdkArr, false);
    }
}
