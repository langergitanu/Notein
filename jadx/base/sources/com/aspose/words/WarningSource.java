package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class WarningSource {
    public static final int CHM = 24;
    public static final int DOC = 10;
    public static final int DOCX = 9;
    public static final int DRAWING_ML = 2;
    public static final int EPUB = 25;
    public static final int FONT = 21;
    public static final int HTML = 16;
    public static final int IMAGE = 8;
    public static final int LAYOUT = 1;
    public static final int MARKDOWN = 23;
    public static final int MATH_ML = 20;
    public static final int METAFILE = 5;
    public static final int NRX = 14;
    public static final int ODT = 15;
    public static final int OFFICE_MATH = 3;
    public static final int PDF = 7;
    public static final int RTF = 12;
    public static final int SHAPES = 4;
    public static final int SVG = 22;
    public static final int SVM = 19;
    public static final int TEXT = 11;
    public static final int UNKNOWN = 0;
    public static final int VALIDATOR = 17;
    public static final int WORD_ML = 13;
    public static final int XAML = 18;
    public static final int XLSX = 27;
    public static final int XML = 26;
    public static final int XPS = 6;
    public static final int length = 28;

    private WarningSource() {
    }

    public static int fromName(String str) {
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 0;
        }
        if ("LAYOUT".equals(str)) {
            return 1;
        }
        if ("DRAWING_ML".equals(str)) {
            return 2;
        }
        if ("OFFICE_MATH".equals(str)) {
            return 3;
        }
        if ("SHAPES".equals(str)) {
            return 4;
        }
        if ("METAFILE".equals(str)) {
            return 5;
        }
        if ("XPS".equals(str)) {
            return 6;
        }
        if ("PDF".equals(str)) {
            return 7;
        }
        if ("IMAGE".equals(str)) {
            return 8;
        }
        if ("DOCX".equals(str)) {
            return 9;
        }
        if ("DOC".equals(str)) {
            return 10;
        }
        if ("TEXT".equals(str)) {
            return 11;
        }
        if ("RTF".equals(str)) {
            return 12;
        }
        if ("WORD_ML".equals(str)) {
            return 13;
        }
        if ("NRX".equals(str)) {
            return 14;
        }
        if ("ODT".equals(str)) {
            return 15;
        }
        if ("HTML".equals(str)) {
            return 16;
        }
        if ("VALIDATOR".equals(str)) {
            return 17;
        }
        if ("XAML".equals(str)) {
            return 18;
        }
        if ("SVM".equals(str)) {
            return 19;
        }
        if ("MATH_ML".equals(str)) {
            return 20;
        }
        if ("FONT".equals(str)) {
            return 21;
        }
        if ("SVG".equals(str)) {
            return 22;
        }
        if ("MARKDOWN".equals(str)) {
            return 23;
        }
        if ("CHM".equals(str)) {
            return 24;
        }
        if ("EPUB".equals(str)) {
            return 25;
        }
        if ("XML".equals(str)) {
            return 26;
        }
        if ("XLSX".equals(str)) {
            return 27;
        }
        throw new IllegalArgumentException("Unknown WarningSource name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 1:
                return "LAYOUT";
            case 2:
                return "DRAWING_ML";
            case 3:
                return "OFFICE_MATH";
            case 4:
                return "SHAPES";
            case 5:
                return "METAFILE";
            case 6:
                return "XPS";
            case 7:
                return "PDF";
            case 8:
                return "IMAGE";
            case 9:
                return "DOCX";
            case 10:
                return "DOC";
            case 11:
                return "TEXT";
            case 12:
                return "RTF";
            case 13:
                return "WORD_ML";
            case 14:
                return "NRX";
            case 15:
                return "ODT";
            case 16:
                return "HTML";
            case 17:
                return "VALIDATOR";
            case 18:
                return "XAML";
            case 19:
                return "SVM";
            case 20:
                return "MATH_ML";
            case 21:
                return "FONT";
            case 22:
                return "SVG";
            case 23:
                return "MARKDOWN";
            case 24:
                return "CHM";
            case 25:
                return "EPUB";
            case 26:
                return "XML";
            case 27:
                return "XLSX";
            default:
                return "Unknown WarningSource value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Unknown";
            case 1:
                return "Layout";
            case 2:
                return "DrawingML";
            case 3:
                return "OfficeMath";
            case 4:
                return "Shapes";
            case 5:
                return "Metafile";
            case 6:
                return "Xps";
            case 7:
                return "Pdf";
            case 8:
                return "Image";
            case 9:
                return "Docx";
            case 10:
                return "Doc";
            case 11:
                return "Text";
            case 12:
                return "Rtf";
            case 13:
                return "WordML";
            case 14:
                return "Nrx";
            case 15:
                return "Odt";
            case 16:
                return "Html";
            case 17:
                return "Validator";
            case 18:
                return "Xaml";
            case 19:
                return "Svm";
            case 20:
                return "MathML";
            case 21:
                return "Font";
            case 22:
                return "Svg";
            case 23:
                return "Markdown";
            case 24:
                return "Chm";
            case 25:
                return "Epub";
            case 26:
                return "Xml";
            case 27:
                return "Xlsx";
            default:
                return "Unknown WarningSource value.";
        }
    }
}
