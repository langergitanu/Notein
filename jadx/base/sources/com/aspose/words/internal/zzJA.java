package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzJA extends zzKP {
    private static String[] zzzr = {"un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize"};
    private static String[] zzzq = {"unième", "deuxième", "troisième", "quatrième", "cinquième", "sixième", "septième", "huitième", "neuvième", "dixième", "onzième", "douzième", "treizième", "quatorzième", "quinzième", "seizième"};
    private static String[] zzzp = {"dix", "vingt", "trente", "quarante", "cinquante", "soixante"};
    private static String[] zzzo = {"dixième", "vingtième", "trentième", "quarantième", "cinquantième", "soixantième"};
    private static String[] zzFN = {"mille", "million", "milliard"};

    private static String zzM(int i, boolean z) {
        if (i <= 0) {
            return "";
        }
        if (i < 17) {
            return zzO(i, z);
        }
        if (i >= 70) {
            return "";
        }
        int i2 = i / 10;
        int i3 = i - (i2 * 10);
        if (i3 == 0) {
            return zzN(i2, z);
        }
        return zzN(i2, true) + zzd(i2, i3) + zzO(i3, z);
    }

    private static String zzN(int i, boolean z) {
        int i2 = i - 1;
        return z ? zzzp[i2] : zzzo[i2];
    }

    private static String zzO(int i, boolean z) {
        int i2 = i - 1;
        return z ? zzzr[i2] : zzzq[i2];
    }

    private static String zzd(int i, int i2) {
        return (i > 7 || i2 != 1) ? CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR : " et ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return "zéro";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzW(StringBuilder sb) {
        if (sb.charAt(sb.length() - 1) == 'e') {
            sb.setLength(sb.length() - 1);
        }
        super.zzW(sb);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return TranslateLanguage.ESTONIAN;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        throw new UnsupportedOperationException("The CardinalTens property not actual for FrenchTextualNumber");
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXI() {
        throw new UnsupportedOperationException("The OrdinalTens property not actual for FrenchTextualNumber");
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXJ() {
        throw new UnsupportedOperationException("The OrdinalFirst19 property not actual for FrenchTextualNumber");
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXK() {
        throw new UnsupportedOperationException("The CardinalFirst19 property not actual for FrenchTextualNumber");
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return false;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "ième";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        if (i == 0) {
            return;
        }
        int i4 = i / 10;
        int i5 = i - (i4 * 10);
        if (i < 70) {
            if (i != 1 || z || z2 || z3) {
                zzZ(sb, zzM(i, z), true);
                return;
            } else {
                zzZ(sb, "premier", true);
                return;
            }
        }
        if (i < 80) {
            zzZ(sb, zzN(6, true) + zzd(7, i5) + zzM(i - 60, z), true);
            return;
        }
        String str = "quatre-vingt";
        if (i != 80) {
            zzZ(sb, "quatre-vingt" + zzd(i4, i5) + zzM(i - 80, z), true);
            return;
        }
        if (z4) {
            str = "quatre-vingts";
        } else if (!z3) {
            str = "quatre-vingtième";
        }
        zzZ(sb, str, true);
    }

    private static String zzW(int i, boolean z, boolean z2) {
        if (z) {
            return (i == 1 || z2) ? "cent" : "cents";
        }
        return "centième";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        boolean z6 = z || z2;
        if (i != 1) {
            zzZ(sb, zzO(i, true), true);
        }
        zzZ(sb, zzW(i, z6, z2), true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzFN[i - 1];
    }
}
