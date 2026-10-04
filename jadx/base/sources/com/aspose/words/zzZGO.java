package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGO {
    private int zzYoU;
    private int zzYoV;
    private int zzYoW;

    public zzZGO(int i) {
        this.zzYoW = i % 9;
        this.zzYoV = i;
        this.zzYoU = i / 9;
    }

    public final int getListLevelNumber() {
        return this.zzYoW;
    }

    public final int zzZ1g() {
        return this.zzYoU;
    }
}
