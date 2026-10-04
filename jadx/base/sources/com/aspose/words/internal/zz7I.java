package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7I {
    public static zz7I zznT = new zz7I();
    private int zzZn;
    private boolean zznV;

    public zz7I() {
    }

    private boolean zzZ(zz7I zz7i) {
        return this.zznV == zz7i.zznV && this.zzZn == zz7i.zzZn;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zz7I) && zzZ((zz7I) obj);
    }

    public final int getValue() {
        if (this.zznV) {
            return this.zzZn;
        }
        throw new IllegalStateException("NullableInt32 doesn't have a value.");
    }

    public final boolean hasValue() {
        return this.zznV;
    }

    public final int hashCode() {
        if (this.zznV) {
            return this.zzZn;
        }
        return 0;
    }

    public final int zzUz(int i) {
        return !this.zznV ? i : this.zzZn;
    }

    public final int zzxK() {
        return this.zzZn;
    }

    public zz7I(int i) {
        this.zzZn = i;
        this.zznV = true;
    }
}
