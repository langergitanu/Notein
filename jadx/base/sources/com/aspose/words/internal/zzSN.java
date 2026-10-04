package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSN {
    private static Object zzOG = new Object();
    private int zzOH;
    private boolean zzOI;
    private boolean zzOJ;
    private zzPZ[] zzOK;
    private zzPZ[] zzOL;
    private zzOQ zzOM;
    private zzOQ zzON;
    private zzOS zzOO;
    private boolean zzOP;
    private boolean zzOQ;
    private boolean zzOR;
    private Object zzOS;
    private zzOW zzOT;
    private zzP5 zzOU;
    private zzZG zzOV;
    private zzZV4 zzOW;
    private zzZG zzOX;
    private int zzOY;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzSN(zzZG zzzg, zzZV4 zzzv4) {
        float width;
        this.zzOW = zzzv4;
        zzZG zzzg2 = new zzZG();
        this.zzOV = zzzg2;
        this.zzOX = zzzg;
        zzzg2.zzX(zzzg.zzZ2().zzNP());
        this.zzOV.zzZ2().zzV(zzSO.zzOZ);
        this.zzOV.zzZ2().zzW(zzSO.zzOZ);
        this.zzOV.zzZ2().setDashStyle(0);
        zzOU zzouZzZ2 = this.zzOV.zzZ2();
        if (zzzv4.getWidth() >= 0.9f) {
            width = zzzv4.getWidth() > 1.0f ? zzzv4.getWidth() : 1.0f;
        }
        zzouZzZ2.setWidth(width);
    }

    private static boolean zzZ(zzPZ zzpz, zzP5 zzp5, int i, zz0Q zz0q, zzOW zzow, boolean z) {
        zz0q.add(zzpz.zzPX());
        zz0q.add(zzpz.zzPW());
        return zzow != null ? zzZ((zzOW) zzpz, zzow, false, z, zzp5, i) : zzp5.zzNY().size() != 1 && zzp5.isClosed() && zzZ((zzOW) zzpz, zzp5.zzNY().get(zzp5.zzNY().size() - 1), false, zzp5.zzNY().get(zzp5.zzNY().size() - 1) instanceof zzOS, zzp5, i);
    }

    public final zzZG zzRJ() {
        return this.zzOX;
    }

    public final int zzRK() {
        return this.zzOY;
    }

    public final int zzRL() {
        return this.zzOH;
    }

    public final boolean zzRM() {
        return this.zzOI;
    }

    public final boolean zzRN() {
        return this.zzOJ;
    }

    public final zzOQ zzRO() {
        return this.zzOM;
    }

    public final zzOQ zzRP() {
        return this.zzON;
    }

    public final zzOS zzRQ() {
        return this.zzOO;
    }

    public final boolean zzRR() {
        return this.zzOP;
    }

    public final boolean zzRS() {
        return this.zzOQ;
    }

    public final Object zzRT() {
        return this.zzOS;
    }

    public final zzOW zzRU() {
        return this.zzOT;
    }

    public final zzZG zzRV() {
        return this.zzOV;
    }

    public final zzZV4 zzRW() {
        return this.zzOW;
    }

    public final zzP5 zzRX() {
        return this.zzOU;
    }

    public final void zzRY() {
        this.zzOS = zzOG;
    }

    public final void zzV(zzOQ zzoq) {
        long jZzYa = 0;
        for (int i = 0; i < this.zzOK.length; i++) {
            if (zzoq.getCount() > i) {
                this.zzOK[(r0.length - 1) - i].zzZ(zzoq, i);
                jZzYa = zzoq.zzYa(i);
            } else {
                this.zzOK[(r0.length - 1) - i].zzY(jZzYa, jZzYa, jZzYa);
            }
        }
    }

    public final void zzW(zzOQ zzoq) {
        long jZzYa = 0;
        for (int i = 0; i < this.zzOL.length; i++) {
            if (zzoq.getCount() > i) {
                this.zzOL[i].zzZ(zzoq, i);
                jZzYa = zzoq.zzYa(i);
            } else {
                this.zzOL[i].zzY(jZzYa, jZzYa, jZzYa);
            }
        }
        if (this.zzOH != 2 || this.zzOP) {
            return;
        }
        this.zzOM = zzoq;
    }

    public final void zzX(zzP5 zzp5) {
        zzP5 zzp52 = new zzP5();
        this.zzOU = zzp52;
        zzp52.zze(zzp5.isClosed());
        this.zzOJ = zzp5.isClosed();
        zzZQG.zzZ(this.zzOV.zzZ0().zzO7(), this.zzOU);
        this.zzOT = null;
        this.zzOS = null;
        this.zzOO = null;
        this.zzOR = false;
        this.zzOH = 0;
        this.zzOY = zzp5.zzNY().size();
        this.zzOI = zzJ6.zzT(zzW(zzp5));
    }

    public final void zzYH(int i) {
        this.zzOH = i;
    }

    public final void zzl(boolean z) {
        this.zzOJ = z;
    }

    public final void zzV(zzOS zzos, zzOS zzos2) {
        this.zzOT = zzos2;
        this.zzOS = zzos;
        this.zzOQ = true;
        if (this.zzOR) {
            return;
        }
        this.zzOR = true;
        this.zzOO = zzos;
        this.zzOP = true;
    }

    private static zz0Q zzW(zzP5 zzp5) {
        zzP5 zzp52;
        zz0Q zz0q = new zz0Q();
        zzOW zzow = null;
        int i = 0;
        boolean z = false;
        while (i < zzp5.zzNY().size()) {
            zzOW zzow2 = zzp5.zzNY().get(i);
            if (zzow2 instanceof zzOS) {
                zzp52 = zzp5;
                zzZ((zzOS) zzow2, zzp52, i, zz0q, zzow, z);
                z = true;
            } else {
                zzp52 = zzp5;
                if (zzow2 instanceof zzPZ) {
                    if (zzZ((zzPZ) zzow2, zzp52, i, zz0q, zzow, z)) {
                        i++;
                    }
                    z = false;
                }
            }
            i++;
            zzp5 = zzp52;
            zzow = zzow2;
        }
        return zz0q;
    }

    private static void zzZ(zzOS zzos, zzP5 zzp5, int i, zz0Q zz0q, zzOW zzow, boolean z) {
        zz0q.zzR(zzos.zzNu());
        if (zzow != null) {
            zzZ((zzOW) zzos, zzow, true, z, zzp5, i);
        } else {
            if (zzp5.zzNY().size() == 1 || !zzp5.isClosed()) {
                return;
            }
            zzZ((zzOW) zzos, zzp5.zzNY().get(zzp5.zzNY().size() - 1), true, zzp5.zzNY().get(zzp5.zzNY().size() - 1) instanceof zzOS, zzp5, i);
        }
    }

    private static boolean zzZ(zzOW zzow, zzOW zzow2, boolean z, boolean z2, zzP5 zzp5, int i) {
        if (z) {
            zzZ(zzow, zzow2, z2);
            return false;
        }
        return zzZ(zzow, zzow2, z2, zzp5, i);
    }

    private static boolean zzZ(zzOW zzow, zzOW zzow2, boolean z, zzP5 zzp5, int i) {
        zzPZ zzpz = (zzPZ) zzow;
        if (z) {
            zzZ(zzow2, zzpz.zzPX());
        } else {
            zzPZ zzpz2 = (zzPZ) zzow2;
            if (!zzJ6.zzW(zzpz2.zzPW(), zzpz.zzPX(), 0.1f)) {
                zzp5.zzNY().add(i, new zzOS(new long[]{zzpz2.zzPW(), zzpz.zzPX()}, false));
                return true;
            }
        }
        return false;
    }

    private static void zzZ(zzOW zzow, zzOW zzow2, boolean z) {
        zzOS zzos = (zzOS) zzow;
        if (z) {
            zzZ(zzow2, zzos.zzNu().get(0));
            return;
        }
        zzPZ zzpz = (zzPZ) zzow2;
        if (zzJ6.zzW(zzpz.zzPW(), zzos.zzNu().get(0), 0.1f)) {
            return;
        }
        zzos.zzNu().zzT(0, zzpz.zzPW());
    }

    private static void zzZ(zzOW zzow, long j) {
        zzOS zzos = (zzOS) zzow;
        if (zzJ6.zzW(zzos.zzNu().get(zzos.zzNu().getCount() - 1), j, 0.1f)) {
            return;
        }
        zzos.zzNu().add(j);
    }

    public final void zzZ(zzOQ zzoq, zzPZ[] zzpzArr, zzPZ zzpz) {
        this.zzOS = zzOG;
        this.zzON = zzoq;
        this.zzOL = zzpzArr;
        if (!this.zzOR) {
            this.zzOR = true;
            this.zzOP = false;
            this.zzOM = zzoq;
            this.zzOK = zzpzArr;
        }
        this.zzOT = zzpz;
        this.zzOQ = false;
    }
}
