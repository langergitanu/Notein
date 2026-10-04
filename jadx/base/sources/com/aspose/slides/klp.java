package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10358am;
import com.aspose.slides.internal.p407st.C10393cx;
import com.aspose.slides.internal.p407st.C10395d2;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10498jn;
import com.aspose.slides.internal.p407st.C10516kt;
import com.aspose.slides.internal.p407st.C10533m2;
import com.aspose.slides.internal.p407st.C10548mt;
import com.aspose.slides.internal.p407st.C10549mu;
import com.aspose.slides.internal.p407st.C10608qm;
import com.aspose.slides.internal.p407st.C10704x2;

/* JADX INFO: loaded from: classes3.dex */
final class klp {

    /* JADX INFO: renamed from: c5 */
    private boolean f45767c5;

    /* JADX INFO: renamed from: ck */
    private boolean f45768ck;

    /* JADX INFO: renamed from: du */
    private C10704x2 f45769du;

    /* JADX INFO: renamed from: dy */
    private boolean f45770dy;

    /* JADX INFO: renamed from: fa */
    private jio f45771fa;

    /* JADX INFO: renamed from: h4 */
    private List<C10549mu> f45772h4;

    /* JADX INFO: renamed from: jd */
    private boolean f45773jd;

    /* JADX INFO: renamed from: k4 */
    private ri7 f45774k4;

    /* JADX INFO: renamed from: kk */
    private C10395d2 f45775kk;

    /* JADX INFO: renamed from: m9 */
    private TextFrame f45776m9;

    /* JADX INFO: renamed from: to */
    private int f45777to;

    /* JADX INFO: renamed from: up */
    private a3u f45778up;

    /* JADX INFO: renamed from: x1 */
    private C10462h9 f45779x1;

    /* JADX INFO: renamed from: yj */
    private List<AbstractC10571o4> f45780yj;

    public klp(TextFrame textFrame, C10548mt c10548mt) {
        this.f45777to = 4;
        this.f45769du = null;
        this.f45772h4 = null;
        this.f45776m9 = null;
        this.f45770dy = false;
        this.f45767c5 = false;
        this.f45773jd = false;
        this.f45768ck = false;
        this.f45778up = null;
        this.f45780yj = new List<>();
        this.f45776m9 = textFrame;
        this.f45775kk = c10548mt.m51346x1();
        m63982wl();
    }

    /* JADX INFO: renamed from: ix */
    private void m63977ix() {
        ri7 ri7Var;
        C10608qm c10608qmM50723to;
        if (this.f45769du != null || (ri7Var = this.f45774k4) == null || ri7Var.m70145ne() == null) {
            return;
        }
        m4c m4cVarM70149up = m63999x1().m70149up();
        if (m4cVarM70149up.m64712du().m71951m9().m51713rv() == null || (c10608qmM50723to = m4cVarM70149up.m64712du().m71951m9().m51713rv().m50723to()) == null) {
            return;
        }
        C10498jn c10498jnM51596x1 = c10608qmM50723to.m51596x1();
        C10393cx c10393cxM51041x6 = c10498jnM51596x1 != null ? c10498jnM51596x1.m51041x6() : null;
        if (c10393cxM51041x6 != null) {
            this.f45769du = c10393cxM51041x6.m50574k4(m4cVarM70149up.m64735up().mo404to().m6932k4(), (short) (((int) this.f45774k4.m70145ne().m68209x1()) << 4));
        }
    }

    /* JADX INFO: renamed from: ne */
    private void m63978ne() {
        this.f45775kk = null;
        C10548mt c10548mtM50880ck = this.f45779x1.m50880ck();
        if (c10548mtM50880ck == null) {
            return;
        }
        this.f45775kk = c10548mtM50880ck.m51346x1();
    }

    /* JADX INFO: renamed from: rv */
    private void m63979rv() {
        jio jioVar;
        this.f45771fa = null;
        if (m63999x1() == null) {
            return;
        }
        m4c m4cVarM70149up = m63999x1().m70149up();
        m4c m4cVarM64718k4 = m4cVarM70149up.m64714fa() == 4 ? m4cVarM70149up.m64718k4(2) : null;
        if (m4cVarM64718k4 == null) {
            m4cVarM64718k4 = m4cVarM70149up.m64713dy();
        }
        if (m4cVarM70149up.m64737v4() || m4cVarM70149up.m64727lr()) {
            m4cVarM64718k4 = m4cVarM70149up.m64712du().m3194um();
        }
        if (m4cVarM64718k4 != null) {
            if (m4cVarM64718k4.m64745yj()[this.f45777to] == null) {
                return;
            } else {
                jioVar = m4cVarM64718k4.m64745yj()[this.f45777to];
            }
        } else if (m4cVarM70149up.m64745yj() == null || m4cVarM70149up.m64745yj()[this.f45777to] == null) {
            return;
        } else {
            jioVar = m4cVarM70149up.m64745yj()[this.f45777to];
        }
        this.f45771fa = jioVar;
    }

    /* JADX INFO: renamed from: u4 */
    private void m63980u4() {
        if (this.f45779x1.mo50859du() == null || !this.f45779x1.mo50859du().m51263x1().m50931x1(255)) {
            return;
        }
        this.f45770dy = ((C10533m2) C7019kk.m27452k4((Object) this.f45779x1.mo50859du().m51263x1().m50923k4(255), C10533m2.class)).m51255m9();
    }

