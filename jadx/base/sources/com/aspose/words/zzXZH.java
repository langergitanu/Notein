package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXZH {
    private String mName;
    private int zzA0;
    private String zzWSB;
    private int zzWSC;
    private double zzWSD;
    private boolean zzWSE;
    private boolean zzWTe;
    private int zzY7k;
    private boolean zzYwV;
    private boolean zzZCm;
    private com.aspose.words.internal.zzPV zzZf;
    private boolean zzpG;
    private int zzzY = -1;

    private zzXZH() {
    }

    public static zzXZH zzY(Font font, Document document) {
        FontInfo fontInfo = document.getFontInfos().get(font.getName());
        zzXZH zzxzh = new zzXZH();
        zzxzh.mName = font.getName();
        zzxzh.zzzY = com.aspose.words.internal.zzJF.zzWG(font.getLocaleId());
        zzxzh.zzYwV = font.getBold();
        zzxzh.zzpG = font.getItalic();
        zzxzh.zzY7k = zzhk(font.getUnderline());
        zzxzh.zzWSE = font.getStrikeThrough() || font.getDoubleStrikeThrough();
        zzxzh.zzWTe = font.getOutline();
        zzxzh.zzZCm = font.getShadow();
        if (font.getThemeColor() != -1) {
            zzxzh.zzZf = zzYOQ.zzZ(font.zzPj(500), font.zzPj(520), font.zzPj(510), document.getTheme());
        } else {
            zzxzh.zzZf = font.zz8Q();
        }
        if (fontInfo != null) {
            zzxzh.zzA0 = fontInfo.getFamily();
        }
        zzxzh.zzWSD = font.getSize();
        zzxzh.zzWSC = font.getVerticalAlignment();
        return zzxzh;
    }

    private static int zzhk(int i) {
        if (i != 0) {
            return (i == 3 || i == 43) ? 2 : 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXZH.class) {
            return false;
        }
        zzXZH zzxzh = (zzXZH) obj;
        return com.aspose.words.internal.zzZKN.equals(zzxzh.mName, this.mName) && zzxzh.zzzY == this.zzzY && zzxzh.zzA0 == this.zzA0 && zzxzh.zzYwV == this.zzYwV && zzxzh.zzpG == this.zzpG && zzxzh.zzY7k == this.zzY7k && zzxzh.zzWSE == this.zzWSE && zzxzh.zzWTe == this.zzWTe && zzxzh.zzZCm == this.zzZCm && com.aspose.words.internal.zzPV.zzZ(zzxzh.zzZf, this.zzZf) && com.aspose.words.internal.zzAN.zzQ(zzxzh.zzWSD, this.zzWSD, 0.01d) && zzxzh.zzWSC == this.zzWSC && com.aspose.words.internal.zzZKN.equals(zzxzh.zzWSB, this.zzWSB);
    }

    public final boolean getBold() {
        return this.zzYwV;
    }

    public final int getCharset() {
        return this.zzzY;
    }

    public final int getFamily() {
        return this.zzA0;
    }

    public final boolean getItalic() {
        return this.zzpG;
    }

    public final String getName() {
        return this.mName;
    }

    public final boolean getOutline() {
        return this.zzWTe;
    }

    public final boolean getShadow() {
        return this.zzZCm;
    }

    public final double getSize() {
        return this.zzWSD;
    }

    public final int getUnderline() {
        return this.zzY7k;
    }

    public int hashCode() {
        String str = this.mName;
        int iHashCode = (((((((((((((((((str != null ? str.hashCode() : 0) * 397) ^ this.zzzY) * 397) ^ this.zzA0) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzYwV)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzpG)) * 397) ^ this.zzY7k) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWSE)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzWTe)) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZCm)) * 397;
        com.aspose.words.internal.zzPV zzpv = this.zzZf;
        int iHashCode2 = (((((iHashCode ^ (zzpv != null ? zzpv.hashCode() : 0)) * 397) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzWSD)) * 397) ^ this.zzWSC) * 397;
        String str2 = this.zzWSB;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final int zzXR9() {
        return this.zzWSC;
    }

    public final boolean zzXRa() {
        return this.zzWSE;
    }

    public final com.aspose.words.internal.zzPV zzZy() {
        return this.zzZf;
    }
}
