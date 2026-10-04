package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class afo extends C14856yp {
    /* JADX INFO: renamed from: kk */
    public static void m3544kk(qah qahVar) {
        ri7 ri7VarM69481du = qahVar.m69481du();
        PictureFrame pictureFrameM2653x6 = (PictureFrame) C7019kk.m27452k4((Object) ri7VarM69481du.m70148u4(), PictureFrame.class);
        if (pictureFrameM2653x6 == null) {
            pictureFrameM2653x6 = qahVar.m69491m9().m2653x6();
            ri7VarM69481du.m70143k4(pictureFrameM2653x6);
        }
        C14856yp.m73972x1(qahVar);
        if (pictureFrameM2653x6.getPlaceholder() != null && (pictureFrameM2653x6.getPlaceholder().getType() == 4 || pictureFrameM2653x6.getPlaceholder().getType() == 5 || pictureFrameM2653x6.getPlaceholder().getType() == 6)) {
            pictureFrameM2653x6.removePlaceholder();
        }
        pictureFrameM2653x6.m1591yj().m3331x1(5);
        pictureFrameM2653x6.getPictureFormat().setPictureFillMode(1);
        C14680vi.m72289k4(pictureFrameM2653x6.getFillFormat(), ri7VarM69481du);
        IShapeFrame frame = pictureFrameM2653x6.getFrame();
        tcp.m71097k4(pictureFrameM2653x6.getLineFormat(), f6b.m5993x1(pictureFrameM2653x6.m1591yj().m3308ck()), (frame.getFlipH() == 1) ^ (frame.getFlipV() == 1), ri7VarM69481du);
        C14200nt.m68199k4(pictureFrameM2653x6.getEffectFormat(), ri7VarM69481du);
        moa.m64927k4((PictureFillFormat) pictureFrameM2653x6.getPictureFormat(), 4294967295L, ri7VarM69481du);
    }
}
