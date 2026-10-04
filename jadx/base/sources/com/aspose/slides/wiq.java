package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10373br;
import com.aspose.slides.internal.p407st.C10386c9;
import com.aspose.slides.internal.p407st.C10665uh;
import com.aspose.slides.internal.p407st.C10668un;
import com.aspose.slides.internal.p407st.C10695wm;
import com.aspose.slides.internal.p407st.C10712xh;
import com.aspose.slides.internal.p407st.C10715xl;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class wiq {

    /* JADX INFO: renamed from: du */
    private C10668un f49802du;

    /* JADX INFO: renamed from: k4 */
    private pya f49803k4;

    /* JADX INFO: renamed from: kk */
    private C12014ne f49804kk = new C12014ne(0, 0, 0, 0);

    /* JADX INFO: renamed from: to */
    private String f49805to = null;

    /* JADX INFO: renamed from: x1 */
    private C3134k4 f49806x1;

    public wiq(pya pyaVar, C3134k4 c3134k4) {
        this.f49803k4 = pyaVar;
        this.f49806x1 = c3134k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m72766k4(boolean z) {
        if (z) {
            this.f49805to = C3038bv.m12790k4(this.f49805to);
        }
        int iM56663c5 = this.f49804kk.m56663c5();
        String[] strArrM67416k4 = C14113y2.m67416k4(m72767k4(), new char[]{ControlChar.SPACE_CHAR, ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.LINE_BREAK_CHAR}, (short) 1);
        if (strArrM67416k4.length == 0) {
            return -1;
        }
        int length = 0;
        for (String str : strArrM67416k4) {
            if (length < str.length()) {
                length = str.length();
            }
        }
        if (length > 0) {
            return iM56663c5 / length;
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m72770kk() {
        C10668un c10668un = this.f49802du;
        return c10668un != null && c10668un.m51813x1() >= 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12016rv m72771x1() {
        return this.f49804kk.m56665du();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m72767k4() {
        return this.f49805to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72772x1(C10695wm c10695wm) {
        ofi ofiVar = new ofi(c10695wm, this.f49806x1);
        try {
            C10695wm c10695wmM68511k4 = ofiVar.m68511k4(C7019kk.m27457kk((Object) 3011, 9));
            if (c10695wmM68511k4 != null) {
                C10668un c10668un = new C10668un();
                this.f49802du = c10668un;
                c10668un.m51405k4(this.f49806x1, c10695wmM68511k4);
            }
        } finally {
            ofiVar.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72768k4(C10695wm c10695wm) {
        C12014ne c12014ne;
        switch (c10695wm.m51923to()) {
            case 61455:
                C10715xl c10715xl = new C10715xl();
                c10715xl.m51405k4(this.f49806x1, c10695wm);
                c12014ne = new C12014ne(this.f49803k4.m69329k4(c10715xl.m51979h4().m56665du().Clone()).Clone(), c10715xl.m51979h4().m56680m9().Clone());
                break;
            case 61456:
                C10386c9 c10386c9 = new C10386c9();
                c10386c9.m51405k4(this.f49806x1, c10695wm);
                c12014ne = new C12014ne(c10386c9.m50544h4().m56665du().Clone(), c10386c9.m50544h4().m56680m9().Clone());
                break;
            default:
                return;
        }
        this.f49804kk = c12014ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72769k4(C10695wm c10695wm, List<AbstractC10571o4> list) {
        C10695wm c10695wmM68513x1;
        int iM51923to;
        ofi ofiVar = new ofi(c10695wm, this.f49806x1);
        do {
            try {
                c10695wmM68513x1 = ofiVar.m68513x1();
                if (c10695wmM68513x1 == null) {
                    ofiVar.dispose();
                    return;
                }
                iM51923to = c10695wmM68513x1.m51923to();
                if (iM51923to == 3998) {
                    C10373br c10373br = new C10373br(null);
                    c10373br.m51405k4(this.f49806x1, c10695wmM68513x1);
                    if (c10373br.m50483x1() >= list.size()) {
                        throw new IndexOutOfRangeException("No outlined text!");
                    }
                    AbstractC10571o4 abstractC10571o4 = list.get_Item(c10373br.m50483x1());
                    this.f49805to = C7019kk.m27457kk(Integer.valueOf(abstractC10571o4.m51404bv()), 8) == 4000 ? ((C10665uh) abstractC10571o4).mo51804x1() : ((C10712xh) abstractC10571o4).mo51804x1();
                    ofiVar.dispose();
                    return;
                }
                if (iM51923to == 4000) {
                    C10665uh c10665uh = new C10665uh(null);
                    c10665uh.m51405k4(this.f49806x1, c10695wmM68513x1);
                    this.f49805to = c10665uh.mo51804x1();
                    ofiVar.dispose();
                    return;
                }
            } catch (Throwable th) {
                ofiVar.dispose();
                throw th;
            }
        } while (iM51923to != 4008);
        C10712xh c10712xh = new C10712xh(null);
        c10712xh.m51405k4(this.f49806x1, c10695wmM68513x1);
        this.f49805to = c10712xh.mo51804x1();
        ofiVar.dispose();
    }
}
