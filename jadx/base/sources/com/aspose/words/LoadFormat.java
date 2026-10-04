package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class LoadFormat {
    public static final int AUTO = 0;
    public static final int AZW_3 = 54;
    public static final int CHM = 53;
    public static final int DOC = 10;
    public static final int DOCM = 21;
    public static final int DOCX = 20;
    public static final int DOC_PRE_WORD_60 = 12;
    public static final int DOT = 11;
    public static final int DOTM = 23;
    public static final int DOTX = 22;
    public static final int EPUB = 55;
    public static final int FLAT_OPC = 24;
    public static final int FLAT_OPC_MACRO_ENABLED = 25;
    public static final int FLAT_OPC_TEMPLATE = 26;
    public static final int FLAT_OPC_TEMPLATE_MACRO_ENABLED = 27;
    public static final int HTML = 50;
    public static final int MARKDOWN = 63;
    public static final int MHTML = 51;
    public static final int MOBI = 52;
    public static final int ODT = 60;
    public static final int OTT = 61;
    public static final int PDF = 64;
    public static final int RTF = 30;
    public static final int TEXT = 62;
    public static final int UNKNOWN = 255;
    public static final int WORD_ML = 31;
    public static final int XML = 65;
    public static final int length = 27;

    private LoadFormat() {
    }

    public static int fromName(String str) {
        if ("AUTO".equals(str)) {
            return 0;
        }
        if ("DOC".equals(str)) {
            return 10;
        }
        if ("DOT".equals(str)) {
            return 11;
        }
        if ("DOC_PRE_WORD_60".equals(str)) {
            return 12;
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
        if ("HTML".equals(str)) {
            return 50;
        }
        if ("MHTML".equals(str)) {
            return 51;
        }
        if ("MOBI".equals(str)) {
            return 52;
        }
        if ("CHM".equals(str)) {
            return 53;
        }
        if ("AZW_3".equals(str)) {
            return 54;
        }
        if ("EPUB".equals(str)) {
            return 55;
        }
        if ("ODT".equals(str)) {
            return 60;
        }
        if ("OTT".equals(str)) {
            return 61;
        }
        if ("TEXT".equals(str)) {
            return 62;
        }
        if ("MARKDOWN".equals(str)) {
            return 63;
        }
        if ("PDF".equals(str)) {
            return 64;
        }
        if ("XML".equals(str)) {
            return 65;
        }
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 255;
        }
        throw new IllegalArgumentException("Unknown LoadFormat name.");
    }

    public static String getName(int i) {
        if (i == 0) {
            return "AUTO";
        }
        if (i == 255) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i == 30) {
            return "RTF";
        }
        if (i == 31) {
            return "WORD_ML";
        }
        switch (i) {
            case 10:
                return "DOC";
            case 11:
                return "DOT";
            case 12:
                return "DOC_PRE_WORD_60";
            default:
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
                            case 50:
                                return "HTML";
                            case 51:
                                return "MHTML";
                            case 52:
                                return "MOBI";
                            case 53:
                                return "CHM";
                            case 54:
                                return "AZW_3";
                            case 55:
                                return "EPUB";
                            default:
                                switch (i) {
                                    case 60:
                                        return "ODT";
                                    case 61:
                                        return "OTT";
                                    case 62:
                                        return "TEXT";
                                    case 63:
                                        return "MARKDOWN";
                                    case 64:
                                        return "PDF";
                                    case 65:
                                        return "XML";
                                    default:
                                        return "Unknown LoadFormat value.";
                                }
                        }
                }
        }
    }

    public static int[] getValues() {
        return new int[]{0, 10, 11, 12, 20, 21, 22, 23, 24, 25, 26, 27, 30, 31, 50, 51, 52, 53, 54, 55, 60, 61, 62, 63, 64, 65, 255};
    }

    public static String toString(int i) {
        if (i == 0) {
            return "Auto";
        }
        if (i == 255) {
            return "Unknown";
        }
        if (i == 30) {
            return "Rtf";
        }
        if (i == 31) {
            return "WordML";
        }
        switch (i) {
            case 10:
                return "Doc";
            case 11:
                return "Dot";
            case 12:
                return "DocPreWord60";
            default:
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
                            case 50:
                                return "Html";
                            case 51:
                                return "Mhtml";
                            case 52:
                                return "Mobi";
                            case 53:
                                return "Chm";
                            case 54:
                                return "Azw3";
                            case 55:
                                return "Epub";
                            default:
                                switch (i) {
                                    case 60:
                                        return "Odt";
                                    case 61:
                                        return "Ott";
                                    case 62:
                                        return "Text";
                                    case 63:
                                        return "Markdown";
                                    case 64:
                                        return "Pdf";
                                    case 65:
                                        return "Xml";
                                    default:
                                        return "Unknown LoadFormat value.";
                                }
                        }
                }
        }
    }
}
