package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3C {
    private float zzX7C;
    private float zzX7D;
    private float zzwo;

    public zzY3C() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzY3C) {
            zzY3C zzy3c = (zzY3C) obj;
            if (this.zzX7D == zzy3c.zzX7D && this.zzX7C == zzy3c.zzX7C && this.zzwo == zzy3c.zzwo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.zzwo) * 397) ^ Float.floatToIntBits(this.zzX7D)) * 397) ^ Float.floatToIntBits(this.zzX7C);
    }

    public final long zz1y() {
        return com.aspose.words.internal.zzZPY.zzG(this.zzX7D, this.zzX7C);
    }

    public final long zzZS6() {
        return com.aspose.words.internal.zzZPY.zzG(this.zzX7D, this.zzX7C + this.zzwo);
    }

    public zzY3C(float f, float f2, float f3) {
        this.zzX7D = f;
        this.zzX7C = f2;
        this.zzwo = f3;
    }
}
