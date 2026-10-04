package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTF {
    public static zzYM6 zzE8(int i) {
        int i2 = (57344 & i) >> 13;
        return (i2 == 5 || i2 == 6) ? new zzYM6((65280 & i) >> 8, i & 255) : new zzYM6(i2, i & 8191);
    }

    public static void zzX(zzYC3 zzyc3) {
        int iIntValue;
        Object objZzZ;
        zzYM6[] zzym6Arr;
        Object objZzPk = zzyc3.zzPk(StyleIdentifier.LIST_TABLE_3);
        if (objZzPk != null) {
            iIntValue = ((Integer) objZzPk).intValue();
            zzyc3.remove(StyleIdentifier.LIST_TABLE_3);
        } else {
            iIntValue = 1;
        }
        zzYM5[] zzym5Arr = (zzYM5[]) zzyc3.zzPk(StyleIdentifier.LIST_TABLE_4);
        if (zzym5Arr == null || zzym5Arr.length == 0) {
            return;
        }
        zzYM6[] zzym6Arr2 = (zzYM6[]) zzyc3.zzPk(StyleIdentifier.LIST_TABLE_5_DARK);
        if (zzym6Arr2 == null || zzym6Arr2.length <= 0) {
            if (((Integer) zzyc3.zzPk(EditingLanguage.LULE_SAMI_NORWAY)).intValue() == 19) {
                objZzZ = zzZio();
            } else if (iIntValue != 0) {
                if (iIntValue == 1) {
                    zzym6Arr = new zzYM6[]{new zzYM6(2, 0), new zzYM6(0, zzym5Arr.length - 1), new zzYM6(3, 1), new zzYM6(4, 0)};
                } else if (iIntValue == 2) {
                    zzym6Arr = new zzYM6[]{new zzYM6(2, 0), new zzYM6(1, (zzym5Arr.length - 1) / 3), new zzYM6(4, 0)};
                } else if (iIntValue != 3) {
                    objZzZ = zzZ(zzym5Arr);
                } else {
                    zzym6Arr = new zzYM6[]{new zzYM6(2, 0), new zzYM6(1, (zzym5Arr.length - 1) / 3), new zzYM6(3, 1), new zzYM6(4, 0)};
                }
                objZzZ = zzym6Arr;
            } else {
                objZzZ = zzZ(zzym5Arr);
            }
            zzyc3.zzQ(StyleIdentifier.LIST_TABLE_5_DARK, objZzZ);
        }
    }

    private static zzYM6[] zzZ(zzYM5[] zzym5Arr) {
        return new zzYM6[]{new zzYM6(2, 0), new zzYM6(0, zzym5Arr.length - 1), new zzYM6(4, 0)};
    }

    private static zzYM6[] zzZio() {
        return (zzYM6[]) zzYBW.zzm2(19).zzPk(StyleIdentifier.LIST_TABLE_5_DARK);
    }

    public static int zzZ(zzYM6 zzym6) {
        int iZzYnK;
        int iZzYnL;
        if (zzym6.zzYnL() >= 160) {
            iZzYnK = zzym6.zzYnK();
            iZzYnL = zzym6.zzYnL() << 8;
        } else {
            iZzYnK = zzym6.zzYnK();
            iZzYnL = zzym6.zzYnL() << 13;
        }
        return iZzYnL | iZzYnK;
    }
}
