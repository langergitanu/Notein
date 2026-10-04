package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8L extends zzZDB {
    private int zzWtn;
    private int zzWto;
    private int zzWtp;
    private int zzWtq;

    private zzZ8L(zzZD4 zzzd4) {
        this.zzWtq = zzZDD.zzYB(zzzd4.zzg6(0)).zzXKM().intValue();
        if (zzzd4.zzg6(1) instanceof zzZDD) {
            this.zzWtp = ((zzZDD) zzzd4.zzg6(1)).zzXKM().intValue();
        } else {
            if (!(zzzd4.zzg6(1) instanceof zzZD4)) {
                throw new IllegalArgumentException("object parse error");
            }
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzzd4.zzg6(1));
            this.zzWtp = zzZDD.zzYB(zzzd4ZzYy.zzg6(0)).zzXKM().intValue();
            this.zzWto = zzZDD.zzYB(zzzd4ZzYy.zzg6(1)).zzXKM().intValue();
            this.zzWtn = zzZDD.zzYB(zzzd4ZzYy.zzg6(2)).zzXKM().intValue();
        }
    }

    public static zzZ8L zzXu(Object obj) {
        if (obj instanceof zzZ8L) {
            return (zzZ8L) obj;
        }
        if (obj != null) {
            return new zzZ8L(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final int getM() {
        return this.zzWtq;
    }

    public final int zzXIC() {
        return this.zzWtn;
    }

    public final int zzXID() {
        return this.zzWto;
    }

    public final int zzXIE() {
        return this.zzWtp;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(this.zzWtq));
        if (this.zzWto == 0) {
            zzzdj.zzZ(new zzZDD(this.zzWtp));
        } else {
            zzZDJ zzzdj2 = new zzZDJ();
            zzzdj2.zzZ(new zzZDD(this.zzWtp));
            zzzdj2.zzZ(new zzZDD(this.zzWto));
            zzzdj2.zzZ(new zzZDD(this.zzWtn));
            zzzdj.zzZ(new zzZC2(zzzdj2));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ8L(int i, int i2, int i3, int i4) {
        this.zzWtq = i;
        this.zzWtp = i2;
        this.zzWto = i3;
        this.zzWtn = i4;
    }

    public zzZ8L(int i, int i2) {
        this(i, i2, 0, 0);
    }
}
