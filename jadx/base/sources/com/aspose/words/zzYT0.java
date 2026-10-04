package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzYT0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("automatic-styles", "body", "font-face-decls", "scripts", "chart", "text", "database", "drawing", "image", "presentation", "spreadsheet", "user-field-decls", "calculation-settings", "consolidation", "content-validations", "database-ranges", "data-pilot-tables", "dde-links", "label-ranges", "named-expressions", "alphabetical-index-auto-mark-file", "dde-connection-decls", "sequence-decls", "variable-decls", "class", "style-name", "height", "width", "column-mapping", "row-mapping", "table", "legend", "plot-area", NoteMeta.PROPERTY_TITLE, "footer", "subtitle", "x", "y", "cell-range", ContextChain.TAG_PRODUCT, "data-source-has-labels", "ambient-color", "distance", "focal-length", "lighting-mode", "projection", "shade-mode", "shadow-slant", "transform", "vpn", "vrp", "vup", "cell-range-address", "axis", "series", "stock-gain-marker", "stock-loss-marker", "stock-range-line", "floor", "wall", "light", "attached-axis", "label-cell-address", "values-cell-range-address", "data-point", "data-label", "domain", "error-indicator", "mean-value", "regression-curve", "repeated", "dimension", "name", "categories", "grid", "major", "minor", "legend-align", "legend-position", "legend-expansion", "legend-expansion-aspect-ratio", "z", "bottom-end", "bottom-start", "top-end", "top-start", "bottom", "end", "start", "top", "chart:area", "chart:bar", "chart:bubble", "chart:circle", "chart:filled-radar", "chart:gantt", "chart:line", "chart:radar", "chart:ring", "chart:scatter", "chart:stock", "chart:surface");

    private static int zzGp(String str) {
        switch (zzUR.zzTP(str)) {
            case 90:
                return 0;
            case 91:
            default:
                return 1;
            case 92:
                return 2;
            case 93:
                return 3;
            case 94:
                return 4;
            case 95:
                return 5;
            case 96:
                return 6;
            case 97:
                return 7;
            case 98:
                return 8;
            case 99:
                return 9;
            case 100:
                return 10;
            case 101:
                return 11;
        }
    }

    private static int zzGq(String str) {
        return zzUR.zzTP(str) != 88 ? 0 : 1;
    }

    private static int zzGr(String str) {
        switch (zzUR.zzTP(str)) {
            case 82:
                return 1;
            case 83:
                return 2;
            case 84:
                return 3;
            case 85:
                return 4;
            case 86:
                return 5;
            case 87:
            default:
                return 6;
            case 88:
                return 7;
            case 89:
                return 8;
        }
    }

    private static int zzGs(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 36) {
            return 0;
        }
        if (iZzTP == 37) {
            return 1;
        }
        if (iZzTP == 81) {
            return 2;
        }
        throw new IllegalArgumentException("Unexpected axis type");
    }

    private static zzYSX zzL(zzYQ7 zzyq7) {
        zzYSX zzysx = new zzYSX(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 25) {
                zzysx.setStyleName(zzyq7.zzYuT().getValue());
            } else if (iZzTP == 36) {
                zzysx.zzW(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
            } else if (iZzTP != 37) {
                switch (iZzTP) {
                    case 77:
                        zzysx.setAlignment(zzGq(zzyq7.zzYuT().getValue()));
                        break;
                    case 78:
                        zzysx.setPosition(zzGr(zzyq7.zzYuT().getValue()));
                        break;
                    case 79:
                    case 80:
                        zzyq7.zzZ(1, false, "chart:legend");
                        break;
                    default:
                        zzyq7.zzYi("chart:legend", zzyq7.zzYuT().getLocalName());
                        break;
                }
            } else {
                zzysx.zzV(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
            }
        }
        while (zzyq7.zzYuT().zzQ("legend")) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 39) {
                zzyq7.zzYuT().zzk();
            } else {
                zzyq7.zzZ(1, true, "chart:legend");
            }
        }
        return zzysx;
    }

    private static String zzM(zzYQ7 zzyq7) {
        String value = "";
        while (zzyq7.zzYuT().zzi()) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 52) {
                zzyq7.zzYi("chart:categories", zzyq7.zzYuT().getLocalName());
            } else {
                value = zzyq7.zzYuT().getValue();
            }
        }
        return value;
    }

    private static zzYT6 zzN(zzYQ7 zzyq7) {
        zzYT6 zzyt6 = new zzYT6(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 25) {
                zzyt6.setStyleName(zzyq7.zzYuT().getValue());
            } else if (iZzTP == 71) {
                zzyt6.zzsQ(zzGs(zzyq7.zzYuT().getValue()));
            } else if (iZzTP != 72) {
                zzyq7.zzYi("chart:axis", zzyq7.zzYuT().getLocalName());
            } else {
                zzyt6.setName(zzyq7.zzYuT().getValue());
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ("axis")) {
            int iZzTP2 = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP2 == 33) {
                zzyt6.zzZ(zzS(zzyq7));
            } else if (iZzTP2 == 73) {
                zzyt6.zzGv(zzM(zzyq7));
            } else if (iZzTP2 != 74) {
                zzyq7.zzYuT().zzk();
            } else {
                zzZ(zzyt6, zzyq7);
            }
        }
        return zzyt6;
    }

    private static zzYT2 zzO(zzYQ7 zzyq7) {
        zzYT2 zzyt2 = new zzYT2(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 25) {
                zzyt2.setStyleName(zzyq7.zzYuT().getValue());
            } else if (iZzTP != 70) {
                zzyq7.zzYi("chart:data-point", zzyq7.zzYuT().getLocalName());
            } else {
                zzyt2.zzsP(zzyq7.zzYuT().zzb());
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ("data-point")) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 65) {
                zzyq7.zzYuT().zzk();
            } else {
                zzyt2.zzZ(zzP(zzyq7));
            }
        }
        return zzyt2;
    }

    private static zzYT4 zzP(zzYQ7 zzyq7) {
        zzYT4 zzyt4 = new zzYT4(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 25) {
                zzyt4.setStyleName(zzyq7.zzYuT().getValue());
            } else if (iZzTP == 36) {
                zzyt4.zzW(zzyq7.zzYuT().zz9());
            } else if (iZzTP != 37) {
                zzyq7.zzYi("data-label", zzyq7.zzYuT().getLocalName());
            } else {
                zzyt4.zzV(zzyq7.zzYuT().zz9());
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ("data-label")) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 39) {
                zzyq7.zzYuT().zzk();
            } else {
                zzyt4.setText(zzyq7.zzYuT().readString());
            }
        }
        return zzyt4;
    }

    private static String zzQ(zzYQ7 zzyq7) {
        String value = "";
        while (zzyq7.zzYuT().zzi()) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 52) {
                zzyq7.zzYi("chart:domain", zzyq7.zzYuT().getLocalName());
            } else {
                value = zzyq7.zzYuT().getValue();
            }
        }
        return value;
    }

    private static String zzR(zzYQ7 zzyq7) {
        String localName = zzyq7.zzYuT().getLocalName();
        String value = null;
        while (zzyq7.zzYuT().zzi()) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 25) {
                zzyq7.zzYi(localName, zzyq7.zzYuT().getLocalName());
            } else {
                value = zzyq7.zzYuT().getValue();
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ(localName)) {
            zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            zzyq7.zzYuT().zzk();
        }
        return value;
    }

    private static zzYSQ zzS(zzYQ7 zzyq7) {
        zzYSQ zzysq = new zzYSQ(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP != 25) {
                switch (iZzTP) {
                    case 36:
                        zzysq.zzW(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
                        break;
                    case 37:
                        zzysq.zzV(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
                        break;
                    case 38:
                        zzysq.zzGg(zzyq7.zzYuT().getValue());
                        break;
                    default:
                        zzyq7.zzYi("chart:title", zzyq7.zzYuT().getLocalName());
                        break;
                }
            } else {
                zzysq.setStyleName(zzyq7.zzYuT().getValue());
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ(NoteMeta.PROPERTY_TITLE)) {
            if (zzUR.zzTP(zzyq7.zzYuT().getLocalName()) != 39) {
                zzyq7.zzYuT().zzk();
            } else {
                zzysq.setText(zzyq7.zzYuT().readString());
            }
        }
        return zzysq;
    }

    private static zzYT7 zzT(zzYQ7 zzyq7) throws Exception {
        zzYT7 zzyt7 = new zzYT7(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 24:
                    zzyt7.setType(zzGp(zzyq7.zzYuT().getValue()));
                    break;
                case 25:
                    zzyt7.setStyleName(zzyq7.zzYuT().getValue());
                    break;
                case 26:
                    zzyt7.setHeight(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
                    break;
                case 27:
                    zzyt7.setWidth(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
                    break;
                case 28:
                case 29:
                    zzyq7.zzZ(1, false, "chart:chart");
                    break;
                default:
                    zzyq7.zzYi("chart:chart", zzyq7.zzYuT().getLocalName());
                    break;
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ("chart")) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 30:
                    zzyt7.zzZ(new zzYPI(zzyq7.zzYuS()));
                    zzYPC.zzZ(zzyq7, zzyt7.zzYxU());
                    break;
                case 31:
                    zzyt7.zzZ(zzL(zzyq7));
                    break;
                case 32:
                    zzyt7.zzZ(zzZ(zzyq7, zzyt7.getType()));
                    break;
                case 33:
                    zzyt7.zzZ(zzS(zzyq7));
                    break;
                case 34:
                case 35:
                    zzyq7.zzZ(1, true, "chart:chart");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
        return zzyt7;
    }

    private static zzYT7 zzU(zzYQ7 zzyq7) throws Exception {
        zzYT7 zzyt7ZzT = null;
        while (zzyq7.zzYuT().zzQ("chart")) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP != 4) {
                switch (iZzTP) {
                    case 11:
                        zzYOV.zzZO(zzyq7);
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        zzyq7.zzZ(1, true, "office:chart");
                        break;
                    default:
                        zzyq7.zzYuT().zzk();
                        break;
                }
            } else {
                zzyt7ZzT = zzT(zzyq7);
            }
        }
        return zzyt7ZzT;
    }

    private static zzYT7 zzV(zzYQ7 zzyq7) throws Exception {
        zzYT7 zzyt7ZzU = null;
        while (zzyq7.zzYuT().zzQ("body")) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 4:
                    zzyt7ZzU = zzU(zzyq7);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    zzyq7.zzZ(1, true, "office:body");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
        return zzyt7ZzU;
    }

    private static zzYT7 zzW(zzYQ7 zzyq7) throws Exception {
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn("/content.xml");
        if (zzyqoZzEn == null) {
            return null;
        }
        zzYPK.zzJ(zzyq7);
        zzYQ9 zzyq9 = new zzYQ9(zzyqoZzEn.zzYvo());
        zzyq7.zzT(zzyq9);
        zzYQ7.zzQ(zzyq7, "document-content");
        zzYT7 zzyt7ZzV = null;
        while (zzyq9.zzQ("document-content")) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP == 0) {
                zzYTM.zzZ(zzyq7, null);
            } else if (iZzTP == 1) {
                zzyt7ZzV = zzV(zzyq7);
            } else if (iZzTP == 2 || iZzTP == 3) {
                zzyq7.zzZ(1, true, "office:document-content");
            } else {
                zzyq9.zzk();
            }
        }
        return zzyt7ZzV;
    }

    public static zzYT7 zzY(com.aspose.words.internal.zzZOP zzzop, Document document) throws Exception {
        return zzW(new zzYQ7(zzzop, null, document));
    }

    private static zzYSW zzZ(zzYQ7 zzyq7, int i) {
        zzYSW zzysw = new zzYSW(zzyq7.zzYuS());
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 36) {
                zzysw.zzW(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
            } else if (iZzTP != 37) {
                switch (iZzTP) {
                    case 25:
                        zzysw.setStyleName(zzyq7.zzYuT().getValue());
                        break;
                    case 26:
                        zzysw.setHeight(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
                        break;
                    case 27:
                        zzysw.setWidth(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
                        break;
                    default:
                        switch (iZzTP) {
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                                zzyq7.zzZ(1, false, "chart:plot-area");
                                break;
                            default:
                                zzyq7.zzYi("chart:plot-area", zzyq7.zzYuT().getLocalName());
                                break;
                        }
                        break;
                }
            } else {
                zzysw.zzV(zzYSF.zzFV(zzyq7.zzYuT().getValue()));
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ("plot-area")) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 53:
                    zzysw.zzZ(zzN(zzyq7));
                    break;
                case 54:
                    zzysw.zzZ(zzY(zzyq7, i));
                    break;
                case 55:
                    zzysw.zzGm(zzR(zzyq7));
                    break;
                case 56:
                    zzysw.zzGl(zzR(zzyq7));
                    break;
                case 57:
                    zzysw.zzGn(zzR(zzyq7));
                    break;
                case 58:
                case 59:
                case 60:
                    zzyq7.zzZ(1, true, "chart:plot-area");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
        return zzysw;
    }

    private static zzYSS zzY(zzYQ7 zzyq7, int i) {
        zzYSS zzyss = new zzYSS(zzyq7.zzYuS());
        zzyss.zzsM(i);
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 24) {
                zzyss.zzsM(zzGp(zzyq7.zzYuT().getValue()));
            } else if (iZzTP != 25) {
                switch (iZzTP) {
                    case 61:
                        zzyss.zzGk(zzyq7.zzYuT().getValue());
                        break;
                    case 62:
                        zzyss.zzGj(zzyq7.zzYuT().getValue());
                        break;
                    case 63:
                        zzyss.zzGi(zzyq7.zzYuT().getValue());
                        break;
                    default:
                        zzyq7.zzYi("chart:series", zzyq7.zzYuT().getLocalName());
                        break;
                }
            } else {
                zzyss.setStyleName(zzyq7.zzYuT().getValue());
            }
        }
        zzyq7.zzYuT().zzj();
        while (zzyq7.zzYuT().zzQ("series")) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 64:
                    zzyss.zzYx3().add(zzO(zzyq7));
                    break;
                case 65:
                    zzyss.zzZ(zzP(zzyq7));
                    break;
                case 66:
                    zzyss.zzGh(zzQ(zzyq7));
                    break;
                case 67:
                case 68:
                case 69:
                    zzyq7.zzZ(1, true, "chart:series");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
        return zzyss;
    }

    private static void zzZ(zzYT6 zzyt6, zzYQ7 zzyq7) {
        String value = "";
        String value2 = "";
        while (zzyq7.zzYuT().zzi()) {
            int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
            if (iZzTP == 24) {
                value = zzyq7.zzYuT().getValue();
            } else if (iZzTP != 25) {
                zzyq7.zzYi("chart:grid", zzyq7.zzYuT().getLocalName());
            } else {
                value2 = zzyq7.zzYuT().getValue();
            }
        }
        int iZzTP2 = zzUR.zzTP(value);
        if (iZzTP2 == 75) {
            zzyt6.zzGu(value2);
        } else {
            if (iZzTP2 != 76) {
                return;
            }
            zzyt6.zzGt(value2);
        }
    }
}
