package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2P {
    private int zzWX1;
    private int zzWX2;
    private int zzWX5;
    private int zzWX6;
    private ShapeBase zzWXd;
    private boolean zzYMK;
    private boolean zzWX3 = false;
    private boolean zzWX4 = false;
    com.aspose.words.internal.zzZYV<zz7B> zzWX7 = new com.aspose.words.internal.zzZYV<>();

    private zzY2P(ShapeBase shapeBase, int i) {
        this.zzWXd = shapeBase;
        this.zzWX5 = i;
        this.zzWX6 = ((Shape) shapeBase).zzY9J().zzZBo();
        this.zzWX2 = ((Integer) this.zzWXd.fetchShapeAttr(386)).intValue();
        this.zzWX1 = ((Integer) this.zzWXd.fetchShapeAttr(388)).intValue();
    }

    private ArrayList<zz7B> zzM(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        zzZLE[] zzzleArr = (zzZLE[]) this.zzWXd.fetchShapeAttr(407);
        boolean z = this.zzWX3;
        com.aspose.words.internal.zzPV zzpv3 = z ? zzpv2 : zzpv;
        if (!z) {
            zzpv = zzpv2;
        }
        com.aspose.words.internal.zzPV zzpv4 = this.zzWX6 < 100 ? zzpv3 : zzpv;
        this.zzWX7.set(0, new zz7B(0.0d, zzBW.zzj(zzpv3)));
        com.aspose.words.internal.zzZYV<zz7B> zzzyv = this.zzWX7;
        zz7B zz7b = new zz7B(1.0d, zzBW.zzj(zzpv4));
        int iZzZG = 65536;
        zzzyv.set(65536, zz7b);
        int i = this.zzWX6;
        if (i < 100) {
            double d = ((double) i) / 100.0d;
            iZzZG = com.aspose.words.internal.zzAN.zzZG(65536.0d * d);
            this.zzWX7.set(iZzZG, new zz7B(d, zzBW.zzj(zzpv)));
        }
        if (zzzleArr != null) {
            zzX(zzzleArr);
        }
        return zzip(iZzZG);
    }

    private void zzX(zzZLE[] zzzleArr) {
        double d = ((double) this.zzWX6) / 100.0d;
        int iZzZa = (int) com.aspose.words.internal.zzZKQ.zzZa(d * 65536.0d);
        for (zzZLE zzzle : zzzleArr) {
            zzBW zzbwZzj = zzBW.zzj(zzzle.zzYuy);
            if (this.zzWX6 < 100) {
                int iZzZa2 = (int) com.aspose.words.internal.zzZKQ.zzZa(((double) zzzle.zzZfb) * d);
                if (this.zzWX3) {
                    iZzZa2 = iZzZa - iZzZa2;
                }
                int iZzZa3 = ((int) com.aspose.words.internal.zzZKQ.zzZa(((1.0d - d) * ((double) (iZzZa - iZzZa2))) / d)) + iZzZa;
                int i = iZzZa3 <= 65536 ? iZzZa3 : 65536;
                zz7B zz7b = new zz7B(((double) i) / 65536.0d, zzbwZzj);
                this.zzWX7.set(iZzZa2, new zz7B(((double) iZzZa2) / 65536.0d, zzbwZzj.zzZHt()));
                this.zzWX7.set(i, zz7b);
            } else {
                int i2 = this.zzWX3 ? 65536 - zzzle.zzZfb : zzzle.zzZfb;
                this.zzWX7.set(i2, new zz7B(((double) i2) / 65536.0d, zzbwZzj));
            }
        }
        if (!this.zzYMK || this.zzWX6 >= 100 || this.zzWX7.getCount() <= 10) {
            return;
        }
        int count = this.zzWX7.getCount();
        while (true) {
            count--;
            if (count <= 9) {
                return;
            } else {
                this.zzWX7.removeAt(count);
            }
        }
    }

    private int zzXTe() {
        return this.zzWX4 ? this.zzWX2 : this.zzWX1;
    }

    private int zzXTf() {
        return this.zzWX4 ? this.zzWX1 : this.zzWX2;
    }

    private void zzXTg() {
        int i;
        Object obj = this.zzWXd.zzYvW().get(412);
        this.zzWX4 = (obj == null || ((Integer) obj).intValue() != 0) ? this.zzWX3 : !this.zzWX3;
        if (zzY5(this.zzWXd) || (i = this.zzWX5) == 5 || i == 7) {
            return;
        }
        this.zzWX4 = !this.zzWX4;
    }

    private void zzXTh() {
        int i;
        this.zzWX3 = false;
        zzZAW zzzawZzY9J = ((Shape) this.zzWXd).zzY9J();
        int i2 = this.zzWX6;
        if (i2 < -100 || i2 > 100) {
            this.zzWX6 = 100;
        }
        while (true) {
            i = this.zzWX6;
            if (i > 0) {
                break;
            }
            this.zzWX6 = i + 100;
            this.zzWX3 = !this.zzWX3;
        }
        if (i >= 100 || zzzawZzY9J.zzZBu() >= 0.0d || com.aspose.words.internal.zzAN.zzZD(zzzawZzY9J.zzZBu())) {
            return;
        }
        this.zzWX3 = !this.zzWX3;
    }

    private zz7C zzXTi() {
        double dAbs;
        double d;
        zz7C zz7c = new zz7C();
        zzZAW zzzawZzY9J = ((Shape) this.zzWXd).zzY9J();
        int i = this.zzWX5;
        boolean z = i == 5 || i == 6;
        boolean zBooleanValue = ((Boolean) this.zzWXd.fetchShapeAttr(442)).booleanValue();
        zz7c.zzY6(!this.zzYMK && zBooleanValue);
        if (this.zzWX5 == 7 || (!z && this.zzYMK)) {
            zz5S zz5s = new zz5S();
            zz5s.zzX0(this.zzWX5 == 7);
            zz7c.zzZ(zz5s);
        } else {
            zz44 zz44Var = new zz44();
            Object obj = this.zzWXd.zzYvW().get(412);
            zz44Var.zzHg(((this.zzWX5 == 5) || (obj != null && !zzY5(this.zzWXd) && ((Integer) obj).intValue() == 1073741835) || this.zzYMK) ? 2 : 0);
            zz44Var.zzW(new zz3Z(zzzawZzY9J.zzZBq(), zzzawZzY9J.zzZBp(), 1.0d - zzzawZzY9J.zzZBq(), 1.0d - zzzawZzY9J.zzZBp()));
            zz7c.zzZ(zz44Var);
        }
        com.aspose.words.internal.zzPV zzpvZz8Q = zzzawZzY9J.zz8Q();
        com.aspose.words.internal.zzPV zzpvZzZ = zzZ7K.zzZ(zzzawZzY9J.zzZBx(), (Shape) this.zzWXd);
        zzXTh();
        zzXTg();
        zz7c.zz2(zzM(zzpvZz8Q, zzpvZzZ));
        double dZzZBu = zzzawZzY9J.zzZBu();
        if (Math.abs(dZzZBu) > 360.0d) {
            dZzZBu %= 360.0d;
        }
        double rotation = !zBooleanValue ? this.zzWXd.getRotation() : 0.0d;
        if (dZzZBu > 0.0d || com.aspose.words.internal.zzAN.zzZD(dZzZBu)) {
            double d2 = (90.0d - dZzZBu) - rotation;
            if (d2 >= 0.0d || com.aspose.words.internal.zzAN.zzZD(d2)) {
                dAbs = d2;
            } else {
                d = 360.0d - (dZzZBu - 90.0d);
                dAbs = d - rotation;
            }
        } else {
            double d3 = dZzZBu + 90.0d;
            double d4 = d3 - rotation;
            if (d4 <= 0.0d || com.aspose.words.internal.zzAN.zzZD(d4)) {
                dAbs = (Math.abs(dZzZBu) - 90.0d) - rotation;
            } else {
                d = 360.0d - d3;
                dAbs = d - rotation;
            }
        }
        zz7c.zzXV(com.aspose.words.internal.zzAN.zzZJ(dAbs));
        return zz7c;
    }

    public static zz7C zzY(zzZ8T zzz8t, int i) {
        zzY2P zzy2p = new zzY2P(zzz8t.zzYW8(), i);
        zzy2p.zzYMK = zzz8t.zzYW8().isWordArt();
        return zzy2p.zzXTi();
    }

    private static boolean zzY5(ShapeBase shapeBase) {
        return 32768 == ((Integer) shapeBase.fetchShapeAttr(397)).intValue() && 32768 == ((Integer) shapeBase.fetchShapeAttr(398)).intValue();
    }

    private double zzZ(double d, double d2, com.aspose.words.internal.zzD3<zzHV> zzd3, int i) {
        if (zzXTf() == 65536 && zzXTe() == 65536) {
            return d2;
        }
        double position = d - this.zzWX7.get(0).getPosition();
        zz7B zz7bZzVY = this.zzWX7.zzVY(i);
        double position2 = zz7bZzVY.getPosition();
        double position3 = i < this.zzWX7.getCount() + (-1) ? this.zzWX7.zzVY(i + 1).getPosition() : position2;
        if (position3 > d) {
            position3 = d;
        }
        double dAbs = Math.abs(position3 - position2);
        double dZzXTe = ((double) (zzXTe() - zzXTf())) / 65536.0d;
        double dZzXTf = zzXTf() == zzXTe() ? ((double) zzXTf()) / 65536.0d : d2;
        double dZzXTe2 = d2 + (com.aspose.words.internal.zzAN.zzZD(dAbs) ? 0.0d : (dZzXTe * dAbs) / position);
        if ((dZzXTe2 < 0.0d && !com.aspose.words.internal.zzAN.zzZD(dZzXTe2)) || (dZzXTe2 > 1.0d && !com.aspose.words.internal.zzAN.zzL(dZzXTe2, 1.0d))) {
            dZzXTe2 = ((double) zzXTe()) / 65536.0d;
        }
        if (!com.aspose.words.internal.zzAN.zzL(dZzXTf, 1.0d)) {
            zzHV zzhv = new zzHV();
            zzhv.setValue(dZzXTf);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzHV>) zz7bZzVY.zzZQX().zzZNX(), zzhv);
            zzd3.set(i, zzhv);
        }
        return dZzXTe2;
    }

    private ArrayList<zz7B> zzip(int i) {
        double d;
        double dZzZ;
        zzY2P zzy2p = this;
        ArrayList<zz7B> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzD3<zzHV> zzd3 = new com.aspose.words.internal.zzD3<>();
        double dZzXTf = ((double) zzy2p.zzXTf()) / 65536.0d;
        double d2 = ((double) i) / 65536.0d;
        int i2 = 0;
        int i3 = -1;
        while (i2 < zzy2p.zzWX7.getCount()) {
            zz7B zz7bZzVY = zzy2p.zzWX7.zzVY(i2);
            if (!com.aspose.words.internal.zzAN.zzL(dZzXTf, ((double) zzy2p.zzXTe()) / 65536.0d) || com.aspose.words.internal.zzZKO.equals(zz7bZzVY, zzy2p.zzWX7.get(i)) || zzy2p.zzWX1 == zzy2p.zzWX2) {
                double d3 = d2;
                double d4 = dZzXTf;
                d = d3;
                dZzZ = zzy2p.zzZ(d, d4, zzd3, i2);
                i3 = i2;
            } else {
                i3--;
                zzZ(zz7bZzVY, zzd3, i3);
                double d5 = d2;
                dZzZ = dZzXTf;
                d = d5;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, zz7bZzVY);
            i2++;
            double d6 = dZzZ;
            d2 = d;
            dZzXTf = d6;
            zzy2p = this;
        }
        return arrayList;
    }

    private static void zzZ(zz7B zz7b, com.aspose.words.internal.zzD3<zzHV> zzd3, int i) {
        if (i >= 0 && zzd3.zzVE(i)) {
            com.aspose.words.internal.zzZQG.zzZ(zz7b.zzZQX().zzZNX(), zzd3.get(i).zzZFm());
        }
    }
}
