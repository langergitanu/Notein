package com.aspose.words;

import com.aspose.words.ref.RefInt;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6Z {
    private zzZL5 zzX6R;

    public zzY6Z(zzY6N zzy6n) throws Exception {
        this.zzX6R = new zzZL5(zzy6n);
    }

    private static void zzV(zzZL5 zzzl5) {
        int columnsCount = zzzl5.getColumnsCount();
        for (int i = 0; i < columnsCount; i++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
            zzzl7ZzAm.zzYug = zzzl7ZzAm.zzYus;
            zzzl7ZzAm.zzYui = zzzl7ZzAm.zzYuq;
            zzzl7ZzAm.zzYuh = zzzl7ZzAm.zzYup;
        }
    }

    private static void zzW(zzZL5 zzzl5) throws Exception {
        new zzY6C().zzZ(zzzl5, zzzl5.zzYud, zzzl5.zzX2(zzzl5.zzYuq, zzzl5.zzYup));
        for (int i = 0; i < zzzl5.zzZ5a(); i++) {
            for (int i2 = 0; i2 < zzzl5.getColumnsCount(); i2++) {
                zzZL9 zzzl9ZzX3 = zzzl5.zzX3(i, -i2);
                if (zzzl9ZzX3 != null) {
                    zzzl9ZzX3.zzCu = Math.min(zzZ(zzzl5, zzzl9ZzX3), 31680);
                }
            }
        }
    }

    private static void zzX(zzZL5 zzzl5) {
        int i = zzzl5.zzYup;
        zzzl5.zzYup = 0;
        zzzl5.zzYuq = 0;
        for (int i2 = 0; i2 < zzzl5.getColumnsCount(); i2++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i2);
            zzzl5.zzYuq += zzzl7ZzAm.zzYui;
            zzzl5.zzYup += zzzl7ZzAm.zzYuh;
        }
        int iMax = Math.max(zzzl5.zzYup, i);
        int i3 = zzzl5.zzYuf;
        zzzl5.zzYuq += i3;
        zzzl5.zzYup = iMax + i3;
        PreferredWidth preferredWidth = zzzl5.zzYus;
        if (preferredWidth.isFixed() && preferredWidth.zzYmC()) {
            int iMax2 = Math.max(zzzl5.zzYuq, preferredWidth.zzYmE());
            zzzl5.zzYuq = iMax2;
            zzzl5.zzYup = iMax2;
        }
    }

    private static void zzY(zzZL5 zzzl5) {
        zzZL5 zzzl52;
        zzV(zzzl5);
        Collections.sort(zzzl5.zzYue);
        zzV3 zzv3 = new zzV3();
        int i = 0;
        int i2 = 0;
        while (i < zzzl5.zzYue.size()) {
            zzZL9 zzzl9 = zzzl5.zzYue.get(i);
            if (zzzl9.zzYus.zzYmE() == 0) {
                zzzl9.zzYus = PreferredWidth.AUTO;
            }
            int i3 = zzzl9.zzYuu;
            int i4 = i3 + zzzl9.zzYut;
            zzZ(zzzl5, zzzl9, zzv3);
            if (zzzl9.zzYus.zzYmB()) {
                RefInt refInt = new RefInt(i2);
                zzZL5 zzzl53 = zzzl5;
                zzZ(zzzl53, zzzl9, i3, i4, zzv3.zzZvL, zzv3.zzZvN, zzv3.zzZvH, zzv3.zzZvJ, refInt);
                i4 = i4;
                i3 = i3;
                zzzl52 = zzzl53;
                i2 = refInt.get();
            } else {
                zzzl52 = zzzl5;
            }
            if (zzv3.zzZvI) {
                zzZ(zzzl52, i3, i4, zzv3.zzZvO, zzv3.zzZvM, zzv3.zzZvK);
            } else if (zzv3.zzZvG) {
                zzZ(zzzl52, i3, i4, zzv3.zzZvO, zzv3.zzZvN, zzv3.zzZvM, zzv3.zzZvK);
            }
            if (zzzl9.zzYus.zzYmB()) {
                while (i3 < i4) {
                    zzzl52.zzAm(i3).zzZ5b();
                    i3++;
                }
            } else if (zzv3.zzZvL > zzv3.zzZvN) {
                while (zzv3.zzZvN >= 0 && i3 < i4) {
                    zzZL7 zzzl7ZzAm = zzzl52.zzAm(i3);
                    int i5 = zzzl7ZzAm.zzYuh;
                    int i6 = zzv3.zzZvN;
                    int iMax = Math.max(i5, (int) (i6 != 0 ? (zzv3.zzZvL * i5) / i6 : zzv3.zzZvL));
                    zzv3.zzZvN -= zzzl7ZzAm.zzYuh;
                    zzv3.zzZvL -= iMax;
                    zzzl7ZzAm.zzYuh = iMax;
                    i3++;
                }
            }
            i++;
            zzzl5 = zzzl52;
        }
        zzzl5.zzYup = Math.min(i2, 31680);
    }

    private static void zzZ(zzZL5 zzzl5) {
        zzzl5.zzYue = new ArrayList<>();
        boolean z = true;
        for (int i = 0; i < zzzl5.getColumnsCount(); i++) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
            zzZL9 zzzl9 = null;
            zzZL9 zzzl92 = null;
            for (int i2 = 0; i2 < zzzl5.zzZ5a(); i2++) {
                zzZL9 zzzl9ZzX3 = zzzl5.zzX3(i2, -i);
                if (zzzl9ZzX3 != null && !zzzl9ZzX3.zzYur) {
                    zzzl7ZzAm.zzYuq = Math.max(zzzl7ZzAm.zzYuq, 20);
                    zzzl7ZzAm.zzYup = Math.max(zzzl7ZzAm.zzYup, 20);
                    if (1 >= zzzl9ZzX3.zzYut) {
                        zzzl7ZzAm.zzYuq = Math.max(zzzl9ZzX3.zzYuq, zzzl7ZzAm.zzYuq);
                        int i3 = zzzl9ZzX3.zzYup;
                        if (i3 > zzzl7ZzAm.zzYup) {
                            zzzl7ZzAm.zzYup = i3;
                            zzzl92 = zzzl9ZzX3;
                        }
                        PreferredWidth preferredWidthZzpK = zzzl9ZzX3.zzYus;
                        if (preferredWidthZzpK.zzYmE() > 31680) {
                            preferredWidthZzpK = PreferredWidth.zzpK(31680);
                        }
                        if (preferredWidthZzpK.zzYmE() < 0) {
                            preferredWidthZzpK = PreferredWidth.AUTO;
                        }
                        int type = preferredWidthZzpK.getType();
                        if (type == 2) {
                            zzzl5.zzYud = true;
                            if (preferredWidthZzpK.zzYmE() > 0 && (!zzzl7ZzAm.zzYus.zzYmB() || preferredWidthZzpK.zzYmE() > zzzl7ZzAm.zzYus.zzYmE())) {
                                zzzl7ZzAm.zzYus = preferredWidthZzpK;
                            }
                        } else if (type == 3 && preferredWidthZzpK.zzYmE() > 0 && !zzzl7ZzAm.zzYus.zzYmB()) {
                            int iMax = Math.max(preferredWidthZzpK.zzYmE(), Math.max(zzzl9ZzX3.zzYun / 2, zzzl9ZzX3.zzYul) + Math.max(zzzl9ZzX3.zzYuo / 2, zzzl9ZzX3.zzYum));
                            if (!zzzl7ZzAm.zzYus.isFixed() || iMax > zzzl7ZzAm.zzYus.zzYmE() || (iMax == zzzl7ZzAm.zzYus.zzYmE() && zzzl92 == zzzl9ZzX3)) {
                                zzzl7ZzAm.zzYus = PreferredWidth.zzpK(iMax);
                                zzzl9 = zzzl9ZzX3;
                            }
                        }
                    } else {
                        com.aspose.words.internal.zzZQG.zzZ(zzzl5.zzYue, zzzl9ZzX3);
                    }
                }
            }
            if (zzzl7ZzAm.zzYus.isFixed() && zzzl7ZzAm.zzYus.zzYmE() < zzzl7ZzAm.zzYup && zzzl9 != zzzl92) {
                zzzl7ZzAm.zzYus = PreferredWidth.AUTO;
            }
            zzzl7ZzAm.zzYup = Math.max(zzzl7ZzAm.zzYup, zzzl7ZzAm.zzYuq);
            if (zzzl7ZzAm.zzYus.isFixed() && zzzl7ZzAm.zzYus.zzYmE() > zzzl7ZzAm.zzYup) {
                zzzl7ZzAm.zzYup = zzzl7ZzAm.zzYus.zzYmE();
            }
            if (!zzzl7ZzAm.zzYus.isFixed() || zzzl7ZzAm.zzYus.zzYmE() <= 0) {
                z = false;
            }
        }
        if (z) {
            for (int i4 = 0; i4 < zzzl5.getColumnsCount(); i4++) {
                zzZL7 zzzl7ZzAm2 = zzzl5.zzAm(i4);
                int iMax2 = Math.max(zzzl7ZzAm2.zzYup, zzzl7ZzAm2.zzYus.zzYmD());
                zzzl7ZzAm2.zzYup = iMax2;
                zzzl7ZzAm2.zzYup = Math.max(iMax2, zzzl7ZzAm2.zzYuq);
            }
        }
    }

    public final int getColumnsCount() {
        return this.zzX6R.getColumnsCount();
    }

    public final int getMaxWidth() {
        return this.zzX6R.zzYup;
    }

    public final int getMinWidth() {
        return this.zzX6R.zzYuq;
    }

    public final zzZL7 zzAm(int i) {
        return this.zzX6R.zzAm(i);
    }

    public final void zzXZQ() {
        zzZ(this.zzX6R);
        zzY(this.zzX6R);
        zzX(this.zzX6R);
    }

    public final void zzXZR() throws Exception {
        zzZ(this.zzX6R);
        zzY(this.zzX6R);
        zzX(this.zzX6R);
        zzW(this.zzX6R);
    }

    private static int zzZ(zzZL5 zzzl5, zzZL9 zzzl9) {
        if (1 >= zzzl9.zzYut) {
            return zzzl5.zzAm(zzzl9.zzYuu).zzCu;
        }
        int i = 0;
        for (int i2 = 0; i2 < zzzl9.zzYut; i2++) {
            i += zzzl5.zzAm(zzzl9.zzYuu + i2).zzCu;
        }
        return i;
    }

    private static void zzZ(zzZL5 zzzl5, int i, int i2, int i3, int i4, int i5) {
        if (i4 > i3) {
            while (i5 > 0 && i < i2) {
                zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
                int iMax = Math.max(zzzl7ZzAm.zzYui, (zzzl7ZzAm.zzYus.zzYmE() * i4) / i5);
                i5 -= zzzl7ZzAm.zzYus.zzYmE();
                i4 -= iMax;
                zzzl7ZzAm.zzYui = iMax;
                i++;
            }
        }
    }

    private static void zzZ(zzZL5 zzzl5, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i5 > i3) {
            for (int i7 = i; i4 >= 0 && i7 < i2; i7++) {
                zzZL7 zzzl7ZzAm = zzzl5.zzAm(i7);
                if (zzzl7ZzAm.zzYus.isFixed()) {
                    if (i6 > i5) {
                        break;
                    }
                    int iMax = Math.max(zzzl7ZzAm.zzYui, zzzl7ZzAm.zzYus.zzYmE());
                    i6 -= zzzl7ZzAm.zzYus.zzYmE();
                    i3 -= zzzl7ZzAm.zzYui;
                    i4 -= zzzl7ZzAm.zzYuh;
                    i5 -= iMax;
                    zzzl7ZzAm.zzYui = iMax;
                }
            }
            while (i < i2 && i4 >= 0 && i3 < i5) {
                zzZL7 zzzl7ZzAm2 = zzzl5.zzAm(i);
                if (!zzzl7ZzAm2.zzYus.isFixed()) {
                    if (i5 < i6) {
                        return;
                    }
                    int iMin = Math.min((i5 - i3) + zzzl7ZzAm2.zzYui, Math.max(zzzl7ZzAm2.zzYui, (int) (i4 != 0 ? (i5 * zzzl7ZzAm2.zzYuh) / i4 : i5)));
                    i4 -= zzzl7ZzAm2.zzYuh;
                    i3 -= zzzl7ZzAm2.zzYui;
                    i5 -= iMin;
                    zzzl7ZzAm2.zzYui = iMin;
                }
                i++;
            }
        }
    }

    private static void zzZ(zzZL5 zzzl5, zzZL9 zzzl9, int i, int i2, int i3, int i4, boolean z, int i5, RefInt refInt) {
        if (i5 <= zzzl9.zzYus.zzYmE() && !z) {
            refInt.set(Math.max(refInt.get(), (int) Math.ceil(((Math.max(i4, i3) * 100.0f) * 50.0f) / zzzl9.zzYus.zzYmE())));
            int iZzYmE = zzzl9.zzYus.zzYmE() - i5;
            int i6 = 0;
            for (int i7 = i; i7 < i2; i7++) {
                zzZL7 zzzl7ZzAm = zzzl5.zzAm(i7);
                if (!zzzl7ZzAm.zzYug.zzYmB()) {
                    i6 += zzzl7ZzAm.zzYuh;
                }
            }
            while (i < i2 && i6 > 0) {
                zzZL7 zzzl7ZzAm2 = zzzl5.zzAm(i);
                if (!zzzl7ZzAm2.zzYug.zzYmB()) {
                    int i8 = zzzl7ZzAm2.zzYuh;
                    int i9 = (int) ((iZzYmE * i8) / i6);
                    i6 -= i8;
                    iZzYmE -= i9;
                    if (i9 > 0) {
                        zzzl7ZzAm2.zzYug = PreferredWidth.zzW6(2, i9);
                    } else {
                        zzzl7ZzAm2.zzYug = PreferredWidth.AUTO;
                    }
                }
                i++;
            }
            return;
        }
        zzzl9.zzYus = PreferredWidth.AUTO;
    }

    private static void zzZ(zzZL5 zzzl5, zzZL9 zzzl9, zzV3 zzv3) {
        zzv3.reset();
        zzv3.zzZvM = zzzl9.zzYuq;
        zzv3.zzZvL = zzzl9.zzYup;
        int columnsCount = zzzl5.getColumnsCount();
        int i = zzzl9.zzYuu;
        int i2 = zzzl9.zzYut;
        while (i < columnsCount && i2 > 0) {
            zzZL7 zzzl7ZzAm = zzzl5.zzAm(i);
            int type = zzzl7ZzAm.zzYus.getType();
            if (type == 1) {
                zzv3.zzZvG = true;
            } else {
                if (type == 2) {
                    zzv3.zzZvJ = zzzl7ZzAm.zzYus.zzYmE() + zzv3.zzZvJ;
                    zzv3.zzZvI = false;
                } else if (type == 3) {
                    if (zzzl7ZzAm.zzYus.zzYmC()) {
                        zzv3.zzZvK = zzzl7ZzAm.zzYus.zzYmE() + zzv3.zzZvK;
                        zzv3.zzZvH = false;
                    } else {
                        zzZ(zzzl7ZzAm, zzv3);
                    }
                }
                i2--;
                zzv3.zzZvO += zzzl7ZzAm.zzYui;
                zzv3.zzZvN += zzzl7ZzAm.zzYuh;
                i++;
                zzv3.zzZvM = zzv3.zzZvM;
                zzv3.zzZvL = zzv3.zzZvL;
            }
            zzZ(zzzl7ZzAm, zzv3);
            i2--;
            zzv3.zzZvO += zzzl7ZzAm.zzYui;
            zzv3.zzZvN += zzzl7ZzAm.zzYuh;
            i++;
            zzv3.zzZvM = zzv3.zzZvM;
            zzv3.zzZvL = zzv3.zzZvL;
        }
    }

    private static void zzZ(zzZL7 zzzl7, zzV3 zzv3) {
        if (!zzzl7.zzYug.zzYmB()) {
            zzzl7.zzYug = PreferredWidth.AUTO;
            zzv3.zzZvH = false;
        } else {
            zzv3.zzZvJ = zzzl7.zzYug.zzYmE() + zzv3.zzZvJ;
        }
        zzv3.zzZvI = false;
    }
}
