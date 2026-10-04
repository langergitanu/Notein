package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYDB extends zzYDG implements Cloneable {
    private SdtListItemCollection zzXob = new SdtListItemCollection();

    public final SdtListItemCollection getListItems() {
        return this.zzXob;
    }

    @Override // com.aspose.words.zzYDG
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzYDG
    public final zzYDG zzYcY() {
        zzYDB zzydb = (zzYDB) memberwiseClone();
        zzydb.zzXob = this.zzXob.zzYcM();
        return zzydb;
    }
}
