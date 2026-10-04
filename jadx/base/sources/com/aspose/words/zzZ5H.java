package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5H {

    public static class zzZ {
        private int zzYer;
        private int zzYes;
        private com.aspose.words.internal.zzIM<zzY9W> zzYet;

        public zzZ(com.aspose.words.internal.zzIM<zzY9W> zzim, int i, int i2) {
            this.zzYet = zzim;
            this.zzYes = i;
            this.zzYer = i2;
        }

        public final int zzYR8() {
            return this.zzYer;
        }

        public final int zzYR9() {
            return this.zzYes;
        }

        public final com.aspose.words.internal.zzIM<zzY9W> zzYRa() {
            return this.zzYet;
        }
    }

    public static int zzP(zzZ55 zzz55) throws Exception {
        if (zzZ55.zza(zzz55)) {
            return ((zzZ6J) ((zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzI(true, true), zzY9X.class)).zzY53()).getAlignment();
        }
        if (zzz55.zzYPT()) {
            return 3;
        }
        return ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).getAlignment();
    }

    private static void zzQ(zzZ55 zzz55) throws Exception {
        boolean zZzmW = zzY9R.zzmW(((zzYAU) zzz55.zz6w()).zzZo6());
        int right = zzz55.getRight() - zzz55.getX();
        zzYAU zzyauZzY6O = null;
        boolean z = false;
        for (zzYAU zzyauZzYQl = zzz55.zzYQl(); zzyauZzYQl != null; zzyauZzYQl = zzyauZzYQl.zzY6Q()) {
            if (!zzyauZzYQl.zzY74()) {
                if (zZzmW || z || !zzyauZzYQl.zzY6p()) {
                    if (zzyauZzYQl.zzZo6() != 0) {
                        z = true;
                    }
                    zzyauZzYQl.setX(right - zzyauZzYQl.getWidth());
                    zzyauZzYQl.zzlU(0);
                    right = zzyauZzYQl.getX();
                } else {
                    zzyauZzY6O = zzyauZzYQl;
                }
            }
        }
        if (zzyauZzY6O != null) {
            int right2 = zzz55.getRight() - zzz55.getX();
            while (zzyauZzY6O != null) {
                if (!zzyauZzY6O.zzY74()) {
                    zzyauZzY6O.setX(right2);
                    right2 += zzyauZzY6O.getWidth();
                }
                zzyauZzY6O = zzyauZzY6O.zzY6O();
            }
        }
    }

    public static int zzR(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        return zzY(zzyau, zzyau2, 1).zzYR8();
    }

    private static void zzS(zzYAU zzyau, int i) {
        while (zzyau != null) {
            zzyau.setX(zzyau.getX() + i);
            zzyau = (zzYAU) zzyau.zz5Z();
        }
    }

    public static void zzT(zzZ55 zzz55) throws Exception {
        int i;
        zzz55.zza9();
        if (zzY9R.zzlw(zzz55.zzI(true, true).zzZo6())) {
            return;
        }
        boolean zZz5T = zzz55.zz5T();
        if (zZz5T) {
            zzQ(zzz55);
        } else {
            zzR(zzz55);
        }
        int iZzS = zzS(zzz55);
        if (zzz55.zzYPX() != 0) {
            zzZ zzzZzY = zzY((zzYAU) zzz55.zz6x(), (zzYAU) zzz55.zz6w(), zzz55.zzYPX());
            zzZ(zzz55, iZzS, zzzZzY.zzYRa(), zzzZzY.zzYR9());
            return;
        }
        int iZzP = iZzS <= 0 ? 0 : zzP(zzz55);
        if (iZzP == 3 || iZzP == 9 || (iZzP == 4 && zZz5T)) {
            zzZ57.zzN(zzz55, iZzS);
            return;
        }
        if (iZzP == 4) {
            zzY(zzz55, iZzS);
            return;
        }
        int iZzr = zzZ59.zzr(zzz55);
        if (zzZ55.zza(zzz55) && iZzr < 0) {
            if (iZzP != 0) {
                if (iZzP == 1) {
                    iZzS /= 2;
                } else if (iZzP != 2) {
                    if (iZzP == 10 && (iZzS = iZzS / 2) < (i = -iZzr)) {
                        iZzS = i;
                    }
                }
                iZzS += -iZzr;
            } else {
                iZzS = -iZzr;
            }
            zzS((zzYAU) zzz55.zz6x(), iZzS);
            return;
        }
        if (iZzP != 1) {
            if (iZzP == 2) {
                if (zZz5T) {
                    iZzS = -iZzS;
                }
                zzS((zzYAU) zzz55.zz6x(), iZzS);
                return;
            } else if (iZzP != 10) {
                return;
            }
        }
        if (zZz5T) {
            iZzS = -iZzS;
        }
        zzS((zzYAU) zzz55.zz6x(), iZzS / 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[EDGE_INSN: B:32:0x0085->B:30:0x0085 BREAK  A[LOOP:0: B:3:0x0010->B:34:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzZ zzY(zzYAU zzyau, zzYAU zzyau2, int i) throws Exception {
        int i2;
        int i3;
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int iZzlB = 0;
        int iZzlA = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            if (z) {
                int iZzZo6 = zzyau.zzZo6();
                if (iZzZo6 != 10754) {
                    if (iZzZo6 == 12803) {
                        arrayList.clear();
                        zzim.clear();
                        iZzlB = 0;
                        i4 = 0;
                    } else if (zzs(zzyau)) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            zzim.add((zzY9W) it.next());
                        }
                        arrayList.clear();
                        i4 = iZzlB;
                        i5 = iZzlA;
                    }
                } else if (zzyau.zzY72() == null) {
                    zzY9W zzy9w = (zzY9W) zzyau;
                    iZzlB += zzy9w.zzlB(i);
                    iZzlA += zzy9w.zzlA(i);
                    arrayList.add(zzy9w);
                }
                if (zzyau == zzyau2) {
                    break;
                }
                zzyau = (zzYAU) zzyau.zzYo1();
            } else {
                if (zzY9R.zzmY(zzyau.zzZo6()) || zzyau.zzY6n()) {
                    z = true;
                    int i6 = i4;
                    i2 = iZzlB;
                    i3 = i6;
                }
                int i7 = i2;
                i4 = i3;
                iZzlB = i7;
                if (zzyau == zzyau2) {
                }
            }
            int i8 = i4;
            i2 = iZzlB;
            i3 = i8;
            z = false;
            int i72 = i2;
            i4 = i3;
            iZzlB = i72;
            if (zzyau == zzyau2) {
            }
        } while (zzyau != null);
        return new zzZ(zzim, i4, i5);
    }

    public static int zzZ(zzYAU zzyau, zzYAU zzyau2, int i) throws Exception {
        return zzY(zzyau, zzyau2, i).zzYR9();
    }

    public static boolean zzs(zzYAU zzyau) throws Exception {
        return ((zzyau.zzY6o() && ((zzZ37) zzyau.zzY6S().zzYTt()).getWordWrap()) || zzY9R.zzmW(zzyau.zzZo6()) || zzyau.zzY74() || zzyau.zzZo6() == 0 || zzyau.zzZo6() == 10528) ? false : true;
    }

    public static void zzR(zzZ55 zzz55) throws Exception {
        zzYAU zzyauZzYQl = zzz55.zzYQl();
        int right = zzz55.zzYQl() == zzyauZzYQl ? 0 : ((zzYAU) zzyauZzYQl.zzYo0()).getRight();
        while (zzyauZzYQl != null) {
            if (!zzyauZzYQl.zzY74()) {
                zzyauZzYQl.setX(right);
                zzyauZzYQl.zzlU(0);
                right = zzyauZzYQl.getRight();
            }
            zzyauZzYQl = zzyauZzYQl.zzY6Q();
        }
    }

    private static int zzS(zzZ55 zzz55) throws Exception {
        int x;
        if (((zzYMM) zzz55.zza9()) != null) {
            zzz55.zza9();
        }
        boolean zZz5T = zzz55.zz5T();
        boolean zZzmW = zzY9R.zzmW(((zzYAU) zzz55.zz6w()).zzZo6());
        zzYAU zzyauZzYQk = zzz55.zzYQk();
        while (true) {
            if (zzyauZzYQk == null) {
                zzyauZzYQk = null;
                break;
            }
            if (zzs(zzyauZzYQk) || (zZzmW && zzyauZzYQk.zzY6p() && zzyauZzYQk.zzY7b() != zZz5T)) {
                break;
            }
            zzyauZzYQk = zzyauZzYQk.zzY6O();
        }
        if (zzyauZzYQk == null) {
            x = zZz5T ? zzz55.getWidth() : 0;
        } else {
            x = zZz5T ? zzyauZzYQk.getX() : zzyauZzYQk.getRight();
            if (zzz55.zzYPT()) {
                x -= zzyauZzYQk.zzlW(zzyauZzYQk.zz0R() - 1);
            }
        }
        zzYAU zzyauZzYQk2 = zzz55.zzYQk();
        if (zzyauZzYQk2.zzZo6() == 11799) {
            x += ((zzY9V) zzyauZzYQk2).zzY4R();
        }
        return zZz5T ? x : zzz55.getWidth() - x;
    }

    private static void zzZ(zzZ55 zzz55, int i, com.aspose.words.internal.zzIM<zzY9W> zzim, int i2) throws Exception {
        zzim.getCount();
        int right = zzz55.zz5T() ? zzz55.zzYQl().getRight() : zzz55.zzYQl().getX();
        for (zzYAU zzyauZzYQl = zzz55.zzYQl(); zzyauZzYQl != null; zzyauZzYQl = zzyauZzYQl.zzY6Q()) {
            if (zzyauZzYQl.zzZo6() == 10754) {
                zzY9W zzy9w = (zzY9W) zzyauZzYQl;
                if (zzim.contains(zzy9w)) {
                    zzZ(zzz55.zzYPX(), i, i2, zzy9w);
                }
            }
            if (zzz55.zz5T()) {
                zzyauZzYQl.setX(right - zzZ59.zzd(zzyauZzYQl));
                right = zzyauZzYQl.getX();
            } else {
                zzyauZzYQl.setX(right);
                right = zzZ59.zze(zzyauZzYQl);
            }
        }
    }

    private static void zzZ(int i, int i2, int i3, zzY9W zzy9w) throws Exception {
        int iZzlB = zzy9w.zzlB(i);
        if (iZzlB == 0) {
            return;
        }
        zzy9w.zzlU((int) (((i2 / i3) / zzy9w.getLength()) * iZzlB));
    }

    private static int zzZ(zzZ55 zzz55, zzYAU zzyau, int i) throws Exception {
        int length = 0;
        for (zzYAU zzyauZzZ = zzVE.zzZ(zzyau, (zzYAU) zzz55.zz6w()); zzyauZzZ != null; zzyauZzZ = zzyauZzZ.zzY6Q()) {
            if (com.aspose.words.internal.zzZYD.zzXk(zzyauZzZ.getText()) && !zzY9R.zzmW(zzyauZzZ.zzZo6()) && (zzyauZzZ.zzZo6() != 10754 || zzz55.zz6w() != zzyauZzZ)) {
                length += zzyauZzZ.getText().length();
            }
        }
        if (length > 1) {
            return i / (length - 1);
        }
        return 0;
    }

    private static void zzY(zzZ55 zzz55, int i) throws Exception {
        zzYAU zzyauZzYQl = zzz55.zzYQl();
        int iZzZ = zzZ(zzz55, zzyauZzYQl, i);
        int x = zzyauZzYQl.getX();
        zzYAU zzyau = null;
        while (zzyauZzYQl != null) {
            zzyauZzYQl.setX(x);
            if (com.aspose.words.internal.zzZYD.zzXk(zzyauZzYQl.getText()) && !zzY9R.zzmW(zzyauZzYQl.zzZo6())) {
                zzyauZzYQl.zzlU(iZzZ);
                zzyau = zzyauZzYQl;
            }
            x = zzZ59.zze(zzyauZzYQl);
            zzyauZzYQl = zzyauZzYQl.zzY6Q();
        }
        if (zzyau != null) {
            zzyau.setContentWidth(zzyau.zzZXS() - iZzZ);
        }
    }
}
