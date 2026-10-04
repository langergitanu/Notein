package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ1C {
    private Document zzYTQ;

    public zzZ1C(Document document) {
        this.zzYTQ = document;
    }

    public abstract int zzH();

    public final void zzT(int i, String str) {
        if (this.zzYTQ.getWarningCallback() != null) {
            this.zzYTQ.getWarningCallback().warning(new WarningInfo(i, zzH(), str));
        }
    }
}
