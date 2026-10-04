package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWE {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tblStyle", "tblpPr", "tblOverlap", "bidiVisual", "tblStyleRowBandSize", "tblStyleColBandSize", "leftFromText", "rightFromText", "topFromText", "bottomFromText", "vertAnchor", "horzAnchor", "tblpXSpec", "tblpX", "tblpYSpec", "tblpY", "tblW", "jc", "tblCellSpacing", "tblInd", "tblBorders", "shd", "tblLayout", "tblCellMar", "tblLook", "tblPrChange", "tblPrExChange", "tblDescription", "tblCaption", "top", "left", "start", "bottom", "right", "end", "insideH", "insideV", C18437z2.f56754h);

    private static void zzQ(zzYVB zzyvb, zzY6G zzy6g) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 16:
                zzy6g.zzQ(4230, zzyu4ZzZsD.zzX(zzyvb.zzZqn()));
                break;
            case 17:
                zzy6g.setAlignment(zzYUB.zzT(zzyu4ZzZsD.zzV("val", null), zzyvb.zzZqn()));
                break;
            case 18:
                PreferredWidth preferredWidthZzU = zzyu4ZzZsD.zzU(zzyvb.zzZqn());
                if (preferredWidthZzU != null) {
                    zzy6g.zzQ(4290, preferredWidthZzU);
                }
                break;
            case 19:
                zzy6g.zzQ(4340, Integer.valueOf(zzyu4ZzZsD.zzY(zzyvb.zzZqn())));
                break;
            case 20:
                zzY(zzyu4ZzZsD, zzy6g, zzyvb.zzZqn());
                break;
            case 21:
                zzy6g.zzQ(4330, zzyu4ZzZsD.zzYyA());
                break;
            case 22:
                zzZ(zzyu4ZzZsD, zzy6g);
                break;
            case 23:
                zzX(zzyu4ZzZsD, zzy6g, zzyvb.zzZqn());
                break;
            case 24:
                zzy6g.zzQ(4140, Integer.valueOf(zzZWC.zzI(zzyu4ZzZsD, zzyvb.zzZqn())));
                break;
            case 25:
            case 26:
                zzZYI.zzZ(zzyvb, zzy6g);
                break;
            case 27:
                zzy6g.setDescription(zzyu4ZzZsD.zzV("val", null));
                break;
            case 28:
                zzy6g.setTitle(zzyu4ZzZsD.zzV("val", null));
                break;
            default:
                zzyu4ZzZsD.zzk();
                break;
        }
    }

    public static void zzR(zzYVB zzyvb, zzY6G zzy6g) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
        } else {
            while (zzyu4ZzZsD.zzQ("tblPrEx")) {
                zzQ(zzyvb, zzy6g);
            }
        }
    }

    private static void zzS(zzYVB zzyvb, zzY6G zzy6g) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if ("tblLayout".equals(zzyu4ZzZsD.getLocalName())) {
                zzZ(zzyu4ZzZsD, zzy6g);
            } else {
                zzyu4ZzZsD.zzYyH();
            }
        }
    }

    public static void zzT(zzYVB zzyvb, zzY6G zzy6g) {
        zzZ(zzyvb, zzy6g, true);
    }

    public static void zzU(zzYVB zzyvb, zzY6G zzy6g) {
        zzZ(zzyvb, zzy6g, false);
    }

    private static void zzX(zzYU4 zzyu4, zzY6G zzy6g, zzYO3 zzyo3) {
        while (zzyu4.zzQ("tblCellMar")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 29:
                    zzy6g.zzwv(zzyu4.zzY(zzyo3));
                    break;
                case 30:
                    zzy6g.zzwx(zzyu4.zzY(zzyo3));
                    break;
                case 31:
                    zzyo3.zzYrc();
                    zzy6g.zzwx(zzyu4.zzY(zzyo3));
                    break;
                case 32:
                    zzy6g.zzws(zzyu4.zzY(zzyo3));
                    break;
                case 33:
                    zzy6g.zzwu(zzyu4.zzY(zzyo3));
                    break;
                case 34:
                    zzyo3.zzYrc();
                    zzy6g.zzwu(zzyu4.zzY(zzyo3));
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }

    private static void zzY(zzYU4 zzyu4, zzY6G zzy6g, zzYO3 zzyo3) {
        while (zzyu4.zzQ("tblBorders")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 29:
                    zzy6g.zzQ(4050, zzyu4.zzYyB());
                    break;
                case 30:
                    zzy6g.zzQ(4060, zzyu4.zzYyB());
                    break;
                case 31:
                    zzyo3.zzYrc();
                    zzy6g.zzQ(4060, zzyu4.zzYyB());
                    break;
                case 32:
                    zzy6g.zzQ(4070, zzyu4.zzYyB());
                    break;
                case 33:
                    zzy6g.zzQ(4080, zzyu4.zzYyB());
                    break;
                case 34:
                    zzyo3.zzYrc();
                    zzy6g.zzQ(4080, zzyu4.zzYyB());
                    break;
                case 35:
                    zzy6g.zzQ(4090, zzyu4.zzYyB());
                    break;
                case 36:
                    zzy6g.zzQ(EditingLanguage.CHINESE_SINGAPORE, zzyu4.zzYyB());
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, zzY6G zzy6g, boolean z) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        zzyu4ZzZsD.zzj();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzS(zzyvb, zzy6g);
            return;
        }
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzy6g.zzBl(zzyvb.zzJ(zzyu4ZzZsD.zzV("val", null), 11));
            } else if (iZzTP != 1) {
                if (iZzTP != 2) {
                    if (iZzTP == 3) {
                        zzy6g.zzQ(4380, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    } else if (iZzTP == 4) {
                        zzy6g.zzQ(4500, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    } else if (iZzTP != 5) {
                        zzQ(zzyvb, zzy6g);
                    } else {
                        zzy6g.zzQ(4510, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    }
                } else if ("never".equals(zzyu4ZzZsD.zzV("val", null))) {
                    zzy6g.zzQ(4350, Boolean.FALSE);
                }
            } else if (!z) {
                zzZ(zzyu4ZzZsD, zzy6g, zzyo3ZzZqn);
            }
        }
        if (z) {
            return;
        }
        zzyvb.zzS(zzy6g, 3);
    }

    private static void zzZ(zzYU4 zzyu4, zzY6G zzy6g, zzYO3 zzyo3) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 6:
                    zzy6g.zzQ(4210, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 7:
                    zzy6g.zzQ(4270, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 8:
                    zzy6g.zzQ(4220, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 9:
                    zzy6g.zzQ(4280, Integer.valueOf(zzyu4.zzT(zzyo3)));
                    break;
                case 10:
                    zzy6g.zzQ(4160, Integer.valueOf(zzY8T.zzHx(zzyu4.getValue())));
                    break;
                case 11:
                    zzy6g.zzQ(4150, Integer.valueOf(zzY8T.zzAQ(zzyu4.getValue())));
                    break;
                case 12:
                    zzy6g.zzQ(4180, Integer.valueOf(zzY8T.zzHz(zzyu4.getValue())));
                    break;
                case 13:
                    zzYU9.zzZ(zzy6g, 4170, zzyu4.zzT(zzyo3));
                    break;
                case 14:
                    zzy6g.zzQ(4200, Integer.valueOf(zzY8T.zzHA(zzyu4.getValue())));
                    break;
                case 15:
                    zzYU9.zzZ(zzy6g, 4190, zzyu4.zzT(zzyo3));
                    break;
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzY6G zzy6g) {
        while (zzyu4.zzi()) {
            if (zzUR.zzTP(zzyu4.getLocalName()) == 37) {
                zzy6g.zzQ(4240, Boolean.valueOf(!"fixed".equals(zzyu4.getValue())));
            }
        }
    }
}
