package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzD2 extends zzBW {
    private String mValue;

    @Override // com.aspose.words.zzBW
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zzD2) obj).mValue, this.mValue);
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

    public final void setValue(String str) {
        this.mValue = str;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        return null;
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 7;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zzD2 zzd2 = new zzD2();
        zzd2.mValue = this.mValue;
        zzU(zzd2);
        return zzd2;
    }
}
