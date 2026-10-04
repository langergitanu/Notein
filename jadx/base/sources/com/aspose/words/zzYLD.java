package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLD {
    int zzXE5;
    int zzXE6;
    boolean zzXE7;
    boolean zzXE8;
    boolean zzXE9;
    boolean zzXEa;
    int zzXEb;
    int zzYxC;

    public zzYLD() {
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.writeByte((byte) this.zzXEb);
        zzzow.writeByte((byte) ((this.zzXEa ? 1 : 0) | (this.zzXE9 ? 2 : 0) | (this.zzXE8 ? 4 : 0) | (this.zzXE7 ? 8 : 0)));
        zzzow.zzK((short) this.zzXE6);
        zzzow.zzK((short) this.zzXE5);
        zzzow.zzK((short) this.zzYxC);
    }

    public zzYLD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXEb = zzzox.readByte() & 255;
        byte b = zzzox.readByte();
        this.zzXEa = (b & 1) != 0;
        this.zzXE9 = (b & 2) != 0;
        this.zzXE8 = (b & 4) != 0;
        this.zzXE7 = (b & 8) != 0;
        this.zzXE6 = zzzox.zzXa();
        this.zzXE5 = zzzox.zzXa();
        this.zzYxC = zzzox.zzXa();
    }
}
