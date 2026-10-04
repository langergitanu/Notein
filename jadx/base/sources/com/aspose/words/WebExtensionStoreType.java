package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class WebExtensionStoreType {
    public static final int DEFAULT = 0;
    public static final int EXCHANGE = 3;
    public static final int EX_CATALOG = 6;
    public static final int FILE_SYSTEM = 4;
    public static final int OMEX = 1;
    public static final int REGISTRY = 5;
    public static final int SP_APP = 2;
    public static final int SP_CATALOG = 0;
    public static final int length = 8;

    private WebExtensionStoreType() {
    }

    public static int fromName(String str) {
        if ("SP_CATALOG".equals(str)) {
            return 0;
        }
        if ("OMEX".equals(str)) {
            return 1;
        }
        if ("SP_APP".equals(str)) {
            return 2;
        }
        if ("EXCHANGE".equals(str)) {
            return 3;
        }
        if ("FILE_SYSTEM".equals(str)) {
            return 4;
        }
        if ("REGISTRY".equals(str)) {
            return 5;
        }
        if ("EX_CATALOG".equals(str)) {
            return 6;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown WebExtensionStoreType name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "SP_CATALOG | DEFAULT";
            case 1:
                return "OMEX";
            case 2:
                return "SP_APP";
            case 3:
                return "EXCHANGE";
            case 4:
                return "FILE_SYSTEM";
            case 5:
                return "REGISTRY";
            case 6:
                return "EX_CATALOG";
            default:
                return "Unknown WebExtensionStoreType value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 0};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "SPCatalog | Default";
            case 1:
                return "OMEX";
            case 2:
                return "SPApp";
            case 3:
                return "Exchange";
            case 4:
                return "FileSystem";
            case 5:
                return "Registry";
            case 6:
                return "ExCatalog";
            default:
                return "Unknown WebExtensionStoreType value.";
        }
    }
}
