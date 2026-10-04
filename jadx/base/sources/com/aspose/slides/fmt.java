package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class fmt {
    /* JADX INFO: renamed from: k4 */
    public static String m6237k4(IAudioFrame iAudioFrame, ls9 ls9Var) {
        return ls9Var.m64576x1(C14113y2.m67411k4(iAudioFrame.getAlternativeTextTitle()) ? "Audio" : iAudioFrame.getAlternativeTextTitle(), iAudioFrame.getLinkPathLong());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m6238k4(IVideoFrame iVideoFrame, ls9 ls9Var) {
        return ls9Var.m64576x1(C14113y2.m67411k4(iVideoFrame.getAlternativeTextTitle()) ? "Video" : iVideoFrame.getAlternativeTextTitle(), iVideoFrame.getLinkPathLong());
    }
}
