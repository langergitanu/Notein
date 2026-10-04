package com.aspose.slides.internal.p430tx;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.internal.p229ki.AbstractC5728qw;
import com.aspose.slides.internal.p229ki.C5676ai;
import com.aspose.slides.internal.p229ki.C5688d4;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13851ai;
import com.aspose.slides.p559ms.System.Xml.C13890ei;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.tx.em */
/* JADX INFO: loaded from: classes4.dex */
public class C11183em extends AbstractC11239zj {

    /* JADX INFO: renamed from: c5 */
    private boolean f38501c5;

    /* JADX INFO: renamed from: du */
    private C13890ei f38502du;

    /* JADX INFO: renamed from: dy */
    private int f38503dy;

    /* JADX INFO: renamed from: m9 */
    private C13890ei f38505m9;

    /* JADX INFO: renamed from: to */
    private int f38506to = -1;

    /* JADX INFO: renamed from: h4 */
    private double f38504h4 = Double.NaN;

    /* JADX INFO: renamed from: m9 */
    private C11183em m53713m9() {
        C11183em c11183em = new C11183em();
        c11183em.f38758x1 = this.f38758x1;
        c11183em.f38505m9 = this.f38505m9;
        ((AbstractC11239zj) c11183em).f38791k4 = ((AbstractC11239zj) this).f38791k4;
        c11183em.f38501c5 = true;
        return c11183em;
    }

    /* JADX INFO: renamed from: rv */
    private void m53714rv(C11212rv c11212rv) {
        c11212rv.m53964to();
        if (!C14044b3.m66437kk(this.f38504h4) || this.f38506to == -1) {
            return;
        }
        C11235y2 c11235y2 = c11212rv.m53926jd().get_Item(m53716k4());
        C5688d4 c5688d4M54212k4 = c11235y2.m54212k4();
        AbstractC5728qw abstractC5728qwM23222x1 = c5688d4M54212k4.m23222x1();
        while (true) {
            C5676ai c5676ai = (C5676ai) C7019kk.m27452k4((Object) abstractC5728qwM23222x1, C5676ai.class);
            if (c5676ai == null) {
                break;
            }
            C11183em c11183emM53713m9 = m53713m9();
            c11212rv.m53926jd().addItem(new C11235y2(new C5688d4(c5676ai.f15686x1, c5688d4M54212k4.m23221kk(), false), c11235y2.f38785k4));
            c11183emM53713m9.f38506to = c11212rv.m53926jd().size() - 1;
            c11183emM53713m9.f38504h4 = c5676ai.f15686x1.mo23317jd();
            c11212rv.m53935k4(c11183emM53713m9);
            abstractC5728qwM23222x1 = c5676ai.f15683k4;
        }
        if (c5688d4M54212k4.m23222x1() != abstractC5728qwM23222x1) {
            c11212rv.m53926jd().set_Item(m53716k4(), new C11235y2(new C5688d4(abstractC5728qwM23222x1, c5688d4M54212k4.m23221kk(), false), c11235y2.f38785k4));
        }
        this.f38504h4 = abstractC5728qwM23222x1.mo23317jd();
    }

