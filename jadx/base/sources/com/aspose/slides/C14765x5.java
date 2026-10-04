package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10366b5;
import com.aspose.slides.internal.p407st.C10404dl;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10499jv;
import com.aspose.slides.internal.p407st.C10503k4;
import com.aspose.slides.internal.p407st.C10531ly;
import com.aspose.slides.internal.p407st.C10560nh;
import com.aspose.slides.internal.p407st.C10572o9;
import com.aspose.slides.internal.p407st.C10617r7;
import com.aspose.slides.internal.p407st.C10640sq;
import com.aspose.slides.internal.p407st.C10659tx;
import com.aspose.slides.internal.p407st.C10661u4;
import com.aspose.slides.internal.p407st.C10662u5;
import com.aspose.slides.internal.p407st.C10703x1;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: renamed from: com.aspose.slides.x5 */
/* JADX INFO: loaded from: classes3.dex */
class C14765x5 extends afo {
    /* JADX INFO: renamed from: k4 */
    private static void m73105k4(AudioFrame audioFrame, long j, C10572o9 c10572o9) {
        c10572o9.m51415k4(j);
        c10572o9.m51416k4(audioFrame.getPlayLoopMode());
        c10572o9.m51420x1(audioFrame.getRewindAudio());
    }

    /* JADX INFO: renamed from: kk */
    private static void m73110kk(nk4 nk4Var) {
        C10560nh c10560nh = (C10560nh) nk4Var.m68063k4();
        AudioFrame audioFrame = (AudioFrame) C7019kk.m27452k4((Object) nk4Var.m70148u4(), AudioFrame.class);
        m73107k4(c10560nh.m51369x1(), audioFrame);
        audioFrame.setLinkPathLong(c10560nh.m51368to() == null ? "" : c10560nh.m51368to().m51659x1());
        audioFrame.mo272to().m67909k4(0);
    }

