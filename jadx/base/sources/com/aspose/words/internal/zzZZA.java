package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZA extends zzKP {
    private static String[] zzcA = {"unu", "doi", "trei", "patru", "cinci", "șase", "șapte", "opt", "nouă", "zece", "unsprezece", "doisprezece", "treisprezece", "paisprezece", "cincisprezece", "șaisprezece", "șaptesprezece", "optsprezece", "nouăsprezece"};
    private static String[] zzcz = {"douăzeci", "treizeci", "patruzeci", "cincizeci", "șaizeci", "șaptezeci", "optzeci", "nouăzeci"};

    private static String zzT6(int i) {
        return i == 1 ? "sută" : "sute";
    }

    private static boolean zzV(long j, boolean z) {
        return !z && j > 1;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return "zero";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzX(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzP(i, z), true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return "şi";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        return zzcz;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXI() {
        return zzcz;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXJ() {
        return zzcA;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXK() {
        return zzcA;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return " ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzY(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzKP.zzZ(sb, zzZ(i, z, z4, i3, z2), true, getSeparator());
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        zzKP.zzZ(sb, zzP(i, z) + " și " + zzZ(i2, z, z4, 0, true), true, getSeparator());
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzX(long j, boolean z) {
        return zzV(j, z) ? j < 1000000 ? "lea" : "ulea" : super.zzX(j, z);
    }

    private String zzY(int i, boolean z, int i2) {
        if (i != 1) {
            if (i != 2) {
                return zzQ(i, z);
            }
            return "două";
        }
        if (i2 < 2) {
            return "o";
        }
        return "un";
    }

    private String zzZ(int i, boolean z, boolean z2, int i2, boolean z3) {
        if (i2 > 0) {
            return zzY(i, z, i2);
        }
        if (!z2) {
            if (i == 1 && !z3) {
                return "întâi";
            }
            if (i == 8) {
                return "optu";
            }
        }
        return zzQ(i, z);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzY(long j, boolean z) {
        if (zzV(j, z)) {
            return "al ";
        }
        return super.zzY(j, z);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        zzZ(sb, zzY(i, true, 0), true);
        zzZ(sb, zzT6(i), true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        if (i != 1) {
            if (i == 2) {
                return "milion";
            }
            if (i == 3) {
                return "miliard";
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: thousandIndex");
        }
        int i3 = i2 % 100;
        if (i3 == 1 || i3 == 2) {
            return "mie";
        }
        if (i3 != 0 && i3 < 20) {
            return "mii";
        }
        return "de mii";
    }
}
