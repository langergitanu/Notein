package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzO6 {
    private zzL3 zzFF;
    private zzA4 zzFG;
    private boolean zzFH;

    public zzO6(zzA1 zza1, zzG6 zzg6) {
        zzL3 zzl3 = new zzL3(zza1);
        this.zzFF = zzl3;
        this.zzFG = new zzA4(zzl3, zzg6);
    }

    private zzGC zzMK() {
        return this.zzFG.zzAl().zzMK();
    }

    private void zzXF(int i) {
        this.zzFG.zzAk().zzI().zzZ(2, 3, "{0} raster operation is not supported.", zz9D.zzUR(i));
        this.zzFH = true;
    }

    private void zzXG(int i) {
        this.zzFG.zzAk().zzI().zzZ(2, 3, "Record with '{0}' type is not supported.", Integer.valueOf(i));
    }

    private void zzXH(int i) {
        this.zzFG.zzAk().zzI().zzZ(2, 3, "'{0}' record is not supported.", zz9D.zzUT(i));
    }

    public final boolean zzML() {
        return this.zzFH;
    }

    public final void zzMM() {
        this.zzFG.zzAl().zzMM();
    }

    public final zzG zzMN() {
        return this.zzFG.zzMN();
    }

    public final void zzZ(zzLU zzlu) throws Exception {
        switch (zzlu.getType()) {
            case 2:
            case 4:
            case 5:
            case 6:
            case 54:
            case 85:
            case 87:
            case 88:
            case 89:
                zzZ((zzMG) zzlu.zzJm());
                break;
            case 3:
            case 7:
            case 8:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 86:
            case 90:
            case 91:
                zzZ((zzM4) zzlu.zzJm());
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 65:
            case 66:
            case 67:
            case 68:
            case 70:
            case 75:
            case 82:
            case 93:
            case 94:
            case 95:
            case 98:
            case 99:
            case 100:
            case 104:
            case 109:
            case 115:
            case 120:
            case 121:
            case 122:
                break;
            case 14:
            case 16:
            case 23:
            case 69:
            case 101:
            case 102:
            case 103:
            case 105:
            case 106:
            case 107:
            case 110:
            case 111:
            case 112:
            case 113:
            case 117:
            case 119:
            default:
                zzXG(zzlu.getType());
                break;
            case 15:
                zzZ((zzLH) zzlu.zzJm());
                break;
            case 41:
            case 53:
            case 78:
            case 79:
            case 80:
            case 116:
                zzXH(zzlu.getType());
                this.zzFH = true;
                break;
            case 45:
            case 55:
                zzMX zzmx = (zzMX) zzlu.zzJm();
                zzmx.zzX7(zzMK().zzFl());
                zzZ(zzmx);
                break;
            case 56:
            case 92:
                zzZ((zzM0) zzlu.zzJm());
                break;
            case 62:
                this.zzFG.zzAo();
                break;
            case 63:
                this.zzFG.zzAm();
                break;
            case 64:
                this.zzFG.zzAn();
                break;
            case 71:
                zzZ((zzMF) zzlu.zzJm());
                break;
            case 72:
                zzZ((zzME) zzlu.zzJm());
                break;
            case 73:
                zzZ((zzMB) zzlu.zzJm());
                break;
            case 74:
                zzZ((zzM5) zzlu.zzJm());
                break;
            case 76:
            case 77:
            case 81:
                zzZ((zzMW) zzlu.zzJm(), zzlu.zzJp());
                break;
            case 83:
            case 84:
            case 108:
                zzZ((zzL6) zzlu.zzJm());
                break;
            case 96:
            case 97:
                zzZ((zzLX) zzlu.zzJm());
                break;
            case 114:
                zzMY zzmy = (zzMY) zzlu.zzJm();
                this.zzFG.zzZ(zzmy.zzJT(), zzmy.zzJU(), zzmy.zzJS(), zzmy.zzJZ());
                break;
            case 118:
                zzZ((zzMD) zzlu.zzJm());
                break;
        }
        if (this.zzFG.zzML()) {
            this.zzFH = true;
        }
        this.zzFF.zzY(zzlu);
    }

    private void zzZ(zzMW zzmw, int i) throws Exception {
        if (zz8I.zzUJ(zzmw.zzJP())) {
            zz8I.zzZ(zzmw, this.zzFG, zzmw.zzJZ());
        } else if (!this.zzFG.zzAl().zzA0().zzL(zzmw.zzJP(), zzmw.zzJM())) {
            zzXF(zzmw.zzJP());
            zz8I.zzY(zzmw, this.zzFG, zzmw.zzJZ());
        } else {
            this.zzFG.zzZ(new zz84(zzmw), i);
        }
    }

    private void zzZ(zzMF zzmf) throws Exception {
        this.zzFG.zzZ(zzmf.zzJF(), (zzOU) null, zzMK().zzWf(zzmf.zzJG()));
    }

    private void zzZ(zzME zzme) throws Exception {
        this.zzFG.zzZ(zzme.zzJF(), new zzOU(zzMK().zzWf(zzme.zzJG()), zzme.getWidth()), (zzPY) null);
    }

    private void zzZ(zzMB zzmb) throws Exception {
        this.zzFG.zzZ(zzmb.zzJF(), new zzOU(zzPV.zzKa), (zzPY) null);
    }

    private void zzZ(zzM5 zzm5) throws Exception {
        this.zzFG.zzZ(zzm5.zzJF(), (zzOU) null, zzMK().zzZ1());
    }

    private void zzZ(int i, float f, float f2, zzL1 zzl1) throws Exception {
        if (zzMK().zzFm().isOpened() || zzl1.isEmpty()) {
            return;
        }
        zzP8 zzp8ZzZ = zzZ(zzl1.getOptions(), zzl1.zzJH());
        zz8M zz8m = new zz8M(zzMK(), zzl1.zzZ(zzMK().zzFs(), zzMK().zzZr(), zzMK().zzFp(), this.zzFG.zzAk().zzMk(), this.zzFG.zzAk().zzAt().zzFF()), zzMK().zzFr() ? zzMK().zzFn() : zzl1.zzIV(), i, f, f2, zzl1.zzIT() != null, zzp8ZzZ);
        zzA4 zza4 = this.zzFG;
        zzG zzgZzyv = zz8m.zzyv();
        zz8m.zzyA();
        zza4.zzJ(zzgZzyv);
    }

    private zzP8 zzZ(int i, zzZQ4 zzzq4) throws Exception {
        if ((i & 2) != 0) {
            this.zzFG.zzt(zzzq4);
        }
        if ((i & 4) != 0) {
            return zzP8.zzM(zzzq4);
        }
        return null;
    }

    private void zzZ(zzL6 zzl6) throws Exception {
        zzZ(zzl6.zzJu(), zzl6.zzJw(), zzl6.zzJv(), zzl6.zzJ9());
    }

    private void zzZ(zzLX zzlx) throws Exception {
        Iterator<zzL1> it = zzlx.zzJt().iterator();
        while (it.hasNext()) {
            zzZ(zzlx.zzJu(), zzlx.zzJw(), zzlx.zzJv(), it.next());
        }
    }

    private void zzZ(zzLH zzlh) throws Exception {
        this.zzFG.zzZ(zzlh.getPosition(), zzlh.zzZy());
    }

    private void zzZ(zzM0 zzm0) throws Exception {
        if (zzMK().zzFm().isOpened() || zzm0.isEmpty()) {
            return;
        }
        Iterator<zzP5> it = zzm0.zza(zzMK().zzFn()).iterator();
        while (it.hasNext()) {
            this.zzFG.zzQ(it.next());
        }
    }

    private void zzZ(zzMG zzmg) throws Exception {
        if (zzMK().zzFm().isOpened() || zzmg.isEmpty()) {
            return;
        }
        this.zzFG.zzQ(zzmg.zzb(zzMK().zzFn()));
    }

    private void zzZ(zzM4 zzm4) throws Exception {
        if (zzMK().zzFm().isOpened() || zzm4.isEmpty()) {
            return;
        }
        this.zzFG.zzZ(zzm4.zzJL(), true, zzm4.zzJB());
    }

    private void zzZ(zzMD zzmd) throws Exception {
        this.zzFG.zzI(zzmd.zzJE());
    }
}
