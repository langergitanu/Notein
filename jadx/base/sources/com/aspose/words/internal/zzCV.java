package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzCV extends zzKP {
    private static String[] zzWN = {"uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "undici", "dodici", "tredici", "quattordici", "quindici", "sedici", "diciassette", "diciotto", "diciannove"};
    private static String[] zzNZ = {"venti", "trenta", "quaranta", "cinquanta", "sessanta", "settanta", "ottanta", "novanta"};
    private static String[] zzun = {"primo", "secondo", "terzo", "quarto", "quinto", "sesto", "settimo", "ottavo", "nono"};
    private static char[] zzum = {'a', 'o', 'i', 'e'};

    private static void zzU(StringBuilder sb) {
        if (sb.charAt(sb.length() - 1) == 233) {
            sb.setCharAt(sb.length() - 1, 'e');
        }
    }

    private static void zzV(StringBuilder sb) {
        if (zzw(sb.charAt(sb.length() - 1)) && !zzw(sb.charAt(sb.length() - 2))) {
            sb.setLength(sb.length() - 1);
        }
    }

    private static boolean zzw(char c) {
        char[] cArr = zzum;
        return zzZKV.zzZ(cArr, c, 0, cArr.length) != -1;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String getSeparator() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return "zero";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzX(long j, boolean z) {
        return (z || j <= 10 || j % 100 == 10) ? "" : "esimo";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return "e";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        return zzNZ;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXI() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXJ() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXK() {
        return zzWN;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return false;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXN() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzY(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        if (z3 || i != 3 || (i2 == 0 && !z2)) {
            super.zzY(sb, i, i2, true, z2, z3, z4, arrayList, i3);
        } else {
            zzZ(sb, "tré", false);
        }
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        if (i != 1) {
            zzZ(sb, zzQ(i, true), false);
        }
        zzZ(sb, zzZ(arrayList, i2, z), false);
    }

    private static String zzZ(ArrayList<Integer> arrayList, int i, boolean z) {
        int iIntValue = arrayList.get(i).intValue() % 100;
        int i2 = iIntValue / 10;
        if (z) {
            return "cento";
        }
        if (i2 != 8 && iIntValue > 1 && iIntValue != 8) {
            return "cento";
        }
        return "cent";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        if (z || !zzZ(sb, i, i2, arrayList)) {
            super.zzZ(sb, i, i2, true, z2, z3, z4, arrayList, i3);
            if (z) {
                return;
            }
            zzV(sb);
            zzU(sb);
        }
    }

    private boolean zzZ(StringBuilder sb, int i, int i2, ArrayList<Integer> arrayList) {
        if (arrayList.size() == 1 && i2 == 0 && i < 10) {
            zzZ(sb, zzun[i - 1], false);
            return true;
        }
        if (i != 10) {
            return false;
        }
        zzZ(sb, "decimo", false);
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        if (i != 1) {
            if (i == 2) {
                return z ? "milione" : "milion";
            }
            if (i == 3) {
                return z ? "miliardo" : "miliard";
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: thousandIndex");
        }
        if (!z && arrayList.get(0).intValue() == 0) {
            return "mill";
        }
        if (i2 == 1) {
            return "mille";
        }
        return "mila";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        if (i2 == 1 || i2 == 8) {
            zzZ(sb, zzZKN.zzW(zzP(i, true), zzum) + zzQ(i2, true), false);
            return;
        }
        if (!z3 && i2 == 3) {
            zzZ(sb, androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzP(i, true), "tré"), false);
        } else {
            super.zzZ(sb, i, i2, i3, true, z2, z3, z4, arrayList, i4);
        }
    }
}
