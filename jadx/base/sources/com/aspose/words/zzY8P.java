package com.aspose.words;

import com.aspose.slides.C22218Oooo;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8P extends zzY8R {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW(ContextChain.TAG_PRODUCT, "span", "h1", "h2", "h3", "h4", "h5", "h6", "a", "em", "strong");
    private com.aspose.words.internal.zzZYF zzX9h;
    private com.aspose.words.internal.zzZYF zzX9i;
    private zzYEF zzX9j;
    private zzYEF zzX9k;
    private zzYMX zzX9l;
    private boolean zzYxr;

    public zzY8P(Document document, zzLS zzls, zzYMP zzymp, zzZN7 zzzn7, boolean z) {
        super(document, zzls, zzymp, zzzn7);
        this.zzX9l = new zzYMX();
        this.zzX9k = new zzYEF();
        this.zzX9j = new zzYEF();
        this.zzX9i = new com.aspose.words.internal.zzZYF();
        this.zzX9h = new com.aspose.words.internal.zzZYF();
        this.zzYxr = z;
    }

    private static int zzAF(String str) {
        switch (zzUR.zzTP(str)) {
            case 8:
                return 85;
            case 9:
                return 88;
            case 10:
                return 87;
            default:
                return StyleIdentifier.NIL;
        }
    }

    private static int zzAG(String str) {
        switch (zzUR.zzTP(str)) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                return StyleIdentifier.NIL;
        }
    }

    private Style zzY(int i, zzPS zzps) throws Exception {
        Style styleZzZ7 = this.zzYfy.getStyles().zzZ7(i, false);
        if (styleZzZ7 == null) {
            styleZzZ7 = this.zzYfy.getStyles().zzZ7(i, true);
            zzg(styleZzZ7);
        }
        zzY(styleZzZ7, zzps);
        return styleZzZ7;
    }

    private Style zzY2P() throws Exception {
        int iZzAF = zzAF(this.zzX9u.zzZUw().zzZTQ());
        if (iZzAF != 12287) {
            return zzY(iZzAF, zzPS.zzZqo);
        }
        String[] strArrZzZ2K = this.zzX9u.zzZUw().zzZ2K();
        if (strArrZzZ2K.length <= 0) {
            Style styleZzY2R = zzY2R();
            return styleZzY2R != null ? styleZzY2R : zzY(65, zzPS.zzZqo);
        }
        Style styleZzY = zzY(strArrZzZ2K[0], 2, zzPS.zzZqo);
        for (zzLT zzlt : this.zzX9u.zzZUE()) {
            for (zzMD zzmd : zzlt.zzZUV()) {
                zzQG zzqg = (zzQG) com.aspose.words.internal.zzZKW.zzZ(zzmd, zzQG.class);
                if (zzqg != null && com.aspose.words.internal.zzZKN.equals(zzqg.getClassName(), strArrZzZ2K[0])) {
                    zzY(styleZzY, zzlt.zzZWe());
                }
            }
        }
        return styleZzY;
    }

    private void zzY2Q() throws Exception {
        this.zzYfy.getStyles().zzY36().clear();
        this.zzYfy.getStyles().zzY32().zzY36().zzZ(this.zzYfy.getStyles().zzY36());
        this.zzYfy.getStyles().zzY37().clear();
        this.zzYfy.getStyles().zzY32().zzY37().zzZ(this.zzYfy.getStyles().zzY37());
        Style styleZzZ7 = this.zzYfy.getStyles().zzZ7(65, true);
        if (styleZzZ7 != null) {
            styleZzZ7.setPriority(1);
            styleZzZ7.setUnhideWhenUsed(true);
        }
        Style styleZzZ72 = this.zzYfy.getStyles().zzZ7(0, false);
        if (styleZzZ72 != null) {
            styleZzZ72.zzZYh().zznc(131075);
        }
        Style styleZzZ73 = this.zzYfy.getStyles().zzZ7(105, true);
        if (styleZzZ73 != null) {
            styleZzZ73.isQuickStyle(false);
        }
        this.zzYfy.getStyles().zzZ7(107, true);
        if (this.zzYfy.getStyles().zz0("msonormal", false) == null) {
            Style styleAdd = this.zzYfy.getStyles().add(1, "msonormal");
            styleAdd.zzl5(0);
            styleAdd.zzZYj().zzw5(100);
            styleAdd.zzZYj().zzw3(100);
            styleAdd.zzZYj().setSpaceBeforeAuto(true);
            styleAdd.zzZYj().setSpaceAfterAuto(true);
        }
        for (zzLT zzlt : this.zzX9u.zzZUE()) {
            for (zzMD zzmd : zzlt.zzZUV()) {
                zzQG zzqg = (zzQG) com.aspose.words.internal.zzZKW.zzZ(zzmd, zzQG.class);
                if (zzqg != null && com.aspose.words.internal.zzZKN.zzX(zzqg.getClassName(), "msochpdefault", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                    boolean zZzZy = zzlt.zzZWe().zzZy("mso-default-props", "yes");
                    boolean zZzZy2 = zzlt.zzZWe().zzZy("mso-style-type", "export-only");
                    if (!zZzZy2 && zzlt.zzZWe().getCount() > 0) {
                        zzY("msochpdefault", 1, zzlt.zzZWe());
                    }
                    if (zZzZy || !zZzZy2) {
                        Style styleZzl6 = Style.zzl6(2);
                        styleZzl6.zzZ(this.zzYfy.getStyles().zzY37());
                        zzY(styleZzl6, zzlt.zzZWe());
                        return;
                    }
                    return;
                }
            }
        }
    }

    private Style zzYp7() throws Exception {
        zzZAS zzzasZzZUw = this.zzX9u.zzZUw();
        int iZzAG = zzAG(zzzasZzZUw.zzZTQ());
        if (iZzAG != 12287) {
            return zzY(iZzAG, zzPS.zzZqo);
        }
        if (!ContextChain.TAG_PRODUCT.equals(zzzasZzZUw.zzZTQ()) || zzzasZzZUw.isImplicit() || !this.zzX9u.zzZUv()) {
            return zzY(0, zzPS.zzZqo);
        }
        String[] strArrZzZ2K = zzzasZzZUw.zzZ2K();
        if (strArrZzZ2K.length <= 0) {
            return zzY(94, zzPS.zzZqo);
        }
        String str = strArrZzZ2K[0];
        return com.aspose.words.internal.zzZKN.zzX(str, "msonormal", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8) ? zzY(0, zzPS.zzZqo) : zzY(str, 1, zzPS.zzZqo);
    }

    private void zze(Style style) {
        zzYMX zzymx;
        zzYEF zzyef;
        if (style.isHeading()) {
            return;
        }
        int type = style.getType();
        if (type == 1) {
            zzymx = this.zzX9l;
            zzyef = this.zzX9k;
        } else {
            if (type != 2) {
                return;
            }
            zzyef = this.zzX9j;
            zzymx = null;
        }
        style.zzX(zzymx, zzyef);
    }

    private static void zzf(Style style) {
        if (style.getType() != 1) {
            return;
        }
        zzYMX zzymx = new zzYMX();
        zzymx.setAlignment(0);
        zzymx.zzw5(100);
        zzymx.setSpaceBeforeAuto(true);
        zzymx.zzw3(100);
        zzymx.setSpaceAfterAuto(true);
        zzymx.zzw6(240);
        zzymx.setLineSpacingRule(2);
        zzymx.setKeepWithNext(false);
        zzymx.zzYpM();
        int styleIdentifier = style.getStyleIdentifier();
        int i = styleIdentifier != 1 ? styleIdentifier != 2 ? styleIdentifier != 3 ? styleIdentifier != 5 ? styleIdentifier != 6 ? 24 : 15 : 20 : 27 : 36 : 48;
        zzYEF zzyef = new zzYEF();
        zzyef.setNameAscii("Times New Roman");
        zzyef.setNameBi("Times New Roman");
        zzyef.setNameOther("Times New Roman");
        zzyef.zzR(zzU1.zzMW(131075));
        zzyef.setSize(i);
        zzyef.zzvA(i);
        zzyef.zzY(com.aspose.words.internal.zzPV.zzHZ);
        if (style.getStyleIdentifier() == 1) {
            zzyef.zzYdU();
        }
        if (style.isHeading()) {
            zzyef.zzQ(60, zzZU.zzZF6);
            zzyef.zzY(zzZU.zzZF6);
            zzyef.zzQ(70, zzZU.zzZF7);
            zzyef.zzX(zzZU.zzZF7);
        }
        style.zzX(zzymx, zzyef);
    }

    private void zzg(Style style) {
        if (style.getStyleIdentifier() == 94) {
            style.setSemiHidden(true);
            style.setUnhideWhenUsed(true);
            style.setPriority(99);
        }
        zzf(style);
        zze(style);
    }

    @Override // com.aspose.words.zzY8R
    public final void zzY2S() throws Exception {
        zzYEF zzyef;
        int i;
        if (!this.zzYxr) {
            zzY2Q();
        }
        Iterator<zzLT> it = this.zzX9u.zzZUE().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzLT next = it.next();
            for (zzMD zzmd : next.zzZUV()) {
                zzLA zzla = (zzLA) com.aspose.words.internal.zzZKW.zzZ(zzmd, zzLA.class);
                if (zzla != null) {
                    if (ContextChain.TAG_PRODUCT.equals(zzla.zzZTQ())) {
                        this.zzX9t.zzZ(new ParagraphFormat(this.zzX9l, this.zzYfy.getStyles()), next.zzZWe());
                    }
                    int iZzTP = zzUR.zzTP(zzla.zzZTQ());
                    if (iZzTP == 0) {
                        zzyef = this.zzX9k;
                        i = 1;
                    } else if (iZzTP == 1) {
                        zzyef = this.zzX9j;
                        i = 2;
                    }
                    this.zzX9s.zzZ(new Font(zzyef, this.zzYfy), i, next.zzZWe());
                }
            }
        }
        zzQ3 zzq3 = new zzQ3(true);
        for (zzLT zzlt : this.zzX9u.zzZUE()) {
            zzPS zzpsZzW = zzq3.zzW(zzlt.zzZWe());
            for (zzMD zzmd2 : zzlt.zzZUV()) {
                zzLA zzla2 = (zzLA) com.aspose.words.internal.zzZKW.zzZ(zzmd2, zzLA.class);
                if (zzla2 != null) {
                    int iZzAG = zzAG(zzla2.zzZTQ());
                    if (iZzAG != 12287) {
                        zzY(iZzAG, zzpsZzW);
                    }
                } else {
                    zzQG zzqg = (zzQG) com.aspose.words.internal.zzZKW.zzZ(zzmd2, zzQG.class);
                    if (zzqg == null || zzpsZzW.getCount() <= 0 || zzpsZzW.zzZy("mso-style-type", "export-only") || com.aspose.words.internal.zzZKN.zzX(zzqg.getClassName(), "msochpdefault", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
                        zzQ5 zzq5 = (zzQ5) com.aspose.words.internal.zzZKW.zzZ(zzmd2, zzQ5.class);
                        if (zzq5 != null) {
                            zzLA zzla3 = (zzLA) com.aspose.words.internal.zzZKW.zzZ(zzq5.zzZWr(), zzLA.class);
                            zzQG zzqg2 = (zzQG) com.aspose.words.internal.zzZKW.zzZ(zzq5.zzZWq(), zzQG.class);
                            if (zzla3 != null && zzqg2 != null) {
                                zzY(zzqg2.getClassName(), "span".equals(zzla3.zzZTQ()) ? 2 : 1, zzpsZzW);
                            }
                        }
                    } else {
                        zzY(zzqg.getClassName(), 1, zzpsZzW);
                    }
                }
            }
        }
    }

    @Override // com.aspose.words.zzY8R
    public final Style zzZpe() {
        return null;
    }

    @Override // com.aspose.words.zzY8R
    public final Style zzkL(int i) throws Exception {
        if (i == 1) {
            return zzYp7();
        }
        if (i != 2) {
            return null;
        }
        return zzY2P();
    }

    private Style zzY(String str, int i, zzPS zzps) throws Exception {
        com.aspose.words.internal.zzZYF zzzyf;
        com.aspose.words.internal.zzZYD.zzXk(str);
        if (com.aspose.words.internal.zzZKN.zzX(str, "msonormal", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            Style styleZzY = zzY(0, zzps);
            styleZzY.zzZYh().remove(400);
            if (zzps.getCount() > 0) {
                zzYMX zzymxZzZYj = styleZzY.zzZYj();
                if (zzps.zzSx("margin-left") == null) {
                    if (!zzymxZzZYj.contains(1200)) {
                        zzymxZzZYj.zzw5(100);
                    }
                    if (!zzymxZzZYj.contains(1210)) {
                        zzymxZzZYj.setSpaceBeforeAuto(true);
                    }
                }
                if (zzps.zzSx("margin-right") == null) {
                    if (!zzymxZzZYj.contains(1220)) {
                        zzymxZzZYj.zzw3(100);
                    }
                    if (!zzymxZzZYj.contains(1230)) {
                        zzymxZzZYj.setSpaceAfterAuto(true);
                    }
                }
            }
            return styleZzY;
        }
        if (i == 1) {
            zzzyf = this.zzX9i;
        } else {
            if (i != 2) {
                return null;
            }
            zzzyf = this.zzX9h;
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(str);
        String str2 = zzzyf.get(strZzU2);
        if (str2 == null) {
            Style styleZz0 = this.zzYfy.getStyles().zz0(strZzU2, false);
            String string = strZzU2;
            int i2 = 1;
            while (styleZz0 != null && styleZz0.getType() != i) {
                StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strZzU2);
                sbOooO0OO.append(com.aspose.words.internal.zzJB.zzWD(i2));
                string = sbOooO0OO.toString();
                i2++;
                styleZz0 = this.zzYfy.getStyles().zz0(string, false);
            }
            str2 = string;
        }
        Style styleZz02 = this.zzYfy.getStyles().zz0(str2, false);
        if (styleZz02 == null) {
            styleZz02 = Style.zzX(i, this.zzYfy.getStyles().zzY30(), StyleIdentifier.USER, str2);
            styleZz02.zzl5(i == 2 ? 10 : 0);
            this.zzYfy.getStyles().zzq(styleZz02);
            zzg(styleZz02);
            zzzyf.add(strZzU2, str2);
        }
        zzY(styleZz02, zzps);
        return styleZz02;
    }

    private void zzY(Style style, zzPS zzps) throws Exception {
        if ((style.getType() == 1 || style.getType() == 2) && zzps.getCount() != 0) {
            if (style.getType() == 1) {
                zzYMX zzymx = new zzYMX();
                this.zzX9t.zzZ(new ParagraphFormat(zzymx, this.zzYfy.getStyles()), zzps);
                style.zzX(zzymx, (zzYEF) null);
            }
            zzYEF zzyef = new zzYEF();
            this.zzX9s.zzZ(Font.zzZ(zzyef, this.zzYfy), style.getType(), zzps);
            if (style.getType() == 2) {
                zzyef.zzZ(style.zzZYh());
            } else {
                style.zzX((zzYMX) null, zzyef);
            }
        }
    }
}
