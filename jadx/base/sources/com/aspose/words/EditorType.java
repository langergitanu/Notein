package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EditorType {
    public static final int ADMINISTRATORS = 1;
    public static final int CONTRIBUTORS = 2;
    public static final int CURRENT = 3;
    public static final int DEFAULT = 0;
    public static final int EDITORS = 4;
    public static final int EVERYONE = 5;
    public static final int NONE = 6;
    public static final int OWNERS = 7;
    public static final int UNSPECIFIED = 0;
    public static final int length = 9;

    private EditorType() {
    }

    public static int fromName(String str) {
        if ("UNSPECIFIED".equals(str)) {
            return 0;
        }
        if ("ADMINISTRATORS".equals(str)) {
            return 1;
        }
        if ("CONTRIBUTORS".equals(str)) {
            return 2;
        }
        if ("CURRENT".equals(str)) {
            return 3;
        }
        if ("EDITORS".equals(str)) {
            return 4;
        }
        if ("EVERYONE".equals(str)) {
            return 5;
        }
        if ("NONE".equals(str)) {
            return 6;
        }
        if ("OWNERS".equals(str)) {
            return 7;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown EditorType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "UNSPECIFIED | DEFAULT";
            case 1:
                return "ADMINISTRATORS";
            case 2:
                return "CONTRIBUTORS";
            case 3:
                return "CURRENT";
            case 4:
                return "EDITORS";
            case 5:
                return "EVERYONE";
            case 6:
                return "NONE";
            case 7:
                return "OWNERS";
            default:
                return "Unknown EditorType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Unspecified | Default";
            case 1:
                return "Administrators";
            case 2:
                return "Contributors";
            case 3:
                return "Current";
            case 4:
                return "Editors";
            case 5:
                return "Everyone";
            case 6:
                return "None";
            case 7:
                return "Owners";
            default:
                return "Unknown EditorType value.";
        }
    }
}
