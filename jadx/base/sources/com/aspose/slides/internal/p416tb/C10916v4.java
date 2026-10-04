package com.aspose.slides.internal.p416tb;

import com.aspose.slides.internal.p039be.AbstractC1687m9;
import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p039be.C1682dy;
import com.aspose.slides.internal.p039be.C1684jd;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p085dk.C3177m9;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5658to;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9758b3;
import com.aspose.slides.internal.p353q7.C9760bz;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.v4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10916v4 {

    /* JADX INFO: renamed from: du */
    private float f37965du;

    /* JADX INFO: renamed from: h4 */
    private C4317dy f37966h4;

    /* JADX INFO: renamed from: k4 */
    private final C10898dy f37967k4;

    /* JADX INFO: renamed from: kk */
    private boolean f37968kk;

    /* JADX INFO: renamed from: m9 */
    private String f37969m9;

    /* JADX INFO: renamed from: to */
    private float f37970to;

    /* JADX INFO: renamed from: x1 */
    private final C10894bv f37971x1;

    public C10916v4(C10898dy c10898dy, C10894bv c10894bv) {
        this.f37967k4 = c10898dy;
        this.f37971x1 = c10894bv;
    }

    /* JADX INFO: renamed from: k4 */
    private static C4317dy m52574k4(AbstractC1689x1 abstractC1689x1, C12025x6 c12025x6) {
        return new C4317dy(1.0f, 0.0f, abstractC1689x1.m9132x1() ? 0.34906584f : 0.0f, -1.0f, c12025x6.m56897x1(), c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: kk */
    private void m52584kk(C4317dy c4317dy) {
        this.f37970to = c4317dy.m17330dy();
        this.f37965du = c4317dy.m17328c5();
    }

    /* JADX INFO: renamed from: x1 */
    public static C5659x1 m52585x1(C5659x1 c5659x1, String str) {
        C5659x1 c5659x1M48331k4 = C9763ck.m48030to().mo48031k4("Arial Unicode MS", c5659x1.m23125x1()) != null ? C9763ck.m48030to().m48331k4("Arial Unicode MS", c5659x1.m23114dy(), c5659x1.m23125x1()) : null;
        C5659x1 c5659x1M48331k42 = C9763ck.m48030to().m48331k4("MS Gothic", c5659x1.m23114dy(), c5659x1.m23125x1());
        C5659x1 c5659x1M48331k43 = C9763ck.m48030to().m48331k4("Times New Roman", c5659x1.m23114dy(), c5659x1.m23125x1());
        if ("Arial".equals(c5659x1.m23123m9())) {
            if (c5659x1M48331k4 != null && m52582k4(c5659x1M48331k4, str)) {
                return c5659x1M48331k4;
            }
        } else {
            if (m52582k4(c5659x1M48331k43, str)) {
                return c5659x1M48331k43;
            }
            if (c5659x1M48331k4 != null && m52582k4(c5659x1M48331k4, str)) {
                return c5659x1M48331k4;
            }
        }
        return c5659x1M48331k42;
    }

    /* JADX INFO: renamed from: k4 */
    private String m52575k4(String str) {
        if (C14113y2.m67429to(str, '\t') == -1) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < (this.f37967k4.m52464x1().m52630wl() & 4294967295L); i++) {
            c6765kp.m26780k4(ControlChar.SPACE_CHAR);
        }
        String string = c6765kp.toString();
        C6765kp c6765kp2 = new C6765kp();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t') {
                c6765kp2.m26792k4(string);
            } else {
                c6765kp2.m26780k4(cCharAt);
            }
        }
        return c6765kp2.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52589x1() {
        if (this.f37968kk) {
            this.f37971x1.m52429kk("ET");
            this.f37968kk = false;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m52586x1(C4317dy c4317dy) {
        return c4317dy.m17347to() == 1.0f && c4317dy.m17329du() == 0.0f && c4317dy.m17331h4() == 0.0f && c4317dy.m17346m9() == -1.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52587k4() {
        if (this.f37968kk) {
            return;
        }
        this.f37971x1.m52429kk("BT");
        this.f37968kk = true;
        this.f37969m9 = "Tj";
        this.f37966h4 = new C4317dy();
    }

    /* JADX INFO: renamed from: k4 */
    private void m52576k4(int i) {
        this.f37967k4.m52456jd().m17763k4(i, this.f37971x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m52577k4(AbstractC1689x1 abstractC1689x1, C12025x6 c12025x6, float f) {
        C4317dy c4317dyM52574k4 = m52574k4(abstractC1689x1, c12025x6.Clone());
        c4317dyM52574k4.m17336k4(f, f, 0);
        if (!m52586x1(c4317dyM52574k4) || !m52586x1(this.f37966h4)) {
            m52578k4(c4317dyM52574k4);
        } else {
            if (c4317dyM52574k4.m17330dy() == this.f37970to && c4317dyM52574k4.m17328c5() == this.f37965du) {
                return;
            }
            float fM17330dy = c4317dyM52574k4.m17330dy() - this.f37966h4.m17330dy();
            float fM17328c5 = c4317dyM52574k4.m17328c5() - this.f37966h4.m17328c5();
            if (fM17330dy == 0.0f) {
                if (fM17328c5 != this.f37967k4.m52456jd().m17773x1().m17721c5()) {
                    this.f37967k4.m52456jd().m17762k4(fM17328c5, this.f37971x1);
                }
                this.f37969m9 = "'";
            } else if (fM17328c5 == this.f37967k4.m52456jd().m17773x1().m17721c5()) {
                this.f37971x1.m52431kk("{0} {1} Td", C10921yd.m52639x1(fM17330dy), C10921yd.m52639x1(-fM17328c5));
            } else {
                this.f37971x1.m52431kk("{0} {1} TD", C10921yd.m52639x1(fM17330dy), C10921yd.m52639x1(-fM17328c5));
                this.f37967k4.m52456jd().m17773x1().m17737kk(fM17328c5);
            }
        }
        m52584kk(c4317dyM52574k4);
        this.f37966h4 = c4317dyM52574k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m52578k4(C4317dy c4317dy) {
        this.f37971x1.m52423k4(c4317dy, "Tm");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m52588k4(C10963ks c10963ks) {
        boolean z;
        boolean z2;
        String strM67371jd;
        C12025x6 c12025x6Clone;
        float fM23115h4;
        String strM52575k4 = m52575k4(c10963ks.m52977ck());
        int iM52597x1 = this.f37967k4.m52464x1().m52609ix().m52596k4(c10963ks.m53005x1().m23123m9()) ? this.f37967k4.m52464x1().m52609ix().m52597x1(c10963ks.m53005x1().m23123m9()) : this.f37967k4.m52464x1().m52627u4();
        C5659x1 c5659x1M53005x1 = c10963ks.m53005x1();
        if (C7019kk.m27469x1(c5659x1M53005x1.m23120k4().m48233um(), C9758b3.class) || this.f37967k4.m52454fa()) {
            AbstractC3150x6 abstractC3150x6Mo47984x1 = c5659x1M53005x1.m23120k4().m48233um().mo47984x1();
            try {
                C3152yj c3152yj = new C3152yj();
                try {
                    C13447k4.m62556k4(abstractC3150x6Mo47984x1, c3152yj);
                    byte[] array = c3152yj.toArray();
                    c3152yj.dispose();
                    if (abstractC3150x6Mo47984x1 != null) {
                        abstractC3150x6Mo47984x1.dispose();
                    }
                    if ("OTTO".equals(AbstractC6747ar.m26635ix().mo26682x1(array, 0, 4))) {
                        c5659x1M53005x1 = new C5659x1(c5659x1M53005x1.m23114dy(), c5659x1M53005x1.m23125x1(), new C9760bz().m48013k4(C11240k4.m54219k4(array), c5659x1M53005x1.m23123m9()));
                    }
                } catch (Throwable th) {
                    c3152yj.dispose();
                    throw th;
                }
            } finally {
            }
        }
        if (!C3177m9.m13599k4(iM52597x1, 1)) {
            if (C3177m9.m13599k4(iM52597x1, 4) && c5659x1M53005x1.m23120k4().m48174bv()) {
                z = true;
                iM52597x1 = 2;
            } else if (iM52597x1 != 2 || c5659x1M53005x1.m23120k4().m48174bv() || c5659x1M53005x1.m23120k4().m48225qq()) {
                z = true;
            } else {
                z2 = !C12565ks.m58627kk(strM52575k4);
            }
            if (!m52582k4(c5659x1M53005x1, strM52575k4)) {
                c5659x1M53005x1 = m52585x1(c5659x1M53005x1, strM52575k4);
            }
            AbstractC1689x1 abstractC1689x1M52558k4 = this.f37967k4.m52459kk().m52558k4(c5659x1M53005x1, z, iM52597x1);
            if (c10963ks.m53005x1().m23113du() != 1) {
                m52580k4(strM52575k4, abstractC1689x1M52558k4, 1.0f, z, c10963ks);
                return;
            }
            C5658to c5658to = new C5658to(strM52575k4);
            C12025x6 c12025x6Clone2 = c10963ks.m52982jd().Clone();
            while (c5658to.hasNext()) {
                if (c5658to.next().m23107k4()) {
                    strM67371jd = C14113y2.m67371jd(c5658to.next().m23108x1());
                    c12025x6Clone = c12025x6Clone2.Clone();
                    fM23115h4 = c10963ks.m53005x1().m23115h4();
                } else {
                    strM67371jd = c5658to.next().m23108x1();
                    c12025x6Clone = c12025x6Clone2.Clone();
                    fM23115h4 = 1.0f;
                }
                m52581k4(strM67371jd, abstractC1689x1M52558k4, c12025x6Clone, fM23115h4, z, c10963ks);
                c12025x6Clone2.m56891k4(c10963ks.m53005x1().m23118k4(c5658to.next().m23108x1()) + c12025x6Clone2.m56897x1());
            }
            return;
        }
        boolean zM58627kk = C12565ks.m58627kk(strM52575k4);
        z2 = !zM58627kk;
        if (!zM58627kk && !C3177m9.m13599k4(iM52597x1, 4) && !C3177m9.m13599k4(iM52597x1, 2)) {
            iM52597x1 |= 2;
        }
        z = z2;
        if (!m52582k4(c5659x1M53005x1, strM52575k4)) {
        }
        AbstractC1689x1 abstractC1689x1M52558k42 = this.f37967k4.m52459kk().m52558k4(c5659x1M53005x1, z, iM52597x1);
        if (c10963ks.m53005x1().m23113du() != 1) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m52579k4(String str, AbstractC1687m9 abstractC1687m9, boolean z) {
        C10894bv c10894bv;
        String str2;
        if (z) {
            this.f37971x1.m52426k4("[");
            this.f37971x1.m52426k4("(");
            abstractC1687m9.mo9088k4(str);
            abstractC1687m9.m9107k4(str, this.f37971x1.m52433x1());
            this.f37971x1.m52429kk(")");
            this.f37971x1.m52429kk("]");
            c10894bv = this.f37971x1;
            str2 = "TJ";
        } else {
            this.f37971x1.m52426k4("(");
            abstractC1687m9.mo9088k4(str);
            this.f37971x1.m52432to(str);
            this.f37971x1.m52429kk(")");
            c10894bv = this.f37971x1;
            str2 = this.f37969m9;
        }
        c10894bv.m52429kk(str2);
        this.f37969m9 = "Tj";
    }

    /* JADX INFO: renamed from: k4 */
    private void m52580k4(String str, AbstractC1689x1 abstractC1689x1, float f, boolean z, C10963ks c10963ks) {
        if (c10963ks.m52999qq() == null) {
            m52581k4(str, abstractC1689x1, c10963ks.m52982jd().Clone(), 1.0f, z, c10963ks);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            m52581k4(C14117yj.m67537ne(str.charAt(i)), abstractC1689x1, new C12025x6(c10963ks.m52999qq()[i], c10963ks.m52982jd().m56895kk()).Clone(), f, z, c10963ks);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m52581k4(String str, AbstractC1689x1 abstractC1689x1, C12025x6 c12025x6, float f, boolean z, C10963ks c10963ks) {
        m52587k4();
        this.f37967k4.m52456jd().m17764k4(abstractC1689x1, c10963ks.m53005x1().m23114dy(), this.f37971x1);
        this.f37967k4.m52456jd().m17774x1(c10963ks.m53007x6(), this.f37971x1);
        m52577k4(abstractC1689x1, c12025x6.Clone(), f);
        C5656k4 c5656k4M52997m9 = c10963ks.m52997m9();
        C5656k4 c5656k4 = C5656k4.f15629ze;
        if (C5656k4.m23097to(c5656k4M52997m9, c5656k4) || abstractC1689x1.m9123kk()) {
            if (C5656k4.m23097to(c10963ks.m52995kk(), c5656k4)) {
                m52576k4(2);
                this.f37967k4.m52456jd().m17767k4(c10963ks.m52995kk(), false, this.f37971x1);
            } else {
                m52576k4(1);
            }
            if (abstractC1689x1.m9123kk() && c10963ks.m52997m9().m23100h4()) {
                this.f37971x1.m52430kk("{0} w", C10921yd.m52639x1(c10963ks.m53005x1().m23114dy() / 30.0f));
                this.f37967k4.m52456jd().m17767k4(C5656k4.m23097to(c10963ks.m52995kk(), c5656k4) ? c10963ks.m52995kk() : c10963ks.m52997m9(), true, this.f37971x1);
            } else if ((!c10963ks.m52997m9().m23100h4() && abstractC1689x1.m9123kk()) || !c10963ks.m52997m9().m23100h4()) {
                this.f37971x1.m52430kk("{0} w", C10921yd.m52639x1(c10963ks.m52976c5()));
                this.f37967k4.m52456jd().m17767k4(c10963ks.m52997m9(), true, this.f37971x1);
            }
        } else {
            m52576k4(0);
            this.f37967k4.m52456jd().m17767k4(c10963ks.m52995kk(), false, this.f37971x1);
        }
        if (!z) {
            m52579k4(str, (C1682dy) abstractC1689x1, c10963ks.m52994k4());
            return;
        }
        boolean zM52583k4 = m52583k4(c10963ks, str, (C1684jd) abstractC1689x1);
        boolean z2 = c10963ks.m53007x6() != 0.0f;
        if (zM52583k4 || z2) {
            return;
        }
        this.f37970to = c10963ks.m53002up().m56699x1() + this.f37970to;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m52582k4(C5659x1 c5659x1, String str) {
        int i = 0;
        while (i < str.length()) {
            int iCharAt = str.charAt(i);
            if (C14117yj.m67514du(str.charAt(i))) {
                char cCharAt = str.charAt(i);
                i++;
                iCharAt = C14117yj.m67525k4(cCharAt, str.charAt(i));
            }
            if (c5659x1.m23120k4().m48221m9().m48107x1(iCharAt).equals(c5659x1.m23120k4().m48221m9().m48106x1())) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m52583k4(C10963ks c10963ks, String str, C1684jd c1684jd) {
        boolean zM9099k4;
        if (C14113y2.m67364dy(c1684jd.m9127to(), "MicrosoftNewTaiLue") != -1) {
            str = C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(C14113y2.m67401k4(str, "ᦵ", "ᦵ◌"), "ᦶ", "ᦶ◌"), "ᦷ", "ᦷ◌"), "ᦺ", "ᦺ◌");
        }
        if (c10963ks.m52981ix() == null) {
            zM9099k4 = c1684jd.m9096k4(c10963ks, str, this.f37971x1.m52433x1());
        } else {
            this.f37971x1.m52426k4("[");
            this.f37971x1.m52426k4("(");
            zM9099k4 = c1684jd.m9099k4((int[]) C7019kk.m27458kk(c10963ks.m52981ix(), int[].class), this.f37971x1.m52433x1());
            this.f37971x1.m52429kk(")");
            this.f37971x1.m52429kk("]");
            this.f37971x1.m52429kk("TJ");
        }
        this.f37969m9 = "Tj";
        return zM9099k4;
    }
}
