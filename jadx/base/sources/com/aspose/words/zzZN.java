package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN {
    private boolean zzZEQ;
    private boolean zzZER;
    private boolean zzZES;
    private zzY6R zzZET;
    private ArrayList<zzYI8> zzZEU;

    private boolean zzU(zzY6N zzy6n) throws Exception {
        int orientation;
        for (zzYIC zzyic = (zzYIC) zzy6n.zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null; zzwv = (zzWV) zzwv.zzYTp()) {
                if (!((zzWT) zzwv.zz6x()).isVirtual()) {
                    int iZz6p = zzwv.zz6p();
                    if (iZz6p <= 0) {
                        return true;
                    }
                    if (iZz6p > 1) {
                        this.zzZES = true;
                    }
                    if (((zzZ3B) zzwv.zzYTt()).getFitText() || (orientation = ((zzZ3B) zzwv.zzYTt()).getOrientation()) == 1 || orientation == 7 || orientation == 3 || orientation == 4 || orientation == 5) {
                        return true;
                    }
                    for (zzZ6T zzz6tZzZXZ = zzwv.zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
                        if (zzz6tZzZXZ.zz6y() == 4) {
                            if (((zzY6N) zzz6tZzZXZ).zz6f() == Integer.MIN_VALUE) {
                                return true;
                            }
                        } else if (zzz6tZzZXZ.zz6y() == 32 && zzZ((zzYMM) zzz6tZzZXZ)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean zzV(zzY6N zzy6n) throws Exception {
        if (zzy6n.zzXYs() || !zzy6n.zzY6a().zzYKp()) {
            return false;
        }
        if ((zzy6n.zzY6a().zzYMZ().isAuto() || zzy6n.zzY6a().zzYMZ().zzYmB()) && ((zzYBL) ((zzYIA) ((zzYIC) zzy6n.zzZXZ()).zz6x()).zzZZJ()).zz60() == 2048) {
            return false;
        }
        if (zzy6n.zzhk() && zzy6n.zza6().zzXYs()) {
            return false;
        }
        return ((this.zzZES && (this.zzZER || this.zzZEQ)) || (zzU(zzy6n) || zzy6n.zzXYs())) ? false : true;
    }

    private static Table zzW(zzY6N zzy6n) throws Exception {
        zzYAS zzyasZz69 = ((zzYIC) zzy6n.zzZXY()).zz69();
        zzY9R.zzmL(zzyasZz69.zzZo6());
        return zzyasZz69.zzY67().zzZex().getParentRow().getParentTable();
    }

    private static ArrayList<zzYI8> zzX(zzY6N zzy6n) throws Exception {
        ArrayList<zzYI8> arrayList = new ArrayList<>();
        for (zzYIC zzyic = (zzYIC) zzy6n.zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYI8(zzyic));
        }
        return arrayList;
    }

    public final zzY6P zzY(zzY6N zzy6n) throws Exception {
        zzy6n.zzY6a().zzYKv();
        if (!zzy6n.zzY6a().zzYKv()) {
            return null;
        }
        if (!zzV(zzy6n)) {
            zzy6n.zzk0(1);
            return null;
        }
        ArrayList<zzYI8> arrayListZzX = zzX(zzy6n);
        this.zzZEU = arrayListZzX;
        zzZ(zzy6n, arrayListZzX);
        if (!this.zzZET.zzXYV()) {
            return this.zzZET.zzT(zzy6n.zzY6a().zzYMZ());
        }
        zzy6n.zzk0(1);
        return null;
    }

    public final void zzZ(zzY6N zzy6n) throws Exception {
        zzY6U zzy6uZzXYo;
        zzy6n.zzY6a().zzYKv();
        if (zzy6n.zzY6a().zzYKv()) {
            if (this.zzZET == null) {
                zzY(zzy6n);
            }
            if (zzy6n.zzhk() && (((zzy6uZzXYo = zzy6n.zza6().zzXYo()) == null || zzy6uZzXYo.getState() != 2) && zzy6n.zzXYo() != null)) {
                zzy6n.zzXYo().setState(1);
            }
            if (zzy6n.zzXYs()) {
                return;
            }
            this.zzZET.zzXZc();
            boolean zZzZ = false;
            while (this.zzZET.zzXZd()) {
                zzY6V zzy6vZzXYW = this.zzZET.zzXYW();
                do {
                    zZzZ |= zzZM.zzZ(zzy6n, zzy6vZzXYW, this.zzZET.zzXZb());
                    if (!zZzZ) {
                    }
                } while (this.zzZET.zzXZ3());
            }
            boolean z = (this.zzZET.zzXYV() || zZzZ) ? false : true;
            zzY6U zzy6uZzW = this.zzZET.zzW(zzW(zzy6n), z);
            if (z) {
                zzY(zzy6n, this.zzZEU);
            }
            zzy6n.zzXYo().zzU(zzy6uZzW.zzXZp());
            zzy6n.zzXYo().setState(zzy6uZzW.getState());
            this.zzZET = null;
        }
    }

    private static boolean zzY(zzYMM zzymm) throws Exception {
        if (zzymm.zzYTl() == 0) {
            return false;
        }
        zzZ4N zzz4nZzYPe = zzymm.zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzymm.zzZ9r());
        boolean z = false;
        for (zzZAK zzzakZzYPi = zzz4nZzYPe.zzYPi(); zzzakZzYPi != null; zzzakZzYPi = zzzakZzYPi.zzZT4()) {
            zzYAU zzyau = (zzYAU) com.aspose.words.internal.zzZKW.zzZ(zzzakZzYPi, zzYAU.class);
            if (zzyau != null) {
                if (zzyau.zzY6S() != zzymm && zzyau.zzY6S() != null) {
                    return z;
                }
                z = zzyau.zzZo6() == 21788 || zzyau.zzZo6() == 21779;
                if (z) {
                    return z;
                }
            }
        }
        return z;
    }

    private static void zzY(zzY6N zzy6n, ArrayList<zzYI8> arrayList) {
        zzYIC zzyic = (zzYIC) zzy6n.zzZXZ();
        int i = 0;
        while (zzyic != null) {
            int i2 = i + 1;
            zzYI8 zzyi8 = arrayList.get(i);
            zzWV zzwv = (zzWV) zzyic.zzZXZ();
            int i3 = 0;
            while (!zzwv.zzYTn()) {
                zzwv.zzOC(zzyi8.zzYjs().get(i3).zz5q());
                zzwv = (zzWV) zzwv.zzYTp();
                i3++;
            }
            zzyic.zzpi(zzyi8.zzYjv().zz5q());
            if (zzyic.zzYka() == 0) {
                zzyic.zzph(0);
            }
            zzyic.zzpg(zzyi8.zzYju().zz5q());
            if (zzyic.zzYk8() == 0) {
                zzyic.zzpf(0);
            }
            zzyic = (zzYIC) zzyic.zzYTp();
            i = i2;
        }
    }

    private void zzZ(zzY6N zzy6n, ArrayList<zzYI8> arrayList) {
        com.aspose.words.internal.zzDB zzdb;
        if (zzY6U.zzZ(zzy6n.zzXYo())) {
            zzdb = zzy6n.zzXYo().zzXZp();
        } else {
            zzdb = new com.aspose.words.internal.zzDB();
            if (zzy6n.zzY6a().zzYKo() != null) {
                zzdb.zzX(zzy6n.zzY6a().zzYKo());
            }
        }
        this.zzZET = new zzY6R(zzdb, arrayList, zzy6n.zzY6a().zzYKu() ? zzy6n.zzY6a().zzYKt() / 50 : -1, true, zzy6n.zza7().zzYMu());
        while (this.zzZET.zzXZe()) {
            this.zzZET.zzXZf();
        }
    }

    private static boolean zzZ(zzY9X zzy9x) {
        return !zzy9x.zzY6M().zzYLJ().isFloating() && zzy9x.zzY53().zzYS7() && zzy9x.zzY53().zzYS5();
    }

    private boolean zzZ(zzYMM zzymm) throws Exception {
        if (((zzZ37) zzymm.zzYTt()).isList()) {
            zzZ38 zzz38ZzYLL = ((zzZ37) zzymm.zzYTt()).zzYLL();
            if (zzz38ZzYLL.getTrailingCharacter() == 1 || zzz38ZzYLL.getAlignment() != 0) {
                return true;
            }
        }
        boolean z = zzymm.zzYos() != null && zzymm.zzYos().zz5T();
        boolean z2 = false;
        for (int i : ((zzZ37) zzymm.zzYTt()).zzYLI().zzYKA()) {
            z2 = i != 0;
            if (z2) {
                break;
            }
        }
        boolean zZzYSN = zzymm.zzab().zza8().zzYSN();
        boolean z3 = zzymm.zza6().zzhk() && zzymm.zza7().zzZYM();
        zzYAU zzyau = (zzYAU) zzymm.zzZ9r().zzYo1();
        for (zzYAU zzyauZzZ9s = zzymm.zzZ9s(); zzyauZzZ9s != null && zzyauZzZ9s != zzyau; zzyauZzZ9s = (zzYAU) zzyauZzZ9s.zzYo1()) {
            if (zzyauZzZ9s.zzZo6() == 12803 && ((zzyauZzZ9s.zzY7r() != 5121 && z2) || ((zzY9U) zzyauZzZ9s).isAbsolute())) {
                return true;
            }
            if (zzyauZzZ9s.zzZo6() == 25604) {
                if (zzYJP.zzZ1(zzyauZzZ9s) == 4) {
                    return true;
                }
                zzY9X zzy9x = (zzY9X) zzyauZzZ9s;
                if (zzy9x.zzY53().zzYS8()) {
                    return true;
                }
                if (z3 && zzZ(zzy9x)) {
                    return true;
                }
            }
            if ((zzyauZzZ9s.zzZo6() == 0 && (zzyauZzZ9s instanceof zzYAH) && ((zzYAH) zzyauZzZ9s).getFieldType() == 83) || (zzyauZzZ9s instanceof zzYAD) || (zzyauZzZ9s instanceof zzYAQ) || zzyauZzZ9s.zzY6N().zzYKO().isVisible()) {
                return true;
            }
            if (zzymm.zza7().zzYMt() && zzZNV.zzBF(zzyauZzZ9s.zzZo6()) && zzyauZzZ9s.zzY73()) {
                return true;
            }
            if (z && zzyauZzZ9s.zzZo6() == 10754) {
                this.zzZER = true;
            }
            if (!this.zzZEQ && !zZzYSN) {
                this.zzZEQ = (zzYBO.zzV(zzyauZzZ9s.zzY6N()).length > 0) || (zzY42.zzjj(zzyauZzZ9s.zzYKY()) == 3);
            }
        }
        return zzY(zzymm);
    }
}
