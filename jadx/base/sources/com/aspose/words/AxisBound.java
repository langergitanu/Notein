package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class AxisBound {
    private double zzE0;
    private boolean zzZEG;
    private static com.aspose.words.internal.zzZQ9 zzZEF = new com.aspose.words.internal.zzZQ9(100, 1, 1);
    private static com.aspose.words.internal.zzZQ9 zzZEE = com.aspose.words.internal.zzZQ9.zz34;
    static AxisBound zzZED = new AxisBound();

    public AxisBound() {
        this.zzZEG = true;
    }

    private com.aspose.words.internal.zzZQ9 zzb3() {
        try {
            return com.aspose.words.internal.zzZQ9.zzZg(this.zzE0);
        } catch (IllegalArgumentException unused) {
            return com.aspose.words.internal.zzZQ9.zz35;
        }
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != AxisBound.class) {
            return false;
        }
        AxisBound axisBound = (AxisBound) obj;
        boolean z = this.zzZEG;
        return z == axisBound.zzZEG && (z || this.zzE0 == axisBound.zzE0);
    }

    public final double getValue() {
        return this.zzE0;
    }

    public final Date getValueAsDate() {
        return com.aspose.words.internal.zzZQ9.zzJ(zzb3());
    }

    public final int hashCode() {
        return (com.aspose.words.internal.zzZKP.zzYY(this.zzZEG) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzE0);
    }

    public final boolean isAuto() {
        return this.zzZEG;
    }

    public final String toString() {
        if (this.zzZEG) {
            return "Auto";
        }
        double d = this.zzE0;
        if (d <= -657435.0d || d >= 2958466.0d) {
            return com.aspose.words.internal.zzJB.zzZZ(d);
        }
        return this.zzE0 + " (" + com.aspose.words.internal.zzZQ9.zzZg(this.zzE0) + ")";
    }

    public AxisBound(double d) {
        this.zzE0 = d;
    }

    private AxisBound(com.aspose.words.internal.zzZQ9 zzzq9) {
        if (!com.aspose.words.internal.zzZQ9.zzX(zzzq9, zzZEF) && !com.aspose.words.internal.zzZQ9.zzW(zzzq9, zzZEE)) {
            this.zzE0 = zzzq9.zzkM();
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: datetime");
    }

    public AxisBound(Date date) {
        this(com.aspose.words.internal.zzZQ9.zzZ(date));
    }
}
