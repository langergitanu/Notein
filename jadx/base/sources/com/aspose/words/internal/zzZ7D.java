package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7D extends zzZDB {
    private zzZCG zzWpC;
    private zzZ86 zzWyM;

    public zzZ7D(zzZ86 zzz86, zzZDK zzzdk) throws IOException {
        this.zzWpC = new zzZCG(zzzdk);
        this.zzWyM = zzz86;
    }

    public static zzZ7D zzWZ(Object obj) {
        if (obj instanceof zzZ7D) {
            return (zzZ7D) obj;
        }
        if (obj != null) {
            return new zzZ7D(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZCG zzXHH() {
        return this.zzWpC;
    }

    public final zzZD5 zzXHI() throws IOException {
        return zzZD5.zzXo(this.zzWpC.zzXL5());
    }

    public final zzZ86 zzXHJ() {
        return this.zzWyM;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyM);
        zzzdj.zzZ(this.zzWpC);
        return new zzZC2(zzzdj);
    }

    public zzZ7D(zzZ86 zzz86, byte[] bArr) {
        this.zzWpC = new zzZCG(bArr);
        this.zzWyM = zzz86;
    }

    private zzZ7D(zzZD4 zzzd4) {
        if (zzzd4.size() == 2) {
            Enumeration enumerationZzXKE = zzzd4.zzXKE();
            this.zzWyM = zzZ86.zzXm(enumerationZzXKE.nextElement());
            this.zzWpC = zzZCG.zzYu(enumerationZzXKE.nextElement());
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
    }
}
