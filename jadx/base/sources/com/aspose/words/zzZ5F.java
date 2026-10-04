package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5F {
    private zzZ54 zzYef = new zzZ54();
    private zzZ55 zzYeg;
    private com.aspose.words.internal.zzZQ5 zzYeh;
    private long zzYei;
    private zzY5N zzZA2;

    private zzZ50 zz7(int i, int i2, int i3) throws Exception {
        int i4;
        com.aspose.words.internal.zzZQ5 zzzq5 = new com.aspose.words.internal.zzZQ5(this.zzYeh.getX() - ((int) this.zzYei), i, this.zzYeh.getWidth(), i2);
        if (!zzYR0()) {
            return new zzZ50(zzzq5, i2);
        }
        com.aspose.words.internal.zzZQ5 zzzq52 = !com.aspose.words.internal.zzZPZ.zzYF(this.zzYei) ? new com.aspose.words.internal.zzZQ5(zzzq5.getX() + ((int) this.zzYei), zzzq5.getY() + ((int) (this.zzYei >> 32)), zzzq5.getWidth(), zzzq5.getHeight()) : zzzq5;
        int iZzYQF = this.zzYeg.zzYQj().zzYQF();
        int iZzYQE = this.zzYeg.zzYQj().zzYQE();
        int y = zzzq52.getY();
        int height = zzzq52.getHeight();
        boolean zZzZYM = this.zzYeg.zza7().zzZYM();
        if (zZzZYM && iZzYQE > 0) {
            iZzYQE -= this.zzYeg.zzYQj().zzYdv;
            height = Math.max(1, i2 - iZzYQE);
        }
        int i5 = height;
        int y2 = zzzq52.getY();
        int height2 = zzzq52.getHeight() - iZzYQE;
        if (!zZzZYM) {
            y2 += iZzYQF;
            height2 -= iZzYQF;
        }
        if (i2 == 1) {
            y2 = zzzq52.getY();
            i4 = i2;
        } else {
            i4 = height2;
        }
        zzZ50 zzz50ZzZ = this.zzZA2.zzZ(zzzq52, y, i5, y2, i4, i3, (zzYBL) this.zzYeg.zzZZJ());
        if (i2 < 1000) {
            com.aspose.words.internal.zzZQ5 zzzq53 = new com.aspose.words.internal.zzZQ5(zzzq52.getX(), zzzq52.getY(), zzzq52.getWidth(), 1000);
            zzZ50 zzz50ZzZ2 = this.zzZA2.zzZ(zzzq53, y, 1000, y, 1000, 999, (zzYBL) this.zzYeg.zzZZJ());
            if (zzz50ZzZ2.zzXRV() == zzzq53.getBottom()) {
                zzz50ZzZ.zzhw(zzz50ZzZ2.zzXRV());
            }
        }
        if (!com.aspose.words.internal.zzZPZ.zzYF(this.zzYei)) {
            long j = this.zzYei;
            zzz50ZzZ.offset(-((int) j), -((int) (j >> 32)));
        }
        return zzz50ZzZ;
    }

    private boolean zzG(zzZ55 zzz55) throws Exception {
        if (zzz55.zzYnZ() || zzz55.zzYo0() == null || ((zzZ55) zzz55.zzYo0()).zzYQc().zzZo6() != 21513) {
            return false;
        }
        int iZzH = zzH((zzZ55) zzz55.zzYo0());
        return zzZ(zz7(zzz55.getY() - iZzH, iZzH, iZzH - 1));
    }

    private static int zzH(zzZ55 zzz55) throws Exception {
        zzZ55 zzz55ZzYQo = zzz55.zzYQo();
        int iMax = Math.max(zzz55ZzYQo.getHeight(), 1);
        while (zzz55 != zzz55ZzYQo) {
            iMax = Math.max(iMax, zzz55.getHeight());
            zzz55 = (zzZ55) zzz55.zzYo0();
        }
        return iMax;
    }

    private static boolean zzI(zzZ55 zzz55) throws Exception {
        if (!zzz55.zza7().zzZYM()) {
            return false;
        }
        zzYAU zzyauZzT = zzVE.zzT((zzYAU) zzz55.zz6x());
        if (zzyauZzT.zzY7r() != 5121) {
            return false;
        }
        while (true) {
            zzYAU zzyauZzT2 = zzVE.zzT((zzYAU) zzyauZzT.zzYo1());
            if (zzyauZzT2 == null) {
                return false;
            }
            if (zzyauZzT2.zzY7r() != 5121) {
                if (zzyauZzT2.zzY6l()) {
                    zzyauZzT = zzyauZzT2;
                }
                return zzyauZzT.getRight() > zzz55.getWidth();
            }
            zzyauZzT = zzyauZzT2;
        }
    }

    private static boolean zzJ(zzZ55 zzz55) throws Exception {
        zzYAU zzyauZzT;
        zzYAU zzyauZzT2 = zzVE.zzT((zzYAU) zzz55.zz6x());
        if (zzyauZzT2.zzZo6() != 12803 || (zzyauZzT = zzVE.zzT((zzYAU) zzyauZzT2.zzYo1())) == null) {
            return false;
        }
        boolean z = ((zzZ55) zzyauZzT2.zzZZJ()) != ((zzZ55) zzyauZzT.zzZZJ());
        boolean zZzY6l = zzyauZzT.zzY6l();
        if (!zzz55.zza7().zzZYM() || zzyauZzT2.getWidth() <= zzz55.getWidth()) {
            return z && zZzY6l;
        }
        return true;
    }

    private static boolean zzK(zzZ55 zzz55) throws Exception {
        return ((zzYAU) zzz55.zz6w()).zzZo6() == 21514 ? zzz55.zza7().zzZYM() : zzY9R.zzmW(((zzYAU) zzz55.zz6w()).zzZo6());
    }

    private static zzYAU zzL(zzZ55 zzz55) throws Exception {
        zzYAU zzyauZzI = zzz55.zzI(true, true);
        while (zzyauZzI.zzYRO()) {
            zzyauZzI = zzVE.zzT((zzYAU) zzyauZzI.zzYo1());
        }
        zzyauZzI.zzZZJ();
        return zzyauZzI;
    }

    private static boolean zzM(zzZ55 zzz55) throws Exception {
        if (zzz55.zza7().zzZYM()) {
            return false;
        }
        if ((zzz55.zzYTm() && zzz55.zzI(true, true).zzY6p() && zzz55.zza7().zzYMw() != 0) || zzY9R.zzmW(zzz55.zzI(true, true).zzZo6())) {
            return true;
        }
        if (!zzz55.zzYTn()) {
            return false;
        }
        zzYAU zzyauZzYQc = zzz55.zzYQc();
        if (zzY9R.zzmW(zzyauZzYQc.zzZo6()) && zzyauZzYQc.zzZo6() != 21514) {
            zzyauZzYQc.zzZo6();
        }
        zzYAU zzyauZzL = zzL(zzz55);
        if (zzyauZzL == zzyauZzYQc) {
            return true;
        }
        if (zzyauZzL.getLength() > 1) {
            return false;
        }
        return !(zzyauZzL.zzZo6() == 25604 && ((zzY9X) zzyauZzL).zzY53().zzZid()) && zzVE.zzT((zzYAU) zzyauZzL.zzYo1()) == zzyauZzYQc;
    }

    private boolean zzN(zzZ55 zzz55) throws Exception {
        this.zzYeg = zzz55;
        this.zzZA2 = zzY5N.zzZO(zzz55);
        this.zzYeg.zzUQ(false);
        this.zzYeg.zzUM(false);
        this.zzYef.zzM(this.zzYeg, Integer.MIN_VALUE);
        if (!this.zzYeg.isActive()) {
            return false;
        }
        zzZ55 zzz552 = this.zzYeg;
        zzz552.zzxG((zzz552.zzYnZ() || this.zzYeg.zzYTm()) ? this.zzYeg.getY() : Integer.MIN_VALUE);
        if (zzY5N.zze(zzz55)) {
            return false;
        }
        this.zzYei = this.zzYeg.zzYQf() ? 0L : this.zzYeg.zzZZJ().zzYqr();
        zzYR1();
        return this.zzYeh.getWidth() > 0;
    }

    private static boolean zzT(zzY9X zzy9x) throws Exception {
        zzy9x.zzY6M().zzYLJ();
        zzZ55 zzz55 = (zzZ55) zzy9x.zzZZJ();
        if (zzz55.zzZZJ().zz60() != 2) {
            return false;
        }
        return zzy9x.getY() + zzy9x.getContentHeight() > ((zzYN8) zzz55.zzqh(1)).zzYqn() - zzz55.zzZZJ().getY();
    }

    private static int zzV(zzZ55 zzz55, int i) throws Exception {
        if (zzz55.zzYQ9()) {
            return zzz55.getX();
        }
        int iZz5X = zzz55.zzZZJ().zz5X() + zzZ59.zzr(zzz55);
        return i > zzz55.zzZZJ().zz5X() ? !zzz55.zz5T() ? zzZ(zzz55, i, zzz55.zzZZJ().zz5X()) : zzz55.zza7().zzYMl() ? i : Math.max(i, iZz5X) : iZz5X;
    }

    private static int zzW(zzZ55 zzz55, int i) throws Exception {
        int iZzZXT = zzz55.zzZZJ().zzZXT();
        int iZzq = iZzZXT - zzZ59.zzq(zzz55);
        if (i == iZzZXT) {
            return iZzq;
        }
        if (zzz55.zza7().zzYMl()) {
            iZzq = i;
        }
        if (zzz55.zz5T()) {
            iZzq = zzz55.zzZZJ().getWidth() - zzZ(zzz55, zzz55.zzZZJ().getWidth() - i, zzz55.zzZZJ().zz5V());
        }
        return Math.min(iZzq, i);
    }

    private void zzX(zzZ55 zzz55, int i) throws Exception {
        int iZzYqn;
        if (!zzz55.zza7().zzZYM() && zzz55.zzZZJ().zz60() == 2 && i > (iZzYqn = this.zzZA2.zzYqn() - zzz55.zzZZJ().getY()) && zzZ51.zzX(zzz55, true) && !zzY9R.zzlw(zzz55.zzI(true, true).zzZo6())) {
            zzz55.setY(iZzYqn + 1);
        }
    }

    private boolean zzYR0() {
        zzY5N zzy5n = this.zzZA2;
        return (zzy5n == null || zzy5n.zzXVS().getCount() == 0 || this.zzZA2.zzXVX()) ? false : true;
    }

    private void zzYR1() throws Exception {
        this.zzYeh = new com.aspose.words.internal.zzZQ5(((int) this.zzYei) + ((zzYBL) this.zzYeg.zzZZJ()).zz5X(), ((int) (this.zzYei >> 32)) + ((zzYBL) this.zzYeg.zzZZJ()).zz5W(), Math.max(0, ((zzYBL) this.zzYeg.zzZZJ()).zzZXS()), 1073741823);
    }

    private boolean zzZ(zzZ50 zzz50) {
        return (zzz50.zzyD().size() == 1 && zzz50.zzyD().get(0).getLength() == this.zzYeh.getWidth()) ? false : true;
    }

    private static boolean zzn(zzYAU zzyau) throws Exception {
        char cCharAt;
        if (zzY9R.zzmY(zzyau.zzZo6()) && !zzyau.zzY6p() && !zzyau.zzY6D() && zzyau.zzZo6() != 9752 && (cCharAt = zzyau.getText().charAt(zzyau.getText().length() - 1)) != '-' && cCharAt != 8211 && cCharAt != 8212) {
            zzYAU zzyauZzT = zzVE.zzT((zzYAU) zzyau.zzYo1());
            if (zzY9R.zzmY(zzyauZzT.zzZo6()) && !zzyauZzT.zzY6D()) {
                return true;
            }
        }
        return false;
    }

    public final void zzO(zzZ55 zzz55) throws Exception {
        zzZ50 zzz50Zz7;
        if (zzN(zzz55)) {
            int y = this.zzYeg.getY();
            int height = this.zzYeg.getHeight();
            if (height <= 0) {
                height = 1;
            }
            boolean zZzYQ5 = zzz55.zzYQ5();
            int i = zZzYQ5 ? 1 : height;
            zzZ50 zzz50Zz72 = zz7(y, i, i - 1);
            if (zzZ(zzz50Zz72)) {
                boolean z = zzz50Zz72.zzyD().size() == 0;
                boolean zZzG = zzG(this.zzYeg);
                if (zZzG) {
                    y = zzz50Zz72.zzXRV();
                }
                boolean z2 = false;
                do {
                    int i2 = i;
                    int height2 = 0;
                    boolean z3 = false;
                    do {
                        zzz50Zz7 = zz7(y, i2, height2);
                        if (zZzG && zzz50Zz7.zzXRU()) {
                            y = zzz50Zz7.zzXRV();
                        } else {
                            int iZzZ = zzZ(zzz50Zz7, this.zzYeg, zzZ(zzz50Zz7) && (zzz50Zz7.zzyD().size() > 1 || zzz50Zz7.zzYPw() || this.zzYeg.zza7().zzZYM()));
                            if (iZzZ <= i2 || zZzYQ5) {
                                z3 = iZzZ >= 0 && (iZzZ <= zzz50Zz7.getHeight() || zZzYQ5);
                                if (z3) {
                                    zzX(this.zzYeg, iZzZ + y);
                                } else {
                                    this.zzYeg.zzxD(0);
                                    if (!this.zzYeg.zza7().zzZYM() ? zzz50Zz7.zzyD().size() > 0 : !z2) {
                                        this.zzYeg.zzxG(y);
                                        z2 = true;
                                    }
                                }
                            } else {
                                zzz50Zz7.zzyD().size();
                                z3 = false;
                                i2 = iZzZ;
                            }
                            if (!z3) {
                                this.zzYeg.zzYQm();
                            }
                            height2 = zzz50Zz7.getHeight();
                        }
                        if (height2 >= i2) {
                            break;
                        }
                    } while (!z3);
                    if (z3) {
                        break;
                    }
                    this.zzYeg.zzUM(true);
                    boolean z4 = !zzz50Zz7.zzYPw() && this.zzYeg.zza7().zzZYM();
                    if (zzz50Zz7.zzyD().size() <= 1 || z4) {
                        y = zzz50Zz7.zzXRV();
                    } else {
                        int iZzXRV = zzz50Zz7.zzXRV() - y;
                        int i3 = iZzXRV / height;
                        if (iZzXRV % height != 0) {
                            i3++;
                        }
                        y = (i3 * height) + y;
                    }
                } while (y < 1073741823);
                if (y >= 1073741823) {
                    this.zzYeg.zzYU(true);
                }
                if (zZzYQ5 && z && !zzz55.zza7().zzZYM() && zzz55.zzI(true, true).zzZo6() == 21858) {
                    zzz55.setHeight(1);
                }
            }
        }
    }

    private int zzZ(zzZ50 zzz50, zzZ55 zzz55, boolean z) throws Exception {
        int i;
        int i2;
        int size;
        zzZ55 zzz552 = zzz55;
        int iZzZXS = zzz552.zzZZJ().zzZXS() - zzZ59.zzp(zzz552);
        int iMax = 0;
        boolean z2 = iZzZXS <= 0;
        int size2 = zzz50.zzyD().size();
        if (zzz552.zz5T()) {
            size = zzz50.zzyD().size() - 1;
            i2 = -1;
            i = -1;
        } else {
            i = 1;
            i2 = size2;
            size = 0;
        }
        zzZ55 zzz553 = zzz552;
        for (int i3 = size; zzz553 != null && i3 != i2; i3 += i) {
            zzYCP zzycp = zzz50.zzyD().get(i3);
            int iZzV = zzV(zzz553, zzycp.getStart());
            boolean zZzM = zzM(zzz553);
            boolean z3 = zZzM || (zzz50.zzyD().size() == 1 && !zzz553.zza7().zzZYM());
            boolean z4 = iZzV < zzycp.getEnd();
            zzz553.zzUQ(!z4 && zZzM && zzz50.zzYPv() == 1);
            int iZzW = zzW(zzz552, zzycp.getEnd());
            int i4 = iZzW - iZzV;
            if ((z3 || (z4 && (i4 > 0 || z2))) && !zzZ(zzz553, iZzV, i4, iZzZXS, zzz50, i3, z3)) {
                zzz553.zzYj(true);
                if (i4 <= 0) {
                    if (zzz553.zz5T()) {
                        iZzV = Math.min(iZzW, zzycp.getEnd());
                    }
                    i4 = 1;
                }
                zzz553.setX(iZzV);
                zzz553.setWidth(i4);
                int start = zzz553.zza7().zzZYM() ? 0 : zzycp.getStart();
                zzz553.setY(zzz50.getY());
                zzz553.getY();
                zzz552.getY();
                zzz553.setBaseline(zzz552.getBaseline());
                this.zzYef.zzM(zzz553, start);
                zzz553.zzYj(false);
                zzz553.isActive();
                if (z && (zzn((zzYAU) zzz553.zz6w()) || zzJ(zzz553) || zzI(zzz553))) {
                    zzz553.zzYU(false);
                } else {
                    boolean zZzK = zzK(zzz553);
                    zzz553 = (zzZ55) zzz553.zzYo1();
                    if (zZzK) {
                        break;
                    }
                }
            }
        }
        if (zzz552 == zzz553) {
            return -1;
        }
        int iMax2 = 0;
        for (zzZ55 zzz554 = zzz552; zzz554 != zzz553; zzz554 = (zzZ55) zzz554.zzYo1()) {
            iMax = Math.max(iMax, zzz554.getHeight());
            iMax2 = Math.max(iMax2, zzz554.getBaseline());
        }
        while (zzz552 != zzz553) {
            zzz552.setY((iMax2 - zzz552.getBaseline()) + zzz552.getY());
            zzz552 = (zzZ55) zzz552.zzYo1();
        }
        return iMax;
    }

    private static boolean zzZ(zzZ55 zzz55, int i, int i2, int i3, zzZ50 zzz50, int i4, boolean z) throws Exception {
        if (!zzz50.zzXRU()) {
            return false;
        }
        zzYAU zzyauZzI = zzz55.zzI(true, true);
        if (zzyauZzI.zzZo6() != 9217 && zzyauZzI.zzZo6() != 25604) {
            return false;
        }
        int iZzlW = zzyauZzI.zzlW(0);
        if (zzz55.zza7().zzZYM()) {
            i2 = Math.min(i2, i3);
        }
        zzz55.zza7();
        boolean z2 = iZzlW > i2;
        if (!z2 || !z) {
            return z2;
        }
        zzZ(zzz55, i, zzz50, i4);
        return false;
    }

    private static void zzZ(zzZ55 zzz55, int i, zzZ50 zzz50, int i2) throws Exception {
        int end;
        zzYCP zzycp = zzz50.zzyD().get(i2);
        boolean z = false;
        boolean z2 = !(zzz55.zzZZJ().zz60() == 2 && zzz55.zz5T()) ? zzycp.getEnd() != zzz55.zzZZJ().getWidth() : zzycp.getStart() != 0;
        zzz55.zzZZJ();
        zzYAU zzyauZzI = zzz55.zzI(true, true);
        if (zzyauZzI.zzZo6() == 25604) {
            zzY9X zzy9x = (zzY9X) zzyauZzI;
            zzy9x.zzY6M().zzYLJ();
            boolean zZzT = zzT(zzy9x);
            boolean z3 = zzy9x.zzY53().hasImage() && !((zzz55.zzYQf() && zzy9x.zzY53().zzYS7()) || zZzT);
            boolean z4 = zzy9x.zzY53().zzYS8() && !zZzT;
            if (!z3 && !z4) {
                z = true;
            }
        }
        if (z2 || z) {
            return;
        }
        if (zzz55.zz5T()) {
            end = zzW(zzz55, zzycp.getEnd()) - zzycp.getStart();
        } else {
            end = zzycp.getEnd() - i;
        }
        if (!zzz55.zz5T() ? i2 == zzz50.zzyD().size() - 1 : i2 == 0) {
            if (!zzz55.zzYQf()) {
                end += com.aspose.words.internal.zzSA.zzn(9.0d);
            }
        }
        zzz55.zzxD(end > 0 ? end : 1);
    }

    private static int zzZ(zzZ55 zzz55, int i, int i2) throws Exception {
        int iZzYM7 = ((zzYMM) zzz55.zza9()).zzYM7();
        int iZzYMa = ((zzYMM) zzz55.zza9()).zzYMa();
        int i3 = -iZzYMa;
        boolean z = iZzYMa >= 0;
        boolean zZzYMl = zzz55.zza7().zzYMl();
        boolean zIsList = ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).isList();
        if (zZzYMl) {
            i2 = i;
        }
        if (zzz55.zzYQ3()) {
            if (!zZzYMl) {
                i2 = (z || zzz55.zza7().zzZYM()) ? Math.max(i, i2 + iZzYM7) : i + iZzYM7;
            } else if (zIsList) {
                i2 += iZzYM7;
            }
            return z ? i2 + iZzYMa : i2;
        }
        if (zZzYMl) {
            if (!zIsList) {
                return i2;
            }
            int i4 = i2 + iZzYM7;
            return !z ? i4 + i3 : i4;
        }
        int i5 = i2 + iZzYM7;
        if (!z) {
            i5 += i3;
        }
        return Math.max(i, i5);
    }
}
