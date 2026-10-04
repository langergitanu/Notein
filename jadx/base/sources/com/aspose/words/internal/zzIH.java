package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzIH {
    int zzxZ;
    int zzy0;
    int zzy1;
    int zzy2;
    int zzy3;
    int zzy4;
    int zzy5;
    int zzy6;
    short zzy7;
    short zzy8;
    short zzy9;
    short zzya;

    public zzIH() {
        this.zzya = (short) 33;
        this.zzy9 = (short) 3;
        this.zzy8 = (short) 9;
        this.zzy7 = (short) 6;
        this.zzy3 = 4096;
    }

    public final int zzGq() {
        return this.zzy1 * 512;
    }

    public final void zzZ(zzZOW zzzow) throws Exception {
        zzzow.zzQ(-2226271756974174256L);
        zzzow.writeBytes(new byte[16]);
        zzzow.zzK((short) (this.zzya & 65535));
        zzzow.zzK((short) (this.zzy9 & 65535));
        zzzow.zzK((short) -2);
        zzzow.zzK((short) (this.zzy8 & 65535));
        zzzow.zzK((short) (this.zzy7 & 65535));
        zzzow.zzK((short) 0);
        zzzow.zzl(0);
        zzzow.zzl(this.zzy6);
        zzzow.zzl(this.zzy5);
        zzzow.zzl((int) (((long) this.zzy4) & 4294967295L));
        zzzow.zzl(0);
        zzzow.zzl((int) (((long) this.zzy3) & 4294967295L));
        zzzow.zzl((int) (((long) this.zzy2) & 4294967295L));
        zzzow.zzl(this.zzy1);
        zzzow.zzl((int) (((long) this.zzy0) & 4294967295L));
        zzzow.zzl(this.zzxZ);
    }

    public final boolean zzZZ(long j) {
        return j >= (((long) this.zzy3) & 4294967295L);
    }

    public zzIH(zzZOX zzzox) throws Exception {
        if (zzzox.zzX8() == -2226271756974174256L) {
            zzzox.zzn(16);
            this.zzya = zzzox.zzXa();
            short sZzXa = zzzox.zzXa();
            this.zzy9 = sZzXa;
            if ((sZzXa & 65535) <= 3) {
                zzzox.zzXa();
                this.zzy8 = zzzox.zzXa();
                this.zzy7 = zzzox.zzXa();
                zzzox.zzXa();
                zzzox.zzXc();
                this.zzy6 = zzzox.zzXc();
                this.zzy5 = zzzox.zzXc();
                this.zzy4 = zzzox.zzXc();
                zzzox.zzXc();
                this.zzy3 = zzzox.zzXc();
                this.zzy2 = zzzox.zzXc();
                this.zzy1 = zzzox.zzXc();
                this.zzy0 = zzzox.zzXc();
                this.zzxZ = zzzox.zzXc();
                return;
            }
            throw new UnsupportedOperationException("This structured storage version is not supported.");
        }
        throw new IllegalStateException("This is not a structured storage file.");
    }
}
