package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class MotionCommandPathType extends AbstractC14106wy {
    public static final int CloseLoop = 3;
    public static final int CurveTo = 2;
    public static final int End = 4;
    public static final int LineTo = 1;
    public static final int MoveTo = 0;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(MotionCommandPathType.class, Integer.class) { // from class: com.aspose.slides.MotionCommandPathType.1
            {
                addConstant("MoveTo", 0L);
                addConstant("LineTo", 1L);
                addConstant("CurveTo", 2L);
                addConstant("CloseLoop", 3L);
                addConstant("End", 4L);
            }
        });
    }

    private MotionCommandPathType() {
    }
}
