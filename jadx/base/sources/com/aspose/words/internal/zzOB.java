package com.aspose.words.internal;

import com.aspose.slides.C22218Oooo;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzOB extends zzKP {
    private static String[] zzWN = {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "elf", "twaalf", "dertien", "veertien", "vijftien", "zestien", "zeventien", "achttien", "negentien"};
    private static String[] zzO0 = {"eerste", "tweede", "derde", "vierde", "vijfde", "zesde", "zevende", "achtse", "negende", "tiende", "elfde", "twaalfde", "dertiende", "veertiende", "vijftiende", "zestiende", "zeventiende", "achttiende", "negentiende"};
    private static String[] zzNZ = {"twintig", "dertig", "veertig", "vijftig", "zestig", "zeventig", "tachtig", "negentig"};
    private static String[] zzFN = {"duizend", "miljoen", "miljard"};

    @Override // com.aspose.words.internal.zzKP
    public final String getSeparator() {
        return " ";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzL(boolean z) {
        return "nul";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzX(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzZ(sb, zzP(i, z), false);
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXG() {
        return TranslateLanguage.ENGLISH;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXH() {
        return zzNZ;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String[] zzXI() {
        return zzNZ;
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
    public final boolean zzXL() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzXM() {
        return true;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXO() {
        return "";
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzXP() {
        return "ste";
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzY(StringBuilder sb, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i3) {
        zzKP.zzZ(sb, zzQ(i, z), false, "");
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, ArrayList<Integer> arrayList, int i4) {
        String strZzQ = zzQ(i2, z);
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzQ);
        sbOooO0OO.append(androidx.core.content.OooO0O0.OooO00o(1, strZzQ) == 'e' ? "ën" : TranslateLanguage.ENGLISH);
        sbOooO0OO.append(zzP(i, z));
        sbOooO0OO.append(z ? "" : "ste");
        zzKP.zzZ(sb, sbOooO0OO.toString(), false, "");
    }

    @Override // com.aspose.words.internal.zzKP
    public final void zzZ(StringBuilder sb, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList<Integer> arrayList, int i2) {
        zzZ(sb, zzQ(i, true), false);
        zzZ(sb, "honderd", false);
    }

    @Override // com.aspose.words.internal.zzKP
    public final boolean zzZ(boolean z, int i, ArrayList<Integer> arrayList, int i2) {
        char cCharAt;
        if ((i > 0 && i <= 19) || (i >= 100 && i <= 119)) {
            return false;
        }
        if (i < 200 || !((cCharAt = zzJB.zzWD(i).charAt(1)) == '0' || cCharAt == '1')) {
            return z;
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzKP
    public final String zzZ(int i, boolean z, int i2, ArrayList<Integer> arrayList) {
        return zzFN[i - 1];
    }
}
