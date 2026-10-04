package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL5 {
    private zzZL7[] zzYub;
    private zzY6N zzYuc;
    boolean zzYud;
    ArrayList<zzZL9> zzYue;
    int zzYup;
    int zzYuq;
    PreferredWidth zzYus;
    private ArrayList<zzZL6> zzZEU = new ArrayList<>();
    int zzYuf = 0;

    public zzZL5(zzY6N zzy6n) throws Exception {
        this.zzYuc = zzy6n;
        this.zzYus = zzy6n.zzY6a().zzYMZ();
        int iZzS = zzS(this.zzYuc);
        int i = 0;
        for (zzYIC zzyic = (zzYIC) this.zzYuc.zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            zzZL6 zzzl6 = new zzZL6();
            com.aspose.words.internal.zzZQG.zzZ(this.zzZEU, zzzl6);
            int iZzYka = zzyic.zzYka();
            if (zzyic.zzYka() > 0) {
                zzzl6.zzY(new zzZL9((zzWV) zzyic.zzZXZ(), 0, i, -1));
            }
            for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
                zzZL9 zzzl9 = new zzZL9(zzwv, iZzYka, i, 0);
                if (this.zzYuc.zzY6a().zzYKv()) {
                    zzzl9.zzYuq = Math.max(zzzl9.zzYuq, zzwv.zz6f());
                    zzzl9.zzYup = Math.max(zzzl9.zzYup, zzwv.zz6e());
                } else if (((zzZ3B) zzwv.zzYTt()).zzYMZ().isFixed() && ((zzZ3B) zzwv.zzYTt()).zzYMZ().zzYmE() > 0) {
                    int iZzYmE = ((zzZ3B) zzwv.zzYTt()).zzYMZ().zzYmE();
                    zzzl9.zzYuq = iZzYmE;
                    zzzl9.zzYup = iZzYmE;
                }
                if (zzzl9.zzYup == 0) {
                    zzzl9.zzYup = 1440;
                }
                int iMax = Math.max(zzzl9.zzYuq, 20);
                zzzl9.zzYuq = iMax;
                zzzl9.zzYup = Math.max(zzzl9.zzYup, iMax);
                zzzl6.zzY(zzzl9);
                iZzYka += zzwv.zz6q();
            }
            if (zzyic.zzYk8() > 0) {
                zzzl6.zzY(new zzZL9((zzWV) ((zzWV) zzyic.zzZXY()).zzYTo(), iZzYka, i, 1));
            }
            i++;
        }
        this.zzYub = new zzZL7[iZzS];
        while (true) {
            int i2 = iZzS - 1;
            if (iZzS <= 0) {
                return;
            }
            this.zzYub[i2] = new zzZL7();
            iZzS = i2;
        }
    }

    public static int zzS(zzY6N zzy6n) {
        int iMax = 0;
        for (zzYIC zzyic = (zzYIC) zzy6n.zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            int iZzYka = zzyic.zzYka() + zzyic.zzYk8();
            for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
                iZzYka += zzwv.zz6q();
            }
            iMax = Math.max(iMax, iZzYka);
        }
        return iMax;
    }

    private int zzZ58() {
        return (zzWU.zzZ((zzWV) ((zzWV) ((zzYIC) this.zzYuc.zzZXZ()).zzZXY()).zzYTo(), 2) / 2) + (zzWU.zzZ((zzWV) ((zzYIC) this.zzYuc.zzZXZ()).zzZXZ(), 1) / 2) + ((zzZ3B) ((zzWV) ((zzYIC) this.zzYuc.zzZXZ()).zzZXZ()).zzYTt()).getLeftPadding() + ((zzZ3B) ((zzWV) ((zzWV) ((zzYIC) this.zzYuc.zzZXZ()).zzZXY()).zzYTo()).zzYTt()).getRightPadding();
    }

    private int zzZ59() throws Exception {
        int width;
        int iZzZ58;
        int width2;
        zzTF zztfZzZZJ = ((zzYIC) this.zzYuc.zzZXZ()).zz6x().zzZZJ();
        int iZz60 = zztfZzZZJ.zz60();
        if (iZz60 != 2) {
            if (iZz60 == 16) {
                zzWT zzwt = (zzWT) zztfZzZZJ;
                width2 = zzwt.getWidth() - (zzwt.zz5X() + zzwt.zz5V());
            } else if (iZz60 == 1024 || iZz60 == 2048) {
                width = zztfZzZZJ.getWidth();
                iZzZ58 = zzZ58();
            } else {
                if (iZz60 != 16384) {
                    throw new UnsupportedOperationException("Cannot compute width of " + zztfZzZZJ.toString());
                }
                width2 = zztfZzZZJ.zzZZJ().getWidth();
            }
            return Math.max(0, width2 - this.zzYuc.zzY6a().zzYM7());
        }
        zzUZ zzuz = (zzUZ) zztfZzZZJ;
        zzZ35 zzz35 = (zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt();
        width = zzuz.getWidth();
        if (1 < zzz35.zzYLt().length && !zzz35.zzYLw()) {
            for (int i = 0; i < zzz35.zzYLt().length; i++) {
                width = Math.min(width, zzz35.zzYLt()[i]);
            }
        }
        iZzZ58 = zzZ58();
        width2 = width + iZzZ58;
        return Math.max(0, width2 - this.zzYuc.zzY6a().zzYM7());
    }

    public final int getColumnsCount() {
        return this.zzYub.length;
    }

    public final zzZL7 zzAm(int i) {
        return this.zzYub[i];
    }

    public final int zzX2(int i, int i2) throws Exception {
        int iMin;
        if (this.zzYus.isFixed() && this.zzYus.zzYmC()) {
            iMin = this.zzYus.zzYmD();
        } else {
            int iZzZ59 = zzZ59() / 50;
            if (this.zzYus.zzYmB() && this.zzYus.zzYmC()) {
                iMin = (int) ((this.zzYus.getValue() * ((double) iZzZ59)) / 100.0d);
            } else {
                iMin = Math.min(iZzZ59, i2);
            }
        }
        return Math.max(iMin, i);
    }

    public final zzZL9 zzX3(int i, int i2) {
        return this.zzZEU.get(i).zzAn(i2);
    }

    public final int zzZ5a() {
        return this.zzZEU.size();
    }
}
