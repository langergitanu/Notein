package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PaperSize {

    /* JADX INFO: renamed from: A3 */
    public static final int f50777A3 = 0;

    /* JADX INFO: renamed from: A4 */
    public static final int f50778A4 = 1;

    /* JADX INFO: renamed from: A5 */
    public static final int f50779A5 = 2;

    /* JADX INFO: renamed from: B4 */
    public static final int f50780B4 = 3;

    /* JADX INFO: renamed from: B5 */
    public static final int f50781B5 = 4;
    public static final int CUSTOM = 17;
    public static final int ENVELOPE_DL = 10;
    public static final int EXECUTIVE = 5;
    public static final int FOLIO = 6;
    public static final int LEDGER = 7;
    public static final int LEGAL = 8;
    public static final int LETTER = 9;
    public static final int NUMBER_10_ENVELOPE = 16;
    public static final int PAPER_10_X_14 = 14;
    public static final int PAPER_11_X_17 = 15;
    public static final int QUARTO = 11;
    public static final int STATEMENT = 12;
    public static final int TABLOID = 13;
    public static final int length = 18;

    private PaperSize() {
    }

    public static int fromName(String str) {
        if ("A3".equals(str)) {
            return 0;
        }
        if ("A4".equals(str)) {
            return 1;
        }
        if ("A5".equals(str)) {
            return 2;
        }
        if ("B4".equals(str)) {
            return 3;
        }
        if ("B5".equals(str)) {
            return 4;
        }
        if ("EXECUTIVE".equals(str)) {
            return 5;
        }
        if ("FOLIO".equals(str)) {
            return 6;
        }
        if ("LEDGER".equals(str)) {
            return 7;
        }
        if ("LEGAL".equals(str)) {
            return 8;
        }
        if ("LETTER".equals(str)) {
            return 9;
        }
        if ("ENVELOPE_DL".equals(str)) {
            return 10;
        }
        if ("QUARTO".equals(str)) {
            return 11;
        }
        if ("STATEMENT".equals(str)) {
            return 12;
        }
        if ("TABLOID".equals(str)) {
            return 13;
        }
        if ("PAPER_10_X_14".equals(str)) {
            return 14;
        }
        if ("PAPER_11_X_17".equals(str)) {
            return 15;
        }
        if ("NUMBER_10_ENVELOPE".equals(str)) {
            return 16;
        }
        if ("CUSTOM".equals(str)) {
            return 17;
        }
        throw new IllegalArgumentException("Unknown PaperSize name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "A3";
            case 1:
                return "A4";
            case 2:
                return "A5";
            case 3:
                return "B4";
            case 4:
                return "B5";
            case 5:
                return "EXECUTIVE";
            case 6:
                return "FOLIO";
            case 7:
                return "LEDGER";
            case 8:
                return "LEGAL";
            case 9:
                return "LETTER";
            case 10:
                return "ENVELOPE_DL";
            case 11:
                return "QUARTO";
            case 12:
                return "STATEMENT";
            case 13:
                return "TABLOID";
            case 14:
                return "PAPER_10_X_14";
            case 15:
                return "PAPER_11_X_17";
            case 16:
                return "NUMBER_10_ENVELOPE";
            case 17:
                return "CUSTOM";
            default:
                return "Unknown PaperSize value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "A3";
            case 1:
                return "A4";
            case 2:
                return "A5";
            case 3:
                return "B4";
            case 4:
                return "B5";
            case 5:
                return "Executive";
            case 6:
                return "Folio";
            case 7:
                return "Ledger";
            case 8:
                return "Legal";
            case 9:
                return "Letter";
            case 10:
                return "EnvelopeDL";
            case 11:
                return "Quarto";
            case 12:
                return "Statement";
            case 13:
                return "Tabloid";
            case 14:
                return "Paper10x14";
            case 15:
                return "Paper11x17";
            case 16:
                return "Number10Envelope";
            case 17:
                return "Custom";
            default:
                return "Unknown PaperSize value.";
        }
    }
}
