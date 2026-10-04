package com.aspose.words.internal;

import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ85 extends zzZDB {
    zzZDD zzWr2;
    zzZ7Q zzWr3;
    zzZD9 zzWr4;

    private zzZ85(zzZD4 zzzd4) {
        this.zzWr4 = null;
        this.zzWr3 = null;
        this.zzWr2 = null;
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            zzZCY zzzcyZzYw = zzZCY.zzYw(enumerationZzXKE.nextElement());
            int iZzXKy = zzzcyZzYw.zzXKy();
            if (iZzXKy == 0) {
                this.zzWr4 = zzZD9.zzY(zzzcyZzYw, false);
            } else if (iZzXKy == 1) {
                this.zzWr3 = zzZ7Q.zzQ(zzzcyZzYw);
            } else {
                if (iZzXKy != 2) {
                    throw new IllegalArgumentException("illegal tag");
                }
                this.zzWr2 = zzZDD.zzZ(zzzcyZzYw, false);
            }
        }
    }

    public static zzZ85 zzXl(Object obj) {
        if (obj != null) {
            return new zzZ85(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorityKeyIdentifier: KeyID(");
        zzZD9 zzzd9 = this.zzWr4;
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, zzzd9 != null ? zzYGC.zzVE(zzzd9.zzXL5()) : CloudMetaExtra.DEFINE_NON_PARENT_ID, ")");
    }

    public final byte[] zzXIn() {
        zzZD9 zzzd9 = this.zzWr4;
        if (zzzd9 != null) {
            return zzzd9.zzXL5();
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZD9 zzzd9 = this.zzWr4;
        if (zzzd9 != null) {
            zzzdj.zzZ(new zzZBX(false, 0, zzzd9));
        }
        zzZ7Q zzz7q = this.zzWr3;
        if (zzz7q != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzz7q));
        }
        zzZDD zzzdd = this.zzWr2;
        if (zzzdd != null) {
            zzzdj.zzZ(new zzZBX(false, 2, zzzdd));
        }
        return new zzZC2(zzzdj);
    }
}
