package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.AbstractC8714rv;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8290mt;
import com.aspose.slides.internal.p332p7.C8360nm;
import com.aspose.slides.internal.p332p7.C8528pk;
import com.aspose.slides.internal.p332p7.C9188xc;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11751h4;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;

/* JADX INFO: renamed from: com.aspose.slides.yo */
/* JADX INFO: loaded from: classes3.dex */
class C14854yo {

    /* JADX INFO: renamed from: k4 */
    public static final float[] f50379k4 = {0.0f, 20.0f, 50.0f, 80.0f};

    /* JADX INFO: renamed from: k4 */
    public static IAudioFrame m73947k4(IGroupShape iGroupShape, C8528pk c8528pk, gnb gnbVar) {
        String strM38951k4 = c8528pk.m38951k4();
        if (strM38951k4 == null || strM38951k4.length() <= 0) {
            return null;
        }
        C11709bg c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(strM38951k4);
        boolean zM67363du = C14113y2.m67363du("NULL", c11709bgM55303k4.m55292k4());
        ShapeCollection shapeCollection = (ShapeCollection) iGroupShape.getShapes();
        return zM67363du ? shapeCollection.m2647x1((IAudio) null) : shapeCollection.m2647x1(gnbVar.m6798x1(c11709bgM55303k4.m55296x1()));
    }

