package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8M extends zzZDB {
    zzZAP zzWtr;
    zzZAW zzWts;

    private zzZ8M(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWts = zzZAW.zzYg(enumerationZzXKE.nextElement());
        if (enumerationZzXKE.hasMoreElements()) {
            this.zzWtr = zzZAP.zzYd(enumerationZzXKE.nextElement());
        }
    }

    public static zzZ8M zzXv(Object obj) {
        if (obj instanceof zzZ8M) {
            return (zzZ8M) obj;
        }
        if (obj != null) {
            return new zzZ8M(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZAP zzXIF() {
        return this.zzWtr;
    }

    public final zzZAW zzXIG() {
        return this.zzWts;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWts);
        zzZAP zzzap = this.zzWtr;
        if (zzzap != null) {
            zzzdj.zzZ(zzzap);
        }
        return new zzZC2(zzzdj);
    }
}
