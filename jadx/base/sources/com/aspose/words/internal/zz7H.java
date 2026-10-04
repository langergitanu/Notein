package com.aspose.words.internal;

import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7H {
    private static String[][] zznS = {new String[]{"", ContextChain.TAG_INFRA, "ii", "iii", "iv", "v", TranslateLanguage.VIETNAMESE, "vii", "viii", "ix"}, new String[]{"", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc"}, new String[]{"", "c", "cc", "ccc", "cd", "d", AzureActiveDirectorySlice.DC_PARAMETER, "dcc", "dccc", "cm"}};

    private static String zzK(long j, int i) {
        return zzZKN.zzZ(zzL(j, i), new zzZP1(i));
    }

    private static String zzL(long j, int i) {
        return i != 1032 ? zzY(j, zzUx(i)) : zzIV.zz0(j);
    }

    private static String zzM(long j, int i) {
        if (j <= 0) {
            return "";
        }
        String str = i == 50 ? "أبتثجحخدذرزسشصضطظعغفقكلمنهوي" : "أبجدهوزحطيكلمنسعفصقرشتثخذضغظ";
        int iZzZv = zzZv(j) - 1;
        return zzZKN.zzS(str.charAt(iZzZv % str.length()), (iZzZv / str.length()) + 1);
    }

    private static String zzUx(int i) {
        return i != 30 ? i != 1049 ? i != 1053 ? i != 1055 ? "abcdefghijklmnopqrstuvwxyz" : "abcçdefgğhıijklmnoöprsştuüvyz" : "abcdefghijklmnopqrstuvwxyzåäö" : "абвгдежзиклмнопрстуфхцчшщыэюя" : "กขคงจฉชซฌญฎฏฐฑฒณดตถทธนบปผฝพฟภมยรลวศษสหฬอฮ";
    }

    public static String zzUy(int i) {
        if (i < 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("FXSHRXX");
        int i2 = 7;
        while (i >= 0) {
            i2--;
            sb.setCharAt(i2, (char) ((i % 26) + 65));
            i = (i / 26) - 1;
        }
        return sb.substring(i2, (7 - i2) + i2);
    }

    public static String zzY(long j, int i, boolean z, int i2) {
        return i != 6 ? zzZ(j, i, z, i2) : zz6Y.zzJ(j, i2);
    }

    public static int zzYg(String str) {
        if (!zzZYD.zzXk(str) || str.length() > 7) {
            return -1;
        }
        long jZzl = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            jZzl = (jZzl + ((long) (zzZYD.zzl(str.charAt(i)) + 1))) * 26;
        }
        long jZzl2 = jZzl + ((long) zzZYD.zzl(str.charAt(str.length() - 1)));
        if (jZzl2 > 2147483647L) {
            return -1;
        }
        return (int) jZzl2;
    }

    private static String zzZ(long j, int i, int i2) {
        long j2 = i;
        long j3 = (j - 1) + j2;
        return (j3 < j2 || j3 > ((long) i2)) ? Long.toString(j) : Character.toString((char) j3);
    }

    private static String zzZn(long j) {
        return zzZ(j, 12832, 12841);
    }

    private static String zzZo(long j) {
        return zzZ(j, 9332, 9351);
    }

    private static String zzZp(long j) {
        return zzZ(j, 9352, 9371);
    }

    private static String zzZq(long j) {
        return zzZ(j, 9312, 9331);
    }

    private static String zzZr(long j) {
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        StringBuilder sb = new StringBuilder();
        for (int size = arrayListZzQ.size() - 1; size >= 0; size--) {
            sb.append((char) (arrayListZzQ.get(size).intValue() + 65296));
        }
        return sb.toString();
    }

    private static String zzZs(long j) {
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 3);
        StringBuilder sb = new StringBuilder();
        if (arrayListZzQ.size() > 1) {
            for (int i = 0; i < arrayListZzQ.get(1).intValue(); i++) {
                sb.append('m');
            }
        }
        ArrayList<Integer> arrayListZzQ2 = zzIU.zzQ(arrayListZzQ.get(0).intValue(), 1);
        for (int size = arrayListZzQ2.size() - 1; size >= 0; size--) {
            zzZNH.zzU(sb, zznS[size][arrayListZzQ2.get(size).intValue()]);
        }
        return sb.toString();
    }

    private static String zzZt(long j) {
        return (j < -2147483648L || j > 2147483647L) ? zzJB.zz2(j) : zzJB.zzWy((int) j);
    }

    private static String zzZu(long j) {
        return zzZKN.format("- {0} -", Long.valueOf(j));
    }

    public static int zzZv(long j) {
        return ((int) ((j - 1) % 392)) + 1;
    }

    private static String zzY(long j, String str) {
        if (j < 1 || j > 2147483647L) {
            return "";
        }
        int i = ((int) j) - 1;
        int length = i / str.length();
        return zzZKN.zzS(str.charAt(i - (str.length() * length)), length + 1);
    }

    public static String zzZ(long j, int i, boolean z, int i2) {
        switch (i) {
            case 0:
            case 27:
                return "";
            case 1:
                return Long.toString(j);
            case 2:
                return zzZKN.zzU1(zzZs(j));
            case 3:
                return zzZs(j);
            case 4:
                return zzK(j, i2);
            case 5:
                return zzL(j, i2);
            case 6:
                return zz6Y.zzZh(j);
            case 7:
                return zzZWK.zzZ(j, true, z, i2);
            case 8:
                return zzZWK.zzZ(j, false, z, i2);
            case 9:
                return zzZt(j);
            case 10:
                return zzY(j, "*†‡§");
            case 11:
                return zzCU.zzP(j, 0);
            case 12:
                return zzCU.zzZR(j);
            case 13:
                return zzCU.zzW(j, true);
            case 14:
            case 16:
            case 17:
            case 18:
            case 20:
            case 28:
            case 29:
            case 37:
            case 40:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 53:
            case 54:
            case 55:
            case 56:
            case 59:
            default:
                return Long.toString(j);
            case 15:
                return zzZr(j);
            case 19:
                return zzZq(j);
            case 21:
                return zzCU.zzW(j, false);
            case 22:
                return zzCU.zzZS(j);
            case 23:
                return zzJB.zz6(j);
            case 24:
                return zzJB.zz5(j);
            case 25:
                return zzJB.zz4(j);
            case 26:
                return zzJB.zz3(j);
            case 30:
                return zzZp(j);
            case 31:
                return zzZo(j);
            case 32:
                return zzZq(j);
            case 33:
                return zzZn(j);
            case 34:
                return zzZRT.zzYR(j);
            case 35:
                return zzZRT.zzYQ(j);
            case 36:
                return zzZRT.zzYP(j);
            case 38:
            case 39:
            case 41:
            case 42:
            case 43:
                return zzTN.zzX(j, i);
            case 49:
                return zzIG.zzZY(j);
            case 50:
            case 52:
                return zzM(j, i);
            case 51:
                return zzIG.zzZX(j);
            case 57:
                return zzL(j, 30);
            case 58:
                return zzZWI.zzYW(j);
            case 60:
                return zzZVF.zzYV(j);
            case 61:
                return zzZu(j);
            case 62:
                return zzL(j, 1049);
            case 63:
                return zzK(j, 1049);
        }
    }
}
