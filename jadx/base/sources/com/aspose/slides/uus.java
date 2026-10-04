package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p332p7.C7256ak;
import com.aspose.slides.internal.p332p7.C7465d7;
import com.aspose.slides.internal.p332p7.C7757gg;
import com.aspose.slides.internal.p332p7.C8410o8;
import com.aspose.slides.internal.p332p7.C8665rc;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class uus extends wsu implements Comparable<uus> {
    public uus(C8410o8 c8410o8) {
    }

    /* JADX INFO: renamed from: ix */
    private int m71912ix() {
        if (m72924yj() != null) {
            return m72924yj().m72920ks().m68341x1(this);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u4 */
    private C8410o8 m71913u4() {
        return (C8410o8) m72921ne();
    }

    /* JADX INFO: renamed from: x1 */
    private static int m71914x1(uus uusVar) {
        if (yz6.m74172kk(uusVar.m71924kk())) {
            return 5;
        }
        int iM71928up = uusVar.m71928up();
        if (iM71928up == 2) {
            return 1;
        }
        if (iM71928up != 3) {
            return iM71928up != 4 ? 0 : 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m71915c5() {
        return m71913u4().m38053m9();
    }

    /* JADX INFO: renamed from: ck */
    public final double m71916ck() {
        double dM38050jd = m71913u4().m38050jd();
        return (m71924kk() == 23 || m71924kk() == 0) ? dM38050jd : yz6.m74154k4(dM38050jd);
    }

    /* JADX INFO: renamed from: du */
    public final String m71917du() {
        return m71913u4().m38052kk();
    }

    /* JADX INFO: renamed from: dy */
    public final int m71918dy() {
        return m71913u4().m38047du();
    }

    /* JADX INFO: renamed from: fa */
    public final double m71919fa() {
        return m71913u4().m38046ck();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m71920h4() {
        return m71913u4().m38054to();
    }

    /* JADX INFO: renamed from: jd */
    public final int m71921jd() {
        return m71913u4().m38048dy();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compareTo(uus uusVar) {
        int iM71914x1 = m71914x1(this);
        int iM71914x12 = m71914x1(uusVar);
        if (iM71914x1 == iM71914x12) {
            iM71914x1 = m71912ix();
            iM71914x12 = uusVar.m71912ix();
        }
        if (iM71914x1 < iM71914x12) {
            return -1;
        }
        return iM71914x1 == iM71914x12 ? 0 : 1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m71924kk() {
        return m71913u4().m38051k4();
    }

    /* JADX INFO: renamed from: m9 */
    public final int m71926m9() {
        return m71913u4().m38049h4();
    }

    /* JADX INFO: renamed from: to */
    public final int m71927to() {
        return m71913u4().m38055x1();
    }

    @Override // com.aspose.slides.wsu
    public String toString() {
        return C14113y2.m67402k4("type='{0}' for='{1}'{2}{3}{4}{5}{6}{7}{8}{9}", C14042ak.m66410k4(C7256ak.class, m71924kk()), C14042ak.m66410k4(C8665rc.class, m71927to()), !"".equals(m71917du()) ? C14113y2.m67402k4(" forName='{0}'", m71917du()) : "", m71920h4() != 1 ? C14113y2.m67402k4(" ptType='{0}'", C14042ak.m66410k4(C7757gg.class, m71920h4())) : "", m71918dy() != 21 ? C14113y2.m67402k4(" refType='{0}'", C14042ak.m66410k4(C7256ak.class, m71918dy())) : "", m71926m9() != 1 ? C14113y2.m67402k4(" refFor='{0}'", C14042ak.m66410k4(C8665rc.class, m71926m9())) : "", !"".equals(m71915c5()) ? C14113y2.m67402k4(" refForName='{0}'", m71915c5()) : "", m71921jd() != 1 ? C14113y2.m67402k4(" refPtType='{0}'", C14042ak.m66410k4(C7757gg.class, m71921jd())) : "", m71916ck() != 0.0d ? C14113y2.m67402k4(" val='{0}'", Double.valueOf(m71916ck())) : "", m71928up() != 0 ? C14113y2.m67402k4(" op='{0}'", C14042ak.m66410k4(C7465d7.class, m71928up())) : "");
    }

    /* JADX INFO: renamed from: up */
    public final int m71928up() {
        return m71913u4().m38045c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<bay> m71923k4(bay bayVar) {
        return bayVar.m4081k4(m71913u4().m38055x1(), m71913u4().m38052kk(), m71913u4().m38054to());
    }

    /* JADX INFO: renamed from: kk */
    public final List<bay> m71925kk(bay bayVar) {
        return bayVar.m4081k4(m71913u4().m38049h4(), m71913u4().m38053m9(), m71913u4().m38048dy());
    }

    /* JADX INFO: renamed from: x1 */
    public final bay m71929x1(bay bayVar) {
        List<bay> listM71925kk = m71925kk(bayVar);
        if (listM71925kk.size() > 0) {
            return listM71925kk.get_Item(0);
        }
        return null;
    }
}
