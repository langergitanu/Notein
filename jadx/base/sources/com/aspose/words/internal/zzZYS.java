package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYS extends zzKP {
    private static String[] zzWN = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"};
    private static String[] zzO0 = {"primero", "segundo", "tercero", "cuarto", "quinto", "sexto", "séptimo", "octavo", "noveno", "décimo", "undécimo", "duodécimo", "decimotercero", "decimocuarto", "decimoquinto", "decimosexto", "decimoséptimo", "decimoctavo", "decimonoveno"};
    private static String[] zzNZ = {"veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
    private static String[] zzWM = {"veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis", "veintisiete", "veintiocho", "veintinueve"};
    private static String[] zzNY = {"vigésimo", "trigésimo", "cuadragésimo", "quincuagésimo", "sexagésimo", "septuagésimo", "octogésimo", "nonagésimo"};
    private static String[] zzWL = {"ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};
    private static String[] zzMT = {"centésimo", "ducentésimo", "tricentésimo", "cuadringentésimo", "quingentésimo", "sexcentésimo", "septingentésimo", "octingésimo", "noningentésimo"};
    private static String[] zzFN = {"mil", "millón", "mil millones"};

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzIQ() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return "cero";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return "con";
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
    public final String zzXO() {
        return " y ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "ésimo";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        zzZ(sb, z ? zzWL[i - 1] : zzMT[i - 1], true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        if (i < 20) {
            if (i > 0) {
                zzZ(sb, zzQ(i, z), true);
                return;
            }
            return;
        }
        if (i > 20 && i < 30) {
            int i4 = i - 20;
            if (z) {
                zzZ(sb, zzWM[i - 21], true);
                return;
            }
            zzZ(sb, zzP(2, false) + getSeparator() + zzQ(i4, false), true);
            return;
        }
        int i5 = i / 10;
        int i6 = i - (i5 * 10);
        if (i6 == 0) {
            zzZ(sb, zzP(i5, z), true);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zzP(i5, z));
        sb2.append(z ? " y " : getSeparator());
        sb2.append(zzQ(i6, z));
        zzZ(sb, sb2.toString(), true);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzFN[i - 1];
    }
}
