package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzXP {
    short zzVG = 19778;
    int zzVF = 0;
    short zzVE = 0;
    short zzVD = 0;
    int zzVC = 0;

    public final void zzZ(zzZOW zzzow) throws Exception {
        zzzow.zzK((short) (this.zzVG & 65535));
        zzzow.zzl((int) (((long) this.zzVF) & 4294967295L));
        zzzow.zzK((short) (this.zzVE & 65535));
        zzzow.zzK((short) (this.zzVD & 65535));
        zzzow.zzl((int) (((long) this.zzVC) & 4294967295L));
    }

    public final void zzZ(zzZOX zzzox) throws Exception {
        this.zzVG = zzzox.zzXa();
        this.zzVF = zzzox.zzXc();
        this.zzVE = zzzox.zzXa();
        this.zzVD = zzzox.zzXa();
        this.zzVC = zzzox.zzXc();
    }
}
