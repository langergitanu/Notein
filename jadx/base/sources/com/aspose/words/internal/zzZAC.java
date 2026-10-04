package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAC extends zzZDB {
    private zzZDA zzWEu;
    private zzZD9 zzWEv;

    public zzZAC(byte[] bArr, zzZDA zzzda) {
        this.zzWEv = new zzZC6(bArr);
        this.zzWEu = zzzda;
    }

    public static zzZAC zzY4(Object obj) {
        if (obj instanceof zzZAC) {
            return (zzZAC) obj;
        }
        if (obj != null) {
            return new zzZAC(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final byte[] getIV() {
        return zzYGU.zzVI(this.zzWEv.zzXL5());
    }

    public final zzZDA zzXJx() {
        return this.zzWEu;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWEv);
        zzzdj.zzZ(this.zzWEu);
        return new zzZC2(zzzdj);
    }

    private zzZAC(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWEv = (zzZD9) enumerationZzXKE.nextElement();
        this.zzWEu = (zzZDA) enumerationZzXKE.nextElement();
    }
}
