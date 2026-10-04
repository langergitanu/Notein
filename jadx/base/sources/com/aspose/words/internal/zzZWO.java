package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWO {
    private boolean zz8U;
    private int zzUt;
    private String zzZi;

    public zzZWO(String str, int i, boolean z) {
        this.zzZi = str;
        this.zzUt = i;
        this.zz8U = z;
    }

    public final int getOffset() {
        return this.zzUt;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final boolean isFirstRow() {
        return this.zz8U;
    }
}
