package com.aspose.words.internal;

import com.google.mlkit.p567nl.languageid.LanguageIdentifier;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzJ4 extends zzKP {
    private static String[] zzWN = {"ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn", "elf", "zwölf", "dreizehn", "vierzehn", "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"};
    private static String[] zzNZ = {"zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", "siebzig", "achtzig", "neunzig"};
    private static String[] zzO0 = {"erste", "zweite", "dritte", "vierte", "fünfte", "sechste", "siebente", "achte", "neunte", "zehnte", "elfte", "zwölfte", "dreizehnte", "vierzehnte", "fünfzehnte", "sechzehnte", "siebzehnte", "achtzehnte", "neunzehnte"};
    private static String[] zzNY = {"zwanzigste", "dreißigste", "vierzigste", "fünfzigste", "sechzigste", "siebzigste", "achtzigste", "neunzigste"};
    private static String[] zzFN = {"tausend", "million", "millarde"};

    @Override // com.aspose.words.internal.zzKP
    public final String getSeparator() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzIO() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzIP() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzIQ() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return z ? CloudMetaExtra.DEFINE_NON_PARENT_ID : "nullte";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
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
    public final String zzXN() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return LanguageIdentifier.UNDETERMINED_LANGUAGE_TAG;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "ste";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        if (i != 1 || z3) {
            zzZ(sb, zzWN[i - 1], false);
        }
        zzZ(sb, "hundert", false);
        if (z || z2) {
            return;
        }
        zzZ(sb, "ste", false);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzFN[i - 1];
    }
}
