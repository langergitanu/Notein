package com.aspose.words;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPD {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("break-before", "break-after", "align", "width", "rel-width", "writing-mode", "background-color", "may-break-between-rows", "keep-with-next", "page-number", "shadow", "border-model", "display", "min-row-height", "row-height", "keep-together", "use-optimal-row-height", "glyph-orientation-vertical", "vertical-align", "wrap-option", "border-line-width", "border-line-width-bottom", "border-line-width-left", "border-line-width-right", "border-line-width-top", "cell-protect", "decimal-places", "diagonal-bl-tr", "diagonal-bl-tr-widths", "diagonal-tl-br", "diagonal-tl-br-widths", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "print-content", "repeat-content", "rotation-align", "rotation-angle", "shrink-to-fit", "text-align-source", "column-width", "rel-column-width", "use-optimal-column-width");

    private static void zz0(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("table-properties")) {
            if ("background-image".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "style:table-properties");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYP9 zzyp9) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyp9.zzYvQ())) {
                String value = zzyq9ZzYuT.getValue();
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzyp9.zzXLD = value;
                        break;
                    case 1:
                        zzyp9.zzXLC = value;
                        break;
                    case 2:
                        zzyp9.zzS3("margins".equals(value));
                        zzyp9.zzrz(zzYS3.zzF0(value));
                        break;
                    case 3:
                        if (!zzyp9.getPreferredWidth().zzYmB()) {
                            zzyp9.setPreferredWidth(PreferredWidth.zzpK(zzYSF.zzFX(value)));
                        }
                        break;
                    case 4:
                        zzyp9.setPreferredWidth(PreferredWidth.fromPercent(zzYSF.zzFS(value)));
                        break;
                    case 5:
                        zzyp9.zzDP(value);
                        if (!"rl-tb".equals(value) && !"lr-tb".equals(value)) {
                            zzyq7.zzv("style:table-properties", "style:writing-mode", zzyp9.zzYtp());
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        zzyq7.zzZ(256, false, "style:table-properties");
                        break;
                    default:
                        zzyq7.zzYi("style:table-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYP9 zzyp9) {
        zzY(zzyq7, zzyp9);
        zz0(zzyq7);
    }

    private static void zzZY(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("table-cell-properties")) {
            if ("background-image".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "style:table-cell-properties");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzZZ(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("table-row-properties")) {
            if ("background-image".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "style:table-row-properties");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPA zzypa) {
        zzypa.zzZ(new zzY6G());
        zzY(zzyq7, zzypa);
        zzZZ(zzyq7);
        if (zzypa.zzZYf().getCount() == 0) {
            zzypa.zzZ(null);
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPG zzypg) {
        zzWP zzwp = new zzWP();
        zzZ(zzyq7, zzypg, zzwp);
        zzZY(zzyq7);
        zzZ(zzwp, zzypg);
        if (zzwp.getCount() > 0) {
            zzypg.zzZ(zzwp);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYPG zzypg, zzWP zzwp) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzypg.zzYvQ()) && !zzYQ7.zzZ(zzyq9ZzYuT, zzypg.zzYvh())) {
                String value = zzyq9ZzYuT.getValue();
                if (zzYQ7.zzZ(zzyq9ZzYuT, zzypg.zzYvg())) {
                    if ("padding-left".equals(zzyq9ZzYuT.getLocalName()) && !com.aspose.words.internal.zzAN.zzZD(zzYSF.zzFW(value)) && zzyq7.getDocument().getCompatibilityOptions().getMswVersion() < 15) {
                        zzyq7.getDocument().getCompatibilityOptions().setMswVersion(15);
                    }
                } else {
                    int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                    if (iZzTP == 5) {
                        zzZ(zzyq7, zzwp);
                    } else if (iZzTP != 6) {
                        if (iZzTP != 10) {
                            switch (iZzTP) {
                                case 17:
                                    if (!"0".equals(value)) {
                                        continue;
                                    } else {
                                        zzwp.zzQ(3050, 3);
                                    }
                                    break;
                                case 18:
                                    zzwp.zzQ(3060, Integer.valueOf(zzYS3.zzF1(value)));
                                    continue;
                                case 19:
                                    zzwp.zzQ(3180, Boolean.valueOf("wrap".equals(value)));
                                    continue;
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                    break;
                                default:
                                    zzyq7.zzYi("style:table-cell-properties", zzyq9ZzYuT.getLocalName());
                                    continue;
                            }
                        }
                        zzyq7.zzZ(256, false, "style:table-cell-properties");
                    } else {
                        zzwp.zzQ(3170, zzYOU.zzZ(value, (Shading) zzwp.get(3170)));
                    }
                }
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYPA zzypa) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzY6G zzy6gZzZYf = zzypa.zzZYf();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 0 && iZzTP != 1 && iZzTP != 6) {
                switch (iZzTP) {
                    case 13:
                        zzy6gZzZYf.setHeight(zzYSF.zzFX(zzyq9ZzYuT.getValue()));
                        zzy6gZzZYf.setHeightRule(0);
                        break;
                    case 14:
                        zzy6gZzZYf.setHeight(zzYSF.zzFX(zzyq9ZzYuT.getValue()));
                        zzy6gZzZYf.setHeightRule(1);
                        break;
                    case 15:
                        if ("always".equals(zzyq9ZzYuT.getValue())) {
                            zzy6gZzZYf.zzQ(4360, Boolean.FALSE);
                        }
                        break;
                    case 16:
                        zzypa.zzl(zzyq9ZzYuT.zz8() ? (byte) 1 : (byte) 0);
                        break;
                    default:
                        zzyq7.zzYi("style:table-row-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            } else {
                zzyq7.zzZ(256, false, "style:table-row-properties");
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzWP zzwp) {
        String value = zzyq7.zzYuT().getValue();
        if (!"tb-rl".equals(value) && !"lr".equals(value)) {
            zzyq7.zzv("style:table-cell-properties", "style:writing-mode", value);
        }
        int iZzF7 = zzYS3.zzF7(value);
        if (iZzF7 != 0) {
            zzwp.zzQ(3050, Integer.valueOf(iZzF7));
        }
    }

    private static void zzZ(zzWP zzwp, zzYPG zzypg) {
        zzYTH zzythZzYvh = zzypg.zzYvh();
        zzYQL zzyqlZzYvg = zzypg.zzYvg();
        zzZ(zzwp, zzythZzYvh.zzYy8(), 3110, zzyqlZzYvg.zzYvl(), 3070);
        zzZ(zzwp, zzythZzYvh.zzYy7(), 3130, zzyqlZzYvg.zzYvk(), 3080);
        zzZ(zzwp, zzythZzYvh.zzYy6(), 3120, zzyqlZzYvg.zzYvj(), 3090);
        zzZ(zzwp, zzythZzYvh.zzYy5(), 3140, zzyqlZzYvg.zzYvi(), 3100);
    }

    private static void zzZ(zzWP zzwp, zzYTJ zzytj, int i, double d, int i2) {
        if (zzytj != null) {
            zzwp.zzQ(i, zzYTJ.zzZ(zzytj));
        }
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            return;
        }
        zzwp.zzQ(i2, Integer.valueOf(com.aspose.words.internal.zzSA.zzu(d)));
    }

    public static void zzZ(zzYQ7 zzyq7, zzYPE zzype) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 0 && iZzTP != 1) {
                switch (iZzTP) {
                    case 38:
                        zzype.setColumnWidth(zzYSF.zzFX(zzyq9ZzYuT.getValue()));
                        break;
                    case 39:
                        zzype.zzrA(zzYSF.zzFT(zzyq9ZzYuT.getValue()));
                        break;
                    case 40:
                        zzype.zzm(zzyq9ZzYuT.zz8() ? (byte) 1 : (byte) 0);
                        break;
                    default:
                        zzyq7.zzYi("style:table-column-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            } else {
                zzyq7.zzZ(256, false, "style:table-column-properties");
            }
        }
    }
}
