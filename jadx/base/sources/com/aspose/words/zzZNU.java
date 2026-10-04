package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNU {
    static zzZNU zzYyn = new zzZNU(Integer.MIN_VALUE, Integer.MIN_VALUE);
    private int zzVL;
    private int zzYG;

    public zzZNU() {
    }

    private boolean zzZ(zzZNU zzznu) {
        return this.zzYG == zzznu.zzYG && this.zzVL == zzznu.zzVL;
    }

    public final boolean equals(Object obj) {
        if (obj == null || zzZNU.class != obj.getClass()) {
            return false;
        }
        return zzZ((zzZNU) obj);
    }

    public final int getId() {
        return this.zzYG;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final int hashCode() {
        return (this.zzYG * 397) ^ this.zzVL;
    }

    public zzZNU(int i, int i2) {
        this.zzYG = i;
        this.zzVL = i2;
    }

    public static boolean zzZ(zzZNU zzznu, zzZNU zzznu2) {
        return zzznu.zzZ(zzznu2);
    }
}
