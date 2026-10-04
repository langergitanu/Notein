package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class SaveFormat {
    public static final int AZW_3 = 53;
    public static final int BMP = 102;
    public static final int DOC = 10;
    public static final int DOCM = 21;
    public static final int DOCX = 20;
    public static final int DOT = 11;
    public static final int DOTM = 23;
    public static final int DOTX = 22;
    public static final int EMF = 103;
    public static final int EPS = 106;
    public static final int EPUB = 52;
    public static final int FLAT_OPC = 24;
    public static final int FLAT_OPC_MACRO_ENABLED = 25;
    public static final int FLAT_OPC_TEMPLATE = 26;
    public static final int FLAT_OPC_TEMPLATE_MACRO_ENABLED = 27;
    public static final int GIF = 105;
    public static final int HTML = 50;
    public static final int HTML_FIXED = 45;
    public static final int JPEG = 104;
    public static final int MARKDOWN = 73;
    public static final int MHTML = 51;
    public static final int MOBI = 54;
    public static final int ODT = 60;
    public static final int OPEN_XPS = 46;
    public static final int OTT = 61;
    public static final int PCL = 48;
    public static final int PDF = 40;
    public static final int PNG = 101;

    /* JADX INFO: renamed from: PS */
    public static final int f50782PS = 47;
    public static final int RTF = 30;
    public static final int SVG = 44;
    public static final int TEXT = 70;
    public static final int TIFF = 100;
    public static final int UNKNOWN = 0;
    public static final int WORD_ML = 31;
    public static final int XAML_FIXED = 42;
    public static final int XAML_FLOW = 71;
    public static final int XAML_FLOW_PACK = 72;
    public static final int XLSX = 80;
    public static final int XPS = 41;
    public static final int length = 40;

    private SaveFormat() {
    }

    public static int fromName(String str) {
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 0;
        }
        if ("DOC".equals(str)) {
            return 10;
        }
        if ("DOT".equals(str)) {
            return 11;
        }
        if ("DOCX".equals(str)) {
            return 20;
        }
        if ("DOCM".equals(str)) {
            return 21;
        }
        if ("DOTX".equals(str)) {
            return 22;
        }
        if ("DOTM".equals(str)) {
            return 23;
        }
        if ("FLAT_OPC".equals(str)) {
            return 24;
        }
        if ("FLAT_OPC_MACRO_ENABLED".equals(str)) {
            return 25;
        }
        if ("FLAT_OPC_TEMPLATE".equals(str)) {
            return 26;
        }
        if ("FLAT_OPC_TEMPLATE_MACRO_ENABLED".equals(str)) {
            return 27;
        }
        if ("RTF".equals(str)) {
            return 30;
        }
        if ("WORD_ML".equals(str)) {
            return 31;
        }
        if ("PDF".equals(str)) {
            return 40;
        }
        if ("XPS".equals(str)) {
            return 41;
        }
        if ("XAML_FIXED".equals(str)) {
            return 42;
        }
        if ("SVG".equals(str)) {
            return 44;
        }
        if ("HTML_FIXED".equals(str)) {
            return 45;
        }
        if ("OPEN_XPS".equals(str)) {
            return 46;
        }
        if ("PS".equals(str)) {
            return 47;
        }
        if ("PCL".equals(str)) {
            return 48;
        }
        if ("HTML".equals(str)) {
            return 50;
        }
        if ("MHTML".equals(str)) {
            return 51;
        }
        if ("EPUB".equals(str)) {
            return 52;
        }
        if ("AZW_3".equals(str)) {
            return 53;
        }
        if ("MOBI".equals(str)) {
            return 54;
        }
        if ("ODT".equals(str)) {
            return 60;
        }
        if ("OTT".equals(str)) {
            return 61;
        }
        if ("TEXT".equals(str)) {
            return 70;
        }
        if ("XAML_FLOW".equals(str)) {
            return 71;
        }
        if ("XAML_FLOW_PACK".equals(str)) {
            return 72;
        }
        if ("MARKDOWN".equals(str)) {
            return 73;
        }
        if ("XLSX".equals(str)) {
            return 80;
        }
        if ("TIFF".equals(str)) {
            return 100;
        }
        if ("PNG".equals(str)) {
            return 101;
        }
        if ("BMP".equals(str)) {
            return 102;
        }
        if ("EMF".equals(str)) {
            return 103;
        }
        if ("JPEG".equals(str)) {
            return 104;
        }
        if ("GIF".equals(str)) {
            return 105;
        }
        if ("EPS".equals(str)) {
            return 106;
        }
        throw new IllegalArgumentException("Unknown SaveFormat name.");
    }

    public static String getName(int i) {
        if (i == 0) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i == 80) {
            return "XLSX";
        }
        if (i == 10) {
            return "DOC";
        }
        if (i == 11) {
            return "DOT";
        }
        if (i == 30) {
            return "RTF";
        }
        if (i == 31) {
            return "WORD_ML";
        }
        if (i == 60) {
            return "ODT";
        }
        if (i == 61) {
            return "OTT";
        }
        switch (i) {
            case 20:
                return "DOCX";
            case 21:
                return "DOCM";
            case 22:
                return "DOTX";
            case 23:
                return "DOTM";
            case 24:
                return "FLAT_OPC";
            case 25:
                return "FLAT_OPC_MACRO_ENABLED";
            case 26:
                return "FLAT_OPC_TEMPLATE";
            case 27:
                return "FLAT_OPC_TEMPLATE_MACRO_ENABLED";
            default:
                switch (i) {
                    case 40:
                        return "PDF";
                    case 41:
                        return "XPS";
                    case 42:
                        return "XAML_FIXED";
                    default:
                        switch (i) {
                            case 44:
                                return "SVG";
                            case 45:
                                return "HTML_FIXED";
                            case 46:
                                return "OPEN_XPS";
                            case 47:
                                return "PS";
                            case 48:
                                return "PCL";
                            default:
                                switch (i) {
                                    case 50:
                                        return "HTML";
                                    case 51:
                                        return "MHTML";
                                    case 52:
                                        return "EPUB";
                                    case 53:
                                        return "AZW_3";
                                    case 54:
                                        return "MOBI";
                                    default:
                                        switch (i) {
                                            case 70:
                                                return "TEXT";
                                            case 71:
                                                return "XAML_FLOW";
                                            case 72:
                                                return "XAML_FLOW_PACK";
                                            case 73:
                                                return "MARKDOWN";
                                            default:
                                                switch (i) {
                                                    case 100:
                                                        return "TIFF";
                                                    case 101:
                                                        return "PNG";
                                                    case 102:
                                                        return "BMP";
                                                    case 103:
                                                        return "EMF";
                                                    case 104:
                                                        return "JPEG";
                                                    case 105:
                                                        return "GIF";
                                                    case 106:
                                                        return "EPS";
                                                    default:
                                                        return "Unknown SaveFormat value.";
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static int[] getValues() {
        return new int[]{0, 10, 11, 20, 21, 22, 23, 24, 25, 26, 27, 30, 31, 40, 41, 42, 44, 45, 46, 47, 48, 50, 51, 52, 53, 54, 60, 61, 70, 71, 72, 73, 80, 100, 101, 102, 103, 104, 105, 106};
    }

    public static String toString(int i) {
        if (i == 0) {
            return "Unknown";
        }
        if (i == 80) {
            return "Xlsx";
        }
        if (i == 10) {
            return "Doc";
        }
        if (i == 11) {
            return "Dot";
        }
        if (i == 30) {
            return "Rtf";
        }
        if (i == 31) {
            return "WordML";
        }
        if (i == 60) {
            return "Odt";
        }
        if (i == 61) {
            return "Ott";
        }
        switch (i) {
            case 20:
                return "Docx";
            case 21:
                return "Docm";
            case 22:
                return "Dotx";
            case 23:
                return "Dotm";
            case 24:
                return "FlatOpc";
            case 25:
                return "FlatOpcMacroEnabled";
            case 26:
                return "FlatOpcTemplate";
            case 27:
                return "FlatOpcTemplateMacroEnabled";
            default:
                switch (i) {
                    case 40:
                        return "Pdf";
                    case 41:
                        return "Xps";
                    case 42:
                        return "XamlFixed";
                    default:
                        switch (i) {
                            case 44:
                                return "Svg";
                            case 45:
                                return "HtmlFixed";
                            case 46:
                                return "OpenXps";
                            case 47:
                                return "Ps";
                            case 48:
                                return "Pcl";
                            default:
                                switch (i) {
                                    case 50:
                                        return "Html";
                                    case 51:
                                        return "Mhtml";
                                    case 52:
                                        return "Epub";
                                    case 53:
                                        return "Azw3";
                                    case 54:
                                        return "Mobi";
                                    default:
                                        switch (i) {
                                            case 70:
                                                return "Text";
                                            case 71:
                                                return "XamlFlow";
                                            case 72:
                                                return "XamlFlowPack";
                                            case 73:
                                                return "Markdown";
                                            default:
                                                switch (i) {
                                                    case 100:
                                                        return "Tiff";
                                                    case 101:
                                                        return "Png";
                                                    case 102:
                                                        return "Bmp";
                                                    case 103:
                                                        return "Emf";
                                                    case 104:
                                                        return "Jpeg";
                                                    case 105:
                                                        return "Gif";
                                                    case 106:
                                                        return "Eps";
                                                    default:
                                                        return "Unknown SaveFormat value.";
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
