package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final class OdsoDataSourceType {
    public static final int ADDRESS_BOOK = 2;
    public static final int DATABASE = 1;
    public static final int DEFAULT = 7;
    public static final int DOCUMENT_1 = 3;
    public static final int DOCUMENT_2 = 4;
    public static final int EMAIL = 6;
    public static final int LEGACY = 8;
    public static final int MASTER = 9;
    public static final int NATIVE = 5;
    public static final int NONE = 7;
    public static final int TEXT = 0;
    public static final int length = 11;

    private OdsoDataSourceType() {
    }

    public static int fromName(String str) {
        if ("TEXT".equals(str)) {
            return 0;
        }
        if ("DATABASE".equals(str)) {
            return 1;
        }
        if ("ADDRESS_BOOK".equals(str)) {
            return 2;
        }
        if ("DOCUMENT_1".equals(str)) {
            return 3;
        }
        if ("DOCUMENT_2".equals(str)) {
            return 4;
        }
        if ("NATIVE".equals(str)) {
            return 5;
        }
        if (CommonConstant.RETKEY.EMAIL.equals(str)) {
            return 6;
        }
        if ("NONE".equals(str)) {
            return 7;
        }
        if ("LEGACY".equals(str)) {
            return 8;
        }
        if ("MASTER".equals(str)) {
            return 9;
        }
        if ("DEFAULT".equals(str)) {
            return 7;
        }
        throw new IllegalArgumentException("Unknown OdsoDataSourceType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "TEXT";
            case 1:
                return "DATABASE";
            case 2:
                return "ADDRESS_BOOK";
            case 3:
                return "DOCUMENT_1";
            case 4:
                return "DOCUMENT_2";
            case 5:
                return "NATIVE";
            case 6:
                return CommonConstant.RETKEY.EMAIL;
            case 7:
                return "NONE | DEFAULT";
            case 8:
                return "LEGACY";
            case 9:
                return "MASTER";
            default:
                return "Unknown OdsoDataSourceType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 7};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Text";
            case 1:
                return "Database";
            case 2:
                return "AddressBook";
            case 3:
                return "Document1";
            case 4:
                return "Document2";
            case 5:
                return "Native";
            case 6:
                return "Email";
            case 7:
                return "None | Default";
            case 8:
                return "Legacy";
            case 9:
                return "Master";
            default:
                return "Unknown OdsoDataSourceType value.";
        }
    }
}
