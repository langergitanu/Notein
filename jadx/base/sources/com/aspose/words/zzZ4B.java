package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4B implements Cloneable {
    int zzYbU;
    int zzYbV;
    boolean zzYbW;
    boolean zzYbX;
    int zzYbY = 1;
    private ListLevel zzYo4;

    public zzZ4B() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final ListLevel getListLevel() {
        return this.zzYo4;
    }

    public final int hashCode() {
        int iHashCode = this.zzYo4.hashCode();
        if (this.zzYbW) {
            return iHashCode;
        }
        int iZzYY = (iHashCode * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzYbX);
        return this.zzYbX ? (iZzYY * 397) ^ this.zzYbY : iZzYY;
    }

    public final void zzT(ListLevel listLevel) {
        if (this.zzYo4 != null) {
            throw new IllegalStateException("ListLevel object already assigned.");
        }
        this.zzYo4 = listLevel;
    }

    public final int zzYO3() {
        return (this.zzYbX && this.zzYbW) ? this.zzYo4.getStartAt() : this.zzYbY;
    }

    public final boolean zzZ(zzZ4B zzz4b, com.aspose.words.internal.zzIM<com.aspose.words.internal.zz6R> zzim) {
        if (!this.zzYo4.zzZ(zzz4b.zzYo4, zzim)) {
            return false;
        }
        if (this.zzYbW || zzz4b.zzYbW) {
            return true;
        }
        boolean z = this.zzYbX;
        return z == zzz4b.zzYbX && (!z || this.zzYbY == zzz4b.zzYbY);
    }

    public final zzZ4B zzy(DocumentBase documentBase) {
        zzZ4B zzz4b = (zzZ4B) memberwiseClone();
        zzz4b.zzYo4 = this.zzYo4.zzA(documentBase);
        return zzz4b;
    }

    public zzZ4B(DocumentBase documentBase, int i) {
        this.zzYo4 = new ListLevel(documentBase, i);
    }
}