    /* JADX INFO: renamed from: to */
    private static void m73111to(nk4 nk4Var) {
        C10662u5 c10662u5 = (C10662u5) nk4Var.m68063k4();
        AudioFrame audioFrame = (AudioFrame) C7019kk.m27452k4((Object) nk4Var.m70148u4(), AudioFrame.class);
        m73107k4(c10662u5.m51796x1(), audioFrame);
        C10640sq c10640sqM51795to = c10662u5.m51795to();
        audioFrame.setAudioCdStartTrack(c10640sqM51795to.m51698x1() & 255);
        audioFrame.setAudioCdStartTrackTime(c10640sqM51795to.m51696kk());
        audioFrame.setAudioCdEndTrack(c10640sqM51795to.m51697to() & 255);
        audioFrame.setAudioCdEndTrackTime(c10640sqM51795to.m51695du());
        audioFrame.mo272to().m67909k4(2);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m73112x1(nk4 nk4Var) {
        C10617r7 c10617r7 = (C10617r7) nk4Var.m68063k4();
        AudioFrame audioFrame = (AudioFrame) C7019kk.m27452k4((Object) nk4Var.m70148u4(), AudioFrame.class);
        m73107k4(c10617r7.m51618x1(), audioFrame);
        audioFrame.setLinkPathLong(c10617r7.m51617to() == null ? "" : c10617r7.m51617to().m51659x1());
        audioFrame.mo272to().m67909k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73106k4(AudioFrame audioFrame, C10433f7 c10433f7, uz3 uz3Var) {
        C10462h9 c10462h9M72000ix = uz3Var.m72000ix();
        if (c10462h9M72000ix == null) {
            return;
        }
        C10358am c10358amMo50862jd = c10462h9M72000ix.mo50862jd();
        y2n y2nVarM70215k4 = uz3Var.m3745to().m3738du().m70215k4();
        C10404dl c10404dlM50785x1 = c10433f7.m50785x1();
        long jM50689x1 = c10404dlM50785x1.m50689x1();
        c10404dlM50785x1.m50688k4(jM50689x1 + 1);
        int iM67908k4 = audioFrame.mo272to().m67908k4();
        if (iM67908k4 == 0) {
            C10617r7 c10617r7 = new C10617r7();
            c10433f7.m50513yj().addItem(c10617r7);
            m73105k4(audioFrame, jM50689x1, c10617r7.m51618x1());
            c10617r7.m51617to().m51658k4(audioFrame.getLinkPathLong());
        } else if (iM67908k4 == 1) {
            C10366b5 c10366b5 = new C10366b5();
            c10433f7.m50513yj().addItem(c10366b5);
            m73105k4(audioFrame, jM50689x1, c10366b5.m50455x1());
            if (audioFrame.getEmbeddedAudio() != null) {
                c10366b5.m50454to().m50773k4(((long) nmb.m68089k4(audioFrame.getEmbeddedAudio(), y2nVarM70215k4)) & 4294967295L);
            }
        }
        C10531ly c10531ly = new C10531ly();
        c10531ly.m51228k4(((c10433f7.m50785x1().m50689x1() & 4294967295L) - 1) & 4294967295L);
        c10358amMo50862jd.m50507k4(c10531ly);
        if (audioFrame.f210kk == 0) {
            C10703x1 c10703x1 = new C10703x1();
            c10358amMo50862jd.m50507k4(c10703x1);
            C10503k4 c10503k4 = new C10503k4();
            c10703x1.m50513yj().addItem(c10503k4);
            c10503k4.m51077k4(new C10661u4(6L, C12003du.m56460uz().Clone()));
            c10503k4.m51079k4(true);
            c10503k4.m51082kk(true);
            c10503k4.m51085to(true);
            c10503k4.m51076k4(0L);
            c10503k4.m51078k4((short) uz3Var.m72013yd());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73107k4(C10572o9 c10572o9, AudioFrame audioFrame) {
        audioFrame.setPlayLoopMode(c10572o9.m51417kk());
        audioFrame.setRewindAudio(c10572o9.m51418to());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73108k4(nk4 nk4Var) {
        C10366b5 c10366b5 = (C10366b5) nk4Var.m68063k4();
        AudioFrame audioFrame = (AudioFrame) C7019kk.m27452k4((Object) nk4Var.m70148u4(), AudioFrame.class);
        a3u a3uVarM64712du = nk4Var.m70149up().m64712du();
        m73107k4(c10366b5.m50455x1(), audioFrame);
        audioFrame.f218x1 = "";
        audioFrame.f209k4 = "";
        try {
            C10499jv c10499jvM51705jd = a3uVarM64712du.m71951m9().m51705jd();
            if (c10499jvM51705jd != null) {
                C10659tx c10659txM51042k4 = c10499jvM51705jd.m51042k4((int) c10366b5.m50454to().m50774x1());
                if (c10659txM51042k4.m51784h4() != null) {
                    audioFrame.setEmbeddedAudio(a3uVarM64712du.m3179k4(c10659txM51042k4));
                }
            }
            audioFrame.mo272to().m67909k4(1);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73109k4(qah qahVar) {
        nk4 nk4Var = (nk4) qahVar.m69481du();
        if (nk4Var.m68063k4() == null) {
            throw new InvalidDataException("No linked object for AudioFrame!");
        }
        AudioFrame audioFrame = (AudioFrame) C7019kk.m27452k4((Object) nk4Var.m70148u4(), AudioFrame.class);
        if (audioFrame == null) {
            throw new NullReferenceException("AudioFrame isn't created!");
        }
        C10462h9 c10462h9 = (C10462h9) C7019kk.m27452k4((Object) qahVar.m69489kk(), C10462h9.class);
        afo.m3544kk(qahVar);
        C10503k4 c10503k4M51965x1 = c10462h9.mo50862jd().m50428h4() != null ? c10462h9.mo50862jd().m50428h4().m51965x1() : null;
        if (c10503k4M51965x1 != null) {
            audioFrame.f210kk = !c10503k4M51965x1.m51086to() ? 1 : 0;
        } else {
            audioFrame.f210kk = 1;
        }
        audioFrame.setHyperlinkClick(Hyperlink.getMedia());
        audioFrame.setVolume(3);
        switch (nk4Var.m68063k4().m51404bv() & 65535) {
            case 4109:
                m73110kk(nk4Var);
                return;
            case 4110:
                m73111to(nk4Var);
                return;
            case 4111:
                m73108k4(nk4Var);
                return;
            case 4112:
                m73112x1(nk4Var);
                return;
            default:
                throw new ArgumentOutOfRangeException("Unknown ExContainer for OleObjectFrame!");
        }
    }
}
