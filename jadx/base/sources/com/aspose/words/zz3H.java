package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3H extends zzBW {
    private String mValue;

    public zz3H() {
        this.mValue = "";
    }

    @Override // com.aspose.words.zzBW
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zz3H) obj).mValue, this.mValue);
        }
        return false;
    }

    public final String getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzBW
    public final int hashCode() {
        return super.hashCode() ^ this.mValue.hashCode();
    }

    @Override // com.aspose.words.zzBW
    public final boolean isEmpty() {
        return !com.aspose.words.internal.zzZYD.zzXk(this.mValue);
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        return com.aspose.words.internal.zzPH.zz4(this.mValue);
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 4;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz3H zz3h = new zz3H();
        zz3h.mValue = this.mValue;
        zzU(zz3h);
        return zz3h;
    }

    public zz3H(String str) {
        this.mValue = str;
    }
}
