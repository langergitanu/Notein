package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentDisposition {
    public static final int ATTACHMENT = 0;
    public static final int INLINE = 1;
    public static final int length = 2;

    private ContentDisposition() {
    }

    public static int fromName(String str) {
        if ("ATTACHMENT".equals(str)) {
            return 0;
        }
        if ("INLINE".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown ContentDisposition name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown ContentDisposition value." : "INLINE" : "ATTACHMENT";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown ContentDisposition value." : "Inline" : "Attachment";
    }
}
