package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7Z extends zzZDB {
    boolean zzWqR = false;
    zzZ7C zzWqS;
    zzZCG zzWqT;
    zzZ86 zzWqU;
    int zzWst;

    private zzZ7Z(zzZD4 zzzd4) {
        if (zzzd4.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        this.zzWqS = zzZ7C.zzWY(zzzd4.zzg6(0));
        this.zzWqU = zzZ86.zzXm(zzzd4.zzg6(1));
        this.zzWqT = zzZCG.zzYu(zzzd4.zzg6(2));
    }

    public static zzZ7Z zzXg(Object obj) {
        if (obj instanceof zzZ7Z) {
            return (zzZ7Z) obj;
        }
        if (obj != null) {
            return new zzZ7Z(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB
    public final int hashCode() {
        if (!this.zzWqR) {
            this.zzWst = super.hashCode();
            this.zzWqR = true;
        }
        return this.zzWst;
    }

    public final zzZ7A zzXI7() {
        return this.zzWqS.zzWpy;
    }

    public final zzZ7A zzXI8() {
        return this.zzWqS.zzWpz;
    }

    public final Enumeration zzXI9() {
        return this.zzWqS.zzXI9();
    }

    public final zzZ7C zzXIa() {
        return this.zzWqS;
    }

    public final zzZCG zzXIb() {
        return this.zzWqT;
    }

    public final zzZ86 zzXIc() {
        return this.zzWqU;
    }

    public final zzZ8C zzXIh() {
        return this.zzWqS.zzWpA;
    }

    public final int zzXIi() {
        return this.zzWqS.zzXIi();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWqS);
        zzzdj.zzZ(this.zzWqU);
        zzzdj.zzZ(this.zzWqT);
        return new zzZC2(zzzdj);
    }
}
