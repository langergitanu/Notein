package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzG5 {
    private com.aspose.words.internal.zzZYV<zzFR> zzZfc;

    public static class zzZ {
        public int zzZfa;
        public int zzZfb;

        public zzZ(int i, int i2) {
            this.zzZfb = i;
            this.zzZfa = i2;
        }

        public final int zzZO8() {
            if (!zzZO9()) {
                return this.zzZfb + ((int) Math.floor(((double) this.zzZfa) / 2.0d));
            }
            return (this.zzZfa / 2) + this.zzZfb;
        }

        public final boolean zzZO9() {
            return this.zzZfa % 2 == 0;
        }
    }

    private zzG5(ArrayList<zzFR> arrayList) {
        this.zzZfc = zzf(arrayList);
    }

    private double zzLp(int i) {
        return com.aspose.words.internal.zzAN.zzZJ(((double) this.zzZfc.zzT3(zzLr(i))) / 60000.0d);
    }

    private zzFR zzLq(int i) {
        return this.zzZfc.zzVY(zzLr(i));
    }

    private int zzLr(int i) {
        if (Math.abs(i) >= this.zzZfc.getCount()) {
            i %= this.zzZfc.getCount();
        }
        return i < 0 ? this.zzZfc.getCount() + i : i;
    }

    private ArrayList<zzZ> zzLs(int i) {
        ArrayList<zzZ> arrayList = new ArrayList<>();
        int iZzZOa = i == 0 ? zzZOa() : i;
        int iZzW = zzW(zzLp(iZzZOa), true);
        zzFR zzfrZzLq = zzLq(i);
        int i2 = 1;
        int i3 = 0;
        while (i2 < this.zzZfc.getCount()) {
            int iZzLr = zzLr(i + i2);
            int iZzW2 = zzW(zzLp(iZzLr), true);
            zzFR zzfrZzLq2 = zzLq(iZzLr);
            if (zzZ(zzfrZzLq, zzfrZzLq2) && iZzW2 == iZzW) {
                i3++;
            } else {
                if (i3 > 0) {
                    com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzZ(iZzZOa, i3 + 1));
                }
                i3 = 0;
                iZzZOa = iZzLr;
            }
            i2++;
            iZzW = iZzW2;
            zzfrZzLq = zzfrZzLq2;
        }
        if (i3 > 0) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzZ(iZzZOa, i3 + 1));
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private com.aspose.words.internal.zzZQ4 zzS(int i, int i2, boolean z) {
        if (!z) {
            return zzLq(i).zzZNk();
        }
        zzFR zzfrZzLq = zzLq(i);
        zzFR zzfrZzLq2 = zzLq(i2);
        if (zzfrZzLq.zzZNh() && zzfrZzLq2.zzZNh()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzU = com.aspose.words.internal.zzZQ4.zzU(zzfrZzLq.zzZNk(), zzfrZzLq2.zzZNk());
            com.aspose.words.internal.zzZQ4 zzzq4 = new com.aspose.words.internal.zzZQ4(C22244OooO0o0.OooO00o(zzzq4ZzU, 2.0f, zzzq4ZzU.zzZm()), (zzzq4ZzU.getHeight() / 2.0f) + zzzq4ZzU.zzZo(), 0.0f, 0.0f);
            zzY(i, zzzq4, true);
            zzY(i2, zzzq4, false);
        } else if (zzfrZzLq.zzZNh()) {
            zzY(i, zzfrZzLq2.zzZNk(), true);
        } else if (zzfrZzLq2.zzZNh()) {
            zzY(i2, zzfrZzLq.zzZNk(), false);
        }
        return com.aspose.words.internal.zzZQ4.zzT(zzfrZzLq.zzZNk(), zzfrZzLq2.zzZNk());
    }

    private static int zzW(double d, boolean z) {
        return (com.aspose.words.internal.zzAN.zzJ(d, 315.0d) || d < 45.0d) ? z ? 3 : 2 : (!com.aspose.words.internal.zzAN.zzJ(d, 45.0d) || d >= 135.0d) ? (!com.aspose.words.internal.zzAN.zzJ(d, 135.0d) || d >= 225.0d) ? z ? 1 : 0 : z ? 2 : 3 : z ? 0 : 1;
    }

    private com.aspose.words.internal.zzZQ4 zzY(int i, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        float fZzZm;
        float fZzZn;
        zzFR zzfrZzLq = zzLq(i);
        if (zzfrZzLq.zzZNh()) {
            int iZzW = zzW(zzLp(i), z);
            float fZzYB = com.aspose.words.internal.zzSA.zzYB(3) / (com.aspose.words.internal.zzAN.zzf(zzzq4.getWidth()) ? 4 : 2);
            float fZzYB2 = com.aspose.words.internal.zzSA.zzYB(3) / (com.aspose.words.internal.zzAN.zzf(zzzq4.getHeight()) ? 4 : 2);
            float f = 0.0f;
            if (iZzW == 0) {
                fZzZm = (zzzq4.zzZm() - zzfrZzLq.zzZNk().zzkw()) - fZzYB;
            } else if (iZzW != 1) {
                fZzZn = iZzW != 2 ? iZzW != 3 ? 0.0f : (zzzq4.zzZn() - zzfrZzLq.zzZNk().zzZo()) + fZzYB2 : (zzzq4.zzZo() - zzfrZzLq.zzZNk().zzZn()) - fZzYB2;
                zzfrZzLq.translate(f, fZzZn);
                zzfrZzLq.zzZNm();
            } else {
                fZzZm = (zzzq4.zzkw() - zzfrZzLq.zzZNk().zzZm()) + fZzYB;
            }
            f = fZzZm;
            fZzZn = 0.0f;
            zzfrZzLq.translate(f, fZzZn);
            zzfrZzLq.zzZNm();
        }
        return com.aspose.words.internal.zzZQ4.zzT(zzzq4, zzfrZzLq.zzZNk());
    }

    private void zzZ(int i, com.aspose.words.internal.zzZQ4 zzzq4, boolean z) {
        for (int i2 = 1; i2 < this.zzZfc.getCount(); i2++) {
            if (!zzZ(zzLq(i), zzLq((z ? 1 : -1) + i))) {
                return;
            }
            i = z ? i + 1 : i - 1;
            zzzq4 = zzY(i, zzzq4, z);
        }
    }

    private int zzZOa() {
        int iZzW = zzW(zzLp(0), true);
        for (int i = 0; i < this.zzZfc.getCount(); i++) {
            if (zzW(zzLp(i), true) != iZzW) {
                return i;
            }
        }
        return 0;
    }

    private int zzZOb() {
        for (int i = 1; i < this.zzZfc.getCount(); i++) {
            if (!zzZ(zzLq(i - 1), zzLq(i))) {
                return i;
            }
        }
        return 0;
    }

    private ArrayList<zzZ> zzZOc() {
        if (this.zzZfc.getCount() == 0) {
            return null;
        }
        return zzLs(zzZOb());
    }

    private void zzZOd() {
        ArrayList<zzZ> arrayListZzZOc = zzZOc();
        if (arrayListZzZOc == null) {
            return;
        }
        zzg(arrayListZzZOc);
    }

    private static com.aspose.words.internal.zzZYV<zzFR> zzf(ArrayList<zzFR> arrayList) {
        com.aspose.words.internal.zzZYV<zzFR> zzzyv = new com.aspose.words.internal.zzZYV<>();
        for (zzFR zzfr : arrayList) {
            zzzyv.set((int) (com.aspose.words.internal.zzAN.zzZJ(zzfr.zzZNi()) * 60000.0d), zzfr);
        }
        return zzzyv;
    }

    private void zzg(ArrayList<zzZ> arrayList) {
        for (zzZ zzz : arrayList) {
            int iZzZO8 = zzz.zzZO8();
            int i = zzz.zzZO9() ? iZzZO8 - 1 : iZzZO8;
            com.aspose.words.internal.zzZQ4 zzzq4ZzS = zzS(iZzZO8, i, zzz.zzZO9());
            for (int i2 = 1; i2 <= (zzz.zzZfa - 1) / 2; i2++) {
                iZzZO8++;
                i--;
                zzzq4ZzS = com.aspose.words.internal.zzZQ4.zzT(zzY(iZzZO8, zzzq4ZzS, true), zzY(i, zzzq4ZzS, false));
            }
            zzZ(iZzZO8, zzzq4ZzS, true);
            zzZ(i, zzzq4ZzS, false);
        }
    }

    public static void zzh(ArrayList<zzFR> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        new zzG5(arrayList).zzZOd();
    }

    private static boolean zzZ(zzFR zzfr, zzFR zzfr2) {
        return !com.aspose.words.internal.zzZQ4.zzU(zzfr.zzZNk(), zzfr2.zzZNk()).isEmpty();
    }
}
