package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1V implements zzZ8R {
    private int zzWVh;

    public zzY1V() {
        this((byte) 0);
    }

    public final int zzXSJ() {
        return this.zzWVh;
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) 0);
        zzzow.zzJ((short) 36);
        zzzow.zzJ((short) 2);
        zzzow.zzJ((short) this.zzWVh);
        zzzow.zzl(0);
    }

    public final void zzi6(int i) {
        this.zzWVh = i;
    }

    private zzY1V(byte b) {
        this.zzWVh = 0;
    }

    public zzY1V(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.zzX9();
        zzzox.zzX9();
        zzzox.zzX9();
        this.zzWVh = zzzox.zzXa();
        zzzox.zzXc();
    }
}
