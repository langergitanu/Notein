package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzHQ extends zz8E {
    private ArrayList<zz8E> zzZh3 = new ArrayList<>();

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzBP.zzX(((zzHQ) obj).zzZh3, this.zzZh3);
        }
        return false;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 4;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        int iHashCode = super.hashCode();
        Iterator<zz8E> it = this.zzZh3.iterator();
        while (it.hasNext()) {
            iHashCode ^= it.next().hashCode();
        }
        return iHashCode;
    }

    public final ArrayList<zz8E> zzZQW() {
        return this.zzZh3;
    }
}
