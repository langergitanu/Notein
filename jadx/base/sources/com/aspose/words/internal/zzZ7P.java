package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7P extends zzZDB {
    private static final BigInteger ZERO = BigInteger.valueOf(0);
    private zzZDD zzWq6;
    private zzZDD zzWq7;
    private zzZ7R zzWq8;

    private zzZ7P(zzZD4 zzzd4) {
        this.zzWq8 = zzZ7R.zzX9(zzzd4.zzg6(0));
        int size = zzzd4.size();
        if (size != 1) {
            if (size == 2) {
                zzZCY zzzcyZzYw = zzZCY.zzYw(zzzd4.zzg6(1));
                int iZzXKy = zzzcyZzYw.zzXKy();
                if (iZzXKy == 0) {
                    this.zzWq7 = zzZDD.zzZ(zzzcyZzYw, false);
                    return;
                } else if (iZzXKy == 1) {
                    this.zzWq6 = zzZDD.zzZ(zzzcyZzYw, false);
                    return;
                } else {
                    throw new IllegalArgumentException("Bad tag number: " + zzzcyZzYw.zzXKy());
                }
            }
            if (size != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
            }
            zzZCY zzzcyZzYw2 = zzZCY.zzYw(zzzd4.zzg6(1));
            if (zzzcyZzYw2.zzXKy() != 0) {
                throw new IllegalArgumentException("Bad tag number for 'minimum': " + zzzcyZzYw2.zzXKy());
            }
            this.zzWq7 = zzZDD.zzZ(zzzcyZzYw2, false);
            zzZCY zzzcyZzYw3 = zzZCY.zzYw(zzzd4.zzg6(2));
            if (zzzcyZzYw3.zzXKy() == 1) {
                this.zzWq6 = zzZDD.zzZ(zzzcyZzYw3, false);
            } else {
                throw new IllegalArgumentException("Bad tag number for 'maximum': " + zzzcyZzYw3.zzXKy());
            }
        }
    }

    public static zzZ7P zzX7(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof zzZ7P ? (zzZ7P) obj : new zzZ7P(zzZD4.zzYy(obj));
    }

    public final zzZ7R zzXHU() {
        return this.zzWq8;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWq8);
        zzZDD zzzdd = this.zzWq7;
        if (zzzdd != null && !zzzdd.zzXKZ().equals(ZERO)) {
            zzzdj.zzZ(new zzZBX(false, 0, this.zzWq7));
        }
        zzZDD zzzdd2 = this.zzWq6;
        if (zzzdd2 != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzzdd2));
        }
        return new zzZC2(zzzdj);
    }
}
