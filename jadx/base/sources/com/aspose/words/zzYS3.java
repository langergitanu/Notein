package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18385v2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS3 {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzXQs = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOc = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYH<String> zzXQr = new com.aspose.words.internal.zzZYH<>();
    private static com.aspose.words.internal.zzZYJ zzXQq = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQp = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOe = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQo = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ6C = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQn = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQm = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4N = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQl = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQk = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXQj = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNz = new com.aspose.words.internal.zzZYJ();

    static {
        zzZ4N.zzH("char", 3);
        zzZ4N.zzH("page", 1);
        zzZ4N.zzH("page-start-margin", 4);
        zzZ4N.zzH("page-end-margin", 5);
        zzXQm.zzH("portrait", 1);
        zzXQm.zzH("landscape", 2);
        zzXQn.zzH("bottom", 3);
        zzXQn.zzH("middle", 1);
        zzXQn.zzH("top", 0);
        zzXQn.zzH("auto", 4);
        zzZ6C.zzH("bottom", 3);
        zzZ6C.zzH("middle", 2);
        zzZ6C.zzH("top", 1);
        zzXQo.zzH("fixed", 1);
        zzXQo.zzH("variable", 2);
        zzYOe.zzH("", 0);
        zzYOe.zzH("roman", 1);
        zzYOe.zzH("swiss", 2);
        zzYOe.zzH("modern", 3);
        zzYOe.zzH("script", 4);
        zzYOe.zzH("decorative", 5);
        zzXQp.zzH("text", 2);
        zzXQp.zzH("page", 1);
        zzXQp.zzH("section", 0);
        zzXQp.zzH("document", 3);
        zzXQq.zzH("", 0);
        zzXQq.zzH("super", 1);
        zzXQq.zzH("sub", 2);
        zzXQs.zzH("az-cyrillic", EditingLanguage.AZERBAIJANI_CYRILLIC);
        zzXQs.zzH("az-AZ", EditingLanguage.AZERBAIJANI_LATIN);
        zzXQs.zzH("iu-CA", 2141);
        zzXQs.zzH("om-ET", EditingLanguage.OROMO);
        zzXQs.zzH("tg-TJ", EditingLanguage.TAJIK);
        zzXQs.zzH("none", 1024);
        zzXQs.zzH("zxx-none", 127);
        zzYOc.zzH("paragraph", 1);
        zzYOc.zzH("text", 2);
        zzXQr.zzY("Heading 1", "heading 1");
        zzXQr.zzY("Heading 2", "heading 2");
        zzXQr.zzY("Heading 3", "heading 3");
        zzXQr.zzY("Heading 4", "heading 4");
        zzXQr.zzY("Heading 5", "heading 5");
        zzXQr.zzY("Heading 6", "heading 6");
        zzXQr.zzY("Heading 7", "heading 7");
        zzXQr.zzY("Heading 8", "heading 8");
        zzXQr.zzY("Heading 9", "heading 9");
        zzXQr.zzY("Caption", "caption");
        zzXQr.zzY("Footer", "footer");
        zzXQr.zzY("Header", "header");
        zzXQr.zzY("Standard", "Standard");
        zzXQr.zzY("Internet link", "Hyperlink");
        zzXQr.zzY("Endnote text", "endnote text");
        zzXQr.zzY("Footnote text", "footnote text");
        zzXQr.zzY("Endnote reference", "endnote reference");
        zzXQr.zzY("Footnote reference", "footnote reference");
        zzXQl.zzH("1", 0);
        zzXQl.zzH("2", 1);
        zzXQl.zzH("3", 2);
        zzXQl.zzH("4", 3);
        zzXQl.zzH("5", 4);
        zzXQl.zzH("6", 5);
        zzXQl.zzH("7", 6);
        zzXQl.zzH("8", 7);
        zzXQl.zzH("9", 8);
        zzXQk.zzH("", 2);
        zzXQk.zzH("none", 0);
        zzXQk.zzH("segments", 1);
        zzXQk.zzH("rectangle", 3);
        zzXQj.zzH("Insertion", 0);
        zzXQj.zzH("Deletion", 1);
        zzXQj.zzH("FormatChange", 2);
        zzXQj.zzH("StyleDefinitionChange", 3);
        zzXQj.zzH("Moving", 4);
        zzYNz.zzH("nothing", 2);
        zzYNz.zzH("space", 1);
        zzYNz.zzH("listtab", 0);
        zzUR = new com.aspose.words.internal.zzZHW("distribute-letter", "distribute-space", "left", "right", "Word.Document.12", "Word.DocumentMacroEnabled.12", "Word.DocumentBinaryMacroEnabled.12", "Excel.Sheet.12", "Excel.SheetMacroEnabled.12", "Excel.SheetBinaryMacroEnabled.12", "PowerPoint.SlideShow.12", "PowerPoint.SlideShowMacroEnabled.12", "PowerPoint.SlideShowBinaryMacroEnabled.12", "PowerPoint.Slide.12", "PowerPoint.SlideMacroEnabled.12", "PowerPoint.SlideBinaryMacroEnabled.12", "F4754C9B-64F5-4B40-8AF4-679732AC0607", "18A06B6B-2F3F-4E2B-A611-52BE631B2D22", "00020832-0000-0000-C000-000000000046", "00020830-0000-0000-C000-000000000046", "00020833-0000-0000-C000-000000000046", "CF4F55F4-8F87-4D47-80BB-5808164BB3F8", "DC020317-E6E2-4A62-B9FA-B3EFE16626F4", "048EB43E-2059-422F-95E0-557DA96038AF", "3C18EAE4-BC25-4134-B7DF-1ECA1337DDDC", "application/vnd.oasis.opendocument.presentation", "application/vnd.oasis.opendocument.graphics", "application/vnd.oasis.opendocument.spreadsheet", "application/vnd.oasis.opendocument.text", "application/vnd.openxmlformats-officedocument.oleObject", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.oasis.opendocument.chart", "00020820-0000-0000-C000-000000000046", "00020906-0000-0000-C000-000000000046", "64818D10-4F9B-11CF-86EA-00AA00B929E8", "64818D11-4F9B-11CF-86EA-00AA00B929E8", "00030007-0000-0000-C000-000000000046", "0003000A-0000-0000-C000-000000000046", "0003000B-0000-0000-C000-000000000046", "0003000C-0000-0000-C000-000000000046", "0003000D-0000-0000-C000-000000000046", "0003000E-0000-0000-C000-000000000046", "0004C8D8-0000-0000-C000-000000000046", "EA7BAE70-FB3B-11CD-A903-00AA00510EA3", "EA7BAE71-FB3B-11CD-A903-00AA00510EA3", "75D01070-1234-44E9-82F6-DB5B39A47C13", "AA14F9C9-62B5-4637-8AC4-8F25BF29D5A7", "00020900-0000-0000-C000-000000000046", "1B261B22-AC6A-4E68-A870-AB5080E8687B", "00020901-0000-0000-C000-000000000046", "00020907-0000-0000-C000-000000000046", "912ABC52-36E2-4714-8E62-A8B73CA5E390", "00024500-0000-0000-C000-000000000046", "00020811-0000-0000-C000-000000000046", "00020821-0000-0000-C000-000000000046", "EABCECDB-CC1C-4A6F-B4E3-7F888A5ADFC8", "00020810-0000-0000-C000-000000000046", "D3E34B21-9D75-101A-8C3D-00AA001A1652", "0002CE03-0000-0000-C000-000000000046", "lines", "line", "standard", "curve", "3 5 0.028cm 0.057cm", "1 0.508cm 1 0.508cm 0.508cm", "2 0.051cm 3 0.254cm 0.127cm", "1 0.457cm", "1 2.007cm 10 0.057cm", "1 0.0197cm 0.0197cm", "1 197% 197%", "3 0.0197cm 3 0.01cm", "3 197% 3 100%", "1 0.005cm", "1 50%", "1 0.0197cm 0.012cm", "1 197% 120%", "2 1 0.203cm 0.203cm", "1 0.0197cm 0.0127cm", "1 197% 127%", "0 0 20 30m10 0-10 30h20z", "0 0 1321 3493m1321 3493h-1321l702-3493z", "0 0 1131 1918m737 1131h394l-564-1131-567 1131h398l-398 787h1131z", "0 0 1013 1130m1009 1050-449-1008-22-30-29-12-34 12-21 26-449 1012-5 13v8l5 21 12 21 17 13 21 4h903l21-4 21-13 9-21 4-21v-8z", "0 0 1131 902m564 0-564 902h1131z", "0 0 1131 2256m1127 2120-449-2006-9-42-25-39-38-25-38-8-43 8-38 25-25 39-9 42-449 2006v13l-4 9 9 42 25 38 38 25 42 9h903l42-9 38-25 26-38 8-42v-9z", "0 0 10 10m0 0h10v10h-10z", "0 0 1131 1131m0 564 564 567 567-567-567-564z", "0 0 836 110m0 0h278 278 280v36 36 38h-278-278-280v-36-36z", "0 0 1131 1131m462 1118-102-29-102-51-93-72-72-93-51-102-29-102-13-105 13-102 29-106 51-102 72-89 93-72 102-50 102-34 106-9 101 9 106 34 98 50 93 72 72 89 51 102 29 106 13 102-13 105-29 102-51 102-72 93-93 72-98 51-106 29-101 13z", "0 0 1122 2243m0 2108v17 17l12 42 30 34 38 21 43 4 29-8 30-21 25-26 13-34 343-1532 339 1520 13 42 29 34 39 21 42 4 42-12 34-30 21-42v-39-12l-4 4-440-1998-9-42-25-39-38-25-43-8-42 8-38 25-26 39-8 42z", "0 0 1131 1580m1013 1491 118 89-567-1580-564 1580 114-85 136-68 148-46 161-17 161 13 153 46z", "bitmap", "gradient", "solid", "hatch", "none", "axial", "linear", "rectangular", "ellipsoid", "radial", "square", "biggest", "dotted", "dashed", "double", "groove", "ridge", "outset", "inset", "tb-rl", "lr-tb-v", "tb-rl-v", "page-content", "paragraph-content", "page", "center", "inside", "outside", "char", "wave", "dash", "long-dash", "dot-dash", "dot-dot-dash", "end", "justify", "both");
    }

    public static String zz4(int i, int i2, int i3) {
        if (i == 0) {
            if (i2 == 3) {
                if (i3 == 0) {
                    return "bottom";
                }
                if (i3 == 1) {
                    return "middle";
                }
            }
            return "top";
        }
        if (i == 1) {
            if (i2 == 3) {
                if (i3 == 0) {
                    return "bottom";
                }
                if (i3 == 2) {
                    return "top";
                }
            }
            return "middle";
        }
        if (i != 2) {
            return null;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                return "top";
            }
            if (i3 == 1) {
                return "middle";
            }
        }
        return "bottom";
    }

    public static int zzEP(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 59 || iZzTP == 60) {
            return 2;
        }
        return iZzTP != 127 ? 0 : 1;
    }

    public static int zzEQ(String str) {
        return zzXQm.zzG(str, 1);
    }

    public static String zzER(String str) {
        return zzZc(str, 1);
    }

    public static String zzES(String str) {
        return zzZc(str, 0);
    }

    public static int zzET(String str) {
        int iZzG = zzXQs.zzG(str, -1);
        return iZzG == -1 ? com.aspose.words.internal.zzBM.zzYx(str) : iZzG;
    }

    public static String zzEU(String str) {
        String strZzDr = zzYOU.zzDr(str);
        return zzXQr.zzX(strZzDr, strZzDr);
    }

    public static int zzEV(String str) {
        return zzXQq.zzG(zzYOU.zzDn(str), 0);
    }

    public static int zzEW(String str) {
        int i = com.aspose.words.internal.zzJB.parseInt(str) % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        if (i >= 315 && i < 360) {
            return 4;
        }
        if (i >= 0 && i < 45) {
            return 4;
        }
        if (i < 45 || i >= 135) {
            return (i < 135 || i >= 315) ? 0 : 5;
        }
        return 3;
    }

    public static int zzEX(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 3) {
            return 2;
        }
        if (iZzTP == 116) {
            return 1;
        }
        if (iZzTP != 125) {
            return iZzTP != 126 ? 0 : 3;
        }
        return 2;
    }

    public static int zzEY(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 3) {
            return 2;
        }
        if (iZzTP != 116) {
            return iZzTP != 119 ? 0 : 3;
        }
        return 1;
    }

    public static int zzEZ(String str) {
        if ("center".equals(str)) {
            return 1;
        }
        return ("end".equals(str) || "right".equals(str)) ? 2 : 0;
    }

    public static int zzF0(String str) {
        if ("right".equals(str)) {
            return 2;
        }
        return "center".equals(str) ? 1 : 0;
    }

    public static int zzF1(String str) {
        if ("middle".equals(str)) {
            return 1;
        }
        return "bottom".equals(str) ? 2 : 0;
    }

    public static int zzF2(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 2) {
            return 1;
        }
        if (iZzTP == 3) {
            return 3;
        }
        switch (iZzTP) {
            case 116:
                return 2;
            case 117:
                return 4;
            case 118:
                return 5;
            default:
                return 0;
        }
    }

    public static int zzF3(String str) {
        return zzZ4N.zzG(str, 2);
    }

    public static int zzF4(String str) {
        return zzXQn.zzG(str, 2);
    }

    public static int zzF5(String str) {
        return zzZ6C.zzG(str, 0);
    }

    public static int zzF6(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 60) {
            return 3;
        }
        switch (iZzTP) {
            case 113:
            case 114:
                return 0;
            case 115:
                return 1;
            default:
                return 2;
        }
    }

    public static int zzF7(String str) {
        switch (zzUR.zzTP(str)) {
            case 110:
                return 1;
            case 111:
                return 4;
            case 112:
                return 5;
            default:
                return 0;
        }
    }

    public static int zzF8(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 95) {
            return 0;
        }
        switch (iZzTP) {
            case 103:
                return 6;
            case 104:
                return 7;
            case 105:
                return 3;
            case 106:
                return 24;
            case 107:
                return 25;
            case 108:
                return 26;
            case 109:
                return 27;
            default:
                return 1;
        }
    }

    public static int zzF9(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 2) {
            return 1;
        }
        if (iZzTP != 3) {
            return iZzTP != 102 ? 0 : 3;
        }
        return 2;
    }

    private static boolean zzFa(String str) {
        return "parallel".equals(str) || "dynamic".equals(str) || "left".equals(str) || "right".equals(str) || "biggest".equals(str);
    }

    public static int zzFb(String str) {
        if (zzFa(str)) {
            return 2;
        }
        return "none".equals(str) ? 1 : 3;
    }

    public static int zzFc(String str) {
        return zzXQp.zzG(str, 1);
    }

    public static int zzFd(String str) {
        return zzXQo.zzG(str, 0);
    }

    public static int zzFe(String str) {
        return zzYOe.zzG(str, 0);
    }

    public static int zzFf(String str) {
        return "page".equals(str) ? 2 : 0;
    }

    public static int zzFg(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 91) {
            return 0;
        }
        if (iZzTP != 92) {
            return iZzTP != 95 ? 5 : 3;
        }
        return 1;
    }

    private static String zzFh(String str) {
        return !com.aspose.words.internal.zzZYD.zzXk(str) ? "" : com.aspose.words.internal.zzZKN.format("{0} ", str);
    }

    public static int zzFi(String str) {
        switch (zzUR.zzTP(str)) {
            case 59:
            case 60:
                return 0;
            case 61:
                return 1;
            case 62:
                return 2;
            default:
                return 3;
        }
    }

    public static int zzFj(String str) {
        return zzXQk.zzG(str, 0);
    }

    public static String zzFk(String str) {
        int iZzTP = zzUR.zzTP(str.toUpperCase());
        switch (iZzTP) {
            case 16:
                return "Word.Document.12";
            case 17:
                return "Word.DocumentMacroEnabled.12";
            case 18:
                return "Excel.SheetMacroEnabled.12";
            case 19:
                return "Excel.Sheet.12";
            case 20:
                return "Excel.SheetBinaryMacroEnabled.12";
            case 21:
                return "PowerPoint.SlideShow.12";
            case 22:
                return "PowerPoint.SlideShowMacroEnabled.12";
            case 23:
                return "PowerPoint.Slide.12";
            case 24:
                return "PowerPoint.SlideMacroEnabled.12";
            default:
                switch (iZzTP) {
                    case 32:
                        return "Excel.Sheet.8";
                    case 33:
                        return "Word.Document.8";
                    case 34:
                        return "PowerPoint.SlideShow.8";
                    case 35:
                        return "PowerPoint.Slide.8";
                    case 36:
                        return "MSDraw";
                    case 37:
                        return "PBrush";
                    case 38:
                        return "Equation";
                    case 39:
                        return "Package";
                    case 40:
                        return "SoundRec";
                    case 41:
                        return "MPlayer";
                    case 42:
                        return "WPGraphic21";
                    case 43:
                        return "PowerPoint.Show.7";
                    case 44:
                        return "PowerPoint.Slide.7";
                    case 45:
                        return "PowerPoint.Template.12";
                    case 46:
                        return "PowerPoint.TemplateMacroEnabled.12";
                    case 47:
                        return "Word.Document.6";
                    case 48:
                        return "Word.OpenDocumentText.12";
                    case 49:
                        return "Word.Picture.6";
                    case 50:
                        return "Word.Picture.8";
                    case 51:
                        return "Word.Template.12";
                    case 52:
                        return "Excel.Application.12";
                    case 53:
                        return "Excel.Chart.5";
                    case 54:
                        return "Excel.Chart.8";
                    case 55:
                        return "Excel.OpenDocumentSpreadsheet.12";
                    case 56:
                        return "Excel.Sheet.5";
                    case 57:
                        return "Paint.Picture";
                    case 58:
                        return "Equation.DSMT4";
                    default:
                        return "Unknown";
                }
        }
    }

    public static String zzFl(String str) {
        switch (zzUR.zzTP(str)) {
            case 25:
                return "PowerPoint.OpenDocumentPresentation.12";
            case 26:
                return "opendocument.DrawDocument.1";
            case 27:
                return "Excel.OpenDocumentSpreadsheet.12";
            case 28:
            case 29:
            case 30:
                return "Word.OpenDocumentText.12";
            case 31:
                return "opendocument.ChartDocument.1";
            default:
                return "Unknown";
        }
    }

    public static String zzFm(String str) {
        switch (zzUR.zzTP(str.toUpperCase())) {
            case 16:
            case 17:
                return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
            case 18:
            case 19:
            case 20:
                return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            case 21:
            case 22:
                return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
            case 23:
            case 24:
                return "application/vnd.openxmlformats-officedocument.presentationml.slide";
            default:
                return "application/vnd.openxmlformats-officedocument.oleObject";
        }
    }

    public static String zzFn(String str) {
        switch (zzUR.zzTP(str)) {
            case 4:
            case 5:
            case 6:
                return "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
            case 7:
            case 8:
            case 9:
                return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            case 10:
            case 11:
            case 12:
                return "application/vnd.openxmlformats-officedocument.presentationml.presentation";
            case 13:
            case 14:
            case 15:
                return "application/vnd.openxmlformats-officedocument.presentationml.slide";
            default:
                return "application/vnd.openxmlformats-officedocument.oleObject";
        }
    }

    public static int zzFo(String str) {
        return zzYNz.zzXp(str);
    }

    public static int zzFp(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 1;
        }
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP != 2) {
            return iZzTP != 3 ? 0 : 4;
        }
        return 3;
    }

    public static String zzI(Style style) {
        if (style == null) {
            return "No_20_List";
        }
        int styleIdentifier = style.getStyleIdentifier();
        String strZzh = zzY8T.zzh(styleIdentifier, "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzh)) {
            return zzZd(com.aspose.words.internal.zzZYD.zzX8(zzXQr.zzS(strZzh, strZzh)), styleIdentifier);
        }
        if (styleIdentifier == 4094 && !com.aspose.words.internal.zzZYD.zzXk(style.getName())) {
            style.zz1(com.aspose.words.internal.zzZKN.format("UnnamedUserStyle{0}", Integer.valueOf(style.zzZ7j())), false);
        }
        return zzZd(style.getName(), styleIdentifier);
    }

    private static boolean zzRV(int i) {
        if (i == 20 || i == 23 || i == 55) {
            return true;
        }
        switch (i) {
            case 25:
            case 26:
            case 27:
                return true;
            default:
                return false;
        }
    }

    public static int zzS(String str, String str2, String str3, String str4) {
        boolean zEquals = "bold".equals(str2);
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 103) {
            return zEquals ? 20 : 4;
        }
        switch (iZzTP) {
            case 120:
                if (zEquals) {
                    return 27;
                }
                return "double".equals(str4) ? 43 : 11;
            case 121:
                return zEquals ? 23 : 7;
            case 122:
                return zEquals ? 55 : 39;
            case 123:
                return zEquals ? 25 : 9;
            case 124:
                return zEquals ? 26 : 10;
            default:
                if ("skip-white-space".equals(str3)) {
                    return 2;
                }
                if ("thick".equals(str2)) {
                    return 6;
                }
                if ("double".equals(str4)) {
                    return 3;
                }
                return ("solid".equals(str) || "single".equals(str4)) ? 1 : 0;
        }
    }

    public static zzYPR zzV(ShapeBase shapeBase, int i) {
        if (!shapeBase.zzYvW().contains(462)) {
            return new zzYPR();
        }
        switch (((Integer) shapeBase.zzYvW().zzPk(462)).intValue()) {
            case 1:
                return zzZ("Line_20_Style_20_9", i, "Line Style 9", "1", "197%", null, null, "120%");
            case 2:
                return zzZ("_32__20_Dots_20_1_20_Dash", i, "2 Dots 1 Dash", "2", null, "1", "0.203cm", "0.203cm");
            case 3:
                return zzZ("Fine_20_Dashed", i, "Fine Dashed", "1", "0.508cm", "1", "0.508cm", "0.508cm");
            case 4:
                return zzZ("Ultrafine_20_2_20_Dots_20_3_20_Dashes", i, "Ultrafine 2 Dots 3 Dashes", "2", "0.051cm", "3", "0.254cm", "0.127cm");
            case 5:
                return zzZ("Fine_20_Dotted", i, "Fine Dotted", "1", null, null, null, "0.457cm");
            case 6:
                return zzZ("Fine_20_Dashed_20__28_var_29_", i, "Fine Dashed (var)", "1", "197%", null, null, "197%");
            case 7:
                return zzZ("Fine_20_Dashed", i, "Fine Dashed", "1", "0.508cm", "1", "0.508cm", "0.508cm");
            case 8:
                return zzZ("Ultrafine_20_2_20_Dots_20_3_20_Dashes", i, "Ultrafine 2 Dots 3 Dashes", "2", "0.051cm", "3", "0.254cm", "0.127cm");
            case 9:
                return zzZ("Line_20_with_20_Fine_20_Dots", i, "Line with Fine Dots", "1", "2.007cm", "10", null, "0.057cm");
            case 10:
                return zzZ("Ultrafine_20_2_20_Dots_20_3_20_Dashes", i, "Ultrafine 2 Dots 3 Dashes", "2", "0.051cm", "3", "0.254cm", "0.127cm");
            default:
                return zzZ("Fine_20_Dotted", i, "Fine Dotted", "1", null, null, null, "0.457cm");
        }
    }

    public static String zzX(ListLevel listLevel, int i) {
        String numberFormat = listLevel.getNumberFormat();
        for (int i2 = 0; i2 <= i; i2++) {
            int iIndexOf = listLevel.getNumberFormat().indexOf((char) i2);
            if (iIndexOf != -1) {
                return listLevel.getNumberFormat().substring(0, iIndexOf);
            }
        }
        if (listLevel.getNumberStyle() == 255 && com.aspose.words.internal.zzZYD.zzXk(numberFormat)) {
            return numberFormat;
        }
        return null;
    }

    public static String zzY(boolean z, int i, int i2, int i3) {
        if (i == 0) {
            if (i2 == 3) {
                if (i3 == 2) {
                    return "right";
                }
                if (i3 == 1) {
                    return "center";
                }
            }
            if (z) {
                return "left";
            }
            return null;
        }
        if (i == 1) {
            if (i2 != 3) {
                return "center";
            }
            if (i3 == 2) {
                return "right";
            }
            if (i3 == 1) {
                return "center";
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 || i == 4) {
                return "justify";
            }
            return null;
        }
        if (i2 == 3) {
            if (i3 == 0) {
                return null;
            }
            if (i3 == 1) {
                return "center";
            }
        }
        return "right";
    }

    public static int zzY6(char c) {
        char upperCase = Character.toUpperCase(c);
        if (upperCase == 'A') {
            return 163;
        }
        if (upperCase == 'C') {
            return 1;
        }
        if (upperCase == 'H') {
            return 0;
        }
        if (upperCase == 'Q') {
            return 169;
        }
        if (upperCase == 'V') {
            return 0;
        }
        if (upperCase == 'Z') {
            return 3;
        }
        if (upperCase == 'L') {
            return 0;
        }
        if (upperCase == 'M') {
            return 2;
        }
        if (upperCase != 'S') {
            return upperCase != 'T' ? -1 : 169;
        }
        return 1;
    }

    public static int zzY7(char c) {
        if (c == 'F') {
            return 170;
        }
        if (c == 'Q') {
            return 169;
        }
        switch (c) {
            case 'A':
                return 163;
            case 'B':
                return 164;
            case 'C':
                return 1;
            default:
                switch (c) {
                    case 'L':
                        return 0;
                    case 'M':
                        return 2;
                    case 'N':
                        return 4;
                    default:
                        switch (c) {
                            case 'S':
                                return 171;
                            case 'T':
                                return 161;
                            case 'U':
                                return 162;
                            case 'V':
                                return 166;
                            case 'W':
                                return 165;
                            case 'X':
                                return 167;
                            case 'Y':
                                return 168;
                            case 'Z':
                                return 3;
                            default:
                                return -1;
                        }
                }
        }
    }

    public static int zzYm(String str, String str2) {
        int iZzTP;
        if (CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR.equals(str2)) {
            return 2;
        }
        if (".".equals(str2)) {
            return 1;
        }
        if (!C18115b5.CONNECTOR.equals(str2) && (iZzTP = zzUR.zzTP(str)) != 93) {
            if (iZzTP == 103) {
                return 1;
            }
            switch (iZzTP) {
                case 120:
                    break;
                case 121:
                case 122:
                case 123:
                case 124:
                    return 2;
                default:
                    return 0;
            }
        }
        return 3;
    }

    private static zzYPR zzZ(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        zzYPR zzypr = new zzYPR();
        zzypr.setName(com.aspose.words.internal.zzZKN.format("{0}{1}", str, Integer.valueOf(i)));
        zzypr.setDisplayName(str2);
        zzypr.zzDZ(str3);
        zzypr.zzDY(str4);
        zzypr.zzDX(str5);
        zzypr.zzDW(str6);
        zzypr.zzDV(str7);
        return zzypr;
    }

    private static String zzZc(String str, int i) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, '-');
            if (strArrZzR.length == 2) {
                return strArrZzR[i];
            }
            if (strArrZzR.length == 1 && i == 0) {
                return strArrZzR[0];
            }
        }
        return null;
    }

    private static String zzZd(String str, int i) {
        int iZzAP = zzY8T.zzAP(zzXQr.zzX(str, str));
        if (i == 4094 && iZzAP != 4094) {
            str = com.aspose.words.internal.zzZKN.format("{0}{1}", str, " (user)");
        }
        return zzYOU.zzDq(str);
    }

    public static String zzZe(String str, int i) {
        int i2 = i + 1;
        for (int i3 = 0; i3 < i; i3++) {
            if (str.indexOf((char) i3) == -1) {
                i2--;
            }
        }
        if (i2 == 1) {
            return null;
        }
        return Integer.toString(i2);
    }

    public static String zzZf(String str, int i) {
        int iIndexOf = str.indexOf((char) i);
        if (iIndexOf == -1 || iIndexOf >= str.length() - 1) {
            return null;
        }
        return str.substring(iIndexOf + 1);
    }

    public static String zzs3(int i) {
        return zzXQm.zzO(i, "portrait");
    }

    public static String zzs4(int i) {
        String strZzO = zzXQs.zzO(i, "");
        return "".equals(strZzO) ? com.aspose.words.internal.zzBM.zzVn(i) : strZzO;
    }

    public static String zzs5(int i) {
        return zzYOc.zzO(i, "paragraph");
    }

    public static String zzs6(int i) {
        return zzXQq.zzO(i, "");
    }

    public static String zzs7(int i) {
        if (i == 3) {
            return "90";
        }
        if (i == 4) {
            return "0";
        }
        if (i != 5) {
            return null;
        }
        return "270";
    }

    public static String zzs8(int i) {
        if (i == 0) {
            return "none";
        }
        if (i == 1 || i == 2 || i == 3) {
            return "solid";
        }
        if (i == 4) {
            return "dotted";
        }
        if (i == 6) {
            return "solid";
        }
        if (i == 7) {
            return "dash";
        }
        if (i == 20) {
            return "dotted";
        }
        if (i == 23) {
            return "dash";
        }
        if (i == 39) {
            return "long-dash";
        }
        if (i == 43) {
            return "wave";
        }
        if (i == 55) {
            return "long-dash";
        }
        switch (i) {
            case 9:
                return "dot-dash";
            case 10:
                return "dot-dot-dash";
            case 11:
                return "wave";
            default:
                switch (i) {
                    case 25:
                        return "dot-dash";
                    case 26:
                        return "dot-dot-dash";
                    case 27:
                        return "wave";
                    default:
                        return null;
                }
        }
    }

    public static String zzs9(int i) {
        if (i == 6) {
            return "thick";
        }
        if (zzRV(i)) {
            return "bold";
        }
        return null;
    }

    public static String zzsA(int i) {
        if (i == 0) {
            return "center";
        }
        if (i == 1) {
            return "distribute-letter";
        }
        if (i == 2) {
            return "distribute-space";
        }
        if (i == 3) {
            return "left";
        }
        if (i != 4) {
            return null;
        }
        return "right";
    }

    public static String zzsa(int i) {
        if (i == 0) {
            return "none";
        }
        if (i == 1) {
            return "dotted";
        }
        if (i == 2) {
            return "dash";
        }
        if (i == 3 || i == 4) {
            return "solid";
        }
        if (i != 5) {
            return null;
        }
        return "dotted";
    }

    public static String zzsb(int i) {
        if (i == 1) {
            return ".";
        }
        if (i == 2) {
            return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        }
        if (i == 3 || i == 4) {
            return C18115b5.CONNECTOR;
        }
        if (i != 5) {
            return null;
        }
        return ".";
    }

    public static String zzsc(int i) {
        if (i == 0) {
            return "start";
        }
        if (i == 1) {
            return "center";
        }
        if (i != 2) {
            return null;
        }
        return "end";
    }

    public static String zzsd(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Arrow";
        }
        if (i == 2) {
            return "Stealth";
        }
        if (i == 3) {
            return "Diamond";
        }
        if (i == 4) {
            return "Oval";
        }
        if (i != 5) {
            return null;
        }
        return "Open";
    }

    public static String zzse(int i) {
        return i == 1 ? "center" : i == 2 ? "right" : "left";
    }

    public static String zzsf(int i) {
        if (i == 0) {
            return "from-left";
        }
        if (i == 1) {
            return "left";
        }
        if (i == 2) {
            return "center";
        }
        if (i == 3) {
            return "right";
        }
        if (i == 4) {
            return "inside";
        }
        if (i != 5) {
            return null;
        }
        return "outside";
    }

    public static String zzsg(int i) {
        return zzZ4N.zzO(i, "paragraph");
    }

    public static String zzsh(int i) {
        return zzXQn.zzO(i, "");
    }

    public static String zzsi(int i) {
        return zzZ6C.zzO(i, "from-top");
    }

    public static String zzsj(int i) {
        return i != 0 ? i != 1 ? i != 3 ? "paragraph" : "line" : "page" : "page-content";
    }

    public static double zzsk(int i) {
        if (i == 0 || i == 65535) {
            return 0.0d;
        }
        switch (i) {
            case 2:
                return 0.05d;
            case 3:
                return 0.1d;
            case 4:
                return 0.2d;
            case 5:
                return 0.25d;
            case 6:
                return 0.3d;
            case 7:
                return 0.4d;
            case 8:
                return 0.5d;
            case 9:
                return 0.6d;
            case 10:
                return 0.7d;
            case 11:
                return 0.75d;
            case 12:
                return 0.8d;
            case 13:
                return 0.9d;
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
            case 24:
            case 25:
                return 0.33d;
            default:
                switch (i) {
                    case 35:
                        return 0.025d;
                    case 36:
                        return 0.075d;
                    case 37:
                        return 0.125d;
                    case 38:
                        return 0.15d;
                    case 39:
                        return 0.175d;
                    case 40:
                        return 0.225d;
                    case 41:
                        return 0.275d;
                    case 42:
                        return 0.325d;
                    case 43:
                        return 0.35d;
                    case 44:
                        return 0.375d;
                    case 45:
                        return 0.425d;
                    case 46:
                        return 0.45d;
                    case 47:
                        return 0.475d;
                    case 48:
                        return 0.525d;
                    case 49:
                        return 0.55d;
                    case 50:
                        return 0.575d;
                    case 51:
                        return 0.625d;
                    case 52:
                        return 0.65d;
                    case 53:
                        return 0.675d;
                    case 54:
                        return 0.725d;
                    case 55:
                        return 0.775d;
                    case 56:
                        return 0.825d;
                    case 57:
                        return 0.85d;
                    case 58:
                        return 0.875d;
                    case 59:
                        return 0.925d;
                    case 60:
                        return 0.95d;
                    case 61:
                        return 0.975d;
                    default:
                        return 1.0d;
                }
        }
    }

    public static String zzsl(int i) {
        switch (i) {
            case 0:
                return "none";
            case 1:
            case 2:
            case 4:
            case 5:
            case 10:
            case 20:
            case 23:
            default:
                return "solid";
            case 3:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
                return "double";
            case 6:
                return "dotted";
            case 7:
            case 8:
            case 9:
            case 22:
                return "dashed";
            case 24:
                return "groove";
            case 25:
                return "ridge";
            case 26:
                return "outset";
            case 27:
                return "inset";
        }
    }

    public static String zzsm(int i) {
        return zzXQp.zzO(i, "");
    }

    public static String zzsn(int i) {
        return zzXQo.zzO(i, "");
    }

    public static String zzso(int i) {
        return zzYOe.zzO(i, "");
    }

    public static String zzsp(int i) {
        return i == 2 ? "page" : "document";
    }

    public static String zzsq(int i) {
        switch (i) {
            case 4:
            case 6:
                return "rectangular";
            case 5:
                return "square";
            case 7:
            case 8:
                return "linear";
            default:
                return null;
        }
    }

    public static String zzsr(int i) {
        if (i == 0) {
            return "solid";
        }
        switch (i) {
            case 3:
                return "bitmap";
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return "gradient";
            default:
                return null;
        }
    }

    public static String zzss(int i) {
        return i != 0 ? i != 1 ? i != 3 ? "solid" : "none" : "gradient" : "bitmap";
    }

    public static String zzst(int i) {
        if (i == 0) {
            return "boolean";
        }
        if (i == 1) {
            return "date";
        }
        if (i == 2 || i == 3) {
            return "float";
        }
        return null;
    }

    public static String zzsu(int i) {
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return "tb-rl";
        }
        if (i != 3) {
            return i != 4 ? i != 5 ? i != 7 ? "page" : "tb-lr-v" : "tb-rl-v" : "lr-tb-v";
        }
        return null;
    }

    public static String zzsv(int i) {
        if (i == 0) {
            return "line";
        }
        if (i == 2) {
            return "curve";
        }
        return null;
    }

    public static String zzsw(int i) {
        if (i == -1 || i == 0) {
            return "L";
        }
        if (i == 1) {
            return "C";
        }
        if (i == 2) {
            return "M";
        }
        if (i == 3) {
            return "Z";
        }
        if (i == 4) {
            return "N";
        }
        switch (i) {
            case 161:
                return "T";
            case 162:
                return "U";
            case 163:
                return C18385v2.f56336h;
            case 164:
                return "B";
            case 165:
                return "W";
            case 166:
                return "V";
            case 167:
                return "X";
            case 168:
                return "Y";
            case 169:
                return "Q";
            case 170:
                return "F";
            case 171:
                return "S";
            default:
                return "";
        }
    }

    public static String zzsx(int i) {
        return zzXQk.zzO(i, "none");
    }

    public static String zzsy(int i) {
        return zzXQj.zzO(i, "none");
    }

    public static String zzsz(int i) {
        return zzYNz.getValue(i);
    }

    private static boolean zzY(int i, int i2, ShapeBase shapeBase) {
        return ((shapeBase.zzYvW().zzPk(EditingLanguage.ARABIC_LIBYA) == null) && (shapeBase.getParentParagraph() != null && shapeBase.getParentParagraph().isInCell()) && i2 == 0) || (i == 3 && i2 == 0) || i == 5;
    }

    public static String zzY(int i, IWarningCallback iWarningCallback) {
        if (i == 0) {
            return "left";
        }
        if (i == 1) {
            return "center";
        }
        if (i == 2) {
            return "right";
        }
        if (i == 3) {
            return "char";
        }
        if (i == 6) {
            return "left";
        }
        if (iWarningCallback == null) {
            return null;
        }
        iWarningCallback.warning(new WarningInfo(65536, 15, com.aspose.words.internal.zzZKN.format("Tab alignment '{0}' is not supported by ODT.", Integer.valueOf(i))));
        return null;
    }

    public static int zzZ(String str, zzYPR zzypr) {
        if ("solid".equals(str) || !"dash".equals(str) || zzypr == null) {
            return 0;
        }
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.format("{0}{1}{2}{3}{4}", zzFh(zzypr.zzYub()), zzFh(zzypr.zzYua()), zzFh(zzypr.zzYu9()), zzFh(zzypr.zzYu8()), com.aspose.words.internal.zzZKN.zzTX(zzFh(zzypr.zzYu7()))))) {
        }
        return 0;
    }

    public static void zzZ(zzYQ7 zzyq7, String str, zzYC3 zzyc3, boolean z) {
        zzYR1 zzyr1 = (zzYR1) zzyq7.zzYuS().zzY(zzYOU.zzDr(str), null, false, false);
        if (zzyr1 == null) {
            return;
        }
        int i = 4;
        switch (zzUR.zzTP(com.aspose.words.internal.zzZKN.format("{0}{1}", zzyr1.zzYvA(), zzyr1.zzYvz()))) {
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            default:
                i = 1;
                break;
            case 85:
            case 86:
                i = 3;
                break;
            case 87:
                zzyc3.zzQ(z ? 467 : 469, 0);
                zzyc3.zzQ(z ? 466 : 468, 2);
                break;
            case 88:
                break;
            case 89:
                i = 5;
                break;
            case 90:
                i = 2;
                break;
        }
        zzyc3.zzQ(z ? 464 : 465, Integer.valueOf(i));
    }

    public static int zzZ(String str, zzYRP zzyrp) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 91) {
            return 3;
        }
        if (iZzTP != 92) {
            return 0;
        }
        return zzZ(zzyrp);
    }

    private static int zzZ(zzYRP zzyrp) {
        if (zzyrp == null) {
            return 4;
        }
        switch (zzUR.zzTP(zzyrp.zzG7())) {
        }
        return 4;
    }

    public static String zzZ(int i, int i2, ShapeBase shapeBase) {
        if (i == 1) {
            return "none";
        }
        if (zzY(i, i2, shapeBase)) {
            return "run-through";
        }
        if (i2 == 1) {
            return "left";
        }
        if (i2 == 2) {
            return "right";
        }
        if (i2 == 3) {
            return "biggest";
        }
        if (i == 2 || i == 4) {
            return "parallel";
        }
        return null;
    }
}
