package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class BlackWhiteConversionMode extends AbstractC14106wy {
    public static final int Auto = 3;
    public static final int AutoOtsu = 4;
    public static final int Default = 0;
    public static final int Dithering = 1;
    public static final int DitheringFloydSteinberg = 2;
    public static final int Threshold25 = 5;
    public static final int Threshold50 = 6;
    public static final int Threshold75 = 7;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(BlackWhiteConversionMode.class, Integer.class) { // from class: com.aspose.slides.BlackWhiteConversionMode.1
            {
                addConstant("Default", 0L);
                addConstant("Dithering", 1L);
                addConstant("DitheringFloydSteinberg", 2L);
                addConstant("Auto", 3L);
                addConstant("AutoOtsu", 4L);
                addConstant("Threshold25", 5L);
                addConstant("Threshold50", 6L);
                addConstant("Threshold75", 7L);
            }
        });
    }

    private BlackWhiteConversionMode() {
    }
}
