package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzE8 implements Cloneable {
    private boolean zzZbO = true;
    private String zzZbP;
    private String zzZyL;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzE8 zze8 = (zzE8) obj;
        return (com.aspose.words.internal.zzZ4.zzX(this.zzZyL, zze8.zzZyL) || ((str2 = this.zzZyL) != null && com.aspose.words.internal.zzZKN.zzX(str2, zze8.zzZyL, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8))) && (com.aspose.words.internal.zzZ4.zzX(this.zzZbP, zze8.zzZbP) || ((str = this.zzZbP) != null && com.aspose.words.internal.zzZKN.zzX(str, zze8.zzZbP, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8))) && this.zzZbO == zze8.zzZbO;
    }

    public final String getFormatCode() {
        return this.zzZyL;
    }

    public final int hashCode() {
        String str = this.zzZyL;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzZbP;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        return iHashCode ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZbO);
    }

    public final void setFormatCode(String str) {
        this.zzZbP = str;
        this.zzZyL = zzEW.zzRt(str);
    }

    public final void zzXR(boolean z) {
        this.zzZbO = z;
    }

    public final String zzZLa() {
        return this.zzZbP;
    }

    public final boolean zzZLb() {
        return this.zzZbO;
    }

    public final zzE8 zzZLc() {
        return (zzE8) memberwiseClone();
    }
}
