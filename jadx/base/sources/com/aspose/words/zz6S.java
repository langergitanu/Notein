package com.aspose.words;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zz6S extends zzBW {
    private String mValue;
    private String zzZ31;

    public zz6S() {
        this.mValue = "";
    }

    public static com.aspose.words.internal.zzPV zzOx(String str) {
        return new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzJB.zzZe(str) | ViewCompat.MEASURED_STATE_MASK);
    }

    public static zz6S zzh(com.aspose.words.internal.zzPV zzpv) {
        zz6S zz6s = new zz6S();
        zz6s.mValue = com.aspose.words.internal.zzJB.zzWs(zzpv.toArgb()).substring(2);
        return zz6s;
    }

    @Override // com.aspose.words.zzBW
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zz6S) obj).mValue, this.mValue);
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

    public final void zzOw(String str) {
        this.zzZ31 = str;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        return isEmpty() ? com.aspose.words.internal.zzPV.zzHZ : zzOx(this.mValue);
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 0;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz6S zz6s = new zz6S();
        zz6s.mValue = this.mValue;
        zz6s.zzZ31 = this.zzZ31;
        zzU(zz6s);
        return zz6s;
    }

    public final String zzZzZ() {
        return this.zzZ31;
    }

    public zz6S(String str) {
        this.mValue = str;
    }
}
