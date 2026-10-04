package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAX extends zzZDB {
    zzZD4 zzWG3;

    private zzZAX(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            if (!(enumerationZzXKE.nextElement() instanceof zzZBV)) {
                throw new IllegalArgumentException("attempt to insert non UTF8 STRING into PKIFreeText");
            }
        }
        this.zzWG3 = zzzd4;
    }

    public static zzZAX zzYh(Object obj) {
        if (obj instanceof zzZAX) {
            return (zzZAX) obj;
        }
        if (obj != null) {
            return new zzZAX(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWG3;
    }
}
