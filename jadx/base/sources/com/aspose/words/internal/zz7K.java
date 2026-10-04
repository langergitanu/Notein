package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7K {
    public static zz7K zznU = new zz7K();
    private double zzE0;
    private boolean zznV;

    public zz7K() {
    }

    private boolean zzZ(zz7K zz7k) {
        return this.zznV == zz7k.zznV && this.zzE0 == zz7k.zzE0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zz7K) && zzZ((zz7K) obj);
    }

    public final double getValue() {
        if (this.zznV) {
            return this.zzE0;
        }
        throw new IllegalStateException("NullableDouble doesn't have a value.");
    }

    public final boolean hasValue() {
        return this.zznV;
    }

    public final int hashCode() {
        if (this.zznV) {
            return zzZKP.zzZ9(this.zzE0);
        }
        return 0;
    }

    public final double zzxL() {
        return this.zzE0;
    }

    public zz7K(double d) {
        this.zzE0 = d;
        this.zznV = true;
    }
}
