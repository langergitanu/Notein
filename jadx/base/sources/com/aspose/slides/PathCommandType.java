package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class PathCommandType extends AbstractC14106wy {
    public static final byte ArcTo = 3;
    public static final byte Close = 0;
    public static final byte CubicBezierTo = 5;
    public static final byte LineTo = 2;
    public static final byte MoveTo = 1;
    public static final byte QuadBezierTo = 4;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(PathCommandType.class, Byte.class) { // from class: com.aspose.slides.PathCommandType.1
            {
                addConstant("Close", 0L);
                addConstant("MoveTo", 1L);
                addConstant("LineTo", 2L);
                addConstant("ArcTo", 3L);
                addConstant("QuadBezierTo", 4L);
                addConstant("CubicBezierTo", 5L);
            }
        });
    }

    private PathCommandType() {
    }
}
