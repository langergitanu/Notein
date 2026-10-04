package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PageLayoutEvent {
    public static final int BUILD_FINISHED = 3;
    public static final int BUILD_STARTED = 2;
    public static final int CONVERSION_FINISHED = 5;
    public static final int CONVERSION_STARTED = 4;
    public static final int NONE = 0;
    public static final int PART_REFLOW_FINISHED = 9;
    public static final int PART_REFLOW_STARTED = 8;
    public static final int PART_RENDERING_FINISHED = 11;
    public static final int PART_RENDERING_STARTED = 10;
    public static final int REFLOW_FINISHED = 7;
    public static final int REFLOW_STARTED = 6;
    public static final int WATCH_DOG = 1;
    public static final int length = 12;

    private PageLayoutEvent() {
    }

    public static int fromName(String str) {
        if ("NONE".equals(str)) {
            return 0;
        }
        if ("WATCH_DOG".equals(str)) {
            return 1;
        }
        if ("BUILD_STARTED".equals(str)) {
            return 2;
        }
        if ("BUILD_FINISHED".equals(str)) {
            return 3;
        }
        if ("CONVERSION_STARTED".equals(str)) {
            return 4;
        }
        if ("CONVERSION_FINISHED".equals(str)) {
            return 5;
        }
        if ("REFLOW_STARTED".equals(str)) {
            return 6;
        }
        if ("REFLOW_FINISHED".equals(str)) {
            return 7;
        }
        if ("PART_REFLOW_STARTED".equals(str)) {
            return 8;
        }
        if ("PART_REFLOW_FINISHED".equals(str)) {
            return 9;
        }
        if ("PART_RENDERING_STARTED".equals(str)) {
            return 10;
        }
        if ("PART_RENDERING_FINISHED".equals(str)) {
            return 11;
        }
        throw new IllegalArgumentException("Unknown PageLayoutEvent name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "WATCH_DOG";
            case 2:
                return "BUILD_STARTED";
            case 3:
                return "BUILD_FINISHED";
            case 4:
                return "CONVERSION_STARTED";
            case 5:
                return "CONVERSION_FINISHED";
            case 6:
                return "REFLOW_STARTED";
            case 7:
                return "REFLOW_FINISHED";
            case 8:
                return "PART_REFLOW_STARTED";
            case 9:
                return "PART_REFLOW_FINISHED";
            case 10:
                return "PART_RENDERING_STARTED";
            case 11:
                return "PART_RENDERING_FINISHED";
            default:
                return "Unknown PageLayoutEvent value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "None";
            case 1:
                return "WatchDog";
            case 2:
                return "BuildStarted";
            case 3:
                return "BuildFinished";
            case 4:
                return "ConversionStarted";
            case 5:
                return "ConversionFinished";
            case 6:
                return "ReflowStarted";
            case 7:
                return "ReflowFinished";
            case 8:
                return "PartReflowStarted";
            case 9:
                return "PartReflowFinished";
            case 10:
                return "PartRenderingStarted";
            case 11:
                return "PartRenderingFinished";
            default:
                return "Unknown PageLayoutEvent value.";
        }
    }
}
