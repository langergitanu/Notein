package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZWK {
    private static final zzZHW zzUR = new zzZHW(TranslateLanguage.FRENCH, "fr-BE", "fr-CA", "fr-FR", "fr-LU", "fr-MC", "fr-CH", "fy-NL", TranslateLanguage.GERMAN, "de-AT", "de-DE", "de-LI", "de-LU", "de-CH", TranslateLanguage.PORTUGUESE, "pt-BR", "pt-PT", TranslateLanguage.SPANISH, "es-AR", "es-BO", "es-CL", "es-CO", "es-CR", "es-DO", "es-EC", "es-SV", "es-GT", "es-HN", "es-MX", "es-NI", "es-PA", "es-PY", "es-PE", "es-PR", "es-ES", "es-ES_tradnl", "es-US", "es-UY", "es-VE", TranslateLanguage.DUTCH, "nl-NL", "nl-BE", "cs-CZ", "hr-HR", "pl-PL", "ro-RO", "eu-ES", "it-IT");
    private zzKP zz8N;

    private zzZWK(zzKP zzkp) {
        this.zz8N = zzkp;
    }

    private static zzKP zzSd(int i) {
        zzZP1 zzzp1ZzpZ;
        try {
            zzzp1ZzpZ = zzZP1.zzQQ(i);
        } catch (Exception unused) {
            zzzp1ZzpZ = zzZXR.zzpZ();
        }
        return zzWN(zzzp1ZzpZ.getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private StringBuilder zzT(long j, boolean z) {
        boolean z2;
        zzZWK zzzwk;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 3);
        int size = arrayListZzQ.size() - 1;
        while (size > 0) {
            int iIntValue = arrayListZzQ.get(size).intValue();
            if (iIntValue == 0) {
                z2 = z;
            } else if (iIntValue != 1 || this.zz8N.zzXM()) {
                boolean z3 = size < arrayListZzQ.size() - 1;
                if (this.zz8N.zzXL() && j == 1000) {
                    z2 = z;
                    zzzwk = this;
                } else {
                    boolean z4 = z;
                    zzZ(sb, iIntValue, true, z3, true, z4, arrayListZzQ, size);
                    zzzwk = this;
                    z2 = z4;
                }
                zzKP zzkp = zzzwk.zz8N;
                zzkp.zzZ(sb, zzkp.zzZ(size, z2, iIntValue, arrayListZzQ), zzzwk.zz8N.zzZ(z2, iIntValue, arrayListZzQ, size));
            }
            size--;
            z = z2;
        }
        boolean z5 = z;
        if (arrayListZzQ.get(0).intValue() != 0) {
            zzZ(sb, arrayListZzQ.get(0).intValue(), z5, arrayListZzQ.size() > 1, false, z5, arrayListZzQ, 0);
            return sb;
        }
        if (!z5) {
            this.zz8N.zzW(sb);
        }
        return sb;
    }

    public static String zzV(double d, int i) {
        StringBuilder sbZzY = zzY((long) d, true, false, i);
        sbZzY.append(ControlChar.SPACE_CHAR);
        zzZNH.zzU(sbZzY, zzSd(i).zzXG()).append(ControlChar.SPACE_CHAR);
        zzZNH.zzU(sbZzY, zzJB.zz6(zzAN.zzZG((d - r0) * 100.0d)));
        zzZNH.zzU(sbZzY, "/100");
        return sbZzY.toString();
    }

    private static zzKP zzWN(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new zzJA();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return new zzJ4();
            case 14:
            case 15:
            case 16:
                return new zz0K();
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return new zzZYS();
            case 39:
            case 40:
            case 41:
                return new zzOB();
            case 42:
                return new zzRI();
            case 43:
                return new zzS2();
            case 44:
                return new zz0O();
            case 45:
                return new zzZZA();
            case 46:
                return new zzYA();
            case 47:
                return new zzCV();
            default:
                return new zzL0();
        }
    }

    private static StringBuilder zzY(long j, boolean z, boolean z2, int i) {
        return zzZ(j, z, z2, new zzZWK(zzSd(i)));
    }

    public static String zzZ(long j, boolean z, boolean z2, int i) {
        return zzY(j, z, z2, i).toString();
    }

    public static String zzZs(double d) {
        return zzV(d, 0);
    }

    private static StringBuilder zzZ(long j, boolean z, boolean z2, zzZWK zzzwk) {
        StringBuilder sbZzT;
        if (j == 0) {
            sbZzT = new StringBuilder(zzzwk.zz8N.zzL(z));
        } else {
            sbZzT = zzzwk.zzT(j, z);
        }
        sbZzT.insert(0, zzzwk.zz8N.zzY(j, z));
        zzZNH.zzU(sbZzT, zzzwk.zz8N.zzX(j, z));
        if (!zzzwk.zz8N.zzIO() && !z2) {
            return sbZzT;
        }
        sbZzT.setCharAt(0, Character.toUpperCase(sbZzT.charAt(0)));
        return sbZzT;
    }

    private void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i2) {
        int i3 = i / 100;
        int i4 = i - (i3 * 100);
        if (i3 != 0) {
            this.zz8N.zzZ(sb, i3, z, i4 != 0, z2, z3, z4, arrayList, i2);
        }
        this.zz8N.zzZ(sb, i4, i3, z, i3 != 0 || z2, z3, z4, arrayList, i2);
    }
}
