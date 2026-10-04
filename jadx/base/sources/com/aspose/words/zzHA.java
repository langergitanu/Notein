package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHA extends zz80 implements Cloneable {
    private zz3L zzZgJ;
    private zz3L zzZgK;
    private zz3L zzZgL;

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
        zzHA zzha = (zzHA) obj;
        return this.zzZgL.equals(zzha.zzZgL) && this.zzZgK.equals(zzha.zzZgK) && this.zzZgJ.equals(zzha.zzZgJ);
    }

    public final int hashCode() {
        return (this.zzZgL.hashCode() ^ this.zzZgK.hashCode()) ^ this.zzZgJ.hashCode();
    }

    public final void zzX(zz3L zz3l) {
        this.zzZgJ = zz3l;
    }

    public final void zzY(zz3L zz3l) {
        this.zzZgK = zz3l;
    }

    public final void zzZ(zz3L zz3l) {
        this.zzZgL = zz3l;
    }

    public final zz3L zzZQm() {
        return this.zzZgJ;
    }

    public final zz3L zzZQn() {
        return this.zzZgK;
    }

    public final zz3L zzZQo() {
        return this.zzZgL;
    }

    public final zzHA zzZQp() {
        zzHA zzha = (zzHA) memberwiseClone();
        zzha.setExtensions(zzZBz());
        return zzha;
    }
}
