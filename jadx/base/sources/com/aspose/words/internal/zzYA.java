package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzYA extends zzKP {
    private static String[] zzWN = {"bat", "bi", "hiru", "lau", "bost", "sei", "zazpi", "zortzi", "bederatzi", "hamar", "hamaika", "hamabi", "hamairu", "hamalau", "hamabost", "hamasei", "hamazazpi", "hemezortzi", "hemeretzi"};
    private static String[] zzWM = {"hogei", "berrogei", "hirurogei", "laurogei"};
    private static String[] zzWL = {"ehun", "berrehun", "hirurehun", "laurehun", "bostehun", "seiehun", "zazpiehun", "zortziehun", "bederatziehun"};
    private static String[] zzWK = {"mila", "milioi", "miliar"};

    @Override // com.aspose.words.internal.zzKP
    public final String getSeparator() {
        return " ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return z ? "zero" : "nulua";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return "koma";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        throw new IllegalStateException();
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
    public final boolean zzXL() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXN() {
        return " eta ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return "ta ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "garren";
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzZ(boolean z, int i, ArrayList<Integer> arrayList, int i2) {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        if (i == 0) {
            return;
        }
        if (!z && i == 1 && i2 == 0 && arrayList.size() == 1) {
            zzZ(sb, "lehenengo", false);
            return;
        }
        if (arrayList.size() == 2 && arrayList.get(1).intValue() == 1 && i3 == 1) {
            return;
        }
        boolean z5 = i2 > 0 || arrayList.size() > 0;
        if (i < 20) {
            zzKP.zzZ(sb, zzQ(i, true), z5, " eta ");
        } else {
            int i4 = i / 20;
            int i5 = i - (i4 * 20);
            zzKP.zzZ(sb, zzWM[i4 - 1], z5, " eta ");
            if (i5 != 0) {
                zzKP.zzZ(sb, zzQ(i5, true), true, "ta ");
            }
        }
        if (z) {
            return;
        }
        zzZ(sb, "garren", false);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        zzZ(sb, zzWL[i - 1], z3);
        if (z || z2) {
            return;
        }
        zzZ(sb, "garren", false);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzWK[i - 1];
    }
}
