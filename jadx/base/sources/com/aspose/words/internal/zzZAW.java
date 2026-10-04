package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAW extends zzZDB {
    zzZCG zzWG0;
    zzZAX zzWG1;
    zzZDD zzWG2;

    private zzZAW(zzZD4 zzzd4) {
        this.zzWG2 = zzZDD.zzYB(zzzd4.zzg6(0));
        this.zzWG1 = null;
        this.zzWG0 = null;
        if (zzzd4.size() > 2) {
            this.zzWG1 = zzZAX.zzYh(zzzd4.zzg6(1));
            this.zzWG0 = zzZCG.zzYu(zzzd4.zzg6(2));
        } else if (zzzd4.size() > 1) {
            zzZDK zzzdkZzg6 = zzzd4.zzg6(1);
            if (zzzdkZzg6 instanceof zzZCG) {
                this.zzWG0 = zzZCG.zzYu(zzzdkZzg6);
            } else {
                this.zzWG1 = zzZAX.zzYh(zzzdkZzg6);
            }
        }
    }

    public static zzZAW zzYg(Object obj) {
        if (obj instanceof zzZAW) {
            return (zzZAW) obj;
        }
        if (obj != null) {
            return new zzZAW(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger zzXK2() {
        return this.zzWG2.zzXKZ();
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWG2);
        zzZAX zzzax = this.zzWG1;
        if (zzzax != null) {
            zzzdj.zzZ(zzzax);
        }
        zzZCG zzzcg = this.zzWG0;
        if (zzzcg != null) {
            zzzdj.zzZ(zzzcg);
        }
        return new zzZC2(zzzdj);
    }
}
