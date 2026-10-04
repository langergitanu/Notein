package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzQT {
    long zzLA;
    long zzLB;
    int zzLC;
    zzZOZ zzLD;
    int zzLE;
    int zzLF;
    int zzLG;
    int zzLH;
    int zzLI;
    String zzLJ;
    boolean zzLx;
    long zzLy;
    int zzLz;

    public zzQT() {
        this.zzLI = 0;
        this.zzLH = 1;
        this.zzLG = -1;
        this.zzLF = -1;
        this.zzLE = -1;
        this.zzLD = zzZOZ.zzZXP;
    }

    public final void zzZ(zzZOW zzzow) throws Exception {
        int length;
        byte[] bArr = new byte[64];
        if (zzZYD.zzXk(this.zzLJ)) {
            byte[] bytes = zzZO0.zzhU().getBytes(this.zzLJ);
            if (bytes.length > 62) {
                throw new IllegalStateException(zzZKN.format("The name '{0}' is too long for writing to structured storage.", this.zzLJ));
            }
            zzZKV.zzZ(bytes, 0, bArr, 0, bytes.length);
            length = bytes.length + 2;
        } else {
            length = 0;
        }
        zzzow.writeBytes(bArr);
        zzzow.zzK((short) length);
        zzzow.writeByte((byte) this.zzLI);
        zzzow.writeByte((byte) this.zzLH);
        zzzow.zzl((int) (((long) this.zzLG) & 4294967295L));
        zzzow.zzl((int) (((long) this.zzLF) & 4294967295L));
        zzzow.zzl((int) (((long) this.zzLE) & 4294967295L));
        zzzow.writeBytes(this.zzLD.toByteArray());
        zzzow.zzl((int) (((long) this.zzLC) & 4294967295L));
        zzzow.zzQ(this.zzLB);
        zzzow.zzQ(this.zzLA);
        zzzow.zzl((int) (((long) this.zzLz) & 4294967295L));
        zzzow.zzl((int) this.zzLy);
        zzzow.zzl(0);
    }

    public zzQT(String str, boolean z, zzZOZ zzzoz) {
        this();
        this.zzLJ = str;
        this.zzLI = z ? 5 : 1;
        this.zzLD = zzzoz;
        this.zzLz = z ? -1 : 0;
    }

    public zzQT(String str, long j) {
        this();
        this.zzLJ = str;
        this.zzLI = 2;
        this.zzLy = j;
        this.zzLz = -1;
    }

    public zzQT(zzZOX zzzox) throws Exception {
        int iZzXa;
        int position = (int) zzzox.zzq().getPosition();
        byte[] bArrZzn = zzzox.zzn(64);
        if (bArrZzn.length >= 64 && (iZzXa = zzzox.zzXa() & 65535) <= 64) {
            if (iZzXa > 0) {
                if (iZzXa <= bArrZzn.length) {
                    this.zzLJ = zzZO0.zzhU().zzR(bArrZzn, 0, iZzXa - 2);
                } else {
                    throw new IllegalStateException("The structured storage seems to be corrupt.");
                }
            } else {
                this.zzLJ = null;
            }
            int iZzX6 = zzzox.zzX6() & 255;
            this.zzLI = iZzX6;
            if (iZzX6 == 0) {
                zzzox.zzq().zzH(position + 128);
                return;
            }
            this.zzLH = zzzox.zzX6() & 255;
            this.zzLG = zzzox.zzXc();
            this.zzLF = zzzox.zzXc();
            this.zzLE = zzzox.zzXc();
            this.zzLD = new zzZOZ(zzzox.zzn(16));
            this.zzLC = zzzox.zzXc();
            this.zzLB = zzzox.zzX8();
            if (zzZYQ.zzT(zzzox, 20)) {
                this.zzLA = zzzox.zzX8();
                this.zzLz = zzzox.zzXc();
                this.zzLy = ((long) zzzox.zzXc()) & 4294967295L;
                zzzox.zzXc();
            }
        }
    }
}
