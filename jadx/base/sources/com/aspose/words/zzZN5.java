package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN5 extends zzZN7 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("minor-latin", "minor-bidi", "minor-fareast", "major-latin", "major-bidi", "major-fareast");
    private zzZYZ zzYSF;
    private boolean zzYxr;

    public zzZN5(zzZYZ zzzyz, boolean z) {
        this.zzYSF = zzzyz;
        this.zzYxr = z;
    }

    private static int zzH(zzL4 zzl4) {
        if (zzl4.getValueType() == 11) {
            return ((zzNR) zzl4).getIntValue();
        }
        if (zzl4.getValueType() == 0) {
            return com.aspose.words.internal.zzBM.zzYw(((zzOT) zzl4).getValue());
        }
        return 127;
    }

    private static int zzLp(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) {
            return 2;
        }
        return (iZzTP == 3 || iZzTP == 4 || iZzTP == 5) ? 1 : 0;
    }

    private static void zzM(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("mso-ansi-language");
        if (zzptZzSx != null && zzptZzSx.zzZWj().getCount() == 1) {
            font.setLocaleId(zzH(zzptZzSx.zzZWj().zzZVx()));
        }
        zzPT zzptZzSx2 = zzps.zzSx("mso-fareast-language");
        if (zzptZzSx2 != null && zzptZzSx2.zzZWj().getCount() == 1) {
            font.setLocaleIdFarEast(zzH(zzptZzSx2.zzZWj().zzZVx()));
        }
        zzPT zzptZzSx3 = zzps.zzSx("mso-bidi-language");
        if (zzptZzSx3 == null || zzptZzSx3.zzZWj().getCount() != 1) {
            return;
        }
        font.setLocaleIdBi(zzH(zzptZzSx3.zzZWj().zzZVx()));
    }

    private static void zzN(Font font, zzPS zzps) {
        new zzRV(zzps).zzY(font.getShading());
    }

    private static void zzO(Font font, zzPS zzps) {
        zzRL zzrlZzZ = zzRL.zzZ(zzps, 3, false);
        if (zzrlZzZ.zzZXh()) {
            return;
        }
        zzrlZzZ.zzI(font.getBorder());
    }

    private static void zzQ(Font font, zzPS zzps) {
        zzPT zzptZzSx = zzps.zzSx("font-size");
        if (zzptZzSx == null) {
            return;
        }
        double dZzW = zzL5.zzW(zzptZzSx.zzZWj());
        if (com.aspose.words.internal.zzAN.zzZC(dZzW)) {
            return;
        }
        font.setSize(dZzW);
        font.setSizeBi(dZzW);
    }

    private void zzZ(Font font, zzPS zzps, boolean z, boolean z2, boolean z3) {
        zzQ(font, zzps);
        if (this.zzYxr) {
            zzZ(font, zzps, z, z2);
        } else {
            zzY(font, zzps, z2);
            zzM(font, zzps);
        }
        zzO(font, zzps);
        zzN(font, zzps);
        zzZ(font, zzps, z3);
    }

    @Override // com.aspose.words.zzZN7
    public final void zzY(Font font, zzLS zzls) {
        zzZIH zzzih = zzls.zzZUu().zzYr9;
        zzZ(font, zzls.zzZUC(), zzzih != null && ContextChain.TAG_PRODUCT.equals(zzzih.zzYra.zzZTQ()), false, true);
        zzY(font, zzls.zzZUs());
    }

    @Override // com.aspose.words.zzZN7
    public final void zzY(Font font, int i, zzPS zzps) {
        zzZ(font, zzps, true, true, i == 2);
    }

    private static void zzY(Font font, zzLN zzln) {
        if (zzln.zzZUd() != -1) {
            font.setUnderline(zzln.zzZUd() == 1 ? 1 : 0);
        }
        if (zzln.zzZUb() != -1) {
            font.setStrikeThrough(zzln.zzZUb() == 1);
        }
    }

    private static void zzZ(Font font, zzPS zzps, boolean z) {
        zzLL zzll;
        zzPT zzptZzSx = zzps.zzSx("text-decoration");
        if (zzptZzSx == null || (zzll = (zzLL) com.aspose.words.internal.zzZKW.zzZ(zzptZzSx.zzZWj(), zzLL.class)) == null) {
            return;
        }
        if (!zzll.zzZXi()) {
            if (zzll.zzO(zzL4.zzZn8)) {
                font.setStrikeThrough(true);
            }
            if (zzll.zzO(zzL4.zzZna)) {
                font.setUnderline(1);
                return;
            }
            return;
        }
        if (z) {
            font.setStrikeThrough(false);
            font.setUnderline(0);
            font.setDoubleStrikeThrough(false);
            font.setTextEffect(0);
        }
    }

    private void zzY(Font font, zzPS zzps, boolean z) {
        String strZzSF = zzps.zzSF("mso-ascii-font-family");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF)) {
            font.setNameAscii(strZzSF);
        }
        String strZzSF2 = zzps.zzSF("mso-fareast-font-family");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF2)) {
            font.setNameFarEast(strZzSF2);
        }
        String strZzSF3 = zzps.zzSF("mso-hansi-font-family");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF3)) {
            font.setNameOther(strZzSF3);
        }
        String strZzSF4 = zzps.zzSF("mso-bidi-font-family");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF4)) {
            font.setNameBi(strZzSF4);
        }
        String strZzZ = zzps.zzZ(this.zzYSF);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            if (!com.aspose.words.internal.zzZYD.zzXk(strZzSF)) {
                font.setNameAscii(strZzZ);
            }
            if (!com.aspose.words.internal.zzZYD.zzXk(strZzSF3)) {
                font.setNameOther(strZzZ);
            }
            com.aspose.words.internal.zzZXH zzzxhZzO = this.zzYSF.zzO(strZzZ, 0);
            if (zzzxhZzO != null && zzzxhZzO.zzHC().zzHj() && !com.aspose.words.internal.zzZYD.zzXk(strZzSF4)) {
                font.setNameBi(strZzZ);
            }
            if (z) {
                font.zzZ7g().setRunAttr(400, 3);
            }
        }
        String strZzSF5 = zzps.zzSF("mso-ascii-theme-font");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF5)) {
            font.setThemeFontAscii(zzLp(strZzSF5));
        }
        String strZzSF6 = zzps.zzSF("mso-hansi-theme-font");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF6)) {
            font.setThemeFontOther(zzLp(strZzSF6));
        }
        String strZzSF7 = zzps.zzSF("mso-fareast-theme-font");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF7)) {
            font.setThemeFontFarEast(zzLp(strZzSF7));
        }
        String strZzSF8 = zzps.zzSF("mso-bidi-theme-font");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzSF8)) {
            font.setThemeFontBi(zzLp(strZzSF8));
        }
    }

    private void zzZ(Font font, zzPS zzps, boolean z, boolean z2) {
        if (!z) {
            font.setNameFarEast("Times New Roman");
        }
        String strZzZ = zzps.zzZ(this.zzYSF);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZ)) {
            font.setNameAscii(strZzZ);
            font.setNameOther(strZzZ);
            com.aspose.words.internal.zzZXH zzzxhZzO = this.zzYSF.zzO(strZzZ, 0);
            if (zzzxhZzO != null && zzzxhZzO.zzHC().zzHj()) {
                font.setNameBi(strZzZ);
            }
            if (z2) {
                font.zzZ7g().setRunAttr(400, 3);
            }
        }
    }
}
