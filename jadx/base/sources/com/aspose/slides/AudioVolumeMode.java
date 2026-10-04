package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioVolumeMode extends AbstractC14106wy {
    public static final int Loud = 3;
    public static final int Low = 1;
    public static final int Medium = 2;
    public static final int Mixed = -1;
    public static final int Mute = 0;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.du(AudioVolumeMode.class, Integer.class) { // from class: com.aspose.slides.AudioVolumeMode.1
            {
                addConstant("Mixed", -1L);
                addConstant("Mute", 0L);
                addConstant("Low", 1L);
                addConstant("Medium", 2L);
                addConstant("Loud", 3L);
            }
        });
    }

    private AudioVolumeMode() {
    }
}
