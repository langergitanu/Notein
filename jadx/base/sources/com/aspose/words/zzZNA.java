package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNA {
    String zzLJ;
    int zzYxA;
    int zzYxB;
    int zzYxC;

    public zzZNA() {
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzK((short) this.zzYxC);
        zzzow.writeByte((byte) this.zzYxB);
        zzzow.writeByte((byte) this.zzYxA);
        zzzow.zzl(0);
    }

    public zzZNA(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzLJ = str;
        this.zzYxC = zzzox.zzXa();
        this.zzYxB = zzzox.readByte() & 255;
        this.zzYxA = zzzox.readByte() & 255;
        zzzox.zzXc();
    }
}
