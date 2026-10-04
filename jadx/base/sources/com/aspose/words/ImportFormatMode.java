package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ImportFormatMode {
    public static final int KEEP_DIFFERENT_STYLES = 2;
    public static final int KEEP_SOURCE_FORMATTING = 1;
    public static final int USE_DESTINATION_STYLES = 0;
    public static final int length = 3;

    private ImportFormatMode() {
    }

    public static int fromName(String str) {
        if ("USE_DESTINATION_STYLES".equals(str)) {
            return 0;
        }
        if ("KEEP_SOURCE_FORMATTING".equals(str)) {
            return 1;
        }
        if ("KEEP_DIFFERENT_STYLES".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ImportFormatMode name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ImportFormatMode value." : "KEEP_DIFFERENT_STYLES" : "KEEP_SOURCE_FORMATTING" : "USE_DESTINATION_STYLES";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ImportFormatMode value." : "KeepDifferentStyles" : "KeepSourceFormatting" : "UseDestinationStyles";
    }
}
