package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzW {
    private double zzE;
    private double zzF;
    private boolean zzG;
    private byte[] zzI;
    private int zzJ;
    private zz57 zzK;
    private zzPV[] zzL;
    private zzEG zzM;
    private zzV zzN;
    private zzEP zzO;
    private byte[] zzP;
    private ArrayList<zzP9> zzH = new ArrayList<>();
    private boolean zzD = false;

    private zzW(byte[] bArr, zzEP zzep, zzV zzv) throws Exception {
        zzV zzv2;
        this.zzP = bArr;
        this.zzO = zzep;
        this.zzN = zzv;
        if (!zzv.zzG()) {
            if (this.zzN.getImageCompression() == 0) {
                zzv2 = this.zzN;
                int i = zzEF.zzZU(this.zzP) == 5 ? 6 : 3;
                zzv2.setImageCompression(i);
            }
            return;
        }
        zzV();
        zzv2 = this.zzN;
        zzv2.setImageCompression(i);
    }

    private void zzT() {
        this.zzN.zzI().zzZ(2, this.zzN.zzH(), "Unsupported color mode of source image for Cmyk conversion.");
    }

    private static void zzU(zzOT zzot) {
        for (int i = 0; i < zzot.zzNE().length; i++) {
            if ((zzot.zzNE()[i] & 255) != 255) {
                double dZzZ = zzZ(zzot.zzNE()[i]);
                int i2 = i * 3;
                zzot.zzNF()[i2] = zzZ(zzot.zzNF()[i2], dZzZ);
                int i3 = i2 + 1;
                zzot.zzNF()[i3] = zzZ(zzot.zzNF()[i3], dZzZ);
                int i4 = i2 + 2;
                zzot.zzNF()[i4] = zzZ(zzot.zzNF()[i4], dZzZ);
            }
        }
    }

    private static void zzV(zzOT zzot) {
        for (int i = 0; i < zzot.zzNE().length; i++) {
            if (zzot.zzNE()[i] == 0) {
                int i2 = i * 3;
                zzot.zzNF()[i2] = -1;
                zzot.zzNF()[i2 + 1] = -1;
                zzot.zzNF()[i2 + 2] = -1;
            }
        }
    }

    private static void zzW(zzOT zzot) {
        for (int i = 0; i < zzot.zzS().length; i++) {
            if (zzot.zzS()[i].zzPD() == 0) {
                zzot.zzS()[i] = zzPV.zzI0;
            }
        }
    }

    private zzXN zzX() throws Exception {
        zzW zzw;
        zzXN zzxn = null;
        try {
            zzXN zzxn2 = new zzXN(this.zzP);
            try {
                zzEP zzep = this.zzO;
                boolean z = zzep != null && zzep.zzDX();
                zzEG zzegZzZT = zzEF.zzZT(this.zzP);
                zzZQ5 zzzq5ZzW = z ? this.zzO.zzW(new zzZQ5(0L, zzegZzZT.getSize())) : new zzZQ5(0L, zzegZzZT.getSize());
                long jZzZ = zzZ(zzzq5ZzW.getSize());
                try {
                    boolean zZzZ = zzZ(zzzq5ZzW.getSize(), jZzZ, zzxn2);
                    zzw = this;
                    zzxn2 = zzxn2;
                    if (!zZzZ) {
                        try {
                            jZzZ = zzzq5ZzW.getSize();
                        } catch (Throwable th) {
                            th = th;
                            zzxn = zzxn2;
                            if (zzxn != null && !zzw.zzG) {
                                zzxn.dispose();
                            }
                            throw th;
                        }
                    }
                    long j = jZzZ;
                    if (!z && !zZzZ) {
                        zzw.zzG = true;
                        return zzxn2;
                    }
                    zzXN zzxnZzZ = zzxn2.zzZ(zzzq5ZzW, j, zzxn2.getHorizontalResolution(), zzxn2.getVerticalResolution());
                    zzw.zzG = false;
                    zzxn2.dispose();
                    return zzxnZzZ;
                } catch (Throwable th2) {
                    th = th2;
                    zzw = this;
                    zzxn2 = zzxn2;
                }
            } catch (Throwable th3) {
                th = th3;
                zzw = this;
            }
        } catch (Throwable th4) {
            th = th4;
            zzw = this;
        }
    }

    private static double zzZ(byte b) {
        return ((double) (b & 255)) / 255.0d;
    }

    public final boolean zzM() {
        return this.zzN.zzM();
    }

    public final boolean zzN() {
        return this.zzD;
    }

    public final int zzO() {
        return this.zzJ;
    }

    public final zz57 zzP() {
        return this.zzK;
    }

    public final zzEG zzQ() {
        return this.zzM;
    }

    public final byte[] zzR() {
        return this.zzI;
    }

    public final zzPV[] zzS() {
        return this.zzL;
    }

    public final void zzY(zzZOP zzzop) throws Exception {
        zzXN zzxnZzX = zzX();
        try {
            this.zzM = zzEG.zzZ(zzxnZzX.getWidth(), zzxnZzX.getHeight(), zzxnZzX.getHorizontalResolution(), zzxnZzX.getVerticalResolution());
            zzZ(zzxnZzX, zzzop);
            zzxnZzX.dispose();
        } finally {
        }
    }

    public static zzW zzZ(zz4W zz4w, byte[] bArr, zzEP zzep) throws Exception {
        zzV zzv = new zzV();
        zzv.setImageCompression(zz4w.zzvc().getImageCompression());
        zzv.setJpegQuality(zz4w.zzvc().getJpegQuality());
        zzv.zzZ(zz4w.zzv7().zzvH());
        zzv.setDownsampleImages(zz4w.zzvc().zztE().getDownsampleImages());
        zzv.zzU(zz4w.zzvc().zztE().getResolution());
        zzv.zzT(zz4w.zzvc().zztE().getResolutionThreshold());
        zzv.zzZ(zz4w.zzvc().zzI());
        zzv.zzS(5);
        zzv.zzX(zz4w.zzvc().getPreblendImages());
        zzv.zzY(zz4w.zzvc().getImageColorSpaceExportMode() == 1);
        zzv.zzW(zz4w.zzvc().getInterpolateImages());
        return new zzW(bArr, zzep, zzv);
    }

    public final zz45 zzW() {
        switch (this.zzN.getImageCompression()) {
            case 1:
                return new zz3Y();
            case 2:
                return new zz3X();
            case 3:
                return new zz43();
            case 4:
            case 5:
                return new zz42(this.zzJ, this.zzM.getWidth(), this.zzK.zzvO(), this.zzN.getImageCompression() == 4);
            case 6:
                return new zz40();
            case 7:
            case 8:
                return new zz44(this.zzN.getImageCompression(), this.zzM);
            default:
                throw new IllegalStateException("Unknown image compression filter type.");
        }
    }

    private boolean zzY(long j, long j2, zzXN zzxn) throws Exception {
        if (this.zzN.getImageCompression() != 6 || !zzY(zzxn)) {
            return true;
        }
        zzXN zzxnZzZ = zzxn.zzZ(new zzZQ5(0L, j), j2, zzxn.getHorizontalResolution(), zzxn.getVerticalResolution());
        try {
            zzZOR zzzor = new zzZOR();
            try {
                zzxnZzZ.zzY(zzzor, this.zzN.getJpegQuality());
                if (zzzor.getLength() > this.zzP.length) {
                    zzzor.close();
                    zzxnZzZ.dispose();
                    return false;
                }
                zzzor.close();
                zzxnZzZ.dispose();
                return true;
            } catch (Throwable th) {
                zzzor.close();
                throw th;
            }
        } finally {
        }
    }

    private void zzV() {
        if (this.zzN.getImageCompression() == 0 || this.zzN.getImageCompression() == 3) {
            return;
        }
        this.zzN.zzI().zzZ(2, this.zzN.zzH(), "Unsupported codec for Cmyk color space is set. Using Flate instead.");
    }

    private void zzU() {
        this.zzN.zzI().zzZ(2, this.zzN.zzH(), "Transparency does not conform to PDF/A standard. Transparent image has been made opaque.");
    }

    public static zzW zzZ(zz06 zz06Var, byte[] bArr, zzEP zzep) throws Exception {
        zzV zzv = new zzV();
        zzv.setJpegQuality(zz06Var.zzs1().getJpegQuality());
        zzv.zzZ(zz06Var.zzs1().zzI());
        zzv.zzS(9);
        zzv.zzX(false);
        return new zzW(bArr, zzep, zzv);
    }

    private void zzX(zzXN zzxn, zzZOP zzzop) throws Exception {
        if (zzY(zzxn)) {
            byte[] bArr = this.zzP;
            zzzop.write(bArr, 0, bArr.length);
        } else {
            zzxn.zzY(zzzop, this.zzN.getJpegQuality());
        }
        int iZzWH = zzxn.zzWH();
        if (iZzWH == 0) {
            this.zzK = zz57.zzvK();
            this.zzJ = 8;
        } else {
            if (iZzWH == 2) {
                this.zzK = zz57.zzvL();
                this.zzJ = 8;
                return;
            }
            throw new IllegalStateException("Unexpected color model.");
        }
    }

    private boolean zzY(zzXN zzxn) {
        return zzxn.getImageType() == 5 && zzxn.zzWH() != 1 && !zzxn.zzWB() && this.zzN.getJpegQuality() == 100;
    }

    public final void zzZ(zzP9 zzp9) {
        zzZQG.zzZ(this.zzH, zzp9);
    }

    private long zzZ(long j) {
        if (this.zzH.size() == 0 || !this.zzN.getDownsampleImages()) {
            return j;
        }
        Iterator<zzP9> it = this.zzH.iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        while (it.hasNext()) {
            long[] jArrZzN = it.next().zzN(new zzZQ4(0.0f, 0.0f, 1.0f, 1.0f));
            double dZzO = zzJ6.zzO(jArrZzN[0], jArrZzN[1]);
            double dZzO2 = zzJ6.zzO(jArrZzN[0], jArrZzN[3]);
            if (dZzO > d) {
                d = dZzO;
            }
            if (dZzO2 > d2) {
                d2 = dZzO2;
            }
        }
        int iZzZE = (int) j;
        double d3 = iZzZE;
        this.zzF = d3 / (d / 72.0d);
        int iZzZE2 = (int) (j >>> 32);
        double d4 = iZzZE2;
        this.zzE = d4 / (d2 / 72.0d);
        double dZzL = ((double) this.zzN.zzL()) / this.zzF;
        double dZzL2 = ((double) this.zzN.zzL()) / this.zzE;
        if (dZzL < 1.0d) {
            iZzZE = zzAN.zzZE(d3 * dZzL);
        }
        if (dZzL2 < 1.0d) {
            iZzZE2 = zzAN.zzZE(d4 * dZzL2);
        }
        return zzZPX.zzZm(iZzZE, iZzZE2);
    }

    private static void zzY(zzOT zzot) {
        for (int i = 0; i < zzot.zzNE().length; i++) {
            if ((zzot.zzNE()[i] & 255) != 255) {
                double dZzZ = zzZ(zzot.zzNE()[i]);
                int i2 = i * 3;
                zzot.zzNF()[i2] = zzY(zzot.zzNF()[i2], dZzZ);
                int i3 = i2 + 1;
                zzot.zzNF()[i3] = zzY(zzot.zzNF()[i3], dZzZ);
                int i4 = i2 + 2;
                zzot.zzNF()[i4] = zzY(zzot.zzNF()[i4], dZzZ);
            }
        }
    }

    private void zzX(zzOT zzot) {
        int iZzNB = zzot.zzNB();
        if (iZzNB != 0) {
            if (iZzNB == 1) {
                zzW(zzot);
                return;
            } else {
                if (iZzNB != 2) {
                    throw new IllegalStateException("Unexpected color model.");
                }
                return;
            }
        }
        if (this.zzN.zzF()) {
            zzU(zzot);
            this.zzD = true;
        } else {
            zzV(zzot);
        }
    }

    private static byte zzY(byte b, double d) {
        return (byte) zzZKQ.zzZa((d * ((double) ((b & 255) - 255))) + 255.0d);
    }

    private void zzY(zzXN zzxn, zzZOP zzzop) throws Exception {
        if (!zzxn.zzDW().hasAlpha()) {
            zzX(zzxn, zzzop);
            return;
        }
        if (!this.zzN.zzJ()) {
            zzU();
            zzZ(zzxn, zzzop, zzPV.zzI5);
            return;
        }
        byte[] bArrZzZ = zzZ(zzxn);
        this.zzI = bArrZzZ;
        if (bArrZzZ != null && this.zzN.zzF()) {
            zzZ(zzxn, zzzop, zzPV.zzKa);
        } else {
            zzX(zzxn, zzzop);
        }
    }

    private boolean zzZ(long j, long j2, zzXN zzxn) throws Exception {
        int i;
        if (this.zzN.zzK() != 0 && (this.zzF <= this.zzN.zzK() || this.zzE <= this.zzN.zzK())) {
            return false;
        }
        int iZzWH = zzxn.zzWH();
        int i2 = 3;
        if (iZzWH != 0) {
            i = 1;
            if (iZzWH != 1) {
                if (iZzWH != 2) {
                    throw new IllegalStateException("Unexpected color model.");
                }
                i2 = 1;
            }
        } else {
            i = 3;
        }
        if ((((int) j2) * ((int) (j2 >>> 32)) * i2) + 76800 < ((int) j) * ((int) (j >>> 32)) * i) {
            return zzY(j, j2, zzxn);
        }
        return false;
    }

    private void zzZ(zzXN zzxn, zzZOP zzzop) throws Exception {
        if (zzxn.zzWH() == 1 && this.zzN.getImageCompression() == 6) {
            this.zzN.setImageCompression(3);
        }
        int imageCompression = this.zzN.getImageCompression();
        if (imageCompression == 6) {
            zzY(zzxn, zzzop);
        } else if (imageCompression != 7 && imageCompression != 8) {
            zzZ(zzxn, false, zzzop);
        } else {
            zzZ(zzxn, true, zzzop);
        }
    }

    private static byte[] zzZ(zzXN zzxn) {
        if (zzxn.zzWH() == 0 && zzxn.zzDW().hasAlpha()) {
            return zzxn.zzWF();
        }
        return null;
    }

    private void zzZ(zzXN zzxn, zzZOP zzzop, zzPV zzpv) throws Exception {
        zzEF.zzZ(zzxn, zzzop, zzpv, this.zzN.getJpegQuality());
        this.zzK = zz57.zzvK();
        this.zzJ = 8;
        this.zzD = true;
    }

    private void zzZ(zzOT zzot) {
        if (zzot.zzND()) {
            if (zzot.zzNB() == 0) {
                zzY(zzot);
            }
            zzot.zzn(zzZ1.zzXW);
            zzot.zzNC();
            zzU();
        }
    }

    private static byte zzZ(byte b, double d) {
        return (byte) zzZKQ.zzZa(d * ((double) (b & 255)));
    }

    private void zzZ(zzXN zzxn, boolean z, zzZOP zzzop) throws Exception {
        zzOT zzotZzB;
        if (zzxn.zzDW().hasAlpha() && !z && !this.zzN.zzJ()) {
            zzotZzB = zzxn.zzWE();
        } else {
            zzotZzB = zzxn.zzB(z);
        }
        if (!this.zzN.zzJ()) {
            zzZ(zzotZzB);
        }
        if (zzotZzB.zzND()) {
            zzX(zzotZzB);
        }
        if (this.zzN.zzG()) {
            if (zzotZzB.zzNA()) {
                zzotZzB = zzotZzB.zzNz();
            } else {
                zzT();
            }
        }
        this.zzK = zz57.zzUa(zzotZzB.zzNB());
        this.zzJ = zzotZzB.zzO();
        if (zzotZzB.zzNB() == 1) {
            this.zzL = zzotZzB.zzS();
        }
        if (zzotZzB.zzND()) {
            this.zzI = zzotZzB.zzNE();
        }
        zzzop.write(zzotZzB.zzNF(), 0, zzotZzB.zzNF().length);
    }
}
