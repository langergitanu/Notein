package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class FillType extends AbstractC14106wy {
    public static final byte Gradient = 2;
    public static final byte Group = 5;
    public static final byte NoFill = 0;
    public static final byte NotDefined = -1;
    public static final byte Pattern = 3;
    public static final byte Picture = 4;
    public static final byte Solid = 1;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(FillType.class, Byte.class) { // from class: com.aspose.slides.FillType.1
            {
                addConstant("NotDefined", -1L);
                addConstant("NoFill", 0L);
                addConstant("Solid", 1L);
                addConstant("Gradient", 2L);
                addConstant("Pattern", 3L);
                addConstant("Picture", 4L);
                addConstant("Group", 5L);
            }
        });
    }

    private FillType() {
    }
}
