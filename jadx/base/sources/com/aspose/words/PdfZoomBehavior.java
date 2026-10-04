package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfZoomBehavior {
    public static final int FIT_BOX = 5;
    public static final int FIT_HEIGHT = 4;
    public static final int FIT_PAGE = 2;
    public static final int FIT_WIDTH = 3;
    public static final int NONE = 0;
    public static final int ZOOM_FACTOR = 1;
    public static final int length = 6;

    private PdfZoomBehavior() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("ZOOM_FACTOR".equals(str)) {
            return 1;
        }
        if ("FIT_PAGE".equals(str)) {
            return 2;
        }
        if ("FIT_WIDTH".equals(str)) {
            return 3;
        }
        if ("FIT_HEIGHT".equals(str)) {
            return 4;
        }
        if ("FIT_BOX".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Unknown PdfZoomBehavior name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown PdfZoomBehavior value." : "FIT_BOX" : "FIT_HEIGHT" : "FIT_WIDTH" : "FIT_PAGE" : "ZOOM_FACTOR" : "NONE";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "Unknown PdfZoomBehavior value." : "FitBox" : "FitHeight" : "FitWidth" : "FitPage" : "ZoomFactor" : "None";
    }
}
