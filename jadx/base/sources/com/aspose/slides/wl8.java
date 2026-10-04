package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class wl8 {
    /* JADX INFO: renamed from: k4 */
    public static String m72782k4(IShape iShape, C0950eh c0950eh) {
        if (m72783k4(iShape)) {
            return null;
        }
        IGroupShape iGroupShape = (IGroupShape) C7019kk.m27452k4((Object) iShape, IGroupShape.class);
        if (iGroupShape != null) {
            return c0950eh.f4790kk.getExportType() != 2 ? C0807b7.m4041k4(iGroupShape, c0950eh) : bls.m4263k4(iShape, c0950eh.f4789k4, c0950eh.f4791x1);
        }
        String strM72784x1 = m72784x1(iShape, c0950eh);
        return C14113y2.m67411k4(strM72784x1) ? strM72784x1 : c0950eh.f4791x1.m64570m9(strM72784x1);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m72784x1(IShape iShape, C0950eh c0950eh) {
        String strM4262k4;
        ITable iTable;
        String strM68438k4;
        String strM3936k4;
        IVideoFrame iVideoFrame = (IVideoFrame) C7019kk.m27452k4((Object) iShape, IVideoFrame.class);
        if (iVideoFrame == null || C14113y2.m67411k4(iVideoFrame.getLinkPathLong())) {
            strM4262k4 = null;
        } else {
            strM4262k4 = fmt.m6238k4(iVideoFrame, c0950eh.f4791x1);
            if (strM4262k4 != null) {
                return strM4262k4;
            }
        }
        IAudioFrame iAudioFrame = (IAudioFrame) C7019kk.m27452k4((Object) iShape, IAudioFrame.class);
        if (iAudioFrame != null && !C14113y2.m67411k4(iAudioFrame.getLinkPathLong()) && (strM4262k4 = fmt.m6237k4(iAudioFrame, c0950eh.f4791x1)) != null) {
            return strM4262k4;
        }
        IPictureFrame iPictureFrame = (IPictureFrame) C7019kk.m27452k4((Object) iShape, IPictureFrame.class);
        if (iPictureFrame != null && c0950eh.f4790kk.getExportType() != 1) {
            IPPImage iPPImageM4260k4 = bls.m4260k4(iPictureFrame.getPictureFormat());
            if (iPPImageM4260k4 != null) {
                strM4262k4 = bls.m4262k4(iPPImageM4260k4, c0950eh.f4789k4, c0950eh.f4791x1, iPictureFrame.getAlternativeText());
            }
            if (strM4262k4 != null) {
                return strM4262k4;
            }
        }
        IAutoShape iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) iShape, IAutoShape.class);
        if (iAutoShape != null && (strM3936k4 = C0789b1.m3936k4(iAutoShape, c0950eh)) != null) {
            return strM3936k4;
        }
        if (c0950eh.f4791x1.m64565k4(1) && (iTable = (ITable) C7019kk.m27452k4((Object) iShape, ITable.class)) != null && (strM68438k4 = obw.m68438k4(iTable, c0950eh.f4791x1)) != null) {
            return strM68438k4;
        }
        if (c0950eh.f4790kk.getExportType() == 1) {
            return null;
        }
        return bls.m4263k4(iShape, c0950eh.f4789k4, c0950eh.f4791x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m72783k4(IShape iShape) {
        TextFrame textFrame;
        GeometryShape geometryShape = (GeometryShape) C7019kk.m27452k4((Object) iShape, GeometryShape.class);
        if (geometryShape == null || geometryShape.getShapeType() != -1) {
            return false;
        }
        AutoShape autoShape = (AutoShape) C7019kk.m27452k4((Object) iShape, AutoShape.class);
        return autoShape == null || (textFrame = (TextFrame) C7019kk.m27452k4((Object) autoShape.getTextFrame(), TextFrame.class)) == null || C14113y2.m67411k4(textFrame.getText());
    }
}
