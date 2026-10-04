package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class ResourceLoadingAction {
    public static final int DEFAULT = 0;
    public static final int SKIP = 1;
    public static final int USER_PROVIDED = 2;
    public static final int length = 3;

    private ResourceLoadingAction() {
    }

    public static int fromName(String str) {
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        if ("SKIP".equals(str)) {
            return 1;
        }
        if ("USER_PROVIDED".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ResourceLoadingAction name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ResourceLoadingAction value." : "USER_PROVIDED" : "SKIP" : "DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown ResourceLoadingAction value." : "UserProvided" : "Skip" : "Default";
    }
}
