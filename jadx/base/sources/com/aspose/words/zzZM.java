package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM {
    private zzY6O zzZEK;
    private int[] zzZEL;
    private int zzZEM;
    private boolean zzZEN;
    private boolean zzZEO;
    private boolean zzZEP;
    private int zzZFU;
    private boolean zzZVx;

    private zzZM(zzY6N zzy6n, zzY6V zzy6v, int[] iArr) throws Exception {
        this.zzZVx = zzy6n.zzhk();
        this.zzZEP = zzy6n.zzaa().getStoryType() == 5;
        this.zzZEO = ((zzYIA) ((zzYIC) zzy6n.zzZXZ()).zz6x()).zzZXN() != null;
        this.zzZEN = zzy6n.zza7().zzYMv();
        zzy6v.getCount();
        this.zzZEL = iArr;
        this.zzZFU = zzy6n.zza7().zzYMw();
        this.zzZEK = new zzY6O(zzy6v, zzy6n.zza7().zzYMu(), zzT(zzy6n), 0, zzy6n.zzY6a().zzYMZ(), zzy6n.zzY6a().zzYM7() / 50, zzy6n.zzY6a().zzYKt() / 50);
    }

    private boolean zzP9(int i) {
        if (this.zzZEN || this.zzZEP) {
            return false;
        }
        return (!this.zzZEO || this.zzZFU > 11) && this.zzZEK.zzXYI() < i && (this.zzZVx || this.zzZEK.zzXYG() <= this.zzZEK.zzXYI());
    }

    private int zzPa(int i) {
        int iZzXYC;
        int iZzXYB;
        int iZzXYA;
        int iZzU;
        int iZzXYB2;
        int iZzXYx = this.zzZEK.zzXYx() + this.zzZEK.zzXYE();
        this.zzZEM = iZzXYx;
        int iZzXYD = this.zzZEK.zzXYD() + this.zzZEK.zzXYB();
        int iZzXYG = this.zzZEK.zzXYG() - this.zzZEK.zzXYF();
        if (iZzXYD < iZzXYG) {
            boolean z = this.zzZEK.zzXYD() > 0;
            if (z) {
                iZzXYG -= this.zzZEK.zzXYB();
                iZzXYB2 = this.zzZEK.zzXYD();
                i += this.zzZEK.zzXYB();
            } else {
                iZzXYB2 = this.zzZEK.zzXYB();
            }
            iZzU = this.zzZEK.zzC(iZzXYG, iZzXYB2, z);
        } else {
            if (iZzXYx >= this.zzZEK.zzXYG()) {
                zzbc();
                if (!zzP9(iZzXYx)) {
                    return iZzXYx;
                }
                int iZzXYI = this.zzZEK.zzXYI();
                this.zzZEK.zzk1(zzbe());
                int iZzXYz = iZzXYx - this.zzZEK.zzXYz();
                zzY6O zzy6o = this.zzZEK;
                int iZzU2 = zzy6o.zzU(iZzXYz, zzy6o.zzXYz(), iZzXYI, true);
                zzbb();
                this.zzZEK.zzk2(iZzXYI);
                this.zzZEM = this.zzZEK.zzXYz();
                return iZzU2;
            }
            if (this.zzZEK.zzXYC() + this.zzZEK.zzXYB() < iZzXYG) {
                zzbf();
                iZzXYC = this.zzZEK.zzXYC() + this.zzZEK.zzXYB() + this.zzZEK.zzXYF();
                iZzXYB = this.zzZEK.zzXYD();
                iZzXYA = this.zzZEK.zzXYC();
            } else {
                zzbd();
                iZzXYC = this.zzZEK.zzXYC() + this.zzZEK.zzXYA() + this.zzZEK.zzXYF();
                iZzXYB = this.zzZEK.zzXYB();
                iZzXYA = this.zzZEK.zzXYA();
            }
            int i2 = iZzXYB - iZzXYA;
            zzY6O zzy6o2 = this.zzZEK;
            iZzU = zzy6o2.zzU(i2, iZzXYC, zzy6o2.zzXYG(), false);
        }
        return i + iZzU;
    }

    private static int zzT(zzY6N zzy6n) throws Exception {
        int width;
        zzYBL zzybl = (zzYBL) ((zzYIA) ((zzYIC) zzy6n.zzZXZ()).zz6x()).zzZZJ();
        int iZz60 = zzybl.zz60();
        if (iZz60 == 16) {
            width = zzybl.getWidth() / 50;
        } else if (iZz60 != 1024) {
            width = iZz60 != 2048 ? zzy6n.zzY6a().zzYKs() : zzybl.zzZXS() / 50;
        } else {
            zzYN8 zzyn8ZzZ = zzZ((zzZKY) zzybl);
            width = zzyn8ZzZ != null ? zzyn8ZzZ.zzZXS() / 50 : zzy6n.zzY6a().zzYKs();
        }
        return width + zzy6n.zzY6a().zzYKr();
    }

    public static boolean zzZ(zzY6N zzy6n, zzY6V zzy6v, int[] iArr) throws Exception {
        return new zzZM(zzy6n, zzy6v, iArr).zzbg();
    }

    private void zzbb() {
        for (int i = 0; i < this.zzZEK.zzXYW().getCount(); i++) {
            this.zzZEK.zzXYW().zzkf(i).zz55().zzk5(this.zzZEK.zzXYW().zzkf(i).zz55().zz56());
        }
    }

    private void zzbc() {
        for (int i = 0; i < this.zzZEK.zzXYW().getCount(); i++) {
            this.zzZEK.zzXYW().zzkf(i).setWidth(this.zzZEK.zzXYW().zzkf(i).zz55().zz6f());
        }
    }

    private void zzbd() {
        for (int i = 0; i < this.zzZEK.zzXYW().getCount(); i++) {
            zzY6T zzy6tZzkf = this.zzZEK.zzXYW().zzkf(i);
            if (zzy6tZzkf.isAuto()) {
                zzy6tZzkf.setWidth(zzy6tZzkf.zz55().zz6f());
                zzy6tZzkf.zz55().zzk6(zzy6tZzkf.zz55().zz6f());
            }
        }
    }

    private int zzbe() {
        int iZz56 = 0;
        for (int i = 0; i < this.zzZEK.zzXYW().getCount(); i++) {
            zzY6T zzy6tZzkf = this.zzZEK.zzXYW().zzkf(i);
            int i2 = this.zzZEL[i];
            if (zzy6tZzkf.zz55().zz56() < i2) {
                zzy6tZzkf.zz55().zzk6(i2);
            }
            iZz56 += zzy6tZzkf.zz55().zz56();
        }
        return iZz56;
    }

    private void zzbf() {
        for (int i = 0; i < this.zzZEK.zzXYW().getCount(); i++) {
            zzY6T zzy6tZzkf = this.zzZEK.zzXYW().zzkf(i);
            if (!zzy6tZzkf.zzXZl() && !zzy6tZzkf.isAuto()) {
                zzy6tZzkf.zz55().zzk5(zzy6tZzkf.getWidth());
            }
        }
    }

    private boolean zzbg() {
        int iZzPa = zzPa(this.zzZEK.zzXYL());
        if (this.zzZEK.zzXYM()) {
            iZzPa = this.zzZEK.zzXYF();
        }
        this.zzZEK.zzVe(iZzPa, this.zzZEM);
        return this.zzZEK.zzXYw();
    }

    private static zzYN8 zzZ(zzZKY zzzky) throws Exception {
        zzZ2D zzz2d;
        int i;
        boolean zIsHeader = zzzky.isHeader();
        zzYN8 zzyn8 = (zzYN8) zzzky.zzZZJ();
        zzYN8 zzyn82 = null;
        if (zzyn8 == null) {
            return null;
        }
        int iZzY = zzZKW.zzY(zzyn8, zIsHeader);
        zzZ6T zzz6tZza9 = zzyn8.zza9();
        while (true) {
            zzz2d = (zzZ2D) zzz6tZza9;
            if (zzz2d == null || !(zzz2d.zzZXV().zzY7m() == null || zzz2d.zzZXV().zzY7m().zzZ((zzZYW) null, iZzY, false) == null)) {
                break;
            }
            zzz6tZza9 = zzz2d.zzYTo();
        }
        if (zzz2d == null) {
            return null;
        }
        zzZ2D zzz2d2 = (zzZ2D) zzz2d.zzYTo();
        for (zzZ2D zzz2d3 = (zzZ2D) zzyn8.zza9(); zzz2d3 != zzz2d2; zzz2d3 = (zzZ2D) zzz2d3.zzYTo()) {
            zzYN8 zzyn8ZzYJb = zzz2d3.zzYJb();
            while (true) {
                if (i >= 3) {
                    break;
                }
                if (((zzZ2D) zzyn8ZzYJb.zza9()) == zzz2d3 && iZzY == zzZKW.zzY(zzyn8ZzYJb, zIsHeader)) {
                    zzyn82 = zzyn8ZzYJb;
                    break;
                }
                zzyn8ZzYJb = (zzYN8) zzyn8ZzYJb.zzYo1();
                i = zzyn8ZzYJb != null ? i + 1 : 0;
            }
        }
        return zzyn82;
    }
}
