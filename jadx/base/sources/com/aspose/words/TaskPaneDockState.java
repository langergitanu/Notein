package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TaskPaneDockState {
    public static final int LEFT = 1;
    public static final int RIGHT = 0;
    public static final int length = 2;

    private TaskPaneDockState() {
    }

    public static int fromName(String str) {
        if ("RIGHT".equals(str)) {
            return 0;
        }
        if ("LEFT".equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Unknown TaskPaneDockState name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? "Unknown TaskPaneDockState value." : "LEFT" : "RIGHT";
    }

    public static int[] getValues() {
        return new int[]{0, 1};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? "Unknown TaskPaneDockState value." : "Left" : "Right";
    }
}
