package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageType {
    public static final int BMP = 7;
    public static final int EMF = 2;
    public static final int EPS = 8;
    public static final int JPEG = 5;
    public static final int NO_IMAGE = 0;
    public static final int PICT = 4;
    public static final int PNG = 6;
    public static final int UNKNOWN = 1;
    public static final int WEB_P = 9;
    public static final int WMF = 3;
    public static final int length = 10;

    private ImageType() {
    }

    public static int fromName(String str) {
        if ("NO_IMAGE".equals(str)) {
            return 0;
        }
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 1;
        }
        if ("EMF".equals(str)) {
            return 2;
        }
        if ("WMF".equals(str)) {
            return 3;
        }
        if ("PICT".equals(str)) {
            return 4;
        }
        if ("JPEG".equals(str)) {
            return 5;
        }
        if ("PNG".equals(str)) {
            return 6;
        }
        if ("BMP".equals(str)) {
            return 7;
        }
        if ("EPS".equals(str)) {
            return 8;
        }
        if ("WEB_P".equals(str)) {
            return 9;
        }
        throw new IllegalArgumentException("Unknown ImageType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NO_IMAGE";
            case 1:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 2:
                return "EMF";
            case 3:
                return "WMF";
            case 4:
                return "PICT";
            case 5:
                return "JPEG";
            case 6:
                return "PNG";
            case 7:
                return "BMP";
            case 8:
                return "EPS";
            case 9:
                return "WEB_P";
            default:
                return "Unknown ImageType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "NoImage";
            case 1:
                return "Unknown";
            case 2:
                return "Emf";
            case 3:
                return "Wmf";
            case 4:
                return "Pict";
            case 5:
                return "Jpeg";
            case 6:
                return "Png";
            case 7:
                return "Bmp";
            case 8:
                return "Eps";
            case 9:
                return "WebP";
            default:
                return "Unknown ImageType value.";
        }
    }
}
