package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz8T {
    public static long zzpr = zzZPX.zzZm(1280, 1024);
    private zzZOP zzN5;
    private zz90 zzps;
    private zz8Y zzpt;
    private zz8Z zzpu;
    private int zzpv;
    private long zzpw;
    private boolean zzpx;
    private long zzpy;
    private zzZQ5 zzwk;

    public zz8T(byte[] bArr) throws Exception {
        this(new zzZOR(bArr));
    }

    private float zzyP() {
        if (zzyW()) {
            return this.zzpt.zzzb() & 65535;
        }
        return 96.0f;
    }

    private boolean zzyR() {
        return zzyV() || zzyS();
    }

    private boolean zzyS() {
        return zzyU() || zzyT();
    }

    private boolean zzyT() {
        return this.zzpv == 4;
    }

    private boolean zzyU() {
        return this.zzpv == 5;
    }

    private boolean zzyV() {
        return this.zzpv == 3;
    }

    private boolean zzyZ() throws Exception {
        int i = this.zzpv;
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3) {
            return false;
        }
        return zzMZ.zzZ(this);
    }

    private zzZQ5 zzz0() throws Exception {
        zzZQ5 zzzq5 = new zzZQ5(0L, this.zzpw);
        this.zzwk = zzzq5;
        return zzZQ5.zzb(zzZT5.zzZ(this, zzzq5.getSize()));
    }

    private zzZQ5 zzz1() throws Exception {
        zzZQ5 zzzq5Zzz0;
        int i = this.zzpv;
        if (i == 1) {
            zzzq5Zzz0 = zzz0();
            if (zzzq5Zzz0.isEmpty()) {
                zzzq5Zzz0 = new zzZQ5(0L, this.zzpw);
            }
        } else if (i == 2) {
            zzzq5Zzz0 = this.zzpt.zzzc() ? this.zzpt.zzWG() : new zzZQ5(0L, this.zzpw);
        } else {
            if (i != 3 && i != 4 && i != 5) {
                throw new IllegalStateException("Unknown metafile type.");
            }
            zzzq5Zzz0 = this.zzps.zzzg();
        }
        return zzzq5Zzz0.isEmpty() ? new zzZQ5(zzzq5Zzz0.getX(), zzzq5Zzz0.getY(), 1, 1) : zzzq5Zzz0;
    }

    private void zzz2() throws Exception {
        this.zzN5.zzH(0L);
        zzZOX zzzox = new zzZOX(this.zzN5);
        if (zzyR()) {
            zz90 zz90Var = new zz90();
            this.zzps = zz90Var;
            zz90Var.zzZ(zzzox);
        } else {
            if (zzyW()) {
                this.zzpt = zz8Y.zzX(zzzox);
            }
            zz8Z zz8z = new zz8Z();
            this.zzpu = zz8z;
            zz8z.zzZ(zzzox);
        }
        this.zzpy = this.zzN5.getPosition();
    }

    public final float getHorizontalResolution() {
        int i = this.zzpv;
        if (i == 1 || i == 2) {
            return zzyP();
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.zzps.getHorizontalResolution();
        }
        throw new IllegalStateException("Unknown metafile type.");
    }

    public final float getVerticalResolution() {
        int i = this.zzpv;
        if (i == 1 || i == 2) {
            return zzyP();
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.zzps.getVerticalResolution();
        }
        throw new IllegalStateException("Unknown metafile type.");
    }

    public final zzZOP zzR1() {
        return this.zzN5;
    }

    public final boolean zzyM() {
        return this.zzpx;
    }

    public final zz99 zzyN() {
        int i = this.zzpv;
        if (i == 1) {
            return new zz96(zzZPX.zzYA(this.zzpw), 0L, zzZPX.zzYA(this.zzwk.getSize()), 1.0f, 1.0f);
        }
        if (i == 2) {
            return new zz96(zzZPX.zzYA(this.zzpw), zzZPZ.zzYE(this.zzwk.zzZE()), zzZPX.zzYA(this.zzwk.getSize()), getHorizontalResolution() / 96.0f, getVerticalResolution() / 96.0f);
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.zzps.zzzf();
        }
        throw new IllegalStateException("Unknown metafile type.");
    }

    public final byte[] zzyO() throws Exception {
        if (zzyR()) {
            return null;
        }
        return zzZV0.zzY(this);
    }

    public final zzZQ5 zzyQ() {
        return this.zzwk;
    }

    public final boolean zzyW() {
        return this.zzpv == 2;
    }

    public final int zzyX() {
        return this.zzpv;
    }

    public final long zzyY() {
        return this.zzpy;
    }

    public final int zzze() {
        if (zzyR()) {
            return 0;
        }
        return this.zzpu.zzze();
    }

    public final zzZQ4 zzzh() {
        int i = this.zzpv;
        return (i == 3 || i == 4 || i == 5) ? this.zzps.zzzh() : zzZQ4.zzN(this.zzwk);
    }

    public zz8T(zzZOP zzzop) throws Exception {
        this(zzzop, zzpr);
    }

    private zz8T(zzZOP zzzop, long j) throws Exception {
        this.zzN5 = zzzop;
        this.zzpw = j;
        int iZzr = zzEF.zzr(zzzop);
        this.zzpv = iZzr;
        if (iZzr != 0) {
            zzz2();
            this.zzwk = zzz1();
            this.zzpx = zzyZ();
            return;
        }
        throw new IllegalStateException("Unknown metafile type.");
    }
}
