package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ9E extends zzZDB {
    private zzZD9 zzWGE;
    private zzZ86 zzWyM;

    private zzZ9E(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWyM = zzZ86.zzXm(enumerationZzXKE.nextElement());
        this.zzWGE = zzZD9.zzYz(enumerationZzXKE.nextElement());
    }

    public static zzZ9E zzXP(Object obj) {
        if (obj instanceof zzZ9E) {
            return (zzZ9E) obj;
        }
        if (obj != null) {
            return new zzZ9E(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getEncryptedData() {
        return this.zzWGE.zzXL5();
    }

    public final zzZ86 zzXKk() {
        return this.zzWyM;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyM);
        zzzdj.zzZ(this.zzWGE);
        return new zzZC2(zzzdj);
    }

    public zzZ9E(zzZ86 zzz86, byte[] bArr) {
        this.zzWyM = zzz86;
        this.zzWGE = new zzZC6(bArr);
    }
}
