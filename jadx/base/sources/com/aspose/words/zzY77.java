package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY77 {
    int height;
    int width;
    int zzX7d;
    int zzX7e;
    int zzX7f;
    int zzX7g;
    int zzX7h;

    public zzY77(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        zzzox.readByte();
        zzzox.readByte();
        this.zzX7h = zzzox.readByte() & 255;
        this.zzX7g = zzzox.readByte() & 255;
        this.zzX7f = zzzox.zzX9() & 65535;
        this.zzX7e = zzzox.zzXc();
        this.zzX7d = zzzox.readByte() & 255;
        if ((this.zzX7h & 16) != 0) {
            this.width = zzzox.zzX9() & 65535;
            this.height = zzzox.zzX9() & 65535;
        }
    }
}
