package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz1P extends zz1O implements zzZC7 {
    private float zzYYA;
    private float zzYYB;
    private boolean zzYYt;
    private zz07 zzYYu;
    private float zzYYv;
    private float zzYYw;
    private float zzYYx;
    private float zzYYy;
    private float zzYYz;
    private zz2O zzZ3O;
    private zz10 zzZ9q;

    public zz1P(zz2O zz2o) {
        this(zz2o, false);
    }

    private boolean zzF(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        return zzZue() ? zzzq4.getWidth() > zzzq42.getWidth() : zzzq4.getHeight() > zzzq42.getHeight();
    }

    private long zzG(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        float fZzZm;
        float height;
        float f = -zzzq4.getY();
        float f2 = -zzzq4.getX();
        if (zzZue()) {
            fZzZm = ((zzzq42.getWidth() - zzzq4.getWidth()) / 2.0f) + zzzq42.zzZm() + f2;
            height = zzzq42.zzZo() + f;
            if (com.aspose.words.internal.zzAN.zzS(zzZuc(), -90.0f)) {
                height += zzzq42.getHeight() - zzzq4.getHeight();
            }
        } else {
            fZzZm = zzzq42.zzZm() + f2;
            height = ((zzzq42.getHeight() - zzzq4.getHeight()) / 2.0f) + zzzq42.zzZo() + f;
        }
        return com.aspose.words.internal.zzZPY.zzG(fZzZm, height);
    }

    private long zzH(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        float f = -zzzq4.getY();
        float f2 = -zzzq4.getX();
        float height = (zzzq42.getHeight() - zzzq4.getHeight()) + zzzq42.zzZo() + f;
        float fZzZm = zzzq42.zzZm() + f2;
        if (com.aspose.words.internal.zzAN.zzS(zzZuc(), -90.0f)) {
            fZzZm += zzzq42.getWidth() - zzzq4.getWidth();
        }
        return com.aspose.words.internal.zzZPY.zzG(fZzZm, height);
    }

    private long zzI(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        float f = -zzzq4.getY();
        float f2 = -zzzq4.getX();
        float fZzZo = zzzq42.zzZo() + f;
        float fZzZm = zzzq42.zzZm() + f2;
        if (com.aspose.words.internal.zzAN.zzS(zzZuc(), 90.0f)) {
            fZzZm += zzzq42.getWidth() - zzzq4.getWidth();
        }
        if (com.aspose.words.internal.zzAN.zzS(zzZuc(), -90.0f)) {
            fZzZo += zzzq42.getHeight() - zzzq4.getHeight();
        }
        return com.aspose.words.internal.zzZPY.zzG(fZzZm, fZzZo);
    }

    private long zzJ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        boolean z = zzZuc() < 0.0f;
        int iZzMg = zzZHh().zzMg();
        if (iZzMg == 1) {
            return zzF(zzzq4, zzzq42) ? zzZud() ? zzH(zzzq4, zzzq42) : zzI(zzzq4, zzzq42) : zzG(zzzq4, zzzq42);
        }
        if (iZzMg != 2) {
            long jZzH = zzZud() ? zzH(zzzq4, zzzq42) : zzI(zzzq4, zzzq42);
            if (z) {
                return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzH), com.aspose.words.internal.zzZPY.zzYC(zzH(zzzq4, zzzq42)));
            }
            return jZzH;
        }
        long jZzH2 = zzF(zzzq4, zzzq42) ? zzZud() ? zzH(zzzq4, zzzq42) : zzI(zzzq4, zzzq42) : zzZud() ? zzI(zzzq4, zzzq42) : zzH(zzzq4, zzzq42);
        if (z) {
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzH2), com.aspose.words.internal.zzZPY.zzYC(zzI(zzzq4, zzzq42)));
        }
        return jZzH2;
    }

    public static long zzL(ShapeBase shapeBase) {
        zz2O zz2o = (zz2O) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zz2O.class);
        if (zz2o == null) {
            return 0L;
        }
        zz1P zz1p = new zz1P(zz2o);
        return zz1p.zzZr(zz1p.zzZuu());
    }

    private int zzT(zz50 zz50Var) throws Exception {
        float fMax = 0.0f;
        for (Run run : this.zzZ3O.zzZyb().getChildNodes(21, true)) {
            fMax = Math.max(fMax, zz50Var.zzZIB().getDocument().zzZqy().zzY(run.getFont().getName(), (float) run.getFont().getSize(), run.getFont().zzza()).getDescentPoints());
        }
        return com.aspose.words.internal.zzSA.zzp(fMax);
    }

    private float zzU(zz50 zz50Var) throws Exception {
        if (this.zzZ3O.zzZTl().zzZtI().zzZwk() == 2) {
            return 0.0f;
        }
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(200);
        return zzT(zz50Var) * ((this.zzZ3O.getHeight() - fZzYB) / fZzYB);
    }

    private void zzV(zz07 zz07Var) {
        float height;
        float width;
        double width2;
        double dZzZJ = com.aspose.words.internal.zzAN.zzZJ(this.zzYYu.zzZCC().zzZQQ());
        if (com.aspose.words.internal.zzAN.zzL(dZzZJ, 270.0d)) {
            height = (float) (this.zzYYu.getHeight() / 2.0d);
            width = (float) (this.zzYYu.getWidth() / 2.0d);
        } else {
            if (com.aspose.words.internal.zzAN.zzL(dZzZJ, 90.0d)) {
                height = (float) (zz07Var.getHeight() / 2.0d);
                width2 = (this.zzYYu.getWidth() - this.zzYYu.getHeight()) + zz07Var.getHeight();
            } else if (com.aspose.words.internal.zzAN.zzL(dZzZJ, 45.0d)) {
                height = (float) (-zz07Var.getHeight());
                width2 = (this.zzYYu.getWidth() - this.zzYYu.getHeight()) - zz07Var.getHeight();
            } else {
                height = 0.0f;
                width = 0.0f;
            }
            width = ((float) width2) / 2.0f;
        }
        zz07Var.zzY4(com.aspose.words.internal.zzZPY.zzG(width, height));
    }

    private com.aspose.words.internal.zzG zzX(com.aspose.words.internal.zzG zzg, long j) {
        if (com.aspose.words.internal.zzZPW.zzYF(this.zzZ3O.zzZyb().zzY95()) || this.zzZ3O.zzZyb().zzY9E() == 0.0d) {
            return zzg;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzW(zzg.zzZO());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        float fZzp = com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) this.zzZ3O.zzZyb().zzY95()) / 2.0f);
        float fZzp2 = com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(this.zzZ3O.zzZyb().zzY95()) / 2.0f);
        zzp9.zzY(fZzp > 0.0f ? fZzp - Float.intBitsToFloat((int) j) : 0.0f, fZzp2 > 0.0f ? fZzp2 - com.aspose.words.internal.zzZPY.zzYC(j) : 0.0f, 0);
        zzg.zzW(zzp9);
        zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
        return zzg2;
    }

    private zz10 zzZHh() {
        if (this.zzZ9q == null) {
            this.zzZ9q = this.zzZ3O.zzZTl();
        }
        return this.zzZ9q;
    }

    private long zzZr(com.aspose.words.internal.zzZQ4 zzzq4) {
        return com.aspose.words.internal.zzZPW.zzG((float) (((double) (zzZue() ? zzzq4.getHeight() : zzzq4.getWidth())) / 12700.0d), (float) (((double) (zzZue() ? zzzq4.getWidth() : zzzq4.getHeight())) / 12700.0d));
    }

    private static com.aspose.words.internal.zzG zzZs(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzZ(com.aspose.words.internal.zzP8.zzM(zzzq4));
        return zzg;
    }

    private float zzZuc() {
        switch (zzZHh().zzZtu()) {
            case 1:
            case 4:
                return 90.0f;
            case 2:
                return -90.0f;
            case 3:
            case 6:
                return 90.0f;
            case 5:
                return -90.0f;
            default:
                return 0.0f;
        }
    }

    private boolean zzZud() {
        return zzZHh().zzZtu() == 3 || zzZHh().zzZtu() == 6;
    }

    private boolean zzZue() {
        switch (zzZHh().zzZtu()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private boolean zzZuf() {
        return zzZHh().zzZtv() && zzYBX.zzY7((float) this.zzZ3O.zzZyb().zzY9E());
    }

    private boolean zzZug() {
        return this.zzZ3O.getFlipOrientation() == 2 || this.zzZ3O.getFlipOrientation() == 3;
    }

    private boolean zzZuh() {
        return this.zzZ3O.getFlipOrientation() == 1 || this.zzZ3O.getFlipOrientation() == 3;
    }

    private void zzZui() {
        this.zzYYx = 0.0f;
        this.zzYYw = 0.0f;
        this.zzYYv = 0.0f;
        if (this.zzZ3O.zzZyb().zzY9o()) {
            boolean z = false;
            boolean z2 = false;
            for (Paragraph paragraph : this.zzZ3O.zzZyb().getChildNodes(8, false)) {
                if (paragraph.zzZYj().zz5y().isVisible()) {
                    this.zzYYx = Math.max(this.zzYYx, com.aspose.words.internal.zzSA.zzp(r5.getDistanceFromText() + ((double) (r5.zz8S() / 2.0f))));
                    z = true;
                }
                if (paragraph.zzZYj().zz5x().isVisible()) {
                    this.zzYYw = Math.max(this.zzYYw, com.aspose.words.internal.zzSA.zzp(r5.getDistanceFromText() + ((double) (r5.zz8S() / 2.0f))));
                    z2 = true;
                }
                this.zzYYv = Math.min(this.zzYYv, com.aspose.words.internal.zzSA.zzYC(paragraph.zzZYj().zzYM7()));
            }
            if (zzZuc() < 0.0f) {
                float f = this.zzYYx;
                this.zzYYx = this.zzYYw;
                this.zzYYw = f;
            }
            if (z) {
                this.zzYYx += 25400.0f;
            }
            if (z2) {
                this.zzYYw += 25400.0f;
            }
        }
    }

    private float zzZuj() {
        if (Float.isNaN(this.zzYYv)) {
            zzZui();
        }
        return this.zzYYv;
    }

    private float zzZuk() {
        if (Float.isNaN(this.zzYYw)) {
            zzZui();
        }
        return this.zzYYw;
    }

    private float zzZul() {
        if (Float.isNaN(this.zzYYx)) {
            zzZui();
        }
        return this.zzYYx;
    }

    private void zzZum() {
        if (zzZuf()) {
            this.zzYYB = zzZHh().zzZtF();
            this.zzYYA = zzZHh().zzZtE();
            this.zzYYz = zzZHh().zzZtG();
            this.zzYYy = zzZHh().zzZtD();
            return;
        }
        this.zzYYB = zzZHh().zzZtD();
        this.zzYYA = zzZHh().zzZtF();
        this.zzYYz = zzZHh().zzZtE();
        this.zzYYy = zzZHh().zzZtG();
    }

    private float zzZun() {
        if (Float.isNaN(this.zzYYy)) {
            zzZum();
        }
        return this.zzYYy;
    }

    private float zzZuo() {
        if (Float.isNaN(this.zzYYz)) {
            zzZum();
        }
        return this.zzYYz;
    }

    private float zzZup() {
        if (Float.isNaN(this.zzYYA)) {
            zzZum();
        }
        return this.zzYYA;
    }

    private float zzZuq() {
        if (Float.isNaN(this.zzYYB)) {
            zzZum();
        }
        return this.zzYYB;
    }

    private float zzZur() {
        return ((int) (((float) this.zzZ3O.getOutline().zzZxH()) / 1270.0f)) * 1270;
    }

    private com.aspose.words.internal.zzZQ4 zzZus() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzO;
        float fZzZur = zzZur();
        long jZzJ = zz1O.zzJ(this.zzZ3O.zzZyb());
        long jZzG = com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat((int) jZzJ) * this.zzZ3O.getWidth(), com.aspose.words.internal.zzZPW.zzYz(jZzJ) * this.zzZ3O.getHeight());
        zz7H zz7hZzZAQ = this.zzZ3O.zzZTf().zzZAQ();
        if (com.aspose.words.internal.zzAN.zzf(fZzZur)) {
            int i = (int) jZzG;
            zz7hZzZAQ.zzZAP().zzp(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPW.zzYz(jZzG));
            zzzq4ZzO = zz7hZzZAQ.zzZAL().isEmpty() ? new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, Float.intBitsToFloat(i), com.aspose.words.internal.zzZPW.zzYz(jZzG)) : zz7hZzZAQ.zzZAL();
        } else {
            int i2 = (int) jZzG;
            zz7hZzZAQ.zzZAP().zzp(Float.intBitsToFloat(i2) - fZzZur, com.aspose.words.internal.zzZPW.zzYz(jZzG) - fZzZur);
            com.aspose.words.internal.zzZQ4 zzzq4ZzZAL = zz7hZzZAQ.zzZAL();
            if (zzzq4ZzZAL.isEmpty()) {
                float f = fZzZur / 2.0f;
                zzzq4ZzO = new com.aspose.words.internal.zzZQ4(f, f, Float.intBitsToFloat(i2) - f, com.aspose.words.internal.zzZPW.zzYz(jZzG) - f);
            } else {
                com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
                zzp9.zzY((this.zzZ3O.zzZTf().zzZAL().getWidth() - zzzq4ZzZAL.getWidth()) / 2.0f, (this.zzZ3O.zzZTf().zzZAL().getHeight() - zzzq4ZzZAL.getHeight()) / 2.0f, 0);
                zzzq4ZzO = zzp9.zzO(zzzq4ZzZAL);
            }
        }
        if (zzZuf()) {
            zzzq4ZzO = com.aspose.words.internal.zzJ6.zzY(zzzq4ZzO, 90.0f);
        }
        if (!zzZuh() && !zzZug()) {
            return zzzq4ZzO;
        }
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG) / 2.0f, com.aspose.words.internal.zzZPW.zzYz(jZzG) / 2.0f);
        com.aspose.words.internal.zzP9 zzp92 = new com.aspose.words.internal.zzP9();
        int i3 = (int) jZzG2;
        zzp92.zzY(-Float.intBitsToFloat(i3), -com.aspose.words.internal.zzZPY.zzYC(jZzG2), 1);
        zzp92.zzZ(zzZuh() ? -1.0f : 1.0f, zzZug() ? -1.0f : 1.0f, 1);
        zzp92.zzY(Float.intBitsToFloat(i3), com.aspose.words.internal.zzZPY.zzYC(jZzG2), 1);
        return zzp92.zzO(zzzq4ZzO);
    }

    private com.aspose.words.internal.zzZQ4 zzZut() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZus = zzZus();
        float fZzZur = zzZur();
        boolean zZzZYM = this.zzZ3O.zzZyb().getDocument().zzZpV().zzYVg.zzZYM();
        if (fZzZur < 12700.0d && !zZzZYM) {
            zzzq4ZzZus = zzV(zzzq4ZzZus, (-fZzZur) / 2.0f);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZue() ? zzZ(zzzq4ZzZus, zzZuq(), -zzZul(), zzZuo(), -zzZuk()) : zzZ(zzzq4ZzZus, -zzZul(), zzZup(), -zzZuk(), zzZun());
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(2);
        if ((zzzq4ZzZ.getWidth() + zzzq4ZzZ.getX()) - zzZuq() < zzZuo() + fZzYB) {
            zzzq4ZzZ = new com.aspose.words.internal.zzZQ4(zzZuq() - (fZzYB / 2.0f), zzzq4ZzZ.getY(), fZzYB + zzZuo(), zzzq4ZzZ.getHeight());
        }
        if (zzZuj() < 0.0f) {
            if (zzZue()) {
                float fMin = Math.min(Math.abs(zzZuj()), zzZuq());
                return new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY() - fMin, zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight() + fMin);
            }
            if (zzzq4ZzZ.getX() + zzZuj() >= 0.0f) {
                return new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX() + zzZuj(), zzzq4ZzZ.getY(), zzzq4ZzZ.getWidth() - zzZuj(), zzzq4ZzZ.getHeight());
            }
        }
        return zzzq4ZzZ;
    }

    private com.aspose.words.internal.zzZQ4 zzZuu() {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzZus(), zzZuq(), zzZup(), zzZuo(), zzZun());
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(1);
        return zzzq4ZzZ.getWidth() < fZzYB ? new com.aspose.words.internal.zzZQ4(zzzq4ZzZ.getX(), zzzq4ZzZ.getY(), fZzYB, zzzq4ZzZ.getHeight()) : zzzq4ZzZ;
    }

    private com.aspose.words.internal.zzG zzf(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG[] zzgArrZzZ = zzB0.zzZ(zzg, 64);
        com.aspose.words.internal.zzG zzg2 = zzgArrZzZ[0];
        com.aspose.words.internal.zzG zzg3 = zzgArrZzZ[1];
        com.aspose.words.internal.zzG[] zzgArrZzZ2 = zzB0.zzZ(zzg2, 262144);
        com.aspose.words.internal.zzG zzg4 = zzgArrZzZ2[1];
        com.aspose.words.internal.zzG zzgZzU = zzU(zzgArrZzZ2[0], zzZut());
        com.aspose.words.internal.zzZQ4 zzzq4ZzZus = zzZus();
        if (zzg3 != null) {
            zzgZzU.zzX((com.aspose.words.internal.zzZL) zzU(zzg3, Math.abs(this.zzZ3O.zzZTh().zzZCC().zzZQQ()) > 0.0d ? zzzq4ZzZus : zzZuu()));
        }
        if (zzg4 != null) {
            zzgZzU.zzX((com.aspose.words.internal.zzZL) zzU(zzg4, zzzq4ZzZus));
        }
        return zzgZzU;
    }

    private com.aspose.words.internal.zzG zzg(com.aspose.words.internal.zzG zzg) {
        if (!zzZuf() || !this.zzZ3O.zzZvu() || !this.zzZ3O.zzZyb().zzY9o()) {
            return zzg;
        }
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzW(zzg.zzZO());
        com.aspose.words.internal.zzZQ4 zzzq4ZzY = com.aspose.words.internal.zzJ6.zzY(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, (float) this.zzYYu.getWidth(), (float) this.zzYYu.getHeight()), (float) this.zzYYu.zzZCC().zzZQQ());
        zz07 zz07VarZzZTh = this.zzZ3O.zzZTh();
        com.aspose.words.internal.zzZQ4 zzzq4ZzY2 = com.aspose.words.internal.zzJ6.zzY(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, (float) zz07VarZzZTh.getWidth(), (float) zz07VarZzZTh.getHeight()), (float) zz07VarZzZTh.zzZCC().zzZQQ());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(zzzq4ZzY.getX() - zzzq4ZzY2.getX(), zzzq4ZzY.getY() - zzzq4ZzY2.getY(), 0);
        zzg.zzW(zzp9);
        zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
        return zzg2;
    }

    @Override // com.aspose.words.zzZC7
    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        zz50Var.zzZy8().zzO(this.zzZ3O.zzZTh());
        try {
            zz2G zz2gZzS = zzS(zz50Var);
            com.aspose.words.internal.zzG zzgZzZ = zzZ(this.zzZ3O.zzZTf(), zz2gZzS);
            zzZ91 zzz91ZzZxN = zz50Var.zzZIB().zzZw8().zzZxN();
            if (this.zzZ3O.zzZyb().zzY9o() && zzz91ZzZxN != null) {
                zzgZzZ = zzZ(zz50Var, this.zzZ3O.zzZTj() == null ? this.zzZ3O.getFill().zzX(zz2gZzS.zzZvb()) : null, zzgZzZ);
            } else if (this.zzZ3O.zzZAk() != null && !com.aspose.words.internal.zzAN.zzVb(this.zzZ3O.getWidth())) {
                zzgZzZ = zz0H.zzZ(zz50Var, this.zzZ3O, zzgZzZ, this.zzYYt);
            }
            zzZ(zz50Var.zzZy8(), zzgZzZ);
            zz07 zz07Var = this.zzYYu;
            com.aspose.words.internal.zzG zzg = zzg(zzX(zzgZzZ, zz07Var != null ? zz07Var.zzZPI() : this.zzZ3O.zzZTh().zzZPI()));
            com.aspose.words.internal.zz7 zz7VarZzZ = zz2B.zzZ(this.zzZ3O.zzZTe(), zzg, zz50Var.zzZIB(), zzZ(this.zzZ3O, zzg, zz2gZzS), this.zzZ3O.getFill().zzZQ4(), this.zzZ3O.zzZFk(), this.zzZ3O.zzZyb().zzZC2());
            com.aspose.words.internal.zzZA.zzP(zz7VarZzZ);
            zz50Var.zzZy8().zzZsa();
            zz07 zz07Var2 = this.zzYYu;
            if (zz07Var2 != null) {
                this.zzZ3O.zzZ(zz07Var2);
            }
            return zz7VarZzZ;
        } catch (Throwable th) {
            zz50Var.zzZy8().zzZsa();
            zz07 zz07Var3 = this.zzYYu;
            if (zz07Var3 != null) {
                this.zzZ3O.zzZ(zz07Var3);
            }
            throw th;
        }
    }

    public zz1P(zz2O zz2o, boolean z) {
        super(zz2o);
        this.zzYYB = Float.NaN;
        this.zzYYA = Float.NaN;
        this.zzYYz = Float.NaN;
        this.zzYYy = Float.NaN;
        this.zzYYx = Float.NaN;
        this.zzYYw = Float.NaN;
        this.zzYYv = Float.NaN;
        this.zzZ3O = zz2o;
        this.zzYYt = z;
        this.zzZjc = zz2o.zzZTd();
        this.zzZjb = this.zzZ3O.zzZTc();
    }

    private static com.aspose.words.internal.zzG zzU(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzgZzZs = zzZs(zzzq4);
        zzgZzZs.zzX((com.aspose.words.internal.zzZL) zzg);
        return zzgZzZs;
    }

    private static com.aspose.words.internal.zzZQ4 zzV(com.aspose.words.internal.zzZQ4 zzzq4, float f) {
        return zzZ(zzzq4, f, f, f, f);
    }

    private com.aspose.words.internal.zzG zzZ(zz50 zz50Var, Shading shading, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzgZzZ;
        com.aspose.words.internal.zzP5[] zzp5ArrZzZ;
        long jZzZr;
        com.aspose.words.internal.zzG zzgZzZ2;
        com.aspose.words.internal.zzG zzg2;
        if (!this.zzZ3O.zzZTf().zzZAL().isEmpty()) {
            zzZ91 zzz91ZzZxN = zz50Var.zzZIB().zzZw8().zzZxN();
            com.aspose.words.internal.zzZQ4 zzzq4ZzZuu = zzZuu();
            long jZzZr2 = zzZr(zzzq4ZzZuu);
            com.aspose.words.internal.zzP5[] zzp5ArrZzZ2 = zzZ(zz50Var, zzzq4ZzZuu);
            boolean z = zzp5ArrZzZ2.length > 0;
            boolean z2 = zzp5ArrZzZ2.length % 2 != 0;
            zzz91ZzZxN.zzV9(this.zzZ3O.zzZvv() || z2);
            zzz91ZzZxN.setWidth(Float.intBitsToFloat((int) jZzZr2));
            zzz91ZzZxN.zzk(com.aspose.words.internal.zzZPW.zzYz(jZzZr2));
            Object objZzZ = zzz91ZzZxN.zzZ((Shape) this.zzZ3O.zzZyb());
            if (objZzZ != null || (this.zzZ3O.zzZyb().getChildNodes(0, false) != null && this.zzZ3O.zzZyb().getChildNodes(0, false).getCount() != 0)) {
                float fZzp = com.aspose.words.internal.zzSA.zzp(zzz91ZzZxN.getWidth());
                float fZzp2 = com.aspose.words.internal.zzSA.zzp(zzz91ZzZxN.getHeight());
                long jZzG = com.aspose.words.internal.zzZPW.zzG(fZzp, fZzp2);
                com.aspose.words.internal.zzZQ4 zzzq4ZzZB0 = com.aspose.words.internal.zzZQ4.zz2T;
                if (this.zzZ3O.zzZvv() || this.zzZ3O.zzZvu()) {
                    if (zzZue()) {
                        jZzG = com.aspose.words.internal.zzZPW.zzG(fZzp2, fZzp);
                    }
                    zzgZzZ = zzZ(zz50Var, jZzG);
                    com.aspose.words.internal.zzZQ4 zzzq4ZzZuu2 = zzZuu();
                    zzp5ArrZzZ = zzZ(zz50Var, zzzq4ZzZuu2);
                    jZzZr = zzZr(zzzq4ZzZuu2);
                } else {
                    jZzZr = jZzZr2;
                    zzp5ArrZzZ = zzp5ArrZzZ2;
                    zzgZzZ = zzg;
                }
                long j = jZzG;
                if (z2) {
                    zz7Q zz7q = new zz7Q(this.zzZ3O, zz50Var, zzp5ArrZzZ, shading);
                    zzgZzZ2 = zz7q.zzZB1();
                    zzzq4ZzZB0 = zz7q.zzZB0();
                } else {
                    zzgZzZ2 = zzZ(zz50Var, fZzp, fZzp2, (com.aspose.words.internal.zzG) zzz91ZzZxN.zzZ(objZzZ, com.aspose.words.internal.zzZPW.zzG(zzz91ZzZxN.getWidth(), zzz91ZzZxN.getHeight()), com.aspose.words.internal.zzZPW.zzYz(jZzZr), shading, zzZHh().zzZtu() == 6 || zzZHh().zzZtu() == 3).zz1());
                }
                com.aspose.words.internal.zzZQ4 zzzq4 = zzzq4ZzZB0;
                if (z) {
                    zzgZzZ2 = zz0Q.zzZ(zzZZU.zzZ(zzgZzZ2, zzp5ArrZzZ, zzzq4, zz50Var.zzZIB().getDocument().zzZqy(), zz50Var.zzZIB().zzI()), zz50Var, this.zzZ3O);
                }
                com.aspose.words.internal.zzG zzg3 = zzgZzZ2;
                if (zzZHh().zzZTd() == null || zzZHh().zzZtv() || !zz7Y.zzZ(zzZHh().zzZTd(), zzZHh().zzZTc())) {
                    zzg2 = zzgZzZ;
                } else {
                    zzg2 = zzgZzZ;
                    zzg3 = (com.aspose.words.internal.zzG) zz2B.zzZ(null, zzg3, zz50Var.zzZIB(), zzZ(this.zzZ3O, j, zzZHh().zzZTd(), zzZHh().zzZTc(), (zz2G) null), this.zzZ3O.getFill().zzZQ4(), this.zzZ3O.zzZFk(), this.zzZ3O.zzZyb().zzZC2());
                }
                if (z2) {
                    zzZ(zz50Var.zzZy8(), zzg3, true);
                }
                com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(32768);
                zzzs.zzX(zzg3);
                zzg2.zzX(zzzs);
                return zzg2;
            }
        }
        return zzg;
    }

    private com.aspose.words.internal.zzP5[] zzZ(zz50 zz50Var, com.aspose.words.internal.zzZQ4 zzzq4) throws Exception {
        ArrayList arrayList = new ArrayList();
        zz2G zz2gZzZ = zzZ(zzzq4.getSize(), zz50Var, this.zzZ3O.zzZTl().zzZtI().zzZAP());
        this.zzZ3O.zzZTl().zzZtI().zzZAP().zzp(zz2gZzZ.zzZve(), zz2gZzZ.zzZvd());
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzY(zzzq4.zzZm(), zzzq4.zzZo() - zzU(zz50Var), 0);
        Iterator<zz45> it = this.zzZ3O.zzZTl().zzZtI().zzZAN().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zz6G.zzZ(zz42.zzZ(it.next(), zz2gZzZ), true);
            zzzgZzZ.zzY(zzp9);
            if (zzzgZzZ.zzZ0().getCount() == 1) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzP5>) arrayList, zzzgZzZ.zzZ0().zzO7().get(0));
            }
        }
        return (com.aspose.words.internal.zzP5[]) arrayList.toArray(new com.aspose.words.internal.zzP5[0]);
    }

    private com.aspose.words.internal.zzG zzZ(zz50 zz50Var, float f, float f2, com.aspose.words.internal.zzG zzg) throws Exception {
        new com.aspose.words.internal.zzZE().zzZ(zzg, 1, 12700);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(zzZuc(), com.aspose.words.internal.zzZPY.zzG(f / 2.0f, f2 / 2.0f), 0);
        long jZzJ = zzJ(zzp9.zzO(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, f, f2)), zzZuu());
        zzp9.zzY(Float.intBitsToFloat((int) jZzJ), com.aspose.words.internal.zzZPY.zzYC(jZzJ), 1);
        if (zzg.zzZO() == null) {
            zzg.zzW(zzp9);
        } else {
            zzg.zzZO().zzZ(zzp9, 1);
        }
        zzg.zzZ((com.aspose.words.internal.zzP8) null);
        com.aspose.words.internal.zzG zzgZzf = zzf(zzg);
        zzZ(zz50Var.zzZy8(), zzgZzf, !zzZHh().zzZtv());
        return zzgZzf;
    }

    private com.aspose.words.internal.zzG zzZ(zz50 zz50Var, long j) throws Exception {
        boolean zZzZvv;
        boolean zZzZvu;
        double width;
        this.zzYYu = this.zzZ3O.zzZTh().zzZAi();
        com.aspose.words.internal.zzZQ4 zzzq4ZzZuu = zzZuu();
        long jZzJ = zz1O.zzJ(this.zzZ3O.zzZyb());
        zz07 zz07VarZzZTh = this.zzZ3O.zzZTh();
        int i = (int) jZzJ;
        double width2 = (float) ((zz07VarZzZTh.getWidth() * ((double) Float.intBitsToFloat(i))) - ((double) zzzq4ZzZuu.getWidth()));
        double height = (float) ((zz07VarZzZTh.getHeight() * ((double) com.aspose.words.internal.zzZPW.zzYz(jZzJ))) - ((double) zzzq4ZzZuu.getHeight()));
        if (zzZue()) {
            zZzZvv = this.zzZ3O.zzZvu();
            zZzZvu = this.zzZ3O.zzZvv();
        } else {
            zZzZvv = this.zzZ3O.zzZvv();
            zZzZvu = this.zzZ3O.zzZvu();
        }
        if (zZzZvv) {
            width = (((double) Float.intBitsToFloat((int) j)) + width2) / ((double) Float.intBitsToFloat(i));
        } else {
            width = zz07VarZzZTh.getWidth();
        }
        double dZzYz = zZzZvu ? (((double) com.aspose.words.internal.zzZPW.zzYz(j)) + height) / ((double) com.aspose.words.internal.zzZPW.zzYz(jZzJ)) : zz07VarZzZTh.getHeight();
        if (zzZuf() && !zzZue()) {
            zz07VarZzZTh.setWidth(dZzYz);
            zz07VarZzZTh.setHeight(width);
        } else {
            zz07VarZzZTh.setWidth(width);
            zz07VarZzZTh.setHeight(dZzYz);
        }
        if (!zzZHh().zzZtv()) {
            zzV(zz07VarZzZTh);
        }
        zz50Var.zzZy8().zzZsa();
        zz50Var.zzZy8().zzO(this.zzZ3O.zzZTh());
        com.aspose.words.internal.zzG zzgZzZ = zzZ(this.zzZ3O.zzZTf(), zzS(zz50Var));
        zzZ(zz50Var, zzgZzZ);
        return zzgZzZ;
    }

    private void zzZ(zz50 zz50Var, com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzG zzg2 = (com.aspose.words.internal.zzG) zzg.zz1();
        if (!this.zzZ3O.zzZyo()) {
            zzZ(zz50Var.zzZy8(), zzg2);
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg(zzg2));
        if (this.zzZ3O.getOutline().getFill().zzZQ4() != 3) {
            float f = (-((float) this.zzZ3O.getOutline().zzZxH())) / 2.0f;
            zzzq4ZzZ.zzH(f, f);
        }
        this.zzZ3O.zzZAk().zzI(new com.aspose.words.internal.zzZQ4((float) (((double) zzzq4ZzZ.getX()) / 12700.0d), (float) (((double) zzzq4ZzZ.getY()) / 12700.0d), (float) (((double) zzzq4ZzZ.getWidth()) / 12700.0d), (float) (((double) zzzq4ZzZ.getHeight()) / 12700.0d)));
        if (zzZuf()) {
            this.zzZ3O.zzZAk().zzI(com.aspose.words.internal.zzJ6.zzY(this.zzZ3O.zzZAk().zzZj(), 90.0f));
        }
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, float f, float f2, float f3, float f4) {
        return com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzZm() + f, zzzq4.zzZo() + f2, zzzq4.zzkw() - f3, zzzq4.zzZn() - f4);
    }
}
