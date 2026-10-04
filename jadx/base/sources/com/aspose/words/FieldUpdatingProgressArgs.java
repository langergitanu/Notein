package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class FieldUpdatingProgressArgs {
    private boolean zzYAg;
    private int zzYAh;
    private int zzYAi;

    public FieldUpdatingProgressArgs(int i, int i2, boolean z) {
        this.zzYAi = i;
        this.zzYAh = i2;
        this.zzYAg = z;
    }

    public final int getTotalFieldsCount() {
        return this.zzYAi;
    }

    public final boolean getUpdateCompleted() {
        return this.zzYAg;
    }

    public final int getUpdatedFieldsCount() {
        return this.zzYAh;
    }
}
