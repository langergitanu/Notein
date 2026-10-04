package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5H extends zzBK implements zzZCL, Cloneable {
    private int zzZ1j;
    private zz4G zzZje;
    private zz1K zzZjk;

    public zz5H(int i) {
        if (i != 5 && i != 10) {
            throw new IllegalArgumentException("Unexpected canvas type");
        }
        this.zzZ1j = i;
    }

    @Override // com.aspose.words.zzZCL
    public final zz4G getOutline() {
        return this.zzZje;
    }

    @Override // com.aspose.words.zz53
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCL
    public final void setOutline(zz4G zz4g) {
        this.zzZje = zz4g;
    }

    @Override // com.aspose.words.zz7S, com.aspose.words.zz53
    public final zz53 zzY(boolean z, zzZA5 zzza5) {
        return (zz53) memberwiseClone();
    }

    @Override // com.aspose.words.zzZCL
    public final void zzZ(zz1K zz1k) {
        this.zzZjk = zz1k;
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return this.zzZ1j;
    }

    @Override // com.aspose.words.zzZCL
    public final zz1K zzZTj() {
        return this.zzZjk;
    }
}
