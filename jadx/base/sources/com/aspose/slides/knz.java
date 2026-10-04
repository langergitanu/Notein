package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10396d3;
import com.aspose.slides.internal.p407st.C10404dl;
import com.aspose.slides.internal.p407st.C10433f7;
import com.aspose.slides.internal.p407st.C10503k4;
import com.aspose.slides.internal.p407st.C10572o9;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10705x3;

/* JADX INFO: loaded from: classes3.dex */
class knz extends afo {
    /* JADX INFO: renamed from: k4 */
    public static void m64052k4(VideoFrame videoFrame, C10433f7 c10433f7, uz3 uz3Var) {
        if (uz3Var.m72000ix() == null) {
            return;
        }
        C10404dl c10404dlM50785x1 = c10433f7.m50785x1();
        long jM50689x1 = c10404dlM50785x1.m50689x1();
        c10404dlM50785x1.m50688k4(1 + jM50689x1);
        C10705x3 c10705x3 = new C10705x3(0);
        c10433f7.m50513yj().addItem(c10705x3);
        c10705x3.m50513yj().addItem(new C10396d3(0));
        C10572o9 c10572o9 = new C10572o9();
        c10572o9.m51415k4(jM50689x1);
        c10705x3.m51968x1().m50513yj().addItem(c10572o9);
        c10705x3.m51968x1().m50619k4(new C10626rv(videoFrame.getLinkPathLong(), (short) 0));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64053k4(qah qahVar) {
        nk4 nk4Var = (nk4) qahVar.m69481du();
        if (nk4Var.m68063k4() == null) {
            throw new InvalidDataException("No linked object for VideoFrame!");
        }
        VideoFrame videoFrame = (VideoFrame) C7019kk.m27452k4((Object) nk4Var.m70148u4(), VideoFrame.class);
        if (videoFrame == null) {
            throw new NullReferenceException("VideoFrame isn't created!");
        }
        afo.m3544kk(qahVar);
        C10358am c10358amMo50862jd = qahVar.m69489kk().mo50862jd();
        C10503k4 c10503k4M51965x1 = c10358amMo50862jd.m50428h4() != null ? c10358amMo50862jd.m50428h4().m51965x1() : null;
        if (c10503k4M51965x1 != null) {
            videoFrame.mo268du().m63438k4(!c10503k4M51965x1.m51086to() ? 1 : 0);
        } else {
            videoFrame.mo268du().m63438k4(1);
        }
        C10396d3 c10396d3 = (C10396d3) nk4Var.m68063k4();
        videoFrame.setLinkPathLong(c10396d3.m50620to() == null ? "" : c10396d3.m50620to().m51659x1());
        videoFrame.f3666rv = c10396d3.m50621x1().m51417kk();
        videoFrame.setHyperlinkClick(Hyperlink.getMedia());
        videoFrame.f3670yj = 2;
    }
}
