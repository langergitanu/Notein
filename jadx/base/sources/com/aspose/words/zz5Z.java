package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5Z implements Cloneable {
    private int zzZ1N;
    private int zzZcp;
    private zz33 zzZg2;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz5Z zz5z = (zz5Z) obj;
        return zz5z.zzZ1N == this.zzZ1N && zz5z.zzZcp == this.zzZcp && com.aspose.words.internal.zzZKO.equals(zz5z.zzZg2, this.zzZg2);
    }

    public final int getDirection() {
        return this.zzZcp;
    }

    public final int hashCode() {
        zz33 zz33Var = this.zzZg2;
        return ((zz33Var != null ? zz33Var.hashCode() : 0) ^ this.zzZcp) ^ this.zzZ1N;
    }

    public final void setDirection(int i) {
        this.zzZcp = i;
    }

    public final void zzHR(int i) {
        this.zzZ1N = i;
    }

    public final void zzZ(zz33 zz33Var) {
        this.zzZg2 = zz33Var;
    }

    public final zz33 zzZPw() {
        return this.zzZg2;
    }

    public final int zzZyN() {
        return this.zzZ1N;
    }

    public final zz5Z zzZyO() {
        zz5Z zz5z = (zz5Z) memberwiseClone();
        zz33 zz33Var = this.zzZg2;
        if (zz33Var != null) {
            zz5z.zzZg2 = zz33Var.zzZw6();
        }
        zz5z.zzZcp = this.zzZcp;
        zz5z.zzZ1N = this.zzZ1N;
        return zz5z;
    }
}
