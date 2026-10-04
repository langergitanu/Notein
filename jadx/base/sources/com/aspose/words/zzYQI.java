package com.aspose.words;

import com.aspose.words.ref.RefInt;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQI {
    private static double zzXNO = com.aspose.words.internal.zzSA.zzi(31.0d);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("column", "column-sep", "rel-width", "start-indent", "end-indent", "space-before", "space-after", "style", "width", "height", "vertical-align", "color", "columns", "background-image", "footnote-sep", "num-format", "page-width", "page-height", "print-orientation", "writing-mode", "shadow", "background-color", "layout-grid-standard-mode", "layout-grid-mode", "layout-grid-lines", "layout-grid-base-height", "layout-grid-ruby-height", "border-line-width", "border-line-width-bottom", "border-line-width-left", "border-line-width-right", "border-line-width-top", "first-page-number", "footnote-max-height", "layout-grid-base-width", "layout-grid-color", "layout-grid-display", "layout-grid-print", "layout-grid-ruby-below", "layout-grid-snap-to", "num-letter-sync", "num-prefix", "num-suffix", "paper-tray-name", "print", "print-page-order", "register-truth-ref-style-name", "scale-to", "scale-to-pages", "table-centering");

    private static void zz7(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("background-image")) {
            if ("binary-data".equals(zzyq7.zzYuT().getLocalName())) {
                zzyq7.zzZ(1, true, "style:background-image");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zz8(zzYQ7 zzyq7) throws Exception {
        Shape shape = new Shape(zzyq7.getDocument(), 75);
        zzYTL.zzZ(zzyq7, shape, "background-image");
        zz7(zzyq7);
        if (shape.getImageData().zzZjT()) {
            zzyq7.getDocument().zzO(shape);
            zzyq7.getDocument().getViewOptions().setDisplayBackgroundShape(true);
        }
    }

    private static void zz9(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    zzyq7.zzZ(256, false, "style:column-sep");
                    break;
                default:
                    zzyq7.zzYi("style:column-sep", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzX(zzYQ7 zzyq7, zzYCZ zzycz) {
        zzZ4Z zzz4zZzYuB = zzyq7.zzYuB();
        if (zzz4zZzYuB == null || !TelemetryEventStrings.Value.TRUE.equals(zzz4zZzYuB.zzYPu())) {
            return;
        }
        zzycz.zzQ(2120, 1);
        if (com.aspose.words.internal.zzZYD.zzXk(zzz4zZzYuB.zzYPt())) {
            zzycz.zzQ(2120, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(zzz4zZzYuB.zzYPt())));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzz4zZzYuB.zzYPs())) {
            zzycz.zzQ(2400, Integer.valueOf(zzYSF.zzFX(zzz4zZzYuB.zzYPs())));
        }
        if (TelemetryEventStrings.Value.TRUE.equals(zzz4zZzYuB.zzYPr())) {
            zzycz.zzQ(EditingLanguage.MALAY_BRUNEI_DARUSSALAM, 0);
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzYCZ zzycz) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("page-layout-properties")) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 12:
                    zzZ(zzyq7, zzycz);
                    break;
                case 13:
                    zz8(zzyq7);
                    break;
                case 14:
                    zzyq7.zzZ(256, true, "style:page-layout-properties");
                    break;
                default:
                    zzyq9ZzYuT.zzk();
                    break;
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYQK zzyqk) throws Exception {
        zzYCZ zzycz = new zzYCZ();
        zzZ(zzyq7, zzyqk, zzycz);
        zzZ(zzycz, zzyqk);
        zzZ(zzyqk, zzyq7, zzycz);
        zzY(zzyq7, zzycz);
        if (zzycz.getCount() > 0) {
            zzyqk.zzY(zzycz);
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYCZ zzycz) {
        com.aspose.words.internal.zzDB zzdb = new com.aspose.words.internal.zzDB();
        zzZ(zzycz, zzyq7.zzYuT());
        RefInt refInt = new RefInt(0);
        RefInt refInt2 = new RefInt(0);
        zzZ(zzyq7, zzycz, zzdb, refInt, refInt2);
        zzZ(zzycz, refInt.get(), refInt2.get(), zzdb);
    }

    private static boolean zzX(double d, double d2, boolean z) {
        double d3 = zzXNO;
        return d > d3 && d2 <= d3 && z;
    }

    private static void zzZ(zzYCZ zzycz, int i, int i2, com.aspose.words.internal.zzDB zzdb) {
        zzY5Y zzy5yZzYcn = zzycz.zzYcn();
        int count = zzy5yZzYcn.getCount();
        if (count > 0) {
            int i3 = count - 1;
            zzy5yZzYcn.get(i3).zzjL(zzy5yZzYcn.get(i3).zzXW2() - i);
        }
        double pageWidth = i2 / ((zzycz.getPageWidth() - zzycz.zzZRi()) - zzycz.zzZRh());
        if (pageWidth <= 0.0d) {
            pageWidth = 1.0d;
        }
        int i4 = 0;
        while (i4 < count) {
            TextColumn textColumn = zzy5yZzYcn.get(i4);
            textColumn.zzjM((((int) (((double) textColumn.zzXW3()) / pageWidth)) - zzdb.get(i4)) - (i4 < count + (-1) ? textColumn.zzXW2() - zzdb.get(i4 + 1) : 0));
            i4++;
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYCZ zzycz, com.aspose.words.internal.zzDB zzdb, RefInt refInt, RefInt refInt2) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzycz.zzY(new zzY5Y());
        while (zzyq9ZzYuT.zzQ("columns")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                TextColumn textColumnZzZ = zzZ(zzyq7, zzycz, zzdb, refInt);
                zzycz.zzYcn().zzZ(textColumnZzZ);
                refInt2.set(textColumnZzZ.zzXW3() + refInt2.get());
            } else if (iZzTP != 1) {
                zzyq9ZzYuT.zzk();
            } else {
                zzycz.zzR0(true);
                zz9(zzyq7);
            }
        }
    }

    private static void zzZ(zzYCZ zzycz, zzYQ9 zzyq9) {
        zzycz.zzmx(0);
        zzycz.zzQZ(false);
        while (zzyq9.zzi()) {
            if ("column-count".equals(zzyq9.getLocalName())) {
                zzycz.zzmy(zzyq9.zzb());
            } else if ("column-gap".equals(zzyq9.getLocalName())) {
                zzycz.zzmx(zzYSF.zzFX(zzyq9.getValue()));
                zzycz.zzQZ(true);
            }
        }
    }

    private static TextColumn zzZ(zzYQ7 zzyq7, zzYCZ zzycz, com.aspose.words.internal.zzDB zzdb, RefInt refInt) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        TextColumn textColumn = new TextColumn();
        int iZzFX = 0;
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 2) {
                if (value.indexOf(42) != -1) {
                    zzyq7.zzv("style:column", "style:rel-width", "number followed by a '*' character");
                }
                textColumn.zzjM(com.aspose.words.internal.zzJB.zzZv(value.replace(C18358t1.g.f56183c, "")));
            } else if (iZzTP == 3) {
                iZzFX = zzYSF.zzFX(value);
                if (zzycz.zzYcn().getCount() > 0) {
                    zzycz.zzYcn().get(zzycz.zzYcn().getCount() - 1).zzjL(zzycz.zzYcn().get(zzycz.zzYcn().getCount() - 1).zzXW2() + iZzFX);
                }
            } else if (iZzTP == 4) {
                refInt.set(zzYSF.zzFX(value));
                textColumn.zzjL(textColumn.zzXW2() + zzYSF.zzFX(value));
            } else if (iZzTP != 5 && iZzTP != 6) {
                zzyq7.zzYi("style:column", zzyq9ZzYuT.getLocalName());
            } else {
                zzyq7.zzZ(256, false, "style:column");
            }
        }
        zzdb.add(iZzFX);
        return textColumn;
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQK zzyqk, zzYCZ zzycz) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            String localName = zzyq9ZzYuT.getLocalName();
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyqk.zzYvh()) && !zzYQ7.zzZ(zzyq9ZzYuT, zzyqk.zzYvQ()) && !zzYQ7.zzZ(zzyq9ZzYuT, zzyqk.zzYvg())) {
                String value = zzyq9ZzYuT.getValue();
                switch (zzUR.zzTP(localName)) {
                    case 15:
                        if (!"1".equals(value)) {
                            zzycz.setPageNumberStyle(zzYQU.zzEo(value));
                        }
                        break;
                    case 16:
                        zzycz.setSectionAttr(2260, Integer.valueOf(zzYSF.zzFX(value)));
                        break;
                    case 17:
                        zzycz.setSectionAttr(2270, Integer.valueOf(zzYSF.zzFX(value)));
                        break;
                    case 18:
                        zzycz.setSectionAttr(2210, Integer.valueOf(zzYS3.zzEQ(value)));
                        break;
                    case 19:
                        zzZ(zzyq7, zzycz, value);
                        break;
                    case 20:
                        zzyqk.zzUA(zzYOU.zzDp(value));
                        break;
                    case 21:
                        zzyq7.getDocument().setPageColor(zzYOU.zzDu(value).zzPG());
                        break;
                    case 22:
                        zzyqk.zzSn(zzyq9ZzYuT.zz8());
                        break;
                    case 23:
                        zzycz.setSectionAttr(2430, Integer.valueOf(zzYS3.zzEP(value)));
                        break;
                    case 24:
                        zzyqk.zzrS(zzyq9ZzYuT.zzb());
                        break;
                    case 25:
                        zzyqk.zzrR(zzYSF.zzFX(value));
                        break;
                    case 26:
                        zzyqk.zzrQ(zzYSF.zzFX(value));
                        break;
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
                    case 38:
                    case 39:
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
                        zzyq7.zzZ(256, false, "style:page-layout-properties");
                        break;
                    default:
                        zzyq7.zzYi("style:page-layout-properties", localName);
                        break;
                }
            }
        }
        zzX(zzyq7, zzycz);
    }

    private static void zzZ(zzYQK zzyqk, zzYQ7 zzyq7, zzYCZ zzycz) {
        int iZzYvb;
        int pageHeight;
        int iZzZRf;
        if (zzycz.zzYLd() == 0) {
            return;
        }
        zzYQK zzyqk2 = (zzYQK) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzYtZ(), zzYQK.class);
        if (zzyqk2 != null && zzyqk2.zzYvd()) {
            iZzYvb = zzyqk.zzYvb();
        } else {
            iZzYvb = zzyqk.zzYvb() + zzyqk.zzYva();
        }
        if (iZzYvb == 0 && zzyqk.zzYvc() != 0) {
            int iZzYLa = zzycz.zzYLa();
            if (iZzYLa != 0 && iZzYLa != 4) {
                pageHeight = zzycz.getPageWidth() - zzycz.zzZRi();
                iZzZRf = zzycz.zzZRh();
            } else {
                pageHeight = zzycz.getPageHeight() - zzycz.zzZRg();
                iZzZRf = zzycz.zzZRf();
            }
            iZzYvb = (pageHeight - iZzZRf) / zzyqk.zzYvc();
        }
        if (iZzYvb != 0) {
            zzycz.zzvE(iZzYvb);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzZ9E zzz9e, String str) {
        if ("page".equals(str)) {
            zzyq7.zzv("style:page-layout-properties", "style:writing-mode", "page");
            return;
        }
        if (!"tb-rl".equals(str) && !"tb".equals(str) && !"tb-lr".equals(str)) {
            if (!"rl-tb".equals(str) && !"rl".equals(str)) {
                if ("lr-tb".equals(str) || "lr".equals(str)) {
                    zzz9e.setSectionAttr(2450, Boolean.FALSE);
                    return;
                }
                return;
            }
            zzz9e.setSectionAttr(2440, 0);
            zzz9e.setSectionAttr(2450, Boolean.TRUE);
            return;
        }
        zzz9e.setSectionAttr(2440, 1);
    }

    private static void zzZ(zzYCZ zzycz, zzYQK zzyqk) {
        zzYTH zzythZzYvh = zzyqk.zzYvh();
        zzYQL zzyqlZzYvg = zzyqk.zzYvg();
        zzYR2 zzyr2ZzYvQ = zzyqk.zzYvQ();
        if (zzZ(zzyqlZzYvg, zzyr2ZzYvQ)) {
            zzycz.zzYcq();
        }
        zzZ(zzycz, zzyqk, 2130, 2300, zzythZzYvh.zzYy8(), zzyqlZzYvg.zzYvl(), zzyr2ZzYvQ.zzYvB().zzYsU(), zzyr2ZzYvQ.zzYvB().zzYsS());
        zzZ(zzycz, zzyqk, 2150, 2310, zzythZzYvh.zzYy7(), zzyqlZzYvg.zzYvk(), zzyr2ZzYvQ.zzYvB().zzYsT(), zzyr2ZzYvQ.zzYvB().zzYsR());
        zzZ(zzycz, zzyqk, 2140, 2280, zzythZzYvh.zzYy6(), zzyqlZzYvg.zzYvj(), zzyr2ZzYvQ.zzYvC().zzYvO(), zzyr2ZzYvQ.zzYvC().zzYvM());
        zzZ(zzycz, zzyqk, 2160, 2290, zzythZzYvh.zzYy5(), zzyqlZzYvg.zzYvi(), zzyr2ZzYvQ.zzYvC().zzYvN(), zzyr2ZzYvQ.zzYvC().zzYvL());
    }

    private static void zzZ(zzYCZ zzycz, zzYQK zzyqk, int i, int i2, zzYTJ zzytj, double d, double d2, boolean z) {
        double d3;
        Border border = new Border();
        if (zzytj != null) {
            border.zzOV(zzytj.getLineStyle());
            border.zzm(zzytj.zzZy());
            border.zzOU(zzYOU.zzZ(border, zzytj.zzYyc()));
        }
        if (d > zzXNO || zzycz.getBorderDistanceFrom() == 1) {
            double d4 = zzXNO;
            if (d2 > d4 || !z) {
                d = d4;
                d3 = d2;
            } else {
                zzycz.zzYcq();
                d3 = d;
                d = d2;
            }
        } else {
            d3 = d2;
        }
        border.setDistanceFromText(com.aspose.words.internal.zzAN.zzZG(28.34645669291339d * d));
        border.setShadow(zzyqk.zzYN4());
        if (border.equals(Border.zzZCe)) {
            border.zzYN(true);
        }
        zzycz.zzQ(i, border);
        if (z) {
            zzycz.setSectionAttr(i2, Integer.valueOf(com.aspose.words.internal.zzSA.zzu(d3 + d) + (zzytj == null ? 0 : com.aspose.words.internal.zzSA.zzYF(border.zz8L()))));
        }
    }

    private static boolean zzZ(zzYQL zzyql, zzYR2 zzyr2) {
        return zzX(zzyql.zzYvl(), zzyr2.zzYvB().zzYsU(), zzyr2.zzYvB().zzYsS()) || zzX(zzyql.zzYvk(), zzyr2.zzYvB().zzYsT(), zzyr2.zzYvB().zzYsR()) || zzX(zzyql.zzYvj(), zzyr2.zzYvC().zzYvO(), zzyr2.zzYvC().zzYvM()) || zzX(zzyql.zzYvi(), zzyr2.zzYvC().zzYvN(), zzyr2.zzYvC().zzYvL());
    }
}
