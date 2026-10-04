package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
public final class MailMergeDestination {
    public static final int DEFAULT = 0;
    public static final int EMAIL = 2;
    public static final int FAX = 4;
    public static final int NEW_DOCUMENT = 0;
    public static final int PRINTER = 1;
    public static final int length = 5;

    private MailMergeDestination() {
    }

    public static int fromName(String str) {
        if ("NEW_DOCUMENT".equals(str)) {
            return 0;
        }
        if ("PRINTER".equals(str)) {
            return 1;
        }
        if (CommonConstant.RETKEY.EMAIL.equals(str)) {
            return 2;
        }
        if ("FAX".equals(str)) {
            return 4;
        }
        if ("DEFAULT".equals(str)) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown MailMergeDestination name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? "Unknown MailMergeDestination value." : "FAX" : CommonConstant.RETKEY.EMAIL : "PRINTER" : "NEW_DOCUMENT | DEFAULT";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 4, 0};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 4 ? "Unknown MailMergeDestination value." : "Fax" : "Email" : "Printer" : "NewDocument | Default";
    }
}
