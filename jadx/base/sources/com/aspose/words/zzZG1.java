package com.aspose.words;

import android.os.Bundle;
import com.aspose.words.internal.zzD4;
import com.aspose.words.net.System.OverflowException;

/* JADX INFO: loaded from: classes6.dex */
final class zzZG1 extends zzZGR {
    private zzZG1(zzZGO zzzgo, int i, String str, String str2, com.aspose.words.internal.zzD4 zzd4, com.aspose.words.internal.zzD4 zzd42) {
        super(zzzgo, i, str);
        zzzq(1);
        setNumberFormat(str2);
        zzD4.zzZ zzzZzCP = zzd4.zzCP();
        while (zzzZzCP.moveNext()) {
            zzWY(zzzZzCP.zzCM(), zzzZzCP.zzCL());
        }
        zzD4.zzZ zzzZzCP2 = zzd42.zzCP();
        while (zzzZzCP2.moveNext()) {
            zzWX(zzzZzCP2.zzCM(), zzzZzCP2.zzCL());
        }
    }

    private static int zzKq(String str) {
        try {
            return com.aspose.words.internal.zzZQB.zz2(str);
        } catch (OverflowException | NumberFormatException unused) {
            return 1;
        }
    }

    private static String[] zzKr(String str) {
        return com.aspose.words.internal.zzZKN.zzY(str, new char[]{ControlChar.SPACE_CHAR}, com.aspose.words.internal.zzZOE.REMOVE_EMPTY_ENTRIES$77a9e2fd);
    }

    private static String zzKs(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 9; i++) {
            com.aspose.words.internal.zzZNH.zzZ(sb, zzZDY.zzyG(i), com.aspose.words.internal.zzZKN.zzS((char) i, 1));
        }
        return sb.toString();
    }

    public static zzZG1 zzY(String str, String str2, String str3, int i) {
        zzZGO zzzgo = new zzZGO(i);
        String strZzKs = zzKs(str);
        com.aspose.words.internal.zzD4 zzd4ZzZ = zzZ(zzKr(str3), strZzKs, zzzgo.getListLevelNumber());
        com.aspose.words.internal.zzD4 zzd4ZzZ2 = zzZ(zzKr(str2), strZzKs, zzd4ZzZ);
        return new zzZG1(zzzgo, 0, zzZ(strZzKs, zzd4ZzZ, zzd4ZzZ2), strZzKs, zzd4ZzZ, zzd4ZzZ2);
    }

    public static zzZG1 zzZ(zzZYY zzzyy, String str, int i) {
        zzzyy.zzh(1, false);
        int iZzZUH = zzzyy.zzZUH();
        zzzyy.zzh(0, false);
        if (iZzZUH == 0) {
            return null;
        }
        zzZGO zzzgo = new zzZGO(i);
        int listLevelNumber = zzzgo.getListLevelNumber() + 1;
        int iMax = Math.max(0, iZzZUH - listLevelNumber);
        int iMax2 = Math.max(0, listLevelNumber - iZzZUH);
        zzzyy.zzh(1, false);
        zzZLL zzzllZzYd = zzzyy.zzYd(iMax, iMax2);
        zzzyy.zzh(0, false);
        return new zzZG1(zzzgo, 2, str, zzzllZzYd.getNumberFormat(), zzzllZzYd.zzZ5g(), zzzllZzYd.zzZ5h());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [int, java.lang.String] */
    public static zzZG1 zzc(int i, int i2, int i3) {
        zzZGO zzzgo = new zzZGO(i);
        ?? r3 = Bundle.getInt(zzYTW.zzM(i2, i3, true));
        String str = com.aspose.words.internal.zzZKN.zzS((char) zzzgo.getListLevelNumber(), 1) + ".";
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        zzd4.add(zzzgo.getListLevelNumber(), i3);
        com.aspose.words.internal.zzD4 zzd42 = new com.aspose.words.internal.zzD4();
        zzd42.add(zzzgo.getListLevelNumber(), i2);
        return new zzZG1(zzzgo, 1, r3, str, zzd4, zzd42);
    }

    @Override // com.aspose.words.zzZGR
    public final void zzZ(zzZGB zzzgb) {
        zzZGR.zzN(zzzgb.zzzf(zzZ1u().getListLevelNumber()).getListLevel().zzZYh());
    }

    private static com.aspose.words.internal.zzD4 zzZ(String[] strArr, String str, int i) {
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        int i2 = 0;
        for (int i3 = 0; i3 < 9; i3++) {
            if (str.indexOf((char) i3) != -1 || i3 == i) {
                if (i2 < strArr.length) {
                    zzd4.add(i3, zzZXP.zzNm(strArr[i2]));
                } else {
                    zzd4.add(i3, 0);
                }
                i2++;
            }
        }
        return zzd4;
    }

    private static com.aspose.words.internal.zzD4 zzZ(String[] strArr, String str, com.aspose.words.internal.zzD4 zzd4) {
        com.aspose.words.internal.zzD4 zzd42 = new com.aspose.words.internal.zzD4();
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (str.indexOf((char) i2) != -1 && zzZ4D.zzxd(zzd4.get(i2))) {
                if (i < strArr.length) {
                    zzd42.add(i2, zzKq(strArr[i]));
                } else {
                    zzd42.add(i2, 1);
                }
                i++;
            }
        }
        return zzd42;
    }

    private static String zzZ(String str, com.aspose.words.internal.zzD4 zzd4, com.aspose.words.internal.zzD4 zzd42) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < 9; i++) {
            char c = (char) i;
            if (str.indexOf(c) != -1) {
                com.aspose.words.internal.zzZNH.zzZ(sb, Character.toString(c), zzYTW.zzM(zzd42.get(i), zzd4.get(i), true));
            }
        }
        return sb.toString();
    }
}
