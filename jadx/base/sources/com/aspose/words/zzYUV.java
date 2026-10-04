package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.ConnectionResult;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYUV {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("pStyle", "keepNext", "keepLines", "pageBreakBefore", "framePr", "widowControl", "numPr", "listPr", "suppressLineNumbers", "supressLineNumbers", "pBdr", "shd", "tabs", "suppressAutoHyphens", "kinsoku", "wordWrap", "overflowPunct", "topLinePunct", "autoSpaceDE", "autoSpaceDN", "bidi", "adjustRightInd", "snapToGrid", "spacing", "ind", "contextualSpacing", "suppressOverlap", "jc", "textDirection", "textAlignment", "outlineLvl", "divId", "rPr", "sectPr", "mirrorIndents", "textboxTightWrap", "cnfStyle", "collapsed", "dropCap", "drop-cap", "lines", "w", C18773h.f57233c, "vSpace", "vspace", "hSpace", "hspace", "wrap", "hAnchor", "hanchor", "vAnchor", "vanchor", "x", "y", "xAlign", "x-align", "yAlign", "y-align", "hRule", "h-rule", "anchorLock", "anchor-lock", "left", "start", "right", "end", "firstLine", "first-line", "hanging", "leftChars", "left-chars", "startChars", "rightChars", "right-chars", "endChars", "firstLineChars", "first-line-chars", "hangingChars", "hanging-chars", "before", "beforeLines", "before-lines", "beforeAutospacing", "before-autospacing", "after", "afterLines", "after-lines", "afterAutospacing", "after-autospacing", "line", "lineRule", "line-rule", "tab", "val", "leader", "pos", "top", "bottom", "between", "bar", "ilvl", "numId", "ilfo", "t", "font");
    private zzYUK zzXTU;
    private zzYUP zzXUr;

    public zzYUV(zzYUP zzyup, zzYUK zzyuk) {
        this.zzXUr = zzyup;
        this.zzXTU = zzyuk;
    }

    private void zzA(zzYVB zzyvb) throws Exception {
        Paragraph paragraph = (Paragraph) zzyvb.zzYz7();
        if (paragraph == null || paragraph.getParentSection() == null) {
            return;
        }
        zzyvb.zzXUi.zzY(paragraph.getParentSection().zzYvR());
        this.zzXTU.zzY(zzyvb, paragraph.getParentSection().zzYvR());
        zzyvb.zzYyV().clear();
        zzyvb.zzXUi.zzY(zzyvb.zzYyV());
        zzyvb.zzXUi.clear();
    }

    private boolean zzQ(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        boolean z = false;
        while (zzyu4ZzZsD.zzQ("pPr")) {
            if ("sectPr".equals(zzyu4ZzZsD.getLocalName())) {
                zzA(zzyvb);
                z = true;
            } else if ("t".equals(zzyu4ZzZsD.getLocalName()) || "r".equals(zzyu4ZzZsD.getLocalName())) {
                this.zzXUr.zzY(zzyvb, zzyef, false);
            } else {
                zzyu4ZzZsD.zzYyH();
            }
        }
        return z;
    }

    private static void zzW(zzYU4 zzyu4, zzYMX zzymx, zzYO3 zzyo3) {
        TabStopCollection tabStopCollection = new TabStopCollection();
        while (zzyu4.zzQ("tabs")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) == 92) {
                int iZzS = 0;
                int iZzU = 0;
                int iZzHt = 0;
                while (zzyu4.zzi()) {
                    switch (zzUR.zzTP(zzyu4.getLocalName())) {
                        case 93:
                            iZzU = zzYUW.zzU(zzyu4.getValue(), zzyo3);
                            break;
                        case 94:
                            iZzHt = zzYUW.zzHt(zzyu4.getValue());
                            break;
                        case 95:
                            iZzS = zzyu4.zzS(zzyo3);
                            break;
                    }
                }
                tabStopCollection.add(new TabStop(iZzS, iZzU, iZzHt));
            }
        }
        if (tabStopCollection.getCount() > 0) {
            zzymx.zzQ(EditingLanguage.GUARANI, tabStopCollection);
        }
    }

    private static void zzX(zzYU4 zzyu4, zzYMX zzymx, zzYO3 zzyo3) {
        zzZ52 zzz52ZzYPx = zzZ52.zzYPx();
        boolean z = false;
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 79:
                    zzZ(zzymx, 1200, zzyu4.zzT(zzyo3));
                    break;
                case 80:
                case 81:
                    zzymx.zzQ(1205, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 82:
                case 83:
                    if (!zzYU3.zzGM(zzyu4.getValue())) {
                        zzyu4.zzZ(65536, 9, com.aspose.words.internal.zzZKN.format("Unknown value '{0}' for '{1}' element.", zzyu4.getValue(), zzyu4.getLocalName()));
                    } else {
                        zzymx.zzQ(1210, Boolean.valueOf(zzyu4.zz8()));
                    }
                    break;
                case 84:
                    zzZ(zzymx, 1220, zzyu4.zzT(zzyo3));
                    break;
                case 85:
                case 86:
                    zzymx.zzQ(1225, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 87:
                case 88:
                    zzymx.zzQ(1230, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 89:
                    zzz52ZzYPx.setValue(zzyu4.zzT(zzyo3));
                    z = true;
                    break;
                case 90:
                case 91:
                    zzz52ZzYPx.zzAe(zzYUW.zzHu(zzyu4.getValue()));
                    break;
            }
        }
        if (z) {
            zzX(zzz52ZzYPx);
            zzymx.set(1650, zzz52ZzYPx);
        }
    }

    public final boolean zzY(zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef) throws Exception {
        if (zzyvb.zzYyZ().zzZrB()) {
            return zzQ(zzyvb, zzyef);
        }
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        boolean z = false;
        while (zzyu4ZzZsD.zzQ("pPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    Style style = zzyvb.zzYyU().get(1);
                    zzymx.zzQ(1000, Integer.valueOf(zzyvb.zzJ(zzyu4ZzZsD.zzV("val", null), style != null ? style.zzZ7j() : 0)));
                    break;
                case 1:
                    zzymx.zzQ(1050, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 2:
                    zzymx.zzQ(EditingLanguage.ITALIAN_ITALY, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 3:
                    zzymx.zzQ(EditingLanguage.SLOVENIAN, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 4:
                    zzZ(zzyu4ZzZsD, zzymx, zzyo3ZzZqn);
                    break;
                case 5:
                    zzymx.zzQ(1470, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 6:
                case 7:
                    zzZ(zzyvb, zzymx);
                    break;
                case 8:
                case 9:
                    zzymx.zzQ(EditingLanguage.YORUBA, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 10:
                    zzX(zzyu4ZzZsD, zzymx);
                    break;
                case 11:
                    zzymx.zzQ(1460, zzyu4ZzZsD.zzYyA());
                    break;
                case 12:
                    zzW(zzyu4ZzZsD, zzymx, zzyo3ZzZqn);
                    break;
                case 13:
                    zzymx.zzQ(1410, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 14:
                    zzymx.zzQ(EditingLanguage.SORBIAN, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 15:
                    zzymx.zzQ(EditingLanguage.FAEROESE, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 16:
                    zzymx.zzQ(EditingLanguage.TURKMEN, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 17:
                    zzymx.zzQ(EditingLanguage.MALAYALAM, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 18:
                    zzymx.zzQ(1240, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 19:
                    zzymx.zzQ(1250, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 20:
                    zzymx.zzQ(1560, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 21:
                    zzymx.zzQ(1270, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 22:
                    zzymx.zzQ(1260, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 23:
                    zzX(zzyu4ZzZsD, zzymx, zzyo3ZzZqn);
                    break;
                case 24:
                    zzY(zzyu4ZzZsD, zzymx, zzyo3ZzZqn);
                    break;
                case 25:
                    zzymx.zzQ(1022, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 26:
                    zzymx.zzQ(1660, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 27:
                    zzymx.zzQ(PointerIconCompat.TYPE_GRAB, Integer.valueOf(zzYUW.zzV(zzyu4ZzZsD.zzV("val", null), zzyo3ZzZqn)));
                    break;
                case 28:
                    zzymx.zzQ(1480, Integer.valueOf(zzY8T.zzP(zzyu4ZzZsD.zzV("val", null), zzyo3ZzZqn)));
                    break;
                case 29:
                    zzymx.zzQ(1510, Integer.valueOf(zzYUW.zzHC(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 30:
                    zzymx.zzQ(1280, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 31:
                    zzymx.zzQ(1585, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 32:
                    this.zzXUr.zzW(zzyvb, zzyef);
                    break;
                case 33:
                    zzA(zzyvb);
                    z = true;
                    break;
                case 34:
                    zzymx.zzQ(EditingLanguage.PAPIAMENTU, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 35:
                    zzymx.zzQ(1590, Integer.valueOf(zzYUW.zzHD(zzyu4ZzZsD.zzV("val", null))));
                    break;
                case 36:
                    zzyu4ZzZsD.zzk();
                    break;
                case 37:
                    zzymx.zzQ(1670, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    zzyo3ZzZqn.zzYr6();
                    break;
                default:
                    zzZ(zzyu4ZzZsD.getLocalName(), zzyvb, zzymx, zzyef);
                    this.zzXUr.zzY(zzyvb, zzyef, true);
                    break;
            }
        }
        return z;
    }

    public final void zzZ(zzYVB zzyvb, zzYMX zzymx) {
        zzW(zzyvb.zzZsD(), zzymx);
        if (zzymx.getListId() != 0) {
            com.aspose.words.internal.zzZQG.zzZ(zzyvb.zzXUl, Integer.valueOf(zzymx.getListId()));
        }
    }

    public abstract boolean zzZ(String str, zzYU4 zzyu4, zzYMX zzymx);

    public abstract boolean zzZ(String str, zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef) throws Exception;

    private static void zzZ(zzYU4 zzyu4, zzYMX zzymx, zzYO3 zzyo3) {
        boolean z = false;
        int iZzHv = 0;
        int iZzT = 0;
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 38:
                case 39:
                    zzymx.zzQ(1440, Integer.valueOf(zzYUW.zzHB(zzyu4.getValue())));
                    continue;
                case 40:
                    zzymx.zzQ(1450, Integer.valueOf(zzyu4.zzb()));
                    continue;
                case 41:
                    zzymx.zzQ(1310, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    continue;
                case 42:
                    iZzT = zzyu4.zzT(zzyo3);
                    break;
                case 43:
                case 44:
                    zzymx.zzQ(1490, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    continue;
                case 45:
                case 46:
                    zzymx.zzQ(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    continue;
                case 47:
                    zzymx.zzQ(1340, Integer.valueOf(zzYUW.zzHw(zzyu4.getValue())));
                    continue;
                case 48:
                case 49:
                    zzymx.zzQ(1320, Integer.valueOf(zzYUW.zzHy(zzyu4.getValue())));
                    continue;
                case 50:
                case 51:
                    zzymx.zzQ(1330, Integer.valueOf(zzYUW.zzHx(zzyu4.getValue())));
                    continue;
                case 52:
                    zzymx.zzQ(1292, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    continue;
                case 53:
                    zzymx.zzQ(1302, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    continue;
                case 54:
                case 55:
                    zzymx.zzQ(1290, Integer.valueOf(zzYUW.zzHz(zzyu4.getValue())));
                    continue;
                case 56:
                case 57:
                    zzymx.zzQ(1300, Integer.valueOf(zzYUW.zzHA(zzyu4.getValue())));
                    continue;
                case 58:
                case 59:
                    iZzHv = zzYUW.zzHv(zzyu4.getValue());
                    break;
                case 60:
                    zzymx.zzQ(1520, Boolean.valueOf(zzyu4.zz8()));
                    continue;
                case 61:
                    zzymx.zzQ(1520, Boolean.valueOf(zzyu4.zz8()));
                    continue;
            }
            z = true;
        }
        if (z) {
            zzymx.zzQ(1430, new zzZKP(iZzHv, iZzT));
        }
    }

    public final void zzW(zzYU4 zzyu4, zzYMX zzymx) {
        String localName = zzyu4.getLocalName();
        while (zzyu4.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 100:
                    int iZzYyE = zzyu4.zzYyE();
                    if (iZzYyE < 0) {
                        iZzYyE += 256;
                    }
                    zzymx.zzQ(EditingLanguage.GALICIAN, Integer.valueOf(iZzYyE));
                    break;
                case 101:
                case 102:
                    zzymx.zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(zzyu4.zzYyE()));
                    break;
                case 103:
                    zzyu4.zzT(65536, 13, "Import of 't' element within 'listPr' is not supported in WordML format by Aspose.Words.");
                    break;
                case 104:
                    zzyu4.zzT(65536, 13, "Import of 'font' element within 'listPr' is not supported in WordML format by Aspose.Words.");
                    break;
                default:
                    if (!zzZ(zzyu4.getLocalName(), zzyu4, zzymx)) {
                        zzyu4.zzk();
                    }
                    break;
            }
        }
    }

    private static void zzX(zzZ52 zzz52) {
        zzz52.setValue((short) zzz52.getValue());
        if (zzz52.getValue() < 0) {
            zzz52.setValue(Math.abs(zzz52.getValue()));
            zzz52.zzAe(1);
        }
        if (zzz52.zzZ4A() == 1 && zzz52.getValue() == 0) {
            zzz52.zzAe(0);
        }
    }

    private static void zzX(zzYU4 zzyu4, zzYMX zzymx) {
        while (zzyu4.zzQ("pBdr")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 62) {
                zzymx.zzQ(1360, zzyu4.zzYyB());
            } else if (iZzTP != 64) {
                switch (iZzTP) {
                    case 96:
                        zzymx.zzQ(1350, zzyu4.zzYyB());
                        break;
                    case 97:
                        zzymx.zzQ(1370, zzyu4.zzYyB());
                        break;
                    case 98:
                        zzymx.zzQ(1390, zzyu4.zzYyB());
                        break;
                    case 99:
                        zzymx.zzQ(1400, zzyu4.zzYyB());
                        break;
                }
            } else {
                zzymx.zzQ(1380, zzyu4.zzYyB());
            }
        }
    }

    private static void zzZ(zzYMX zzymx, int i, int i2) {
        if (i2 >= 0) {
            zzymx.zzQ(i, Integer.valueOf(i2));
        }
    }

    private static void zzY(zzYU4 zzyu4, zzYMX zzymx, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 62:
                    zzymx.zzQ(1160, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 63:
                    zzyo3.zzYrc();
                    zzymx.zzQ(1160, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 64:
                    zzymx.zzQ(EditingLanguage.BRETON, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 65:
                    zzyo3.zzYrc();
                    zzymx.zzQ(EditingLanguage.BRETON, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 66:
                case 67:
                    zzymx.zzQ(EditingLanguage.CENTRAL_KURDISH_IRAQ, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 68:
                    zzymx.zzQ(EditingLanguage.CENTRAL_KURDISH_IRAQ, Integer.valueOf(-zzyu4.zzT(zzyo3)));
                    break;
                case 69:
                case 70:
                    zzymx.zzQ(1165, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 71:
                    zzyo3.zzYrc();
                    zzymx.zzQ(1165, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 72:
                case 73:
                    zzymx.zzQ(EditingLanguage.CORSICAN, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 74:
                    zzyo3.zzYrc();
                    zzymx.zzQ(EditingLanguage.CORSICAN, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 75:
                case 76:
                    zzymx.zzQ(1175, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 77:
                case 78:
                    zzymx.zzQ(1175, Integer.valueOf(-zzyu4.zzb()));
                    break;
                default:
                    zzyu4.zzZ(16777216, 14, zzyu4.getLocalName());
                    break;
            }
        }
    }
}
