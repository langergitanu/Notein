package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKV {
    private static double zzS(zzPT zzpt) {
        if (zzpt == null) {
            return 0.0d;
        }
        double dZzW = zzL5.zzW(zzpt.zzZWj());
        if (com.aspose.words.internal.zzAN.zzL(dZzW, -1.7976931348623157E308d)) {
            return 0.0d;
        }
        return dZzW;
    }

    public static PreferredWidth zzT(zzMP zzmp) {
        if (zzmp.getCount() != 1) {
            return null;
        }
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        if (zzl4ZzZVx.getValueType() == 5) {
            double doubleValue = zzl4ZzZVx.getDoubleValue();
            if (doubleValue >= 0.0d) {
                return PreferredWidth.zzWm(PreferredWidth.zzWk(doubleValue));
            }
        } else {
            double dZzL = zzL5.zzL(zzl4ZzZVx);
            if (dZzL >= 0.0d) {
                return PreferredWidth.zzWl(PreferredWidth.zzWj(dZzL));
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static PreferredWidth zzV(zzPS zzps, boolean z) {
        PreferredWidth preferredWidthZzT;
        zzPT zzptZzSx = zzps.zzSx("min-width");
        if (zzptZzSx != null) {
            preferredWidthZzT = zzT(zzptZzSx.zzZWj());
            if (preferredWidthZzT.getType() == 2) {
                preferredWidthZzT = null;
            }
        }
        zzPT zzptZzSx2 = zzps.zzSx("width");
        if (zzptZzSx2 != null) {
            PreferredWidth preferredWidthZzT2 = zzT(zzptZzSx2.zzZWj());
            if (preferredWidthZzT2 == null || preferredWidthZzT == null || preferredWidthZzT.getType() != preferredWidthZzT2.getType() || preferredWidthZzT2.getValue() >= preferredWidthZzT.getValue()) {
                return preferredWidthZzT2;
            }
        } else if (!z) {
            return null;
        }
        return preferredWidthZzT;
    }

    public static void zzZ(zzPS zzps, Table table, zzRL zzrl, zzRL zzrl2) throws Exception {
        PreferredWidth preferredWidthZzT;
        zzPT zzptZzSx = zzps.zzSx("width");
        if (zzptZzSx == null || (preferredWidthZzT = zzT(zzptZzSx.zzZWj())) == null) {
            return;
        }
        if (preferredWidthZzT.isFixed() && preferredWidthZzT.zzYmC()) {
            double value = preferredWidthZzT.getValue();
            boolean bidi = table.getFirstRow().zzZYf().zzXXa().getBidi();
            preferredWidthZzT = PreferredWidth.zzWl(com.aspose.words.internal.zzAN.zzR((value - (zzZ(bidi ? table.getFirstRow().getFirstCell().getCellFormat().getBorders().getRight() : table.getFirstRow().getFirstCell().getCellFormat().getBorders().getLeft(), zzrl) / 2.0d)) - (zzZ(bidi ? table.getFirstRow().getLastCell().getCellFormat().getBorders().getLeft() : table.getFirstRow().getLastCell().getCellFormat().getBorders().getRight(), zzrl2) / 2.0d), 0.0d, 1080.0d));
        }
        table.setPreferredWidth(preferredWidthZzT);
    }

    public static void zzZ(CellFormat cellFormat, zzPS zzps, zzPS zzps2, zzPS[] zzpsArr, zzQQ zzqq, boolean z, boolean z2, boolean z3) throws Exception {
        if (z && z2) {
            zzZ(zzps, zzqq, cellFormat);
        }
        PreferredWidth preferredWidthZzZ = zzZ(zzps, zzps2, zzpsArr, z3);
        if (preferredWidthZzZ == null) {
            return;
        }
        if (preferredWidthZzZ.getType() == 2) {
            cellFormat.setPreferredWidth(preferredWidthZzZ);
            return;
        }
        double value = preferredWidthZzZ.getValue();
        if (z) {
            value = (zzZ(cellFormat.getBorders().getRight(), zzqq.zzZX6()) / 2.0d) + (zzZ(cellFormat.getBorders().getLeft(), zzqq.zzZX7()) / 2.0d) + value + zzS(zzps.zzSx("padding-left")) + zzS(zzps.zzSx("padding-right"));
        }
        if (value > 0.0d) {
            cellFormat.setPreferredWidth(PreferredWidth.zzWl(Math.min(value, 1080.0d)));
        }
    }

    private static PreferredWidth zzZ(zzPS zzps, zzPS zzps2, zzPS[] zzpsArr, boolean z) {
        PreferredWidth preferredWidthZzV = zzV(zzps, z);
        if (preferredWidthZzV != null) {
            return preferredWidthZzV;
        }
        PreferredWidth preferredWidthZzV2 = zzV(zzps2, z);
        if (preferredWidthZzV2 == null || zzpsArr == null) {
            return preferredWidthZzV2;
        }
        preferredWidthZzV2.getType();
        int iZzYmE = preferredWidthZzV2.zzYmE();
        for (zzPS zzps3 : zzpsArr) {
            PreferredWidth preferredWidthZzV3 = zzV(zzps3, z);
            if (preferredWidthZzV3 == null || preferredWidthZzV3.getType() != preferredWidthZzV2.getType()) {
                preferredWidthZzV2 = null;
                break;
            }
            iZzYmE += preferredWidthZzV3.zzYmE();
        }
        return preferredWidthZzV2 != null ? PreferredWidth.zzW6(preferredWidthZzV2.getType(), iZzYmE) : preferredWidthZzV2;
    }

    private static void zzZ(zzPS zzps, zzQQ zzqq, CellFormat cellFormat) throws Exception {
        if (cellFormat.getRightPadding() > 0.0d && zzps.zzSx("-aw-padding-right") == null) {
            cellFormat.setRightPadding((zzZ(cellFormat.getBorders().getRight(), zzqq.zzZX6()) / 2.0d) + cellFormat.getRightPadding());
        }
        if (cellFormat.getLeftPadding() <= 0.0d || zzps.zzSx("-aw-padding-left") != null) {
            return;
        }
        cellFormat.setLeftPadding((zzZ(cellFormat.getBorders().getLeft(), zzqq.zzZX7()) / 2.0d) + cellFormat.getLeftPadding());
    }

    private static double zzZ(Border border, zzRL zzrl) {
        if (border == null || !border.isVisible()) {
            return 0.0d;
        }
        if (zzrl != null) {
            return zzrl.zzZXj();
        }
        return border.zz8S();
    }
}
