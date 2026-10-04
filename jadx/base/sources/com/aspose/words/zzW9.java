package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzW9 {
    private int zzZz3;
    private int zzwa;

    public zzW9() {
    }

    private boolean zzZ(zzW9 zzw9) {
        return this.zzwa == zzw9.zzwa && this.zzZz3 == zzw9.zzZz3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || zzW9.class != obj.getClass()) {
            return false;
        }
        return zzZ((zzW9) obj);
    }

    public final int hashCode() {
        return this.zzwa ^ this.zzZz3;
    }

    public zzW9(int i, int i2) {
        this.zzwa = i;
        this.zzZz3 = i2;
    }
}
