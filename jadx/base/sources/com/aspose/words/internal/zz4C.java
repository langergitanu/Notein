package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4C {
    public static String zzU2(int i) {
        switch (i) {
            case 0:
                return "/XYZ";
            case 1:
                return "/Fit";
            case 2:
                return "/FitH";
            case 3:
                return "/FitV";
            case 4:
                return "/FitR";
            case 5:
                return "/FitB";
            case 6:
                return "/FitBH";
            case 7:
                return "/FitBV";
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
    }

    public static String zzU3(int i) {
        if (i == 0) {
            return "/Btn";
        }
        if (i == 1) {
            return "/Tx";
        }
        if (i == 2) {
            return "/Ch";
        }
        if (i == 3) {
            return "/Sig";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
    }

    public static String zzU4(int i) {
        if (i == 0) {
            return "/SinglePage";
        }
        if (i == 1) {
            return "/OneColumn";
        }
        if (i == 2) {
            return "/TwoColumnLeft";
        }
        if (i == 3) {
            return "/TwoColumnRight";
        }
        if (i == 4) {
            return "/TwoPageLeft";
        }
        if (i == 5) {
            return "/TwoPageRight";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
    }

    public static String zzU5(int i) {
        if (i == 0) {
            return "/UseNone";
        }
        if (i == 1) {
            return "/UseOutlines";
        }
        if (i == 2) {
            return "/UseThumbs";
        }
        if (i == 3) {
            return "/FullScreen";
        }
        if (i == 4) {
            return "/UseOC";
        }
        if (i == 5) {
            return "/UseAttachments";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
    }

    public static String zzU6(int i) {
        if (i == 0) {
            return "/MediaBox";
        }
        if (i == 1) {
            return "/CropBox";
        }
        if (i == 2) {
            return "/BleedBox";
        }
        if (i == 3) {
            return "/TrimBox";
        }
        if (i == 4) {
            return "/ArtBox";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
    }
}
