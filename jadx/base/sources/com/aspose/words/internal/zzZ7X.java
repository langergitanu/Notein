package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7X extends zzZDB {
    private byte[] zzWqQ;
    private zzZ86 zzWyM;

    public zzZ7X(zzZ86 zzz86, byte[] bArr) {
        this.zzWqQ = zzYGU.zzVI(bArr);
        this.zzWyM = zzz86;
    }

    public static zzZ7X zzXe(Object obj) {
        if (obj instanceof zzZ7X) {
            return (zzZ7X) obj;
        }
        if (obj != null) {
            return new zzZ7X(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] zzXI5() {
        return zzYGU.zzVI(this.zzWqQ);
    }

    public final zzZ86 zzXI6() {
        return this.zzWyM;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyM);
        zzzdj.zzZ(new zzZC6(this.zzWqQ));
        return new zzZC2(zzzdj);
    }

    private zzZ7X(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWyM = zzZ86.zzXm(enumerationZzXKE.nextElement());
        this.zzWqQ = zzZD9.zzYz(enumerationZzXKE.nextElement()).zzXL5();
    }
}
