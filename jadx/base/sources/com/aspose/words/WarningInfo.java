package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class WarningInfo {
    private String zzLr;
    private int zzWVt;
    private int zzWVu;

    public WarningInfo(int i, int i2, String str) {
        this.zzWVu = i;
        this.zzWVt = i2;
        this.zzLr = str;
    }

    public static String zzi9(int i) {
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
            case 18:
            case 20:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: warningSource");
            case 19:
                return "Svm";
            case 21:
                return "Font";
            case 22:
                return "Svg";
        }
    }

    public static int zzia(int i) {
        if (i == 11) {
            return 19;
        }
        if (i == 12) {
            return 21;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 0;
        }
    }

    public static int zzib(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 256;
        }
        if (i != 3) {
            return i != 4 ? 65536 : 16777216;
        }
        return 131072;
    }

    public String getDescription() {
        return this.zzLr;
    }

    public int getSource() {
        return this.zzWVt;
    }

    public int getWarningType() {
        return this.zzWVu;
    }
}
