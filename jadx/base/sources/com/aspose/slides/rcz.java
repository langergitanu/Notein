package com.aspose.slides;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.AbstractC8714rv;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7590ep;
import com.aspose.slides.internal.p332p7.C8290mt;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.AbstractC11710bm;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.C13981tl;

/* JADX INFO: loaded from: classes3.dex */
class rcz {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IPictureFrame m70075k4(ShapeCollection shapeCollection, AbstractC8714rv abstractC8714rv, C7590ep c7590ep, gnb gnbVar) {
        VideoFrame videoFrameM2652x1;
        C13981tl c13981tl;
        C11791os c11791osM55296x1;
        String strM31191k4 = c7590ep.m31191k4();
        C13981tl c13981tlM73951k4 = C14854yo.m73951k4(abstractC8714rv.mo35656k4().mo44221kk().m32908c5());
        if (c13981tlM73951k4 == null) {
            videoFrameM2652x1 = null;
        } else if (c13981tlM73951k4.m65901dy("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            String strM65912to = c13981tlM73951k4.m65912to("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (C14113y2.m67411k4(strM65912to) || (c11791osM55296x1 = gnbVar.m55338u4().m55303k4(strM65912to).m55296x1()) == null) {
                videoFrameM2652x1 = null;
            } else {
                IAudio[] iAudioArr = {null};
                boolean zTryGetValue = gnbVar.m6788kk().tryGetValue(c11791osM55296x1, iAudioArr);
                IAudio iAudio = iAudioArr[0];
                if (zTryGetValue) {
                    AudioFrame audioFrameM2647x1 = shapeCollection.m2647x1(iAudio);
                    audioFrameM2647x1.mo272to().m67909k4(0);
                    return audioFrameM2647x1;
                }
                videoFrameM2652x1 = shapeCollection.m2652x1(gnbVar.m6789kk(c11791osM55296x1));
            }
            if (c13981tlM73951k4.m65901dy("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
                strM31191k4 = c13981tlM73951k4.m65912to("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
        }
        if (videoFrameM2652x1 == null && !C14113y2.m67411k4(strM31191k4)) {
            C11709bg c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(strM31191k4);
            if (c11709bgM55303k4.m55294m9() == 1) {
                videoFrameM2652x1 = shapeCollection.m2614dy();
                try {
                    C14062gk c14062gk = new C14062gk(c11709bgM55303k4.m55292k4());
                    videoFrameM2652x1.setLinkPathLong(c14062gk.m66679dy() ? c14062gk.m66677ck() : c14062gk.m66697x1());
                } catch (RuntimeException e) {
                    videoFrameM2652x1.setLinkPathLong(c11709bgM55303k4.m55292k4());
                    C3085sv.m13082k4(e);
                }
            } else if (c11709bgM55303k4.m55296x1() != null) {
                videoFrameM2652x1 = shapeCollection.m2652x1(gnbVar.m6789kk(c11709bgM55303k4.m55296x1()));
            }
        }
        if (videoFrameM2652x1 == null) {
            return null;
        }
        if (c13981tlM73951k4 != null && (c13981tl = c13981tlM73951k4.get_Item("trim", "http://schemas.microsoft.com/office/powerpoint/2010/main")) != null) {
            float[] fArr = {0.0f};
            C14064he.m66713k4(c13981tl.m65906k4("st"), FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), fArr);
            videoFrameM2652x1.setTrimFromStart(fArr[0]);
            float[] fArr2 = {0.0f};
            C14064he.m66713k4(c13981tl.m65906k4("end"), FrameMetricsAggregator.EVERY_DURATION, C11697x1.m55250kk(), fArr2);
            videoFrameM2652x1.setTrimFromEnd(fArr2[0]);
        }
        return videoFrameM2652x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C8290mt m70076k4(VideoFrame videoFrame) {
        jmb jmbVarMo268du = videoFrame.mo268du();
        if (jmbVarMo268du.m69046uz() == null) {
            jmbVarMo268du.m69038h4(new com.aspose.slides.internal.p332p7.ltr());
        }
        return com.aspose.slides.internal.p332p7.d0s.m30001kk(jmbVarMo268du.m69046uz(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70077k4(VideoFrame videoFrame, com.aspose.slides.internal.p332p7.ks0 ks0Var, u8s u8sVar) {
        r3b.m70019k4(videoFrame, ks0Var, u8sVar);
        boolean zM67411k4 = C14113y2.m67411k4(videoFrame.getLinkPathLong());
        boolean z = !zM67411k4;
        int i = 0;
        com.aspose.slides.internal.p332p7.hgn hgnVar = null;
        if (!zM67411k4 || videoFrame.getEmbeddedVideo() != null) {
            if (videoFrame.getEmbeddedVideo() == null && C3131h4.m13361kk(videoFrame.getLinkPathLong())) {
                videoFrame.setEmbeddedVideo(((VideoCollection) u8sVar.m71526c5().getVideos()).m3071k4(C3131h4.m13362m9(videoFrame.getLinkPathLong()), (String) null, (String) null));
                z = false;
            }
            ((C7590ep) ks0Var.mo35656k4().mo44221kk().m32912k4("videoFile").m29542x1()).m31192k4(u8sVar.m55433g8().m55305k4(AbstractC11710bm.f39690k4.m55382k4(), z ? C3085sv.m13080k4(videoFrame.getLinkPathLong()) : u8sVar.m71541k4(videoFrame.getEmbeddedVideo()).m55427x1(), z ? (byte) 1 : (byte) -1).m55289du());
            C8290mt c8290mtM70076k4 = m70076k4(videoFrame);
            if (videoFrame.getEmbeddedVideo() != null) {
                m70078k4(videoFrame, c8290mtM70076k4, ks0Var, z, u8sVar);
            } else {
                m70079k4(videoFrame, c8290mtM70076k4, z, u8sVar);
            }
        }
        if (videoFrame.getTrimFromStart() != 0.0f || videoFrame.getTrimFromEnd() != 0.0f) {
            C13981tl c13981tl = (C13981tl) fyw.m6352k4((AbstractC13901ga) m70076k4(videoFrame).m37126x1().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
            C13981tl c13981tlCreateElement = c13981tl.get_Item("trim", "http://schemas.microsoft.com/office/powerpoint/2010/main");
            if (c13981tlCreateElement == null) {
                c13981tlCreateElement = c13981tl.getOwnerDocument().createElement("trim", "http://schemas.microsoft.com/office/powerpoint/2010/main");
                c13981tl.appendChild(c13981tlCreateElement);
            }
            if (videoFrame.getTrimFromStart() != 0.0f) {
                c13981tlCreateElement.m65910kk("st", C14064he.m66711k4(videoFrame.getTrimFromStart(), (InterfaceC14073kp) C11697x1.m55250kk()));
            }
            if (videoFrame.getTrimFromEnd() != 0.0f) {
                c13981tlCreateElement.m65910kk("end", C14064he.m66711k4(videoFrame.getTrimFromEnd(), (InterfaceC14073kp) C11697x1.m55250kk()));
            }
        }
        if (C7019kk.m27469x1(videoFrame.getSlide(), ISlide.class)) {
            Slide slide = (Slide) videoFrame.getSlide();
            long jM63185k4 = C13670j2.m63185k4(slide);
            if (slide.m2708ne().m5301k4() == null) {
                slide.m2708ne().m5304k4(new com.aspose.slides.internal.p332p7.ehe());
            }
            com.aspose.slides.internal.p332p7.rqz rqzVarM31097kk = slide.m2708ne().m5301k4().m31097kk();
            if (rqzVarM31097kk == null) {
                rqzVarM31097kk = slide.m2708ne().m5301k4().m31093k4();
            }
            C7394ca[] c7394caArrM63940k4 = kjx.m63940k4(rqzVarM31097kk, videoFrame);
            int length = c7394caArrM63940k4.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C7394ca c7394ca = c7394caArrM63940k4[i];
                if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.hgn.class)) {
                    hgnVar = (com.aspose.slides.internal.p332p7.hgn) c7394ca.m29542x1();
                    break;
                }
                i++;
            }
            if (hgnVar == null) {
                hgnVar = (com.aspose.slides.internal.p332p7.hgn) rqzVarM31097kk.m40178k4("video").m29542x1();
            }
            q5v.m69418k4(hgnVar, videoFrame, (int) (jM63185k4 + 1), videoFrame.m2584wp());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70078k4(VideoFrame videoFrame, C8290mt c8290mt, com.aspose.slides.internal.p332p7.ks0 ks0Var, boolean z, u8s u8sVar) {
        C13981tl c13981tl = (C13981tl) fyw.m6352k4((AbstractC13901ga) c8290mt.m37126x1().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
        c13981tl.m65907k4("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", u8sVar.m55433g8().m55305k4("http://schemas.microsoft.com/office/2007/relationships/media", u8sVar.m71541k4(videoFrame.getEmbeddedVideo()).m55427x1(), (byte) -1).m55289du());
        if (z) {
            c13981tl.m65907k4("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", u8sVar.m55433g8().m55305k4("http://schemas.microsoft.com/office/2007/relationships/media", C3085sv.m13080k4(videoFrame.getLinkPathLong()), (byte) 1).m55289du());
        } else {
            c13981tl.m65899du("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        AbstractC7414ck abstractC7414ckM32908c5 = ks0Var.mo35656k4().mo44221kk().m32908c5() != null ? ks0Var.mo35656k4().mo44221kk().m32908c5() : ks0Var.mo35656k4().mo44221kk().m32917kk();
        (abstractC7414ckM32908c5.mo29643k4().length > 0 ? abstractC7414ckM32908c5.mo29643k4()[0] : abstractC7414ckM32908c5.mo29646x1()).mo28310k4(c8290mt.mo28309k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70079k4(VideoFrame videoFrame, C8290mt c8290mt, boolean z, u8s u8sVar) {
        C13981tl c13981tl = (C13981tl) fyw.m6354k4(c8290mt.m37126x1().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
        if (c13981tl != null) {
            if (z) {
                c13981tl.m65907k4("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", u8sVar.m55433g8().m55305k4("http://schemas.microsoft.com/office/2007/relationships/media", C3085sv.m13080k4(videoFrame.getLinkPathLong()), (byte) 1).m55289du());
            } else {
                c13981tl.m65899du("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
        }
    }
}
