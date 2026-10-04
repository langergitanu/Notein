package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIH {
    private String mName;
    private byte[] zzXxl;

    public zzYIH(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        short sZzXa = zzzox.zzXa();
        short sZzXa2 = zzzox.zzXa();
        this.zzXxl = zzzox.zzn(sZzXa);
        this.mName = zzZZR.zzW(zzzox, sZzXa2, i);
    }

    public final void zzW(com.aspose.words.internal.zzZOW zzzow, int i) throws Exception {
        zzzow.zzK((short) this.zzXxl.length);
        zzzow.zzK((short) (this.mName.length() + 1));
        zzzow.writeBytes(this.zzXxl);
        zzZZQ.zzZ(zzzow, this.mName, i, false);
    }
}
