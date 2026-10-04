package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class HyperlinkActionType extends AbstractC14106wy {
    public static final int Hyperlink = 1;
    public static final int JumpEndShow = 6;
    public static final int JumpFirstSlide = 2;
    public static final int JumpLastSlide = 5;
    public static final int JumpLastViewedSlide = 7;
    public static final int JumpNextSlide = 4;
    public static final int JumpPreviousSlide = 3;
    public static final int JumpSpecificSlide = 8;
    public static final int NoAction = 0;
    public static final int OpenFile = 10;
    public static final int OpenPresentation = 11;
    public static final int StartCustomSlideShow = 9;
    public static final int StartMacro = 13;
    public static final int StartProgram = 14;
    public static final int StartStopMedia = 12;
    public static final int Unknown = -1;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(HyperlinkActionType.class, Integer.class) { // from class: com.aspose.slides.HyperlinkActionType.1
            {
                addConstant("Unknown", -1L);
                addConstant("NoAction", 0L);
                addConstant("Hyperlink", 1L);
                addConstant("JumpFirstSlide", 2L);
                addConstant("JumpPreviousSlide", 3L);
                addConstant("JumpNextSlide", 4L);
                addConstant("JumpLastSlide", 5L);
                addConstant("JumpEndShow", 6L);
                addConstant("JumpLastViewedSlide", 7L);
                addConstant("JumpSpecificSlide", 8L);
                addConstant("StartCustomSlideShow", 9L);
                addConstant("OpenFile", 10L);
                addConstant("OpenPresentation", 11L);
                addConstant("StartStopMedia", 12L);
                addConstant("StartMacro", 13L);
                addConstant("StartProgram", 14L);
            }
        });
    }

    private HyperlinkActionType() {
    }
}
