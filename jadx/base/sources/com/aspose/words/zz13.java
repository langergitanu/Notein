package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz13 extends zzBW {
    private String mValue = "";
    private String zzYY5;

    @Override // com.aspose.words.zzBW
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zz13) obj).mValue, this.mValue);
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

    public final void zzOk(String str) {
        this.zzYY5 = str;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        com.aspose.words.internal.zzPV zzpvZzB = com.aspose.words.internal.zzPV.zzB(this.mValue);
        return com.aspose.words.internal.zzPV.zzZ(zzpvZzB, com.aspose.words.internal.zzPV.zzHZ) ? zzZtN().length() > 0 ? zz6S.zzOx(zzZtN()) : com.aspose.words.internal.zzPV.zzHZ : zzpvZzB;
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 6;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz13 zz13Var = new zz13();
        zz13Var.mValue = this.mValue;
        zz13Var.zzYY5 = zzZtN();
        zzU(zz13Var);
        return zz13Var;
    }

    public final String zzZtN() {
        if (this.zzYY5 == null) {
            this.zzYY5 = "";
        }
        return this.zzYY5;
    }
}
