package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8Q extends zzY8R {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("h1", "h2", "h3", "h4", "h5", "h6");
    private Style zzX9m;
    private int zzX9n;
    private int zzX9o;
    private boolean zzX9p;
    private zzZF5 zzX9q;

    public zzY8Q(Document document, zzLS zzls, int i, int i2, zzZN7 zzzn7, zzYMP zzymp) {
        super(document, zzls, zzymp, zzzn7);
        this.zzX9q = new zzZF5();
        this.zzX9o = i;
        this.zzX9n = i2;
    }

    private static boolean zzVo(int i, int i2) {
        return (i == 85 || i == 87 || i == 88) ? i2 == 2 : i2 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[PHI: r3
      0x0025: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:10:0x0017, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Style zzW(zzMD zzmd, int i) {
        int i2;
        if (i != 1) {
            return null;
        }
        int iZzTP = zzUR.zzTP(zzmd.zzZXu());
        if (iZzTP != 0) {
            i2 = 2;
            if (iZzTP != 1) {
                int i3 = 3;
                if (iZzTP != 2) {
                    i2 = 4;
                    if (iZzTP != 3) {
                        i3 = 5;
                        i2 = iZzTP != 4 ? iZzTP != 5 ? 12287 : 6 : i3;
                    }
                }
            }
        } else {
            i2 = 1;
        }
        if (i2 != 12287) {
            return this.zzYfy.getStyles().zzZ7(i2, true);
        }
        return null;
    }

    private Style zzX(zzMD zzmd, int i) throws Exception {
        Style styleZz0;
        Style styleZzW = zzW(zzmd, i);
        if (styleZzW != null) {
            return styleZzW;
        }
        String strZzZXt = zzmd.zzZXt();
        Style style = this.zzYfy.getStyles().get(strZzZXt);
        if (style != null && style.getType() != i) {
            strZzZXt = com.aspose.words.internal.zzZKN.format("{0} {1}", strZzZXt, zzkJ(i));
            style = null;
        }
        zzPS zzpsZzZ = this.zzX9u.zzZ(zzmd);
        if (zzpsZzZ == null) {
            int iZzkI = zzkI(i);
            if (iZzkI != 12287) {
                return this.zzYfy.getStyles().zzZ8(iZzkI, true);
            }
            return null;
        }
        if (zzpsZzZ.getCount() == 0 && style != null) {
            return style;
        }
        Style styleZzYZ = zzYZ(strZzZXt, i);
        if (styleZzYZ == null) {
            return null;
        }
        styleZzYZ.zzl5(zzZ(styleZzYZ, zzmd));
        zzZ(styleZzYZ, zzpsZzZ);
        int i2 = 0;
        String str = strZzZXt;
        while (true) {
            styleZz0 = this.zzYfy.getStyles().zz0(str, false);
            String str2 = com.aspose.words.internal.zzZKN.format("{0}_{1}", strZzZXt, Integer.valueOf(i2));
            i2++;
            if (styleZz0 == null || !(com.aspose.words.internal.zzZKO.zzA(styleZz0, styleZzYZ) || styleZz0.getBuiltIn() || !styleZz0.equals(styleZzYZ))) {
                break;
            }
            str = str2;
        }
        if (styleZz0 == null) {
            return styleZzYZ;
        }
        this.zzYfy.getStyles().zzs(styleZzYZ);
        return styleZz0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026 A[PHI: r3
      0x0026: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:9:0x0019, B:13:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Style zzY(zzZAS zzzas, int i) {
        int iZzkI;
        if (i != 1) {
            iZzkI = 12287;
        } else {
            int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzas.zzZTQ()));
            if (iZzTP != 0) {
                iZzkI = 2;
                if (iZzTP != 1) {
                    int i2 = 3;
                    if (iZzTP != 2) {
                        iZzkI = 4;
                        if (iZzTP != 3) {
                            i2 = 5;
                            if (iZzTP == 4) {
                                iZzkI = i2;
                            } else if (iZzTP == 5) {
                                iZzkI = 6;
                            }
                        }
                    }
                }
            } else {
                iZzkI = 1;
            }
        }
        if (iZzkI == 12287) {
            iZzkI = zzkI(i);
        }
        if (iZzkI != 12287) {
            return this.zzYfy.getStyles().zzZ8(iZzkI, true);
        }
        return null;
    }

    private Style zzYZ(String str, int i) {
        if (this.zzX9p) {
            return null;
        }
        try {
            Style styleZzX = Style.zzX(i, this.zzYfy.getStyles().zzY30(), StyleIdentifier.USER, this.zzYfy.getStyles().zzGI(str));
            this.zzYfy.getStyles().zzq(styleZzX);
            styleZzX.zzl5(i != 3 ? zzkI(i) : 11);
            return styleZzX;
        } catch (IllegalStateException unused) {
            this.zzX9p = true;
            return null;
        }
    }

    private Style zzZ(zzPT zzpt, int i) {
        int iZzU = zzL5.zzU(zzpt.zzZWj());
        if (zzVo(iZzU, i)) {
            return this.zzYfy.getStyles().zzZ7(iZzU, true);
        }
        return null;
    }

    private Style zzZ0(String str, int i) {
        Style style = this.zzYfy.getStyles().get(str);
        if (style != null && style.getType() != i) {
            str = com.aspose.words.internal.zzZKN.format("{0} {1}", str, zzkJ(i));
            style = this.zzYfy.getStyles().get(str);
        }
        if (style != null && style.getType() != i) {
            style = null;
        }
        return style != null ? style : zzYZ(str, i);
    }

    private int zzkI(int i) {
        return i != 1 ? i != 2 ? StyleIdentifier.NIL : this.zzX9n : this.zzX9o;
    }

    private static String zzkJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : "Table" : "Character" : "Paragraph";
    }

    private void zzkK(int i) throws Exception {
        zzPS zzpsZzMg = this.zzX9u.zzMg(i);
        if (zzpsZzMg != null) {
            zzZ(this.zzYfy.getStyles().zzZ7(i, true), zzpsZzMg);
        }
    }

    @Override // com.aspose.words.zzY8R
    public final void zzY2S() throws Exception {
        for (int i = 1; i <= 9; i++) {
            zzPS zzpsZzMg = this.zzX9u.zzMg(i);
            if (zzpsZzMg != null) {
                Style styleZzZ7 = this.zzYfy.getStyles().zzZ7(i, true);
                zzZ(styleZzZ7, zzpsZzMg);
                if (zzpsZzMg.zzSx("font-family") == null) {
                    styleZzZ7.getFont().setName(this.zzYfy.zzZqz().getSubstitutionSettings().getDefaultFontSubstitution().getDefaultFontName());
                }
                if (zzpsZzMg.zzSx("font-style") == null) {
                    styleZzZ7.getFont().setItalic(false);
                }
            }
        }
        this.zzYfy.getStyles().zzZ7(1, true).getFont().setKerning(18.0d);
        zzkK(0);
        zzkK(85);
        zzkK(87);
        zzkK(88);
    }

    @Override // com.aspose.words.zzY8R
    public final Style zzZpe() {
        return this.zzX9m;
    }

    @Override // com.aspose.words.zzY8R
    public final Style zzkL(int i) throws Exception {
        Style styleZzY2R;
        Style styleZzZ;
        zzMD zzmd = null;
        this.zzX9m = null;
        zzPT zzptZzSx = this.zzX9u.zzZUC().zzSx("-aw-style-name");
        if (zzptZzSx != null && (styleZzZ = zzZ(zzptZzSx, i)) != null) {
            return styleZzZ;
        }
        for (zzMD zzmd2 : this.zzX9u.zzZUD()) {
            if (zzmd == null || zzmd2.zzZXs().zzY(zzmd.zzZXs()) == 1) {
                zzmd = zzmd2;
            }
        }
        if (zzmd != null) {
            return zzY(zzmd, i);
        }
        String strZzZTQ = this.zzX9u.zzZUw().zzZTQ();
        String attributeValue = this.zzX9u.zzZUw().getAttributeValue("class", "");
        if ((!ContextChain.TAG_PRODUCT.equals(strZzZTQ) && !"span".equals(strZzZTQ) && !"table".equals(strZzZTQ)) || com.aspose.words.internal.zzZKN.equals(attributeValue, "")) {
            return (i != 2 || (styleZzY2R = zzY2R()) == null) ? zzY(this.zzX9u.zzZUw(), i) : styleZzY2R;
        }
        Style styleZzZ0 = zzZ0(attributeValue, i);
        this.zzX9m = styleZzZ0;
        return styleZzZ0;
    }

    private Style zzY(zzMD zzmd, int i) throws Exception {
        Style styleZzZ = this.zzX9q.zzZ(zzmd, i);
        if (styleZzZ == null) {
            styleZzZ = zzX(zzmd, i);
            this.zzX9q.zzZ(zzmd, i, styleZzZ);
        }
        if (zzZF5.zzT(styleZzZ)) {
            styleZzZ = null;
        }
        if (styleZzZ != null) {
            styleZzZ.getDocument();
        }
        return styleZzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzZ(Style style, zzMD zzmd) throws Exception {
        int iZzZ7j;
        Style styleZzY;
        if (style.getType() == 3) {
            return 11;
        }
        if (zzmd instanceof zzQ5) {
            zzQ5 zzq5 = (zzQ5) zzmd;
            iZzZ7j = ((zzq5.zzZWr() instanceof zzLA) && (zzq5.zzZWq() instanceof zzQG) && (styleZzY = zzY(zzq5.zzZWr(), style.getType())) != null) ? styleZzY.zzZ7j() : 12287;
        }
        return iZzZ7j == 12287 ? zzkI(style.getType()) : iZzZ7j;
    }

    private void zzZ(Style style, zzPS zzps) throws Exception {
        if (style.getType() == 1 || style.getType() == 2) {
            if (style.getType() == 1) {
                this.zzX9t.zzZ(style.getParagraphFormat(), zzps);
            }
            this.zzX9s.zzZ(style.getFont(), style.getType(), zzps);
        }
    }
}
