package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYKH extends zzYKF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("decimal", "decimal-leading-zero", "lower-latin", "lower-alpha", "lower-greek", "upper-latin", "upper-alpha", "upper-greek", "lower-roman", "upper-roman");
    private int zzXD8;
    private String zzZrW;

    public zzYKH(String str, int i) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZrW = str;
        this.zzXD8 = i;
    }

    public static int zzCU(String str) {
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str))) {
            case 1:
                return 22;
            case 2:
            case 3:
            case 4:
                return 4;
            case 5:
            case 6:
            case 7:
                return 3;
            case 8:
                return 2;
            case 9:
                return 1;
            default:
                return 0;
        }
    }

    public static String zzD(zzL4 zzl4) {
        if (zzl4.getValueType() == 0) {
            return ((zzOT) zzl4).getValue();
        }
        return null;
    }

    public static boolean zzU(zzL2 zzl2) {
        if (zzl2.getCount() % 2 != 1) {
            return false;
        }
        for (int i = 1; i < zzl2.getCount(); i += 2) {
            if (zzl2.zzMl(i).getValueType() != 7) {
                return false;
            }
        }
        return true;
    }

    public final int zzYms() {
        return this.zzXD8;
    }

    public final String zzZXw() {
        return this.zzZrW;
    }
}
