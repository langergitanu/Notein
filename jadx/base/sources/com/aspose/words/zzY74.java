package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY74 {
    public boolean zzX71;
    public int zzX72;
    public int zzXWA;
    public int zzZGm;

    private zzY74(int i, int i2, int i3, boolean z) {
        this.zzXWA = i;
        this.zzZGm = i2;
        this.zzX72 = i3;
        this.zzX71 = z;
    }

    private static int zzD(int i, int i2, boolean z) {
        if (i <= 0) {
            return 0;
        }
        int iCeil = (((int) Math.ceil(((double) i2) / ((double) i))) * i) - i2;
        if (iCeil != 0) {
            return iCeil;
        }
        if (!z || i2 >= 0) {
            return i;
        }
        return 0;
    }

    public static zzY74 zzZ(zzZ55 zzz55, zzYAU zzyau, int i, int i2) throws Exception {
        boolean z = zzyau.zzY7r() == 5121;
        int iZz63 = zzyau.zz63();
        int i3 = i + iZz63;
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        boolean z2 = zzz37.zzYLI().zzYKw() && z;
        int iZzD = zzD(zzz55.zzab().zzZp0().zza7().zzYMO(), i3, zzz55.zza7().zzZYM());
        int iZzZ = zzZ(i3, z, z2, zzz37);
        int i4 = iZzZ < 0 ? -1 : zzz37.zzYLI().zzYKy()[iZzZ] - i3;
        int iZzYMa = ((zzYMM) zzz55.zza9()).zzYMa();
        if (zzz55.zzYQ3() && iZzYMa < 0 && (z || !zzyau.zzY7w())) {
            if (!z || !zzz55.zza7().getDoNotSuppressIndentation()) {
                iZzYMa += i2;
            }
            int iZzYM7 = ((((zzYMM) zzz55.zza9()).zzYM7() + iZz63) - iZzYMa) - i3;
            if (z2) {
                return new zzY74(Math.max(i4, iZzYM7), 0, 0, false);
            }
            if (iZzYM7 > 0 || (z && iZzYM7 == 0)) {
                zzZ3A zzz3aZza7 = zzz55.zza7();
                boolean z3 = zzz3aZza7.zzYMI() || (zzz37.isList() && zzz3aZza7.zzYMJ() && z);
                boolean z4 = iZzZ < 0;
                if (!z3 ? z4 || iZzYM7 < i4 : z4 && iZzYM7 < iZzD) {
                    return new zzY74(iZzYM7, 0, 0, false);
                }
            }
        }
        if (iZzZ >= 0) {
            return new zzY74(zzz37.zzYLI().zzYKy()[iZzZ] - i, z ? 0 : zzz37.zzYLI().zzYKA()[iZzZ], zzz37.zzYLI().zzYKz()[iZzZ], true);
        }
        return new zzY74(iZz63 + iZzD, 0, 0, false);
    }

    private static int zzZP(zzZ55 zzz55) throws Exception {
        return zzz55.zz5T() ? zzz55.zzZZJ().getWidth() - zzz55.getX() : zzz55.getRight();
    }

    public final boolean zzY0n() {
        return this.zzXWA == Integer.MAX_VALUE;
    }

    private static int zzZ(int i, boolean z, boolean z2, zzZ37 zzz37) {
        if (z2) {
            return zzz37.zzYLI().zzYKx();
        }
        if (zzz37.zzYLI().getCount() > 0 && zzz37.zzYLI().zzYKy()[0] >= i && z) {
            return 0;
        }
        for (int i2 = 0; i2 < zzz37.zzYLI().getCount(); i2++) {
            if (zzz37.zzYLI().zzYKy()[i2] > i && zzz37.zzYLI().zzYKA()[i2] != 4 && i2 != zzz37.zzYLI().zzYKx()) {
                return i2;
            }
        }
        return -1;
    }

    public static zzY74 zzZ(zzZ55 zzz55, zzY9T zzy9t, int i) throws Exception {
        int x;
        int iZz63;
        int alignment = zzy9t.getAlignment();
        if (alignment == 0) {
            x = zzz55.getX();
            iZz63 = 0;
        } else if (alignment == 1) {
            if (zzy9t.zzc1() == 0) {
                x = (zzz55.zzZZJ().getWidth() + zzz55.getX()) / 2;
                if (zzz55.zzYQ3() && ((zzYMM) zzz55.zza9()).zzYMa() > 0) {
                    x -= ((zzYMM) zzz55.zza9()).zzYMa() / 2;
                }
            } else {
                x = zzz55.zzZZJ().getWidth() / 2;
            }
            iZz63 = zzy9t.zz63();
        } else if (alignment == 2) {
            x = Math.min(zzZP(zzz55), zzz55.zzZZJ().getWidth());
            iZz63 = zzy9t.zz63() + zzy9t.zz62();
        } else {
            throw new IllegalStateException("Unexpected alignment value.");
        }
        int i2 = x - i;
        if (i2 < iZz63) {
            i2 = zzVE.zzT((zzYAU) zzz55.zz6x()) != zzy9t ? Integer.MAX_VALUE : 0;
        }
        return new zzY74(i2, zzy9t.getAlignment(), zzy9t.getLeader(), true);
    }
}
