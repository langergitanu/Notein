package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZR {
    private WordAttrCollection zzZF0;

    public zzZR(WordAttrCollection wordAttrCollection) {
        this.zzZF0 = wordAttrCollection;
    }

    private boolean zzZ(zzZR zzzr) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzzr)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzzr)) {
            return true;
        }
        return this.zzZF0.zzW(zzzr.zzZF0, (int[]) null);
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzZR.class) {
            return false;
        }
        return zzZ((zzZR) obj);
    }

    public int hashCode() {
        WordAttrCollection wordAttrCollection = this.zzZF0;
        if (wordAttrCollection != null) {
            return wordAttrCollection.hashCode();
        }
        return 0;
    }

    public final WordAttrCollection zzbj() {
        return this.zzZF0;
    }
}
