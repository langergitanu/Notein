package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
class zzOI extends zzL4 {
    private double zzE0;
    private int zzZEC;

    public zzOI(double d, int i) {
        super(4, Double.valueOf(d));
        this.zzE0 = d;
        this.zzZEC = i;
    }

    private double zzMq(int i) {
        return zzZVV();
    }

    private static String zzMr(int i) {
        switch (i) {
            case 1:
                return BackupFile.EXTENSION_NOTEIN_FILE;
            case 2:
                return "cm";
            case 3:
                return "mm";
            case 4:
                return TranslateLanguage.PORTUGUESE;
            case 5:
                return "pc";
            case 6:
                return "px";
            case 7:
                return "em";
            case 8:
                return "ex";
            case 9:
                return "rem";
            default:
                return "";
        }
    }

    private double zzZVV() {
        switch (this.zzZEC) {
        }
        return this.zzE0;
    }

    @Override // com.aspose.words.zzL4
    public final double getDoubleValue() {
        return this.zzE0;
    }

    public final int getUnit() {
        return this.zzZEC;
    }

    @Override // com.aspose.words.zzL4
    public int hashCode() {
        return (super.hashCode() * 397) ^ this.zzZEC;
    }

    public final boolean isRelative() {
        int i = this.zzZEC;
        return i == 7 || i == 8 || i == 9;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzJB.zzZU(this.zzE0));
        com.aspose.words.internal.zzZNH.zzU(sb, zzMr(this.zzZEC));
    }

    @Override // com.aspose.words.zzL4
    public final boolean zzU(zzL4 zzl4) {
        if (!(zzl4 instanceof zzOI)) {
            return false;
        }
        zzOI zzoi = (zzOI) zzl4;
        return com.aspose.words.internal.zzAN.zzQ(this.zzE0, zzoi.zzE0, 0.005d) && this.zzZEC == zzoi.zzZEC;
    }

    public final double zzZVW() {
        return zzMq(4);
    }
}
