package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZT {
    private WordAttrCollection zzZF2;
    private WordAttrCollection zzZF3;

    public zzZT(WordAttrCollection wordAttrCollection, WordAttrCollection wordAttrCollection2) {
        this.zzZF3 = wordAttrCollection;
        this.zzZF2 = wordAttrCollection2;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzZT.class) {
            return false;
        }
        zzZT zzzt = (zzZT) obj;
        return this.zzZF3.zzV(zzzt.zzZF3) && this.zzZF2.zzV(zzzt.zzZF2);
    }

    public int hashCode() {
        int iHashCode = this.zzZF3.hashCode();
        return ((iHashCode << 5) + iHashCode) ^ this.zzZF2.hashCode();
    }
}
