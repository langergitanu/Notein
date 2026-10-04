package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p464vq.C11839vw;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class yp7 {

    /* JADX INFO: renamed from: k4 */
    private static final C3068ks f50388k4 = new C3068ks(0, true, "avi", "wmv", "mpg", "mpeg", "mp4", "mp2", "mpe", "mpv", "mkv", "flv", "swf", "webm", "mov", "qt", "avchd", "ogg");

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f50389x1 = new C7017h4("Loop", "Mute");

    /* JADX INFO: renamed from: k4 */
    public static IShape m73974k4(ShapeCollection shapeCollection, com.aspose.slides.internal.p332p7.vtn vtnVar, com.aspose.slides.internal.p332p7.gqr gqrVar, qye qyeVar) {
        ShapeCollection shapeCollection2;
        IVideoFrame iVideoFrameAddVideoFrame;
        IAudioFrame iAudioFrameM2647x1;
        String strM67422kk;
        IAudioFrame iAudioFrameAddAudioFrameEmbedded;
        IVideoFrame iVideoFrameAddVideoFrame2;
        if (shapeCollection == null) {
            throw new ArgumentNullException("shapes");
        }
        if (gqrVar == null) {
            throw new ArgumentNullException("pluginElement");
        }
        C12007ix c12007ixClone = wgi.m72716k4(vtnVar.m43291dy(), vtnVar.m43286c5(), vtnVar.m43296jd(), vtnVar.m43288ck()).Clone();
        if (wgi.m72731kk(gqrVar.m32854x1())) {
            C11839vw c11839vwM69959x1 = qyeVar.m69959x1(gqrVar.m32854x1());
            if (gqrVar.m32851kk() != 1 || c11839vwM69959x1 == null) {
                try {
                    strM67422kk = C14113y2.m67422kk(C3141rv.m13397du(gqrVar.m32854x1()), 1);
                } catch (RuntimeException unused) {
                    strM67422kk = null;
                }
                if (strM67422kk == null || !f50388k4.m12965x1(strM67422kk)) {
                    shapeCollection2 = shapeCollection;
                    iAudioFrameM2647x1 = shapeCollection2.addAudioFrameLinked(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), gqrVar.m32854x1());
                    iVideoFrameAddVideoFrame = null;
                } else {
                    shapeCollection2 = shapeCollection;
                    iVideoFrameAddVideoFrame = shapeCollection2.addVideoFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), gqrVar.m32854x1());
                    iAudioFrameM2647x1 = null;
                }
            } else {
                IVideo[] iVideoArr = {null};
                IAudio[] iAudioArr = {null};
                qyeVar.m69952k4(c11839vwM69959x1, iVideoArr, iAudioArr);
                IVideo iVideo = iVideoArr[0];
                IAudio iAudio = iAudioArr[0];
                float fM56557jd = c12007ixClone.m56557jd();
                float fM56551ck = c12007ixClone.m56551ck();
                float fM56550c5 = c12007ixClone.m56550c5();
                float fM56575x1 = c12007ixClone.m56575x1();
                if (iVideo != null) {
                    iVideoFrameAddVideoFrame2 = shapeCollection.addVideoFrame(fM56557jd, fM56551ck, fM56550c5, fM56575x1, iVideo);
                    iAudioFrameAddAudioFrameEmbedded = null;
                } else {
                    iAudioFrameAddAudioFrameEmbedded = shapeCollection.addAudioFrameEmbedded(fM56557jd, fM56551ck, fM56550c5, fM56575x1, iAudio);
                    iVideoFrameAddVideoFrame2 = null;
                }
                iAudioFrameM2647x1 = iAudioFrameAddAudioFrameEmbedded;
                iVideoFrameAddVideoFrame = iVideoFrameAddVideoFrame2;
                shapeCollection2 = shapeCollection;
            }
        } else {
            shapeCollection2 = shapeCollection;
            iVideoFrameAddVideoFrame = null;
            iAudioFrameM2647x1 = null;
        }
        if (iVideoFrameAddVideoFrame != null) {
            m73979k4(iVideoFrameAddVideoFrame, gqrVar, qyeVar);
            return iVideoFrameAddVideoFrame;
        }
        if (iAudioFrameM2647x1 == null) {
            iAudioFrameM2647x1 = shapeCollection2.m2647x1((IAudio) null);
            iAudioFrameM2647x1.setFrame(new ShapeFrame(c12007ixClone.m56557jd(), c12007ixClone.m56551ck(), c12007ixClone.m56550c5(), c12007ixClone.m56575x1(), (byte) 0, (byte) 0, 0.0f));
        }
        m73977k4(iAudioFrameM2647x1, gqrVar, qyeVar);
        return iAudioFrameM2647x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static com.aspose.slides.internal.p332p7.gqr m73975k4(com.aspose.slides.internal.p332p7.vtn vtnVar) {
        com.aspose.slides.internal.p332p7.gqr gqrVar = (com.aspose.slides.internal.p332p7.gqr) vtnVar.m43297k4("plugin").m29542x1();
        gqrVar.m32850k4("application/vnd.sun.star.media");
        gqrVar.m32849k4(1);
        gqrVar.m32852kk(1);
        gqrVar.m32856x1(C14113y2.f47374k4);
        return gqrVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12002ck m73976k4() {
        C12009k4 c12009k4 = new C12009k4(1, 1);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56460uz().Clone());
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73977k4(IAudioFrame iAudioFrame, com.aspose.slides.internal.p332p7.gqr gqrVar, qye qyeVar) {
        AbstractC12002ck abstractC12002ckM73976k4 = m73976k4();
        try {
            iAudioFrame.getPictureFormat().getPicture().setImage(((ImageCollection) qyeVar.m69951k4().getImages()).m1724k4(abstractC12002ckM73976k4));
            iAudioFrame.setVolume(2);
            for (com.aspose.slides.internal.p332p7.edw edwVar : gqrVar.m32853to()) {
                int iM27428k4 = f50389x1.m27428k4(edwVar.m30920k4());
                if (iM27428k4 == 0) {
                    iAudioFrame.setPlayLoopMode(wgi.m72699du(edwVar.m30922x1()) == 1);
                } else if (iM27428k4 == 1 && wgi.m72699du(edwVar.m30922x1()) == 1) {
                    iAudioFrame.setVolume(0);
                }
            }
        } finally {
            if (abstractC12002ckM73976k4 != null) {
                abstractC12002ckM73976k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73978k4(IAudioFrame iAudioFrame, com.aspose.slides.internal.p332p7.vtn vtnVar, OdpSerializationContext odpSerializationContext) {
        if (iAudioFrame == null) {
            throw new ArgumentNullException("audioFrame");
        }
        if (vtnVar == null) {
            throw new ArgumentNullException("frameElement");
        }
        l3r.m64282k4(iAudioFrame, vtnVar);
        com.aspose.slides.internal.p332p7.gqr gqrVarM73975k4 = m73975k4(vtnVar);
        if (iAudioFrame.getEmbeddedAudio() == null) {
            gqrVarM73975k4.m32856x1(C14113y2.m67411k4(iAudioFrame.getLinkPathLong()) ? C14113y2.f47374k4 : C3085sv.m13080k4(iAudioFrame.getLinkPathLong()));
        } else if (!odpSerializationContext.m2048fa()) {
            gqrVarM73975k4.m32856x1(odpSerializationContext.m2053k4(iAudioFrame.getEmbeddedAudio()));
            gqrVarM73975k4.m32855x1(1);
        }
        m73981k4(iAudioFrame.getPlayLoopMode(), iAudioFrame.getVolume(), gqrVarM73975k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73979k4(IVideoFrame iVideoFrame, com.aspose.slides.internal.p332p7.gqr gqrVar, qye qyeVar) {
        AbstractC12002ck abstractC12002ckM73976k4 = m73976k4();
        try {
            iVideoFrame.getPictureFormat().getPicture().setImage(((ImageCollection) qyeVar.m69951k4().getImages()).m1724k4(abstractC12002ckM73976k4));
            iVideoFrame.setVolume(2);
            for (com.aspose.slides.internal.p332p7.edw edwVar : gqrVar.m32853to()) {
                int iM27428k4 = f50389x1.m27428k4(edwVar.m30920k4());
                if (iM27428k4 == 0) {
                    iVideoFrame.setPlayLoopMode(wgi.m72699du(edwVar.m30922x1()) == 1);
                } else if (iM27428k4 == 1 && wgi.m72699du(edwVar.m30922x1()) == 1) {
                    iVideoFrame.setVolume(0);
                }
            }
        } finally {
            if (abstractC12002ckM73976k4 != null) {
                abstractC12002ckM73976k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73980k4(IVideoFrame iVideoFrame, com.aspose.slides.internal.p332p7.vtn vtnVar, OdpSerializationContext odpSerializationContext) {
        if (iVideoFrame == null) {
            throw new ArgumentNullException("videoFrame");
        }
        if (vtnVar == null) {
            throw new ArgumentNullException("frameElement");
        }
        l3r.m64282k4(iVideoFrame, vtnVar);
        com.aspose.slides.internal.p332p7.gqr gqrVarM73975k4 = m73975k4(vtnVar);
        if (iVideoFrame.getEmbeddedVideo() == null) {
            gqrVarM73975k4.m32856x1(C14113y2.m67411k4(iVideoFrame.getLinkPathLong()) ? C14113y2.f47374k4 : C3085sv.m13080k4(iVideoFrame.getLinkPathLong()));
        } else if (!odpSerializationContext.m2048fa()) {
            gqrVarM73975k4.m32856x1(odpSerializationContext.m2055k4(iVideoFrame.getEmbeddedVideo()));
            gqrVarM73975k4.m32855x1(1);
        }
        m73981k4(iVideoFrame.getPlayLoopMode(), iVideoFrame.getVolume(), gqrVarM73975k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73981k4(boolean z, int i, com.aspose.slides.internal.p332p7.gqr gqrVar) {
        com.aspose.slides.internal.p332p7.edw edwVarM32848k4 = gqrVar.m32848k4();
        edwVarM32848k4.m30921k4("Loop");
        edwVarM32848k4.m30923x1(C14113y2.m67368h4(C14051ck.m66557x1(z)));
        com.aspose.slides.internal.p332p7.edw edwVarM32848k42 = gqrVar.m32848k4();
        edwVarM32848k42.m30921k4("Mute");
        edwVarM32848k42.m30923x1(C14113y2.m67368h4(C14051ck.m66557x1(i == 0)));
        com.aspose.slides.internal.p332p7.edw edwVarM32848k43 = gqrVar.m32848k4();
        edwVarM32848k43.m30921k4("VolumeDB");
        edwVarM32848k43.m30923x1("0");
    }
}
