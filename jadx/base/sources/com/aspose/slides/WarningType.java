package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class WarningType extends AbstractC14106wy {
    public static final int CompatibilityIssue = 4;
    public static final int DataLoss = 1;
    public static final int MajorFormattingLoss = 2;
    public static final int MinorFormattingLoss = 3;
    public static final int SourceFileCorruption = 0;
    public static final int UnexpectedContent = 99;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(WarningType.class, Integer.class) { // from class: com.aspose.slides.WarningType.1
            {
                addConstant("SourceFileCorruption", 0L);
                addConstant("DataLoss", 1L);
                addConstant("MajorFormattingLoss", 2L);
                addConstant("MinorFormattingLoss", 3L);
                addConstant("CompatibilityIssue", 4L);
                addConstant("UnexpectedContent", 99L);
            }
        });
    }

    private WarningType() {
    }
}
