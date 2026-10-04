package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0R {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tblStyle", "tblpPr", "tblOverlap", "tblRtl", "bidiVisual", "tblStyleRowBandSize", "tblStyleColBandSize", "leftFromText", "rightFromText", "topFromText", "bottomFromText", "vertAnchor", "horzAnchor", "tblpXSpec", "tblpX", "tblpYSpec", "tblpY", "tblW", "jc", "tblCellSpacing", "tblInd", "tblBorders", "shd", "tblLayout", "tblCellMar", "tblLook", "annotation", "top", "left", "bottom", "right", "insideH", "insideV");

    private static void zzV(zzY6G zzy6g, zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 17:
                zzy6g.zzQ(4230, zzyu4ZzZsD.zzX(null));
                break;
            case 18:
                zzy6g.setAlignment(zzYUB.zzT(zzyu4ZzZsD.zzV("val", null), null));
                break;
            case 19:
                PreferredWidth preferredWidthZzU = zzyu4ZzZsD.zzU(null);
                if (preferredWidthZzU != null) {
                    zzy6g.zzQ(4290, preferredWidthZzU);
                }
                break;
            case 20:
                zzy6g.zzQ(4340, Integer.valueOf(zzyu4ZzZsD.zzY(null)));
                break;
            case 21:
                zzX(zzy6g, zzyu4ZzZsD);
                break;
            case 22:
                zzy6g.zzQ(4330, zzyu4ZzZsD.zzYyA());
                break;
            case 23:
                zzW(zzy6g, zzyu4ZzZsD);
                break;
            case 24:
                zzV(zzy6g, zzyu4ZzZsD);
                break;
            case 25:
                zzy6g.zzQ(4140, Integer.valueOf(zzY6G.zzjU(zzYU3.zzGU(zzyu4ZzZsD.zzV("val", null)))));
                break;
            case 26:
                zzY1U.zzP(zzyvb, zzy6g);
                break;
            default:
                zzyu4ZzZsD.zzk();
                break;
        }
    }

    public static void zzW(zzY6G zzy6g, zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("tblPrEx")) {
            zzV(zzy6g, zzyvb);
        }
    }

    public static void zzX(zzY6G zzy6g, zzYVB zzyvb) {
        zzZ(zzy6g, zzyvb, true);
    }

    public static void zzY(zzY6G zzy6g, zzYVB zzyvb) {
        zzZ(zzy6g, zzyvb, false);
    }

    private static void zzZ(zzY6G zzy6g, zzYVB zzyvb, boolean z) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzyu4ZzZsD.zzj();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        if (!z) {
            zzy6g.zzXXq();
            zzy6g.zzQ(4140, Integer.valueOf(TableStyleOptions.DEFAULT_2003));
        }
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzy6g.zzBl(zzyvb.zzJ(zzyu4ZzZsD.zzV("val", null), 11));
                    break;
                case 1:
                    if (!z) {
                        zzY(zzy6g, zzyu4ZzZsD);
                    }
                    break;
                case 2:
                    if ("Never".equals(zzyu4ZzZsD.zzV("val", null))) {
                        zzy6g.zzQ(4350, Boolean.FALSE);
                    }
                    break;
                case 3:
                    zzyu4ZzZsD.zzk();
                    break;
                case 4:
                    zzy6g.zzQ(4380, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 5:
                    zzy6g.zzQ(4500, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 6:
                    zzy6g.zzQ(4510, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                default:
                    zzV(zzy6g, zzyvb);
                    break;
            }
        }
        if (z) {
            return;
        }
        zzyvb.zzS(zzy6g, 3);
    }

    private static void zzX(zzY6G zzy6g, zzYU4 zzyu4) {
        while (zzyu4.zzQ("tblBorders")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 27:
                    zzy6g.zzQ(4050, zzyu4.zzYyB());
                    break;
                case 28:
                    zzy6g.zzQ(4060, zzyu4.zzYyB());
                    break;
                case 29:
                    zzy6g.zzQ(4070, zzyu4.zzYyB());
                    break;
                case 30:
                    zzy6g.zzQ(4080, zzyu4.zzYyB());
                    break;
                case 31:
                    zzy6g.zzQ(4090, zzyu4.zzYyB());
                    break;
                case 32:
                    zzy6g.zzQ(EditingLanguage.CHINESE_SINGAPORE, zzyu4.zzYyB());
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }

    private static void zzY(zzY6G zzy6g, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 7:
                    zzy6g.zzQ(4210, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 8:
                    zzy6g.zzQ(4270, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 9:
                    zzy6g.zzQ(4220, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 10:
                    zzy6g.zzQ(4280, Integer.valueOf(zzyu4.zzb()));
                    break;
                case 11:
                    zzy6g.zzQ(4160, Integer.valueOf(zzY8T.zzHx(zzyu4.getValue())));
                    break;
                case 12:
                    zzy6g.zzQ(4150, Integer.valueOf(zzY8T.zzAQ(zzyu4.getValue())));
                    break;
                case 13:
                    zzy6g.zzQ(4180, Integer.valueOf(zzY8T.zzHz(zzyu4.getValue())));
                    break;
                case 14:
                    zzYU9.zzZ(zzy6g, 4170, zzyu4.zzb());
                    break;
                case 15:
                    zzy6g.zzQ(4200, Integer.valueOf(zzY8T.zzHA(zzyu4.getValue())));
                    break;
                case 16:
                    zzYU9.zzZ(zzy6g, 4190, zzyu4.zzb());
                    break;
                default:
                    throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + zzyu4.getLocalName());
            }
        }
    }

    private static void zzW(zzY6G zzy6g, zzYU4 zzyu4) {
        while (zzyu4.zzi()) {
            if (C18437z2.f56754h.equals(zzyu4.getLocalName())) {
                zzy6g.zzQ(4240, Boolean.valueOf(!"Fixed".equals(zzyu4.getValue())));
            }
        }
    }

    private static void zzV(zzY6G zzy6g, zzYU4 zzyu4) {
        while (zzyu4.zzQ("tblCellMar")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 27:
                    zzy6g.zzwv(zzyu4.zzY(null));
                    break;
                case 28:
                    zzy6g.zzwx(zzyu4.zzY(null));
                    break;
                case 29:
                    zzy6g.zzws(zzyu4.zzY(null));
                    break;
                case 30:
                    zzy6g.zzwu(zzyu4.zzY(null));
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
    }
}
