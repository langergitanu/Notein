package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY76 {
    private boolean zzX74;
    private int zzX75;
    private zzY9U zzX76;
    private HashMap<zzY9U, Integer> zzX77 = new HashMap<>();
    private int zzX78;
    private int zzXbo;
    private zzZ55 zzYeg;
    private boolean zzZpO;

    private static int zzN(zzYAU zzyau, int i) throws Exception {
        if (zzY9R.zzmW(zzyau.zzZo6())) {
            while (true) {
                zzyau = zzyau.zzY6P();
                if (zzyau == null || zzyau.zzY7r() != 2048) {
                    break;
                }
                i -= zzyau.getWidth();
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzVm(int i, int i2) throws Exception {
        int iZzZ5B;
        int i3;
        int i4;
        boolean zZzZYM = this.zzYeg.zza7().zzZYM();
        if (zzY0v() && i < 0 && !zZzZYM) {
            return 0;
        }
        int iZzZ5B2 = (zzY0v() && zZzZYM) ? zzZ5B() : this.zzYeg.getWidth();
        if (((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYM4() <= 0) {
            zzY0v();
        }
        int i5 = this.zzX78 + i + i2;
        if (i5 <= iZzZ5B2) {
            return Math.max(i, 0);
        }
        if (zzY0u() >= iZzZ5B2) {
            if (zZzZYM) {
                if (zzZ5B() < zzY0u() && iZzZ5B2 >= (i4 = this.zzX78)) {
                    i = (iZzZ5B2 - i2) - i4;
                } else if (zzZ5B() < i5) {
                    iZzZ5B = zzZ5B() - i2;
                    i3 = this.zzX78;
                }
            }
            return i >= 0 ? Math.max((iZzZ5B2 - this.zzX78) - zzZ(new zzVE((zzYAU) this.zzX76.zzYo1(), null), iZzZ5B2 - this.zzX78), 0) : i;
        }
        iZzZ5B = iZzZ5B2 - i2;
        i3 = this.zzX78;
        i = iZzZ5B - i3;
        if (i >= 0) {
        }
    }

    private int zzY0u() {
        return this.zzX78 + this.zzX75;
    }

    private int zzZ5B() throws Exception {
        return this.zzYeg.getWidth() + ((zzYMM) this.zzYeg.zza9()).zzYM4();
    }

    private static boolean zzZQ(zzZ55 zzz55) throws Exception {
        return zzz55.zza7().zzYMl() && ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).isList() && zzz55.zzYQ3() && ((zzYMM) zzz55.zza9()).zzYMa() < 0 && ((zzYMM) zzz55.zza9()).zzYM7() < 0;
    }

    public final void reset() {
        this.zzYeg = null;
        this.zzX76 = null;
        this.zzX78 = 0;
        this.zzX75 = 0;
        this.zzXbo = 0;
    }

    public final int zzX(zzYAU zzyau, int i, int i2) throws Exception {
        int iZzVm;
        int iZzN = zzN(zzyau, i);
        int i3 = iZzN - this.zzX78;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.zzXbo;
        if (i4 != 1) {
            if (i4 == 2) {
                iZzVm = zzVm(this.zzX75 - i3, i3);
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("Unexpected tab stop alignment value.");
                }
                iZzVm = Math.max(0, zzZ(this.zzX76, zzyau, iZzN, i2));
            }
        } else if (!this.zzX76.isAbsolute() || this.zzX78 + this.zzX75 <= this.zzYeg.getWidth()) {
            iZzVm = zzVm((this.zzX76.zz62() / 2) + (this.zzX75 - (i3 / 2)), i3);
        } else {
            iZzVm = this.zzX75;
        }
        int iZz63 = this.zzX76.zz63() + this.zzX76.zz62();
        if (iZzVm < iZz63) {
            iZzVm = iZz63;
        }
        com.aspose.words.internal.zzSA.zzYy(1000);
        zzZ(this.zzX76, iZzVm);
        return this.zzX78 + iZzVm;
    }

    public final boolean zzY0v() throws Exception {
        return ((zzYMM) this.zzYeg.zza9()).zzYM4() != 0 && this.zzYeg.getWidth() <= zzY0u() && zzY0u() <= zzZ5B();
    }

    public final boolean zzY0w() {
        return this.zzX74;
    }

    public final int zzY0x() {
        return this.zzXbo;
    }

    public final int zzY0y() {
        return this.zzX75;
    }

    public final zzY9U zzY0z() {
        return this.zzX76;
    }

    public final int zzZ(zzZ55 zzz55, int i, zzY9U zzy9u, int i2) throws Exception {
        int width = zzz55.zz5T() ? zzz55.zzZZJ().getWidth() - zzz55.getRight() : zzz55.getX();
        int i3 = 0;
        zzY74 zzy74ZzZ = zzy9u.isAbsolute() ? zzY74.zzZ(zzz55, (zzY9T) zzy9u, width + i2) : zzY74.zzZ(zzz55, zzy9u, (width + i2) - i, (i == zzz55.zzYQ2() || zzZQ(zzz55)) ? 0 : i);
        this.zzX75 = Math.max(0, zzy74ZzZ.zzXWA);
        this.zzXbo = zzy74ZzZ.zzZGm;
        boolean z = zzy74ZzZ.zzX71;
        this.zzZpO = z;
        if (z) {
            zzy9u.setLeader(zzy74ZzZ.zzX72);
        }
        if (zzy74ZzZ.zzY0n()) {
            zzZ(zzy9u, 0);
            return Integer.MAX_VALUE;
        }
        this.zzYeg = zzz55;
        this.zzX78 = i2;
        int i4 = this.zzXbo;
        if (i4 != 0 && i4 != 6) {
            zzy9u.zzZZJ();
            zzy9u.zza9();
            this.zzX76 = zzy9u;
            return (!zzy9u.isAbsolute() || this.zzX78 + this.zzX75 <= zzz55.getWidth()) ? 0 : Integer.MAX_VALUE;
        }
        int iZz62 = this.zzX75 + zzy9u.zz62();
        if (zzy9u.zza7().getDoNotUseIndentAsNumberingTabStop() || !zzy9u.zzYRO()) {
            i3 = iZz62;
        } else {
            zzYAU zzyau = (zzYAU) zzy9u.zzYo0();
            while (true) {
                if (zzyau == null || zzyau.zza9() != zzy9u.zza9()) {
                    break;
                }
                if (!(zzyau instanceof zzYAT)) {
                    if (((zzYA5) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYA5.class)) == null || ((zzZ37) ((zzYMM) this.zzYeg.zza9()).zzYTt()).zzYMa() != 0) {
                        break;
                    }
                } else {
                    zzyau = (zzYAU) zzyau.zzYo0();
                }
            }
            i3 = iZz62;
        }
        zzZ(zzy9u, i3);
        return i3;
    }

    public final void zzZR(zzZ55 zzz55) throws Exception {
        for (zzY9U zzy9u : this.zzX77.keySet()) {
            if (zzy9u.zzY6X() && zzy9u.zzZZJ() == zzz55) {
                zzy9u.setContentWidth(this.zzX77.get(zzy9u).intValue());
            }
        }
        this.zzX77.clear();
    }

    public final boolean zzZVX() {
        return this.zzZpO;
    }

    public final int zzZ(zzY9U zzy9u) throws Exception {
        return this.zzX77.containsKey(zzy9u) ? this.zzX77.get(zzy9u).intValue() : zzy9u.getWidth();
    }

    private static int zzZ(zzVE zzve, zzYAU zzyau) throws Exception {
        zzyau.zzZo6();
        zzyau.zzY74();
        zzve.zz14();
        char cZzH5 = com.aspose.words.internal.zzJB.zzH5();
        char cZzH4 = com.aspose.words.internal.zzJB.zzH4();
        boolean z = zzY9R.zzmY(zzve.zz14().zzZo6()) && Character.isDigit(zzve.zz14().getText().charAt(0));
        int width = 0;
        int iZz11 = 0;
        while (zzve.zz14() != zzyau) {
            if (!zzY9R.zzmY(zzve.zz14().zzZo6())) {
                if (z) {
                    break;
                }
                width += zzve.zz14().zzZXS();
                if (!zzve.zz0X()) {
                    break;
                }
            } else {
                if (zzve.getCharacter() == cZzH5 || !(!z || Character.isDigit(zzve.getCharacter()) || zzve.getCharacter() == cZzH4)) {
                    return width + iZz11;
                }
                if (!z && Character.isDigit(zzve.getCharacter())) {
                    z = true;
                }
                zzve.zz14().zzZo6();
                iZz11 += zzve.zz11();
                if (zzve.zz12()) {
                    width += zzve.zz14().getWidth();
                    iZz11 = 0;
                }
                if (!zzve.moveNext()) {
                    return width;
                }
            }
        }
        return width;
    }

    private int zzZ(zzYAU zzyau, zzYAU zzyau2, int i, int i2) throws Exception {
        zzVE zzve = new zzVE((zzYAU) zzyau.zzYo1(), null);
        zzve.zz0Z();
        int iZzZ = zzZ(zzve, zzyau2);
        int i3 = this.zzX78;
        int i4 = i - i3;
        int i5 = this.zzX75;
        int i6 = (i5 + i4) - iZzZ;
        int i7 = i2 - i3;
        if (i6 <= i7) {
            return i5 - iZzZ;
        }
        boolean z = zzyau.zzZZJ().zzZZJ().zz60() == 16;
        if (this.zzX75 > i7 && !zzyau.zza7().zzZYM()) {
            if (z && zzyau.zzY7w()) {
                return ((this.zzX75 - iZzZ) - i6) + i7 + 4000;
            }
            return this.zzX75 - iZzZ;
        }
        if (i4 <= i7) {
            return ((this.zzX75 - iZzZ) + i7) - i6;
        }
        this.zzX74 = !zzyau.zzY7w();
        zzve.zzV((zzYAU) zzyau.zzYo1());
        int iZzZ2 = zzZ(zzve, i7);
        if (!z || iZzZ2 > 0) {
            return i7 - iZzZ2;
        }
        return 0;
    }

    private static int zzZ(zzVE zzve, int i) throws Exception {
        zzve.zz0Z();
        int i2 = 0;
        while (true) {
            int iZz11 = zzve.zz11() + i2;
            if (iZz11 > i) {
                return i2;
            }
            if (!zzve.moveNext()) {
                return iZz11;
            }
            i2 = iZz11;
        }
    }

    private void zzZ(zzY9U zzy9u, int i) {
        this.zzX77.put(zzy9u, Integer.valueOf(Math.max(0, (i - zzy9u.zz63()) - zzy9u.zz62())));
    }
}
