package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzBT implements zzZCM {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.aspose.words.internal.zzZ4.zzW(this, obj) && ((zzBT) obj).zzZR1() == zzZR1();
    }

    public int hashCode() {
        return zzZR1();
    }

    @Override // com.aspose.words.zzZCM
    public abstract int zzZR1();

    @Override // com.aspose.words.zzZCM
    public com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        return zzpv;
    }
}
