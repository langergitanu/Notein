package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzBL implements zzZCM, Cloneable {
    private ArrayList<zzZCM> zzZt0 = new ArrayList<>();

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
        if (com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return com.aspose.words.internal.zzBP.zzX(((zzBL) obj).zzZt0, this.zzZt0);
        }
        return false;
    }

    public final int hashCode() {
        Iterator<zzZCM> it = this.zzZt0.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode ^= it.next().hashCode();
        }
        return iHashCode;
    }

    public final void zzW(zzZCM zzzcm) {
        if (zzzcm != null) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzZt0, zzzcm);
        }
    }

    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        throw new IllegalArgumentException("Unexpected Dml color modifier type.");
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        return (zzZCM) memberwiseClone();
    }

    @Override // com.aspose.words.zzZCM
    public final int zzZR1() {
        return 28;
    }

    @Override // com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        Iterator<zzZCM> it = this.zzZt0.iterator();
        while (it.hasNext()) {
            zzpv = it.next().zzl(zzpv);
        }
        return zzpv;
    }
}
