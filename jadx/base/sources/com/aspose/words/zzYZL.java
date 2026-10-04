package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZL {
    int zzY06;
    int zzZGD;

    public zzYZL() {
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeByte((byte) 86);
        zzzow.writeByte((byte) 0);
        zzzow.zzJ((short) this.zzZGD);
        zzzow.zzJ((short) this.zzY06);
        zzzow.zzJ((short) -1);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
    }

    public zzYZL(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.readByte();
        zzzox.readByte();
        this.zzZGD = zzzox.zzX9() & 65535;
        this.zzY06 = zzzox.zzX9() & 65535;
        zzzox.zzX9();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzXc();
    }
}
