package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYDE extends zzYDG implements Cloneable {
    private boolean zzXoe;
    private String zzXod = "";
    private String zzXoc = "";

    public final String getBuildingBlockCategory() {
        return this.zzXoc;
    }

    public final boolean isUnique() {
        return this.zzXoe;
    }

    @Override // com.aspose.words.zzYDG
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setBuildingBlockCategory(String str) {
        this.zzXoc = str;
    }

    public final void zzBk(String str) {
        this.zzXod = str;
    }

    public final void zzR3(boolean z) {
        this.zzXoe = z;
    }

    public final String zzYcO() {
        return this.zzXod;
    }

    @Override // com.aspose.words.zzYDG
    public final zzYDG zzYcY() {
        return (zzYDE) memberwiseClone();
    }
}
