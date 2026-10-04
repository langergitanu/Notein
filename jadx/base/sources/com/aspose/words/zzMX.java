package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzMX extends zzMP {
    private int zzVf;
    private boolean zzZEG;
    private zzOI zzZpp;
    private zzOI zzZpq;
    private int zzvP;
    private static zzOI zzZpo = new zzOI(8.5d, 1);
    private static zzOI zzZpn = new zzOI(11.0d, 1);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("landscape", "portrait", "a5", "a4", "a3", "b5", "b4", "letter", "legal", "ledger");

    private zzMX(zzL2 zzl2) {
        super(zzl2);
    }

    private static boolean zzY(zzOT zzot, RefInt refInt) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzot.getValue()))) {
            case 2:
                refInt.set(1);
                return true;
            case 3:
                refInt.set(2);
                return true;
            case 4:
                refInt.set(3);
                return true;
            case 5:
                refInt.set(4);
                return true;
            case 6:
                refInt.set(5);
                return true;
            case 7:
                refInt.set(6);
                return true;
            case 8:
                refInt.set(7);
                return true;
            case 9:
                refInt.set(8);
                return true;
            default:
                refInt.set(0);
                return false;
        }
    }

    public static zzMX zzZ(zzOI zzoi, zzOI zzoi2) {
        zzMX zzmx = new zzMX(new zzL2(zzoi, zzoi2));
        zzmx.zzZpq = zzoi;
        zzmx.zzZpp = zzoi2;
        return zzmx;
    }

    private zzOI zzZVH() {
        double d;
        double d2;
        int i = 1;
        switch (this.zzVf) {
            case 0:
            case 2:
                d = 297.0d;
                i = 3;
                d2 = d;
                return new zzOI(d2, i);
            case 1:
                d = 210.0d;
                i = 3;
                d2 = d;
                return new zzOI(d2, i);
            case 3:
                d = 420.0d;
                i = 3;
                d2 = d;
                return new zzOI(d2, i);
            case 4:
                d = 250.0d;
                i = 3;
                d2 = d;
                return new zzOI(d2, i);
            case 5:
                d = 353.0d;
                i = 3;
                d2 = d;
                return new zzOI(d2, i);
            case 6:
                d2 = 11.0d;
                return new zzOI(d2, i);
            case 7:
                d2 = 14.0d;
                return new zzOI(d2, i);
            case 8:
                d2 = 17.0d;
                return new zzOI(d2, i);
            default:
                return zzZpn;
        }
    }

    private zzOI zzZVI() {
        double d = 8.5d;
        int i = 1;
        switch (this.zzVf) {
            case 0:
            case 2:
                d = 210.0d;
                i = 3;
                return new zzOI(d, i);
            case 1:
                d = 148.0d;
                i = 3;
                return new zzOI(d, i);
            case 3:
                d = 297.0d;
                i = 3;
                return new zzOI(d, i);
            case 4:
                d = 176.0d;
                i = 3;
                return new zzOI(d, i);
            case 5:
                d = 250.0d;
                i = 3;
                return new zzOI(d, i);
            case 8:
                d = 11.0d;
            case 6:
            case 7:
                return new zzOI(d, i);
            default:
                return zzZpo;
        }
    }

    public static zzMX zzZVJ() {
        zzMX zzmx = new zzMX(new zzL2(zzL4.zzZng));
        zzmx.zzZEG = true;
        return zzmx;
    }

    public final int getOrientation() {
        return this.zzvP;
    }

    public final zzOI zzZVF() {
        zzOI zzoi = this.zzZpp;
        return zzoi != null ? zzoi : this.zzZEG ? zzZpn : zzZVH();
    }

    public final zzOI zzZVG() {
        zzOI zzoi = this.zzZpq;
        return zzoi != null ? zzoi : this.zzZEG ? zzZpo : zzZVI();
    }

    public static zzMX zzZ(zzOI zzoi) {
        zzMX zzmx = new zzMX(new zzL2(zzoi));
        zzmx.zzZpq = zzoi;
        zzmx.zzZpp = zzoi;
        return zzmx;
    }

    public static zzMX zzZ(zzOT zzot) {
        RefInt refInt = new RefInt(0);
        boolean zZzY = zzY(zzot, refInt);
        int i = refInt.get();
        if (zZzY) {
            zzMX zzmx = new zzMX(new zzL2(zzot));
            zzmx.zzVf = i;
            zzmx.zzvP = 0;
            return zzmx;
        }
        RefInt refInt2 = new RefInt(0);
        boolean zZzZ = zzZ(zzot, refInt2);
        int i2 = refInt2.get();
        if (!zZzZ) {
            return null;
        }
        zzMX zzmx2 = new zzMX(new zzL2(zzot));
        zzmx2.zzVf = 6;
        zzmx2.zzvP = i2;
        return zzmx2;
    }

    public static zzMX zzZ(zzOT zzot, zzOT zzot2) {
        int i;
        RefInt refInt = new RefInt(0);
        boolean zZzY = zzY(zzot, refInt);
        int i2 = refInt.get();
        if (zZzY) {
            RefInt refInt2 = new RefInt(0);
            boolean zZzZ = zzZ(zzot2, refInt2);
            i = refInt2.get();
            if (!zZzZ) {
                return null;
            }
        } else {
            refInt.set(i2);
            boolean zZzY2 = zzY(zzot2, refInt);
            i2 = refInt.get();
            if (!zZzY2) {
                return null;
            }
            RefInt refInt3 = new RefInt(0);
            boolean zZzZ2 = zzZ(zzot, refInt3);
            i = refInt3.get();
            if (!zZzZ2) {
                return null;
            }
            zzot2 = zzot;
            zzot = zzot2;
        }
        zzMX zzmx = new zzMX(new zzL2(zzot, zzot2));
        zzmx.zzVf = i2;
        zzmx.zzvP = i;
        return zzmx;
    }

    private static boolean zzZ(zzOT zzot, RefInt refInt) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzot.getValue()));
        if (iZzTP == 0) {
            refInt.set(1);
            return true;
        }
        if (iZzTP != 1) {
            refInt.set(0);
            return false;
        }
        refInt.set(2);
        return true;
    }
}
