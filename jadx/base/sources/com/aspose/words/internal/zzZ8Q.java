package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8Q extends zzZDB {
    zzZDD zzWtE;
    zzZDD zzWtF;
    zzZDD zzWtG;

    public zzZ8Q() {
    }

    public static zzZ8Q zzXy(Object obj) {
        if (obj instanceof zzZ8Q) {
            return (zzZ8Q) obj;
        }
        if (obj != null) {
            return new zzZ8Q(zzZD4.zzYy(obj));
        }
        return null;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZDD zzzdd = this.zzWtG;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzZDD zzzdd2 = this.zzWtF;
        if (zzzdd2 != null) {
            zzzdj.zzZ(new zzZBX(false, 0, zzzdd2));
        }
        zzZDD zzzdd3 = this.zzWtE;
        if (zzzdd3 != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzzdd3));
        }
        return new zzZC2(zzzdj);
    }

    private zzZ8Q(zzZD4 zzzd4) {
        this.zzWtG = null;
        this.zzWtF = null;
        this.zzWtE = null;
        for (int i = 0; i < zzzd4.size(); i++) {
            if (zzzd4.zzg6(i) instanceof zzZDD) {
                this.zzWtG = (zzZDD) zzzd4.zzg6(i);
            } else if (zzzd4.zzg6(i) instanceof zzZCY) {
                zzZCY zzzcy = (zzZCY) zzzd4.zzg6(i);
                int iZzXKy = zzzcy.zzXKy();
                if (iZzXKy == 0) {
                    zzZDD zzzddZzZ = zzZDD.zzZ(zzzcy, false);
                    this.zzWtF = zzzddZzZ;
                    if (zzzddZzZ.zzXKZ().intValue() <= 0 || this.zzWtF.zzXKZ().intValue() > 999) {
                        throw new IllegalArgumentException("Invalid millis field : not in (1..999).");
                    }
                } else {
                    if (iZzXKy != 1) {
                        throw new IllegalArgumentException("Invalig tag number");
                    }
                    zzZDD zzzddZzZ2 = zzZDD.zzZ(zzzcy, false);
                    this.zzWtE = zzzddZzZ2;
                    if (zzzddZzZ2.zzXKZ().intValue() <= 0 || this.zzWtE.zzXKZ().intValue() > 999) {
                        throw new IllegalArgumentException("Invalid micros field : not in (1..999).");
                    }
                }
            } else {
                continue;
            }
        }
    }
}