    /* JADX INFO: renamed from: k4 */
    public static IAudioFrame m73948k4(IGroupShape iGroupShape, AbstractC8714rv abstractC8714rv, C8360nm c8360nm, gnb gnbVar) {
        AudioFrame audioFrameM2647x1;
        String strM65912to;
        String strM37711k4 = c8360nm.m37711k4();
        ShapeCollection shapeCollection = (ShapeCollection) iGroupShape.getShapes();
        C13981tl c13981tlM73951k4 = m73951k4(abstractC8714rv.mo35656k4().mo44221kk().m32908c5());
        if (c13981tlM73951k4 != null) {
            if (!c13981tlM73951k4.m65901dy("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships") || (strM65912to = c13981tlM73951k4.m65912to("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) == null || strM65912to.length() <= 0) {
                audioFrameM2647x1 = null;
            } else {
                audioFrameM2647x1 = shapeCollection.m2647x1(gnbVar.m6798x1(gnbVar.m55338u4().m55303k4(strM65912to).m55296x1()));
                audioFrameM2647x1.mo272to().m67909k4(0);
            }
            if (c13981tlM73951k4.m65901dy("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
                strM37711k4 = c13981tlM73951k4.m65912to("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
        } else {
            audioFrameM2647x1 = null;
        }
        if (audioFrameM2647x1 == null && strM37711k4 != null && strM37711k4.length() > 0) {
            C11709bg c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(strM37711k4);
            if (C14113y2.m67363du("NULL", c11709bgM55303k4.m55292k4())) {
                return shapeCollection.m2647x1((IAudio) null);
            }
            if (c11709bgM55303k4.m55294m9() == 1) {
                try {
                    C14062gk c14062gk = new C14062gk(c11709bgM55303k4.m55292k4());
                    return shapeCollection.m2637kk(c14062gk.m66679dy() ? c14062gk.m66677ck() : c14062gk.m66697x1());
                } catch (RuntimeException e) {
                    AudioFrame audioFrameM2637kk = shapeCollection.m2637kk(c11709bgM55303k4.m55292k4());
                    C3085sv.m13082k4(e);
                    return audioFrameM2637kk;
                }
            }
            if (c11709bgM55303k4.m55296x1() != null) {
                AudioFrame audioFrameM2647x12 = shapeCollection.m2647x1(gnbVar.m6798x1(c11709bgM55303k4.m55296x1()));
                audioFrameM2647x12.mo272to().m67909k4(0);
                return audioFrameM2647x12;
            }
        }
        return audioFrameM2647x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static IAudioFrame m73949k4(IGroupShape iGroupShape, C9188xc c9188xc) {
        AudioFrame audioFrameM2611c5 = ((ShapeCollection) iGroupShape.getShapes()).m2611c5();
        audioFrameM2611c5.setAudioCdStartTrack(c9188xc.m44293k4().m38400k4() & 255);
        audioFrameM2611c5.setAudioCdStartTrackTime((int) c9188xc.m44293k4().m38403x1());
        audioFrameM2611c5.setAudioCdEndTrack(c9188xc.m44294x1().m38400k4() & 255);
        audioFrameM2611c5.setAudioCdEndTrackTime((int) c9188xc.m44294x1().m38403x1());
        return audioFrameM2611c5;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC7414ck m73950k4(pga pgaVar) {
        AbstractC7414ck abstractC7414ckM69046uz = pgaVar.m69046uz();
        if (abstractC7414ckM69046uz != null) {
            return abstractC7414ckM69046uz;
        }
        com.aspose.slides.internal.p332p7.ltr ltrVar = new com.aspose.slides.internal.p332p7.ltr();
        C8290mt c8290mtM30001kk = com.aspose.slides.internal.p332p7.d0s.m30001kk(ltrVar, "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
        C13981tl c13981tl = (C13981tl) fyw.m6353k4(c8290mtM30001kk.m37126x1().getDocumentElement(), "p14", "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
        c13981tl.getAttributes().m65175x1(c8290mtM30001kk.m37126x1().createAttribute("r", "embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships"));
        return ltrVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static C13981tl m73951k4(AbstractC7414ck abstractC7414ck) {
        C13981tl documentElement;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (documentElement = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}").getDocumentElement()) == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(documentElement, "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73952k4(AudioFrame audioFrame, com.aspose.slides.internal.p332p7.ks0 ks0Var, u8s u8sVar) {
        C11709bg c11709bgM55304k4;
        C14174na c14174naMo272to = audioFrame.mo272to();
        if (c14174naMo272to.m69046uz() == null) {
            c14174naMo272to.m69038h4(new com.aspose.slides.internal.p332p7.ltr());
        }
        com.aspose.slides.internal.p332p7.h2b h2bVarM30002x1 = com.aspose.slides.internal.p332p7.d0s.m30002x1(c14174naMo272to.m69046uz(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}");
        com.aspose.slides.internal.p332p7.c6b c6bVar = null;
        C13981tl c13981tl = h2bVarM30002x1 == null ? null : (C13981tl) fyw.m6354k4(h2bVarM30002x1.m37126x1().getDocumentElement(), "media", "http://schemas.microsoft.com/office/powerpoint/2010/main");
        r3b.m70019k4(audioFrame, ks0Var, u8sVar);
        int i = 0;
        if (c14174naMo272to.m67908k4() != 2) {
            if (audioFrame.getEmbeddedAudio() == null || !(audioFrame.getEmbeddedAudio() == null || ("audio/wav".equals(audioFrame.getEmbeddedAudio().getContentType()) && c13981tl == null))) {
                c14174naMo272to.m67909k4(0);
            } else {
                c14174naMo272to.m67909k4(1);
            }
        }
        ks0Var.mo35656k4().mo44221kk().m32914k4((C7394ca) null);
        int iM67908k4 = c14174naMo272to.m67908k4();
        com.aspose.slides.internal.p332p7.gt8 gt8VarMo44221kk = ks0Var.mo35656k4().mo44221kk();
        if (iM67908k4 == 0) {
            C8360nm c8360nm = (C8360nm) gt8VarMo44221kk.m32912k4("audioFile").m29542x1();
            if (audioFrame.getEmbeddedAudio() != null) {
                C11791os c11791osM71538k4 = u8sVar.m71538k4(audioFrame.getEmbeddedAudio());
                c11709bgM55304k4 = c11791osM71538k4.m55372fa().mo55275x1().m55382k4() == null ? u8sVar.m55433g8().m55304k4("http://schemas.microsoft.com/office/2007/relationships/media", c11791osM71538k4.m55427x1()) : u8sVar.m55433g8().m55311x1(c11791osM71538k4);
            } else {
                c11709bgM55304k4 = audioFrame.getEmbeddedAudio() == null ? u8sVar.m55433g8().m55304k4(C11751h4.f39750k4.m55382k4(), "NULL") : u8sVar.m55433g8().m55305k4(C11751h4.f39750k4.m55382k4(), C3085sv.m13080k4(audioFrame.getLinkPathLong()), (byte) 1);
            }
            c8360nm.m37712k4(c11709bgM55304k4.m55289du());
            if (audioFrame.getEmbeddedAudio() != null) {
                ((C13981tl) fyw.m6353k4(com.aspose.slides.internal.p332p7.d0s.m30001kk(c14174naMo272to.m69046uz(), "{DAA4B4D4-6D71-4841-9C94-3DE7FCFB9230}").m37126x1().getDocumentElement(), "p14", "media", "http://schemas.microsoft.com/office/powerpoint/2010/main")).m65907k4("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", u8sVar.m55433g8().m55305k4("http://schemas.microsoft.com/office/2007/relationships/media", u8sVar.m71538k4(audioFrame.getEmbeddedAudio()).m55427x1(), (byte) 0).m55289du());
            }
            if (c13981tl != null) {
                if (audioFrame.getEmbeddedAudio() == null) {
                    c13981tl.m65899du("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
                }
                if (audioFrame.getLinkPathLong() == null || audioFrame.getLinkPathLong().length() <= 0) {
                    c13981tl.m65899du("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
                } else {
                    c13981tl.m65907k4("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", u8sVar.m55433g8().m55305k4("http://schemas.microsoft.com/office/2007/relationships/media", C3085sv.m13080k4(audioFrame.getLinkPathLong()), (byte) 1).m55289du());
                }
            }
        } else if (iM67908k4 != 2) {
            ((C8528pk) gt8VarMo44221kk.m32912k4("wavAudioFile").m29542x1()).m38952k4(u8sVar.m55433g8().m55311x1(u8sVar.m71538k4(audioFrame.getEmbeddedAudio())).m55289du());
        } else {
            C9188xc c9188xc = (C9188xc) gt8VarMo44221kk.m32912k4("audioCd").m29542x1();
            c9188xc.m44293k4().m38401k4((byte) audioFrame.getAudioCdStartTrack());
            c9188xc.m44293k4().m38402k4(((long) audioFrame.getAudioCdStartTrackTime()) & 4294967295L);
            c9188xc.m44294x1().m38401k4((byte) audioFrame.getAudioCdEndTrack());
            c9188xc.m44294x1().m38402k4(((long) audioFrame.getAudioCdEndTrackTime()) & 4294967295L);
        }
        if (C7019kk.m27469x1(audioFrame.getSlide(), ISlide.class)) {
            Slide slide = (Slide) audioFrame.getSlide();
            long jM63185k4 = C13670j2.m63185k4(slide);
            if (slide.m2708ne().m5301k4() == null) {
                slide.m2708ne().m5304k4(new com.aspose.slides.internal.p332p7.ehe());
            }
            com.aspose.slides.internal.p332p7.rqz rqzVarM31097kk = slide.m2708ne().m5301k4().m31097kk();
            if (rqzVarM31097kk == null) {
                rqzVarM31097kk = slide.m2708ne().m5301k4().m31093k4();
            }
            C7394ca[] c7394caArrM63940k4 = kjx.m63940k4(rqzVarM31097kk, audioFrame);
            int length = c7394caArrM63940k4.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                C7394ca c7394ca = c7394caArrM63940k4[i];
                if (C7019kk.m27469x1(c7394ca.m29542x1(), com.aspose.slides.internal.p332p7.c6b.class)) {
                    c6bVar = (com.aspose.slides.internal.p332p7.c6b) c7394ca.m29542x1();
                    break;
                }
                i++;
            }
            if (c6bVar == null) {
                c6bVar = (com.aspose.slides.internal.p332p7.c6b) rqzVarM31097kk.m40178k4("audio").m29542x1();
            }
            q5v.m69416k4(c6bVar, audioFrame, (int) (jM63185k4 + 1), audioFrame.m2584wp());
        }
    }
}