    /* JADX INFO: renamed from: du */
    public final int m53715du() {
        return this.f38503dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m53716k4() {
        return this.f38506to;
    }

    /* JADX INFO: renamed from: kk */
    public final double m53718kk() {
        return this.f38504h4;
    }

    /* JADX INFO: renamed from: ks */
    public final void m53719ks(C11212rv c11212rv) {
        C11186g8 c11186g8M53964to = c11212rv.m53964to();
        do {
            int iM53734fa = c11186g8M53964to.m53734fa();
            if (iM53734fa != 1) {
                if (iM53734fa == 4) {
                    return;
                }
                if (iM53734fa == 5) {
                    m54135k4(c11212rv.m53985xw());
                }
            } else {
                if (!C13851ai.m65152k4(c11186g8M53964to.m53741ks(), c11186g8M53964to.m53740kk().f15174xi) || !C13851ai.m65152k4(c11186g8M53964to.m53753yj(), c11186g8M53964to.m53740kk().f15184yo)) {
                    return;
                }
                c11212rv.m53983x6();
                m54134k4(c11212rv.m53947kk(3));
                c11212rv.m53955ne();
            }
        } while (c11186g8M53964to.m53735h4());
    }

    /* JADX INFO: renamed from: to */
    public final C13890ei m53720to() {
        return this.f38505m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13890ei m53721x1() {
        return this.f38502du;
    }

    /* JADX INFO: renamed from: yj */
    public void m53723yj(C11212rv c11212rv) {
        this.f38506to = c11212rv.m53929k4("/", false, true, true);
        this.f38504h4 = 0.5d;
        m54139up(c11212rv);
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53717k4(C11212rv c11212rv) {
        if (this.f38501c5) {
            return;
        }
        super.mo53717k4(c11212rv);
        this.f38501c5 = true;
    }

    @Override // com.aspose.slides.internal.p430tx.AbstractC11200ks
    /* JADX INFO: renamed from: kk */
    public boolean mo53670kk(C11212rv c11212rv) {
        String strM53753yj = c11212rv.m53964to().m53753yj();
        String strM53752x6 = c11212rv.m53964to().m53752x6();
        if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15165w6)) {
            this.f38506to = c11212rv.m53929k4(strM53752x6, false, true, true);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15078bs)) {
            this.f38502du = c11212rv.m53927jd(strM53752x6);
        } else if (C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15127my)) {
            double dM65076k4 = C13850af.m65076k4((Object) strM53752x6);
            this.f38504h4 = dM65076k4;
            if (C14044b3.m66437kk(dM65076k4) && !c11212rv.m53919fa()) {
                throw XsltException.create("'{1}' is an invalid value for the '{0}' attribute.", "priority", strM53752x6);
            }
        } else {
            if (!C13851ai.m65152k4(strM53753yj, c11212rv.m53931k4().f15085ca)) {
                return false;
            }
            this.f38505m9 = (c11212rv.f38652to && C18358t1.g.f56183c.equals(strM53752x6)) ? C11212rv.f38637du : c11212rv.m53927jd(strM53752x6);
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m53722x1(int i) {
        this.f38503dy = i;
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6, com.aspose.slides.internal.p430tx.AbstractC11197k4
    /* JADX INFO: renamed from: k4 */
    public void mo53668k4(C11234xw c11234xw, C11231x1 c11231x1) {
        int iM54107kk = c11231x1.m54107kk();
        if (iM54107kk != 0) {
            if (iM54107kk != 1) {
                C6005k4.m24259k4("Invalid Container action execution state");
                return;
            } else {
                c11231x1.m54091jd();
                return;
            }
        }
        int i = ((AbstractC11239zj) this).f38791k4;
        if (i > 0) {
            c11231x1.m54108kk(i);
        }
        ArrayList arrayList = this.f38758x1;
        if (arrayList == null || arrayList.size() <= 0) {
            c11231x1.m54091jd();
        } else {
            c11234xw.m54184k4(c11231x1);
            c11231x1.m54094k4(1);
        }
    }

    @Override // com.aspose.slides.internal.p430tx.C11232x6
    /* JADX INFO: renamed from: x1 */
    public void mo53671x1(C11212rv c11212rv) {
        m53853to(c11212rv);
        if (this.f38506to == -1) {
            if (this.f38502du == null) {
                throw XsltException.create("The 'Xsl:template' instruction must have the 'match' and/or 'name' attribute present.", new String[0]);
            }
            if (this.f38505m9 != null) {
                throw XsltException.create("An 'Xsl:template' element without a 'match' attribute cannot have a 'mode' attribute.", new String[0]);
            }
        }
        c11212rv.m53979x1(this);
        if (c11212rv.m53924h4()) {
            m53719ks(c11212rv);
            m54128fa(c11212rv);
            c11212rv.m53954m9();
        }
        c11212rv.m53957qq();
        m53714rv(c11212rv);
    }
}
