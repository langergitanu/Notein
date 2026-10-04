package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0Y extends zzYUP {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("rStyle", "rFonts", "font", "b", "b-cs", ContextChain.TAG_INFRA, "i-cs", "caps", "smallCaps", "strike", "dstrike", "outline", "shadow", "emboss", "imprint", "noProof", "vanish", "snapToGrid", "webHidden", "color", "spacing", "w", "kern", RequestParameters.POSITION, "sz", "sz-cs", "highlight", "u", "effect", "bdr", "shd", "fitText", "vertAlign", "rtl", TranslateLanguage.CZECH, "em", "hyphen", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "asianLayout", "specVanish", "sym", "annotation", "gridSpan", "r", "br", "lit", "nor", "scr", "sty", "brk", "aln", "id", "vert", "vert-compress", "combine", "combine-brackets", "ascii", "h-ansi", "fareast", "hint", "val", "rule", "bidi");

    private static void zzX(zzYEF zzyef, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 60) {
                if (iZzTP != 61) {
                    zzyu4.zzZ(65536, 13, zzyu4.getLocalName());
                } else {
                    zzyef.zzQ(460, Integer.valueOf(zzYUQ.zzHi(zzyu4.getValue())));
                }
            } else if (com.aspose.words.internal.zzZYD.zzXk(zzyu4.getValue())) {
                zzyef.zzQ(470, Character.valueOf(zzyu4.getValue().charAt(0)));
            }
        }
    }

    private static void zzZ(zzYEF zzyef, zzYU4 zzyu4) {
        zzZRH zzzrh = new zzZRH();
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 51:
                    zzzrh.zzDN(zzyu4.zzb());
                    break;
                case 52:
                    zzzrh.zzW7(zzyu4.zz8());
                    break;
                case 53:
                    zzzrh.zzW5(zzyu4.zz8());
                    break;
                case 54:
                    zzzrh.zzW6(zzyu4.zz8());
                    break;
                case 55:
                    zzzrh.zzDO(zzYUQ.zzHr(zzyu4.getValue()));
                    break;
                default:
                    zzyu4.zzZ(65536, 13, zzyu4.getLocalName());
                    break;
            }
        }
        zzyef.zzU(zzzrh);
    }

    private static boolean zzx(zzYVB zzyvb, zzYEF zzyef) {
        if (!zzyvb.zzZmv()) {
            return false;
        }
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 45:
                zzyef.zzRb(zzyu4ZzZsD.zzYyD());
                break;
            case 46:
                zzyef.zzRa(zzyu4ZzZsD.zzYyD());
                break;
            case 47:
                zzyef.zznb(zzZXP.zzNa(zzyu4ZzZsD.zzV("val", null)));
                break;
            case 48:
                zzyef.zzna(zzZXP.zzN9(zzyu4ZzZsD.zzV("val", null)));
                break;
            case 49:
                zzyef.zzY(zzYUX.zzz(zzyu4ZzZsD));
                break;
            case 50:
                zzyef.zzR9(zzyu4ZzZsD.zzYyD());
                break;
        }
        return false;
    }

    @Override // com.aspose.words.zzYUP
    public final void zzV(zzYU4 zzyu4, zzYEF zzyef) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 34) {
                switch (iZzTP) {
                    case 56:
                        zzYU3.zzZ(zzyef, 230, zzyu4.getValue(), false);
                        break;
                    case 57:
                        zzYU3.zzZ(zzyef, 240, zzyu4.getValue(), false);
                        break;
                    case 58:
                        zzYU3.zzZ(zzyef, 235, zzyu4.getValue(), false);
                        break;
                    case 59:
                        zzyef.zzQ(400, Integer.valueOf(zzYUQ.zzHp(zzyu4.getValue())));
                        break;
                    default:
                        zzyu4.zzZ(65536, 13, zzyu4.getLocalName());
                        break;
                }
            } else {
                zzYU3.zzZ(zzyef, 270, zzyu4.getValue(), false);
            }
        }
    }

    @Override // com.aspose.words.zzYUP
    public final void zzW(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
        } else {
            while (zzyu4ZzZsD.zzQ("rPr")) {
                zzY(zzyvb, zzyef, false);
            }
        }
    }

    @Override // com.aspose.words.zzYUP
    public final void zzY(zzYVB zzyvb, zzYEF zzyef, boolean z) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 0:
                zzyef.zzQ(50, Integer.valueOf(zzyvb.zzJ(zzyu4ZzZsD.zzV("val", null), 10)));
                break;
            case 1:
                zzV(zzyu4ZzZsD, zzyef);
                break;
            case 2:
                break;
            case 3:
                zzyef.zzQ(60, zzyu4ZzZsD.zzYyC());
                break;
            case 4:
                zzyef.zzQ(250, zzyu4ZzZsD.zzYyC());
                break;
            case 5:
                zzyef.zzQ(70, zzyu4ZzZsD.zzYyC());
                break;
            case 6:
                zzyef.zzQ(StyleIdentifier.SUBTLE_EMPHASIS, zzyu4ZzZsD.zzYyC());
                break;
            case 7:
                zzyef.zzQ(120, zzyu4ZzZsD.zzYyC());
                break;
            case 8:
                zzyef.zzQ(110, zzyu4ZzZsD.zzYyC());
                break;
            case 9:
                zzyef.zzQ(80, zzyu4ZzZsD.zzYyC());
                break;
            case 10:
                zzyef.zzQ(300, zzyu4ZzZsD.zzYyC());
                break;
            case 11:
                zzyef.zzQ(90, zzyu4ZzZsD.zzYyC());
                break;
            case 12:
                zzyef.zzQ(100, zzyu4ZzZsD.zzYyC());
                break;
            case 13:
                zzyef.zzQ(170, zzyu4ZzZsD.zzYyC());
                break;
            case 14:
                zzyef.zzQ(180, zzyu4ZzZsD.zzYyC());
                break;
            case 15:
                zzyef.zzQ(440, zzyu4ZzZsD.zzYyC());
                break;
            case 16:
                zzyef.zzQ(130, zzyu4ZzZsD.zzYyC());
                break;
            case 17:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_1, zzyu4ZzZsD.zzYyC());
                break;
            case 18:
                zzyef.zzQ(132, zzyu4ZzZsD.zzYyC());
                break;
            case 19:
                String strZzV = zzyu4ZzZsD.zzV("val", null);
                if (strZzV != null) {
                    zzyef.zzQ(160, zzYU3.zzGR(strZzV));
                }
                break;
            case 20:
                zzyef.zzQ(150, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                break;
            case 21:
                zzyef.zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_2, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                break;
            case 22:
                zzyef.zzQ(220, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                break;
            case 23:
                zzyef.zzQ(200, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                break;
            case 24:
                zzyef.zzQ(190, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                break;
            case 25:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                break;
            case 26:
                zzyef.zzQ(20, zzYUQ.zzHk(zzyu4ZzZsD.zzV("val", null)));
                break;
            case 27:
                zzY(zzyef, zzyu4ZzZsD);
                break;
            case 28:
                zzyef.zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_5, Integer.valueOf(zzYUQ.zzHm(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 29:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_4_ACCENT_5, zzyu4ZzZsD.zzYyB());
                break;
            case 30:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, zzyu4ZzZsD.zzYyA());
                break;
            case 31:
                zzyef.zzQ(880, new zzZNW(zzyu4ZzZsD.zzYyE(), zzyu4ZzZsD.zzX("id", 0)));
                break;
            case 32:
                zzyef.zzQ(210, Integer.valueOf(zzYUQ.zzHj(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 33:
                zzyef.zzQ(StyleIdentifier.BIBLIOGRAPHY, zzyu4ZzZsD.zzYyC());
                break;
            case 34:
                zzyef.zzQ(StyleIdentifier.PLAIN_TABLE_2, zzyu4ZzZsD.zzYyC());
                break;
            case 35:
                zzyef.zzQ(770, Integer.valueOf(zzYUQ.zzHs(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 36:
                zzX(zzyef, zzyu4ZzZsD);
                break;
            case 37:
                zzW(zzyef, zzyu4ZzZsD);
                break;
            case 38:
                zzZ(zzyef, zzyu4ZzZsD);
                break;
            case 39:
                zzyef.zzQ(10, zzyu4ZzZsD.zzYyC());
                break;
            case 40:
                zzyu4ZzZsD.zzYyH();
                break;
            case 41:
                zzY11.zzXSy().zzZ(zzyef, zzyvb);
                break;
            case 42:
                Cell cell = (Cell) com.aspose.words.internal.zzZKW.zzZ(zzyvb.zzYz7().getAncestor(7), Cell.class);
                if (cell != null) {
                    cell.zz6G().zzQ(3900, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                }
                break;
            case 43:
                zzY11.zzXSw().zzY(zzyvb);
                break;
            case 44:
                zzyu4ZzZsD.zzYyz().append(zzYUN.zzR(zzyu4ZzZsD, zzyef));
                break;
            default:
                if (!zzx(zzyvb, zzyef)) {
                    zzyu4ZzZsD.zzk();
                }
                break;
        }
    }

    private static void zzW(zzYEF zzyef, zzYU4 zzyu4) {
        boolean z = false;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 58) {
                zzyef.zzQ(390, Integer.valueOf(com.aspose.words.internal.zzBM.zzYw(zzyu4.getValue())));
            } else if (iZzTP == 60) {
                zzyef.zzQ(380, Integer.valueOf(com.aspose.words.internal.zzBM.zzYw(zzyu4.getValue())));
            } else if (iZzTP != 62) {
                zzyu4.zzZ(65536, 13, zzyu4.getLocalName());
            } else {
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(com.aspose.words.internal.zzBM.zzYw(zzyu4.getValue())));
            }
            z = true;
        }
        if (z) {
            return;
        }
        zzyef.zzQ(380, 0);
    }

    private static void zzY(zzYEF zzyef, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 19) {
                zzyef.zzQ(450, zzYU3.zzGR(zzyu4.getValue()));
            } else if (iZzTP != 60) {
                zzyu4.zzZ(65536, 13, zzyu4.getLocalName());
            } else {
                zzyef.zzQ(140, Integer.valueOf(zzYUQ.zzHl(zzyu4.getValue())));
            }
        }
    }
}