    /* JADX INFO: renamed from: uz */
    private void m63981uz() {
        this.f45767c5 = this.f45774k4.m70145ne() != null;
        int iM70150uz = m63999x1().m70150uz();
        if (iM70150uz >= 0) {
            C10395d2 c10395d2 = this.f45775kk;
            this.f45775kk = m63999x1().m70149up().m64733u4().get_Item(iM70150uz);
            if (c10395d2 != null && c10395d2.m50590fa()) {
                this.f45780yj.addItem(c10395d2.m50610uz());
            }
        }
    }

    /* JADX INFO: renamed from: wl */
    private void m63982wl() {
        C10395d2 c10395d2 = this.f45775kk;
        if (c10395d2 == null) {
            return;
        }
        if (c10395d2.m50586c5()) {
            this.f45772h4 = this.f45775kk.m50611v4();
        }
        if (this.f45775kk.m50588du()) {
            this.f45777to = this.f45775kk.m50607u4().m51467x1();
        }
        if (this.f45775kk.m50591h4()) {
            for (int i = 0; i < this.f45775kk.m50612wl().length(); i++) {
                boolean z = (C3047dy.m12881to((int) this.f45775kk.m50612wl().charAt(i)) == 2) | this.f45773jd;
                this.f45773jd = z;
                if (z) {
                    break;
                }
            }
        }
        boolean z2 = this.f45767c5 && this.f45774k4.m70145ne().m68203k4() == 0;
        this.f45768ck = z2;
        int i2 = this.f45777to;
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6 || i2 == 7) {
            this.f45768ck = true;
        }
        if (z2) {
            int iM68207kk = m63999x1().m70145ne().m68207kk();
            if (iM68207kk == 7 || iM68207kk == 8 || iM68207kk == 9) {
                this.f45768ck = false;
            }
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m63983x6() {
        C10516kt c10516ktM50425ck;
        C10358am c10358amMo50862jd = this.f45779x1.mo50862jd();
        if (c10358amMo50862jd == null || (c10516ktM50425ck = c10358amMo50862jd.m50425ck()) == null || c10516ktM50425ck.m51142x1() == null) {
            return;
        }
        this.f45769du = c10516ktM50425ck.m51142x1().m50801x1();
    }

    /* JADX INFO: renamed from: c5 */
    public final jio m63984c5() {
        return this.f45771fa;
    }

    /* JADX INFO: renamed from: ck */
    public final List<C10549mu> m63985ck() {
        return this.f45772h4;
    }

    /* JADX INFO: renamed from: du */
    public final C10395d2 m63986du() {
        return this.f45775kk;
    }

    /* JADX INFO: renamed from: dy */
    public final a3u m63987dy() {
        a3u a3uVar = this.f45778up;
        if (a3uVar != null) {
            return a3uVar;
        }
        if (m63999x1() != null) {
            return m63999x1().m70149up().m64712du();
        }
        return null;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m63988fa() {
        return this.f45768ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final C10704x2 m63989h4() {
        return this.f45769du;
    }

    /* JADX INFO: renamed from: jd */
    public final List<AbstractC10571o4> m63990jd() {
        return this.f45780yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63991k4() {
        m63992k4((AutoShape) C7019kk.m27452k4((Object) this.f45774k4.m70148u4(), AutoShape.class));
    }

    /* JADX INFO: renamed from: kk */
    public final C10462h9 m63994kk() {
        return this.f45779x1;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m63995ks() {
        return this.f45773jd;
    }

    /* JADX INFO: renamed from: m9 */
    public final TextFrame m63996m9() {
        TextFrame textFrame;
        if (this.f45776m9 == null) {
            InterfaceC14397rj interfaceC14397rj = (InterfaceC14397rj) m63999x1().m70148u4();
            if (!C7019kk.m27469x1(interfaceC14397rj, AutoShape.class) || (textFrame = (TextFrame) ((AutoShape) interfaceC14397rj).getTextFrame()) == null) {
                textFrame = new TextFrame(interfaceC14397rj);
            }
            this.f45776m9 = textFrame;
        }
        return this.f45776m9;
    }

    /* JADX INFO: renamed from: to */
    public final int m63997to() {
        return this.f45777to;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m63998up() {
        return this.f45770dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final ri7 m63999x1() {
        return this.f45774k4;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m64000yj() {
        return this.f45767c5;
    }

    public klp(ri7 ri7Var) {
        this.f45777to = 4;
        this.f45769du = null;
        this.f45772h4 = null;
        this.f45776m9 = null;
        this.f45770dy = false;
        this.f45767c5 = false;
        this.f45773jd = false;
        this.f45768ck = false;
        this.f45778up = null;
        this.f45780yj = new List<>();
        this.f45774k4 = ri7Var;
        this.f45779x1 = ri7Var.m70140fa();
        m63983x6();
        m63978ne();
        m63977ix();
        m63980u4();
        m63981uz();
        m63982wl();
        m63979rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63992k4(AutoShape autoShape) {
        if (autoShape == null || this.f45776m9 == null) {
            return;
        }
        autoShape.m283k4(m63996m9());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63993k4(Object obj) {
        a3u a3uVar = (a3u) C7019kk.m27452k4(obj, a3u.class);
        if (a3uVar != null) {
            this.f45778up = a3uVar;
        }
    }
}
