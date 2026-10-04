package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZF4 {
    private int zzYlP;
    private zzMD zzZoJ;

    public zzZF4(zzMD zzmd, int i) {
        this.zzZoJ = zzmd;
        this.zzYlP = i;
    }

    private boolean zzZ(zzZF4 zzzf4) {
        return this.zzZoJ.equals(zzzf4.zzZoJ) && this.zzYlP == zzzf4.zzYlP;
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzZF4.class) {
            return false;
        }
        return zzZ((zzZF4) obj);
    }

    public final int hashCode() {
        return (this.zzZoJ.hashCode() * 397) ^ this.zzYlP;
    }
}
