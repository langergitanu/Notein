package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzL0 extends zzKP {
    private static String[] zzWN = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] zzO0 = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth"};
    private static String[] zzNZ = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static String[] zzNY = {"twentieth", "thirtieth", "fortieth", "fiftieth", "sixtieth", "seventieth", "eightieth", "ninetieth"};
    private static String[] zzFN = {"thousand", "million", "billion"};

    private static String zz9(boolean z) {
        return z ? "hundred" : "hundredth";
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
        return "and";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        return zzNZ;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXI() {
        return zzNY;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXJ() {
        return zzO0;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXK() {
        return zzWN;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return TranslateLanguage.THAI;
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzY(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzQ(i, z), true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        zzKP.zzZ(sb, zzP(i, true) + zzXO() + zzQ(i2, z), true, z2 && z ? zzXN() : getSeparator());
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        boolean z6 = z || z2;
        zzZ(sb, zzQ(i, true), true);
        zzZ(sb, zz9(z6), true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzFN[i - 1];
    }
}
