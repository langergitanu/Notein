package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB3 extends zzZDB {
    private final zzZB1 zzWGA;
    private final zzZDK zzWGB;

    public zzZB3(zzZB8 zzzb8, zzZB1 zzzb1) {
        this.zzWGB = zzzb8;
        this.zzWGA = zzzb1;
    }

    public static zzZB3 zzYm(Object obj) {
        if (obj instanceof zzZB3) {
            return (zzZB3) obj;
        }
        if (obj != null) {
            return new zzZB3(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDK zzXKb() {
        return this.zzWGB;
    }

    public final zzZB1 zzXKc() {
        return this.zzWGA;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWGB);
        zzzdj.zzZ(this.zzWGA);
        return new zzZC2(zzzdj);
    }

    private zzZB3(zzZD4 zzzd4) {
        if (zzzd4.size() == 2) {
            zzZDK zzzdkZzg6 = zzzd4.zzg6(0);
            if ((zzzdkZzg6 instanceof zzZB8) || (zzzdkZzg6 instanceof zzZB2)) {
                this.zzWGB = zzzdkZzg6;
            } else {
                zzZD4 zzzd4ZzYy = zzZD4.zzYy(zzzdkZzg6);
                if (zzzd4ZzYy.size() == 2) {
                    this.zzWGB = zzZB8.zzYr(zzzd4ZzYy);
                } else {
                    this.zzWGB = zzZB2.zzYl(zzzd4ZzYy);
                }
            }
            this.zzWGA = zzZB1.zzYk(zzzd4.zzg6(1));
            return;
        }
        throw new IllegalArgumentException("malformed sequence");
    }
}
