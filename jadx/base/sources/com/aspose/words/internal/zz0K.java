package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zz0K extends zzKP {
    private static String[] zzWN = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "catorze", "quinze", "dezasseis", "dezassete", "dezoito", "dezanove"};
    private static String[] zzO0 = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo", "décimo primeiro", "décimo segundo", "décimo terceiro", "décimo quarto", "décimo quinto", "décimo sexto", "décimo sétimo", "décimo oitavo", "décimo nono"};
    private static String[] zzNZ = {"vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    private static String[] zzNY = {"vigésimo", "trigésimo", "quadragésimo", "quinquagésimo", "sexagésimo", "septuagésimo", "octagésimo", "nonagésimo"};
    private static String[] zzWL = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
    private static String[] zzMT = {"centésimo", "ducentésimo", "tricentésimo", "quadrigentésimo", "quingentésimo", "seiscentésimo", "septigentésimo", "octigentésimo", "nongentésimo"};
    private static String[] zzFN = {"mil", "milhão", "bilião"};

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return "zero";
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
        return false;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXN() {
        return " e ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return " e ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "ésimo";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        if (i == 1 && !z2 && z) {
            zzZ(sb, "cem", true);
            return;
        }
        int i3 = i - 1;
        String str = zzWL[i3];
        if (!z) {
            str = zzMT[i3];
        }
        zzZ(sb, str, z);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzFN[i - 1];
    }
}
