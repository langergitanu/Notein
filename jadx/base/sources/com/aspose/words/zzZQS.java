package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQS {
    private double zzYF8;
    private int zzZq;
    private String zzjy = "";

    public static zzZQS zzV(zzZR4 zzzr4) {
        FieldSymbol fieldSymbol = (FieldSymbol) zzZQB.zzU(zzzr4);
        zzZQS zzzqs = new zzZQS();
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(fieldSymbol.getCharacterCode());
        if (iZzZo != Integer.MIN_VALUE) {
            zzzqs.zzZq = iZzZo;
        }
        zzzqs.zzjy = fieldSymbol.getFontName();
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(fieldSymbol.getFontSize());
        if (!Double.isNaN(dZzZs)) {
            zzzqs.zzYF8 = dZzZs;
        }
        return zzzqs;
    }

    public final char getChar() {
        return (char) this.zzZq;
    }

    public final String getFontName() {
        return this.zzjy;
    }
}
